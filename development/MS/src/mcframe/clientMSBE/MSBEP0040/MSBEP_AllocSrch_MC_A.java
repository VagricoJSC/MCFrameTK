package mcframe.clientMSBE.MSBEP0040;

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
import mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch01Caller;
import mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch02Caller;

/**
 * 画面"MSBEP_AllocSrch"パネルクラスです。<p>
 *
 * 現状在庫数量、入庫予定数量に対して出庫予定数量を割り当て、引当数量、使用可能数量、不足数量による引当状況を照会をする画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_AllocSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0040";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	public MCTitledBorder Tab1TitledBorder = null;
	// [Tab1]ブロックの項目のField定義
	// [GrSts]ブロック関連のField定義
	public MCPanel GrStsPanel = null;
	public MCTitledBorder GrStsTitledBorder = null;
	// [GrSts]ブロックの項目のField定義
	// [GiSts]ブロック関連のField定義
	public MCPanel GiStsPanel = null;
	public MCTitledBorder GiStsTitledBorder = null;
	// [GiSts]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * ACCRUAL,Inventory accrual base,1;ACCPT,Asset accrual base,2;AVL,Available date base,3;ALLOC,Allocation status,4 ACCRUAL,在庫発生基準,1;ACCPT,資産発生基準,2;AVL,使用可能日基準,3;ALLOC,引当状況,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_ACCRUAL = null;
	public MCRadioButton Cnd_ope_ACCPT = null;
	public MCRadioButton Cnd_ope_AVL = null;
	public MCRadioButton Cnd_ope_ALLOC = null;
	/**
	 * LOC,Location allocation,1;GRS,Gross allocation,2 LOC,場所引当,1;GRS,総量引当,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_tgt_Group = null;
	public MCRadioButton Cnd_tgt_LOC = null;
	public MCRadioButton Cnd_tgt_GRS = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_prcd = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_opn_grp = null;
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_ordsav_grp = null;
	/**
	 * Request 依頼.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_fix_grp = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_schd_grp = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_ord_grp = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_act = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_prcd = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_opn_grp = null;
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_ordsav_grp = null;
	/**
	 * Request 依頼.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_fix_grp = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_schd_grp = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_ord_grp = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_act = null;
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
	public MCLabel Cnd_avl_schd_dt_Label = null;
	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public MCDateField Cnd_avl_schd_dt = null;
	/**
	 * Except expired lot 有効期限切れロット除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_invld_lot_flg = null;
	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_alloc_wait_flg = null;
	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_gi_flg = null;
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
	public MCLabel Cnd_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Cnd_quality_typ_nm = null;
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
	public MCLabel Cnd_pack_unit_cd_Label = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCTextField Cnd_pack_unit_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	// [Rslt]ブロックの項目のField定義
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [HdrQty]ブロック関連のField定義
	public MCPanel HdrQtyPanel = null;
	// [HdrQty]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_stk_base_qty_p_PPanel;
	public MCNumberField HdrQty_stk_qty;	// [HdrQty]の[stk_base_qty_p.qty]を[HdrQty_stk_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_stk_base_qty2_p_PPanel;
	public MCNumberField HdrQty_stk_qty2;	// [HdrQty]の[stk_base_qty2_p.qty]を[HdrQty_stk_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_stk_base_qty3_p_PPanel;
	public MCNumberField HdrQty_stk_qty3;	// [HdrQty]の[stk_base_qty3_p.qty]を[HdrQty_stk_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_stk_base_qty4_p_PPanel;
	public MCNumberField HdrQty_stk_qty4;	// [HdrQty]の[stk_base_qty4_p.qty]を[HdrQty_stk_qty4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gr_base_qty_p_PPanel;
	public MCNumberField HdrQty_gr_qty;	// [HdrQty]の[gr_base_qty_p.qty]を[HdrQty_gr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gr_base_qty2_p_PPanel;
	public MCNumberField HdrQty_gr_qty2;	// [HdrQty]の[gr_base_qty2_p.qty]を[HdrQty_gr_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gr_base_qty3_p_PPanel;
	public MCNumberField HdrQty_gr_qty3;	// [HdrQty]の[gr_base_qty3_p.qty]を[HdrQty_gr_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gr_base_qty4_p_PPanel;
	public MCNumberField HdrQty_gr_qty4;	// [HdrQty]の[gr_base_qty4_p.qty]を[HdrQty_gr_qty4]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField HdrQty_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gi_base_qty_p_PPanel;
	public MCNumberField HdrQty_gi_qty;	// [HdrQty]の[gi_base_qty_p.qty]を[HdrQty_gi_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gi_base_qty2_p_PPanel;
	public MCNumberField HdrQty_gi_qty2;	// [HdrQty]の[gi_base_qty2_p.qty]を[HdrQty_gi_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gi_base_qty3_p_PPanel;
	public MCNumberField HdrQty_gi_qty3;	// [HdrQty]の[gi_base_qty3_p.qty]を[HdrQty_gi_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H HdrQty_gi_base_qty4_p_PPanel;
	public MCNumberField HdrQty_gi_qty4;	// [HdrQty]の[gi_base_qty4_p.qty]を[HdrQty_gi_qty4]としてエイリアス定義。
	public MCLabel HdrQty_base_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField HdrQty_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField HdrQty_base_unit_nm = null;
	// [HdrContFctr]ブロック関連のField定義
	public MCPanel HdrContFctrPanel = null;
	// [HdrContFctr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_stk_cont_qty_p_PPanel;
	public MCNumberField HdrContFctr_stk_qty;	// [HdrContFctr]の[stk_cont_qty_p.cont_qty]を[HdrContFctr_stk_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_stk_cont_qty2_p_PPanel;
	public MCNumberField HdrContFctr_stk_qty2;	// [HdrContFctr]の[stk_cont_qty2_p.cont_qty]を[HdrContFctr_stk_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_stk_cont_qty3_p_PPanel;
	public MCNumberField HdrContFctr_stk_qty3;	// [HdrContFctr]の[stk_cont_qty3_p.cont_qty]を[HdrContFctr_stk_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_stk_cont_qty4_p_PPanel;
	public MCNumberField HdrContFctr_stk_qty4;	// [HdrContFctr]の[stk_cont_qty4_p.cont_qty]を[HdrContFctr_stk_qty4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gr_cont_qty_p_PPanel;
	public MCNumberField HdrContFctr_gr_qty;	// [HdrContFctr]の[gr_cont_qty_p.cont_qty]を[HdrContFctr_gr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gr_cont_qty2_p_PPanel;
	public MCNumberField HdrContFctr_gr_qty2;	// [HdrContFctr]の[gr_cont_qty2_p.cont_qty]を[HdrContFctr_gr_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gr_cont_qty3_p_PPanel;
	public MCNumberField HdrContFctr_gr_qty3;	// [HdrContFctr]の[gr_cont_qty3_p.cont_qty]を[HdrContFctr_gr_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gr_cont_qty4_p_PPanel;
	public MCNumberField HdrContFctr_gr_qty4;	// [HdrContFctr]の[gr_cont_qty4_p.cont_qty]を[HdrContFctr_gr_qty4]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCCheckBox HdrContFctr_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H HdrContFctr_std_cont_fctr_p_PPanel;
	public MCNumberField HdrContFctr_std_cont_fctr;	// [HdrContFctr]の[std_cont_fctr_p.std_cont_fctr]を[HdrContFctr_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H HdrContFctr_act_cont_fctr_p_PPanel;
	public MCNumberField HdrContFctr_act_cont_fctr;	// [HdrContFctr]の[act_cont_fctr_p.act_cont_fctr]を[HdrContFctr_act_cont_fctr]としてエイリアス定義。
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField HdrContFctr_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCTextField HdrContFctr_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gi_cont_qty_p_PPanel;
	public MCNumberField HdrContFctr_gi_qty;	// [HdrContFctr]の[gi_cont_qty_p.cont_qty]を[HdrContFctr_gi_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gi_cont_qty2_p_PPanel;
	public MCNumberField HdrContFctr_gi_qty2;	// [HdrContFctr]の[gi_cont_qty2_p.cont_qty]を[HdrContFctr_gi_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gi_cont_qty3_p_PPanel;
	public MCNumberField HdrContFctr_gi_qty3;	// [HdrContFctr]の[gi_cont_qty3_p.cont_qty]を[HdrContFctr_gi_qty3]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H HdrContFctr_gi_cont_qty4_p_PPanel;
	public MCNumberField HdrContFctr_gi_qty4;	// [HdrContFctr]の[gi_cont_qty4_p.cont_qty]を[HdrContFctr_gi_qty4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H HdrContFctr_cont_fctr_p_PPanel;
	public MCTextField HdrContFctr_cont_fctr_unit_cd;	// [HdrContFctr]の[cont_fctr_p.cont_fctr_unit_cd]を[HdrContFctr_cont_fctr_unit_cd]としてエイリアス定義。
	public MCTextField HdrContFctr_cont_fctr_unit_nm;	// [HdrContFctr]の[cont_fctr_p.cont_fctr_unit_nm]を[HdrContFctr_cont_fctr_unit_nm]としてエイリアス定義。
	// [RsltGr]ブロック関連のField定義
	public MCPanel RsltGrPanel = null;
	public MCTitledBorder RsltGrTitledBorder = null;
	public MCScrollPane RsltGrScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0040.RsltGrR> RsltGrTable = null;
	// [RsltGr]ブロックの項目のField定義
	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_check = null;
	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_schd_stk_typ = null;
	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_schd_stk_typ_nm = null;
	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_dt = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_wg_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D RsltGr_ver_no_p_PPanel;
	public MCColumnConfig columnRsltGr_ver_no;// [RsltGr]の[ver_no_p.ver_no]を[columnRsltGr_ver_no]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sublot_no = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D RsltGr_str_ln_p_PPanel;
	public MCColumnConfig columnRsltGr_str_ln_cd;// [RsltGr]の[str_ln_p.str_ln_cd]を[columnRsltGr_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_str_ln_nm;// [RsltGr]の[str_ln_p.str_ln_nm]を[columnRsltGr_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_str_ln_cd_none_flg;// [RsltGr]の[str_ln_p.str_ln_cd_none_flg]を[columnRsltGr_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_site_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lg_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_grp_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_grp_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_gd_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_insp_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D RsltGr_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRsltGr_sno1;// [RsltGr]の[sno_wrk_no_p.sno1]を[columnRsltGr_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno2;// [RsltGr]の[sno_wrk_no_p.sno2]を[columnRsltGr_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno3;// [RsltGr]の[sno_wrk_no_p.sno3]を[columnRsltGr_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno4;// [RsltGr]の[sno_wrk_no_p.sno4]を[columnRsltGr_sno4]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_wrk_no;// [RsltGr]の[sno_wrk_no_p.wrk_no]を[columnRsltGr_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_wrk_nm;// [RsltGr]の[sno_wrk_no_p.wrk_nm]を[columnRsltGr_wrk_nm]としてエイリアス定義。
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_in_xfr_typ = null;
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_in_xfr_typ_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_asst_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_bp_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_arrv_bp_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_pack_unit_qty;// [RsltGr]の[pack_unit_qty_p.qty]を[columnRsltGr_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_base_unit_qty;// [RsltGr]の[base_unit_qty_p.qty]を[columnRsltGr_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_qty;// [RsltGr]の[qty_p.qty]を[columnRsltGr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lot_alloc_qty;// [RsltGr]の[lot_alloc_qty_p.qty]を[columnRsltGr_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lot_wait_qty;// [RsltGr]の[lot_wait_qty_p.qty]を[columnRsltGr_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lot_alloc_avl_qty;// [RsltGr]の[lot_alloc_avl_qty_p.qty]を[columnRsltGr_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_not_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_not_lot_alloc_qty;// [RsltGr]の[not_lot_alloc_qty_p.qty]を[columnRsltGr_not_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_not_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_not_lot_wait_qty;// [RsltGr]の[not_lot_wait_qty_p.qty]を[columnRsltGr_not_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_not_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_not_lot_alloc_avl_qty;// [RsltGr]の[not_lot_alloc_avl_qty_p.qty]を[columnRsltGr_not_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_lot_alloc_qty;// [RsltGr]の[lg_lot_alloc_qty_p.qty]を[columnRsltGr_lg_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_lot_wait_qty;// [RsltGr]の[lg_lot_wait_qty_p.qty]を[columnRsltGr_lg_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_lot_alloc_avl_qty;// [RsltGr]の[lg_lot_alloc_avl_qty_p.qty]を[columnRsltGr_lg_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_not_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_not_lot_alloc_qty;// [RsltGr]の[lg_not_lot_alloc_qty_p.qty]を[columnRsltGr_lg_not_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_not_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_not_lot_wait_qty;// [RsltGr]の[lg_not_lot_wait_qty_p.qty]を[columnRsltGr_lg_not_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_lg_not_lot_alloc_avl_qty;// [RsltGr]の[lg_not_lot_alloc_avl_qty_p.qty]を[columnRsltGr_lg_not_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_grs_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_grs_alloc_qty;// [RsltGr]の[grs_alloc_qty_p.qty]を[columnRsltGr_grs_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_grs_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_grs_wait_qty;// [RsltGr]の[grs_wait_qty_p.qty]を[columnRsltGr_grs_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_alloc_qty;// [RsltGr]の[alloc_qty_p.qty]を[columnRsltGr_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_wait_qty;// [RsltGr]の[wait_qty_p.qty]を[columnRsltGr_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_grs_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_grs_alloc_avl_qty;// [RsltGr]の[grs_alloc_avl_qty_p.qty]を[columnRsltGr_grs_alloc_avl_qty]としてエイリアス定義。
	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_unit_cd = null;
	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_unit_nm = null;
	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_unit_dec_place = null;
	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_overdue_alloc_flg = null;
	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_another_loc_alloc_flg = null;
	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_abnormal_alloc_flg = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D RsltGr_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRsltGr_act_cont_fctr;// [RsltGr]の[act_cont_fctr_p.act_cont_fctr]を[columnRsltGr_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_act_cont_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_act_cont_qty;// [RsltGr]の[act_cont_qty_p.cont_qty]を[columnRsltGr_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_act_cont_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_act_cont_alloc_qty;// [RsltGr]の[act_cont_alloc_qty_p.cont_qty]を[columnRsltGr_act_cont_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_act_cont_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_act_cont_wait_qty;// [RsltGr]の[act_cont_wait_qty_p.cont_qty]を[columnRsltGr_act_cont_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_act_cont_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_act_cont_alloc_avl_qty;// [RsltGr]の[act_cont_alloc_avl_qty_p.cont_qty]を[columnRsltGr_act_cont_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D RsltGr_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRsltGr_std_cont_fctr;// [RsltGr]の[std_cont_fctr_p.std_cont_fctr]を[columnRsltGr_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_std_cont_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_std_cont_qty;// [RsltGr]の[std_cont_qty_p.cont_qty]を[columnRsltGr_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_std_cont_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_std_cont_alloc_qty;// [RsltGr]の[std_cont_alloc_qty_p.cont_qty]を[columnRsltGr_std_cont_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_std_cont_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_std_cont_wait_qty;// [RsltGr]の[std_cont_wait_qty_p.cont_qty]を[columnRsltGr_std_cont_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGr_std_cont_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_std_cont_alloc_avl_qty;// [RsltGr]の[std_cont_alloc_avl_qty_p.cont_qty]を[columnRsltGr_std_cont_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D RsltGr_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRsltGr_cont_fctr_unit_cd;// [RsltGr]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRsltGr_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_cont_fctr_unit_nm;// [RsltGr]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRsltGr_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_cont_fctr_dec_place = null;
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lot_seq = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_first_gr_dt = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lmt_dt = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_plnt_aprv_sts_typ_nm = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_mrkt_judg_sts_typ_nm = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_vld_dt_to = null;
	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stop_dt = null;
	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_rel_dt = null;
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_alloc_margin_days = null;
	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_sppl_cd = null;
	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_loc_sppl_nm = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_no = null;
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_seq = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_ptn_typ_nm = null;
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trn_typ = null;
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_act_typ_nm = null;
	// [RsltGi]ブロック関連のField定義
	public MCPanel RsltGiPanel = null;
	public MCTitledBorder RsltGiTitledBorder = null;
	public MCScrollPane RsltGiScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0040.RsltGrR> RsltGiTable = null;
	// [RsltGi]ブロックの項目のField定義
	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_check = null;
	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_schd_stk_typ = null;
	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_schd_stk_typ_nm = null;
	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_dt = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_wg_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D RsltGi_ver_no_p_PPanel;
	public MCColumnConfig columnRsltGi_ver_no;// [RsltGi]の[ver_no_p.ver_no]を[columnRsltGi_ver_no]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_sublot_no = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D RsltGi_str_ln_p_PPanel;
	public MCColumnConfig columnRsltGi_str_ln_cd;// [RsltGi]の[str_ln_p.str_ln_cd]を[columnRsltGi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_str_ln_nm;// [RsltGi]の[str_ln_p.str_ln_nm]を[columnRsltGi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_str_ln_cd_none_flg;// [RsltGi]の[str_ln_p.str_ln_cd_none_flg]を[columnRsltGi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_site_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lg_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_grp_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_grp_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_gd_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_insp_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D RsltGi_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRsltGi_sno1;// [RsltGi]の[sno_wrk_no_p.sno1]を[columnRsltGi_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno2;// [RsltGi]の[sno_wrk_no_p.sno2]を[columnRsltGi_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno3;// [RsltGi]の[sno_wrk_no_p.sno3]を[columnRsltGi_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno4;// [RsltGi]の[sno_wrk_no_p.sno4]を[columnRsltGi_sno4]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_wrk_no;// [RsltGi]の[sno_wrk_no_p.wrk_no]を[columnRsltGi_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_wrk_nm;// [RsltGi]の[sno_wrk_no_p.wrk_nm]を[columnRsltGi_wrk_nm]としてエイリアス定義。
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_in_xfr_typ = null;
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_in_xfr_typ_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_asst_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_bp_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_arrv_bp_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_pack_unit_qty;// [RsltGi]の[pack_unit_qty_p.qty]を[columnRsltGi_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_base_unit_qty;// [RsltGi]の[base_unit_qty_p.qty]を[columnRsltGi_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_qty;// [RsltGi]の[qty_p.qty]を[columnRsltGi_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lot_alloc_qty;// [RsltGi]の[lot_alloc_qty_p.qty]を[columnRsltGi_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lot_wait_qty;// [RsltGi]の[lot_wait_qty_p.qty]を[columnRsltGi_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lot_alloc_avl_qty;// [RsltGi]の[lot_alloc_avl_qty_p.qty]を[columnRsltGi_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_not_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_not_lot_alloc_qty;// [RsltGi]の[not_lot_alloc_qty_p.qty]を[columnRsltGi_not_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_not_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_not_lot_wait_qty;// [RsltGi]の[not_lot_wait_qty_p.qty]を[columnRsltGi_not_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_not_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_not_lot_alloc_avl_qty;// [RsltGi]の[not_lot_alloc_avl_qty_p.qty]を[columnRsltGi_not_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_lot_alloc_qty;// [RsltGi]の[lg_lot_alloc_qty_p.qty]を[columnRsltGi_lg_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_lot_wait_qty;// [RsltGi]の[lg_lot_wait_qty_p.qty]を[columnRsltGi_lg_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_lot_alloc_avl_qty;// [RsltGi]の[lg_lot_alloc_avl_qty_p.qty]を[columnRsltGi_lg_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_not_lot_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_not_lot_alloc_qty;// [RsltGi]の[lg_not_lot_alloc_qty_p.qty]を[columnRsltGi_lg_not_lot_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_not_lot_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_not_lot_wait_qty;// [RsltGi]の[lg_not_lot_wait_qty_p.qty]を[columnRsltGi_lg_not_lot_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_lg_not_lot_alloc_avl_qty;// [RsltGi]の[lg_not_lot_alloc_avl_qty_p.qty]を[columnRsltGi_lg_not_lot_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_grs_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_grs_alloc_qty;// [RsltGi]の[grs_alloc_qty_p.qty]を[columnRsltGi_grs_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_grs_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_grs_wait_qty;// [RsltGi]の[grs_wait_qty_p.qty]を[columnRsltGi_grs_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_alloc_qty;// [RsltGi]の[alloc_qty_p.qty]を[columnRsltGi_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_wait_qty;// [RsltGi]の[wait_qty_p.qty]を[columnRsltGi_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_grs_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_grs_alloc_avl_qty;// [RsltGi]の[grs_alloc_avl_qty_p.qty]を[columnRsltGi_grs_alloc_avl_qty]としてエイリアス定義。
	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_unit_cd = null;
	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_unit_nm = null;
	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_unit_dec_place = null;
	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_overdue_alloc_flg = null;
	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_another_loc_alloc_flg = null;
	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_abnormal_alloc_flg = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D RsltGi_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRsltGi_act_cont_fctr;// [RsltGi]の[act_cont_fctr_p.act_cont_fctr]を[columnRsltGi_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_act_cont_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_act_cont_qty;// [RsltGi]の[act_cont_qty_p.cont_qty]を[columnRsltGi_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_act_cont_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_act_cont_alloc_qty;// [RsltGi]の[act_cont_alloc_qty_p.cont_qty]を[columnRsltGi_act_cont_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_act_cont_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_act_cont_wait_qty;// [RsltGi]の[act_cont_wait_qty_p.cont_qty]を[columnRsltGi_act_cont_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_act_cont_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_act_cont_alloc_avl_qty;// [RsltGi]の[act_cont_alloc_avl_qty_p.cont_qty]を[columnRsltGi_act_cont_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D RsltGi_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRsltGi_std_cont_fctr;// [RsltGi]の[std_cont_fctr_p.std_cont_fctr]を[columnRsltGi_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_std_cont_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_std_cont_qty;// [RsltGi]の[std_cont_qty_p.cont_qty]を[columnRsltGi_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_std_cont_alloc_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_std_cont_alloc_qty;// [RsltGi]の[std_cont_alloc_qty_p.cont_qty]を[columnRsltGi_std_cont_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_std_cont_wait_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_std_cont_wait_qty;// [RsltGi]の[std_cont_wait_qty_p.cont_qty]を[columnRsltGi_std_cont_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D RsltGi_std_cont_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_std_cont_alloc_avl_qty;// [RsltGi]の[std_cont_alloc_avl_qty_p.cont_qty]を[columnRsltGi_std_cont_alloc_avl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D RsltGi_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRsltGi_cont_fctr_unit_cd;// [RsltGi]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRsltGi_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_cont_fctr_unit_nm;// [RsltGi]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRsltGi_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_cont_fctr_dec_place = null;
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lot_seq = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_first_gr_dt = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lmt_dt = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_plnt_aprv_sts_typ_nm = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_mrkt_judg_sts_typ_nm = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_vld_dt_to = null;
	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stop_dt = null;
	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_rel_dt = null;
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_alloc_margin_days = null;
	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_sppl_cd = null;
	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_sppl_nm = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_no = null;
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_seq = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_ptn_typ_nm = null;
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trn_typ = null;
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_act_typ_nm = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * GR/GI schedule 受払予定一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0090_GR = null;
	/**
	 * GR/GI schedule 受払予定一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0090_GI = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0080_GR = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0080_GI = null;
	public mcframe.clientFSBA.FSBAP0020.FSBAP0020 Btn_sync_p_PPanel;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [ACCRUAL]モードを表す定数 */
	public static final String ACCRUAL = "ACCRUAL";
	/** [ACCPT]モードを表す定数 */
	public static final String ACCPT = "ACCPT";
	/** [AVL]モードを表す定数 */
	public static final String AVL = "AVL";
	/** [LOC_ALLOC]モードを表す定数 */
	public static final String LOC_ALLOC = "LOC_ALLOC";
	/** [GRS_ALLOC]モードを表す定数 */
	public static final String GRS_ALLOC = "GRS_ALLOC";
	/** [DTL]モードを表す定数 */
	public static final String DTL = "DTL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ACCRUAL, ACCPT, AVL, LOC_ALLOC, GRS_ALLOC, DTL};
	
	/** [MS_MSBEL0040_Srch01]のCallerの作成 */
	protected MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch01Caller createMS_MSBEL0040_Srch01() {
		MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch01Caller<MSBEP_AllocSrch, MS_MSBEL0040_Srch01Bridge>
		caller = ((MSBEP_AllocSrch_MC)this).new MS_MSBEL0040_Srch01Caller<MSBEP_AllocSrch, MS_MSBEL0040_Srch01Bridge>(
					(MSBEP_AllocSrch)this, new MS_MSBEL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0040_Srch01]の呼び出し */
	protected void callMS_MSBEL0040_Srch01() {
		MCCaller caller = createMS_MSBEL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL0040_Srch02]のCallerの作成 */
	protected MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch02Caller createMS_MSBEL0040_Srch02() {
		MSBEP_AllocSrch_MC.MS_MSBEL0040_Srch02Caller<MSBEP_AllocSrch, MS_MSBEL0040_Srch02Bridge>
		caller = ((MSBEP_AllocSrch_MC)this).new MS_MSBEL0040_Srch02Caller<MSBEP_AllocSrch, MS_MSBEL0040_Srch02Bridge>(
					(MSBEP_AllocSrch)this, new MS_MSBEL0040_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL0040_Srch02]の呼び出し */
	protected void callMS_MSBEL0040_Srch02() {
		MCCaller caller = createMS_MSBEL0040_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0040.CndR aCndR;
	/** [HdrQty]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0040.HdrQtyR aHdrQtyR;
	/** [HdrContFctr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0040.HdrContFctrR aHdrContFctrR;
	/** [RsltGr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> aRsltGrL;
	/** [RsltGi]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> aRsltGiL;
	/** [Lno]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0040.LnoR> aLnoL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0040.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrQtyRを設定します。
	 *
	 * aHdrQtyRのインスタンスは変更されません。
	 *
	 * @param row HdrQtyR
	 */
	public void setHdrQtyR(mcframe.clientMSBE.MSBEP0040.HdrQtyR row) {
		if (row != null) {
			MCRow.copyall(getHdrQtyR(), row);
		}
	}

	/**
	 * [HdrQty]ブロックのコンテナaHdrQtyRを返します。
	 *
	 * @return HdrQtyR
	 */
	public mcframe.clientMSBE.MSBEP0040.HdrQtyR getHdrQtyR() {
		return aHdrQtyR;
	}

	/**
	 * aHdrQtyRを作成します。
	 *
	 * @return HdrQtyR
	 */
	public mcframe.clientMSBE.MSBEP0040.HdrQtyR createHdrQtyR() {
		return mcframe.clientMSBE.MSBEP0040.HdrQtyR.create();
	}

	/**
	 * 項目コピーによってaHdrContFctrRを設定します。
	 *
	 * aHdrContFctrRのインスタンスは変更されません。
	 *
	 * @param row HdrContFctrR
	 */
	public void setHdrContFctrR(mcframe.clientMSBE.MSBEP0040.HdrContFctrR row) {
		if (row != null) {
			MCRow.copyall(getHdrContFctrR(), row);
		}
	}

	/**
	 * [HdrContFctr]ブロックのコンテナaHdrContFctrRを返します。
	 *
	 * @return HdrContFctrR
	 */
	public mcframe.clientMSBE.MSBEP0040.HdrContFctrR getHdrContFctrR() {
		return aHdrContFctrR;
	}

	/**
	 * aHdrContFctrRを作成します。
	 *
	 * @return HdrContFctrR
	 */
	public mcframe.clientMSBE.MSBEP0040.HdrContFctrR createHdrContFctrR() {
		return mcframe.clientMSBE.MSBEP0040.HdrContFctrR.create();
	}

	/**
	 * コピーによってaRsltGrLを設定します。
	 *
	 * aRsltGrLのインスタンスは変更されません。
	 *
	 * @param dataset RsltGrL
	 */
	public void setRsltGrL(MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> aList) {
		if (getRsltGrL() != aList) {
			getRsltGrL().setAll(aList);
		}
	}

	/**
	 * [RsltGr]ブロックのコンテナaRsltGrLを返します。
	 *
	 * @return RsltGrL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> getRsltGrL() {
		return aRsltGrL;
	}

	/**
	 * aRsltGrRを作成します。
	 *
	 * @return RsltGrR
	 */
	public mcframe.clientMSBE.MSBEP0040.RsltGrR createRsltGrR() {
		return mcframe.clientMSBE.MSBEP0040.RsltGrR.create();
	}

	/**
	 * aRsltGrLを作成します。
	 *
	 * @return RsltGrL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> createRsltGrL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class);
	}

	/**
	 * RsltGrTableを初期化します。
	 */
	protected void createRsltGrTable(){
		if(RsltGrTable == null){
			RsltGrTable = beansFactory.createTable2("RsltGr.table");
		}
	}

	/**
	 * コピーによってaRsltGiLを設定します。
	 *
	 * aRsltGiLのインスタンスは変更されません。
	 *
	 * @param dataset RsltGiL
	 */
	public void setRsltGiL(MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> aList) {
		if (getRsltGiL() != aList) {
			getRsltGiL().setAll(aList);
		}
	}

	/**
	 * [RsltGi]ブロックのコンテナaRsltGiLを返します。
	 *
	 * @return RsltGiL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> getRsltGiL() {
		return aRsltGiL;
	}

	/**
	 * aRsltGiRを作成します。
	 *
	 * @return RsltGiR
	 */
	public mcframe.clientMSBE.MSBEP0040.RsltGrR createRsltGiR() {
		return mcframe.clientMSBE.MSBEP0040.RsltGrR.create();
	}

	/**
	 * aRsltGiLを作成します。
	 *
	 * @return RsltGiL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> createRsltGiL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class);
	}

	/**
	 * RsltGiTableを初期化します。
	 */
	protected void createRsltGiTable(){
		if(RsltGiTable == null){
			RsltGiTable = beansFactory.createTable2("RsltGi.table");
		}
	}

	/**
	 * コピーによってaLnoLを設定します。
	 *
	 * aLnoLのインスタンスは変更されません。
	 *
	 * @param dataset LnoL
	 */
	public void setLnoL(MCList<mcframe.clientMSBE.MSBEP0040.LnoR> aList) {
		if (getLnoL() != aList) {
			getLnoL().setAll(aList);
		}
	}

	/**
	 * [Lno]ブロックのコンテナaLnoLを返します。
	 *
	 * @return LnoL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.LnoR> getLnoL() {
		return aLnoL;
	}

	/**
	 * aLnoRを作成します。
	 *
	 * @return LnoR
	 */
	public mcframe.clientMSBE.MSBEP0040.LnoR createLnoR() {
		return mcframe.clientMSBE.MSBEP0040.LnoR.create();
	}

	/**
	 * aLnoLを作成します。
	 *
	 * @return LnoL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0040.LnoR> createLnoL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0040.LnoR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrQtyR())) ret.add(getHdrQtyR());
		if(!MCCollectionUtil.contains(ret, getHdrContFctrR())) ret.add(getHdrContFctrR());
		if(!MCCollectionUtil.contains(ret, getRsltGrL())) ret.add(getRsltGrL());
		if(!MCCollectionUtil.contains(ret, getRsltGiL())) ret.add(getRsltGiL());
		if(!MCCollectionUtil.contains(ret, getLnoL())) ret.add(getLnoL());
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
		if(aCnt == getHdrQtyR()) return "HdrQty";
		if(aCnt == getHdrContFctrR()) return "HdrContFctr";
		if(aCnt == getRsltGrL()) return "RsltGr";
		if(aCnt == getRsltGiL()) return "RsltGi";
		if(aCnt == getLnoL()) return "Lno";
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
		if(bId.equals("HdrQty")) return getHdrQtyR();
		if(bId.equals("HdrContFctr")) return getHdrContFctrR();
		if(bId.equals("RsltGr")) return getRsltGrL();
		if(bId.equals("RsltGi")) return getRsltGiL();
		if(bId.equals("Lno")) return getLnoL();
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
		ret.add(GrStsPanel);
		ret.add(GiStsPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrQtyPanel);
		ret.add(HdrContFctrPanel);
		ret.add(RsltGrPanel);
		ret.add(RsltGiPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocSrch_MC_A() {
		aCndR = createCndR();
		aHdrQtyR = createHdrQtyR();
		aHdrContFctrR = createHdrContFctrR();
		aRsltGrL = createRsltGrL();
		aRsltGiL = createRsltGiL();
		aLnoL = createLnoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_AllocSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrQtyR = createHdrQtyR();
		aHdrContFctrR = createHdrContFctrR();
		aRsltGrL = createRsltGrL();
		createRsltGrTable();
		RsltGrTable.setRowName(name);
		aRsltGiL = createRsltGiL();
		createRsltGiTable();
		RsltGiTable.setRowName(name);
		aLnoL = createLnoL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_AllocSrch_MC.jbCreateScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateOpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateTop((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateFold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateTab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateGrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateGiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateCnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateCtrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateRslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateHdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateHdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateHdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateRsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateRsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateBtn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbCreateEastBtn((MSBEP_AllocSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_AllocSrch p) {
	}

	/**
	 * [OpeTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOpeTyp(MSBEP_AllocSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_AllocSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_AllocSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_AllocSrch p) {
	}

	/**
	 * [GrSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGrSts(MSBEP_AllocSrch p) {
	}

	/**
	 * [GiSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGiSts(MSBEP_AllocSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_AllocSrch p) {
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_AllocSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_AllocSrch p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_AllocSrch p) {
	}

	/**
	 * [HdrQty]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrQty(MSBEP_AllocSrch p) {
		p.HdrQty_stk_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().stk_base_qty_p());
		p.HdrQty_stk_base_qty_p_PPanel.setName("HdrQty.stk_base_qty_p");
		p.HdrQty_stk_qty = p.HdrQty_stk_base_qty_p_PPanel.Qty_qty;
		p.HdrQty_stk_qty.addAliasName("HdrQty.stk_qty", p);
		p.HdrQty_stk_base_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().stk_base_qty2_p());
		p.HdrQty_stk_base_qty2_p_PPanel.setName("HdrQty.stk_base_qty2_p");
		p.HdrQty_stk_qty2 = p.HdrQty_stk_base_qty2_p_PPanel.Qty_qty;
		p.HdrQty_stk_qty2.addAliasName("HdrQty.stk_qty2", p);
		p.HdrQty_stk_base_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().stk_base_qty3_p());
		p.HdrQty_stk_base_qty3_p_PPanel.setName("HdrQty.stk_base_qty3_p");
		p.HdrQty_stk_qty3 = p.HdrQty_stk_base_qty3_p_PPanel.Qty_qty;
		p.HdrQty_stk_qty3.addAliasName("HdrQty.stk_qty3", p);
		p.HdrQty_stk_base_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().stk_base_qty4_p());
		p.HdrQty_stk_base_qty4_p_PPanel.setName("HdrQty.stk_base_qty4_p");
		p.HdrQty_stk_qty4 = p.HdrQty_stk_base_qty4_p_PPanel.Qty_qty;
		p.HdrQty_stk_qty4.addAliasName("HdrQty.stk_qty4", p);
		p.HdrQty_gr_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gr_base_qty_p());
		p.HdrQty_gr_base_qty_p_PPanel.setName("HdrQty.gr_base_qty_p");
		p.HdrQty_gr_qty = p.HdrQty_gr_base_qty_p_PPanel.Qty_qty;
		p.HdrQty_gr_qty.addAliasName("HdrQty.gr_qty", p);
		p.HdrQty_gr_base_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gr_base_qty2_p());
		p.HdrQty_gr_base_qty2_p_PPanel.setName("HdrQty.gr_base_qty2_p");
		p.HdrQty_gr_qty2 = p.HdrQty_gr_base_qty2_p_PPanel.Qty_qty;
		p.HdrQty_gr_qty2.addAliasName("HdrQty.gr_qty2", p);
		p.HdrQty_gr_base_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gr_base_qty3_p());
		p.HdrQty_gr_base_qty3_p_PPanel.setName("HdrQty.gr_base_qty3_p");
		p.HdrQty_gr_qty3 = p.HdrQty_gr_base_qty3_p_PPanel.Qty_qty;
		p.HdrQty_gr_qty3.addAliasName("HdrQty.gr_qty3", p);
		p.HdrQty_gr_base_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gr_base_qty4_p());
		p.HdrQty_gr_base_qty4_p_PPanel.setName("HdrQty.gr_base_qty4_p");
		p.HdrQty_gr_qty4 = p.HdrQty_gr_base_qty4_p_PPanel.Qty_qty;
		p.HdrQty_gr_qty4.addAliasName("HdrQty.gr_qty4", p);
		p.HdrQty_gi_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gi_base_qty_p());
		p.HdrQty_gi_base_qty_p_PPanel.setName("HdrQty.gi_base_qty_p");
		p.HdrQty_gi_qty = p.HdrQty_gi_base_qty_p_PPanel.Qty_qty;
		p.HdrQty_gi_qty.addAliasName("HdrQty.gi_qty", p);
		p.HdrQty_gi_base_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gi_base_qty2_p());
		p.HdrQty_gi_base_qty2_p_PPanel.setName("HdrQty.gi_base_qty2_p");
		p.HdrQty_gi_qty2 = p.HdrQty_gi_base_qty2_p_PPanel.Qty_qty;
		p.HdrQty_gi_qty2.addAliasName("HdrQty.gi_qty2", p);
		p.HdrQty_gi_base_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gi_base_qty3_p());
		p.HdrQty_gi_base_qty3_p_PPanel.setName("HdrQty.gi_base_qty3_p");
		p.HdrQty_gi_qty3 = p.HdrQty_gi_base_qty3_p_PPanel.Qty_qty;
		p.HdrQty_gi_qty3.addAliasName("HdrQty.gi_qty3", p);
		p.HdrQty_gi_base_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrQtyR().gi_base_qty4_p());
		p.HdrQty_gi_base_qty4_p_PPanel.setName("HdrQty.gi_base_qty4_p");
		p.HdrQty_gi_qty4 = p.HdrQty_gi_base_qty4_p_PPanel.Qty_qty;
		p.HdrQty_gi_qty4.addAliasName("HdrQty.gi_qty4", p);
	}

	/**
	 * [HdrContFctr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrContFctr(MSBEP_AllocSrch p) {
		p.HdrContFctr_stk_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().stk_cont_qty_p());
		p.HdrContFctr_stk_cont_qty_p_PPanel.setName("HdrContFctr.stk_cont_qty_p");
		p.HdrContFctr_stk_qty = p.HdrContFctr_stk_cont_qty_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_stk_qty.addAliasName("HdrContFctr.stk_qty", p);
		p.HdrContFctr_stk_cont_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().stk_cont_qty2_p());
		p.HdrContFctr_stk_cont_qty2_p_PPanel.setName("HdrContFctr.stk_cont_qty2_p");
		p.HdrContFctr_stk_qty2 = p.HdrContFctr_stk_cont_qty2_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_stk_qty2.addAliasName("HdrContFctr.stk_qty2", p);
		p.HdrContFctr_stk_cont_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().stk_cont_qty3_p());
		p.HdrContFctr_stk_cont_qty3_p_PPanel.setName("HdrContFctr.stk_cont_qty3_p");
		p.HdrContFctr_stk_qty3 = p.HdrContFctr_stk_cont_qty3_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_stk_qty3.addAliasName("HdrContFctr.stk_qty3", p);
		p.HdrContFctr_stk_cont_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().stk_cont_qty4_p());
		p.HdrContFctr_stk_cont_qty4_p_PPanel.setName("HdrContFctr.stk_cont_qty4_p");
		p.HdrContFctr_stk_qty4 = p.HdrContFctr_stk_cont_qty4_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_stk_qty4.addAliasName("HdrContFctr.stk_qty4", p);
		p.HdrContFctr_gr_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gr_cont_qty_p());
		p.HdrContFctr_gr_cont_qty_p_PPanel.setName("HdrContFctr.gr_cont_qty_p");
		p.HdrContFctr_gr_qty = p.HdrContFctr_gr_cont_qty_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gr_qty.addAliasName("HdrContFctr.gr_qty", p);
		p.HdrContFctr_gr_cont_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gr_cont_qty2_p());
		p.HdrContFctr_gr_cont_qty2_p_PPanel.setName("HdrContFctr.gr_cont_qty2_p");
		p.HdrContFctr_gr_qty2 = p.HdrContFctr_gr_cont_qty2_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gr_qty2.addAliasName("HdrContFctr.gr_qty2", p);
		p.HdrContFctr_gr_cont_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gr_cont_qty3_p());
		p.HdrContFctr_gr_cont_qty3_p_PPanel.setName("HdrContFctr.gr_cont_qty3_p");
		p.HdrContFctr_gr_qty3 = p.HdrContFctr_gr_cont_qty3_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gr_qty3.addAliasName("HdrContFctr.gr_qty3", p);
		p.HdrContFctr_gr_cont_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gr_cont_qty4_p());
		p.HdrContFctr_gr_cont_qty4_p_PPanel.setName("HdrContFctr.gr_cont_qty4_p");
		p.HdrContFctr_gr_qty4 = p.HdrContFctr_gr_cont_qty4_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gr_qty4.addAliasName("HdrContFctr.gr_qty4", p);
		p.HdrContFctr_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.create(p.getHdrContFctrR().std_cont_fctr_p());
		p.HdrContFctr_std_cont_fctr_p_PPanel.setName("HdrContFctr.std_cont_fctr_p");
		p.HdrContFctr_std_cont_fctr = p.HdrContFctr_std_cont_fctr_p_PPanel.StdContFctr_std_cont_fctr;
		p.HdrContFctr_std_cont_fctr.addAliasName("HdrContFctr.std_cont_fctr", p);
		p.HdrContFctr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.create(p.getHdrContFctrR().act_cont_fctr_p());
		p.HdrContFctr_act_cont_fctr_p_PPanel.setName("HdrContFctr.act_cont_fctr_p");
		p.HdrContFctr_act_cont_fctr = p.HdrContFctr_act_cont_fctr_p_PPanel.ActContFctr_act_cont_fctr;
		p.HdrContFctr_act_cont_fctr.addAliasName("HdrContFctr.act_cont_fctr", p);
		p.HdrContFctr_gi_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gi_cont_qty_p());
		p.HdrContFctr_gi_cont_qty_p_PPanel.setName("HdrContFctr.gi_cont_qty_p");
		p.HdrContFctr_gi_qty = p.HdrContFctr_gi_cont_qty_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gi_qty.addAliasName("HdrContFctr.gi_qty", p);
		p.HdrContFctr_gi_cont_qty2_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gi_cont_qty2_p());
		p.HdrContFctr_gi_cont_qty2_p_PPanel.setName("HdrContFctr.gi_cont_qty2_p");
		p.HdrContFctr_gi_qty2 = p.HdrContFctr_gi_cont_qty2_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gi_qty2.addAliasName("HdrContFctr.gi_qty2", p);
		p.HdrContFctr_gi_cont_qty3_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gi_cont_qty3_p());
		p.HdrContFctr_gi_cont_qty3_p_PPanel.setName("HdrContFctr.gi_cont_qty3_p");
		p.HdrContFctr_gi_qty3 = p.HdrContFctr_gi_cont_qty3_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gi_qty3.addAliasName("HdrContFctr.gi_qty3", p);
		p.HdrContFctr_gi_cont_qty4_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrContFctrR().gi_cont_qty4_p());
		p.HdrContFctr_gi_cont_qty4_p_PPanel.setName("HdrContFctr.gi_cont_qty4_p");
		p.HdrContFctr_gi_qty4 = p.HdrContFctr_gi_cont_qty4_p_PPanel.ContQty_cont_qty;
		p.HdrContFctr_gi_qty4.addAliasName("HdrContFctr.gi_qty4", p);
		p.HdrContFctr_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.create(p.getHdrContFctrR().cont_fctr_p());
		p.HdrContFctr_cont_fctr_p_PPanel.setName("HdrContFctr.cont_fctr_p");
		p.HdrContFctr_cont_fctr_unit_cd = p.HdrContFctr_cont_fctr_p_PPanel.ContFctrUnit_cont_fctr_unit_cd;
		p.HdrContFctr_cont_fctr_unit_cd.addAliasName("HdrContFctr.cont_fctr_unit_cd", p);
		p.HdrContFctr_cont_fctr_unit_nm = p.HdrContFctr_cont_fctr_p_PPanel.ContFctrUnit_cont_fctr_unit_nm;
		p.HdrContFctr_cont_fctr_unit_nm.addAliasName("HdrContFctr.cont_fctr_unit_nm", p);
	}

	/**
	 * [RsltGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltGr(MSBEP_AllocSrch p) {
		p.RsltGr_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$ver_no_p);
		p.RsltGr_ver_no_p_PPanel.setName("RsltGr.ver_no_p");
		p.columnRsltGr_ver_no = p.RsltGr_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRsltGr_ver_no.addAliasName("RsltGr.ver_no", p);
		p.RsltGr_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$str_ln_p);
		p.RsltGr_str_ln_p_PPanel.setName("RsltGr.str_ln_p");
		p.columnRsltGr_str_ln_cd = p.RsltGr_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRsltGr_str_ln_cd.addAliasName("RsltGr.str_ln_cd", p);
		p.columnRsltGr_str_ln_nm = p.RsltGr_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRsltGr_str_ln_nm.addAliasName("RsltGr.str_ln_nm", p);
		p.columnRsltGr_str_ln_cd_none_flg = p.RsltGr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRsltGr_str_ln_cd_none_flg.addAliasName("RsltGr.str_ln_cd_none_flg", p);
		p.RsltGr_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$sno_wrk_no_p);
		p.RsltGr_sno_wrk_no_p_PPanel.setName("RsltGr.sno_wrk_no_p");
		p.columnRsltGr_sno1 = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRsltGr_sno1.addAliasName("RsltGr.sno1", p);
		p.columnRsltGr_sno2 = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRsltGr_sno2.addAliasName("RsltGr.sno2", p);
		p.columnRsltGr_sno3 = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRsltGr_sno3.addAliasName("RsltGr.sno3", p);
		p.columnRsltGr_sno4 = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRsltGr_sno4.addAliasName("RsltGr.sno4", p);
		p.columnRsltGr_wrk_no = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRsltGr_wrk_no.addAliasName("RsltGr.wrk_no", p);
		p.columnRsltGr_wrk_nm = p.RsltGr_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRsltGr_wrk_nm.addAliasName("RsltGr.wrk_nm", p);
		p.RsltGr_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$pack_unit_qty_p);
		p.RsltGr_pack_unit_qty_p_PPanel.setName("RsltGr.pack_unit_qty_p");
		p.columnRsltGr_pack_unit_qty = p.RsltGr_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_pack_unit_qty.addAliasName("RsltGr.pack_unit_qty", p);
		p.RsltGr_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$base_unit_qty_p);
		p.RsltGr_base_unit_qty_p_PPanel.setName("RsltGr.base_unit_qty_p");
		p.columnRsltGr_base_unit_qty = p.RsltGr_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_base_unit_qty.addAliasName("RsltGr.base_unit_qty", p);
		p.RsltGr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$qty_p);
		p.RsltGr_qty_p_PPanel.setName("RsltGr.qty_p");
		p.columnRsltGr_qty = p.RsltGr_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_qty.addAliasName("RsltGr.qty", p);
		p.RsltGr_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_alloc_qty_p);
		p.RsltGr_lot_alloc_qty_p_PPanel.setName("RsltGr.lot_alloc_qty_p");
		p.columnRsltGr_lot_alloc_qty = p.RsltGr_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lot_alloc_qty.addAliasName("RsltGr.lot_alloc_qty", p);
		p.RsltGr_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_wait_qty_p);
		p.RsltGr_lot_wait_qty_p_PPanel.setName("RsltGr.lot_wait_qty_p");
		p.columnRsltGr_lot_wait_qty = p.RsltGr_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lot_wait_qty.addAliasName("RsltGr.lot_wait_qty", p);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_alloc_avl_qty_p);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.setName("RsltGr.lot_alloc_avl_qty_p");
		p.columnRsltGr_lot_alloc_avl_qty = p.RsltGr_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lot_alloc_avl_qty.addAliasName("RsltGr.lot_alloc_avl_qty", p);
		p.RsltGr_not_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_alloc_qty_p);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.setName("RsltGr.not_lot_alloc_qty_p");
		p.columnRsltGr_not_lot_alloc_qty = p.RsltGr_not_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_not_lot_alloc_qty.addAliasName("RsltGr.not_lot_alloc_qty", p);
		p.RsltGr_not_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_wait_qty_p);
		p.RsltGr_not_lot_wait_qty_p_PPanel.setName("RsltGr.not_lot_wait_qty_p");
		p.columnRsltGr_not_lot_wait_qty = p.RsltGr_not_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_not_lot_wait_qty.addAliasName("RsltGr.not_lot_wait_qty", p);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_alloc_avl_qty_p);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.setName("RsltGr.not_lot_alloc_avl_qty_p");
		p.columnRsltGr_not_lot_alloc_avl_qty = p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_not_lot_alloc_avl_qty.addAliasName("RsltGr.not_lot_alloc_avl_qty", p);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_alloc_qty_p);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.setName("RsltGr.lg_lot_alloc_qty_p");
		p.columnRsltGr_lg_lot_alloc_qty = p.RsltGr_lg_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_lot_alloc_qty.addAliasName("RsltGr.lg_lot_alloc_qty", p);
		p.RsltGr_lg_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_wait_qty_p);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.setName("RsltGr.lg_lot_wait_qty_p");
		p.columnRsltGr_lg_lot_wait_qty = p.RsltGr_lg_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_lot_wait_qty.addAliasName("RsltGr.lg_lot_wait_qty", p);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_alloc_avl_qty_p);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.setName("RsltGr.lg_lot_alloc_avl_qty_p");
		p.columnRsltGr_lg_lot_alloc_avl_qty = p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_lot_alloc_avl_qty.addAliasName("RsltGr.lg_lot_alloc_avl_qty", p);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_alloc_qty_p);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.setName("RsltGr.lg_not_lot_alloc_qty_p");
		p.columnRsltGr_lg_not_lot_alloc_qty = p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_not_lot_alloc_qty.addAliasName("RsltGr.lg_not_lot_alloc_qty", p);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_wait_qty_p);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.setName("RsltGr.lg_not_lot_wait_qty_p");
		p.columnRsltGr_lg_not_lot_wait_qty = p.RsltGr_lg_not_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_not_lot_wait_qty.addAliasName("RsltGr.lg_not_lot_wait_qty", p);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_alloc_avl_qty_p);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.setName("RsltGr.lg_not_lot_alloc_avl_qty_p");
		p.columnRsltGr_lg_not_lot_alloc_avl_qty = p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_lg_not_lot_alloc_avl_qty.addAliasName("RsltGr.lg_not_lot_alloc_avl_qty", p);
		p.RsltGr_grs_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_alloc_qty_p);
		p.RsltGr_grs_alloc_qty_p_PPanel.setName("RsltGr.grs_alloc_qty_p");
		p.columnRsltGr_grs_alloc_qty = p.RsltGr_grs_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_grs_alloc_qty.addAliasName("RsltGr.grs_alloc_qty", p);
		p.RsltGr_grs_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_wait_qty_p);
		p.RsltGr_grs_wait_qty_p_PPanel.setName("RsltGr.grs_wait_qty_p");
		p.columnRsltGr_grs_wait_qty = p.RsltGr_grs_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_grs_wait_qty.addAliasName("RsltGr.grs_wait_qty", p);
		p.RsltGr_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$alloc_qty_p);
		p.RsltGr_alloc_qty_p_PPanel.setName("RsltGr.alloc_qty_p");
		p.columnRsltGr_alloc_qty = p.RsltGr_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_alloc_qty.addAliasName("RsltGr.alloc_qty", p);
		p.RsltGr_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$wait_qty_p);
		p.RsltGr_wait_qty_p_PPanel.setName("RsltGr.wait_qty_p");
		p.columnRsltGr_wait_qty = p.RsltGr_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_wait_qty.addAliasName("RsltGr.wait_qty", p);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_alloc_avl_qty_p);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.setName("RsltGr.grs_alloc_avl_qty_p");
		p.columnRsltGr_grs_alloc_avl_qty = p.RsltGr_grs_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_grs_alloc_avl_qty.addAliasName("RsltGr.grs_alloc_avl_qty", p);
		p.RsltGr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_fctr_p);
		p.RsltGr_act_cont_fctr_p_PPanel.setName("RsltGr.act_cont_fctr_p");
		p.columnRsltGr_act_cont_fctr = p.RsltGr_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRsltGr_act_cont_fctr.addAliasName("RsltGr.act_cont_fctr", p);
		p.RsltGr_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_qty_p);
		p.RsltGr_act_cont_qty_p_PPanel.setName("RsltGr.act_cont_qty_p");
		p.columnRsltGr_act_cont_qty = p.RsltGr_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_act_cont_qty.addAliasName("RsltGr.act_cont_qty", p);
		p.RsltGr_act_cont_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_alloc_qty_p);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.setName("RsltGr.act_cont_alloc_qty_p");
		p.columnRsltGr_act_cont_alloc_qty = p.RsltGr_act_cont_alloc_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_act_cont_alloc_qty.addAliasName("RsltGr.act_cont_alloc_qty", p);
		p.RsltGr_act_cont_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_wait_qty_p);
		p.RsltGr_act_cont_wait_qty_p_PPanel.setName("RsltGr.act_cont_wait_qty_p");
		p.columnRsltGr_act_cont_wait_qty = p.RsltGr_act_cont_wait_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_act_cont_wait_qty.addAliasName("RsltGr.act_cont_wait_qty", p);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_alloc_avl_qty_p);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.setName("RsltGr.act_cont_alloc_avl_qty_p");
		p.columnRsltGr_act_cont_alloc_avl_qty = p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_act_cont_alloc_avl_qty.addAliasName("RsltGr.act_cont_alloc_avl_qty", p);
		p.RsltGr_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_fctr_p);
		p.RsltGr_std_cont_fctr_p_PPanel.setName("RsltGr.std_cont_fctr_p");
		p.columnRsltGr_std_cont_fctr = p.RsltGr_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRsltGr_std_cont_fctr.addAliasName("RsltGr.std_cont_fctr", p);
		p.RsltGr_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_qty_p);
		p.RsltGr_std_cont_qty_p_PPanel.setName("RsltGr.std_cont_qty_p");
		p.columnRsltGr_std_cont_qty = p.RsltGr_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_std_cont_qty.addAliasName("RsltGr.std_cont_qty", p);
		p.RsltGr_std_cont_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_alloc_qty_p);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.setName("RsltGr.std_cont_alloc_qty_p");
		p.columnRsltGr_std_cont_alloc_qty = p.RsltGr_std_cont_alloc_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_std_cont_alloc_qty.addAliasName("RsltGr.std_cont_alloc_qty", p);
		p.RsltGr_std_cont_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_wait_qty_p);
		p.RsltGr_std_cont_wait_qty_p_PPanel.setName("RsltGr.std_cont_wait_qty_p");
		p.columnRsltGr_std_cont_wait_qty = p.RsltGr_std_cont_wait_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_std_cont_wait_qty.addAliasName("RsltGr.std_cont_wait_qty", p);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_alloc_avl_qty_p);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.setName("RsltGr.std_cont_alloc_avl_qty_p");
		p.columnRsltGr_std_cont_alloc_avl_qty = p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGr_std_cont_alloc_avl_qty.addAliasName("RsltGr.std_cont_alloc_avl_qty", p);
		p.RsltGr_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$cont_fctr_unit_p);
		p.RsltGr_cont_fctr_unit_p_PPanel.setName("RsltGr.cont_fctr_unit_p");
		p.columnRsltGr_cont_fctr_unit_cd = p.RsltGr_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRsltGr_cont_fctr_unit_cd.addAliasName("RsltGr.cont_fctr_unit_cd", p);
		p.columnRsltGr_cont_fctr_unit_nm = p.RsltGr_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRsltGr_cont_fctr_unit_nm.addAliasName("RsltGr.cont_fctr_unit_nm", p);
	}

	/**
	 * [RsltGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltGi(MSBEP_AllocSrch p) {
		p.RsltGi_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$ver_no_p);
		p.RsltGi_ver_no_p_PPanel.setName("RsltGi.ver_no_p");
		p.columnRsltGi_ver_no = p.RsltGi_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRsltGi_ver_no.addAliasName("RsltGi.ver_no", p);
		p.RsltGi_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$str_ln_p);
		p.RsltGi_str_ln_p_PPanel.setName("RsltGi.str_ln_p");
		p.columnRsltGi_str_ln_cd = p.RsltGi_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRsltGi_str_ln_cd.addAliasName("RsltGi.str_ln_cd", p);
		p.columnRsltGi_str_ln_nm = p.RsltGi_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRsltGi_str_ln_nm.addAliasName("RsltGi.str_ln_nm", p);
		p.columnRsltGi_str_ln_cd_none_flg = p.RsltGi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRsltGi_str_ln_cd_none_flg.addAliasName("RsltGi.str_ln_cd_none_flg", p);
		p.RsltGi_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$sno_wrk_no_p);
		p.RsltGi_sno_wrk_no_p_PPanel.setName("RsltGi.sno_wrk_no_p");
		p.columnRsltGi_sno1 = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRsltGi_sno1.addAliasName("RsltGi.sno1", p);
		p.columnRsltGi_sno2 = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRsltGi_sno2.addAliasName("RsltGi.sno2", p);
		p.columnRsltGi_sno3 = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRsltGi_sno3.addAliasName("RsltGi.sno3", p);
		p.columnRsltGi_sno4 = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRsltGi_sno4.addAliasName("RsltGi.sno4", p);
		p.columnRsltGi_wrk_no = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRsltGi_wrk_no.addAliasName("RsltGi.wrk_no", p);
		p.columnRsltGi_wrk_nm = p.RsltGi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRsltGi_wrk_nm.addAliasName("RsltGi.wrk_nm", p);
		p.RsltGi_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$pack_unit_qty_p);
		p.RsltGi_pack_unit_qty_p_PPanel.setName("RsltGi.pack_unit_qty_p");
		p.columnRsltGi_pack_unit_qty = p.RsltGi_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_pack_unit_qty.addAliasName("RsltGi.pack_unit_qty", p);
		p.RsltGi_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$base_unit_qty_p);
		p.RsltGi_base_unit_qty_p_PPanel.setName("RsltGi.base_unit_qty_p");
		p.columnRsltGi_base_unit_qty = p.RsltGi_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_base_unit_qty.addAliasName("RsltGi.base_unit_qty", p);
		p.RsltGi_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$qty_p);
		p.RsltGi_qty_p_PPanel.setName("RsltGi.qty_p");
		p.columnRsltGi_qty = p.RsltGi_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_qty.addAliasName("RsltGi.qty", p);
		p.RsltGi_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_alloc_qty_p);
		p.RsltGi_lot_alloc_qty_p_PPanel.setName("RsltGi.lot_alloc_qty_p");
		p.columnRsltGi_lot_alloc_qty = p.RsltGi_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lot_alloc_qty.addAliasName("RsltGi.lot_alloc_qty", p);
		p.RsltGi_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_wait_qty_p);
		p.RsltGi_lot_wait_qty_p_PPanel.setName("RsltGi.lot_wait_qty_p");
		p.columnRsltGi_lot_wait_qty = p.RsltGi_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lot_wait_qty.addAliasName("RsltGi.lot_wait_qty", p);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lot_alloc_avl_qty_p);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.setName("RsltGi.lot_alloc_avl_qty_p");
		p.columnRsltGi_lot_alloc_avl_qty = p.RsltGi_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lot_alloc_avl_qty.addAliasName("RsltGi.lot_alloc_avl_qty", p);
		p.RsltGi_not_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_alloc_qty_p);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.setName("RsltGi.not_lot_alloc_qty_p");
		p.columnRsltGi_not_lot_alloc_qty = p.RsltGi_not_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_not_lot_alloc_qty.addAliasName("RsltGi.not_lot_alloc_qty", p);
		p.RsltGi_not_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_wait_qty_p);
		p.RsltGi_not_lot_wait_qty_p_PPanel.setName("RsltGi.not_lot_wait_qty_p");
		p.columnRsltGi_not_lot_wait_qty = p.RsltGi_not_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_not_lot_wait_qty.addAliasName("RsltGi.not_lot_wait_qty", p);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$not_lot_alloc_avl_qty_p);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.setName("RsltGi.not_lot_alloc_avl_qty_p");
		p.columnRsltGi_not_lot_alloc_avl_qty = p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_not_lot_alloc_avl_qty.addAliasName("RsltGi.not_lot_alloc_avl_qty", p);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_alloc_qty_p);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.setName("RsltGi.lg_lot_alloc_qty_p");
		p.columnRsltGi_lg_lot_alloc_qty = p.RsltGi_lg_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_lot_alloc_qty.addAliasName("RsltGi.lg_lot_alloc_qty", p);
		p.RsltGi_lg_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_wait_qty_p);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.setName("RsltGi.lg_lot_wait_qty_p");
		p.columnRsltGi_lg_lot_wait_qty = p.RsltGi_lg_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_lot_wait_qty.addAliasName("RsltGi.lg_lot_wait_qty", p);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_lot_alloc_avl_qty_p);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.setName("RsltGi.lg_lot_alloc_avl_qty_p");
		p.columnRsltGi_lg_lot_alloc_avl_qty = p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_lot_alloc_avl_qty.addAliasName("RsltGi.lg_lot_alloc_avl_qty", p);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_alloc_qty_p);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.setName("RsltGi.lg_not_lot_alloc_qty_p");
		p.columnRsltGi_lg_not_lot_alloc_qty = p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_not_lot_alloc_qty.addAliasName("RsltGi.lg_not_lot_alloc_qty", p);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_wait_qty_p);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.setName("RsltGi.lg_not_lot_wait_qty_p");
		p.columnRsltGi_lg_not_lot_wait_qty = p.RsltGi_lg_not_lot_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_not_lot_wait_qty.addAliasName("RsltGi.lg_not_lot_wait_qty", p);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$lg_not_lot_alloc_avl_qty_p);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.setName("RsltGi.lg_not_lot_alloc_avl_qty_p");
		p.columnRsltGi_lg_not_lot_alloc_avl_qty = p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_lg_not_lot_alloc_avl_qty.addAliasName("RsltGi.lg_not_lot_alloc_avl_qty", p);
		p.RsltGi_grs_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_alloc_qty_p);
		p.RsltGi_grs_alloc_qty_p_PPanel.setName("RsltGi.grs_alloc_qty_p");
		p.columnRsltGi_grs_alloc_qty = p.RsltGi_grs_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_grs_alloc_qty.addAliasName("RsltGi.grs_alloc_qty", p);
		p.RsltGi_grs_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_wait_qty_p);
		p.RsltGi_grs_wait_qty_p_PPanel.setName("RsltGi.grs_wait_qty_p");
		p.columnRsltGi_grs_wait_qty = p.RsltGi_grs_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_grs_wait_qty.addAliasName("RsltGi.grs_wait_qty", p);
		p.RsltGi_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$alloc_qty_p);
		p.RsltGi_alloc_qty_p_PPanel.setName("RsltGi.alloc_qty_p");
		p.columnRsltGi_alloc_qty = p.RsltGi_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_alloc_qty.addAliasName("RsltGi.alloc_qty", p);
		p.RsltGi_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$wait_qty_p);
		p.RsltGi_wait_qty_p_PPanel.setName("RsltGi.wait_qty_p");
		p.columnRsltGi_wait_qty = p.RsltGi_wait_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_wait_qty.addAliasName("RsltGi.wait_qty", p);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$grs_alloc_avl_qty_p);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.setName("RsltGi.grs_alloc_avl_qty_p");
		p.columnRsltGi_grs_alloc_avl_qty = p.RsltGi_grs_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_grs_alloc_avl_qty.addAliasName("RsltGi.grs_alloc_avl_qty", p);
		p.RsltGi_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_fctr_p);
		p.RsltGi_act_cont_fctr_p_PPanel.setName("RsltGi.act_cont_fctr_p");
		p.columnRsltGi_act_cont_fctr = p.RsltGi_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRsltGi_act_cont_fctr.addAliasName("RsltGi.act_cont_fctr", p);
		p.RsltGi_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_qty_p);
		p.RsltGi_act_cont_qty_p_PPanel.setName("RsltGi.act_cont_qty_p");
		p.columnRsltGi_act_cont_qty = p.RsltGi_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_act_cont_qty.addAliasName("RsltGi.act_cont_qty", p);
		p.RsltGi_act_cont_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_alloc_qty_p);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.setName("RsltGi.act_cont_alloc_qty_p");
		p.columnRsltGi_act_cont_alloc_qty = p.RsltGi_act_cont_alloc_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_act_cont_alloc_qty.addAliasName("RsltGi.act_cont_alloc_qty", p);
		p.RsltGi_act_cont_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_wait_qty_p);
		p.RsltGi_act_cont_wait_qty_p_PPanel.setName("RsltGi.act_cont_wait_qty_p");
		p.columnRsltGi_act_cont_wait_qty = p.RsltGi_act_cont_wait_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_act_cont_wait_qty.addAliasName("RsltGi.act_cont_wait_qty", p);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$act_cont_alloc_avl_qty_p);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.setName("RsltGi.act_cont_alloc_avl_qty_p");
		p.columnRsltGi_act_cont_alloc_avl_qty = p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_act_cont_alloc_avl_qty.addAliasName("RsltGi.act_cont_alloc_avl_qty", p);
		p.RsltGi_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_fctr_p);
		p.RsltGi_std_cont_fctr_p_PPanel.setName("RsltGi.std_cont_fctr_p");
		p.columnRsltGi_std_cont_fctr = p.RsltGi_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRsltGi_std_cont_fctr.addAliasName("RsltGi.std_cont_fctr", p);
		p.RsltGi_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_qty_p);
		p.RsltGi_std_cont_qty_p_PPanel.setName("RsltGi.std_cont_qty_p");
		p.columnRsltGi_std_cont_qty = p.RsltGi_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_std_cont_qty.addAliasName("RsltGi.std_cont_qty", p);
		p.RsltGi_std_cont_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_alloc_qty_p);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.setName("RsltGi.std_cont_alloc_qty_p");
		p.columnRsltGi_std_cont_alloc_qty = p.RsltGi_std_cont_alloc_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_std_cont_alloc_qty.addAliasName("RsltGi.std_cont_alloc_qty", p);
		p.RsltGi_std_cont_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_wait_qty_p);
		p.RsltGi_std_cont_wait_qty_p_PPanel.setName("RsltGi.std_cont_wait_qty_p");
		p.columnRsltGi_std_cont_wait_qty = p.RsltGi_std_cont_wait_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_std_cont_wait_qty.addAliasName("RsltGi.std_cont_wait_qty", p);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$std_cont_alloc_avl_qty_p);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.setName("RsltGi.std_cont_alloc_avl_qty_p");
		p.columnRsltGi_std_cont_alloc_avl_qty = p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRsltGi_std_cont_alloc_avl_qty.addAliasName("RsltGi.std_cont_alloc_avl_qty", p);
		p.RsltGi_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.$cont_fctr_unit_p);
		p.RsltGi_cont_fctr_unit_p_PPanel.setName("RsltGi.cont_fctr_unit_p");
		p.columnRsltGi_cont_fctr_unit_cd = p.RsltGi_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRsltGi_cont_fctr_unit_cd.addAliasName("RsltGi.cont_fctr_unit_cd", p);
		p.columnRsltGi_cont_fctr_unit_nm = p.RsltGi_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRsltGi_cont_fctr_unit_nm.addAliasName("RsltGi.cont_fctr_unit_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_AllocSrch p) {
		p.Btn_sync_p_PPanel = mcframe.clientFSBA.FSBAP0020.FSBAP0020.create();
		p.Btn_sync_p_PPanel.setName("Btn.sync_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_AllocSrch p) {
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
	
	
	/** [Cnd_quality_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_typ_p = null;

	/**
	 * [Cnd_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_typ_ListPutter() {
		if (Cnd_quality_typ_p == null) {
			Cnd_quality_typ_p = createCnd_quality_typ_ListPutter(Cnd_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Cnd_quality_typ_p;
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
	
	
	/** [Cnd_pack_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pack_unit_cd_p = null;

	/**
	 * [Cnd_pack_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pack_unit_cd_ListPutter() {
		if (Cnd_pack_unit_cd_p == null) {
			Cnd_pack_unit_cd_p = createCnd_pack_unit_cd_ListPutter(Cnd_pack_unit_cd, "pack_unit_cd", "pack_unit_nm");

		}
		return Cnd_pack_unit_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocSrch create(){
		MSBEP_AllocSrch p = new MSBEP_AllocSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocSrch create(String name){
		MSBEP_AllocSrch p = new MSBEP_AllocSrch(name);
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
		MSBEP_AllocSrch_MC.jbfInitScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitOpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitTop((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitFold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitTab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitGrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitGiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitCnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitCtrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitRslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitHdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitHdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitHdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitRsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitRsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitBtn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbfInitEastBtn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitOpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitTop((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitFold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitTab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitGrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitGiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitCnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitCtrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitRslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitHdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitHdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitHdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitRsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitRsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitBtn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.jbInitEastBtn((MSBEP_AllocSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OpeTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOpeTyp(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.OpeTypPanel = p.beansFactory.createPanel("OpeTyp");
		p.OpeTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		p.Tab1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [GrSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGrSts(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.GrStsPanel = p.beansFactory.createPanel("GrSts");
		p.GrStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [GiSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGiSts(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.GiStsPanel = p.beansFactory.createPanel("GiSts");
		p.GiStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_ACCRUAL = p.beansFactory.createRadioButton("Cnd.ope_ACCRUAL");
		p.Cnd_ope_ACCPT = p.beansFactory.createRadioButton("Cnd.ope_ACCPT");
		p.Cnd_ope_AVL = p.beansFactory.createRadioButton("Cnd.ope_AVL");
		p.Cnd_ope_ALLOC = p.beansFactory.createRadioButton("Cnd.ope_ALLOC");
		p.Cnd_tgt_Group = p.beansFactory.createButtonGroup("Cnd.tgt");
		p.Cnd_tgt_LOC = p.beansFactory.createRadioButton("Cnd.tgt_LOC");
		p.Cnd_tgt_GRS = p.beansFactory.createRadioButton("Cnd.tgt_GRS");
		p.Cnd_gr_prcd = p.beansFactory.createCheckBox("Cnd.gr_prcd");
		p.Cnd_gr_sts_opn_grp = p.beansFactory.createCheckBox("Cnd.gr_sts_opn_grp");
		p.Cnd_gr_sts_ordsav_grp = p.beansFactory.createCheckBox("Cnd.gr_sts_ordsav_grp");
		p.Cnd_gr_sts_fix_grp = p.beansFactory.createCheckBox("Cnd.gr_sts_fix_grp");
		p.Cnd_gr_sts_schd_grp = p.beansFactory.createCheckBox("Cnd.gr_sts_schd_grp");
		p.Cnd_gr_sts_ord_grp = p.beansFactory.createCheckBox("Cnd.gr_sts_ord_grp");
		p.Cnd_gr_act = p.beansFactory.createCheckBox("Cnd.gr_act");
		p.Cnd_gi_prcd = p.beansFactory.createCheckBox("Cnd.gi_prcd");
		p.Cnd_gi_sts_opn_grp = p.beansFactory.createCheckBox("Cnd.gi_sts_opn_grp");
		p.Cnd_gi_sts_ordsav_grp = p.beansFactory.createCheckBox("Cnd.gi_sts_ordsav_grp");
		p.Cnd_gi_sts_fix_grp = p.beansFactory.createCheckBox("Cnd.gi_sts_fix_grp");
		p.Cnd_gi_sts_schd_grp = p.beansFactory.createCheckBox("Cnd.gi_sts_schd_grp");
		p.Cnd_gi_sts_ord_grp = p.beansFactory.createCheckBox("Cnd.gi_sts_ord_grp");
		p.Cnd_gi_act = p.beansFactory.createCheckBox("Cnd.gi_act");
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_avl_schd_dt_Label = p.beansFactory.createLabel("Cnd.avl_schd_dt_Label");
		p.Cnd_avl_schd_dt = p.beansFactory.createDateField("Cnd.avl_schd_dt");
		p.Cnd_avl_schd_dt.setLabel(p.Cnd_avl_schd_dt_Label);
		p.Cnd_except_invld_lot_flg = p.beansFactory.createCheckBox("Cnd.except_invld_lot_flg");
		p.Cnd_except_alloc_wait_flg = p.beansFactory.createCheckBox("Cnd.except_alloc_wait_flg");
		p.Cnd_alloc_gi_flg = p.beansFactory.createCheckBox("Cnd.alloc_gi_flg");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_pack_unit_cd_Label = p.beansFactory.createLabel("Cnd.pack_unit_cd_Label");
		p.Cnd_pack_unit_cd = p.beansFactory.createTextComboBox("Cnd.pack_unit_cd");
		p.Cnd_pack_unit_cd.setLabel(p.Cnd_pack_unit_cd_Label);
		p.Cnd_pack_unit_nm = p.beansFactory.createTextField("Cnd.pack_unit_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrQty]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrQty(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrQtyPanel = p.beansFactory.createPanel("HdrQty");
		// ブロックの項目の初期化
		p.HdrQty_base_unit_dec_place = p.beansFactory.createNumberField("HdrQty.base_unit_dec_place");
		p.HdrQty_base_unit_cd_Label = p.beansFactory.createLabel("HdrQty.base_unit_cd_Label");
		p.HdrQty_base_unit_cd = p.beansFactory.createTextField("HdrQty.base_unit_cd");
		p.HdrQty_base_unit_cd.setLabel(p.HdrQty_base_unit_cd_Label);
		p.HdrQty_base_unit_nm = p.beansFactory.createTextField("HdrQty.base_unit_nm");
	}

	/**
	 * [HdrContFctr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrContFctr(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrContFctrPanel = p.beansFactory.createPanel("HdrContFctr");
		// ブロックの項目の初期化
		p.HdrContFctr_cont_fctr_flg = p.beansFactory.createCheckBox("HdrContFctr.cont_fctr_flg");
		p.HdrContFctr_cont_fctr_dec_place = p.beansFactory.createNumberField("HdrContFctr.cont_fctr_dec_place");
		p.HdrContFctr_cont_fctr_rnd_typ = p.beansFactory.createTextField("HdrContFctr.cont_fctr_rnd_typ");
	}

	/**
	 * [RsltGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltGr(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.RsltGrPanel = p.beansFactory.createPanel("RsltGr");
		p.RsltGrTitledBorder = p.beansFactory.createTitledBorder();
		p.RsltGrScrollPane = p.beansFactory.createScrollPane("RsltGr.scroll");
		p.createRsltGrTable();
		// ブロックの項目の初期化
		p.columnRsltGr_check = p.beansFactory.createTableColumn("RsltGr.check", MCColumnType.CHECK);
		p.columnRsltGr_schd_stk_typ = p.beansFactory.createTableColumn("RsltGr.schd_stk_typ", MCColumnType.TEXT);
		p.columnRsltGr_schd_stk_typ_nm = p.beansFactory.createTableColumn("RsltGr.schd_stk_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_dt = p.beansFactory.createTableColumn("RsltGr.dt", MCColumnType.DATE);
		p.columnRsltGr_wg_cd = p.beansFactory.createTableColumn("RsltGr.wg_cd", MCColumnType.TEXT);
		p.columnRsltGr_wg_nm = p.beansFactory.createTableColumn("RsltGr.wg_nm", MCColumnType.TEXT);
		p.columnRsltGr_dpt_cd = p.beansFactory.createTableColumn("RsltGr.dpt_cd", MCColumnType.TEXT);
		p.columnRsltGr_dpt_nm = p.beansFactory.createTableColumn("RsltGr.dpt_nm", MCColumnType.TEXT);
		p.columnRsltGr_lot_no = p.beansFactory.createTableColumn("RsltGr.lot_no", MCColumnType.TEXT);
		p.columnRsltGr_sublot_no = p.beansFactory.createTableColumn("RsltGr.sublot_no", MCColumnType.TEXT);
		p.columnRsltGr_loc_cd = p.beansFactory.createTableColumn("RsltGr.loc_cd", MCColumnType.TEXT);
		p.columnRsltGr_loc_nm = p.beansFactory.createTableColumn("RsltGr.loc_nm", MCColumnType.TEXT);
		p.columnRsltGr_site_cd = p.beansFactory.createTableColumn("RsltGr.site_cd", MCColumnType.TEXT);
		p.columnRsltGr_site_nm = p.beansFactory.createTableColumn("RsltGr.site_nm", MCColumnType.TEXT);
		p.columnRsltGr_lg_grp_cd = p.beansFactory.createTableColumn("RsltGr.lg_grp_cd", MCColumnType.TEXT);
		p.columnRsltGr_lg_grp_nm = p.beansFactory.createTableColumn("RsltGr.lg_grp_nm", MCColumnType.TEXT);
		p.columnRsltGr_alloc_grp_cd = p.beansFactory.createTableColumn("RsltGr.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRsltGr_alloc_grp_nm = p.beansFactory.createTableColumn("RsltGr.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRsltGr_loc_grp_cd = p.beansFactory.createTableColumn("RsltGr.loc_grp_cd", MCColumnType.TEXT);
		p.columnRsltGr_loc_grp_nm = p.beansFactory.createTableColumn("RsltGr.loc_grp_nm", MCColumnType.TEXT);
		p.columnRsltGr_gd_cd = p.beansFactory.createTableColumn("RsltGr.gd_cd", MCColumnType.TEXT);
		p.columnRsltGr_gd_nm = p.beansFactory.createTableColumn("RsltGr.gd_nm", MCColumnType.TEXT);
		p.columnRsltGr_quality_typ = p.beansFactory.createTableColumn("RsltGr.quality_typ", MCColumnType.TEXT);
		p.columnRsltGr_quality_typ_nm = p.beansFactory.createTableColumn("RsltGr.quality_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_stk_insp_typ = p.beansFactory.createTableColumn("RsltGr.stk_insp_typ", MCColumnType.TEXT);
		p.columnRsltGr_stk_insp_typ_nm = p.beansFactory.createTableColumn("RsltGr.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_in_xfr_typ = p.beansFactory.createTableColumn("RsltGr.in_xfr_typ", MCColumnType.TEXT);
		p.columnRsltGr_in_xfr_typ_nm = p.beansFactory.createTableColumn("RsltGr.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_asst_typ = p.beansFactory.createTableColumn("RsltGr.asst_typ", MCColumnType.TEXT);
		p.columnRsltGr_asst_typ_nm = p.beansFactory.createTableColumn("RsltGr.asst_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_stk_id_typ = p.beansFactory.createTableColumn("RsltGr.stk_id_typ", MCColumnType.TEXT);
		p.columnRsltGr_stk_id_typ_nm = p.beansFactory.createTableColumn("RsltGr.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_stk_bp_cd = p.beansFactory.createTableColumn("RsltGr.stk_bp_cd", MCColumnType.TEXT);
		p.columnRsltGr_stk_bp_nm = p.beansFactory.createTableColumn("RsltGr.stk_bp_nm", MCColumnType.TEXT);
		p.columnRsltGr_stk_arrv_bp_cd = p.beansFactory.createTableColumn("RsltGr.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRsltGr_stk_arrv_bp_nm = p.beansFactory.createTableColumn("RsltGr.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRsltGr_pack_unit_cd = p.beansFactory.createTableColumn("RsltGr.pack_unit_cd", MCColumnType.TEXT);
		p.columnRsltGr_pack_unit_nm = p.beansFactory.createTableColumn("RsltGr.pack_unit_nm", MCColumnType.TEXT);
		p.columnRsltGr_pack_unit_dec_place = p.beansFactory.createTableColumn("RsltGr.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGr_base_unit_cd = p.beansFactory.createTableColumn("RsltGr.base_unit_cd", MCColumnType.TEXT);
		p.columnRsltGr_base_unit_nm = p.beansFactory.createTableColumn("RsltGr.base_unit_nm", MCColumnType.TEXT);
		p.columnRsltGr_base_unit_dec_place = p.beansFactory.createTableColumn("RsltGr.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGr_alloc_unit_cd = p.beansFactory.createTableColumn("RsltGr.alloc_unit_cd", MCColumnType.TEXT);
		p.columnRsltGr_alloc_unit_nm = p.beansFactory.createTableColumn("RsltGr.alloc_unit_nm", MCColumnType.TEXT);
		p.columnRsltGr_alloc_unit_dec_place = p.beansFactory.createTableColumn("RsltGr.alloc_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGr_overdue_alloc_flg = p.beansFactory.createTableColumn("RsltGr.overdue_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGr_another_loc_alloc_flg = p.beansFactory.createTableColumn("RsltGr.another_loc_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGr_abnormal_alloc_flg = p.beansFactory.createTableColumn("RsltGr.abnormal_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGr_cont_fctr_flg = p.beansFactory.createTableColumn("RsltGr.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRsltGr_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("RsltGr.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRsltGr_cont_fctr_dec_place = p.beansFactory.createTableColumn("RsltGr.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRsltGr_lot_seq = p.beansFactory.createTableColumn("RsltGr.lot_seq", MCColumnType.TEXT);
		p.columnRsltGr_first_gr_dt = p.beansFactory.createTableColumn("RsltGr.first_gr_dt", MCColumnType.DATE);
		p.columnRsltGr_vld_dt = p.beansFactory.createTableColumn("RsltGr.vld_dt", MCColumnType.DATE);
		p.columnRsltGr_lmt_dt = p.beansFactory.createTableColumn("RsltGr.lmt_dt", MCColumnType.DATE);
		p.columnRsltGr_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("RsltGr.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRsltGr_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("RsltGr.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("RsltGr.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRsltGr_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("RsltGr.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_vld_dt_fr = p.beansFactory.createTableColumn("RsltGr.vld_dt_fr", MCColumnType.DATE);
		p.columnRsltGr_vld_dt_to = p.beansFactory.createTableColumn("RsltGr.vld_dt_to", MCColumnType.DATE);
		p.columnRsltGr_stop_dt = p.beansFactory.createTableColumn("RsltGr.stop_dt", MCColumnType.DATE);
		p.columnRsltGr_rel_dt = p.beansFactory.createTableColumn("RsltGr.rel_dt", MCColumnType.DATE);
		p.columnRsltGr_alloc_margin_days = p.beansFactory.createTableColumn("RsltGr.alloc_margin_days", MCColumnType.NUMBER);
		p.columnRsltGr_loc_sppl_cd = p.beansFactory.createTableColumn("RsltGr.loc_sppl_cd", MCColumnType.TEXT);
		p.columnRsltGr_loc_sppl_nm = p.beansFactory.createTableColumn("RsltGr.loc_sppl_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_typ = p.beansFactory.createTableColumn("RsltGr.io_schd_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_sts_typ = p.beansFactory.createTableColumn("RsltGr.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_no = p.beansFactory.createTableColumn("RsltGr.io_schd_no", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_seq = p.beansFactory.createTableColumn("RsltGr.io_schd_seq", MCColumnType.NUMBER);
		p.columnRsltGr_trd_cd = p.beansFactory.createTableColumn("RsltGr.trd_cd", MCColumnType.TEXT);
		p.columnRsltGr_trd_nm = p.beansFactory.createTableColumn("RsltGr.trd_nm", MCColumnType.TEXT);
		p.columnRsltGr_trd_ptn_typ = p.beansFactory.createTableColumn("RsltGr.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRsltGr_trd_ptn_typ_nm = p.beansFactory.createTableColumn("RsltGr.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_trn_typ = p.beansFactory.createTableColumn("RsltGr.trn_typ", MCColumnType.TEXT);
		p.columnRsltGr_trn_typ_nm = p.beansFactory.createTableColumn("RsltGr.trn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_act_typ = p.beansFactory.createTableColumn("RsltGr.io_act_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_act_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_act_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [RsltGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltGi(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.RsltGiPanel = p.beansFactory.createPanel("RsltGi");
		p.RsltGiTitledBorder = p.beansFactory.createTitledBorder();
		p.RsltGiScrollPane = p.beansFactory.createScrollPane("RsltGi.scroll");
		p.createRsltGiTable();
		// ブロックの項目の初期化
		p.columnRsltGi_check = p.beansFactory.createTableColumn("RsltGi.check", MCColumnType.CHECK);
		p.columnRsltGi_schd_stk_typ = p.beansFactory.createTableColumn("RsltGi.schd_stk_typ", MCColumnType.TEXT);
		p.columnRsltGi_schd_stk_typ_nm = p.beansFactory.createTableColumn("RsltGi.schd_stk_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_dt = p.beansFactory.createTableColumn("RsltGi.dt", MCColumnType.DATE);
		p.columnRsltGi_wg_cd = p.beansFactory.createTableColumn("RsltGi.wg_cd", MCColumnType.TEXT);
		p.columnRsltGi_wg_nm = p.beansFactory.createTableColumn("RsltGi.wg_nm", MCColumnType.TEXT);
		p.columnRsltGi_dpt_cd = p.beansFactory.createTableColumn("RsltGi.dpt_cd", MCColumnType.TEXT);
		p.columnRsltGi_dpt_nm = p.beansFactory.createTableColumn("RsltGi.dpt_nm", MCColumnType.TEXT);
		p.columnRsltGi_lot_no = p.beansFactory.createTableColumn("RsltGi.lot_no", MCColumnType.TEXT);
		p.columnRsltGi_sublot_no = p.beansFactory.createTableColumn("RsltGi.sublot_no", MCColumnType.TEXT);
		p.columnRsltGi_loc_cd = p.beansFactory.createTableColumn("RsltGi.loc_cd", MCColumnType.TEXT);
		p.columnRsltGi_loc_nm = p.beansFactory.createTableColumn("RsltGi.loc_nm", MCColumnType.TEXT);
		p.columnRsltGi_site_cd = p.beansFactory.createTableColumn("RsltGi.site_cd", MCColumnType.TEXT);
		p.columnRsltGi_site_nm = p.beansFactory.createTableColumn("RsltGi.site_nm", MCColumnType.TEXT);
		p.columnRsltGi_lg_grp_cd = p.beansFactory.createTableColumn("RsltGi.lg_grp_cd", MCColumnType.TEXT);
		p.columnRsltGi_lg_grp_nm = p.beansFactory.createTableColumn("RsltGi.lg_grp_nm", MCColumnType.TEXT);
		p.columnRsltGi_alloc_grp_cd = p.beansFactory.createTableColumn("RsltGi.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRsltGi_alloc_grp_nm = p.beansFactory.createTableColumn("RsltGi.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRsltGi_loc_grp_cd = p.beansFactory.createTableColumn("RsltGi.loc_grp_cd", MCColumnType.TEXT);
		p.columnRsltGi_loc_grp_nm = p.beansFactory.createTableColumn("RsltGi.loc_grp_nm", MCColumnType.TEXT);
		p.columnRsltGi_gd_cd = p.beansFactory.createTableColumn("RsltGi.gd_cd", MCColumnType.TEXT);
		p.columnRsltGi_gd_nm = p.beansFactory.createTableColumn("RsltGi.gd_nm", MCColumnType.TEXT);
		p.columnRsltGi_quality_typ = p.beansFactory.createTableColumn("RsltGi.quality_typ", MCColumnType.TEXT);
		p.columnRsltGi_quality_typ_nm = p.beansFactory.createTableColumn("RsltGi.quality_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_stk_insp_typ = p.beansFactory.createTableColumn("RsltGi.stk_insp_typ", MCColumnType.TEXT);
		p.columnRsltGi_stk_insp_typ_nm = p.beansFactory.createTableColumn("RsltGi.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_in_xfr_typ = p.beansFactory.createTableColumn("RsltGi.in_xfr_typ", MCColumnType.TEXT);
		p.columnRsltGi_in_xfr_typ_nm = p.beansFactory.createTableColumn("RsltGi.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_asst_typ = p.beansFactory.createTableColumn("RsltGi.asst_typ", MCColumnType.TEXT);
		p.columnRsltGi_asst_typ_nm = p.beansFactory.createTableColumn("RsltGi.asst_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_stk_id_typ = p.beansFactory.createTableColumn("RsltGi.stk_id_typ", MCColumnType.TEXT);
		p.columnRsltGi_stk_id_typ_nm = p.beansFactory.createTableColumn("RsltGi.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_stk_bp_cd = p.beansFactory.createTableColumn("RsltGi.stk_bp_cd", MCColumnType.TEXT);
		p.columnRsltGi_stk_bp_nm = p.beansFactory.createTableColumn("RsltGi.stk_bp_nm", MCColumnType.TEXT);
		p.columnRsltGi_stk_arrv_bp_cd = p.beansFactory.createTableColumn("RsltGi.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRsltGi_stk_arrv_bp_nm = p.beansFactory.createTableColumn("RsltGi.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRsltGi_pack_unit_cd = p.beansFactory.createTableColumn("RsltGi.pack_unit_cd", MCColumnType.TEXT);
		p.columnRsltGi_pack_unit_nm = p.beansFactory.createTableColumn("RsltGi.pack_unit_nm", MCColumnType.TEXT);
		p.columnRsltGi_pack_unit_dec_place = p.beansFactory.createTableColumn("RsltGi.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGi_base_unit_cd = p.beansFactory.createTableColumn("RsltGi.base_unit_cd", MCColumnType.TEXT);
		p.columnRsltGi_base_unit_nm = p.beansFactory.createTableColumn("RsltGi.base_unit_nm", MCColumnType.TEXT);
		p.columnRsltGi_base_unit_dec_place = p.beansFactory.createTableColumn("RsltGi.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGi_alloc_unit_cd = p.beansFactory.createTableColumn("RsltGi.alloc_unit_cd", MCColumnType.TEXT);
		p.columnRsltGi_alloc_unit_nm = p.beansFactory.createTableColumn("RsltGi.alloc_unit_nm", MCColumnType.TEXT);
		p.columnRsltGi_alloc_unit_dec_place = p.beansFactory.createTableColumn("RsltGi.alloc_unit_dec_place", MCColumnType.NUMBER);
		p.columnRsltGi_overdue_alloc_flg = p.beansFactory.createTableColumn("RsltGi.overdue_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGi_another_loc_alloc_flg = p.beansFactory.createTableColumn("RsltGi.another_loc_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGi_abnormal_alloc_flg = p.beansFactory.createTableColumn("RsltGi.abnormal_alloc_flg", MCColumnType.CHECK);
		p.columnRsltGi_cont_fctr_flg = p.beansFactory.createTableColumn("RsltGi.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRsltGi_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("RsltGi.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRsltGi_cont_fctr_dec_place = p.beansFactory.createTableColumn("RsltGi.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRsltGi_lot_seq = p.beansFactory.createTableColumn("RsltGi.lot_seq", MCColumnType.TEXT);
		p.columnRsltGi_first_gr_dt = p.beansFactory.createTableColumn("RsltGi.first_gr_dt", MCColumnType.DATE);
		p.columnRsltGi_vld_dt = p.beansFactory.createTableColumn("RsltGi.vld_dt", MCColumnType.DATE);
		p.columnRsltGi_lmt_dt = p.beansFactory.createTableColumn("RsltGi.lmt_dt", MCColumnType.DATE);
		p.columnRsltGi_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("RsltGi.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRsltGi_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("RsltGi.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("RsltGi.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRsltGi_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("RsltGi.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_vld_dt_fr = p.beansFactory.createTableColumn("RsltGi.vld_dt_fr", MCColumnType.DATE);
		p.columnRsltGi_vld_dt_to = p.beansFactory.createTableColumn("RsltGi.vld_dt_to", MCColumnType.DATE);
		p.columnRsltGi_stop_dt = p.beansFactory.createTableColumn("RsltGi.stop_dt", MCColumnType.DATE);
		p.columnRsltGi_rel_dt = p.beansFactory.createTableColumn("RsltGi.rel_dt", MCColumnType.DATE);
		p.columnRsltGi_alloc_margin_days = p.beansFactory.createTableColumn("RsltGi.alloc_margin_days", MCColumnType.NUMBER);
		p.columnRsltGi_loc_sppl_cd = p.beansFactory.createTableColumn("RsltGi.loc_sppl_cd", MCColumnType.TEXT);
		p.columnRsltGi_loc_sppl_nm = p.beansFactory.createTableColumn("RsltGi.loc_sppl_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_typ = p.beansFactory.createTableColumn("RsltGi.io_schd_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_sts_typ = p.beansFactory.createTableColumn("RsltGi.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_no = p.beansFactory.createTableColumn("RsltGi.io_schd_no", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_seq = p.beansFactory.createTableColumn("RsltGi.io_schd_seq", MCColumnType.NUMBER);
		p.columnRsltGi_trd_cd = p.beansFactory.createTableColumn("RsltGi.trd_cd", MCColumnType.TEXT);
		p.columnRsltGi_trd_nm = p.beansFactory.createTableColumn("RsltGi.trd_nm", MCColumnType.TEXT);
		p.columnRsltGi_trd_ptn_typ = p.beansFactory.createTableColumn("RsltGi.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRsltGi_trd_ptn_typ_nm = p.beansFactory.createTableColumn("RsltGi.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_trn_typ = p.beansFactory.createTableColumn("RsltGi.trn_typ", MCColumnType.TEXT);
		p.columnRsltGi_trn_typ_nm = p.beansFactory.createTableColumn("RsltGi.trn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_act_typ = p.beansFactory.createTableColumn("RsltGi.io_act_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_act_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_act_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0090_GR = p.beansFactory.createButton("Btn.open_MSBEP0090_GR", "open");
		p.Btn_open_MSBEP0090_GI = p.beansFactory.createButton("Btn.open_MSBEP0090_GI", "open");
		p.Btn_open_MSBEP0080_GR = p.beansFactory.createButton("Btn.open_MSBEP0080_GR", "open");
		p.Btn_open_MSBEP0080_GI = p.beansFactory.createButton("Btn.open_MSBEP0080_GI", "open");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_AllocSrch p) {
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
	protected static void jbInitOpeTyp(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.OpeTypPanel.setBorder(p.OpeTypTitledBorder);
		p.add(p.OpeTypPanel);
		p.OpeTypPanel.setNextBeans(p.TopPanel);
		p.OpeTypPanel.setValueCheck(false);
		p.OpeTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OpeTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_AllocSrch p) {
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.Tab1Panel, null);
		p.FoldPanel.setLastBeans(p.Tab1Panel);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setBorder(p.Tab1TitledBorder);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.GrStsPanel, null);
		p.Tab1Panel.setLastBeans(p.GrStsPanel);
		p.GrStsPanel.setNextBeans(p.GiStsPanel);
		p.Tab1Panel.add(p.GiStsPanel, null);
		p.GiStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [GrSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGrSts(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.GrStsPanel.setBorder(p.GrStsTitledBorder);
		p.GrStsPanel.setValueCheck(false);
		p.GrStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.GrStsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [GiSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGiSts(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.GiStsPanel.setBorder(p.GiStsTitledBorder);
		p.GiStsPanel.setValueCheck(false);
		p.GiStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.GiStsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_ACCRUAL);
		p.Cnd_ope_ACCRUAL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_ACCRUAL);
		p.ScreenOpePanel.add(p.Cnd_ope_ACCRUAL);
		p.Cnd_ope_ACCRUAL.setNextBeans(p.Cnd_ope_ACCPT);
		p.Cnd_ope_ACCPT.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_ACCPT);
		p.ScreenOpePanel.add(p.Cnd_ope_ACCPT);
		p.Cnd_ope_ACCPT.setNextBeans(p.Cnd_ope_AVL);
		p.Cnd_ope_AVL.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_AVL);
		p.ScreenOpePanel.add(p.Cnd_ope_AVL);
		p.Cnd_ope_AVL.setNextBeans(p.Cnd_ope_ALLOC);
		p.Cnd_ope_ALLOC.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_ALLOC);
		p.ScreenOpePanel.add(p.Cnd_ope_ALLOC);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.ope_META);
		p.OpeTypPanel.setLastBeans(p.Cnd_tgt_Group);
		p.Cnd_tgt_Group.setFirstBeans(p.Cnd_tgt_LOC);
		p.Cnd_tgt_LOC.setActionCommand("1");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_LOC);
		p.OpeTypPanel.add(p.Cnd_tgt_LOC);
		p.Cnd_tgt_LOC.setNextBeans(p.Cnd_tgt_GRS);
		p.Cnd_tgt_GRS.setActionCommand("2");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_GRS);
		p.OpeTypPanel.add(p.Cnd_tgt_GRS);
		p.Cnd_tgt_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.tgt_META);
		p.GrStsPanel.add(p.Cnd_gr_prcd);
		p.GrStsPanel.setLastBeans(p.Cnd_gr_prcd);
		p.Cnd_gr_prcd.setNextBeans(p.Cnd_gr_sts_opn_grp);
		p.Cnd_gr_prcd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_prcd_META);
		p.GrStsPanel.add(p.Cnd_gr_sts_opn_grp);
		p.Cnd_gr_sts_opn_grp.setNextBeans(p.Cnd_gr_sts_ordsav_grp);
		p.Cnd_gr_sts_opn_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_sts_opn_grp_META);
		p.GrStsPanel.add(p.Cnd_gr_sts_ordsav_grp);
		p.Cnd_gr_sts_ordsav_grp.setNextBeans(p.Cnd_gr_sts_fix_grp);
		p.Cnd_gr_sts_ordsav_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_sts_ordsav_grp_META);
		p.GrStsPanel.add(p.Cnd_gr_sts_fix_grp);
		p.Cnd_gr_sts_fix_grp.setNextBeans(p.Cnd_gr_sts_schd_grp);
		p.Cnd_gr_sts_fix_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_sts_fix_grp_META);
		p.GrStsPanel.add(p.Cnd_gr_sts_schd_grp);
		p.Cnd_gr_sts_schd_grp.setNextBeans(p.Cnd_gr_sts_ord_grp);
		p.Cnd_gr_sts_schd_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_sts_schd_grp_META);
		p.GrStsPanel.add(p.Cnd_gr_sts_ord_grp);
		p.Cnd_gr_sts_ord_grp.setNextBeans(p.Cnd_gr_act);
		p.Cnd_gr_sts_ord_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_sts_ord_grp_META);
		p.GrStsPanel.add(p.Cnd_gr_act);
		p.Cnd_gr_act.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gr_act_META);
		p.GiStsPanel.add(p.Cnd_gi_prcd);
		p.GiStsPanel.setLastBeans(p.Cnd_gi_prcd);
		p.Cnd_gi_prcd.setNextBeans(p.Cnd_gi_sts_opn_grp);
		p.Cnd_gi_prcd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_prcd_META);
		p.GiStsPanel.add(p.Cnd_gi_sts_opn_grp);
		p.Cnd_gi_sts_opn_grp.setNextBeans(p.Cnd_gi_sts_ordsav_grp);
		p.Cnd_gi_sts_opn_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_sts_opn_grp_META);
		p.GiStsPanel.add(p.Cnd_gi_sts_ordsav_grp);
		p.Cnd_gi_sts_ordsav_grp.setNextBeans(p.Cnd_gi_sts_fix_grp);
		p.Cnd_gi_sts_ordsav_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_sts_ordsav_grp_META);
		p.GiStsPanel.add(p.Cnd_gi_sts_fix_grp);
		p.Cnd_gi_sts_fix_grp.setNextBeans(p.Cnd_gi_sts_schd_grp);
		p.Cnd_gi_sts_fix_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_sts_fix_grp_META);
		p.GiStsPanel.add(p.Cnd_gi_sts_schd_grp);
		p.Cnd_gi_sts_schd_grp.setNextBeans(p.Cnd_gi_sts_ord_grp);
		p.Cnd_gi_sts_schd_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_sts_schd_grp_META);
		p.GiStsPanel.add(p.Cnd_gi_sts_ord_grp);
		p.Cnd_gi_sts_ord_grp.setNextBeans(p.Cnd_gi_act);
		p.Cnd_gi_sts_ord_grp.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_sts_ord_grp_META);
		p.GiStsPanel.add(p.Cnd_gi_act);
		p.Cnd_gi_act.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gi_act_META);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_avl_schd_dt);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_avl_schd_dt_Label);
		p.CndPanel.add(p.Cnd_avl_schd_dt);
		p.Cnd_avl_schd_dt.setNextBeans(p.Cnd_except_invld_lot_flg);
		p.Cnd_avl_schd_dt.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.avl_schd_dt_META);
		p.Cnd_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_except_invld_lot_flg);
		p.Cnd_except_invld_lot_flg.setNextBeans(p.Cnd_except_alloc_wait_flg);
		p.Cnd_except_invld_lot_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.except_invld_lot_flg_META);
		p.CndPanel.add(p.Cnd_except_alloc_wait_flg);
		p.Cnd_except_alloc_wait_flg.setNextBeans(p.Cnd_alloc_gi_flg);
		p.Cnd_except_alloc_wait_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.except_alloc_wait_flg_META);
		p.CndPanel.add(p.Cnd_alloc_gi_flg);
		p.Cnd_alloc_gi_flg.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_alloc_gi_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.alloc_gi_flg_META);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.lg_grp_nm_META);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.alloc_grp_nm_META);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.loc_grp_nm_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.quality_typ_nm_META);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_stk_id_typ);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.gd_nm_META);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.CndPanel.add(p.Cnd_stk_id_typ_Label);
		p.CndPanel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.stk_id_typ_META);
		p.CndPanel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_pack_unit_cd);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.stk_id_typ_nm_META);
		p.Cnd_pack_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pack_unit_cd, true);
		p.Cnd_pack_unit_cd.setLinkBeans(p.Cnd_pack_unit_nm);
		p.CndPanel.add(p.Cnd_pack_unit_cd_Label);
		p.CndPanel.add(p.Cnd_pack_unit_cd);
		p.Cnd_pack_unit_cd.setNextBeans(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.pack_unit_cd_META);
		p.CndPanel.add(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_pack_unit_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.pack_unit_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0040.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RsltPanel.add(p.HdrTabPanel, null);
		p.RsltPanel.setLastBeans(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.RsltGrPanel);
		p.RsltPanel.add(p.RsltGrPanel, null);
		p.RsltGrPanel.setNextBeans(p.RsltGiPanel);
		p.RsltPanel.add(p.RsltGiPanel, null);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrQtyPanel, "HdrTab.HdrTab1");
		p.HdrTabTab.setLastBeans(p.HdrQtyPanel);
		p.HdrQtyPanel.setNextBeans(p.HdrContFctrPanel);
		p.HdrTabTab.add(p.HdrContFctrPanel, "HdrTab.HdrTab2");
	}

	/**
	 * [HdrQty]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrQty(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrQtyPanel.setNextBeans(p.HdrContFctrPanel);
		p.HdrQtyPanel.setValueCheck(false);
		// ブロックの項目の初期化
		p.HdrQtyPanel.add(p.HdrQty_stk_base_qty_p_PPanel);
		p.HdrQtyPanel.setLastBeans(p.HdrQty_stk_base_qty_p_PPanel);
		p.HdrQty_stk_base_qty_p_PPanel.setNextBeans(p.HdrQty_stk_base_qty2_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_stk_base_qty2_p_PPanel);
		p.HdrQty_stk_base_qty2_p_PPanel.setNextBeans(p.HdrQty_stk_base_qty3_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_stk_base_qty3_p_PPanel);
		p.HdrQty_stk_base_qty3_p_PPanel.setNextBeans(p.HdrQty_stk_base_qty4_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_stk_base_qty4_p_PPanel);
		p.HdrQty_stk_base_qty4_p_PPanel.setNextBeans(p.HdrQty_gr_base_qty_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gr_base_qty_p_PPanel);
		p.HdrQty_gr_base_qty_p_PPanel.setNextBeans(p.HdrQty_gr_base_qty2_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gr_base_qty2_p_PPanel);
		p.HdrQty_gr_base_qty2_p_PPanel.setNextBeans(p.HdrQty_gr_base_qty3_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gr_base_qty3_p_PPanel);
		p.HdrQty_gr_base_qty3_p_PPanel.setNextBeans(p.HdrQty_gr_base_qty4_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gr_base_qty4_p_PPanel);
		p.HdrQty_gr_base_qty4_p_PPanel.setNextBeans(p.HdrQty_base_unit_dec_place);
		p.HdrQtyPanel.add(p.HdrQty_base_unit_dec_place);
		p.HdrQty_base_unit_dec_place.setNextBeans(p.HdrQty_gi_base_qty_p_PPanel);
		p.HdrQty_base_unit_dec_place.setRow(p.getHdrQtyR(), mcframe.clientMSBE.MSBEP0040.HdrQtyR.base_unit_dec_place_META);
		p.HdrQtyPanel.add(p.HdrQty_gi_base_qty_p_PPanel);
		p.HdrQty_gi_base_qty_p_PPanel.setNextBeans(p.HdrQty_gi_base_qty2_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gi_base_qty2_p_PPanel);
		p.HdrQty_gi_base_qty2_p_PPanel.setNextBeans(p.HdrQty_gi_base_qty3_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gi_base_qty3_p_PPanel);
		p.HdrQty_gi_base_qty3_p_PPanel.setNextBeans(p.HdrQty_gi_base_qty4_p_PPanel);
		p.HdrQtyPanel.add(p.HdrQty_gi_base_qty4_p_PPanel);
		p.HdrQty_gi_base_qty4_p_PPanel.setNextBeans(p.HdrQty_base_unit_cd);
		p.HdrQtyPanel.add(p.HdrQty_base_unit_cd_Label);
		p.HdrQtyPanel.add(p.HdrQty_base_unit_cd);
		p.HdrQty_base_unit_cd.setNextBeans(p.HdrQty_base_unit_nm);
		p.HdrQty_base_unit_cd.setRow(p.getHdrQtyR(), mcframe.clientMSBE.MSBEP0040.HdrQtyR.base_unit_cd_META);
		p.HdrQtyPanel.add(p.HdrQty_base_unit_nm);
		p.HdrQty_base_unit_nm.setRow(p.getHdrQtyR(), mcframe.clientMSBE.MSBEP0040.HdrQtyR.base_unit_nm_META);
	}

	/**
	 * [HdrContFctr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrContFctr(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.HdrContFctrPanel.setValueCheck(false);
		// ブロックの項目の初期化
		p.HdrContFctrPanel.add(p.HdrContFctr_stk_cont_qty_p_PPanel);
		p.HdrContFctrPanel.setLastBeans(p.HdrContFctr_stk_cont_qty_p_PPanel);
		p.HdrContFctr_stk_cont_qty_p_PPanel.setNextBeans(p.HdrContFctr_stk_cont_qty2_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_stk_cont_qty2_p_PPanel);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.setNextBeans(p.HdrContFctr_stk_cont_qty3_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_stk_cont_qty3_p_PPanel);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.setNextBeans(p.HdrContFctr_stk_cont_qty4_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_stk_cont_qty4_p_PPanel);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.setNextBeans(p.HdrContFctr_gr_cont_qty_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gr_cont_qty_p_PPanel);
		p.HdrContFctr_gr_cont_qty_p_PPanel.setNextBeans(p.HdrContFctr_gr_cont_qty2_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gr_cont_qty2_p_PPanel);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.setNextBeans(p.HdrContFctr_gr_cont_qty3_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gr_cont_qty3_p_PPanel);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.setNextBeans(p.HdrContFctr_gr_cont_qty4_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gr_cont_qty4_p_PPanel);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.setNextBeans(p.HdrContFctr_cont_fctr_flg);
		p.HdrContFctrPanel.add(p.HdrContFctr_cont_fctr_flg);
		p.HdrContFctr_cont_fctr_flg.setNextBeans(p.HdrContFctr_std_cont_fctr_p_PPanel);
		p.HdrContFctr_cont_fctr_flg.setRow(p.getHdrContFctrR(), mcframe.clientMSBE.MSBEP0040.HdrContFctrR.cont_fctr_flg_META);
		p.HdrContFctrPanel.add(p.HdrContFctr_std_cont_fctr_p_PPanel);
		p.HdrContFctr_std_cont_fctr_p_PPanel.setNextBeans(p.HdrContFctr_act_cont_fctr_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_act_cont_fctr_p_PPanel);
		p.HdrContFctr_act_cont_fctr_p_PPanel.setNextBeans(p.HdrContFctr_cont_fctr_dec_place);
		p.HdrContFctrPanel.add(p.HdrContFctr_cont_fctr_dec_place);
		p.HdrContFctr_cont_fctr_dec_place.setNextBeans(p.HdrContFctr_cont_fctr_rnd_typ);
		p.HdrContFctr_cont_fctr_dec_place.setRow(p.getHdrContFctrR(), mcframe.clientMSBE.MSBEP0040.HdrContFctrR.cont_fctr_dec_place_META);
		p.HdrContFctrPanel.add(p.HdrContFctr_cont_fctr_rnd_typ);
		p.HdrContFctr_cont_fctr_rnd_typ.setNextBeans(p.HdrContFctr_gi_cont_qty_p_PPanel);
		p.HdrContFctr_cont_fctr_rnd_typ.setRow(p.getHdrContFctrR(), mcframe.clientMSBE.MSBEP0040.HdrContFctrR.cont_fctr_rnd_typ_META);
		p.HdrContFctrPanel.add(p.HdrContFctr_gi_cont_qty_p_PPanel);
		p.HdrContFctr_gi_cont_qty_p_PPanel.setNextBeans(p.HdrContFctr_gi_cont_qty2_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gi_cont_qty2_p_PPanel);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.setNextBeans(p.HdrContFctr_gi_cont_qty3_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gi_cont_qty3_p_PPanel);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.setNextBeans(p.HdrContFctr_gi_cont_qty4_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_gi_cont_qty4_p_PPanel);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.setNextBeans(p.HdrContFctr_cont_fctr_p_PPanel);
		p.HdrContFctrPanel.add(p.HdrContFctr_cont_fctr_p_PPanel);
	}

	/**
	 * [RsltGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltGr(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.RsltGrPanel.setBorder(p.RsltGrTitledBorder);
		p.RsltGrPanel.add(p.RsltGrScrollPane);
		p.RsltGrPanel.setLastBeans(p.RsltGrTable);
		p.RsltGrScrollPane.setViewportView(p.RsltGrTable);
		p.RsltGrTable.setList(p.getRsltGrL());
		p.RsltGrTable.setStatusColumnVisible(false);
		p.RsltGrPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltGi(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.RsltGiPanel.setBorder(p.RsltGiTitledBorder);
		p.RsltGiPanel.add(p.RsltGiScrollPane);
		p.RsltGiPanel.setLastBeans(p.RsltGiTable);
		p.RsltGiScrollPane.setViewportView(p.RsltGiTable);
		p.RsltGiTable.setList(p.getRsltGiL());
		p.RsltGiTable.setStatusColumnVisible(false);
		p.RsltGiPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_AllocSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0090_GR.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0090_GR);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0090_GR);
		p.Btn_open_MSBEP0090_GR.setNextBeans(p.Btn_open_MSBEP0090_GI);
		p.Btn_open_MSBEP0090_GI.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0090_GI);
		p.Btn_open_MSBEP0090_GI.setNextBeans(p.Btn_open_MSBEP0080_GR);
		p.Btn_open_MSBEP0080_GR.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBEP0080_GR);
		p.Btn_open_MSBEP0080_GR.setNextBeans(p.Btn_open_MSBEP0080_GI);
		p.Btn_open_MSBEP0080_GI.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBEP0080_GI);
		p.Btn_open_MSBEP0080_GI.setNextBeans(p.Btn_sync_p_PPanel);
		p.BtnPanel.add(p.Btn_sync_p_PPanel);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_AllocSrch p) {
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
		MSBEP_AllocSrch_MC.mcInitScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitOpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitTop((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitFold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitTab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitGrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitGiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitCnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitCtrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitRslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitHdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitHdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitHdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitRsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitRsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitBtn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.mcInitEastBtn((MSBEP_AllocSrch)this);

		// [ACCRUAL]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitACCRUAL_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCRUAL_EastBtn((MSBEP_AllocSrch)this);

		// [ACCPT]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitACCPT_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitACCPT_EastBtn((MSBEP_AllocSrch)this);

		// [AVL]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitAVL_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitAVL_EastBtn((MSBEP_AllocSrch)this);

		// [LOC_ALLOC]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitLOC__ALLOC_EastBtn((MSBEP_AllocSrch)this);

		// [GRS_ALLOC]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitGRS__ALLOC_EastBtn((MSBEP_AllocSrch)this);

		// [DTL]ステータスのモードの設定
		MSBEP_AllocSrch_MC.statusInitDTL_ScreenOpe((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_OpeTyp((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Top((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Fold((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Tab1((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_GrSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_GiSts((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Cnd((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Ctrl((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Rslt((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_HdrTab((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_HdrQty((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_HdrContFctr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_RsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_RsltGi((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Lno((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_Btn((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.statusInitDTL_EastBtn((MSBEP_AllocSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_AllocSrch p) {
	}

	/**
	 *  [OpeTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOpeTyp(MSBEP_AllocSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_AllocSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_AllocSrch p) {
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_AllocSrch p) {
	}

	/**
	 *  [GrSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGrSts(MSBEP_AllocSrch p) {
	}

	/**
	 *  [GiSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGiSts(MSBEP_AllocSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_AllocSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_ACCRUAL.addAllListener(p);
		p.Cnd_ope_ACCPT.addAllListener(p);
		p.Cnd_ope_AVL.addAllListener(p);
		p.Cnd_ope_ALLOC.addAllListener(p);
		p.Cnd_tgt_Group.addAllListener(p);
		p.Cnd_tgt_LOC.addAllListener(p);
		p.Cnd_tgt_GRS.addAllListener(p);
		p.Cnd_gr_prcd.addAllListener(p);
		p.Cnd_gr_sts_opn_grp.addAllListener(p);
		p.Cnd_gr_sts_ordsav_grp.addAllListener(p);
		p.Cnd_gr_sts_fix_grp.addAllListener(p);
		p.Cnd_gr_sts_schd_grp.addAllListener(p);
		p.Cnd_gr_sts_ord_grp.addAllListener(p);
		p.Cnd_gr_act.addAllListener(p);
		p.Cnd_gi_prcd.addAllListener(p);
		p.Cnd_gi_sts_opn_grp.addAllListener(p);
		p.Cnd_gi_sts_ordsav_grp.addAllListener(p);
		p.Cnd_gi_sts_fix_grp.addAllListener(p);
		p.Cnd_gi_sts_schd_grp.addAllListener(p);
		p.Cnd_gi_sts_ord_grp.addAllListener(p);
		p.Cnd_gi_act.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_avl_schd_dt.setListListener(p);
		p.Cnd_avl_schd_dt.addAllListener(p);
		p.Cnd_except_invld_lot_flg.addAllListener(p);
		p.Cnd_except_alloc_wait_flg.addAllListener(p);
		p.Cnd_alloc_gi_flg.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_pack_unit_cd.setListListener(p);
		p.Cnd_pack_unit_cd.addAllListener(p);
		p.Cnd_pack_unit_nm.setListListener(p);
		p.Cnd_pack_unit_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_AllocSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_AllocSrch p) {
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_AllocSrch p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [HdrQty]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrQty(MSBEP_AllocSrch p) {
		p.HdrQty_base_unit_dec_place.setListListener(p);
		p.HdrQty_base_unit_dec_place.addAllListener(p);
		p.HdrQty_base_unit_cd.setListListener(p);
		p.HdrQty_base_unit_cd.addAllListener(p);
		p.HdrQty_base_unit_nm.setListListener(p);
		p.HdrQty_base_unit_nm.addAllListener(p);
	}

	/**
	 *  [HdrContFctr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrContFctr(MSBEP_AllocSrch p) {
		p.HdrContFctr_cont_fctr_flg.addAllListener(p);
		p.HdrContFctr_cont_fctr_dec_place.setListListener(p);
		p.HdrContFctr_cont_fctr_dec_place.addAllListener(p);
		p.HdrContFctr_cont_fctr_rnd_typ.setListListener(p);
		p.HdrContFctr_cont_fctr_rnd_typ.addAllListener(p);
	}

	/**
	 *  [RsltGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltGr(MSBEP_AllocSrch p) {
		p.RsltGrTable.addAllListener(p);
		p.columnRsltGr_check.addAllListener(p);
		p.columnRsltGr_schd_stk_typ.addAllListener(p);
		p.columnRsltGr_schd_stk_typ.setListListener(p);
		p.columnRsltGr_schd_stk_typ_nm.addAllListener(p);
		p.columnRsltGr_schd_stk_typ_nm.setListListener(p);
		p.columnRsltGr_dt.addAllListener(p);
		p.columnRsltGr_dt.setListListener(p);
		p.columnRsltGr_wg_cd.addAllListener(p);
		p.columnRsltGr_wg_cd.setListListener(p);
		p.columnRsltGr_wg_nm.addAllListener(p);
		p.columnRsltGr_wg_nm.setListListener(p);
		p.columnRsltGr_dpt_cd.addAllListener(p);
		p.columnRsltGr_dpt_cd.setListListener(p);
		p.columnRsltGr_dpt_nm.addAllListener(p);
		p.columnRsltGr_dpt_nm.setListListener(p);
		p.columnRsltGr_lot_no.addAllListener(p);
		p.columnRsltGr_lot_no.setListListener(p);
		p.columnRsltGr_sublot_no.addAllListener(p);
		p.columnRsltGr_sublot_no.setListListener(p);
		p.columnRsltGr_loc_cd.addAllListener(p);
		p.columnRsltGr_loc_cd.setListListener(p);
		p.columnRsltGr_loc_nm.addAllListener(p);
		p.columnRsltGr_loc_nm.setListListener(p);
		p.columnRsltGr_site_cd.addAllListener(p);
		p.columnRsltGr_site_cd.setListListener(p);
		p.columnRsltGr_site_nm.addAllListener(p);
		p.columnRsltGr_site_nm.setListListener(p);
		p.columnRsltGr_lg_grp_cd.addAllListener(p);
		p.columnRsltGr_lg_grp_cd.setListListener(p);
		p.columnRsltGr_lg_grp_nm.addAllListener(p);
		p.columnRsltGr_lg_grp_nm.setListListener(p);
		p.columnRsltGr_alloc_grp_cd.addAllListener(p);
		p.columnRsltGr_alloc_grp_cd.setListListener(p);
		p.columnRsltGr_alloc_grp_nm.addAllListener(p);
		p.columnRsltGr_alloc_grp_nm.setListListener(p);
		p.columnRsltGr_loc_grp_cd.addAllListener(p);
		p.columnRsltGr_loc_grp_cd.setListListener(p);
		p.columnRsltGr_loc_grp_nm.addAllListener(p);
		p.columnRsltGr_loc_grp_nm.setListListener(p);
		p.columnRsltGr_gd_cd.addAllListener(p);
		p.columnRsltGr_gd_cd.setListListener(p);
		p.columnRsltGr_gd_nm.addAllListener(p);
		p.columnRsltGr_gd_nm.setListListener(p);
		p.columnRsltGr_quality_typ.addAllListener(p);
		p.columnRsltGr_quality_typ.setListListener(p);
		p.columnRsltGr_quality_typ_nm.addAllListener(p);
		p.columnRsltGr_quality_typ_nm.setListListener(p);
		p.columnRsltGr_stk_insp_typ.addAllListener(p);
		p.columnRsltGr_stk_insp_typ.setListListener(p);
		p.columnRsltGr_stk_insp_typ_nm.addAllListener(p);
		p.columnRsltGr_stk_insp_typ_nm.setListListener(p);
		p.columnRsltGr_in_xfr_typ.addAllListener(p);
		p.columnRsltGr_in_xfr_typ.setListListener(p);
		p.columnRsltGr_in_xfr_typ_nm.addAllListener(p);
		p.columnRsltGr_in_xfr_typ_nm.setListListener(p);
		p.columnRsltGr_asst_typ.addAllListener(p);
		p.columnRsltGr_asst_typ.setListListener(p);
		p.columnRsltGr_asst_typ_nm.addAllListener(p);
		p.columnRsltGr_asst_typ_nm.setListListener(p);
		p.columnRsltGr_stk_id_typ.addAllListener(p);
		p.columnRsltGr_stk_id_typ.setListListener(p);
		p.columnRsltGr_stk_id_typ_nm.addAllListener(p);
		p.columnRsltGr_stk_id_typ_nm.setListListener(p);
		p.columnRsltGr_stk_bp_cd.addAllListener(p);
		p.columnRsltGr_stk_bp_cd.setListListener(p);
		p.columnRsltGr_stk_bp_nm.addAllListener(p);
		p.columnRsltGr_stk_bp_nm.setListListener(p);
		p.columnRsltGr_stk_arrv_bp_cd.addAllListener(p);
		p.columnRsltGr_stk_arrv_bp_cd.setListListener(p);
		p.columnRsltGr_stk_arrv_bp_nm.addAllListener(p);
		p.columnRsltGr_stk_arrv_bp_nm.setListListener(p);
		p.columnRsltGr_pack_unit_cd.addAllListener(p);
		p.columnRsltGr_pack_unit_cd.setListListener(p);
		p.columnRsltGr_pack_unit_nm.addAllListener(p);
		p.columnRsltGr_pack_unit_nm.setListListener(p);
		p.columnRsltGr_pack_unit_dec_place.addAllListener(p);
		p.columnRsltGr_pack_unit_dec_place.setListListener(p);
		p.columnRsltGr_base_unit_cd.addAllListener(p);
		p.columnRsltGr_base_unit_cd.setListListener(p);
		p.columnRsltGr_base_unit_nm.addAllListener(p);
		p.columnRsltGr_base_unit_nm.setListListener(p);
		p.columnRsltGr_base_unit_dec_place.addAllListener(p);
		p.columnRsltGr_base_unit_dec_place.setListListener(p);
		p.columnRsltGr_alloc_unit_cd.addAllListener(p);
		p.columnRsltGr_alloc_unit_cd.setListListener(p);
		p.columnRsltGr_alloc_unit_nm.addAllListener(p);
		p.columnRsltGr_alloc_unit_nm.setListListener(p);
		p.columnRsltGr_alloc_unit_dec_place.addAllListener(p);
		p.columnRsltGr_alloc_unit_dec_place.setListListener(p);
		p.columnRsltGr_overdue_alloc_flg.addAllListener(p);
		p.columnRsltGr_another_loc_alloc_flg.addAllListener(p);
		p.columnRsltGr_abnormal_alloc_flg.addAllListener(p);
		p.columnRsltGr_cont_fctr_flg.addAllListener(p);
		p.columnRsltGr_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRsltGr_cont_fctr_rnd_typ.setListListener(p);
		p.columnRsltGr_cont_fctr_dec_place.addAllListener(p);
		p.columnRsltGr_cont_fctr_dec_place.setListListener(p);
		p.columnRsltGr_lot_seq.addAllListener(p);
		p.columnRsltGr_lot_seq.setListListener(p);
		p.columnRsltGr_first_gr_dt.addAllListener(p);
		p.columnRsltGr_first_gr_dt.setListListener(p);
		p.columnRsltGr_vld_dt.addAllListener(p);
		p.columnRsltGr_vld_dt.setListListener(p);
		p.columnRsltGr_lmt_dt.addAllListener(p);
		p.columnRsltGr_lmt_dt.setListListener(p);
		p.columnRsltGr_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRsltGr_plnt_aprv_sts_typ.setListListener(p);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRsltGr_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRsltGr_mrkt_judg_sts_typ.setListListener(p);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRsltGr_vld_dt_fr.addAllListener(p);
		p.columnRsltGr_vld_dt_fr.setListListener(p);
		p.columnRsltGr_vld_dt_to.addAllListener(p);
		p.columnRsltGr_vld_dt_to.setListListener(p);
		p.columnRsltGr_stop_dt.addAllListener(p);
		p.columnRsltGr_stop_dt.setListListener(p);
		p.columnRsltGr_rel_dt.addAllListener(p);
		p.columnRsltGr_rel_dt.setListListener(p);
		p.columnRsltGr_alloc_margin_days.addAllListener(p);
		p.columnRsltGr_alloc_margin_days.setListListener(p);
		p.columnRsltGr_loc_sppl_cd.addAllListener(p);
		p.columnRsltGr_loc_sppl_cd.setListListener(p);
		p.columnRsltGr_loc_sppl_nm.addAllListener(p);
		p.columnRsltGr_loc_sppl_nm.setListListener(p);
		p.columnRsltGr_io_schd_typ.addAllListener(p);
		p.columnRsltGr_io_schd_typ.setListListener(p);
		p.columnRsltGr_io_schd_typ_nm.addAllListener(p);
		p.columnRsltGr_io_schd_typ_nm.setListListener(p);
		p.columnRsltGr_io_schd_sts_typ.addAllListener(p);
		p.columnRsltGr_io_schd_sts_typ.setListListener(p);
		p.columnRsltGr_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRsltGr_io_schd_sts_typ_nm.setListListener(p);
		p.columnRsltGr_io_schd_no.addAllListener(p);
		p.columnRsltGr_io_schd_no.setListListener(p);
		p.columnRsltGr_io_schd_seq.addAllListener(p);
		p.columnRsltGr_io_schd_seq.setListListener(p);
		p.columnRsltGr_trd_cd.addAllListener(p);
		p.columnRsltGr_trd_cd.setListListener(p);
		p.columnRsltGr_trd_nm.addAllListener(p);
		p.columnRsltGr_trd_nm.setListListener(p);
		p.columnRsltGr_trd_ptn_typ.addAllListener(p);
		p.columnRsltGr_trd_ptn_typ.setListListener(p);
		p.columnRsltGr_trd_ptn_typ_nm.addAllListener(p);
		p.columnRsltGr_trd_ptn_typ_nm.setListListener(p);
		p.columnRsltGr_trn_typ.addAllListener(p);
		p.columnRsltGr_trn_typ.setListListener(p);
		p.columnRsltGr_trn_typ_nm.addAllListener(p);
		p.columnRsltGr_trn_typ_nm.setListListener(p);
		p.columnRsltGr_io_act_typ.addAllListener(p);
		p.columnRsltGr_io_act_typ.setListListener(p);
		p.columnRsltGr_io_act_typ_nm.addAllListener(p);
		p.columnRsltGr_io_act_typ_nm.setListListener(p);
	}

	/**
	 *  [RsltGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltGi(MSBEP_AllocSrch p) {
		p.RsltGiTable.addAllListener(p);
		p.columnRsltGi_check.addAllListener(p);
		p.columnRsltGi_schd_stk_typ.addAllListener(p);
		p.columnRsltGi_schd_stk_typ.setListListener(p);
		p.columnRsltGi_schd_stk_typ_nm.addAllListener(p);
		p.columnRsltGi_schd_stk_typ_nm.setListListener(p);
		p.columnRsltGi_dt.addAllListener(p);
		p.columnRsltGi_dt.setListListener(p);
		p.columnRsltGi_wg_cd.addAllListener(p);
		p.columnRsltGi_wg_cd.setListListener(p);
		p.columnRsltGi_wg_nm.addAllListener(p);
		p.columnRsltGi_wg_nm.setListListener(p);
		p.columnRsltGi_dpt_cd.addAllListener(p);
		p.columnRsltGi_dpt_cd.setListListener(p);
		p.columnRsltGi_dpt_nm.addAllListener(p);
		p.columnRsltGi_dpt_nm.setListListener(p);
		p.columnRsltGi_lot_no.addAllListener(p);
		p.columnRsltGi_lot_no.setListListener(p);
		p.columnRsltGi_sublot_no.addAllListener(p);
		p.columnRsltGi_sublot_no.setListListener(p);
		p.columnRsltGi_loc_cd.addAllListener(p);
		p.columnRsltGi_loc_cd.setListListener(p);
		p.columnRsltGi_loc_nm.addAllListener(p);
		p.columnRsltGi_loc_nm.setListListener(p);
		p.columnRsltGi_site_cd.addAllListener(p);
		p.columnRsltGi_site_cd.setListListener(p);
		p.columnRsltGi_site_nm.addAllListener(p);
		p.columnRsltGi_site_nm.setListListener(p);
		p.columnRsltGi_lg_grp_cd.addAllListener(p);
		p.columnRsltGi_lg_grp_cd.setListListener(p);
		p.columnRsltGi_lg_grp_nm.addAllListener(p);
		p.columnRsltGi_lg_grp_nm.setListListener(p);
		p.columnRsltGi_alloc_grp_cd.addAllListener(p);
		p.columnRsltGi_alloc_grp_cd.setListListener(p);
		p.columnRsltGi_alloc_grp_nm.addAllListener(p);
		p.columnRsltGi_alloc_grp_nm.setListListener(p);
		p.columnRsltGi_loc_grp_cd.addAllListener(p);
		p.columnRsltGi_loc_grp_cd.setListListener(p);
		p.columnRsltGi_loc_grp_nm.addAllListener(p);
		p.columnRsltGi_loc_grp_nm.setListListener(p);
		p.columnRsltGi_gd_cd.addAllListener(p);
		p.columnRsltGi_gd_cd.setListListener(p);
		p.columnRsltGi_gd_nm.addAllListener(p);
		p.columnRsltGi_gd_nm.setListListener(p);
		p.columnRsltGi_quality_typ.addAllListener(p);
		p.columnRsltGi_quality_typ.setListListener(p);
		p.columnRsltGi_quality_typ_nm.addAllListener(p);
		p.columnRsltGi_quality_typ_nm.setListListener(p);
		p.columnRsltGi_stk_insp_typ.addAllListener(p);
		p.columnRsltGi_stk_insp_typ.setListListener(p);
		p.columnRsltGi_stk_insp_typ_nm.addAllListener(p);
		p.columnRsltGi_stk_insp_typ_nm.setListListener(p);
		p.columnRsltGi_in_xfr_typ.addAllListener(p);
		p.columnRsltGi_in_xfr_typ.setListListener(p);
		p.columnRsltGi_in_xfr_typ_nm.addAllListener(p);
		p.columnRsltGi_in_xfr_typ_nm.setListListener(p);
		p.columnRsltGi_asst_typ.addAllListener(p);
		p.columnRsltGi_asst_typ.setListListener(p);
		p.columnRsltGi_asst_typ_nm.addAllListener(p);
		p.columnRsltGi_asst_typ_nm.setListListener(p);
		p.columnRsltGi_stk_id_typ.addAllListener(p);
		p.columnRsltGi_stk_id_typ.setListListener(p);
		p.columnRsltGi_stk_id_typ_nm.addAllListener(p);
		p.columnRsltGi_stk_id_typ_nm.setListListener(p);
		p.columnRsltGi_stk_bp_cd.addAllListener(p);
		p.columnRsltGi_stk_bp_cd.setListListener(p);
		p.columnRsltGi_stk_bp_nm.addAllListener(p);
		p.columnRsltGi_stk_bp_nm.setListListener(p);
		p.columnRsltGi_stk_arrv_bp_cd.addAllListener(p);
		p.columnRsltGi_stk_arrv_bp_cd.setListListener(p);
		p.columnRsltGi_stk_arrv_bp_nm.addAllListener(p);
		p.columnRsltGi_stk_arrv_bp_nm.setListListener(p);
		p.columnRsltGi_pack_unit_cd.addAllListener(p);
		p.columnRsltGi_pack_unit_cd.setListListener(p);
		p.columnRsltGi_pack_unit_nm.addAllListener(p);
		p.columnRsltGi_pack_unit_nm.setListListener(p);
		p.columnRsltGi_pack_unit_dec_place.addAllListener(p);
		p.columnRsltGi_pack_unit_dec_place.setListListener(p);
		p.columnRsltGi_base_unit_cd.addAllListener(p);
		p.columnRsltGi_base_unit_cd.setListListener(p);
		p.columnRsltGi_base_unit_nm.addAllListener(p);
		p.columnRsltGi_base_unit_nm.setListListener(p);
		p.columnRsltGi_base_unit_dec_place.addAllListener(p);
		p.columnRsltGi_base_unit_dec_place.setListListener(p);
		p.columnRsltGi_alloc_unit_cd.addAllListener(p);
		p.columnRsltGi_alloc_unit_cd.setListListener(p);
		p.columnRsltGi_alloc_unit_nm.addAllListener(p);
		p.columnRsltGi_alloc_unit_nm.setListListener(p);
		p.columnRsltGi_alloc_unit_dec_place.addAllListener(p);
		p.columnRsltGi_alloc_unit_dec_place.setListListener(p);
		p.columnRsltGi_overdue_alloc_flg.addAllListener(p);
		p.columnRsltGi_another_loc_alloc_flg.addAllListener(p);
		p.columnRsltGi_abnormal_alloc_flg.addAllListener(p);
		p.columnRsltGi_cont_fctr_flg.addAllListener(p);
		p.columnRsltGi_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRsltGi_cont_fctr_rnd_typ.setListListener(p);
		p.columnRsltGi_cont_fctr_dec_place.addAllListener(p);
		p.columnRsltGi_cont_fctr_dec_place.setListListener(p);
		p.columnRsltGi_lot_seq.addAllListener(p);
		p.columnRsltGi_lot_seq.setListListener(p);
		p.columnRsltGi_first_gr_dt.addAllListener(p);
		p.columnRsltGi_first_gr_dt.setListListener(p);
		p.columnRsltGi_vld_dt.addAllListener(p);
		p.columnRsltGi_vld_dt.setListListener(p);
		p.columnRsltGi_lmt_dt.addAllListener(p);
		p.columnRsltGi_lmt_dt.setListListener(p);
		p.columnRsltGi_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRsltGi_plnt_aprv_sts_typ.setListListener(p);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRsltGi_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRsltGi_mrkt_judg_sts_typ.setListListener(p);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRsltGi_vld_dt_fr.addAllListener(p);
		p.columnRsltGi_vld_dt_fr.setListListener(p);
		p.columnRsltGi_vld_dt_to.addAllListener(p);
		p.columnRsltGi_vld_dt_to.setListListener(p);
		p.columnRsltGi_stop_dt.addAllListener(p);
		p.columnRsltGi_stop_dt.setListListener(p);
		p.columnRsltGi_rel_dt.addAllListener(p);
		p.columnRsltGi_rel_dt.setListListener(p);
		p.columnRsltGi_alloc_margin_days.addAllListener(p);
		p.columnRsltGi_alloc_margin_days.setListListener(p);
		p.columnRsltGi_loc_sppl_cd.addAllListener(p);
		p.columnRsltGi_loc_sppl_cd.setListListener(p);
		p.columnRsltGi_loc_sppl_nm.addAllListener(p);
		p.columnRsltGi_loc_sppl_nm.setListListener(p);
		p.columnRsltGi_io_schd_typ.addAllListener(p);
		p.columnRsltGi_io_schd_typ.setListListener(p);
		p.columnRsltGi_io_schd_typ_nm.addAllListener(p);
		p.columnRsltGi_io_schd_typ_nm.setListListener(p);
		p.columnRsltGi_io_schd_sts_typ.addAllListener(p);
		p.columnRsltGi_io_schd_sts_typ.setListListener(p);
		p.columnRsltGi_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRsltGi_io_schd_sts_typ_nm.setListListener(p);
		p.columnRsltGi_io_schd_no.addAllListener(p);
		p.columnRsltGi_io_schd_no.setListListener(p);
		p.columnRsltGi_io_schd_seq.addAllListener(p);
		p.columnRsltGi_io_schd_seq.setListListener(p);
		p.columnRsltGi_trd_cd.addAllListener(p);
		p.columnRsltGi_trd_cd.setListListener(p);
		p.columnRsltGi_trd_nm.addAllListener(p);
		p.columnRsltGi_trd_nm.setListListener(p);
		p.columnRsltGi_trd_ptn_typ.addAllListener(p);
		p.columnRsltGi_trd_ptn_typ.setListListener(p);
		p.columnRsltGi_trd_ptn_typ_nm.addAllListener(p);
		p.columnRsltGi_trd_ptn_typ_nm.setListListener(p);
		p.columnRsltGi_trn_typ.addAllListener(p);
		p.columnRsltGi_trn_typ.setListListener(p);
		p.columnRsltGi_trn_typ_nm.addAllListener(p);
		p.columnRsltGi_trn_typ_nm.setListListener(p);
		p.columnRsltGi_io_act_typ.addAllListener(p);
		p.columnRsltGi_io_act_typ.setListListener(p);
		p.columnRsltGi_io_act_typ_nm.addAllListener(p);
		p.columnRsltGi_io_act_typ_nm.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_AllocSrch p) {
		p.Btn_open_MSBEP0090_GR.addAllListener(p);
		p.Btn_open_MSBEP0090_GR.setAPMethodName("doBtn_open_MSBEP0090_GR");
		p.Btn_open_MSBEP0090_GI.addAllListener(p);
		p.Btn_open_MSBEP0090_GI.setAPMethodName("doBtn_open_MSBEP0090_GI");
		p.Btn_open_MSBEP0080_GR.addAllListener(p);
		p.Btn_open_MSBEP0080_GR.setAPMethodName("doBtn_open_MSBEP0080_GR");
		p.Btn_open_MSBEP0080_GI.addAllListener(p);
		p.Btn_open_MSBEP0080_GI.setAPMethodName("doBtn_open_MSBEP0080_GI");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_AllocSrch p) {
	}

	/**
	 * [ACCRUAL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_avl_schd_dt.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_except_invld_lot_flg.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_alloc_gi_flg.putMode(p, ACCRUAL, MCMode.REQUIRED);
		p.Cnd_lg_grp_cd.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(ACCRUAL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [ACCRUAL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);

	}

	/**
	 * [ACCRUAL]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [ACCRUAL]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_schd_stk_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGr_lot_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_sublot_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_gd_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(ACCRUAL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_pack_unit_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_base_unit_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGr_cont_fctr_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_first_gr_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_lmt_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_fr.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_to.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_stop_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_rel_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_margin_days.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_seq.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGr_trd_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);

	}

	/**
	 * [ACCRUAL]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_schd_stk_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGi_lot_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_sublot_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_gd_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(ACCRUAL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_pack_unit_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_base_unit_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(ACCRUAL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGi_cont_fctr_flg.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_first_gr_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_lmt_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_fr.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_to.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_stop_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_rel_dt.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_margin_days.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_cd.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_nm.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_seq.putMode(p, ACCRUAL, MCMode.INVISIBLE);
		p.columnRsltGi_trd_cd.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, ACCRUAL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, ACCRUAL, MCMode.READ_ONLY);

	}

	/**
	 * [ACCRUAL]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCRUAL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, ACCRUAL, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(ACCRUAL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [ACCRUAL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitACCRUAL_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_avl_schd_dt.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_except_invld_lot_flg.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_alloc_gi_flg.putMode(p, ACCPT, MCMode.REQUIRED);
		p.Cnd_lg_grp_cd.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, ACCPT, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(ACCPT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [ACCPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, ACCPT, MCMode.READ_ONLY);

	}

	/**
	 * [ACCPT]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [ACCPT]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_schd_stk_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGr_lot_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_sublot_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_loc_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_gd_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(ACCPT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_pack_unit_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_base_unit_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGr_cont_fctr_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_first_gr_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_lmt_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_fr.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_to.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_stop_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_rel_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_margin_days.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_seq.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGr_trd_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_trd_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);

	}

	/**
	 * [ACCPT]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_schd_stk_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGi_lot_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_sublot_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_loc_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_gd_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(ACCPT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_pack_unit_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_base_unit_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(ACCPT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGi_cont_fctr_flg.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_first_gr_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_lmt_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_fr.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_to.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_stop_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_rel_dt.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_margin_days.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_cd.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_nm.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_seq.putMode(p, ACCPT, MCMode.INVISIBLE);
		p.columnRsltGi_trd_cd.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_trd_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, ACCPT, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, ACCPT, MCMode.READ_ONLY);

	}

	/**
	 * [ACCPT]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [ACCPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, ACCPT, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, ACCPT, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, ACCPT, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, ACCPT, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(ACCPT, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [ACCPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitACCPT_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitAVL_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitAVL_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitAVL_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitAVL_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_avl_schd_dt.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_except_invld_lot_flg.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_alloc_gi_flg.putMode(p, AVL, MCMode.REQUIRED);
		p.Cnd_lg_grp_cd.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, AVL, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, AVL, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(AVL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [AVL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitAVL_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitAVL_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, AVL, MCMode.READ_ONLY);

	}

	/**
	 * [AVL]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitAVL_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [AVL]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitAVL_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_schd_stk_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGr_lot_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_sublot_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_gd_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(AVL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_pack_unit_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_base_unit_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGr_cont_fctr_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_first_gr_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_lmt_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_fr.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_to.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_stop_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_rel_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_margin_days.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_seq.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGr_trd_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);

	}

	/**
	 * [AVL]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitAVL_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_schd_stk_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGi_lot_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_sublot_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_gd_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(AVL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_pack_unit_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_base_unit_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(AVL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGi_cont_fctr_flg.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_first_gr_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_lmt_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_fr.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_to.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_stop_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_rel_dt.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_margin_days.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_cd.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_nm.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_seq.putMode(p, AVL, MCMode.INVISIBLE);
		p.columnRsltGi_trd_cd.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, AVL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, AVL, MCMode.READ_ONLY);

	}

	/**
	 * [AVL]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [AVL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitAVL_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, AVL, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, AVL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, AVL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, AVL, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(AVL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [AVL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitAVL_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_dt_to.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_avl_schd_dt.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_except_invld_lot_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_except_alloc_wait_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_gi_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [LOC_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);

	}

	/**
	 * [LOC_ALLOC]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [LOC_ALLOC]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.columnRsltGr_schd_stk_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRsltGr_lot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_sublot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_gd_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_quality_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_insp_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_asst_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_asst_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_id_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_pack_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_pack_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_base_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRsltGr_cont_fctr_flg.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_first_gr_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lmt_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt_fr.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt_to.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stop_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_rel_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_margin_days.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_sppl_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_sppl_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_seq.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_trd_cd.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_ptn_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trn_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trn_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_io_act_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_io_act_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [LOC_ALLOC]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.columnRsltGi_schd_stk_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRsltGi_lot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_sublot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_gd_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_quality_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_insp_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_asst_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_asst_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_id_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_pack_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_pack_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_base_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRsltGi_cont_fctr_flg.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_first_gr_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lmt_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt_fr.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt_to.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stop_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_rel_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_margin_days.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_sppl_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_sppl_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_seq.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_trd_cd.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_ptn_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trn_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trn_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_io_act_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_io_act_typ_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [LOC_ALLOC]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [LOC_ALLOC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_dt_to.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_avl_schd_dt.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_except_invld_lot_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_except_alloc_wait_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_gi_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [GRS_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);

	}

	/**
	 * [GRS_ALLOC]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [GRS_ALLOC]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.columnRsltGr_schd_stk_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRsltGr_lot_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_sublot_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_gd_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_quality_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_insp_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_asst_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_asst_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_id_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_pack_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_pack_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_base_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRsltGr_cont_fctr_flg.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_first_gr_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_lmt_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt_fr.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_vld_dt_to.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_stop_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_rel_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_margin_days.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_sppl_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_loc_sppl_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_seq.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGr_trd_cd.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_ptn_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trn_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_trn_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_io_act_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGr_io_act_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [GRS_ALLOC]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.columnRsltGi_schd_stk_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRsltGi_lot_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_sublot_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_gd_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_quality_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_insp_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_asst_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_asst_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_id_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_pack_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_pack_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_base_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRsltGi_cont_fctr_flg.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_first_gr_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_lmt_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt_fr.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_vld_dt_to.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_stop_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_rel_dt.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_margin_days.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_sppl_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_loc_sppl_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_seq.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRsltGi_trd_cd.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_ptn_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trn_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_trn_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_io_act_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRsltGi_io_act_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [GRS_ALLOC]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [GRS_ALLOC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDTL_ScreenOpe(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[OpeTyp]ブロックのモードの設定
	 */
	protected static void statusInitDTL_OpeTyp(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Top(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Fold(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Tab1(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[GrSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL_GrSts(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[GiSts]ブロックのモードの設定
	 */
	protected static void statusInitDTL_GiSts(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Cnd(MSBEP_AllocSrch p){
		p.Cnd_ope_Group.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_tgt_Group.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_prcd.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gr_act.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_prcd.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_gi_act.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_avl_schd_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_except_invld_lot_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_alloc_gi_flg.putMode(p, DTL, MCMode.REQUIRED);
		p.Cnd_lg_grp_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, DTL, MCMode.ENABLE);
		p.Cnd_stk_id_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, DTL, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);

	}

	/**
	 * [DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Ctrl(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Rslt(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDTL_HdrTab(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[HdrQty]ブロックのモードの設定
	 */
	protected static void statusInitDTL_HdrQty(MSBEP_AllocSrch p){
		p.HdrQty_stk_base_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_stk_base_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gr_base_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.HdrQty_gi_base_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_gi_base_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.HdrQty_base_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.HdrQty_base_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);

	}

	/**
	 * [DTL]ステータスの[HdrContFctr]ブロックのモードの設定
	 */
	protected static void statusInitDTL_HdrContFctr(MSBEP_AllocSrch p){
		p.HdrContFctr_stk_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_stk_cont_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gr_cont_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.HdrContFctr_std_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);
		p.HdrContFctr_act_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.HdrContFctr_cont_fctr_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.HdrContFctr_cont_fctr_rnd_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.HdrContFctr_gi_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty2_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty3_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_gi_cont_qty4_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.HdrContFctr_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);

	}

	/**
	 * [DTL]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitDTL_RsltGr(MSBEP_AllocSrch p){
		p.columnRsltGr_check.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_schd_stk_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_schd_stk_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_wg_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_dpt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGr_lot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_sublot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.RsltGr_str_ln_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGr_site_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_site_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_lg_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_alloc_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_loc_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_gd_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_gd_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_quality_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_insp_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGr_sno_wrk_no_p_PPanel.putStatus(DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGr_in_xfr_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_in_xfr_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_asst_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_id_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stk_arrv_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGr_pack_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_pack_unit_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_pack_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGr_base_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGr_base_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGr_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGr_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGr_grs_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_alloc_unit_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_overdue_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_another_loc_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_abnormal_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGr_act_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGr_act_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGr_std_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGr_cont_fctr_unit_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGr_cont_fctr_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_rnd_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_cont_fctr_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_lot_seq.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_first_gr_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_lmt_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_fr.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_vld_dt_to.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_stop_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_rel_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_alloc_margin_days.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_loc_sppl_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_io_schd_seq.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGr_trd_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_trn_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);

	}

	/**
	 * [DTL]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitDTL_RsltGi(MSBEP_AllocSrch p){
		p.columnRsltGi_check.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_schd_stk_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_schd_stk_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_dt.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_wg_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_dpt_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRsltGi_lot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_sublot_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.RsltGi_str_ln_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRsltGi_site_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_site_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_lg_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_alloc_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_loc_grp_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_gd_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_gd_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_quality_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_insp_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGi_sno_wrk_no_p_PPanel.putStatus(DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltGi_in_xfr_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_in_xfr_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_asst_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_id_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stk_arrv_bp_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGi_pack_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_pack_unit_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_pack_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGi_base_unit_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRsltGi_base_unit_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGi_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltGi_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.RsltGi_grs_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_alloc_unit_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_unit_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_overdue_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_another_loc_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_abnormal_alloc_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.RsltGi_act_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.RsltGi_act_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_fctr_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.RsltGi_std_cont_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_wait_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.RsltGi_cont_fctr_unit_p_PPanel.putStatus(DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRsltGi_cont_fctr_flg.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_rnd_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_cont_fctr_dec_place.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_lot_seq.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_first_gr_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_lmt_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_fr.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_vld_dt_to.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_stop_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_rel_dt.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_alloc_margin_days.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_cd.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_loc_sppl_nm.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_no.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_io_schd_seq.putMode(p, DTL, MCMode.INVISIBLE);
		p.columnRsltGi_trd_cd.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_trn_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, DTL, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, DTL, MCMode.READ_ONLY);

	}

	/**
	 * [DTL]ステータスの[Lno]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Lno(MSBEP_AllocSrch p){

	}

	/**
	 * [DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDTL_Btn(MSBEP_AllocSrch p){
		p.Btn_open_MSBEP0090_GR.putMode(p, DTL, MCMode.ENABLE);
		p.Btn_open_MSBEP0090_GI.putMode(p, DTL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GR.putMode(p, DTL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080_GI.putMode(p, DTL, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(DTL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDTL_EastBtn(MSBEP_AllocSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return ACCRUAL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_AllocSrch_MC.setTableConfigRsltGr((MSBEP_AllocSrch)this);
		MSBEP_AllocSrch_MC.setTableConfigRsltGi((MSBEP_AllocSrch)this);
	}

	/**
	 * [RsltGr]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltGr(MSBEP_AllocSrch p) {
		p.columnRsltGr_check.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.check_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_check);
		p.columnRsltGr_schd_stk_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.schd_stk_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_schd_stk_typ);
		p.columnRsltGr_schd_stk_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.schd_stk_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_schd_stk_typ_nm);
		p.columnRsltGr_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dt_META);
		p.columnRsltGr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_dt);
		p.columnRsltGr_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.wg_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_wg_cd);
		p.columnRsltGr_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.wg_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_wg_nm);
		p.columnRsltGr_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dpt_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_dpt_cd);
		p.columnRsltGr_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dpt_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_dpt_nm);
		p.RsltGrTable.addTable(p.RsltGr_ver_no_p_PPanel.VerNoTable);
		p.columnRsltGr_lot_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lot_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lot_no);
		p.columnRsltGr_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.sublot_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sublot_no);
		p.columnRsltGr_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_cd);
		p.columnRsltGr_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_nm);
		p.RsltGrTable.addTable(p.RsltGr_str_ln_p_PPanel.StrLnTable);
		p.columnRsltGr_site_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.site_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_site_cd);
		p.columnRsltGr_site_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.site_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_site_nm);
		p.columnRsltGr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lg_grp_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lg_grp_cd);
		p.columnRsltGr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lg_grp_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lg_grp_nm);
		p.columnRsltGr_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_grp_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_grp_cd);
		p.columnRsltGr_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_grp_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_grp_nm);
		p.columnRsltGr_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_grp_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_grp_cd);
		p.columnRsltGr_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_grp_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_grp_nm);
		p.columnRsltGr_gd_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.gd_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_gd_cd);
		p.columnRsltGr_gd_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.gd_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_gd_nm);
		p.columnRsltGr_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.quality_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_quality_typ);
		p.columnRsltGr_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.quality_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_quality_typ_nm);
		p.columnRsltGr_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_insp_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_insp_typ);
		p.columnRsltGr_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_insp_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_insp_typ_nm);
		p.RsltGrTable.addTable(p.RsltGr_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRsltGr_in_xfr_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.in_xfr_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_in_xfr_typ);
		p.columnRsltGr_in_xfr_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.in_xfr_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_in_xfr_typ_nm);
		p.columnRsltGr_asst_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.asst_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_asst_typ);
		p.columnRsltGr_asst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.asst_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_asst_typ_nm);
		p.columnRsltGr_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_id_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_id_typ);
		p.columnRsltGr_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_id_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_id_typ_nm);
		p.columnRsltGr_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_bp_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_bp_cd);
		p.columnRsltGr_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_bp_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_bp_nm);
		p.columnRsltGr_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_arrv_bp_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_arrv_bp_cd);
		p.columnRsltGr_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_arrv_bp_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_arrv_bp_nm);
		p.RsltGrTable.addTable(p.RsltGr_pack_unit_qty_p_PPanel.QtyTable);
		p.columnRsltGr_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_pack_unit_cd);
		p.columnRsltGr_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_pack_unit_nm);
		p.columnRsltGr_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_dec_place_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_pack_unit_dec_place);
		p.RsltGrTable.addTable(p.RsltGr_base_unit_qty_p_PPanel.QtyTable);
		p.columnRsltGr_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_unit_cd);
		p.columnRsltGr_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_unit_nm);
		p.columnRsltGr_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_dec_place_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_unit_dec_place);
		p.RsltGrTable.addTable(p.RsltGr_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_not_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_not_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_not_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_not_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_not_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_grs_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_grs_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_alloc_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_wait_qty_p_PPanel.QtyTable);
		p.RsltGrTable.addTable(p.RsltGr_grs_alloc_avl_qty_p_PPanel.QtyTable);
		p.columnRsltGr_alloc_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_unit_cd);
		p.columnRsltGr_alloc_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_unit_nm);
		p.columnRsltGr_alloc_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_dec_place_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_unit_dec_place);
		p.columnRsltGr_overdue_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.overdue_alloc_flg_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_overdue_alloc_flg);
		p.columnRsltGr_another_loc_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.another_loc_alloc_flg_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_another_loc_alloc_flg);
		p.columnRsltGr_abnormal_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.abnormal_alloc_flg_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_abnormal_alloc_flg);
		p.RsltGrTable.addTable(p.RsltGr_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltGrTable.addTable(p.RsltGr_act_cont_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_act_cont_alloc_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_act_cont_wait_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_act_cont_alloc_avl_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltGrTable.addTable(p.RsltGr_std_cont_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_std_cont_alloc_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_std_cont_wait_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_std_cont_alloc_avl_qty_p_PPanel.ContQtyTable);
		p.RsltGrTable.addTable(p.RsltGr_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnRsltGr_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_flg_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_cont_fctr_flg);
		p.columnRsltGr_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_rnd_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_cont_fctr_rnd_typ);
		p.columnRsltGr_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_dec_place_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_cont_fctr_dec_place);
		p.columnRsltGr_lot_seq.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lot_seq_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lot_seq);
		p.columnRsltGr_first_gr_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.first_gr_dt_META);
		p.columnRsltGr_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_first_gr_dt);
		p.columnRsltGr_vld_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_META);
		p.columnRsltGr_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_vld_dt);
		p.columnRsltGr_lmt_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lmt_dt_META);
		p.columnRsltGr_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lmt_dt);
		p.columnRsltGr_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.plnt_aprv_sts_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_plnt_aprv_sts_typ);
		p.columnRsltGr_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.plnt_aprv_sts_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_plnt_aprv_sts_typ_nm);
		p.columnRsltGr_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.mrkt_judg_sts_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_mrkt_judg_sts_typ);
		p.columnRsltGr_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.mrkt_judg_sts_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_mrkt_judg_sts_typ_nm);
		p.columnRsltGr_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_fr_META);
		p.columnRsltGr_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_vld_dt_fr);
		p.columnRsltGr_vld_dt_to.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_to_META);
		p.columnRsltGr_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_vld_dt_to);
		p.columnRsltGr_stop_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stop_dt_META);
		p.columnRsltGr_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stop_dt);
		p.columnRsltGr_rel_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.rel_dt_META);
		p.columnRsltGr_rel_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_rel_dt);
		p.columnRsltGr_alloc_margin_days.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_margin_days_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_alloc_margin_days);
		p.columnRsltGr_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_sppl_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_sppl_cd);
		p.columnRsltGr_loc_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_sppl_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_loc_sppl_nm);
		p.columnRsltGr_io_schd_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_typ);
		p.columnRsltGr_io_schd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_typ_nm);
		p.columnRsltGr_io_schd_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_sts_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_sts_typ);
		p.columnRsltGr_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_sts_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_sts_typ_nm);
		p.columnRsltGr_io_schd_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_no);
		p.columnRsltGr_io_schd_seq.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_seq_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_seq);
		p.columnRsltGr_trd_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_cd);
		p.columnRsltGr_trd_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_nm);
		p.columnRsltGr_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_ptn_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_ptn_typ);
		p.columnRsltGr_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_ptn_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_ptn_typ_nm);
		p.columnRsltGr_trn_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trn_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trn_typ);
		p.columnRsltGr_trn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trn_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trn_typ_nm);
		p.columnRsltGr_io_act_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_act_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_act_typ);
		p.columnRsltGr_io_act_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_act_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_act_typ_nm);
		// スクロール固定カラムの指定
		p.RsltGrTable.setUnscrollColumn(p.columnRsltGr_check);
	}

	/**
	 * [RsltGi]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltGi(MSBEP_AllocSrch p) {
		p.columnRsltGi_check.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.check_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_check);
		p.columnRsltGi_schd_stk_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.schd_stk_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_schd_stk_typ);
		p.columnRsltGi_schd_stk_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.schd_stk_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_schd_stk_typ_nm);
		p.columnRsltGi_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dt_META);
		p.columnRsltGi_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_dt);
		p.columnRsltGi_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.wg_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_wg_cd);
		p.columnRsltGi_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.wg_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_wg_nm);
		p.columnRsltGi_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dpt_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_dpt_cd);
		p.columnRsltGi_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.dpt_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_dpt_nm);
		p.RsltGiTable.addTable(p.RsltGi_ver_no_p_PPanel.VerNoTable);
		p.columnRsltGi_lot_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lot_no);
		p.columnRsltGi_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.sublot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_sublot_no);
		p.columnRsltGi_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_cd);
		p.columnRsltGi_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_nm);
		p.RsltGiTable.addTable(p.RsltGi_str_ln_p_PPanel.StrLnTable);
		p.columnRsltGi_site_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.site_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_site_cd);
		p.columnRsltGi_site_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.site_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_site_nm);
		p.columnRsltGi_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lg_grp_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lg_grp_cd);
		p.columnRsltGi_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lg_grp_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lg_grp_nm);
		p.columnRsltGi_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_grp_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_grp_cd);
		p.columnRsltGi_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_grp_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_grp_nm);
		p.columnRsltGi_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_grp_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_grp_cd);
		p.columnRsltGi_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_grp_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_grp_nm);
		p.columnRsltGi_gd_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.gd_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_gd_cd);
		p.columnRsltGi_gd_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.gd_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_gd_nm);
		p.columnRsltGi_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.quality_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_quality_typ);
		p.columnRsltGi_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.quality_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_quality_typ_nm);
		p.columnRsltGi_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_insp_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_insp_typ);
		p.columnRsltGi_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_insp_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_insp_typ_nm);
		p.RsltGiTable.addTable(p.RsltGi_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRsltGi_in_xfr_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.in_xfr_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_in_xfr_typ);
		p.columnRsltGi_in_xfr_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.in_xfr_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_in_xfr_typ_nm);
		p.columnRsltGi_asst_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.asst_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_asst_typ);
		p.columnRsltGi_asst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.asst_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_asst_typ_nm);
		p.columnRsltGi_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_id_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_id_typ);
		p.columnRsltGi_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_id_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_id_typ_nm);
		p.columnRsltGi_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_bp_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_bp_cd);
		p.columnRsltGi_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_bp_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_bp_nm);
		p.columnRsltGi_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_arrv_bp_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_arrv_bp_cd);
		p.columnRsltGi_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stk_arrv_bp_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_arrv_bp_nm);
		p.RsltGiTable.addTable(p.RsltGi_pack_unit_qty_p_PPanel.QtyTable);
		p.columnRsltGi_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_pack_unit_cd);
		p.columnRsltGi_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_pack_unit_nm);
		p.columnRsltGi_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.pack_unit_dec_place_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_pack_unit_dec_place);
		p.RsltGiTable.addTable(p.RsltGi_base_unit_qty_p_PPanel.QtyTable);
		p.columnRsltGi_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_unit_cd);
		p.columnRsltGi_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_unit_nm);
		p.columnRsltGi_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.base_unit_dec_place_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_unit_dec_place);
		p.RsltGiTable.addTable(p.RsltGi_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_not_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_not_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_not_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_not_lot_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_not_lot_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_grs_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_grs_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_alloc_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_wait_qty_p_PPanel.QtyTable);
		p.RsltGiTable.addTable(p.RsltGi_grs_alloc_avl_qty_p_PPanel.QtyTable);
		p.columnRsltGi_alloc_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_unit_cd);
		p.columnRsltGi_alloc_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_unit_nm);
		p.columnRsltGi_alloc_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_unit_dec_place_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_unit_dec_place);
		p.columnRsltGi_overdue_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.overdue_alloc_flg_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_overdue_alloc_flg);
		p.columnRsltGi_another_loc_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.another_loc_alloc_flg_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_another_loc_alloc_flg);
		p.columnRsltGi_abnormal_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.abnormal_alloc_flg_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_abnormal_alloc_flg);
		p.RsltGiTable.addTable(p.RsltGi_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltGiTable.addTable(p.RsltGi_act_cont_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_act_cont_alloc_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_act_cont_wait_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_act_cont_alloc_avl_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltGiTable.addTable(p.RsltGi_std_cont_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_std_cont_alloc_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_std_cont_wait_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_std_cont_alloc_avl_qty_p_PPanel.ContQtyTable);
		p.RsltGiTable.addTable(p.RsltGi_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnRsltGi_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_flg_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_cont_fctr_flg);
		p.columnRsltGi_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_rnd_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_cont_fctr_rnd_typ);
		p.columnRsltGi_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.cont_fctr_dec_place_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_cont_fctr_dec_place);
		p.columnRsltGi_lot_seq.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lot_seq_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lot_seq);
		p.columnRsltGi_first_gr_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.first_gr_dt_META);
		p.columnRsltGi_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_first_gr_dt);
		p.columnRsltGi_vld_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_META);
		p.columnRsltGi_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_vld_dt);
		p.columnRsltGi_lmt_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.lmt_dt_META);
		p.columnRsltGi_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lmt_dt);
		p.columnRsltGi_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.plnt_aprv_sts_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_plnt_aprv_sts_typ);
		p.columnRsltGi_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.plnt_aprv_sts_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_plnt_aprv_sts_typ_nm);
		p.columnRsltGi_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.mrkt_judg_sts_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_mrkt_judg_sts_typ);
		p.columnRsltGi_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.mrkt_judg_sts_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_mrkt_judg_sts_typ_nm);
		p.columnRsltGi_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_fr_META);
		p.columnRsltGi_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_vld_dt_fr);
		p.columnRsltGi_vld_dt_to.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.vld_dt_to_META);
		p.columnRsltGi_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_vld_dt_to);
		p.columnRsltGi_stop_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.stop_dt_META);
		p.columnRsltGi_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stop_dt);
		p.columnRsltGi_rel_dt.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.rel_dt_META);
		p.columnRsltGi_rel_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_rel_dt);
		p.columnRsltGi_alloc_margin_days.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.alloc_margin_days_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_alloc_margin_days);
		p.columnRsltGi_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_sppl_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_sppl_cd);
		p.columnRsltGi_loc_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.loc_sppl_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_sppl_nm);
		p.columnRsltGi_io_schd_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_typ);
		p.columnRsltGi_io_schd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_typ_nm);
		p.columnRsltGi_io_schd_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_sts_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_sts_typ);
		p.columnRsltGi_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_sts_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_sts_typ_nm);
		p.columnRsltGi_io_schd_no.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_no);
		p.columnRsltGi_io_schd_seq.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_schd_seq_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_seq);
		p.columnRsltGi_trd_cd.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_cd);
		p.columnRsltGi_trd_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_nm);
		p.columnRsltGi_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_ptn_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_ptn_typ);
		p.columnRsltGi_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trd_ptn_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_ptn_typ_nm);
		p.columnRsltGi_trn_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trn_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trn_typ);
		p.columnRsltGi_trn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.trn_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trn_typ_nm);
		p.columnRsltGi_io_act_typ.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_act_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_act_typ);
		p.columnRsltGi_io_act_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0040.RsltGrR.io_act_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_act_typ_nm);
		// スクロール固定カラムの指定
		p.RsltGiTable.setUnscrollColumn(p.columnRsltGi_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pack_unit_cd.getListConfig().setPutter(getCnd_pack_unit_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
	}

	/**
	 * この画面を[ACCRUAL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setACCRUALStatus() {
		status = ACCRUAL;
		setAllStatus(status);
	}

	/**
	 * この画面を[ACCPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setACCPTStatus() {
		status = ACCPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[AVL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setAVLStatus() {
		status = AVL;
		setAllStatus(status);
	}

	/**
	 * この画面を[LOC_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setLOC_ALLOCStatus() {
		status = LOC_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[GRS_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setGRS_ALLOCStatus() {
		status = GRS_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDTLStatus() {
		status = DTL;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (ACCRUAL.equals(status)) {
			setACCRUALStatus();
		}
		else if (ACCPT.equals(status)) {
			setACCPTStatus();
		}
		else if (AVL.equals(status)) {
			setAVLStatus();
		}
		else if (LOC_ALLOC.equals(status)) {
			setLOC_ALLOCStatus();
		}
		else if (GRS_ALLOC.equals(status)) {
			setGRS_ALLOCStatus();
		}
		else if (DTL.equals(status)) {
			setDTLStatus();
		}
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
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
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
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
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
	 * [Cnd_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_pack_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pack_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_pack_unit_cd) return getCnd_pack_unit_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
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
		else if (ap == Btn_open_MSBEP0090_GR) doBtn_open_MSBEP0090_GR(info);
		else if (ap == Btn_open_MSBEP0090_GI) doBtn_open_MSBEP0090_GI(info);
		else if (ap == Btn_open_MSBEP0080_GR) doBtn_open_MSBEP0080_GR(info);
		else if (ap == Btn_open_MSBEP0080_GI) doBtn_open_MSBEP0080_GI(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0090_GR]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0090_GR(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0090_GI]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0090_GI(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0080_GR]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0080_GR(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0080_GI]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0080_GI(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == RsltGrTable) return doRsltGr_VC(info);
		if (vc == RsltGiTable) return doRsltGi_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_tgt_Group) return doCnd_tgt_VC(info);
		if (vc == Cnd_gr_prcd) return doCnd_gr_prcd_VC(info);
		if (vc == Cnd_gr_sts_opn_grp) return doCnd_gr_sts_opn_grp_VC(info);
		if (vc == Cnd_gr_sts_ordsav_grp) return doCnd_gr_sts_ordsav_grp_VC(info);
		if (vc == Cnd_gr_sts_fix_grp) return doCnd_gr_sts_fix_grp_VC(info);
		if (vc == Cnd_gr_sts_schd_grp) return doCnd_gr_sts_schd_grp_VC(info);
		if (vc == Cnd_gr_sts_ord_grp) return doCnd_gr_sts_ord_grp_VC(info);
		if (vc == Cnd_gr_act) return doCnd_gr_act_VC(info);
		if (vc == Cnd_gi_prcd) return doCnd_gi_prcd_VC(info);
		if (vc == Cnd_gi_sts_opn_grp) return doCnd_gi_sts_opn_grp_VC(info);
		if (vc == Cnd_gi_sts_ordsav_grp) return doCnd_gi_sts_ordsav_grp_VC(info);
		if (vc == Cnd_gi_sts_fix_grp) return doCnd_gi_sts_fix_grp_VC(info);
		if (vc == Cnd_gi_sts_schd_grp) return doCnd_gi_sts_schd_grp_VC(info);
		if (vc == Cnd_gi_sts_ord_grp) return doCnd_gi_sts_ord_grp_VC(info);
		if (vc == Cnd_gi_act) return doCnd_gi_act_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_avl_schd_dt) return doCnd_avl_schd_dt_VC(info);
		if (vc == Cnd_except_invld_lot_flg) return doCnd_except_invld_lot_flg_VC(info);
		if (vc == Cnd_except_alloc_wait_flg) return doCnd_except_alloc_wait_flg_VC(info);
		if (vc == Cnd_alloc_gi_flg) return doCnd_alloc_gi_flg_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_pack_unit_cd) return doCnd_pack_unit_cd_VC(info);
		if (vc == Cnd_pack_unit_nm) return doCnd_pack_unit_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == HdrQty_base_unit_dec_place) return doHdrQty_base_unit_dec_place_VC(info);
		if (vc == HdrQty_base_unit_cd) return doHdrQty_base_unit_cd_VC(info);
		if (vc == HdrQty_base_unit_nm) return doHdrQty_base_unit_nm_VC(info);
		if (vc == HdrContFctr_cont_fctr_flg) return doHdrContFctr_cont_fctr_flg_VC(info);
		if (vc == HdrContFctr_cont_fctr_dec_place) return doHdrContFctr_cont_fctr_dec_place_VC(info);
		if (vc == HdrContFctr_cont_fctr_rnd_typ) return doHdrContFctr_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRsltGr_check) return doRsltGr_check_VC(info);
		if (vc == columnRsltGr_schd_stk_typ) return doRsltGr_schd_stk_typ_VC(info);
		if (vc == columnRsltGr_schd_stk_typ_nm) return doRsltGr_schd_stk_typ_nm_VC(info);
		if (vc == columnRsltGr_dt) return doRsltGr_dt_VC(info);
		if (vc == columnRsltGr_wg_cd) return doRsltGr_wg_cd_VC(info);
		if (vc == columnRsltGr_wg_nm) return doRsltGr_wg_nm_VC(info);
		if (vc == columnRsltGr_dpt_cd) return doRsltGr_dpt_cd_VC(info);
		if (vc == columnRsltGr_dpt_nm) return doRsltGr_dpt_nm_VC(info);
		if (vc == columnRsltGr_lot_no) return doRsltGr_lot_no_VC(info);
		if (vc == columnRsltGr_sublot_no) return doRsltGr_sublot_no_VC(info);
		if (vc == columnRsltGr_loc_cd) return doRsltGr_loc_cd_VC(info);
		if (vc == columnRsltGr_loc_nm) return doRsltGr_loc_nm_VC(info);
		if (vc == columnRsltGr_site_cd) return doRsltGr_site_cd_VC(info);
		if (vc == columnRsltGr_site_nm) return doRsltGr_site_nm_VC(info);
		if (vc == columnRsltGr_lg_grp_cd) return doRsltGr_lg_grp_cd_VC(info);
		if (vc == columnRsltGr_lg_grp_nm) return doRsltGr_lg_grp_nm_VC(info);
		if (vc == columnRsltGr_alloc_grp_cd) return doRsltGr_alloc_grp_cd_VC(info);
		if (vc == columnRsltGr_alloc_grp_nm) return doRsltGr_alloc_grp_nm_VC(info);
		if (vc == columnRsltGr_loc_grp_cd) return doRsltGr_loc_grp_cd_VC(info);
		if (vc == columnRsltGr_loc_grp_nm) return doRsltGr_loc_grp_nm_VC(info);
		if (vc == columnRsltGr_gd_cd) return doRsltGr_gd_cd_VC(info);
		if (vc == columnRsltGr_gd_nm) return doRsltGr_gd_nm_VC(info);
		if (vc == columnRsltGr_quality_typ) return doRsltGr_quality_typ_VC(info);
		if (vc == columnRsltGr_quality_typ_nm) return doRsltGr_quality_typ_nm_VC(info);
		if (vc == columnRsltGr_stk_insp_typ) return doRsltGr_stk_insp_typ_VC(info);
		if (vc == columnRsltGr_stk_insp_typ_nm) return doRsltGr_stk_insp_typ_nm_VC(info);
		if (vc == columnRsltGr_in_xfr_typ) return doRsltGr_in_xfr_typ_VC(info);
		if (vc == columnRsltGr_in_xfr_typ_nm) return doRsltGr_in_xfr_typ_nm_VC(info);
		if (vc == columnRsltGr_asst_typ) return doRsltGr_asst_typ_VC(info);
		if (vc == columnRsltGr_asst_typ_nm) return doRsltGr_asst_typ_nm_VC(info);
		if (vc == columnRsltGr_stk_id_typ) return doRsltGr_stk_id_typ_VC(info);
		if (vc == columnRsltGr_stk_id_typ_nm) return doRsltGr_stk_id_typ_nm_VC(info);
		if (vc == columnRsltGr_stk_bp_cd) return doRsltGr_stk_bp_cd_VC(info);
		if (vc == columnRsltGr_stk_bp_nm) return doRsltGr_stk_bp_nm_VC(info);
		if (vc == columnRsltGr_stk_arrv_bp_cd) return doRsltGr_stk_arrv_bp_cd_VC(info);
		if (vc == columnRsltGr_stk_arrv_bp_nm) return doRsltGr_stk_arrv_bp_nm_VC(info);
		if (vc == columnRsltGr_pack_unit_cd) return doRsltGr_pack_unit_cd_VC(info);
		if (vc == columnRsltGr_pack_unit_nm) return doRsltGr_pack_unit_nm_VC(info);
		if (vc == columnRsltGr_pack_unit_dec_place) return doRsltGr_pack_unit_dec_place_VC(info);
		if (vc == columnRsltGr_base_unit_cd) return doRsltGr_base_unit_cd_VC(info);
		if (vc == columnRsltGr_base_unit_nm) return doRsltGr_base_unit_nm_VC(info);
		if (vc == columnRsltGr_base_unit_dec_place) return doRsltGr_base_unit_dec_place_VC(info);
		if (vc == columnRsltGr_alloc_unit_cd) return doRsltGr_alloc_unit_cd_VC(info);
		if (vc == columnRsltGr_alloc_unit_nm) return doRsltGr_alloc_unit_nm_VC(info);
		if (vc == columnRsltGr_alloc_unit_dec_place) return doRsltGr_alloc_unit_dec_place_VC(info);
		if (vc == columnRsltGr_overdue_alloc_flg) return doRsltGr_overdue_alloc_flg_VC(info);
		if (vc == columnRsltGr_another_loc_alloc_flg) return doRsltGr_another_loc_alloc_flg_VC(info);
		if (vc == columnRsltGr_abnormal_alloc_flg) return doRsltGr_abnormal_alloc_flg_VC(info);
		if (vc == columnRsltGr_cont_fctr_flg) return doRsltGr_cont_fctr_flg_VC(info);
		if (vc == columnRsltGr_cont_fctr_rnd_typ) return doRsltGr_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRsltGr_cont_fctr_dec_place) return doRsltGr_cont_fctr_dec_place_VC(info);
		if (vc == columnRsltGr_lot_seq) return doRsltGr_lot_seq_VC(info);
		if (vc == columnRsltGr_first_gr_dt) return doRsltGr_first_gr_dt_VC(info);
		if (vc == columnRsltGr_vld_dt) return doRsltGr_vld_dt_VC(info);
		if (vc == columnRsltGr_lmt_dt) return doRsltGr_lmt_dt_VC(info);
		if (vc == columnRsltGr_plnt_aprv_sts_typ) return doRsltGr_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRsltGr_plnt_aprv_sts_typ_nm) return doRsltGr_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRsltGr_mrkt_judg_sts_typ) return doRsltGr_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRsltGr_mrkt_judg_sts_typ_nm) return doRsltGr_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRsltGr_vld_dt_fr) return doRsltGr_vld_dt_fr_VC(info);
		if (vc == columnRsltGr_vld_dt_to) return doRsltGr_vld_dt_to_VC(info);
		if (vc == columnRsltGr_stop_dt) return doRsltGr_stop_dt_VC(info);
		if (vc == columnRsltGr_rel_dt) return doRsltGr_rel_dt_VC(info);
		if (vc == columnRsltGr_alloc_margin_days) return doRsltGr_alloc_margin_days_VC(info);
		if (vc == columnRsltGr_loc_sppl_cd) return doRsltGr_loc_sppl_cd_VC(info);
		if (vc == columnRsltGr_loc_sppl_nm) return doRsltGr_loc_sppl_nm_VC(info);
		if (vc == columnRsltGr_io_schd_typ) return doRsltGr_io_schd_typ_VC(info);
		if (vc == columnRsltGr_io_schd_typ_nm) return doRsltGr_io_schd_typ_nm_VC(info);
		if (vc == columnRsltGr_io_schd_sts_typ) return doRsltGr_io_schd_sts_typ_VC(info);
		if (vc == columnRsltGr_io_schd_sts_typ_nm) return doRsltGr_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRsltGr_io_schd_no) return doRsltGr_io_schd_no_VC(info);
		if (vc == columnRsltGr_io_schd_seq) return doRsltGr_io_schd_seq_VC(info);
		if (vc == columnRsltGr_trd_cd) return doRsltGr_trd_cd_VC(info);
		if (vc == columnRsltGr_trd_nm) return doRsltGr_trd_nm_VC(info);
		if (vc == columnRsltGr_trd_ptn_typ) return doRsltGr_trd_ptn_typ_VC(info);
		if (vc == columnRsltGr_trd_ptn_typ_nm) return doRsltGr_trd_ptn_typ_nm_VC(info);
		if (vc == columnRsltGr_trn_typ) return doRsltGr_trn_typ_VC(info);
		if (vc == columnRsltGr_trn_typ_nm) return doRsltGr_trn_typ_nm_VC(info);
		if (vc == columnRsltGr_io_act_typ) return doRsltGr_io_act_typ_VC(info);
		if (vc == columnRsltGr_io_act_typ_nm) return doRsltGr_io_act_typ_nm_VC(info);
		if (vc == columnRsltGi_check) return doRsltGi_check_VC(info);
		if (vc == columnRsltGi_schd_stk_typ) return doRsltGi_schd_stk_typ_VC(info);
		if (vc == columnRsltGi_schd_stk_typ_nm) return doRsltGi_schd_stk_typ_nm_VC(info);
		if (vc == columnRsltGi_dt) return doRsltGi_dt_VC(info);
		if (vc == columnRsltGi_wg_cd) return doRsltGi_wg_cd_VC(info);
		if (vc == columnRsltGi_wg_nm) return doRsltGi_wg_nm_VC(info);
		if (vc == columnRsltGi_dpt_cd) return doRsltGi_dpt_cd_VC(info);
		if (vc == columnRsltGi_dpt_nm) return doRsltGi_dpt_nm_VC(info);
		if (vc == columnRsltGi_lot_no) return doRsltGi_lot_no_VC(info);
		if (vc == columnRsltGi_sublot_no) return doRsltGi_sublot_no_VC(info);
		if (vc == columnRsltGi_loc_cd) return doRsltGi_loc_cd_VC(info);
		if (vc == columnRsltGi_loc_nm) return doRsltGi_loc_nm_VC(info);
		if (vc == columnRsltGi_site_cd) return doRsltGi_site_cd_VC(info);
		if (vc == columnRsltGi_site_nm) return doRsltGi_site_nm_VC(info);
		if (vc == columnRsltGi_lg_grp_cd) return doRsltGi_lg_grp_cd_VC(info);
		if (vc == columnRsltGi_lg_grp_nm) return doRsltGi_lg_grp_nm_VC(info);
		if (vc == columnRsltGi_alloc_grp_cd) return doRsltGi_alloc_grp_cd_VC(info);
		if (vc == columnRsltGi_alloc_grp_nm) return doRsltGi_alloc_grp_nm_VC(info);
		if (vc == columnRsltGi_loc_grp_cd) return doRsltGi_loc_grp_cd_VC(info);
		if (vc == columnRsltGi_loc_grp_nm) return doRsltGi_loc_grp_nm_VC(info);
		if (vc == columnRsltGi_gd_cd) return doRsltGi_gd_cd_VC(info);
		if (vc == columnRsltGi_gd_nm) return doRsltGi_gd_nm_VC(info);
		if (vc == columnRsltGi_quality_typ) return doRsltGi_quality_typ_VC(info);
		if (vc == columnRsltGi_quality_typ_nm) return doRsltGi_quality_typ_nm_VC(info);
		if (vc == columnRsltGi_stk_insp_typ) return doRsltGi_stk_insp_typ_VC(info);
		if (vc == columnRsltGi_stk_insp_typ_nm) return doRsltGi_stk_insp_typ_nm_VC(info);
		if (vc == columnRsltGi_in_xfr_typ) return doRsltGi_in_xfr_typ_VC(info);
		if (vc == columnRsltGi_in_xfr_typ_nm) return doRsltGi_in_xfr_typ_nm_VC(info);
		if (vc == columnRsltGi_asst_typ) return doRsltGi_asst_typ_VC(info);
		if (vc == columnRsltGi_asst_typ_nm) return doRsltGi_asst_typ_nm_VC(info);
		if (vc == columnRsltGi_stk_id_typ) return doRsltGi_stk_id_typ_VC(info);
		if (vc == columnRsltGi_stk_id_typ_nm) return doRsltGi_stk_id_typ_nm_VC(info);
		if (vc == columnRsltGi_stk_bp_cd) return doRsltGi_stk_bp_cd_VC(info);
		if (vc == columnRsltGi_stk_bp_nm) return doRsltGi_stk_bp_nm_VC(info);
		if (vc == columnRsltGi_stk_arrv_bp_cd) return doRsltGi_stk_arrv_bp_cd_VC(info);
		if (vc == columnRsltGi_stk_arrv_bp_nm) return doRsltGi_stk_arrv_bp_nm_VC(info);
		if (vc == columnRsltGi_pack_unit_cd) return doRsltGi_pack_unit_cd_VC(info);
		if (vc == columnRsltGi_pack_unit_nm) return doRsltGi_pack_unit_nm_VC(info);
		if (vc == columnRsltGi_pack_unit_dec_place) return doRsltGi_pack_unit_dec_place_VC(info);
		if (vc == columnRsltGi_base_unit_cd) return doRsltGi_base_unit_cd_VC(info);
		if (vc == columnRsltGi_base_unit_nm) return doRsltGi_base_unit_nm_VC(info);
		if (vc == columnRsltGi_base_unit_dec_place) return doRsltGi_base_unit_dec_place_VC(info);
		if (vc == columnRsltGi_alloc_unit_cd) return doRsltGi_alloc_unit_cd_VC(info);
		if (vc == columnRsltGi_alloc_unit_nm) return doRsltGi_alloc_unit_nm_VC(info);
		if (vc == columnRsltGi_alloc_unit_dec_place) return doRsltGi_alloc_unit_dec_place_VC(info);
		if (vc == columnRsltGi_overdue_alloc_flg) return doRsltGi_overdue_alloc_flg_VC(info);
		if (vc == columnRsltGi_another_loc_alloc_flg) return doRsltGi_another_loc_alloc_flg_VC(info);
		if (vc == columnRsltGi_abnormal_alloc_flg) return doRsltGi_abnormal_alloc_flg_VC(info);
		if (vc == columnRsltGi_cont_fctr_flg) return doRsltGi_cont_fctr_flg_VC(info);
		if (vc == columnRsltGi_cont_fctr_rnd_typ) return doRsltGi_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRsltGi_cont_fctr_dec_place) return doRsltGi_cont_fctr_dec_place_VC(info);
		if (vc == columnRsltGi_lot_seq) return doRsltGi_lot_seq_VC(info);
		if (vc == columnRsltGi_first_gr_dt) return doRsltGi_first_gr_dt_VC(info);
		if (vc == columnRsltGi_vld_dt) return doRsltGi_vld_dt_VC(info);
		if (vc == columnRsltGi_lmt_dt) return doRsltGi_lmt_dt_VC(info);
		if (vc == columnRsltGi_plnt_aprv_sts_typ) return doRsltGi_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRsltGi_plnt_aprv_sts_typ_nm) return doRsltGi_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRsltGi_mrkt_judg_sts_typ) return doRsltGi_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRsltGi_mrkt_judg_sts_typ_nm) return doRsltGi_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRsltGi_vld_dt_fr) return doRsltGi_vld_dt_fr_VC(info);
		if (vc == columnRsltGi_vld_dt_to) return doRsltGi_vld_dt_to_VC(info);
		if (vc == columnRsltGi_stop_dt) return doRsltGi_stop_dt_VC(info);
		if (vc == columnRsltGi_rel_dt) return doRsltGi_rel_dt_VC(info);
		if (vc == columnRsltGi_alloc_margin_days) return doRsltGi_alloc_margin_days_VC(info);
		if (vc == columnRsltGi_loc_sppl_cd) return doRsltGi_loc_sppl_cd_VC(info);
		if (vc == columnRsltGi_loc_sppl_nm) return doRsltGi_loc_sppl_nm_VC(info);
		if (vc == columnRsltGi_io_schd_typ) return doRsltGi_io_schd_typ_VC(info);
		if (vc == columnRsltGi_io_schd_typ_nm) return doRsltGi_io_schd_typ_nm_VC(info);
		if (vc == columnRsltGi_io_schd_sts_typ) return doRsltGi_io_schd_sts_typ_VC(info);
		if (vc == columnRsltGi_io_schd_sts_typ_nm) return doRsltGi_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRsltGi_io_schd_no) return doRsltGi_io_schd_no_VC(info);
		if (vc == columnRsltGi_io_schd_seq) return doRsltGi_io_schd_seq_VC(info);
		if (vc == columnRsltGi_trd_cd) return doRsltGi_trd_cd_VC(info);
		if (vc == columnRsltGi_trd_nm) return doRsltGi_trd_nm_VC(info);
		if (vc == columnRsltGi_trd_ptn_typ) return doRsltGi_trd_ptn_typ_VC(info);
		if (vc == columnRsltGi_trd_ptn_typ_nm) return doRsltGi_trd_ptn_typ_nm_VC(info);
		if (vc == columnRsltGi_trn_typ) return doRsltGi_trn_typ_VC(info);
		if (vc == columnRsltGi_trn_typ_nm) return doRsltGi_trn_typ_nm_VC(info);
		if (vc == columnRsltGi_io_act_typ) return doRsltGi_io_act_typ_VC(info);
		if (vc == columnRsltGi_io_act_typ_nm) return doRsltGi_io_act_typ_nm_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_prcd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_prcd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_opn_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_ordsav_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_fix_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_schd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_ord_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_act]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_act_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_prcd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_prcd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_opn_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_ordsav_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_fix_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_schd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_ord_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_act]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_act_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[except_invld_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_invld_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_alloc_wait_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_gi_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_nm_VC(MCEventInfo info){
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
	 * [HdrQty]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrQty_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrQty]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrQty_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrQty]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrQty_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrContFctr_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrContFctr_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrContFctr_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_schd_stk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_schd_stk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_in_xfr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[overdue_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_overdue_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[another_loc_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_another_loc_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[abnormal_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_abnormal_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lot_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lot_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[rel_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_rel_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_loc_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_schd_stk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_schd_stk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_in_xfr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[overdue_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_overdue_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[another_loc_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_another_loc_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[abnormal_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_abnormal_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lot_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lot_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[rel_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_rel_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_act_typ_nm_VC(MCEventInfo info){
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
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == RsltGrTable) doRsltGr_NC(info);
		else if (nc == RsltGiTable) doRsltGi_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_tgt_Group) doCnd_tgt_NC(info);
		else if (nc == Cnd_gr_prcd) doCnd_gr_prcd_NC(info);
		else if (nc == Cnd_gr_sts_opn_grp) doCnd_gr_sts_opn_grp_NC(info);
		else if (nc == Cnd_gr_sts_ordsav_grp) doCnd_gr_sts_ordsav_grp_NC(info);
		else if (nc == Cnd_gr_sts_fix_grp) doCnd_gr_sts_fix_grp_NC(info);
		else if (nc == Cnd_gr_sts_schd_grp) doCnd_gr_sts_schd_grp_NC(info);
		else if (nc == Cnd_gr_sts_ord_grp) doCnd_gr_sts_ord_grp_NC(info);
		else if (nc == Cnd_gr_act) doCnd_gr_act_NC(info);
		else if (nc == Cnd_gi_prcd) doCnd_gi_prcd_NC(info);
		else if (nc == Cnd_gi_sts_opn_grp) doCnd_gi_sts_opn_grp_NC(info);
		else if (nc == Cnd_gi_sts_ordsav_grp) doCnd_gi_sts_ordsav_grp_NC(info);
		else if (nc == Cnd_gi_sts_fix_grp) doCnd_gi_sts_fix_grp_NC(info);
		else if (nc == Cnd_gi_sts_schd_grp) doCnd_gi_sts_schd_grp_NC(info);
		else if (nc == Cnd_gi_sts_ord_grp) doCnd_gi_sts_ord_grp_NC(info);
		else if (nc == Cnd_gi_act) doCnd_gi_act_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_avl_schd_dt) doCnd_avl_schd_dt_NC(info);
		else if (nc == Cnd_except_invld_lot_flg) doCnd_except_invld_lot_flg_NC(info);
		else if (nc == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NC(info);
		else if (nc == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NC(info);
		else if (nc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == HdrQty_base_unit_dec_place) doHdrQty_base_unit_dec_place_NC(info);
		else if (nc == HdrQty_base_unit_cd) doHdrQty_base_unit_cd_NC(info);
		else if (nc == HdrQty_base_unit_nm) doHdrQty_base_unit_nm_NC(info);
		else if (nc == HdrContFctr_cont_fctr_flg) doHdrContFctr_cont_fctr_flg_NC(info);
		else if (nc == HdrContFctr_cont_fctr_dec_place) doHdrContFctr_cont_fctr_dec_place_NC(info);
		else if (nc == HdrContFctr_cont_fctr_rnd_typ) doHdrContFctr_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRsltGr_check) doRsltGr_check_NC(info);
		else if (nc == columnRsltGr_schd_stk_typ) doRsltGr_schd_stk_typ_NC(info);
		else if (nc == columnRsltGr_schd_stk_typ_nm) doRsltGr_schd_stk_typ_nm_NC(info);
		else if (nc == columnRsltGr_dt) doRsltGr_dt_NC(info);
		else if (nc == columnRsltGr_wg_cd) doRsltGr_wg_cd_NC(info);
		else if (nc == columnRsltGr_wg_nm) doRsltGr_wg_nm_NC(info);
		else if (nc == columnRsltGr_dpt_cd) doRsltGr_dpt_cd_NC(info);
		else if (nc == columnRsltGr_dpt_nm) doRsltGr_dpt_nm_NC(info);
		else if (nc == columnRsltGr_lot_no) doRsltGr_lot_no_NC(info);
		else if (nc == columnRsltGr_sublot_no) doRsltGr_sublot_no_NC(info);
		else if (nc == columnRsltGr_loc_cd) doRsltGr_loc_cd_NC(info);
		else if (nc == columnRsltGr_loc_nm) doRsltGr_loc_nm_NC(info);
		else if (nc == columnRsltGr_site_cd) doRsltGr_site_cd_NC(info);
		else if (nc == columnRsltGr_site_nm) doRsltGr_site_nm_NC(info);
		else if (nc == columnRsltGr_lg_grp_cd) doRsltGr_lg_grp_cd_NC(info);
		else if (nc == columnRsltGr_lg_grp_nm) doRsltGr_lg_grp_nm_NC(info);
		else if (nc == columnRsltGr_alloc_grp_cd) doRsltGr_alloc_grp_cd_NC(info);
		else if (nc == columnRsltGr_alloc_grp_nm) doRsltGr_alloc_grp_nm_NC(info);
		else if (nc == columnRsltGr_loc_grp_cd) doRsltGr_loc_grp_cd_NC(info);
		else if (nc == columnRsltGr_loc_grp_nm) doRsltGr_loc_grp_nm_NC(info);
		else if (nc == columnRsltGr_gd_cd) doRsltGr_gd_cd_NC(info);
		else if (nc == columnRsltGr_gd_nm) doRsltGr_gd_nm_NC(info);
		else if (nc == columnRsltGr_quality_typ) doRsltGr_quality_typ_NC(info);
		else if (nc == columnRsltGr_quality_typ_nm) doRsltGr_quality_typ_nm_NC(info);
		else if (nc == columnRsltGr_stk_insp_typ) doRsltGr_stk_insp_typ_NC(info);
		else if (nc == columnRsltGr_stk_insp_typ_nm) doRsltGr_stk_insp_typ_nm_NC(info);
		else if (nc == columnRsltGr_in_xfr_typ) doRsltGr_in_xfr_typ_NC(info);
		else if (nc == columnRsltGr_in_xfr_typ_nm) doRsltGr_in_xfr_typ_nm_NC(info);
		else if (nc == columnRsltGr_asst_typ) doRsltGr_asst_typ_NC(info);
		else if (nc == columnRsltGr_asst_typ_nm) doRsltGr_asst_typ_nm_NC(info);
		else if (nc == columnRsltGr_stk_id_typ) doRsltGr_stk_id_typ_NC(info);
		else if (nc == columnRsltGr_stk_id_typ_nm) doRsltGr_stk_id_typ_nm_NC(info);
		else if (nc == columnRsltGr_stk_bp_cd) doRsltGr_stk_bp_cd_NC(info);
		else if (nc == columnRsltGr_stk_bp_nm) doRsltGr_stk_bp_nm_NC(info);
		else if (nc == columnRsltGr_stk_arrv_bp_cd) doRsltGr_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRsltGr_stk_arrv_bp_nm) doRsltGr_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRsltGr_pack_unit_cd) doRsltGr_pack_unit_cd_NC(info);
		else if (nc == columnRsltGr_pack_unit_nm) doRsltGr_pack_unit_nm_NC(info);
		else if (nc == columnRsltGr_pack_unit_dec_place) doRsltGr_pack_unit_dec_place_NC(info);
		else if (nc == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NC(info);
		else if (nc == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NC(info);
		else if (nc == columnRsltGr_base_unit_dec_place) doRsltGr_base_unit_dec_place_NC(info);
		else if (nc == columnRsltGr_alloc_unit_cd) doRsltGr_alloc_unit_cd_NC(info);
		else if (nc == columnRsltGr_alloc_unit_nm) doRsltGr_alloc_unit_nm_NC(info);
		else if (nc == columnRsltGr_alloc_unit_dec_place) doRsltGr_alloc_unit_dec_place_NC(info);
		else if (nc == columnRsltGr_overdue_alloc_flg) doRsltGr_overdue_alloc_flg_NC(info);
		else if (nc == columnRsltGr_another_loc_alloc_flg) doRsltGr_another_loc_alloc_flg_NC(info);
		else if (nc == columnRsltGr_abnormal_alloc_flg) doRsltGr_abnormal_alloc_flg_NC(info);
		else if (nc == columnRsltGr_cont_fctr_flg) doRsltGr_cont_fctr_flg_NC(info);
		else if (nc == columnRsltGr_cont_fctr_rnd_typ) doRsltGr_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRsltGr_cont_fctr_dec_place) doRsltGr_cont_fctr_dec_place_NC(info);
		else if (nc == columnRsltGr_lot_seq) doRsltGr_lot_seq_NC(info);
		else if (nc == columnRsltGr_first_gr_dt) doRsltGr_first_gr_dt_NC(info);
		else if (nc == columnRsltGr_vld_dt) doRsltGr_vld_dt_NC(info);
		else if (nc == columnRsltGr_lmt_dt) doRsltGr_lmt_dt_NC(info);
		else if (nc == columnRsltGr_plnt_aprv_sts_typ) doRsltGr_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRsltGr_plnt_aprv_sts_typ_nm) doRsltGr_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRsltGr_mrkt_judg_sts_typ) doRsltGr_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRsltGr_mrkt_judg_sts_typ_nm) doRsltGr_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRsltGr_vld_dt_fr) doRsltGr_vld_dt_fr_NC(info);
		else if (nc == columnRsltGr_vld_dt_to) doRsltGr_vld_dt_to_NC(info);
		else if (nc == columnRsltGr_stop_dt) doRsltGr_stop_dt_NC(info);
		else if (nc == columnRsltGr_rel_dt) doRsltGr_rel_dt_NC(info);
		else if (nc == columnRsltGr_alloc_margin_days) doRsltGr_alloc_margin_days_NC(info);
		else if (nc == columnRsltGr_loc_sppl_cd) doRsltGr_loc_sppl_cd_NC(info);
		else if (nc == columnRsltGr_loc_sppl_nm) doRsltGr_loc_sppl_nm_NC(info);
		else if (nc == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NC(info);
		else if (nc == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NC(info);
		else if (nc == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NC(info);
		else if (nc == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRsltGr_io_schd_no) doRsltGr_io_schd_no_NC(info);
		else if (nc == columnRsltGr_io_schd_seq) doRsltGr_io_schd_seq_NC(info);
		else if (nc == columnRsltGr_trd_cd) doRsltGr_trd_cd_NC(info);
		else if (nc == columnRsltGr_trd_nm) doRsltGr_trd_nm_NC(info);
		else if (nc == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NC(info);
		else if (nc == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRsltGr_trn_typ) doRsltGr_trn_typ_NC(info);
		else if (nc == columnRsltGr_trn_typ_nm) doRsltGr_trn_typ_nm_NC(info);
		else if (nc == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NC(info);
		else if (nc == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NC(info);
		else if (nc == columnRsltGi_check) doRsltGi_check_NC(info);
		else if (nc == columnRsltGi_schd_stk_typ) doRsltGi_schd_stk_typ_NC(info);
		else if (nc == columnRsltGi_schd_stk_typ_nm) doRsltGi_schd_stk_typ_nm_NC(info);
		else if (nc == columnRsltGi_dt) doRsltGi_dt_NC(info);
		else if (nc == columnRsltGi_wg_cd) doRsltGi_wg_cd_NC(info);
		else if (nc == columnRsltGi_wg_nm) doRsltGi_wg_nm_NC(info);
		else if (nc == columnRsltGi_dpt_cd) doRsltGi_dpt_cd_NC(info);
		else if (nc == columnRsltGi_dpt_nm) doRsltGi_dpt_nm_NC(info);
		else if (nc == columnRsltGi_lot_no) doRsltGi_lot_no_NC(info);
		else if (nc == columnRsltGi_sublot_no) doRsltGi_sublot_no_NC(info);
		else if (nc == columnRsltGi_loc_cd) doRsltGi_loc_cd_NC(info);
		else if (nc == columnRsltGi_loc_nm) doRsltGi_loc_nm_NC(info);
		else if (nc == columnRsltGi_site_cd) doRsltGi_site_cd_NC(info);
		else if (nc == columnRsltGi_site_nm) doRsltGi_site_nm_NC(info);
		else if (nc == columnRsltGi_lg_grp_cd) doRsltGi_lg_grp_cd_NC(info);
		else if (nc == columnRsltGi_lg_grp_nm) doRsltGi_lg_grp_nm_NC(info);
		else if (nc == columnRsltGi_alloc_grp_cd) doRsltGi_alloc_grp_cd_NC(info);
		else if (nc == columnRsltGi_alloc_grp_nm) doRsltGi_alloc_grp_nm_NC(info);
		else if (nc == columnRsltGi_loc_grp_cd) doRsltGi_loc_grp_cd_NC(info);
		else if (nc == columnRsltGi_loc_grp_nm) doRsltGi_loc_grp_nm_NC(info);
		else if (nc == columnRsltGi_gd_cd) doRsltGi_gd_cd_NC(info);
		else if (nc == columnRsltGi_gd_nm) doRsltGi_gd_nm_NC(info);
		else if (nc == columnRsltGi_quality_typ) doRsltGi_quality_typ_NC(info);
		else if (nc == columnRsltGi_quality_typ_nm) doRsltGi_quality_typ_nm_NC(info);
		else if (nc == columnRsltGi_stk_insp_typ) doRsltGi_stk_insp_typ_NC(info);
		else if (nc == columnRsltGi_stk_insp_typ_nm) doRsltGi_stk_insp_typ_nm_NC(info);
		else if (nc == columnRsltGi_in_xfr_typ) doRsltGi_in_xfr_typ_NC(info);
		else if (nc == columnRsltGi_in_xfr_typ_nm) doRsltGi_in_xfr_typ_nm_NC(info);
		else if (nc == columnRsltGi_asst_typ) doRsltGi_asst_typ_NC(info);
		else if (nc == columnRsltGi_asst_typ_nm) doRsltGi_asst_typ_nm_NC(info);
		else if (nc == columnRsltGi_stk_id_typ) doRsltGi_stk_id_typ_NC(info);
		else if (nc == columnRsltGi_stk_id_typ_nm) doRsltGi_stk_id_typ_nm_NC(info);
		else if (nc == columnRsltGi_stk_bp_cd) doRsltGi_stk_bp_cd_NC(info);
		else if (nc == columnRsltGi_stk_bp_nm) doRsltGi_stk_bp_nm_NC(info);
		else if (nc == columnRsltGi_stk_arrv_bp_cd) doRsltGi_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRsltGi_stk_arrv_bp_nm) doRsltGi_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRsltGi_pack_unit_cd) doRsltGi_pack_unit_cd_NC(info);
		else if (nc == columnRsltGi_pack_unit_nm) doRsltGi_pack_unit_nm_NC(info);
		else if (nc == columnRsltGi_pack_unit_dec_place) doRsltGi_pack_unit_dec_place_NC(info);
		else if (nc == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NC(info);
		else if (nc == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NC(info);
		else if (nc == columnRsltGi_base_unit_dec_place) doRsltGi_base_unit_dec_place_NC(info);
		else if (nc == columnRsltGi_alloc_unit_cd) doRsltGi_alloc_unit_cd_NC(info);
		else if (nc == columnRsltGi_alloc_unit_nm) doRsltGi_alloc_unit_nm_NC(info);
		else if (nc == columnRsltGi_alloc_unit_dec_place) doRsltGi_alloc_unit_dec_place_NC(info);
		else if (nc == columnRsltGi_overdue_alloc_flg) doRsltGi_overdue_alloc_flg_NC(info);
		else if (nc == columnRsltGi_another_loc_alloc_flg) doRsltGi_another_loc_alloc_flg_NC(info);
		else if (nc == columnRsltGi_abnormal_alloc_flg) doRsltGi_abnormal_alloc_flg_NC(info);
		else if (nc == columnRsltGi_cont_fctr_flg) doRsltGi_cont_fctr_flg_NC(info);
		else if (nc == columnRsltGi_cont_fctr_rnd_typ) doRsltGi_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRsltGi_cont_fctr_dec_place) doRsltGi_cont_fctr_dec_place_NC(info);
		else if (nc == columnRsltGi_lot_seq) doRsltGi_lot_seq_NC(info);
		else if (nc == columnRsltGi_first_gr_dt) doRsltGi_first_gr_dt_NC(info);
		else if (nc == columnRsltGi_vld_dt) doRsltGi_vld_dt_NC(info);
		else if (nc == columnRsltGi_lmt_dt) doRsltGi_lmt_dt_NC(info);
		else if (nc == columnRsltGi_plnt_aprv_sts_typ) doRsltGi_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRsltGi_plnt_aprv_sts_typ_nm) doRsltGi_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRsltGi_mrkt_judg_sts_typ) doRsltGi_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRsltGi_mrkt_judg_sts_typ_nm) doRsltGi_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRsltGi_vld_dt_fr) doRsltGi_vld_dt_fr_NC(info);
		else if (nc == columnRsltGi_vld_dt_to) doRsltGi_vld_dt_to_NC(info);
		else if (nc == columnRsltGi_stop_dt) doRsltGi_stop_dt_NC(info);
		else if (nc == columnRsltGi_rel_dt) doRsltGi_rel_dt_NC(info);
		else if (nc == columnRsltGi_alloc_margin_days) doRsltGi_alloc_margin_days_NC(info);
		else if (nc == columnRsltGi_loc_sppl_cd) doRsltGi_loc_sppl_cd_NC(info);
		else if (nc == columnRsltGi_loc_sppl_nm) doRsltGi_loc_sppl_nm_NC(info);
		else if (nc == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NC(info);
		else if (nc == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NC(info);
		else if (nc == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NC(info);
		else if (nc == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRsltGi_io_schd_no) doRsltGi_io_schd_no_NC(info);
		else if (nc == columnRsltGi_io_schd_seq) doRsltGi_io_schd_seq_NC(info);
		else if (nc == columnRsltGi_trd_cd) doRsltGi_trd_cd_NC(info);
		else if (nc == columnRsltGi_trd_nm) doRsltGi_trd_nm_NC(info);
		else if (nc == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NC(info);
		else if (nc == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRsltGi_trn_typ) doRsltGi_trn_typ_NC(info);
		else if (nc == columnRsltGi_trn_typ_nm) doRsltGi_trn_typ_nm_NC(info);
		else if (nc == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NC(info);
		else if (nc == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_prcd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_invld_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_invld_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NC(MCEventInfo info){
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
	 * [HdrQty]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_check_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[overdue_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_overdue_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[another_loc_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_another_loc_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[abnormal_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_abnormal_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_seq_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[rel_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_rel_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_seq_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_check_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[overdue_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_overdue_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[another_loc_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_another_loc_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[abnormal_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_abnormal_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_seq_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[rel_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_rel_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_seq_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == RsltGrTable) doRsltGr_NE(info);
		else if (ne == RsltGiTable) doRsltGi_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_tgt_Group) doCnd_tgt_NE(info);
		else if (ne == Cnd_gr_prcd) doCnd_gr_prcd_NE(info);
		else if (ne == Cnd_gr_sts_opn_grp) doCnd_gr_sts_opn_grp_NE(info);
		else if (ne == Cnd_gr_sts_ordsav_grp) doCnd_gr_sts_ordsav_grp_NE(info);
		else if (ne == Cnd_gr_sts_fix_grp) doCnd_gr_sts_fix_grp_NE(info);
		else if (ne == Cnd_gr_sts_schd_grp) doCnd_gr_sts_schd_grp_NE(info);
		else if (ne == Cnd_gr_sts_ord_grp) doCnd_gr_sts_ord_grp_NE(info);
		else if (ne == Cnd_gr_act) doCnd_gr_act_NE(info);
		else if (ne == Cnd_gi_prcd) doCnd_gi_prcd_NE(info);
		else if (ne == Cnd_gi_sts_opn_grp) doCnd_gi_sts_opn_grp_NE(info);
		else if (ne == Cnd_gi_sts_ordsav_grp) doCnd_gi_sts_ordsav_grp_NE(info);
		else if (ne == Cnd_gi_sts_fix_grp) doCnd_gi_sts_fix_grp_NE(info);
		else if (ne == Cnd_gi_sts_schd_grp) doCnd_gi_sts_schd_grp_NE(info);
		else if (ne == Cnd_gi_sts_ord_grp) doCnd_gi_sts_ord_grp_NE(info);
		else if (ne == Cnd_gi_act) doCnd_gi_act_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_avl_schd_dt) doCnd_avl_schd_dt_NE(info);
		else if (ne == Cnd_except_invld_lot_flg) doCnd_except_invld_lot_flg_NE(info);
		else if (ne == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NE(info);
		else if (ne == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NE(info);
		else if (ne == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == HdrQty_base_unit_dec_place) doHdrQty_base_unit_dec_place_NE(info);
		else if (ne == HdrQty_base_unit_cd) doHdrQty_base_unit_cd_NE(info);
		else if (ne == HdrQty_base_unit_nm) doHdrQty_base_unit_nm_NE(info);
		else if (ne == HdrContFctr_cont_fctr_flg) doHdrContFctr_cont_fctr_flg_NE(info);
		else if (ne == HdrContFctr_cont_fctr_dec_place) doHdrContFctr_cont_fctr_dec_place_NE(info);
		else if (ne == HdrContFctr_cont_fctr_rnd_typ) doHdrContFctr_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRsltGr_check) doRsltGr_check_NE(info);
		else if (ne == columnRsltGr_schd_stk_typ) doRsltGr_schd_stk_typ_NE(info);
		else if (ne == columnRsltGr_schd_stk_typ_nm) doRsltGr_schd_stk_typ_nm_NE(info);
		else if (ne == columnRsltGr_dt) doRsltGr_dt_NE(info);
		else if (ne == columnRsltGr_wg_cd) doRsltGr_wg_cd_NE(info);
		else if (ne == columnRsltGr_wg_nm) doRsltGr_wg_nm_NE(info);
		else if (ne == columnRsltGr_dpt_cd) doRsltGr_dpt_cd_NE(info);
		else if (ne == columnRsltGr_dpt_nm) doRsltGr_dpt_nm_NE(info);
		else if (ne == columnRsltGr_lot_no) doRsltGr_lot_no_NE(info);
		else if (ne == columnRsltGr_sublot_no) doRsltGr_sublot_no_NE(info);
		else if (ne == columnRsltGr_loc_cd) doRsltGr_loc_cd_NE(info);
		else if (ne == columnRsltGr_loc_nm) doRsltGr_loc_nm_NE(info);
		else if (ne == columnRsltGr_site_cd) doRsltGr_site_cd_NE(info);
		else if (ne == columnRsltGr_site_nm) doRsltGr_site_nm_NE(info);
		else if (ne == columnRsltGr_lg_grp_cd) doRsltGr_lg_grp_cd_NE(info);
		else if (ne == columnRsltGr_lg_grp_nm) doRsltGr_lg_grp_nm_NE(info);
		else if (ne == columnRsltGr_alloc_grp_cd) doRsltGr_alloc_grp_cd_NE(info);
		else if (ne == columnRsltGr_alloc_grp_nm) doRsltGr_alloc_grp_nm_NE(info);
		else if (ne == columnRsltGr_loc_grp_cd) doRsltGr_loc_grp_cd_NE(info);
		else if (ne == columnRsltGr_loc_grp_nm) doRsltGr_loc_grp_nm_NE(info);
		else if (ne == columnRsltGr_gd_cd) doRsltGr_gd_cd_NE(info);
		else if (ne == columnRsltGr_gd_nm) doRsltGr_gd_nm_NE(info);
		else if (ne == columnRsltGr_quality_typ) doRsltGr_quality_typ_NE(info);
		else if (ne == columnRsltGr_quality_typ_nm) doRsltGr_quality_typ_nm_NE(info);
		else if (ne == columnRsltGr_stk_insp_typ) doRsltGr_stk_insp_typ_NE(info);
		else if (ne == columnRsltGr_stk_insp_typ_nm) doRsltGr_stk_insp_typ_nm_NE(info);
		else if (ne == columnRsltGr_in_xfr_typ) doRsltGr_in_xfr_typ_NE(info);
		else if (ne == columnRsltGr_in_xfr_typ_nm) doRsltGr_in_xfr_typ_nm_NE(info);
		else if (ne == columnRsltGr_asst_typ) doRsltGr_asst_typ_NE(info);
		else if (ne == columnRsltGr_asst_typ_nm) doRsltGr_asst_typ_nm_NE(info);
		else if (ne == columnRsltGr_stk_id_typ) doRsltGr_stk_id_typ_NE(info);
		else if (ne == columnRsltGr_stk_id_typ_nm) doRsltGr_stk_id_typ_nm_NE(info);
		else if (ne == columnRsltGr_stk_bp_cd) doRsltGr_stk_bp_cd_NE(info);
		else if (ne == columnRsltGr_stk_bp_nm) doRsltGr_stk_bp_nm_NE(info);
		else if (ne == columnRsltGr_stk_arrv_bp_cd) doRsltGr_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRsltGr_stk_arrv_bp_nm) doRsltGr_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRsltGr_pack_unit_cd) doRsltGr_pack_unit_cd_NE(info);
		else if (ne == columnRsltGr_pack_unit_nm) doRsltGr_pack_unit_nm_NE(info);
		else if (ne == columnRsltGr_pack_unit_dec_place) doRsltGr_pack_unit_dec_place_NE(info);
		else if (ne == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NE(info);
		else if (ne == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NE(info);
		else if (ne == columnRsltGr_base_unit_dec_place) doRsltGr_base_unit_dec_place_NE(info);
		else if (ne == columnRsltGr_alloc_unit_cd) doRsltGr_alloc_unit_cd_NE(info);
		else if (ne == columnRsltGr_alloc_unit_nm) doRsltGr_alloc_unit_nm_NE(info);
		else if (ne == columnRsltGr_alloc_unit_dec_place) doRsltGr_alloc_unit_dec_place_NE(info);
		else if (ne == columnRsltGr_overdue_alloc_flg) doRsltGr_overdue_alloc_flg_NE(info);
		else if (ne == columnRsltGr_another_loc_alloc_flg) doRsltGr_another_loc_alloc_flg_NE(info);
		else if (ne == columnRsltGr_abnormal_alloc_flg) doRsltGr_abnormal_alloc_flg_NE(info);
		else if (ne == columnRsltGr_cont_fctr_flg) doRsltGr_cont_fctr_flg_NE(info);
		else if (ne == columnRsltGr_cont_fctr_rnd_typ) doRsltGr_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRsltGr_cont_fctr_dec_place) doRsltGr_cont_fctr_dec_place_NE(info);
		else if (ne == columnRsltGr_lot_seq) doRsltGr_lot_seq_NE(info);
		else if (ne == columnRsltGr_first_gr_dt) doRsltGr_first_gr_dt_NE(info);
		else if (ne == columnRsltGr_vld_dt) doRsltGr_vld_dt_NE(info);
		else if (ne == columnRsltGr_lmt_dt) doRsltGr_lmt_dt_NE(info);
		else if (ne == columnRsltGr_plnt_aprv_sts_typ) doRsltGr_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRsltGr_plnt_aprv_sts_typ_nm) doRsltGr_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRsltGr_mrkt_judg_sts_typ) doRsltGr_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRsltGr_mrkt_judg_sts_typ_nm) doRsltGr_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRsltGr_vld_dt_fr) doRsltGr_vld_dt_fr_NE(info);
		else if (ne == columnRsltGr_vld_dt_to) doRsltGr_vld_dt_to_NE(info);
		else if (ne == columnRsltGr_stop_dt) doRsltGr_stop_dt_NE(info);
		else if (ne == columnRsltGr_rel_dt) doRsltGr_rel_dt_NE(info);
		else if (ne == columnRsltGr_alloc_margin_days) doRsltGr_alloc_margin_days_NE(info);
		else if (ne == columnRsltGr_loc_sppl_cd) doRsltGr_loc_sppl_cd_NE(info);
		else if (ne == columnRsltGr_loc_sppl_nm) doRsltGr_loc_sppl_nm_NE(info);
		else if (ne == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NE(info);
		else if (ne == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NE(info);
		else if (ne == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NE(info);
		else if (ne == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRsltGr_io_schd_no) doRsltGr_io_schd_no_NE(info);
		else if (ne == columnRsltGr_io_schd_seq) doRsltGr_io_schd_seq_NE(info);
		else if (ne == columnRsltGr_trd_cd) doRsltGr_trd_cd_NE(info);
		else if (ne == columnRsltGr_trd_nm) doRsltGr_trd_nm_NE(info);
		else if (ne == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NE(info);
		else if (ne == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRsltGr_trn_typ) doRsltGr_trn_typ_NE(info);
		else if (ne == columnRsltGr_trn_typ_nm) doRsltGr_trn_typ_nm_NE(info);
		else if (ne == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NE(info);
		else if (ne == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NE(info);
		else if (ne == columnRsltGi_check) doRsltGi_check_NE(info);
		else if (ne == columnRsltGi_schd_stk_typ) doRsltGi_schd_stk_typ_NE(info);
		else if (ne == columnRsltGi_schd_stk_typ_nm) doRsltGi_schd_stk_typ_nm_NE(info);
		else if (ne == columnRsltGi_dt) doRsltGi_dt_NE(info);
		else if (ne == columnRsltGi_wg_cd) doRsltGi_wg_cd_NE(info);
		else if (ne == columnRsltGi_wg_nm) doRsltGi_wg_nm_NE(info);
		else if (ne == columnRsltGi_dpt_cd) doRsltGi_dpt_cd_NE(info);
		else if (ne == columnRsltGi_dpt_nm) doRsltGi_dpt_nm_NE(info);
		else if (ne == columnRsltGi_lot_no) doRsltGi_lot_no_NE(info);
		else if (ne == columnRsltGi_sublot_no) doRsltGi_sublot_no_NE(info);
		else if (ne == columnRsltGi_loc_cd) doRsltGi_loc_cd_NE(info);
		else if (ne == columnRsltGi_loc_nm) doRsltGi_loc_nm_NE(info);
		else if (ne == columnRsltGi_site_cd) doRsltGi_site_cd_NE(info);
		else if (ne == columnRsltGi_site_nm) doRsltGi_site_nm_NE(info);
		else if (ne == columnRsltGi_lg_grp_cd) doRsltGi_lg_grp_cd_NE(info);
		else if (ne == columnRsltGi_lg_grp_nm) doRsltGi_lg_grp_nm_NE(info);
		else if (ne == columnRsltGi_alloc_grp_cd) doRsltGi_alloc_grp_cd_NE(info);
		else if (ne == columnRsltGi_alloc_grp_nm) doRsltGi_alloc_grp_nm_NE(info);
		else if (ne == columnRsltGi_loc_grp_cd) doRsltGi_loc_grp_cd_NE(info);
		else if (ne == columnRsltGi_loc_grp_nm) doRsltGi_loc_grp_nm_NE(info);
		else if (ne == columnRsltGi_gd_cd) doRsltGi_gd_cd_NE(info);
		else if (ne == columnRsltGi_gd_nm) doRsltGi_gd_nm_NE(info);
		else if (ne == columnRsltGi_quality_typ) doRsltGi_quality_typ_NE(info);
		else if (ne == columnRsltGi_quality_typ_nm) doRsltGi_quality_typ_nm_NE(info);
		else if (ne == columnRsltGi_stk_insp_typ) doRsltGi_stk_insp_typ_NE(info);
		else if (ne == columnRsltGi_stk_insp_typ_nm) doRsltGi_stk_insp_typ_nm_NE(info);
		else if (ne == columnRsltGi_in_xfr_typ) doRsltGi_in_xfr_typ_NE(info);
		else if (ne == columnRsltGi_in_xfr_typ_nm) doRsltGi_in_xfr_typ_nm_NE(info);
		else if (ne == columnRsltGi_asst_typ) doRsltGi_asst_typ_NE(info);
		else if (ne == columnRsltGi_asst_typ_nm) doRsltGi_asst_typ_nm_NE(info);
		else if (ne == columnRsltGi_stk_id_typ) doRsltGi_stk_id_typ_NE(info);
		else if (ne == columnRsltGi_stk_id_typ_nm) doRsltGi_stk_id_typ_nm_NE(info);
		else if (ne == columnRsltGi_stk_bp_cd) doRsltGi_stk_bp_cd_NE(info);
		else if (ne == columnRsltGi_stk_bp_nm) doRsltGi_stk_bp_nm_NE(info);
		else if (ne == columnRsltGi_stk_arrv_bp_cd) doRsltGi_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRsltGi_stk_arrv_bp_nm) doRsltGi_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRsltGi_pack_unit_cd) doRsltGi_pack_unit_cd_NE(info);
		else if (ne == columnRsltGi_pack_unit_nm) doRsltGi_pack_unit_nm_NE(info);
		else if (ne == columnRsltGi_pack_unit_dec_place) doRsltGi_pack_unit_dec_place_NE(info);
		else if (ne == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NE(info);
		else if (ne == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NE(info);
		else if (ne == columnRsltGi_base_unit_dec_place) doRsltGi_base_unit_dec_place_NE(info);
		else if (ne == columnRsltGi_alloc_unit_cd) doRsltGi_alloc_unit_cd_NE(info);
		else if (ne == columnRsltGi_alloc_unit_nm) doRsltGi_alloc_unit_nm_NE(info);
		else if (ne == columnRsltGi_alloc_unit_dec_place) doRsltGi_alloc_unit_dec_place_NE(info);
		else if (ne == columnRsltGi_overdue_alloc_flg) doRsltGi_overdue_alloc_flg_NE(info);
		else if (ne == columnRsltGi_another_loc_alloc_flg) doRsltGi_another_loc_alloc_flg_NE(info);
		else if (ne == columnRsltGi_abnormal_alloc_flg) doRsltGi_abnormal_alloc_flg_NE(info);
		else if (ne == columnRsltGi_cont_fctr_flg) doRsltGi_cont_fctr_flg_NE(info);
		else if (ne == columnRsltGi_cont_fctr_rnd_typ) doRsltGi_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRsltGi_cont_fctr_dec_place) doRsltGi_cont_fctr_dec_place_NE(info);
		else if (ne == columnRsltGi_lot_seq) doRsltGi_lot_seq_NE(info);
		else if (ne == columnRsltGi_first_gr_dt) doRsltGi_first_gr_dt_NE(info);
		else if (ne == columnRsltGi_vld_dt) doRsltGi_vld_dt_NE(info);
		else if (ne == columnRsltGi_lmt_dt) doRsltGi_lmt_dt_NE(info);
		else if (ne == columnRsltGi_plnt_aprv_sts_typ) doRsltGi_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRsltGi_plnt_aprv_sts_typ_nm) doRsltGi_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRsltGi_mrkt_judg_sts_typ) doRsltGi_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRsltGi_mrkt_judg_sts_typ_nm) doRsltGi_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRsltGi_vld_dt_fr) doRsltGi_vld_dt_fr_NE(info);
		else if (ne == columnRsltGi_vld_dt_to) doRsltGi_vld_dt_to_NE(info);
		else if (ne == columnRsltGi_stop_dt) doRsltGi_stop_dt_NE(info);
		else if (ne == columnRsltGi_rel_dt) doRsltGi_rel_dt_NE(info);
		else if (ne == columnRsltGi_alloc_margin_days) doRsltGi_alloc_margin_days_NE(info);
		else if (ne == columnRsltGi_loc_sppl_cd) doRsltGi_loc_sppl_cd_NE(info);
		else if (ne == columnRsltGi_loc_sppl_nm) doRsltGi_loc_sppl_nm_NE(info);
		else if (ne == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NE(info);
		else if (ne == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NE(info);
		else if (ne == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NE(info);
		else if (ne == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRsltGi_io_schd_no) doRsltGi_io_schd_no_NE(info);
		else if (ne == columnRsltGi_io_schd_seq) doRsltGi_io_schd_seq_NE(info);
		else if (ne == columnRsltGi_trd_cd) doRsltGi_trd_cd_NE(info);
		else if (ne == columnRsltGi_trd_nm) doRsltGi_trd_nm_NE(info);
		else if (ne == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NE(info);
		else if (ne == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRsltGi_trn_typ) doRsltGi_trn_typ_NE(info);
		else if (ne == columnRsltGi_trn_typ_nm) doRsltGi_trn_typ_nm_NE(info);
		else if (ne == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NE(info);
		else if (ne == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_prcd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_invld_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_invld_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NE(MCEventInfo info){
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
	 * [HdrQty]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_check_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[overdue_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_overdue_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[another_loc_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_another_loc_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[abnormal_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_abnormal_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_seq_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[rel_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_rel_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_seq_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_check_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[overdue_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_overdue_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[another_loc_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_another_loc_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[abnormal_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_abnormal_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_seq_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[rel_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_rel_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_seq_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == RsltGrTable) doRsltGr_NX(info);
		else if (nx == RsltGiTable) doRsltGi_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_tgt_Group) doCnd_tgt_NX(info);
		else if (nx == Cnd_gr_prcd) doCnd_gr_prcd_NX(info);
		else if (nx == Cnd_gr_sts_opn_grp) doCnd_gr_sts_opn_grp_NX(info);
		else if (nx == Cnd_gr_sts_ordsav_grp) doCnd_gr_sts_ordsav_grp_NX(info);
		else if (nx == Cnd_gr_sts_fix_grp) doCnd_gr_sts_fix_grp_NX(info);
		else if (nx == Cnd_gr_sts_schd_grp) doCnd_gr_sts_schd_grp_NX(info);
		else if (nx == Cnd_gr_sts_ord_grp) doCnd_gr_sts_ord_grp_NX(info);
		else if (nx == Cnd_gr_act) doCnd_gr_act_NX(info);
		else if (nx == Cnd_gi_prcd) doCnd_gi_prcd_NX(info);
		else if (nx == Cnd_gi_sts_opn_grp) doCnd_gi_sts_opn_grp_NX(info);
		else if (nx == Cnd_gi_sts_ordsav_grp) doCnd_gi_sts_ordsav_grp_NX(info);
		else if (nx == Cnd_gi_sts_fix_grp) doCnd_gi_sts_fix_grp_NX(info);
		else if (nx == Cnd_gi_sts_schd_grp) doCnd_gi_sts_schd_grp_NX(info);
		else if (nx == Cnd_gi_sts_ord_grp) doCnd_gi_sts_ord_grp_NX(info);
		else if (nx == Cnd_gi_act) doCnd_gi_act_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_avl_schd_dt) doCnd_avl_schd_dt_NX(info);
		else if (nx == Cnd_except_invld_lot_flg) doCnd_except_invld_lot_flg_NX(info);
		else if (nx == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NX(info);
		else if (nx == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NX(info);
		else if (nx == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == HdrQty_base_unit_dec_place) doHdrQty_base_unit_dec_place_NX(info);
		else if (nx == HdrQty_base_unit_cd) doHdrQty_base_unit_cd_NX(info);
		else if (nx == HdrQty_base_unit_nm) doHdrQty_base_unit_nm_NX(info);
		else if (nx == HdrContFctr_cont_fctr_flg) doHdrContFctr_cont_fctr_flg_NX(info);
		else if (nx == HdrContFctr_cont_fctr_dec_place) doHdrContFctr_cont_fctr_dec_place_NX(info);
		else if (nx == HdrContFctr_cont_fctr_rnd_typ) doHdrContFctr_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRsltGr_check) doRsltGr_check_NX(info);
		else if (nx == columnRsltGr_schd_stk_typ) doRsltGr_schd_stk_typ_NX(info);
		else if (nx == columnRsltGr_schd_stk_typ_nm) doRsltGr_schd_stk_typ_nm_NX(info);
		else if (nx == columnRsltGr_dt) doRsltGr_dt_NX(info);
		else if (nx == columnRsltGr_wg_cd) doRsltGr_wg_cd_NX(info);
		else if (nx == columnRsltGr_wg_nm) doRsltGr_wg_nm_NX(info);
		else if (nx == columnRsltGr_dpt_cd) doRsltGr_dpt_cd_NX(info);
		else if (nx == columnRsltGr_dpt_nm) doRsltGr_dpt_nm_NX(info);
		else if (nx == columnRsltGr_lot_no) doRsltGr_lot_no_NX(info);
		else if (nx == columnRsltGr_sublot_no) doRsltGr_sublot_no_NX(info);
		else if (nx == columnRsltGr_loc_cd) doRsltGr_loc_cd_NX(info);
		else if (nx == columnRsltGr_loc_nm) doRsltGr_loc_nm_NX(info);
		else if (nx == columnRsltGr_site_cd) doRsltGr_site_cd_NX(info);
		else if (nx == columnRsltGr_site_nm) doRsltGr_site_nm_NX(info);
		else if (nx == columnRsltGr_lg_grp_cd) doRsltGr_lg_grp_cd_NX(info);
		else if (nx == columnRsltGr_lg_grp_nm) doRsltGr_lg_grp_nm_NX(info);
		else if (nx == columnRsltGr_alloc_grp_cd) doRsltGr_alloc_grp_cd_NX(info);
		else if (nx == columnRsltGr_alloc_grp_nm) doRsltGr_alloc_grp_nm_NX(info);
		else if (nx == columnRsltGr_loc_grp_cd) doRsltGr_loc_grp_cd_NX(info);
		else if (nx == columnRsltGr_loc_grp_nm) doRsltGr_loc_grp_nm_NX(info);
		else if (nx == columnRsltGr_gd_cd) doRsltGr_gd_cd_NX(info);
		else if (nx == columnRsltGr_gd_nm) doRsltGr_gd_nm_NX(info);
		else if (nx == columnRsltGr_quality_typ) doRsltGr_quality_typ_NX(info);
		else if (nx == columnRsltGr_quality_typ_nm) doRsltGr_quality_typ_nm_NX(info);
		else if (nx == columnRsltGr_stk_insp_typ) doRsltGr_stk_insp_typ_NX(info);
		else if (nx == columnRsltGr_stk_insp_typ_nm) doRsltGr_stk_insp_typ_nm_NX(info);
		else if (nx == columnRsltGr_in_xfr_typ) doRsltGr_in_xfr_typ_NX(info);
		else if (nx == columnRsltGr_in_xfr_typ_nm) doRsltGr_in_xfr_typ_nm_NX(info);
		else if (nx == columnRsltGr_asst_typ) doRsltGr_asst_typ_NX(info);
		else if (nx == columnRsltGr_asst_typ_nm) doRsltGr_asst_typ_nm_NX(info);
		else if (nx == columnRsltGr_stk_id_typ) doRsltGr_stk_id_typ_NX(info);
		else if (nx == columnRsltGr_stk_id_typ_nm) doRsltGr_stk_id_typ_nm_NX(info);
		else if (nx == columnRsltGr_stk_bp_cd) doRsltGr_stk_bp_cd_NX(info);
		else if (nx == columnRsltGr_stk_bp_nm) doRsltGr_stk_bp_nm_NX(info);
		else if (nx == columnRsltGr_stk_arrv_bp_cd) doRsltGr_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRsltGr_stk_arrv_bp_nm) doRsltGr_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRsltGr_pack_unit_cd) doRsltGr_pack_unit_cd_NX(info);
		else if (nx == columnRsltGr_pack_unit_nm) doRsltGr_pack_unit_nm_NX(info);
		else if (nx == columnRsltGr_pack_unit_dec_place) doRsltGr_pack_unit_dec_place_NX(info);
		else if (nx == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NX(info);
		else if (nx == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NX(info);
		else if (nx == columnRsltGr_base_unit_dec_place) doRsltGr_base_unit_dec_place_NX(info);
		else if (nx == columnRsltGr_alloc_unit_cd) doRsltGr_alloc_unit_cd_NX(info);
		else if (nx == columnRsltGr_alloc_unit_nm) doRsltGr_alloc_unit_nm_NX(info);
		else if (nx == columnRsltGr_alloc_unit_dec_place) doRsltGr_alloc_unit_dec_place_NX(info);
		else if (nx == columnRsltGr_overdue_alloc_flg) doRsltGr_overdue_alloc_flg_NX(info);
		else if (nx == columnRsltGr_another_loc_alloc_flg) doRsltGr_another_loc_alloc_flg_NX(info);
		else if (nx == columnRsltGr_abnormal_alloc_flg) doRsltGr_abnormal_alloc_flg_NX(info);
		else if (nx == columnRsltGr_cont_fctr_flg) doRsltGr_cont_fctr_flg_NX(info);
		else if (nx == columnRsltGr_cont_fctr_rnd_typ) doRsltGr_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRsltGr_cont_fctr_dec_place) doRsltGr_cont_fctr_dec_place_NX(info);
		else if (nx == columnRsltGr_lot_seq) doRsltGr_lot_seq_NX(info);
		else if (nx == columnRsltGr_first_gr_dt) doRsltGr_first_gr_dt_NX(info);
		else if (nx == columnRsltGr_vld_dt) doRsltGr_vld_dt_NX(info);
		else if (nx == columnRsltGr_lmt_dt) doRsltGr_lmt_dt_NX(info);
		else if (nx == columnRsltGr_plnt_aprv_sts_typ) doRsltGr_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRsltGr_plnt_aprv_sts_typ_nm) doRsltGr_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRsltGr_mrkt_judg_sts_typ) doRsltGr_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRsltGr_mrkt_judg_sts_typ_nm) doRsltGr_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRsltGr_vld_dt_fr) doRsltGr_vld_dt_fr_NX(info);
		else if (nx == columnRsltGr_vld_dt_to) doRsltGr_vld_dt_to_NX(info);
		else if (nx == columnRsltGr_stop_dt) doRsltGr_stop_dt_NX(info);
		else if (nx == columnRsltGr_rel_dt) doRsltGr_rel_dt_NX(info);
		else if (nx == columnRsltGr_alloc_margin_days) doRsltGr_alloc_margin_days_NX(info);
		else if (nx == columnRsltGr_loc_sppl_cd) doRsltGr_loc_sppl_cd_NX(info);
		else if (nx == columnRsltGr_loc_sppl_nm) doRsltGr_loc_sppl_nm_NX(info);
		else if (nx == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NX(info);
		else if (nx == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NX(info);
		else if (nx == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NX(info);
		else if (nx == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRsltGr_io_schd_no) doRsltGr_io_schd_no_NX(info);
		else if (nx == columnRsltGr_io_schd_seq) doRsltGr_io_schd_seq_NX(info);
		else if (nx == columnRsltGr_trd_cd) doRsltGr_trd_cd_NX(info);
		else if (nx == columnRsltGr_trd_nm) doRsltGr_trd_nm_NX(info);
		else if (nx == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NX(info);
		else if (nx == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRsltGr_trn_typ) doRsltGr_trn_typ_NX(info);
		else if (nx == columnRsltGr_trn_typ_nm) doRsltGr_trn_typ_nm_NX(info);
		else if (nx == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NX(info);
		else if (nx == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NX(info);
		else if (nx == columnRsltGi_check) doRsltGi_check_NX(info);
		else if (nx == columnRsltGi_schd_stk_typ) doRsltGi_schd_stk_typ_NX(info);
		else if (nx == columnRsltGi_schd_stk_typ_nm) doRsltGi_schd_stk_typ_nm_NX(info);
		else if (nx == columnRsltGi_dt) doRsltGi_dt_NX(info);
		else if (nx == columnRsltGi_wg_cd) doRsltGi_wg_cd_NX(info);
		else if (nx == columnRsltGi_wg_nm) doRsltGi_wg_nm_NX(info);
		else if (nx == columnRsltGi_dpt_cd) doRsltGi_dpt_cd_NX(info);
		else if (nx == columnRsltGi_dpt_nm) doRsltGi_dpt_nm_NX(info);
		else if (nx == columnRsltGi_lot_no) doRsltGi_lot_no_NX(info);
		else if (nx == columnRsltGi_sublot_no) doRsltGi_sublot_no_NX(info);
		else if (nx == columnRsltGi_loc_cd) doRsltGi_loc_cd_NX(info);
		else if (nx == columnRsltGi_loc_nm) doRsltGi_loc_nm_NX(info);
		else if (nx == columnRsltGi_site_cd) doRsltGi_site_cd_NX(info);
		else if (nx == columnRsltGi_site_nm) doRsltGi_site_nm_NX(info);
		else if (nx == columnRsltGi_lg_grp_cd) doRsltGi_lg_grp_cd_NX(info);
		else if (nx == columnRsltGi_lg_grp_nm) doRsltGi_lg_grp_nm_NX(info);
		else if (nx == columnRsltGi_alloc_grp_cd) doRsltGi_alloc_grp_cd_NX(info);
		else if (nx == columnRsltGi_alloc_grp_nm) doRsltGi_alloc_grp_nm_NX(info);
		else if (nx == columnRsltGi_loc_grp_cd) doRsltGi_loc_grp_cd_NX(info);
		else if (nx == columnRsltGi_loc_grp_nm) doRsltGi_loc_grp_nm_NX(info);
		else if (nx == columnRsltGi_gd_cd) doRsltGi_gd_cd_NX(info);
		else if (nx == columnRsltGi_gd_nm) doRsltGi_gd_nm_NX(info);
		else if (nx == columnRsltGi_quality_typ) doRsltGi_quality_typ_NX(info);
		else if (nx == columnRsltGi_quality_typ_nm) doRsltGi_quality_typ_nm_NX(info);
		else if (nx == columnRsltGi_stk_insp_typ) doRsltGi_stk_insp_typ_NX(info);
		else if (nx == columnRsltGi_stk_insp_typ_nm) doRsltGi_stk_insp_typ_nm_NX(info);
		else if (nx == columnRsltGi_in_xfr_typ) doRsltGi_in_xfr_typ_NX(info);
		else if (nx == columnRsltGi_in_xfr_typ_nm) doRsltGi_in_xfr_typ_nm_NX(info);
		else if (nx == columnRsltGi_asst_typ) doRsltGi_asst_typ_NX(info);
		else if (nx == columnRsltGi_asst_typ_nm) doRsltGi_asst_typ_nm_NX(info);
		else if (nx == columnRsltGi_stk_id_typ) doRsltGi_stk_id_typ_NX(info);
		else if (nx == columnRsltGi_stk_id_typ_nm) doRsltGi_stk_id_typ_nm_NX(info);
		else if (nx == columnRsltGi_stk_bp_cd) doRsltGi_stk_bp_cd_NX(info);
		else if (nx == columnRsltGi_stk_bp_nm) doRsltGi_stk_bp_nm_NX(info);
		else if (nx == columnRsltGi_stk_arrv_bp_cd) doRsltGi_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRsltGi_stk_arrv_bp_nm) doRsltGi_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRsltGi_pack_unit_cd) doRsltGi_pack_unit_cd_NX(info);
		else if (nx == columnRsltGi_pack_unit_nm) doRsltGi_pack_unit_nm_NX(info);
		else if (nx == columnRsltGi_pack_unit_dec_place) doRsltGi_pack_unit_dec_place_NX(info);
		else if (nx == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NX(info);
		else if (nx == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NX(info);
		else if (nx == columnRsltGi_base_unit_dec_place) doRsltGi_base_unit_dec_place_NX(info);
		else if (nx == columnRsltGi_alloc_unit_cd) doRsltGi_alloc_unit_cd_NX(info);
		else if (nx == columnRsltGi_alloc_unit_nm) doRsltGi_alloc_unit_nm_NX(info);
		else if (nx == columnRsltGi_alloc_unit_dec_place) doRsltGi_alloc_unit_dec_place_NX(info);
		else if (nx == columnRsltGi_overdue_alloc_flg) doRsltGi_overdue_alloc_flg_NX(info);
		else if (nx == columnRsltGi_another_loc_alloc_flg) doRsltGi_another_loc_alloc_flg_NX(info);
		else if (nx == columnRsltGi_abnormal_alloc_flg) doRsltGi_abnormal_alloc_flg_NX(info);
		else if (nx == columnRsltGi_cont_fctr_flg) doRsltGi_cont_fctr_flg_NX(info);
		else if (nx == columnRsltGi_cont_fctr_rnd_typ) doRsltGi_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRsltGi_cont_fctr_dec_place) doRsltGi_cont_fctr_dec_place_NX(info);
		else if (nx == columnRsltGi_lot_seq) doRsltGi_lot_seq_NX(info);
		else if (nx == columnRsltGi_first_gr_dt) doRsltGi_first_gr_dt_NX(info);
		else if (nx == columnRsltGi_vld_dt) doRsltGi_vld_dt_NX(info);
		else if (nx == columnRsltGi_lmt_dt) doRsltGi_lmt_dt_NX(info);
		else if (nx == columnRsltGi_plnt_aprv_sts_typ) doRsltGi_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRsltGi_plnt_aprv_sts_typ_nm) doRsltGi_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRsltGi_mrkt_judg_sts_typ) doRsltGi_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRsltGi_mrkt_judg_sts_typ_nm) doRsltGi_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRsltGi_vld_dt_fr) doRsltGi_vld_dt_fr_NX(info);
		else if (nx == columnRsltGi_vld_dt_to) doRsltGi_vld_dt_to_NX(info);
		else if (nx == columnRsltGi_stop_dt) doRsltGi_stop_dt_NX(info);
		else if (nx == columnRsltGi_rel_dt) doRsltGi_rel_dt_NX(info);
		else if (nx == columnRsltGi_alloc_margin_days) doRsltGi_alloc_margin_days_NX(info);
		else if (nx == columnRsltGi_loc_sppl_cd) doRsltGi_loc_sppl_cd_NX(info);
		else if (nx == columnRsltGi_loc_sppl_nm) doRsltGi_loc_sppl_nm_NX(info);
		else if (nx == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NX(info);
		else if (nx == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NX(info);
		else if (nx == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NX(info);
		else if (nx == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRsltGi_io_schd_no) doRsltGi_io_schd_no_NX(info);
		else if (nx == columnRsltGi_io_schd_seq) doRsltGi_io_schd_seq_NX(info);
		else if (nx == columnRsltGi_trd_cd) doRsltGi_trd_cd_NX(info);
		else if (nx == columnRsltGi_trd_nm) doRsltGi_trd_nm_NX(info);
		else if (nx == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NX(info);
		else if (nx == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRsltGi_trn_typ) doRsltGi_trn_typ_NX(info);
		else if (nx == columnRsltGi_trn_typ_nm) doRsltGi_trn_typ_nm_NX(info);
		else if (nx == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NX(info);
		else if (nx == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_prcd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_invld_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_invld_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NX(MCEventInfo info){
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
	 * [HdrQty]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_check_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[overdue_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_overdue_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[another_loc_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_another_loc_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[abnormal_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_abnormal_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_seq_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[rel_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_rel_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_seq_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_check_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[overdue_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_overdue_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[another_loc_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_another_loc_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[abnormal_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_abnormal_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_seq_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[rel_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_rel_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_seq_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
		else if (lc == Cnd_avl_schd_dt) doCnd_avl_schd_dt_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_LC(info);
		else if (lc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == HdrQty_base_unit_dec_place) doHdrQty_base_unit_dec_place_LC(info);
		else if (lc == HdrQty_base_unit_cd) doHdrQty_base_unit_cd_LC(info);
		else if (lc == HdrQty_base_unit_nm) doHdrQty_base_unit_nm_LC(info);
		else if (lc == HdrContFctr_cont_fctr_dec_place) doHdrContFctr_cont_fctr_dec_place_LC(info);
		else if (lc == HdrContFctr_cont_fctr_rnd_typ) doHdrContFctr_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRsltGr_schd_stk_typ) doRsltGr_schd_stk_typ_LC(info);
		else if (lc == columnRsltGr_schd_stk_typ_nm) doRsltGr_schd_stk_typ_nm_LC(info);
		else if (lc == columnRsltGr_dt) doRsltGr_dt_LC(info);
		else if (lc == columnRsltGr_wg_cd) doRsltGr_wg_cd_LC(info);
		else if (lc == columnRsltGr_wg_nm) doRsltGr_wg_nm_LC(info);
		else if (lc == columnRsltGr_dpt_cd) doRsltGr_dpt_cd_LC(info);
		else if (lc == columnRsltGr_dpt_nm) doRsltGr_dpt_nm_LC(info);
		else if (lc == columnRsltGr_lot_no) doRsltGr_lot_no_LC(info);
		else if (lc == columnRsltGr_sublot_no) doRsltGr_sublot_no_LC(info);
		else if (lc == columnRsltGr_loc_cd) doRsltGr_loc_cd_LC(info);
		else if (lc == columnRsltGr_loc_nm) doRsltGr_loc_nm_LC(info);
		else if (lc == columnRsltGr_site_cd) doRsltGr_site_cd_LC(info);
		else if (lc == columnRsltGr_site_nm) doRsltGr_site_nm_LC(info);
		else if (lc == columnRsltGr_lg_grp_cd) doRsltGr_lg_grp_cd_LC(info);
		else if (lc == columnRsltGr_lg_grp_nm) doRsltGr_lg_grp_nm_LC(info);
		else if (lc == columnRsltGr_alloc_grp_cd) doRsltGr_alloc_grp_cd_LC(info);
		else if (lc == columnRsltGr_alloc_grp_nm) doRsltGr_alloc_grp_nm_LC(info);
		else if (lc == columnRsltGr_loc_grp_cd) doRsltGr_loc_grp_cd_LC(info);
		else if (lc == columnRsltGr_loc_grp_nm) doRsltGr_loc_grp_nm_LC(info);
		else if (lc == columnRsltGr_gd_cd) doRsltGr_gd_cd_LC(info);
		else if (lc == columnRsltGr_gd_nm) doRsltGr_gd_nm_LC(info);
		else if (lc == columnRsltGr_quality_typ) doRsltGr_quality_typ_LC(info);
		else if (lc == columnRsltGr_quality_typ_nm) doRsltGr_quality_typ_nm_LC(info);
		else if (lc == columnRsltGr_stk_insp_typ) doRsltGr_stk_insp_typ_LC(info);
		else if (lc == columnRsltGr_stk_insp_typ_nm) doRsltGr_stk_insp_typ_nm_LC(info);
		else if (lc == columnRsltGr_in_xfr_typ) doRsltGr_in_xfr_typ_LC(info);
		else if (lc == columnRsltGr_in_xfr_typ_nm) doRsltGr_in_xfr_typ_nm_LC(info);
		else if (lc == columnRsltGr_asst_typ) doRsltGr_asst_typ_LC(info);
		else if (lc == columnRsltGr_asst_typ_nm) doRsltGr_asst_typ_nm_LC(info);
		else if (lc == columnRsltGr_stk_id_typ) doRsltGr_stk_id_typ_LC(info);
		else if (lc == columnRsltGr_stk_id_typ_nm) doRsltGr_stk_id_typ_nm_LC(info);
		else if (lc == columnRsltGr_stk_bp_cd) doRsltGr_stk_bp_cd_LC(info);
		else if (lc == columnRsltGr_stk_bp_nm) doRsltGr_stk_bp_nm_LC(info);
		else if (lc == columnRsltGr_stk_arrv_bp_cd) doRsltGr_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRsltGr_stk_arrv_bp_nm) doRsltGr_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRsltGr_pack_unit_cd) doRsltGr_pack_unit_cd_LC(info);
		else if (lc == columnRsltGr_pack_unit_nm) doRsltGr_pack_unit_nm_LC(info);
		else if (lc == columnRsltGr_pack_unit_dec_place) doRsltGr_pack_unit_dec_place_LC(info);
		else if (lc == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_LC(info);
		else if (lc == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_LC(info);
		else if (lc == columnRsltGr_base_unit_dec_place) doRsltGr_base_unit_dec_place_LC(info);
		else if (lc == columnRsltGr_alloc_unit_cd) doRsltGr_alloc_unit_cd_LC(info);
		else if (lc == columnRsltGr_alloc_unit_nm) doRsltGr_alloc_unit_nm_LC(info);
		else if (lc == columnRsltGr_alloc_unit_dec_place) doRsltGr_alloc_unit_dec_place_LC(info);
		else if (lc == columnRsltGr_cont_fctr_rnd_typ) doRsltGr_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRsltGr_cont_fctr_dec_place) doRsltGr_cont_fctr_dec_place_LC(info);
		else if (lc == columnRsltGr_lot_seq) doRsltGr_lot_seq_LC(info);
		else if (lc == columnRsltGr_first_gr_dt) doRsltGr_first_gr_dt_LC(info);
		else if (lc == columnRsltGr_vld_dt) doRsltGr_vld_dt_LC(info);
		else if (lc == columnRsltGr_lmt_dt) doRsltGr_lmt_dt_LC(info);
		else if (lc == columnRsltGr_plnt_aprv_sts_typ) doRsltGr_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRsltGr_plnt_aprv_sts_typ_nm) doRsltGr_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRsltGr_mrkt_judg_sts_typ) doRsltGr_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRsltGr_mrkt_judg_sts_typ_nm) doRsltGr_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRsltGr_vld_dt_fr) doRsltGr_vld_dt_fr_LC(info);
		else if (lc == columnRsltGr_vld_dt_to) doRsltGr_vld_dt_to_LC(info);
		else if (lc == columnRsltGr_stop_dt) doRsltGr_stop_dt_LC(info);
		else if (lc == columnRsltGr_rel_dt) doRsltGr_rel_dt_LC(info);
		else if (lc == columnRsltGr_alloc_margin_days) doRsltGr_alloc_margin_days_LC(info);
		else if (lc == columnRsltGr_loc_sppl_cd) doRsltGr_loc_sppl_cd_LC(info);
		else if (lc == columnRsltGr_loc_sppl_nm) doRsltGr_loc_sppl_nm_LC(info);
		else if (lc == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_LC(info);
		else if (lc == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_LC(info);
		else if (lc == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_LC(info);
		else if (lc == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRsltGr_io_schd_no) doRsltGr_io_schd_no_LC(info);
		else if (lc == columnRsltGr_io_schd_seq) doRsltGr_io_schd_seq_LC(info);
		else if (lc == columnRsltGr_trd_cd) doRsltGr_trd_cd_LC(info);
		else if (lc == columnRsltGr_trd_nm) doRsltGr_trd_nm_LC(info);
		else if (lc == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_LC(info);
		else if (lc == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRsltGr_trn_typ) doRsltGr_trn_typ_LC(info);
		else if (lc == columnRsltGr_trn_typ_nm) doRsltGr_trn_typ_nm_LC(info);
		else if (lc == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_LC(info);
		else if (lc == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_LC(info);
		else if (lc == columnRsltGi_schd_stk_typ) doRsltGi_schd_stk_typ_LC(info);
		else if (lc == columnRsltGi_schd_stk_typ_nm) doRsltGi_schd_stk_typ_nm_LC(info);
		else if (lc == columnRsltGi_dt) doRsltGi_dt_LC(info);
		else if (lc == columnRsltGi_wg_cd) doRsltGi_wg_cd_LC(info);
		else if (lc == columnRsltGi_wg_nm) doRsltGi_wg_nm_LC(info);
		else if (lc == columnRsltGi_dpt_cd) doRsltGi_dpt_cd_LC(info);
		else if (lc == columnRsltGi_dpt_nm) doRsltGi_dpt_nm_LC(info);
		else if (lc == columnRsltGi_lot_no) doRsltGi_lot_no_LC(info);
		else if (lc == columnRsltGi_sublot_no) doRsltGi_sublot_no_LC(info);
		else if (lc == columnRsltGi_loc_cd) doRsltGi_loc_cd_LC(info);
		else if (lc == columnRsltGi_loc_nm) doRsltGi_loc_nm_LC(info);
		else if (lc == columnRsltGi_site_cd) doRsltGi_site_cd_LC(info);
		else if (lc == columnRsltGi_site_nm) doRsltGi_site_nm_LC(info);
		else if (lc == columnRsltGi_lg_grp_cd) doRsltGi_lg_grp_cd_LC(info);
		else if (lc == columnRsltGi_lg_grp_nm) doRsltGi_lg_grp_nm_LC(info);
		else if (lc == columnRsltGi_alloc_grp_cd) doRsltGi_alloc_grp_cd_LC(info);
		else if (lc == columnRsltGi_alloc_grp_nm) doRsltGi_alloc_grp_nm_LC(info);
		else if (lc == columnRsltGi_loc_grp_cd) doRsltGi_loc_grp_cd_LC(info);
		else if (lc == columnRsltGi_loc_grp_nm) doRsltGi_loc_grp_nm_LC(info);
		else if (lc == columnRsltGi_gd_cd) doRsltGi_gd_cd_LC(info);
		else if (lc == columnRsltGi_gd_nm) doRsltGi_gd_nm_LC(info);
		else if (lc == columnRsltGi_quality_typ) doRsltGi_quality_typ_LC(info);
		else if (lc == columnRsltGi_quality_typ_nm) doRsltGi_quality_typ_nm_LC(info);
		else if (lc == columnRsltGi_stk_insp_typ) doRsltGi_stk_insp_typ_LC(info);
		else if (lc == columnRsltGi_stk_insp_typ_nm) doRsltGi_stk_insp_typ_nm_LC(info);
		else if (lc == columnRsltGi_in_xfr_typ) doRsltGi_in_xfr_typ_LC(info);
		else if (lc == columnRsltGi_in_xfr_typ_nm) doRsltGi_in_xfr_typ_nm_LC(info);
		else if (lc == columnRsltGi_asst_typ) doRsltGi_asst_typ_LC(info);
		else if (lc == columnRsltGi_asst_typ_nm) doRsltGi_asst_typ_nm_LC(info);
		else if (lc == columnRsltGi_stk_id_typ) doRsltGi_stk_id_typ_LC(info);
		else if (lc == columnRsltGi_stk_id_typ_nm) doRsltGi_stk_id_typ_nm_LC(info);
		else if (lc == columnRsltGi_stk_bp_cd) doRsltGi_stk_bp_cd_LC(info);
		else if (lc == columnRsltGi_stk_bp_nm) doRsltGi_stk_bp_nm_LC(info);
		else if (lc == columnRsltGi_stk_arrv_bp_cd) doRsltGi_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRsltGi_stk_arrv_bp_nm) doRsltGi_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRsltGi_pack_unit_cd) doRsltGi_pack_unit_cd_LC(info);
		else if (lc == columnRsltGi_pack_unit_nm) doRsltGi_pack_unit_nm_LC(info);
		else if (lc == columnRsltGi_pack_unit_dec_place) doRsltGi_pack_unit_dec_place_LC(info);
		else if (lc == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_LC(info);
		else if (lc == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_LC(info);
		else if (lc == columnRsltGi_base_unit_dec_place) doRsltGi_base_unit_dec_place_LC(info);
		else if (lc == columnRsltGi_alloc_unit_cd) doRsltGi_alloc_unit_cd_LC(info);
		else if (lc == columnRsltGi_alloc_unit_nm) doRsltGi_alloc_unit_nm_LC(info);
		else if (lc == columnRsltGi_alloc_unit_dec_place) doRsltGi_alloc_unit_dec_place_LC(info);
		else if (lc == columnRsltGi_cont_fctr_rnd_typ) doRsltGi_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRsltGi_cont_fctr_dec_place) doRsltGi_cont_fctr_dec_place_LC(info);
		else if (lc == columnRsltGi_lot_seq) doRsltGi_lot_seq_LC(info);
		else if (lc == columnRsltGi_first_gr_dt) doRsltGi_first_gr_dt_LC(info);
		else if (lc == columnRsltGi_vld_dt) doRsltGi_vld_dt_LC(info);
		else if (lc == columnRsltGi_lmt_dt) doRsltGi_lmt_dt_LC(info);
		else if (lc == columnRsltGi_plnt_aprv_sts_typ) doRsltGi_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRsltGi_plnt_aprv_sts_typ_nm) doRsltGi_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRsltGi_mrkt_judg_sts_typ) doRsltGi_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRsltGi_mrkt_judg_sts_typ_nm) doRsltGi_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRsltGi_vld_dt_fr) doRsltGi_vld_dt_fr_LC(info);
		else if (lc == columnRsltGi_vld_dt_to) doRsltGi_vld_dt_to_LC(info);
		else if (lc == columnRsltGi_stop_dt) doRsltGi_stop_dt_LC(info);
		else if (lc == columnRsltGi_rel_dt) doRsltGi_rel_dt_LC(info);
		else if (lc == columnRsltGi_alloc_margin_days) doRsltGi_alloc_margin_days_LC(info);
		else if (lc == columnRsltGi_loc_sppl_cd) doRsltGi_loc_sppl_cd_LC(info);
		else if (lc == columnRsltGi_loc_sppl_nm) doRsltGi_loc_sppl_nm_LC(info);
		else if (lc == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_LC(info);
		else if (lc == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_LC(info);
		else if (lc == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_LC(info);
		else if (lc == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRsltGi_io_schd_no) doRsltGi_io_schd_no_LC(info);
		else if (lc == columnRsltGi_io_schd_seq) doRsltGi_io_schd_seq_LC(info);
		else if (lc == columnRsltGi_trd_cd) doRsltGi_trd_cd_LC(info);
		else if (lc == columnRsltGi_trd_nm) doRsltGi_trd_nm_LC(info);
		else if (lc == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_LC(info);
		else if (lc == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRsltGi_trn_typ) doRsltGi_trn_typ_LC(info);
		else if (lc == columnRsltGi_trn_typ_nm) doRsltGi_trn_typ_nm_LC(info);
		else if (lc == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_LC(info);
		else if (lc == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_LC(MCEventInfo info){
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
	 * [HdrQty]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrQty]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrQty_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [HdrContFctr]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrContFctr_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_stk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_stk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[in_xfr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_in_xfr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_seq_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[rel_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_rel_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[loc_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_loc_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_seq_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_stk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_stk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[in_xfr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_in_xfr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_seq_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[rel_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_rel_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_seq_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_id_typ]の作成メソッド
	 */
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pack_unit_cd]の作成メソッド
	 */
	public MCList getCnd_pack_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0040.Srch01")) {
			return new MS_MSBEL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL0040.Srch02")) {
			return new MS_MSBEL0040_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0040_Srch01Bridge() {
			p_MS_MSBEL0040_Srch01 = new MCParam(PDef.MS_MSBEL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrQtyR.create());
			param.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrContFctrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));

			p_MS_MSBEL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0040.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0040.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP0040.HdrQtyR down0() {
			return (mcframe.clientMSBE.MSBEP0040.HdrQtyR)down(0);
		}
		protected mcframe.clientMSBE.MSBEP0040.HdrContFctrR down1() {
			return (mcframe.clientMSBE.MSBEP0040.HdrContFctrR)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)down(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> down3() {
			return (MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0040_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrQtyR.create());
			p_MS_MSBEL0040_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrContFctrR.create());
			p_MS_MSBEL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			p_MS_MSBEL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0040_Srch01;
		}

		protected void show() {
			setHdrQtyR((mcframe.clientMSBE.MSBEP0040.HdrQtyR)p_MS_MSBEL0040_Srch01.getContainerParam().getDownBlock(0));
			setHdrContFctrR((mcframe.clientMSBE.MSBEP0040.HdrContFctrR)p_MS_MSBEL0040_Srch01.getContainerParam().getDownBlock(1));
			setRsltGrL((MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)p_MS_MSBEL0040_Srch01.getContainerParam().getDownBlock(2));
			setRsltGiL((MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)p_MS_MSBEL0040_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getHdrQtyR().clear();
			getHdrContFctrR().clear();
			getRsltGrL().clear();
			getRsltGiL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrQtyR());
			result.add(getHdrContFctrR());
			result.add(getRsltGrL());
			result.add(getRsltGiL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0040_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL0040_Srch02Bridge() {
			p_MS_MSBEL0040_Srch02 = new MCParam(PDef.MS_MSBEL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrQtyR.create());
			param.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrContFctrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.LnoR.class));

			p_MS_MSBEL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0040_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0040.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0040.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP0040.HdrQtyR down0() {
			return (mcframe.clientMSBE.MSBEP0040.HdrQtyR)down(0);
		}
		protected mcframe.clientMSBE.MSBEP0040.HdrContFctrR down1() {
			return (mcframe.clientMSBE.MSBEP0040.HdrContFctrR)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)down(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR> down3() {
			return (MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)down(3);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0040.LnoR> down4() {
			return (MCList<mcframe.clientMSBE.MSBEP0040.LnoR>)down(4);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0040_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrQtyR.create());
			p_MS_MSBEL0040_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP0040.HdrContFctrR.create());
			p_MS_MSBEL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			p_MS_MSBEL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.RsltGrR.class));
			p_MS_MSBEL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0040.LnoR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0040_Srch02;
		}

		protected void show() {
			setHdrQtyR((mcframe.clientMSBE.MSBEP0040.HdrQtyR)p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(0));
			setHdrContFctrR((mcframe.clientMSBE.MSBEP0040.HdrContFctrR)p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(1));
			setRsltGrL((MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(2));
			setRsltGiL((MCList<mcframe.clientMSBE.MSBEP0040.RsltGrR>)p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(3));
			setLnoL((MCList<mcframe.clientMSBE.MSBEP0040.LnoR>)p_MS_MSBEL0040_Srch02.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrQtyR().clear();
			getHdrContFctrR().clear();
			getRsltGrL().clear();
			getRsltGiL().clear();
			getLnoL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrQtyR());
			result.add(getHdrContFctrR());
			result.add(getRsltGrL());
			result.add(getRsltGiL());
			result.add(getLnoL());
			return result;
		}
	}
}