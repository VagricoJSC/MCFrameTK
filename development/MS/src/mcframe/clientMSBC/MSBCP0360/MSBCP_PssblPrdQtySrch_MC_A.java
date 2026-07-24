package mcframe.clientMSBC.MSBCP0360;

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
import mcframe.clientMSBC.MSBCP0360.MSBCP_PssblPrdQtySrch_MC.MS_MSBCL0360_Srch01Caller;

/**
 * 画面"MSBCP_PssblPrdQtySrch"パネルクラスです。<p>
 *
 * 製造オーダ、及び外注オーダに対して投入品の状況を踏まえての生産可能数量を参照する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_PssblPrdQtySrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0360";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Order]ブロック関連のField定義
	public MCPanel OrderPanel = null;
	public MCTitledBorder OrderTitledBorder = null;
	// [Order]ブロックの項目のField定義
	// [SrchItemOrder]ブロック関連のField定義
	public MCPanel SrchItemOrderPanel = null;
	public MCTitledBorder SrchItemOrderTitledBorder = null;
	// [SrchItemOrder]ブロックの項目のField定義
	// [CalcInv]ブロック関連のField定義
	public MCPanel CalcInvPanel = null;
	public MCTitledBorder CalcInvTitledBorder = null;
	// [CalcInv]ブロックの項目のField定義
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
	 * END,Scheduled end date,END;BEGIN,Scheduled start date,BEGIN END,終了予定日,END;BEGIN,着手予定日,BEGIN.<p>
	 *
	 */
	public MCButtonGroup Cnd_order_Group = null;
	public MCRadioButton Cnd_order_END = null;
	public MCRadioButton Cnd_order_BEGIN = null;
	/**
	 * MFGOUTSRC,Mfg./Subcontracting order,MFGOUTSRC;MFG,Mfg. order,MFG;OUTSRC,Subcontracting order,OUTSRC MFGOUTSRC,製造・外注オーダ,MFGOUTSRC;MFG,製造オーダ,MFG;OUTSRC,外注オーダ,OUTSRC.<p>
	 *
	 */
	public MCButtonGroup Cnd_srchItemOrder_Group = null;
	public MCRadioButton Cnd_srchItemOrder_MFGOUTSRC = null;
	public MCRadioButton Cnd_srchItemOrder_MFG = null;
	public MCRadioButton Cnd_srchItemOrder_OUTSRC = null;
	/**
	 * Current inventory 現状在庫.<p>
	 *
	 */
	public MCCheckBox Cnd_stk = null;
	/**
	 * Consider GR schedule 入庫予定加味.<p>
	 *
	 */
	public MCCheckBox Cnd_plan_in = null;
	/**
	 * Consider unfirm GR schedule 未確定入庫加味.<p>
	 *
	 */
	public MCCheckBox Cnd_unfirm_in = null;
	/**
	 * Consider GI schedule 出庫予定加味.<p>
	 *
	 */
	public MCCheckBox Cnd_plan_out = null;
	/**
	 * Consider unfirm GI schedule 未確定出庫加味.<p>
	 *
	 */
	public MCCheckBox Cnd_unfirm_out = null;
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
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
	public MCLabel Cnd_mfg_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0360.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCColumnConfig columnRslt_hrrchy = null;
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_st_schd_dt = null;
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_end_schd_dt = null;
	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_in_dt = null;
	/**
	 * Production possibility 生産可否状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prod_avlbl_sts = null;
	/**
	 * Parts status 部品状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_itm_sts = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno1_null_flg;// [Rslt]の[sno_p.sno1_null_flg]を[columnRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2_null_flg;// [Rslt]の[sno_p.sno2_null_flg]を[columnRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3_null_flg;// [Rslt]の[sno_p.sno3_null_flg]を[columnRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4_null_flg;// [Rslt]の[sno_p.sno4_null_flg]を[columnRslt_sno4_null_flg]としてエイリアス定義。
	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_qty = null;
	/**
	 * Required qty. 必要数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_need_qty = null;
	/**
	 * Allocatable inventory qty. 引当可能在庫数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_avlbl_qty = null;
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_qty = null;
	/**
	 * Possible production qty. 生産可能数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prod_avlbl_qty = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ_nm = null;
	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ = null;
	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ_nm = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Mfg. location 製造場所.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
	/**
	 * Storage location 格納場所.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_nm = null;
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ = null;
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ_nm = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_ctl_typ_nm = null;
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_offst_typ = null;
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_offst_typ_nm = null;
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCColumnConfig columnRslt_offst = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rnd_typ = null;
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rnd_typ_nm = null;
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_flg = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_nm = null;
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_seq = null;
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_typ = null;
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_typ_nm = null;
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_ratio = null;
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_alloc_prio = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Mfg. order entry 製造指図登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1010 = null;
	/**
	 * Order status update オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0050 = null;
	/**
	 * Item order gantt chart 品目オーダガントチャート.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0290 = null;
	/** [INIT]モードを表す定数 */
	public static final String INIT = "INIT";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INIT, SRCH};
	
	/** [MS_MSBCL0360_Srch01]のCallerの作成 */
	protected MSBCP_PssblPrdQtySrch_MC.MS_MSBCL0360_Srch01Caller createMS_MSBCL0360_Srch01() {
		MSBCP_PssblPrdQtySrch_MC.MS_MSBCL0360_Srch01Caller<MSBCP_PssblPrdQtySrch, MS_MSBCL0360_Srch01Bridge>
		caller = ((MSBCP_PssblPrdQtySrch_MC)this).new MS_MSBCL0360_Srch01Caller<MSBCP_PssblPrdQtySrch, MS_MSBCL0360_Srch01Bridge>(
					(MSBCP_PssblPrdQtySrch)this, new MS_MSBCL0360_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0360_Srch01]の呼び出し */
	protected void callMS_MSBCL0360_Srch01() {
		MCCaller caller = createMS_MSBCL0360_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0360.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0360.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0360.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0360.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0360.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0360.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0360.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0360.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0360.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0360.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0360.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0360.RsltR.class);
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
		ret.add(OrderPanel);
		ret.add(SrchItemOrderPanel);
		ret.add(CalcInvPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(ItmGrpPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_PssblPrdQtySrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_PssblPrdQtySrch_MC_A(String name) {
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
		MSBCP_PssblPrdQtySrch_MC.jbCreateOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateSrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateCalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateTop((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateFold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateTab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateTab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateCnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateCtrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateRslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbCreateBtn((MSBCP_PssblPrdQtySrch)this);
	}

	/**
	 * [Order]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrder(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [SrchItemOrder]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchItemOrder(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [CalcInv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCalcInv(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_PssblPrdQtySrch p) {
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
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_PssblPrdQtySrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_PssblPrdQtySrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0360.RsltR.$itm_p);
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
		p.Rslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBC.MSBCP0360.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno1_null_flg = p.Rslt_sno_p_PPanel.columnSno_sno1_null_flg;
		p.columnRslt_sno1_null_flg.addAliasName("Rslt.sno1_null_flg", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno2_null_flg = p.Rslt_sno_p_PPanel.columnSno_sno2_null_flg;
		p.columnRslt_sno2_null_flg.addAliasName("Rslt.sno2_null_flg", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno3_null_flg = p.Rslt_sno_p_PPanel.columnSno_sno3_null_flg;
		p.columnRslt_sno3_null_flg.addAliasName("Rslt.sno3_null_flg", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_sno4_null_flg = p.Rslt_sno_p_PPanel.columnSno_sno4_null_flg;
		p.columnRslt_sno4_null_flg.addAliasName("Rslt.sno4_null_flg", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_PssblPrdQtySrch p) {
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
	
	
	/** [Cnd_mfg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_grp_cd_p = null;

	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_grp_cd_ListPutter() {
		if (Cnd_mfg_loc_grp_cd_p == null) {
			Cnd_mfg_loc_grp_cd_p = createCnd_mfg_loc_grp_cd_ListPutter(Cnd_mfg_loc_grp_cd, "mfg_loc_grp_cd", "mfg_loc_grp_nm");

		}
		return Cnd_mfg_loc_grp_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_PssblPrdQtySrch create(){
		MSBCP_PssblPrdQtySrch p = new MSBCP_PssblPrdQtySrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_PssblPrdQtySrch create(String name){
		MSBCP_PssblPrdQtySrch p = new MSBCP_PssblPrdQtySrch(name);
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
		MSBCP_PssblPrdQtySrch_MC.jbfInitOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitSrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitCalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitTop((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitFold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitTab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitTab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitCnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitCtrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitRslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbfInitBtn((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitSrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitCalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitTop((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitFold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitTab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitTab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitCnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitCtrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitRslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.jbInitBtn((MSBCP_PssblPrdQtySrch)this);
	}

	/**
	 * [Order]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrder(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.OrderPanel = p.beansFactory.createPanel("Order");
		p.OrderTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchItemOrder]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchItemOrder(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.SrchItemOrderPanel = p.beansFactory.createPanel("SrchItemOrder");
		p.SrchItemOrderTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CalcInv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCalcInv(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.CalcInvPanel = p.beansFactory.createPanel("CalcInv");
		p.CalcInvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_PssblPrdQtySrch p) {
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
	protected static void jbfInitTab1(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_order_Group = p.beansFactory.createButtonGroup("Cnd.order");
		p.Cnd_order_END = p.beansFactory.createRadioButton("Cnd.order_END");
		p.Cnd_order_BEGIN = p.beansFactory.createRadioButton("Cnd.order_BEGIN");
		p.Cnd_srchItemOrder_Group = p.beansFactory.createButtonGroup("Cnd.srchItemOrder");
		p.Cnd_srchItemOrder_MFGOUTSRC = p.beansFactory.createRadioButton("Cnd.srchItemOrder_MFGOUTSRC");
		p.Cnd_srchItemOrder_MFG = p.beansFactory.createRadioButton("Cnd.srchItemOrder_MFG");
		p.Cnd_srchItemOrder_OUTSRC = p.beansFactory.createRadioButton("Cnd.srchItemOrder_OUTSRC");
		p.Cnd_stk = p.beansFactory.createCheckBox("Cnd.stk");
		p.Cnd_plan_in = p.beansFactory.createCheckBox("Cnd.plan_in");
		p.Cnd_unfirm_in = p.beansFactory.createCheckBox("Cnd.unfirm_in");
		p.Cnd_plan_out = p.beansFactory.createCheckBox("Cnd.plan_out");
		p.Cnd_unfirm_out = p.beansFactory.createCheckBox("Cnd.unfirm_out");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_mfg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_grp_cd_Label");
		p.Cnd_mfg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_grp_cd");
		p.Cnd_mfg_loc_grp_cd.setLabel(p.Cnd_mfg_loc_grp_cd_Label);
		p.Cnd_mfg_loc_grp_nm = p.beansFactory.createTextField("Cnd.mfg_loc_grp_nm");
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_hrrchy = p.beansFactory.createTableColumn("Rslt.hrrchy", MCColumnType.NUMBER);
		p.columnRslt_mfg_st_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_mfg_end_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_schd_in_dt = p.beansFactory.createTableColumn("Rslt.schd_in_dt", MCColumnType.DATE);
		p.columnRslt_prod_avlbl_sts = p.beansFactory.createTableColumn("Rslt.prod_avlbl_sts", MCColumnType.TEXT);
		p.columnRslt_purc_itm_sts = p.beansFactory.createTableColumn("Rslt.purc_itm_sts", MCColumnType.TEXT);
		p.columnRslt_ord_qty = p.beansFactory.createTableColumn("Rslt.ord_qty", MCColumnType.NUMBER);
		p.columnRslt_need_qty = p.beansFactory.createTableColumn("Rslt.need_qty", MCColumnType.NUMBER);
		p.columnRslt_alloc_avlbl_qty = p.beansFactory.createTableColumn("Rslt.alloc_avlbl_qty", MCColumnType.NUMBER);
		p.columnRslt_alloc_qty = p.beansFactory.createTableColumn("Rslt.alloc_qty", MCColumnType.NUMBER);
		p.columnRslt_prod_avlbl_qty = p.beansFactory.createTableColumn("Rslt.prod_avlbl_qty", MCColumnType.NUMBER);
		p.columnRslt_itm_ord_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_alloc_ctl_typ = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_inpt_ctl_typ = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_offst_typ = p.beansFactory.createTableColumn("Rslt.offst_typ", MCColumnType.TEXT);
		p.columnRslt_offst_typ_nm = p.beansFactory.createTableColumn("Rslt.offst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_offst = p.beansFactory.createTableColumn("Rslt.offst", MCColumnType.NUMBER);
		p.columnRslt_prov_typ = p.beansFactory.createTableColumn("Rslt.prov_typ", MCColumnType.TEXT);
		p.columnRslt_prov_typ_nm = p.beansFactory.createTableColumn("Rslt.prov_typ_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_rnd_typ = p.beansFactory.createTableColumn("Rslt.rnd_typ", MCColumnType.TEXT);
		p.columnRslt_rnd_typ_nm = p.beansFactory.createTableColumn("Rslt.rnd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alt_itm_flg = p.beansFactory.createTableColumn("Rslt.alt_itm_flg", MCColumnType.CHECK);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alt_grp_nm = p.beansFactory.createTableColumn("Rslt.alt_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_seq = p.beansFactory.createTableColumn("Rslt.alt_grp_seq", MCColumnType.NUMBER);
		p.columnRslt_alt_itm_typ = p.beansFactory.createTableColumn("Rslt.alt_itm_typ", MCColumnType.TEXT);
		p.columnRslt_alt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.alt_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alt_itm_ratio = p.beansFactory.createTableColumn("Rslt.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnRslt_alt_alloc_prio = p.beansFactory.createTableColumn("Rslt.alt_alloc_prio", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010 = p.beansFactory.createButton("Btn.open_MSBCP1010", "open");
		p.Btn_open_MSBCP0050 = p.beansFactory.createButton("Btn.open_MSBCP0050", "open");
		p.Btn_open_MSBCP0290 = p.beansFactory.createButton("Btn.open_MSBCP0290", "open");
	}

	/**
	 * [Order]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrder(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.OrderPanel.setBorder(p.OrderTitledBorder);
		p.add(p.OrderPanel);
		p.setLastBeans(p.OrderPanel);
		p.OrderPanel.setNextBeans(p.SrchItemOrderPanel);
		p.OrderPanel.setValueCheck(false);
		p.OrderPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrderPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchItemOrder]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchItemOrder(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.SrchItemOrderPanel.setBorder(p.SrchItemOrderTitledBorder);
		p.add(p.SrchItemOrderPanel);
		p.SrchItemOrderPanel.setNextBeans(p.CalcInvPanel);
		p.SrchItemOrderPanel.setValueCheck(false);
		p.SrchItemOrderPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchItemOrderPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [CalcInv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCalcInv(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.CalcInvPanel.setBorder(p.CalcInvTitledBorder);
		p.add(p.CalcInvPanel);
		p.CalcInvPanel.setNextBeans(p.TopPanel);
		p.CalcInvPanel.setValueCheck(false);
		p.CalcInvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CalcInvPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_PssblPrdQtySrch p) {
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
	protected static void jbInitFold(MSBCP_PssblPrdQtySrch p) {
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
	protected static void jbInitTab1(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ItmGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.OrderPanel.setLastBeans(p.Cnd_order_Group);
		p.Cnd_order_Group.setFirstBeans(p.Cnd_order_END);
		p.Cnd_order_END.setActionCommand("END");
		p.Cnd_order_Group.add(p.Cnd_order_END);
		p.OrderPanel.add(p.Cnd_order_END);
		p.Cnd_order_END.setNextBeans(p.Cnd_order_BEGIN);
		p.Cnd_order_BEGIN.setActionCommand("BEGIN");
		p.Cnd_order_Group.add(p.Cnd_order_BEGIN);
		p.OrderPanel.add(p.Cnd_order_BEGIN);
		p.Cnd_order_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.order_META);
		p.SrchItemOrderPanel.setLastBeans(p.Cnd_srchItemOrder_Group);
		p.Cnd_srchItemOrder_Group.setFirstBeans(p.Cnd_srchItemOrder_MFGOUTSRC);
		p.Cnd_srchItemOrder_MFGOUTSRC.setActionCommand("MFGOUTSRC");
		p.Cnd_srchItemOrder_Group.add(p.Cnd_srchItemOrder_MFGOUTSRC);
		p.SrchItemOrderPanel.add(p.Cnd_srchItemOrder_MFGOUTSRC);
		p.Cnd_srchItemOrder_MFGOUTSRC.setNextBeans(p.Cnd_srchItemOrder_MFG);
		p.Cnd_srchItemOrder_MFG.setActionCommand("MFG");
		p.Cnd_srchItemOrder_Group.add(p.Cnd_srchItemOrder_MFG);
		p.SrchItemOrderPanel.add(p.Cnd_srchItemOrder_MFG);
		p.Cnd_srchItemOrder_MFG.setNextBeans(p.Cnd_srchItemOrder_OUTSRC);
		p.Cnd_srchItemOrder_OUTSRC.setActionCommand("OUTSRC");
		p.Cnd_srchItemOrder_Group.add(p.Cnd_srchItemOrder_OUTSRC);
		p.SrchItemOrderPanel.add(p.Cnd_srchItemOrder_OUTSRC);
		p.Cnd_srchItemOrder_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.srchItemOrder_META);
		p.CalcInvPanel.add(p.Cnd_stk);
		p.CalcInvPanel.setLastBeans(p.Cnd_stk);
		p.Cnd_stk.setNextBeans(p.Cnd_plan_in);
		p.Cnd_stk.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.stk_META);
		p.CalcInvPanel.add(p.Cnd_plan_in);
		p.Cnd_plan_in.setNextBeans(p.Cnd_unfirm_in);
		p.Cnd_plan_in.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.plan_in_META);
		p.CalcInvPanel.add(p.Cnd_unfirm_in);
		p.Cnd_unfirm_in.setNextBeans(p.Cnd_plan_out);
		p.Cnd_unfirm_in.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.unfirm_in_META);
		p.CalcInvPanel.add(p.Cnd_plan_out);
		p.Cnd_plan_out.setNextBeans(p.Cnd_unfirm_out);
		p.Cnd_plan_out.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.plan_out_META);
		p.CalcInvPanel.add(p.Cnd_unfirm_out);
		p.Cnd_unfirm_out.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.unfirm_out_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.CndPanel.setLastBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_dt_fr);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_mfg_loc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_mfg_loc_grp_cd.setLinkBeans(p.Cnd_mfg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_grp_cd.setNextBeans(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.mfg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_mfg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0360.CndR.mfg_loc_grp_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
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
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setValueCheck(false);
		p.ItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_PssblPrdQtySrch p) {
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
	protected static void jbInitRslt(MSBCP_PssblPrdQtySrch p) {
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
	protected static void jbInitBtn(MSBCP_PssblPrdQtySrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_open_MSBCP1010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP1010);
		p.Btn_open_MSBCP1010.setNextBeans(p.Btn_open_MSBCP0050);
		p.BtnPanel.add(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setNextBeans(p.Btn_open_MSBCP0290);
		p.BtnPanel.add(p.Btn_open_MSBCP0290);
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
		MSBCP_PssblPrdQtySrch_MC.mcInitOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitSrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitCalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitTop((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitFold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitTab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitTab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitCnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitCtrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitRslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.mcInitBtn((MSBCP_PssblPrdQtySrch)this);

		// [INIT]ステータスのモードの設定
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Order((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_SrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_CalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Top((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Fold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Tab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Tab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Cnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_ItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Ctrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Rslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitINIT_Btn((MSBCP_PssblPrdQtySrch)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Order((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_SrchItemOrder((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_CalcInv((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Top((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Fold((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Tab1((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Tab2((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Cnd((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_ItmGrp((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Ctrl((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Rslt((MSBCP_PssblPrdQtySrch)this);
		MSBCP_PssblPrdQtySrch_MC.statusInitSRCH_Btn((MSBCP_PssblPrdQtySrch)this);

	}

	/**
	 *  [Order]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrder(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [SrchItemOrder]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchItemOrder(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [CalcInv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCalcInv(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_PssblPrdQtySrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_PssblPrdQtySrch p) {
		p.Cnd_order_Group.addAllListener(p);
		p.Cnd_order_END.addAllListener(p);
		p.Cnd_order_BEGIN.addAllListener(p);
		p.Cnd_srchItemOrder_Group.addAllListener(p);
		p.Cnd_srchItemOrder_MFGOUTSRC.addAllListener(p);
		p.Cnd_srchItemOrder_MFG.addAllListener(p);
		p.Cnd_srchItemOrder_OUTSRC.addAllListener(p);
		p.Cnd_stk.addAllListener(p);
		p.Cnd_plan_in.addAllListener(p);
		p.Cnd_unfirm_in.addAllListener(p);
		p.Cnd_plan_out.addAllListener(p);
		p.Cnd_unfirm_out.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_mfg_loc_grp_cd.setListListener(p);
		p.Cnd_mfg_loc_grp_cd.addAllListener(p);
		p.Cnd_mfg_loc_grp_nm.setListListener(p);
		p.Cnd_mfg_loc_grp_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBCP_PssblPrdQtySrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_PssblPrdQtySrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_PssblPrdQtySrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_hrrchy.addAllListener(p);
		p.columnRslt_hrrchy.setListListener(p);
		p.columnRslt_mfg_st_schd_dt.addAllListener(p);
		p.columnRslt_mfg_st_schd_dt.setListListener(p);
		p.columnRslt_mfg_end_schd_dt.addAllListener(p);
		p.columnRslt_mfg_end_schd_dt.setListListener(p);
		p.columnRslt_schd_in_dt.addAllListener(p);
		p.columnRslt_schd_in_dt.setListListener(p);
		p.columnRslt_prod_avlbl_sts.addAllListener(p);
		p.columnRslt_prod_avlbl_sts.setListListener(p);
		p.columnRslt_purc_itm_sts.addAllListener(p);
		p.columnRslt_purc_itm_sts.setListListener(p);
		p.columnRslt_ord_qty.addAllListener(p);
		p.columnRslt_ord_qty.setListListener(p);
		p.columnRslt_need_qty.addAllListener(p);
		p.columnRslt_need_qty.setListListener(p);
		p.columnRslt_alloc_avlbl_qty.addAllListener(p);
		p.columnRslt_alloc_avlbl_qty.setListListener(p);
		p.columnRslt_alloc_qty.addAllListener(p);
		p.columnRslt_alloc_qty.setListListener(p);
		p.columnRslt_prod_avlbl_qty.addAllListener(p);
		p.columnRslt_prod_avlbl_qty.setListListener(p);
		p.columnRslt_itm_ord_typ.addAllListener(p);
		p.columnRslt_itm_ord_typ.setListListener(p);
		p.columnRslt_itm_ord_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_typ_nm.setListListener(p);
		p.columnRslt_itm_ord_sts_typ.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ.setListListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_alloc_ctl_typ.addAllListener(p);
		p.columnRslt_alloc_ctl_typ.setListListener(p);
		p.columnRslt_alloc_ctl_typ_nm.addAllListener(p);
		p.columnRslt_alloc_ctl_typ_nm.setListListener(p);
		p.columnRslt_inpt_ctl_typ.addAllListener(p);
		p.columnRslt_inpt_ctl_typ.setListListener(p);
		p.columnRslt_inpt_ctl_typ_nm.addAllListener(p);
		p.columnRslt_inpt_ctl_typ_nm.setListListener(p);
		p.columnRslt_offst_typ.addAllListener(p);
		p.columnRslt_offst_typ.setListListener(p);
		p.columnRslt_offst_typ_nm.addAllListener(p);
		p.columnRslt_offst_typ_nm.setListListener(p);
		p.columnRslt_offst.addAllListener(p);
		p.columnRslt_offst.setListListener(p);
		p.columnRslt_prov_typ.addAllListener(p);
		p.columnRslt_prov_typ.setListListener(p);
		p.columnRslt_prov_typ_nm.addAllListener(p);
		p.columnRslt_prov_typ_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_rnd_typ.addAllListener(p);
		p.columnRslt_rnd_typ.setListListener(p);
		p.columnRslt_rnd_typ_nm.addAllListener(p);
		p.columnRslt_rnd_typ_nm.setListListener(p);
		p.columnRslt_alt_itm_flg.addAllListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_grp_nm.addAllListener(p);
		p.columnRslt_alt_grp_nm.setListListener(p);
		p.columnRslt_alt_grp_seq.addAllListener(p);
		p.columnRslt_alt_grp_seq.setListListener(p);
		p.columnRslt_alt_itm_typ.addAllListener(p);
		p.columnRslt_alt_itm_typ.setListListener(p);
		p.columnRslt_alt_itm_typ_nm.addAllListener(p);
		p.columnRslt_alt_itm_typ_nm.setListListener(p);
		p.columnRslt_alt_itm_ratio.addAllListener(p);
		p.columnRslt_alt_itm_ratio.setListListener(p);
		p.columnRslt_alt_alloc_prio.addAllListener(p);
		p.columnRslt_alt_alloc_prio.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_PssblPrdQtySrch p) {
		p.Btn_open_MSBCP1010.addAllListener(p);
		p.Btn_open_MSBCP1010.setAPMethodName("doBtn_open_MSBCP1010");
		p.Btn_open_MSBCP0050.addAllListener(p);
		p.Btn_open_MSBCP0050.setAPMethodName("doBtn_open_MSBCP0050");
		p.Btn_open_MSBCP0290.addAllListener(p);
		p.Btn_open_MSBCP0290.setAPMethodName("doBtn_open_MSBCP0290");
	}

	/**
	 * [INIT]ステータスの[Order]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Order(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[SrchItemOrder]ブロックのモードの設定
	 */
	protected static void statusInitINIT_SrchItemOrder(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[CalcInv]ブロックのモードの設定
	 */
	protected static void statusInitINIT_CalcInv(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Top(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Fold(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Tab1(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Tab2(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Cnd(MSBCP_PssblPrdQtySrch p){
		p.Cnd_order_Group.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_srchItemOrder_Group.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_stk.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_plan_in.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_unfirm_in.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_plan_out.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_unfirm_out.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.Cnd_dt_fr.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_mfg_loc_grp_cd.putMode(p, INIT, MCMode.REQUIRED);
		p.Cnd_mfg_loc_grp_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INIT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(INIT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INIT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitINIT_ItmGrp(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Ctrl(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [INIT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Rslt(MSBCP_PssblPrdQtySrch p){
		p.columnRslt_hrrchy.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_schd_in_dt.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_prod_avlbl_sts.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_purc_itm_sts.putMode(p, INIT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INIT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(INIT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno1_null_flg.putMode(p, INIT, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno2_null_flg.putMode(p, INIT, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno3_null_flg.putMode(p, INIT, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno4_null_flg.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_ord_qty.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_need_qty.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alloc_avlbl_qty.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alloc_qty.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_prod_avlbl_qty.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_offst_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_offst_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_offst.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_rnd_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_rnd_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_flg.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, INIT, MCMode.READ_ONLY);
		p.columnRslt_alt_alloc_prio.putMode(p, INIT, MCMode.READ_ONLY);

	}

	/**
	 * [INIT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINIT_Btn(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Order]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Order(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[SrchItemOrder]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchItemOrder(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[CalcInv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CalcInv(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_PssblPrdQtySrch p){
		p.Cnd_order_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srchItemOrder_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_plan_in.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_unfirm_in.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_plan_out.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_unfirm_out.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dt_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmGrp(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_PssblPrdQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBCP_PssblPrdQtySrch p){
		p.columnRslt_hrrchy.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_schd_in_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prod_avlbl_sts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_itm_sts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno1_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno2_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno3_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSno_sno4_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ord_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_need_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_avlbl_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prod_avlbl_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_offst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_offst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_alloc_prio.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_PssblPrdQtySrch p){

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
		MSBCP_PssblPrdQtySrch_MC.setTableConfigRslt((MSBCP_PssblPrdQtySrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_PssblPrdQtySrch p) {
		p.columnRslt_hrrchy.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.hrrchy_META);
		p.RsltTable.addColumnConfig(p.columnRslt_hrrchy);
		p.columnRslt_mfg_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.mfg_st_schd_dt_META);
		p.columnRslt_mfg_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_st_schd_dt);
		p.columnRslt_mfg_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.mfg_end_schd_dt_META);
		p.columnRslt_mfg_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_end_schd_dt);
		p.columnRslt_schd_in_dt.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.schd_in_dt_META);
		p.columnRslt_schd_in_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_in_dt);
		p.columnRslt_prod_avlbl_sts.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.prod_avlbl_sts_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prod_avlbl_sts);
		p.columnRslt_purc_itm_sts.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.purc_itm_sts_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_itm_sts);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoTable);
		p.columnRslt_ord_qty.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.ord_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_qty);
		p.columnRslt_need_qty.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.need_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_need_qty);
		p.columnRslt_alloc_avlbl_qty.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alloc_avlbl_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_avlbl_qty);
		p.columnRslt_alloc_qty.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alloc_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_qty);
		p.columnRslt_prod_avlbl_qty.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.prod_avlbl_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prod_avlbl_qty);
		p.columnRslt_itm_ord_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.itm_ord_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ);
		p.columnRslt_itm_ord_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.itm_ord_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ_nm);
		p.columnRslt_itm_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.itm_ord_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ);
		p.columnRslt_itm_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.itm_ord_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ_nm);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.columnRslt_alloc_ctl_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alloc_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ);
		p.columnRslt_alloc_ctl_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alloc_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ_nm);
		p.columnRslt_inpt_ctl_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.inpt_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ);
		p.columnRslt_inpt_ctl_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.inpt_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ_nm);
		p.columnRslt_offst_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.offst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_offst_typ);
		p.columnRslt_offst_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.offst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_offst_typ_nm);
		p.columnRslt_offst.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.offst_META);
		p.RsltTable.addColumnConfig(p.columnRslt_offst);
		p.columnRslt_prov_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.prov_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ);
		p.columnRslt_prov_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.prov_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ_nm);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rnd_typ);
		p.columnRslt_rnd_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.rnd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rnd_typ_nm);
		p.columnRslt_alt_itm_flg.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_flg);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_nm);
		p.columnRslt_alt_grp_seq.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_grp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_seq);
		p.columnRslt_alt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ);
		p.columnRslt_alt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ_nm);
		p.columnRslt_alt_itm_ratio.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_itm_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_ratio);
		p.columnRslt_alt_alloc_prio.setMeta(mcframe.clientMSBC.MSBCP0360.RsltR.alt_alloc_prio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_alloc_prio);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_mfg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_grp_cd.getListConfig().setPutter(getCnd_mfg_loc_grp_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[INIT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINITStatus() {
		status = INIT;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INIT.equals(status)) {
			setINITStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mfg_loc_grp_cd) return getCnd_mfg_loc_grp_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == Btn_open_MSBCP1010) doBtn_open_MSBCP1010(info);
		else if (ap == Btn_open_MSBCP0050) doBtn_open_MSBCP0050(info);
		else if (ap == Btn_open_MSBCP0290) doBtn_open_MSBCP0290(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP1010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0290]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0290(MCEventInfo info);

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
		if (vc == Cnd_order_Group) return doCnd_order_VC(info);
		if (vc == Cnd_srchItemOrder_Group) return doCnd_srchItemOrder_VC(info);
		if (vc == Cnd_stk) return doCnd_stk_VC(info);
		if (vc == Cnd_plan_in) return doCnd_plan_in_VC(info);
		if (vc == Cnd_unfirm_in) return doCnd_unfirm_in_VC(info);
		if (vc == Cnd_plan_out) return doCnd_plan_out_VC(info);
		if (vc == Cnd_unfirm_out) return doCnd_unfirm_out_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_mfg_loc_grp_cd) return doCnd_mfg_loc_grp_cd_VC(info);
		if (vc == Cnd_mfg_loc_grp_nm) return doCnd_mfg_loc_grp_nm_VC(info);
		if (vc == columnRslt_hrrchy) return doRslt_hrrchy_VC(info);
		if (vc == columnRslt_mfg_st_schd_dt) return doRslt_mfg_st_schd_dt_VC(info);
		if (vc == columnRslt_mfg_end_schd_dt) return doRslt_mfg_end_schd_dt_VC(info);
		if (vc == columnRslt_schd_in_dt) return doRslt_schd_in_dt_VC(info);
		if (vc == columnRslt_prod_avlbl_sts) return doRslt_prod_avlbl_sts_VC(info);
		if (vc == columnRslt_purc_itm_sts) return doRslt_purc_itm_sts_VC(info);
		if (vc == columnRslt_ord_qty) return doRslt_ord_qty_VC(info);
		if (vc == columnRslt_need_qty) return doRslt_need_qty_VC(info);
		if (vc == columnRslt_alloc_avlbl_qty) return doRslt_alloc_avlbl_qty_VC(info);
		if (vc == columnRslt_alloc_qty) return doRslt_alloc_qty_VC(info);
		if (vc == columnRslt_prod_avlbl_qty) return doRslt_prod_avlbl_qty_VC(info);
		if (vc == columnRslt_itm_ord_typ) return doRslt_itm_ord_typ_VC(info);
		if (vc == columnRslt_itm_ord_typ_nm) return doRslt_itm_ord_typ_nm_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ) return doRslt_itm_ord_sts_typ_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ_nm) return doRslt_itm_ord_sts_typ_nm_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_alloc_ctl_typ) return doRslt_alloc_ctl_typ_VC(info);
		if (vc == columnRslt_alloc_ctl_typ_nm) return doRslt_alloc_ctl_typ_nm_VC(info);
		if (vc == columnRslt_inpt_ctl_typ) return doRslt_inpt_ctl_typ_VC(info);
		if (vc == columnRslt_inpt_ctl_typ_nm) return doRslt_inpt_ctl_typ_nm_VC(info);
		if (vc == columnRslt_offst_typ) return doRslt_offst_typ_VC(info);
		if (vc == columnRslt_offst_typ_nm) return doRslt_offst_typ_nm_VC(info);
		if (vc == columnRslt_offst) return doRslt_offst_VC(info);
		if (vc == columnRslt_prov_typ) return doRslt_prov_typ_VC(info);
		if (vc == columnRslt_prov_typ_nm) return doRslt_prov_typ_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_rnd_typ) return doRslt_rnd_typ_VC(info);
		if (vc == columnRslt_rnd_typ_nm) return doRslt_rnd_typ_nm_VC(info);
		if (vc == columnRslt_alt_itm_flg) return doRslt_alt_itm_flg_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_grp_nm) return doRslt_alt_grp_nm_VC(info);
		if (vc == columnRslt_alt_grp_seq) return doRslt_alt_grp_seq_VC(info);
		if (vc == columnRslt_alt_itm_typ) return doRslt_alt_itm_typ_VC(info);
		if (vc == columnRslt_alt_itm_typ_nm) return doRslt_alt_itm_typ_nm_VC(info);
		if (vc == columnRslt_alt_itm_ratio) return doRslt_alt_itm_ratio_VC(info);
		if (vc == columnRslt_alt_alloc_prio) return doRslt_alt_alloc_prio_VC(info);
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
	 * [Cnd]パネルの[order]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_order_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srchItemOrder]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srchItemOrder_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[plan_in]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_plan_in_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unfirm_in]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unfirm_in_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[plan_out]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_plan_out_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unfirm_out]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unfirm_out_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[hrrchy]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_hrrchy_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_in_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_in_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_sts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prod_avlbl_sts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_itm_sts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_itm_sts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[need_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_need_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_avlbl_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_avlbl_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prod_avlbl_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[offst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_offst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[offst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_offst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_alloc_prio_VC(MCEventInfo info){
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
		else if (nc == Cnd_order_Group) doCnd_order_NC(info);
		else if (nc == Cnd_srchItemOrder_Group) doCnd_srchItemOrder_NC(info);
		else if (nc == Cnd_stk) doCnd_stk_NC(info);
		else if (nc == Cnd_plan_in) doCnd_plan_in_NC(info);
		else if (nc == Cnd_unfirm_in) doCnd_unfirm_in_NC(info);
		else if (nc == Cnd_plan_out) doCnd_plan_out_NC(info);
		else if (nc == Cnd_unfirm_out) doCnd_unfirm_out_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NC(info);
		else if (nc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_hrrchy) doRslt_hrrchy_NC(info);
		else if (nc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NC(info);
		else if (nc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NC(info);
		else if (nc == columnRslt_schd_in_dt) doRslt_schd_in_dt_NC(info);
		else if (nc == columnRslt_prod_avlbl_sts) doRslt_prod_avlbl_sts_NC(info);
		else if (nc == columnRslt_purc_itm_sts) doRslt_purc_itm_sts_NC(info);
		else if (nc == columnRslt_ord_qty) doRslt_ord_qty_NC(info);
		else if (nc == columnRslt_need_qty) doRslt_need_qty_NC(info);
		else if (nc == columnRslt_alloc_avlbl_qty) doRslt_alloc_avlbl_qty_NC(info);
		else if (nc == columnRslt_alloc_qty) doRslt_alloc_qty_NC(info);
		else if (nc == columnRslt_prod_avlbl_qty) doRslt_prod_avlbl_qty_NC(info);
		else if (nc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NC(info);
		else if (nc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_offst_typ) doRslt_offst_typ_NC(info);
		else if (nc == columnRslt_offst_typ_nm) doRslt_offst_typ_nm_NC(info);
		else if (nc == columnRslt_offst) doRslt_offst_NC(info);
		else if (nc == columnRslt_prov_typ) doRslt_prov_typ_NC(info);
		else if (nc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_rnd_typ) doRslt_rnd_typ_NC(info);
		else if (nc == columnRslt_rnd_typ_nm) doRslt_rnd_typ_nm_NC(info);
		else if (nc == columnRslt_alt_itm_flg) doRslt_alt_itm_flg_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NC(info);
		else if (nc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NC(info);
		else if (nc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NC(info);
		else if (nc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NC(info);
		else if (nc == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NC(info);
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
	 * [Cnd]パネルの[order]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srchItemOrder]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srchItemOrder_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_in]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_in_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_in]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_in_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_out]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_out_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_out]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_out_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hrrchy]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hrrchy_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_in_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_in_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_sts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_sts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_itm_sts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_itm_sts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[need_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_need_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_avlbl_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_avlbl_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NC(MCEventInfo info){
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
		else if (ne == Cnd_order_Group) doCnd_order_NE(info);
		else if (ne == Cnd_srchItemOrder_Group) doCnd_srchItemOrder_NE(info);
		else if (ne == Cnd_stk) doCnd_stk_NE(info);
		else if (ne == Cnd_plan_in) doCnd_plan_in_NE(info);
		else if (ne == Cnd_unfirm_in) doCnd_unfirm_in_NE(info);
		else if (ne == Cnd_plan_out) doCnd_plan_out_NE(info);
		else if (ne == Cnd_unfirm_out) doCnd_unfirm_out_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NE(info);
		else if (ne == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_hrrchy) doRslt_hrrchy_NE(info);
		else if (ne == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NE(info);
		else if (ne == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NE(info);
		else if (ne == columnRslt_schd_in_dt) doRslt_schd_in_dt_NE(info);
		else if (ne == columnRslt_prod_avlbl_sts) doRslt_prod_avlbl_sts_NE(info);
		else if (ne == columnRslt_purc_itm_sts) doRslt_purc_itm_sts_NE(info);
		else if (ne == columnRslt_ord_qty) doRslt_ord_qty_NE(info);
		else if (ne == columnRslt_need_qty) doRslt_need_qty_NE(info);
		else if (ne == columnRslt_alloc_avlbl_qty) doRslt_alloc_avlbl_qty_NE(info);
		else if (ne == columnRslt_alloc_qty) doRslt_alloc_qty_NE(info);
		else if (ne == columnRslt_prod_avlbl_qty) doRslt_prod_avlbl_qty_NE(info);
		else if (ne == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NE(info);
		else if (ne == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_offst_typ) doRslt_offst_typ_NE(info);
		else if (ne == columnRslt_offst_typ_nm) doRslt_offst_typ_nm_NE(info);
		else if (ne == columnRslt_offst) doRslt_offst_NE(info);
		else if (ne == columnRslt_prov_typ) doRslt_prov_typ_NE(info);
		else if (ne == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_rnd_typ) doRslt_rnd_typ_NE(info);
		else if (ne == columnRslt_rnd_typ_nm) doRslt_rnd_typ_nm_NE(info);
		else if (ne == columnRslt_alt_itm_flg) doRslt_alt_itm_flg_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NE(info);
		else if (ne == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NE(info);
		else if (ne == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NE(info);
		else if (ne == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NE(info);
		else if (ne == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NE(info);
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
	 * [Cnd]パネルの[order]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srchItemOrder]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srchItemOrder_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_in]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_in_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_in]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_in_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_out]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_out_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_out]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_out_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hrrchy]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hrrchy_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_in_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_in_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_sts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_sts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_itm_sts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_itm_sts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[need_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_need_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_avlbl_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_avlbl_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NE(MCEventInfo info){
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
		else if (nx == Cnd_order_Group) doCnd_order_NX(info);
		else if (nx == Cnd_srchItemOrder_Group) doCnd_srchItemOrder_NX(info);
		else if (nx == Cnd_stk) doCnd_stk_NX(info);
		else if (nx == Cnd_plan_in) doCnd_plan_in_NX(info);
		else if (nx == Cnd_unfirm_in) doCnd_unfirm_in_NX(info);
		else if (nx == Cnd_plan_out) doCnd_plan_out_NX(info);
		else if (nx == Cnd_unfirm_out) doCnd_unfirm_out_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NX(info);
		else if (nx == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_hrrchy) doRslt_hrrchy_NX(info);
		else if (nx == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NX(info);
		else if (nx == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NX(info);
		else if (nx == columnRslt_schd_in_dt) doRslt_schd_in_dt_NX(info);
		else if (nx == columnRslt_prod_avlbl_sts) doRslt_prod_avlbl_sts_NX(info);
		else if (nx == columnRslt_purc_itm_sts) doRslt_purc_itm_sts_NX(info);
		else if (nx == columnRslt_ord_qty) doRslt_ord_qty_NX(info);
		else if (nx == columnRslt_need_qty) doRslt_need_qty_NX(info);
		else if (nx == columnRslt_alloc_avlbl_qty) doRslt_alloc_avlbl_qty_NX(info);
		else if (nx == columnRslt_alloc_qty) doRslt_alloc_qty_NX(info);
		else if (nx == columnRslt_prod_avlbl_qty) doRslt_prod_avlbl_qty_NX(info);
		else if (nx == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NX(info);
		else if (nx == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_offst_typ) doRslt_offst_typ_NX(info);
		else if (nx == columnRslt_offst_typ_nm) doRslt_offst_typ_nm_NX(info);
		else if (nx == columnRslt_offst) doRslt_offst_NX(info);
		else if (nx == columnRslt_prov_typ) doRslt_prov_typ_NX(info);
		else if (nx == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_rnd_typ) doRslt_rnd_typ_NX(info);
		else if (nx == columnRslt_rnd_typ_nm) doRslt_rnd_typ_nm_NX(info);
		else if (nx == columnRslt_alt_itm_flg) doRslt_alt_itm_flg_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NX(info);
		else if (nx == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NX(info);
		else if (nx == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NX(info);
		else if (nx == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NX(info);
		else if (nx == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NX(info);
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
	 * [Cnd]パネルの[order]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srchItemOrder]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srchItemOrder_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_in]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_in_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_in]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_in_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[plan_out]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_plan_out_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unfirm_out]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unfirm_out_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hrrchy]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hrrchy_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_in_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_in_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_sts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_sts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_itm_sts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_itm_sts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[need_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_need_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_avlbl_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_avlbl_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
		else if (lc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_LC(info);
		else if (lc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_hrrchy) doRslt_hrrchy_LC(info);
		else if (lc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_LC(info);
		else if (lc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_LC(info);
		else if (lc == columnRslt_schd_in_dt) doRslt_schd_in_dt_LC(info);
		else if (lc == columnRslt_prod_avlbl_sts) doRslt_prod_avlbl_sts_LC(info);
		else if (lc == columnRslt_purc_itm_sts) doRslt_purc_itm_sts_LC(info);
		else if (lc == columnRslt_ord_qty) doRslt_ord_qty_LC(info);
		else if (lc == columnRslt_need_qty) doRslt_need_qty_LC(info);
		else if (lc == columnRslt_alloc_avlbl_qty) doRslt_alloc_avlbl_qty_LC(info);
		else if (lc == columnRslt_alloc_qty) doRslt_alloc_qty_LC(info);
		else if (lc == columnRslt_prod_avlbl_qty) doRslt_prod_avlbl_qty_LC(info);
		else if (lc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_LC(info);
		else if (lc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_offst_typ) doRslt_offst_typ_LC(info);
		else if (lc == columnRslt_offst_typ_nm) doRslt_offst_typ_nm_LC(info);
		else if (lc == columnRslt_offst) doRslt_offst_LC(info);
		else if (lc == columnRslt_prov_typ) doRslt_prov_typ_LC(info);
		else if (lc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_rnd_typ) doRslt_rnd_typ_LC(info);
		else if (lc == columnRslt_rnd_typ_nm) doRslt_rnd_typ_nm_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_LC(info);
		else if (lc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_LC(info);
		else if (lc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_LC(info);
		else if (lc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_LC(info);
		else if (lc == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_LC(info);
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
	 * [Cnd]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[hrrchy]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_hrrchy_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_in_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_in_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_sts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_sts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_itm_sts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_itm_sts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[need_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_need_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_avlbl_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_avlbl_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prod_avlbl_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prod_avlbl_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_offst_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0360.Srch01")) {
			return new MS_MSBCL0360_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0360_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0360_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0360_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0360_Srch01Bridge() {
			p_MS_MSBCL0360_Srch01 = new MCParam(PDef.MS_MSBCL0360_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0360_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0360.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0360.RsltR.class));

			p_MS_MSBCL0360_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0360_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0360_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0360_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0360_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0360.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0360.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0360.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0360.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0360_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0360.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0360_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0360.RsltR>)p_MS_MSBCL0360_Srch01.getContainerParam().getDownBlock(0));
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