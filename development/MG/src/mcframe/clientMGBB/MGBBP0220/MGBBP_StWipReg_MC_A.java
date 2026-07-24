package mcframe.clientMGBB.MGBBP0220;

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
import mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg_MC.MG_MGBBL0220_Srch01Caller;
import mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg_MC.MG_MGBBL0220_Upd01Caller;
import mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg_MC.MG_MGBBL0220_Del01Caller;
import mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg_MC.MG_MGBBL0220_Del02Caller;
import mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg_MC.MG_MGBBL0220_Imp01Caller;

/**
 * 画面"MGBBP_StWipReg"パネルクラスです。<p>
 *
 * 月初仕掛を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_StWipReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0220";

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
	 * UPD,Create/Modify,0;DEL,Delete,1;REF,View,2;DELBULK,Delete (Bulk),3 UPD,登録・訂正する,0;DEL,削除する,1;REF,参照する,2;DELBULK,削除する（一括）,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_DELBULK = null;
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_mfg_act_no_Label = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_no = null;
	public MCLabel Cnd_oper_act_no_Label = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_no = null;
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
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [DelCnd]ブロック関連のField定義
	public MCPanel DelCndPanel = null;
	// [DelCnd]ブロックの項目のField定義
	public MCLabel DelCnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField DelCnd_calc_grp_nm = null;
	public MCLabel DelCnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateField DelCnd_ym = null;
	public MCLabel DelCnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField DelCnd_wg_nm = null;
	public MCLabel DelCnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField DelCnd_site_nm = null;
	public MCLabel DelCnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField DelCnd_loc_nm = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns_grp = null;
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBB.MGBBP0220.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_cd = null;
	/**
	 * Calculation G name 計算Ｇ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_nm = null;
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
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_nm = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_no = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_no = null;
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
	 * For location rack/line 場所棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_str_ln_cd_none_flg]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_wip_qty;// [Rslt]の[qty_p.qty]を[columnRslt_wip_qty]としてエイリアス定義。
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
	 * Progress (%) 進捗度（％）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wip_per = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl_wip_amt = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl_inpt_amt = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_000 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_001 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_002 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_003 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_004 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_005 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_006 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_007 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_008 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_009 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_010 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_011 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_012 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_013 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_014 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_015 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_016 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_017 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_018 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_019 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_020 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_021 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_022 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_023 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_024 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_025 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_026 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_027 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_028 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_029 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_030 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_031 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_032 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_033 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_034 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_035 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_036 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_037 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_038 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_039 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_040 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_041 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_042 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_043 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_044 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_045 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_046 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_047 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_048 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_049 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_050 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_051 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_052 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_053 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_054 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_055 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_056 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_057 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_058 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_059 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_060 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_061 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_062 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_063 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_064 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_065 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_066 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_067 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_068 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_069 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_070 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_071 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_072 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_073 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_074 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_075 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_076 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_077 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_078 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_079 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_080 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_081 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_082 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_083 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_084 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_085 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_086 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_087 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_088 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_089 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_090 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_091 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_092 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_093 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_094 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_095 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_096 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_097 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_098 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_099 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_100 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_101 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_102 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_103 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_104 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_105 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_106 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_107 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_108 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_109 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_110 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_111 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_112 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_113 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_114 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_115 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_116 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_117 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_118 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_119 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_120 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_121 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_122 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_123 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_124 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_125 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_126 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_127 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_128 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_129 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_130 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_131 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_132 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_133 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_134 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_135 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_136 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_137 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_138 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_139 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_140 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_141 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_142 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_143 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_144 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_145 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_146 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_147 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_148 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_149 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_150 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_151 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_152 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_153 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_154 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_155 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_156 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_157 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_158 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_159 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_160 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_161 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_162 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_163 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_164 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_165 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_166 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_167 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_168 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_169 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_170 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_171 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_172 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_173 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_174 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_175 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_176 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_177 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_178 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_179 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_180 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_181 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_182 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_183 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_184 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_185 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_186 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_187 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_188 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_189 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_190 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_191 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_192 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_193 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_194 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_195 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_196 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_197 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_198 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_199 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_200 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_201 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_202 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_203 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_204 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_205 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_206 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_207 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_208 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_209 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_210 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_211 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_212 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_213 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_214 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_215 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_216 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_217 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_218 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_219 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_220 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_221 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_222 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_223 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_224 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_225 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_226 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_227 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_228 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_229 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_230 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_231 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_232 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_233 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_234 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_235 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_236 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_237 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_238 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_239 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_240 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_241 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_242 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_243 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_244 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_245 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_246 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_247 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_248 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_249 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_250 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_251 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_252 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_253 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_254 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_255 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_256 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_257 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_258 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_259 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_260 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_261 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_262 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_263 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_264 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_265 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_266 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_267 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_268 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_269 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_270 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_271 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_272 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_273 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_274 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_275 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_276 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_277 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_278 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_279 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_280 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_281 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_282 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_283 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_284 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_285 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_286 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_287 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_288 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_289 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_290 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_291 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_292 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_293 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_294 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_295 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_296 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_297 = null;
	/**
	 * Own level 自レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_298 = null;
	/**
	 * Lower level 下位レベル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_col_299 = null;
	/**
	 * Beginning WIP key 月初仕掛キー.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_wip_key = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public MCColumnGroup cgRslt_cg_ttl = null;
	public MCColumnGroup cgRslt_cg0 = null;
	public MCColumnGroup cgRslt_cg1 = null;
	public MCColumnGroup cgRslt_cg2 = null;
	public MCColumnGroup cgRslt_cg3 = null;
	public MCColumnGroup cgRslt_cg4 = null;
	public MCColumnGroup cgRslt_cg5 = null;
	public MCColumnGroup cgRslt_cg6 = null;
	public MCColumnGroup cgRslt_cg7 = null;
	public MCColumnGroup cgRslt_cg8 = null;
	public MCColumnGroup cgRslt_cg9 = null;
	public MCColumnGroup cgRslt_cg10 = null;
	public MCColumnGroup cgRslt_cg11 = null;
	public MCColumnGroup cgRslt_cg12 = null;
	public MCColumnGroup cgRslt_cg13 = null;
	public MCColumnGroup cgRslt_cg14 = null;
	public MCColumnGroup cgRslt_cg15 = null;
	public MCColumnGroup cgRslt_cg16 = null;
	public MCColumnGroup cgRslt_cg17 = null;
	public MCColumnGroup cgRslt_cg18 = null;
	public MCColumnGroup cgRslt_cg19 = null;
	public MCColumnGroup cgRslt_cg20 = null;
	public MCColumnGroup cgRslt_cg21 = null;
	public MCColumnGroup cgRslt_cg22 = null;
	public MCColumnGroup cgRslt_cg23 = null;
	public MCColumnGroup cgRslt_cg24 = null;
	public MCColumnGroup cgRslt_cg25 = null;
	public MCColumnGroup cgRslt_cg26 = null;
	public MCColumnGroup cgRslt_cg27 = null;
	public MCColumnGroup cgRslt_cg28 = null;
	public MCColumnGroup cgRslt_cg29 = null;
	public MCColumnGroup cgRslt_cg30 = null;
	public MCColumnGroup cgRslt_cg31 = null;
	public MCColumnGroup cgRslt_cg32 = null;
	public MCColumnGroup cgRslt_cg33 = null;
	public MCColumnGroup cgRslt_cg34 = null;
	public MCColumnGroup cgRslt_cg35 = null;
	public MCColumnGroup cgRslt_cg36 = null;
	public MCColumnGroup cgRslt_cg37 = null;
	public MCColumnGroup cgRslt_cg38 = null;
	public MCColumnGroup cgRslt_cg39 = null;
	public MCColumnGroup cgRslt_cg40 = null;
	public MCColumnGroup cgRslt_cg41 = null;
	public MCColumnGroup cgRslt_cg42 = null;
	public MCColumnGroup cgRslt_cg43 = null;
	public MCColumnGroup cgRslt_cg44 = null;
	public MCColumnGroup cgRslt_cg45 = null;
	public MCColumnGroup cgRslt_cg46 = null;
	public MCColumnGroup cgRslt_cg47 = null;
	public MCColumnGroup cgRslt_cg48 = null;
	public MCColumnGroup cgRslt_cg49 = null;
	public MCColumnGroup cgRslt_cg50 = null;
	public MCColumnGroup cgRslt_cg51 = null;
	public MCColumnGroup cgRslt_cg52 = null;
	public MCColumnGroup cgRslt_cg53 = null;
	public MCColumnGroup cgRslt_cg54 = null;
	public MCColumnGroup cgRslt_cg55 = null;
	public MCColumnGroup cgRslt_cg56 = null;
	public MCColumnGroup cgRslt_cg57 = null;
	public MCColumnGroup cgRslt_cg58 = null;
	public MCColumnGroup cgRslt_cg59 = null;
	public MCColumnGroup cgRslt_cg60 = null;
	public MCColumnGroup cgRslt_cg61 = null;
	public MCColumnGroup cgRslt_cg62 = null;
	public MCColumnGroup cgRslt_cg63 = null;
	public MCColumnGroup cgRslt_cg64 = null;
	public MCColumnGroup cgRslt_cg65 = null;
	public MCColumnGroup cgRslt_cg66 = null;
	public MCColumnGroup cgRslt_cg67 = null;
	public MCColumnGroup cgRslt_cg68 = null;
	public MCColumnGroup cgRslt_cg69 = null;
	public MCColumnGroup cgRslt_cg70 = null;
	public MCColumnGroup cgRslt_cg71 = null;
	public MCColumnGroup cgRslt_cg72 = null;
	public MCColumnGroup cgRslt_cg73 = null;
	public MCColumnGroup cgRslt_cg74 = null;
	public MCColumnGroup cgRslt_cg75 = null;
	public MCColumnGroup cgRslt_cg76 = null;
	public MCColumnGroup cgRslt_cg77 = null;
	public MCColumnGroup cgRslt_cg78 = null;
	public MCColumnGroup cgRslt_cg79 = null;
	public MCColumnGroup cgRslt_cg80 = null;
	public MCColumnGroup cgRslt_cg81 = null;
	public MCColumnGroup cgRslt_cg82 = null;
	public MCColumnGroup cgRslt_cg83 = null;
	public MCColumnGroup cgRslt_cg84 = null;
	public MCColumnGroup cgRslt_cg85 = null;
	public MCColumnGroup cgRslt_cg86 = null;
	public MCColumnGroup cgRslt_cg87 = null;
	public MCColumnGroup cgRslt_cg88 = null;
	public MCColumnGroup cgRslt_cg89 = null;
	public MCColumnGroup cgRslt_cg90 = null;
	public MCColumnGroup cgRslt_cg91 = null;
	public MCColumnGroup cgRslt_cg92 = null;
	public MCColumnGroup cgRslt_cg93 = null;
	public MCColumnGroup cgRslt_cg94 = null;
	public MCColumnGroup cgRslt_cg95 = null;
	public MCColumnGroup cgRslt_cg96 = null;
	public MCColumnGroup cgRslt_cg97 = null;
	public MCColumnGroup cgRslt_cg98 = null;
	public MCColumnGroup cgRslt_cg99 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Item Mfg. order info. 品目製造指図情報一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0030 = null;
	/**
	 * Operation order info. 指図工程情報一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0040 = null;
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_bulk = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_BULK]モードを表す定数 */
	public static final String DEL_BULK = "DEL_BULK";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH_REF, REF, SRCH_DEL, DEL, DEL_BULK, FIX_U};
	
	/** [MG_MGBBL0220_Srch01]のCallerの作成 */
	protected MGBBP_StWipReg_MC.MG_MGBBL0220_Srch01Caller createMG_MGBBL0220_Srch01() {
		MGBBP_StWipReg_MC.MG_MGBBL0220_Srch01Caller<MGBBP_StWipReg, MG_MGBBL0220_Srch01Bridge>
		caller = ((MGBBP_StWipReg_MC)this).new MG_MGBBL0220_Srch01Caller<MGBBP_StWipReg, MG_MGBBL0220_Srch01Bridge>(
					(MGBBP_StWipReg)this, new MG_MGBBL0220_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0220_Srch01]の呼び出し */
	protected void callMG_MGBBL0220_Srch01() {
		MCCaller caller = createMG_MGBBL0220_Srch01();
		caller.exec();
	}
	/** [MG_MGBBL0220_Upd01]のCallerの作成 */
	protected MGBBP_StWipReg_MC.MG_MGBBL0220_Upd01Caller createMG_MGBBL0220_Upd01() {
		MGBBP_StWipReg_MC.MG_MGBBL0220_Upd01Caller<MGBBP_StWipReg, MG_MGBBL0220_Upd01Bridge>
		caller = ((MGBBP_StWipReg_MC)this).new MG_MGBBL0220_Upd01Caller<MGBBP_StWipReg, MG_MGBBL0220_Upd01Bridge>(
					(MGBBP_StWipReg)this, new MG_MGBBL0220_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBBL0220_Upd01]の呼び出し */
	protected void callMG_MGBBL0220_Upd01() {
		MCCaller caller = createMG_MGBBL0220_Upd01();
		caller.exec();
	}
	/** [MG_MGBBL0220_Del01]のCallerの作成 */
	protected MGBBP_StWipReg_MC.MG_MGBBL0220_Del01Caller createMG_MGBBL0220_Del01() {
		MGBBP_StWipReg_MC.MG_MGBBL0220_Del01Caller<MGBBP_StWipReg, MG_MGBBL0220_Del01Bridge>
		caller = ((MGBBP_StWipReg_MC)this).new MG_MGBBL0220_Del01Caller<MGBBP_StWipReg, MG_MGBBL0220_Del01Bridge>(
					(MGBBP_StWipReg)this, new MG_MGBBL0220_Del01Bridge());
		return caller;
	}
	/** [MG_MGBBL0220_Del01]の呼び出し */
	protected void callMG_MGBBL0220_Del01() {
		MCCaller caller = createMG_MGBBL0220_Del01();
		caller.exec();
	}
	/** [MG_MGBBL0220_Del02]のCallerの作成 */
	protected MGBBP_StWipReg_MC.MG_MGBBL0220_Del02Caller createMG_MGBBL0220_Del02() {
		MGBBP_StWipReg_MC.MG_MGBBL0220_Del02Caller<MGBBP_StWipReg, MG_MGBBL0220_Del02Bridge>
		caller = ((MGBBP_StWipReg_MC)this).new MG_MGBBL0220_Del02Caller<MGBBP_StWipReg, MG_MGBBL0220_Del02Bridge>(
					(MGBBP_StWipReg)this, new MG_MGBBL0220_Del02Bridge());
		return caller;
	}
	/** [MG_MGBBL0220_Del02]の呼び出し */
	protected void callMG_MGBBL0220_Del02() {
		MCCaller caller = createMG_MGBBL0220_Del02();
		caller.exec();
	}
	/** [MG_MGBBL0220_Imp01]のCallerの作成 */
	protected MGBBP_StWipReg_MC.MG_MGBBL0220_Imp01Caller createMG_MGBBL0220_Imp01() {
		MGBBP_StWipReg_MC.MG_MGBBL0220_Imp01Caller<MGBBP_StWipReg, MG_MGBBL0220_Imp01Bridge>
		caller = ((MGBBP_StWipReg_MC)this).new MG_MGBBL0220_Imp01Caller<MGBBP_StWipReg, MG_MGBBL0220_Imp01Bridge>(
					(MGBBP_StWipReg)this, new MG_MGBBL0220_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBBL0220_Imp01]の呼び出し */
	protected void callMG_MGBBL0220_Imp01() {
		MCCaller caller = createMG_MGBBL0220_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0220.CndR aCndR;
	/** [DelCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0220.DelCndR aDelCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0220.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0220.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0220.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0220.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0220.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0220.CndR.create();
	}

	/**
	 * 項目コピーによってaDelCndRを設定します。
	 *
	 * aDelCndRのインスタンスは変更されません。
	 *
	 * @param row DelCndR
	 */
	public void setDelCndR(mcframe.clientMGBB.MGBBP0220.DelCndR row) {
		if (row != null) {
			MCRow.copyall(getDelCndR(), row);
		}
	}

	/**
	 * [DelCnd]ブロックのコンテナaDelCndRを返します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBB.MGBBP0220.DelCndR getDelCndR() {
		return aDelCndR;
	}

	/**
	 * aDelCndRを作成します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBB.MGBBP0220.DelCndR createDelCndR() {
		return mcframe.clientMGBB.MGBBP0220.DelCndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBB.MGBBP0220.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBB.MGBBP0220.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBB.MGBBP0220.LPnlR createLPnlR() {
		return mcframe.clientMGBB.MGBBP0220.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0220.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0220.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0220.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0220.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0220.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createColumnGroupTable("Rslt.table");
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
		if(!MCCollectionUtil.contains(ret, getDelCndR())) ret.add(getDelCndR());
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getDelCndR()) return "DelCnd";
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("DelCnd")) return getDelCndR();
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(DelCndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_StWipReg_MC_A() {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_StWipReg_MC_A(String name) {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_StWipReg_MC.jbCreateScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateTop((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateFold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateTab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateTab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateTab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateCnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateDelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateLPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateCtrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateRslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateBtn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbCreateEastBtn((MGBBP_StWipReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBBP_StWipReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBBP_StWipReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBBP_StWipReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBBP_StWipReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBBP_StWipReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBBP_StWipReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_StWipReg p) {
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
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBBP_StWipReg p) {
	}

	/**
	 * [DelCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDelCnd(MGBBP_StWipReg p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBBP_StWipReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBBP_StWipReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_StWipReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBB.MGBBP0220.RsltR.$itm_p);
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
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMGBB.MGBBP0220.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBB.MGBBP0220.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_wip_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_wip_qty.addAliasName("Rslt.wip_qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBB.MGBBP0220.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_StWipReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBBP_StWipReg p) {
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
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
	
	
	/** [Cnd_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_jnl_cd_p = null;

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_jnl_cd_ListPutter() {
		if (Cnd_itm_jnl_cd_p == null) {
			Cnd_itm_jnl_cd_p = createCnd_itm_jnl_cd_ListPutter(Cnd_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Cnd_itm_jnl_cd_p;
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
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd1_ListPutter() {
		if (Cnd_itm_grp_cd1_p == null) {
			Cnd_itm_grp_cd1_p = createCnd_itm_grp_cd1_ListPutter(Cnd_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Cnd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd2_ListPutter() {
		if (Cnd_itm_grp_cd2_p == null) {
			Cnd_itm_grp_cd2_p = createCnd_itm_grp_cd2_ListPutter(Cnd_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Cnd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd3_ListPutter() {
		if (Cnd_itm_grp_cd3_p == null) {
			Cnd_itm_grp_cd3_p = createCnd_itm_grp_cd3_ListPutter(Cnd_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Cnd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd4_ListPutter() {
		if (Cnd_itm_grp_cd4_p == null) {
			Cnd_itm_grp_cd4_p = createCnd_itm_grp_cd4_ListPutter(Cnd_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Cnd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd5_ListPutter() {
		if (Cnd_itm_grp_cd5_p == null) {
			Cnd_itm_grp_cd5_p = createCnd_itm_grp_cd5_ListPutter(Cnd_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Cnd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd6_ListPutter() {
		if (Cnd_itm_grp_cd6_p == null) {
			Cnd_itm_grp_cd6_p = createCnd_itm_grp_cd6_ListPutter(Cnd_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Cnd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd7_ListPutter() {
		if (Cnd_itm_grp_cd7_p == null) {
			Cnd_itm_grp_cd7_p = createCnd_itm_grp_cd7_ListPutter(Cnd_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Cnd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd8_ListPutter() {
		if (Cnd_itm_grp_cd8_p == null) {
			Cnd_itm_grp_cd8_p = createCnd_itm_grp_cd8_ListPutter(Cnd_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Cnd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd9_ListPutter() {
		if (Cnd_itm_grp_cd9_p == null) {
			Cnd_itm_grp_cd9_p = createCnd_itm_grp_cd9_ListPutter(Cnd_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Cnd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd10_ListPutter() {
		if (Cnd_itm_grp_cd10_p == null) {
			Cnd_itm_grp_cd10_p = createCnd_itm_grp_cd10_ListPutter(Cnd_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Cnd_itm_grp_cd10_p;
	}
	
	
	/** [DelCnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_calc_grp_cd_p = null;

	/**
	 * [DelCnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_calc_grp_cd_ListPutter() {
		if (DelCnd_calc_grp_cd_p == null) {
			DelCnd_calc_grp_cd_p = createDelCnd_calc_grp_cd_ListPutter(DelCnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return DelCnd_calc_grp_cd_p;
	}
	
	
	/** [DelCnd_wg_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_wg_cd_p = null;

	/**
	 * [DelCnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_wg_cd_ListPutter() {
		if (DelCnd_wg_cd_p == null) {
			DelCnd_wg_cd_p = createDelCnd_wg_cd_ListPutter(DelCnd_wg_cd, "wg_cd", "wg_nm");

		}
		return DelCnd_wg_cd_p;
	}
	
	
	/** [DelCnd_site_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_site_cd_p = null;

	/**
	 * [DelCnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_site_cd_ListPutter() {
		if (DelCnd_site_cd_p == null) {
			DelCnd_site_cd_p = createDelCnd_site_cd_ListPutter(DelCnd_site_cd, "site_cd", "site_nm");

		}
		return DelCnd_site_cd_p;
	}
	
	
	/** [DelCnd_loc_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_loc_cd_p = null;

	/**
	 * [DelCnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_loc_cd_ListPutter() {
		if (DelCnd_loc_cd_p == null) {
			DelCnd_loc_cd_p = createDelCnd_loc_cd_ListPutter(DelCnd_loc_cd, "loc_cd", "loc_nm");

		}
		return DelCnd_loc_cd_p;
	}
	
	
	/** [Rslt_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_calc_grp_cd_p = null;

	/**
	 * [Rslt_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_calc_grp_cd_ListPutter() {
		if (Rslt_calc_grp_cd_p == null) {
			Rslt_calc_grp_cd_p = createRslt_calc_grp_cd_ListPutter(columnRslt_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Rslt_calc_grp_cd_p;
	}
	
	
	/** [Rslt_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wg_cd_p = null;

	/**
	 * [Rslt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wg_cd_ListPutter() {
		if (Rslt_wg_cd_p == null) {
			Rslt_wg_cd_p = createRslt_wg_cd_ListPutter(columnRslt_wg_cd, "wg_cd", "wg_nm");

		}
		return Rslt_wg_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_itm_typ_ListPutter]の定義 */
	private MCListPutter Rslt_itm_typ_p = null;

	/**
	 * [Rslt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_typ_ListPutter() {
		if (Rslt_itm_typ_p == null) {
			Rslt_itm_typ_p = createRslt_itm_typ_ListPutter(columnRslt_itm_typ, "itm_typ", "itm_typ_nm");

		}
		return Rslt_itm_typ_p;
	}
	
	
	/** [Rslt_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_typ_d_cd_p = null;

	/**
	 * [Rslt_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_typ_d_cd_ListPutter() {
		if (Rslt_itm_typ_d_cd_p == null) {
			Rslt_itm_typ_d_cd_p = createRslt_itm_typ_d_cd_ListPutter(columnRslt_itm_typ_d_cd, "itm_typ_d_cd", "itm_typ_d_nm");

		}
		return Rslt_itm_typ_d_cd_p;
	}
	
	
	/** [Rslt_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_jnl_cd_p = null;

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_jnl_cd_ListPutter() {
		if (Rslt_itm_jnl_cd_p == null) {
			Rslt_itm_jnl_cd_p = createRslt_itm_jnl_cd_ListPutter(columnRslt_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Rslt_itm_jnl_cd_p;
	}
	
	
	/** [Rslt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_loc_cd_p = null;

	/**
	 * [Rslt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_loc_cd_ListPutter() {
		if (Rslt_loc_cd_p == null) {
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd", "loc_nm","str_ln_tgt_flg");

		}
		return Rslt_loc_cd_p;
	}
	
	
	/** [Rslt_oper_cd_ListPutter]の定義 */
	private MCListPutter Rslt_oper_cd_p = null;

	/**
	 * [Rslt_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_oper_cd_ListPutter() {
		if (Rslt_oper_cd_p == null) {
			Rslt_oper_cd_p = createRslt_oper_cd_ListPutter(columnRslt_oper_cd, "oper_cd", "oper_nm");

		}
		return Rslt_oper_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_StWipReg create(){
		MGBBP_StWipReg p = new MGBBP_StWipReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_StWipReg create(String name){
		MGBBP_StWipReg p = new MGBBP_StWipReg(name);
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
		MGBBP_StWipReg_MC.jbfInitScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitTop((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitFold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitTab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitTab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitTab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitCnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitDelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitLPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitCtrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitRslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitBtn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbfInitEastBtn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitTop((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitFold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitTab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitTab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitTab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitCnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitDelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitLPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitCtrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitRslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitBtn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.jbInitEastBtn((MGBBP_StWipReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBBP_StWipReg p) {
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
	protected static void jbfInitTab1(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_DELBULK = p.beansFactory.createRadioButton("Cnd.ope_DELBULK");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_mfg_act_no_Label = p.beansFactory.createLabel("Cnd.mfg_act_no_Label");
		p.Cnd_mfg_act_no = p.beansFactory.createTextField("Cnd.mfg_act_no");
		p.Cnd_mfg_act_no.setLabel(p.Cnd_mfg_act_no_Label);
		p.Cnd_oper_act_no_Label = p.beansFactory.createLabel("Cnd.oper_act_no_Label");
		p.Cnd_oper_act_no = p.beansFactory.createTextField("Cnd.oper_act_no");
		p.Cnd_oper_act_no.setLabel(p.Cnd_oper_act_no_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd1_Label");
		p.Cnd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd1");
		p.Cnd_itm_grp_cd1.setLabel(p.Cnd_itm_grp_cd1_Label);
		p.Cnd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.itm_grp_nm1");
		p.Cnd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd2_Label");
		p.Cnd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd2");
		p.Cnd_itm_grp_cd2.setLabel(p.Cnd_itm_grp_cd2_Label);
		p.Cnd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.itm_grp_nm2");
		p.Cnd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd3_Label");
		p.Cnd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd3");
		p.Cnd_itm_grp_cd3.setLabel(p.Cnd_itm_grp_cd3_Label);
		p.Cnd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.itm_grp_nm3");
		p.Cnd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd4_Label");
		p.Cnd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd4");
		p.Cnd_itm_grp_cd4.setLabel(p.Cnd_itm_grp_cd4_Label);
		p.Cnd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.itm_grp_nm4");
		p.Cnd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd5_Label");
		p.Cnd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd5");
		p.Cnd_itm_grp_cd5.setLabel(p.Cnd_itm_grp_cd5_Label);
		p.Cnd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.itm_grp_nm5");
		p.Cnd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd6_Label");
		p.Cnd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd6");
		p.Cnd_itm_grp_cd6.setLabel(p.Cnd_itm_grp_cd6_Label);
		p.Cnd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.itm_grp_nm6");
		p.Cnd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd7_Label");
		p.Cnd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd7");
		p.Cnd_itm_grp_cd7.setLabel(p.Cnd_itm_grp_cd7_Label);
		p.Cnd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.itm_grp_nm7");
		p.Cnd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd8_Label");
		p.Cnd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd8");
		p.Cnd_itm_grp_cd8.setLabel(p.Cnd_itm_grp_cd8_Label);
		p.Cnd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.itm_grp_nm8");
		p.Cnd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd9_Label");
		p.Cnd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd9");
		p.Cnd_itm_grp_cd9.setLabel(p.Cnd_itm_grp_cd9_Label);
		p.Cnd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.itm_grp_nm9");
		p.Cnd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd10_Label");
		p.Cnd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd10");
		p.Cnd_itm_grp_cd10.setLabel(p.Cnd_itm_grp_cd10_Label);
		p.Cnd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.itm_grp_nm10");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDelCnd(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.DelCndPanel = p.beansFactory.createPanel("DelCnd");
		// ブロックの項目の初期化
		p.DelCnd_calc_grp_cd_Label = p.beansFactory.createLabel("DelCnd.calc_grp_cd_Label");
		p.DelCnd_calc_grp_cd = p.beansFactory.createTextComboBox("DelCnd.calc_grp_cd");
		p.DelCnd_calc_grp_cd.setLabel(p.DelCnd_calc_grp_cd_Label);
		p.DelCnd_calc_grp_nm = p.beansFactory.createTextField("DelCnd.calc_grp_nm");
		p.DelCnd_ym_Label = p.beansFactory.createLabel("DelCnd.ym_Label");
		p.DelCnd_ym = p.beansFactory.createDateField("DelCnd.ym");
		p.DelCnd_ym.setLabel(p.DelCnd_ym_Label);
		p.DelCnd_wg_cd_Label = p.beansFactory.createLabel("DelCnd.wg_cd_Label");
		p.DelCnd_wg_cd = p.beansFactory.createTextComboBox("DelCnd.wg_cd");
		p.DelCnd_wg_cd.setLabel(p.DelCnd_wg_cd_Label);
		p.DelCnd_wg_nm = p.beansFactory.createTextField("DelCnd.wg_nm");
		p.DelCnd_site_cd_Label = p.beansFactory.createLabel("DelCnd.site_cd_Label");
		p.DelCnd_site_cd = p.beansFactory.createTextComboBox("DelCnd.site_cd");
		p.DelCnd_site_cd.setLabel(p.DelCnd_site_cd_Label);
		p.DelCnd_site_nm = p.beansFactory.createTextField("DelCnd.site_nm");
		p.DelCnd_loc_cd_Label = p.beansFactory.createLabel("DelCnd.loc_cd_Label");
		p.DelCnd_loc_cd = p.beansFactory.createTextComboBox("DelCnd.loc_cd");
		p.DelCnd_loc_cd.setLabel(p.DelCnd_loc_cd_Label);
		p.DelCnd_loc_nm = p.beansFactory.createTextField("DelCnd.loc_nm");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_disp_expns_grp = p.beansFactory.createCheckBox("LPnl.disp_expns_grp");
		p.LPnl_disp_expns = p.beansFactory.createCheckBox("LPnl.disp_expns");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_calc_grp_cd = p.beansFactory.createTableColumn("Rslt.calc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_calc_grp_nm = p.beansFactory.createTableColumn("Rslt.calc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_mfg_act_no = p.beansFactory.createTableColumn("Rslt.mfg_act_no", MCColumnType.TEXT);
		p.columnRslt_oper_act_no = p.beansFactory.createTableColumn("Rslt.oper_act_no", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_wip_per = p.beansFactory.createTableColumn("Rslt.wip_per", MCColumnType.NUMBER);
		p.columnRslt_ttl = p.beansFactory.createTableColumn("Rslt.ttl", MCColumnType.NUMBER);
		p.columnRslt_ttl_wip_amt = p.beansFactory.createTableColumn("Rslt.ttl_wip_amt", MCColumnType.NUMBER);
		p.columnRslt_ttl_inpt_amt = p.beansFactory.createTableColumn("Rslt.ttl_inpt_amt", MCColumnType.NUMBER);
		p.columnRslt_col_000 = p.beansFactory.createTableColumn("Rslt.col_000", MCColumnType.NUMBER);
		p.columnRslt_col_001 = p.beansFactory.createTableColumn("Rslt.col_001", MCColumnType.NUMBER);
		p.columnRslt_col_002 = p.beansFactory.createTableColumn("Rslt.col_002", MCColumnType.NUMBER);
		p.columnRslt_col_003 = p.beansFactory.createTableColumn("Rslt.col_003", MCColumnType.NUMBER);
		p.columnRslt_col_004 = p.beansFactory.createTableColumn("Rslt.col_004", MCColumnType.NUMBER);
		p.columnRslt_col_005 = p.beansFactory.createTableColumn("Rslt.col_005", MCColumnType.NUMBER);
		p.columnRslt_col_006 = p.beansFactory.createTableColumn("Rslt.col_006", MCColumnType.NUMBER);
		p.columnRslt_col_007 = p.beansFactory.createTableColumn("Rslt.col_007", MCColumnType.NUMBER);
		p.columnRslt_col_008 = p.beansFactory.createTableColumn("Rslt.col_008", MCColumnType.NUMBER);
		p.columnRslt_col_009 = p.beansFactory.createTableColumn("Rslt.col_009", MCColumnType.NUMBER);
		p.columnRslt_col_010 = p.beansFactory.createTableColumn("Rslt.col_010", MCColumnType.NUMBER);
		p.columnRslt_col_011 = p.beansFactory.createTableColumn("Rslt.col_011", MCColumnType.NUMBER);
		p.columnRslt_col_012 = p.beansFactory.createTableColumn("Rslt.col_012", MCColumnType.NUMBER);
		p.columnRslt_col_013 = p.beansFactory.createTableColumn("Rslt.col_013", MCColumnType.NUMBER);
		p.columnRslt_col_014 = p.beansFactory.createTableColumn("Rslt.col_014", MCColumnType.NUMBER);
		p.columnRslt_col_015 = p.beansFactory.createTableColumn("Rslt.col_015", MCColumnType.NUMBER);
		p.columnRslt_col_016 = p.beansFactory.createTableColumn("Rslt.col_016", MCColumnType.NUMBER);
		p.columnRslt_col_017 = p.beansFactory.createTableColumn("Rslt.col_017", MCColumnType.NUMBER);
		p.columnRslt_col_018 = p.beansFactory.createTableColumn("Rslt.col_018", MCColumnType.NUMBER);
		p.columnRslt_col_019 = p.beansFactory.createTableColumn("Rslt.col_019", MCColumnType.NUMBER);
		p.columnRslt_col_020 = p.beansFactory.createTableColumn("Rslt.col_020", MCColumnType.NUMBER);
		p.columnRslt_col_021 = p.beansFactory.createTableColumn("Rslt.col_021", MCColumnType.NUMBER);
		p.columnRslt_col_022 = p.beansFactory.createTableColumn("Rslt.col_022", MCColumnType.NUMBER);
		p.columnRslt_col_023 = p.beansFactory.createTableColumn("Rslt.col_023", MCColumnType.NUMBER);
		p.columnRslt_col_024 = p.beansFactory.createTableColumn("Rslt.col_024", MCColumnType.NUMBER);
		p.columnRslt_col_025 = p.beansFactory.createTableColumn("Rslt.col_025", MCColumnType.NUMBER);
		p.columnRslt_col_026 = p.beansFactory.createTableColumn("Rslt.col_026", MCColumnType.NUMBER);
		p.columnRslt_col_027 = p.beansFactory.createTableColumn("Rslt.col_027", MCColumnType.NUMBER);
		p.columnRslt_col_028 = p.beansFactory.createTableColumn("Rslt.col_028", MCColumnType.NUMBER);
		p.columnRslt_col_029 = p.beansFactory.createTableColumn("Rslt.col_029", MCColumnType.NUMBER);
		p.columnRslt_col_030 = p.beansFactory.createTableColumn("Rslt.col_030", MCColumnType.NUMBER);
		p.columnRslt_col_031 = p.beansFactory.createTableColumn("Rslt.col_031", MCColumnType.NUMBER);
		p.columnRslt_col_032 = p.beansFactory.createTableColumn("Rslt.col_032", MCColumnType.NUMBER);
		p.columnRslt_col_033 = p.beansFactory.createTableColumn("Rslt.col_033", MCColumnType.NUMBER);
		p.columnRslt_col_034 = p.beansFactory.createTableColumn("Rslt.col_034", MCColumnType.NUMBER);
		p.columnRslt_col_035 = p.beansFactory.createTableColumn("Rslt.col_035", MCColumnType.NUMBER);
		p.columnRslt_col_036 = p.beansFactory.createTableColumn("Rslt.col_036", MCColumnType.NUMBER);
		p.columnRslt_col_037 = p.beansFactory.createTableColumn("Rslt.col_037", MCColumnType.NUMBER);
		p.columnRslt_col_038 = p.beansFactory.createTableColumn("Rslt.col_038", MCColumnType.NUMBER);
		p.columnRslt_col_039 = p.beansFactory.createTableColumn("Rslt.col_039", MCColumnType.NUMBER);
		p.columnRslt_col_040 = p.beansFactory.createTableColumn("Rslt.col_040", MCColumnType.NUMBER);
		p.columnRslt_col_041 = p.beansFactory.createTableColumn("Rslt.col_041", MCColumnType.NUMBER);
		p.columnRslt_col_042 = p.beansFactory.createTableColumn("Rslt.col_042", MCColumnType.NUMBER);
		p.columnRslt_col_043 = p.beansFactory.createTableColumn("Rslt.col_043", MCColumnType.NUMBER);
		p.columnRslt_col_044 = p.beansFactory.createTableColumn("Rslt.col_044", MCColumnType.NUMBER);
		p.columnRslt_col_045 = p.beansFactory.createTableColumn("Rslt.col_045", MCColumnType.NUMBER);
		p.columnRslt_col_046 = p.beansFactory.createTableColumn("Rslt.col_046", MCColumnType.NUMBER);
		p.columnRslt_col_047 = p.beansFactory.createTableColumn("Rslt.col_047", MCColumnType.NUMBER);
		p.columnRslt_col_048 = p.beansFactory.createTableColumn("Rslt.col_048", MCColumnType.NUMBER);
		p.columnRslt_col_049 = p.beansFactory.createTableColumn("Rslt.col_049", MCColumnType.NUMBER);
		p.columnRslt_col_050 = p.beansFactory.createTableColumn("Rslt.col_050", MCColumnType.NUMBER);
		p.columnRslt_col_051 = p.beansFactory.createTableColumn("Rslt.col_051", MCColumnType.NUMBER);
		p.columnRslt_col_052 = p.beansFactory.createTableColumn("Rslt.col_052", MCColumnType.NUMBER);
		p.columnRslt_col_053 = p.beansFactory.createTableColumn("Rslt.col_053", MCColumnType.NUMBER);
		p.columnRslt_col_054 = p.beansFactory.createTableColumn("Rslt.col_054", MCColumnType.NUMBER);
		p.columnRslt_col_055 = p.beansFactory.createTableColumn("Rslt.col_055", MCColumnType.NUMBER);
		p.columnRslt_col_056 = p.beansFactory.createTableColumn("Rslt.col_056", MCColumnType.NUMBER);
		p.columnRslt_col_057 = p.beansFactory.createTableColumn("Rslt.col_057", MCColumnType.NUMBER);
		p.columnRslt_col_058 = p.beansFactory.createTableColumn("Rslt.col_058", MCColumnType.NUMBER);
		p.columnRslt_col_059 = p.beansFactory.createTableColumn("Rslt.col_059", MCColumnType.NUMBER);
		p.columnRslt_col_060 = p.beansFactory.createTableColumn("Rslt.col_060", MCColumnType.NUMBER);
		p.columnRslt_col_061 = p.beansFactory.createTableColumn("Rslt.col_061", MCColumnType.NUMBER);
		p.columnRslt_col_062 = p.beansFactory.createTableColumn("Rslt.col_062", MCColumnType.NUMBER);
		p.columnRslt_col_063 = p.beansFactory.createTableColumn("Rslt.col_063", MCColumnType.NUMBER);
		p.columnRslt_col_064 = p.beansFactory.createTableColumn("Rslt.col_064", MCColumnType.NUMBER);
		p.columnRslt_col_065 = p.beansFactory.createTableColumn("Rslt.col_065", MCColumnType.NUMBER);
		p.columnRslt_col_066 = p.beansFactory.createTableColumn("Rslt.col_066", MCColumnType.NUMBER);
		p.columnRslt_col_067 = p.beansFactory.createTableColumn("Rslt.col_067", MCColumnType.NUMBER);
		p.columnRslt_col_068 = p.beansFactory.createTableColumn("Rslt.col_068", MCColumnType.NUMBER);
		p.columnRslt_col_069 = p.beansFactory.createTableColumn("Rslt.col_069", MCColumnType.NUMBER);
		p.columnRslt_col_070 = p.beansFactory.createTableColumn("Rslt.col_070", MCColumnType.NUMBER);
		p.columnRslt_col_071 = p.beansFactory.createTableColumn("Rslt.col_071", MCColumnType.NUMBER);
		p.columnRslt_col_072 = p.beansFactory.createTableColumn("Rslt.col_072", MCColumnType.NUMBER);
		p.columnRslt_col_073 = p.beansFactory.createTableColumn("Rslt.col_073", MCColumnType.NUMBER);
		p.columnRslt_col_074 = p.beansFactory.createTableColumn("Rslt.col_074", MCColumnType.NUMBER);
		p.columnRslt_col_075 = p.beansFactory.createTableColumn("Rslt.col_075", MCColumnType.NUMBER);
		p.columnRslt_col_076 = p.beansFactory.createTableColumn("Rslt.col_076", MCColumnType.NUMBER);
		p.columnRslt_col_077 = p.beansFactory.createTableColumn("Rslt.col_077", MCColumnType.NUMBER);
		p.columnRslt_col_078 = p.beansFactory.createTableColumn("Rslt.col_078", MCColumnType.NUMBER);
		p.columnRslt_col_079 = p.beansFactory.createTableColumn("Rslt.col_079", MCColumnType.NUMBER);
		p.columnRslt_col_080 = p.beansFactory.createTableColumn("Rslt.col_080", MCColumnType.NUMBER);
		p.columnRslt_col_081 = p.beansFactory.createTableColumn("Rslt.col_081", MCColumnType.NUMBER);
		p.columnRslt_col_082 = p.beansFactory.createTableColumn("Rslt.col_082", MCColumnType.NUMBER);
		p.columnRslt_col_083 = p.beansFactory.createTableColumn("Rslt.col_083", MCColumnType.NUMBER);
		p.columnRslt_col_084 = p.beansFactory.createTableColumn("Rslt.col_084", MCColumnType.NUMBER);
		p.columnRslt_col_085 = p.beansFactory.createTableColumn("Rslt.col_085", MCColumnType.NUMBER);
		p.columnRslt_col_086 = p.beansFactory.createTableColumn("Rslt.col_086", MCColumnType.NUMBER);
		p.columnRslt_col_087 = p.beansFactory.createTableColumn("Rslt.col_087", MCColumnType.NUMBER);
		p.columnRslt_col_088 = p.beansFactory.createTableColumn("Rslt.col_088", MCColumnType.NUMBER);
		p.columnRslt_col_089 = p.beansFactory.createTableColumn("Rslt.col_089", MCColumnType.NUMBER);
		p.columnRslt_col_090 = p.beansFactory.createTableColumn("Rslt.col_090", MCColumnType.NUMBER);
		p.columnRslt_col_091 = p.beansFactory.createTableColumn("Rslt.col_091", MCColumnType.NUMBER);
		p.columnRslt_col_092 = p.beansFactory.createTableColumn("Rslt.col_092", MCColumnType.NUMBER);
		p.columnRslt_col_093 = p.beansFactory.createTableColumn("Rslt.col_093", MCColumnType.NUMBER);
		p.columnRslt_col_094 = p.beansFactory.createTableColumn("Rslt.col_094", MCColumnType.NUMBER);
		p.columnRslt_col_095 = p.beansFactory.createTableColumn("Rslt.col_095", MCColumnType.NUMBER);
		p.columnRslt_col_096 = p.beansFactory.createTableColumn("Rslt.col_096", MCColumnType.NUMBER);
		p.columnRslt_col_097 = p.beansFactory.createTableColumn("Rslt.col_097", MCColumnType.NUMBER);
		p.columnRslt_col_098 = p.beansFactory.createTableColumn("Rslt.col_098", MCColumnType.NUMBER);
		p.columnRslt_col_099 = p.beansFactory.createTableColumn("Rslt.col_099", MCColumnType.NUMBER);
		p.columnRslt_col_100 = p.beansFactory.createTableColumn("Rslt.col_100", MCColumnType.NUMBER);
		p.columnRslt_col_101 = p.beansFactory.createTableColumn("Rslt.col_101", MCColumnType.NUMBER);
		p.columnRslt_col_102 = p.beansFactory.createTableColumn("Rslt.col_102", MCColumnType.NUMBER);
		p.columnRslt_col_103 = p.beansFactory.createTableColumn("Rslt.col_103", MCColumnType.NUMBER);
		p.columnRslt_col_104 = p.beansFactory.createTableColumn("Rslt.col_104", MCColumnType.NUMBER);
		p.columnRslt_col_105 = p.beansFactory.createTableColumn("Rslt.col_105", MCColumnType.NUMBER);
		p.columnRslt_col_106 = p.beansFactory.createTableColumn("Rslt.col_106", MCColumnType.NUMBER);
		p.columnRslt_col_107 = p.beansFactory.createTableColumn("Rslt.col_107", MCColumnType.NUMBER);
		p.columnRslt_col_108 = p.beansFactory.createTableColumn("Rslt.col_108", MCColumnType.NUMBER);
		p.columnRslt_col_109 = p.beansFactory.createTableColumn("Rslt.col_109", MCColumnType.NUMBER);
		p.columnRslt_col_110 = p.beansFactory.createTableColumn("Rslt.col_110", MCColumnType.NUMBER);
		p.columnRslt_col_111 = p.beansFactory.createTableColumn("Rslt.col_111", MCColumnType.NUMBER);
		p.columnRslt_col_112 = p.beansFactory.createTableColumn("Rslt.col_112", MCColumnType.NUMBER);
		p.columnRslt_col_113 = p.beansFactory.createTableColumn("Rslt.col_113", MCColumnType.NUMBER);
		p.columnRslt_col_114 = p.beansFactory.createTableColumn("Rslt.col_114", MCColumnType.NUMBER);
		p.columnRslt_col_115 = p.beansFactory.createTableColumn("Rslt.col_115", MCColumnType.NUMBER);
		p.columnRslt_col_116 = p.beansFactory.createTableColumn("Rslt.col_116", MCColumnType.NUMBER);
		p.columnRslt_col_117 = p.beansFactory.createTableColumn("Rslt.col_117", MCColumnType.NUMBER);
		p.columnRslt_col_118 = p.beansFactory.createTableColumn("Rslt.col_118", MCColumnType.NUMBER);
		p.columnRslt_col_119 = p.beansFactory.createTableColumn("Rslt.col_119", MCColumnType.NUMBER);
		p.columnRslt_col_120 = p.beansFactory.createTableColumn("Rslt.col_120", MCColumnType.NUMBER);
		p.columnRslt_col_121 = p.beansFactory.createTableColumn("Rslt.col_121", MCColumnType.NUMBER);
		p.columnRslt_col_122 = p.beansFactory.createTableColumn("Rslt.col_122", MCColumnType.NUMBER);
		p.columnRslt_col_123 = p.beansFactory.createTableColumn("Rslt.col_123", MCColumnType.NUMBER);
		p.columnRslt_col_124 = p.beansFactory.createTableColumn("Rslt.col_124", MCColumnType.NUMBER);
		p.columnRslt_col_125 = p.beansFactory.createTableColumn("Rslt.col_125", MCColumnType.NUMBER);
		p.columnRslt_col_126 = p.beansFactory.createTableColumn("Rslt.col_126", MCColumnType.NUMBER);
		p.columnRslt_col_127 = p.beansFactory.createTableColumn("Rslt.col_127", MCColumnType.NUMBER);
		p.columnRslt_col_128 = p.beansFactory.createTableColumn("Rslt.col_128", MCColumnType.NUMBER);
		p.columnRslt_col_129 = p.beansFactory.createTableColumn("Rslt.col_129", MCColumnType.NUMBER);
		p.columnRslt_col_130 = p.beansFactory.createTableColumn("Rslt.col_130", MCColumnType.NUMBER);
		p.columnRslt_col_131 = p.beansFactory.createTableColumn("Rslt.col_131", MCColumnType.NUMBER);
		p.columnRslt_col_132 = p.beansFactory.createTableColumn("Rslt.col_132", MCColumnType.NUMBER);
		p.columnRslt_col_133 = p.beansFactory.createTableColumn("Rslt.col_133", MCColumnType.NUMBER);
		p.columnRslt_col_134 = p.beansFactory.createTableColumn("Rslt.col_134", MCColumnType.NUMBER);
		p.columnRslt_col_135 = p.beansFactory.createTableColumn("Rslt.col_135", MCColumnType.NUMBER);
		p.columnRslt_col_136 = p.beansFactory.createTableColumn("Rslt.col_136", MCColumnType.NUMBER);
		p.columnRslt_col_137 = p.beansFactory.createTableColumn("Rslt.col_137", MCColumnType.NUMBER);
		p.columnRslt_col_138 = p.beansFactory.createTableColumn("Rslt.col_138", MCColumnType.NUMBER);
		p.columnRslt_col_139 = p.beansFactory.createTableColumn("Rslt.col_139", MCColumnType.NUMBER);
		p.columnRslt_col_140 = p.beansFactory.createTableColumn("Rslt.col_140", MCColumnType.NUMBER);
		p.columnRslt_col_141 = p.beansFactory.createTableColumn("Rslt.col_141", MCColumnType.NUMBER);
		p.columnRslt_col_142 = p.beansFactory.createTableColumn("Rslt.col_142", MCColumnType.NUMBER);
		p.columnRslt_col_143 = p.beansFactory.createTableColumn("Rslt.col_143", MCColumnType.NUMBER);
		p.columnRslt_col_144 = p.beansFactory.createTableColumn("Rslt.col_144", MCColumnType.NUMBER);
		p.columnRslt_col_145 = p.beansFactory.createTableColumn("Rslt.col_145", MCColumnType.NUMBER);
		p.columnRslt_col_146 = p.beansFactory.createTableColumn("Rslt.col_146", MCColumnType.NUMBER);
		p.columnRslt_col_147 = p.beansFactory.createTableColumn("Rslt.col_147", MCColumnType.NUMBER);
		p.columnRslt_col_148 = p.beansFactory.createTableColumn("Rslt.col_148", MCColumnType.NUMBER);
		p.columnRslt_col_149 = p.beansFactory.createTableColumn("Rslt.col_149", MCColumnType.NUMBER);
		p.columnRslt_col_150 = p.beansFactory.createTableColumn("Rslt.col_150", MCColumnType.NUMBER);
		p.columnRslt_col_151 = p.beansFactory.createTableColumn("Rslt.col_151", MCColumnType.NUMBER);
		p.columnRslt_col_152 = p.beansFactory.createTableColumn("Rslt.col_152", MCColumnType.NUMBER);
		p.columnRslt_col_153 = p.beansFactory.createTableColumn("Rslt.col_153", MCColumnType.NUMBER);
		p.columnRslt_col_154 = p.beansFactory.createTableColumn("Rslt.col_154", MCColumnType.NUMBER);
		p.columnRslt_col_155 = p.beansFactory.createTableColumn("Rslt.col_155", MCColumnType.NUMBER);
		p.columnRslt_col_156 = p.beansFactory.createTableColumn("Rslt.col_156", MCColumnType.NUMBER);
		p.columnRslt_col_157 = p.beansFactory.createTableColumn("Rslt.col_157", MCColumnType.NUMBER);
		p.columnRslt_col_158 = p.beansFactory.createTableColumn("Rslt.col_158", MCColumnType.NUMBER);
		p.columnRslt_col_159 = p.beansFactory.createTableColumn("Rslt.col_159", MCColumnType.NUMBER);
		p.columnRslt_col_160 = p.beansFactory.createTableColumn("Rslt.col_160", MCColumnType.NUMBER);
		p.columnRslt_col_161 = p.beansFactory.createTableColumn("Rslt.col_161", MCColumnType.NUMBER);
		p.columnRslt_col_162 = p.beansFactory.createTableColumn("Rslt.col_162", MCColumnType.NUMBER);
		p.columnRslt_col_163 = p.beansFactory.createTableColumn("Rslt.col_163", MCColumnType.NUMBER);
		p.columnRslt_col_164 = p.beansFactory.createTableColumn("Rslt.col_164", MCColumnType.NUMBER);
		p.columnRslt_col_165 = p.beansFactory.createTableColumn("Rslt.col_165", MCColumnType.NUMBER);
		p.columnRslt_col_166 = p.beansFactory.createTableColumn("Rslt.col_166", MCColumnType.NUMBER);
		p.columnRslt_col_167 = p.beansFactory.createTableColumn("Rslt.col_167", MCColumnType.NUMBER);
		p.columnRslt_col_168 = p.beansFactory.createTableColumn("Rslt.col_168", MCColumnType.NUMBER);
		p.columnRslt_col_169 = p.beansFactory.createTableColumn("Rslt.col_169", MCColumnType.NUMBER);
		p.columnRslt_col_170 = p.beansFactory.createTableColumn("Rslt.col_170", MCColumnType.NUMBER);
		p.columnRslt_col_171 = p.beansFactory.createTableColumn("Rslt.col_171", MCColumnType.NUMBER);
		p.columnRslt_col_172 = p.beansFactory.createTableColumn("Rslt.col_172", MCColumnType.NUMBER);
		p.columnRslt_col_173 = p.beansFactory.createTableColumn("Rslt.col_173", MCColumnType.NUMBER);
		p.columnRslt_col_174 = p.beansFactory.createTableColumn("Rslt.col_174", MCColumnType.NUMBER);
		p.columnRslt_col_175 = p.beansFactory.createTableColumn("Rslt.col_175", MCColumnType.NUMBER);
		p.columnRslt_col_176 = p.beansFactory.createTableColumn("Rslt.col_176", MCColumnType.NUMBER);
		p.columnRslt_col_177 = p.beansFactory.createTableColumn("Rslt.col_177", MCColumnType.NUMBER);
		p.columnRslt_col_178 = p.beansFactory.createTableColumn("Rslt.col_178", MCColumnType.NUMBER);
		p.columnRslt_col_179 = p.beansFactory.createTableColumn("Rslt.col_179", MCColumnType.NUMBER);
		p.columnRslt_col_180 = p.beansFactory.createTableColumn("Rslt.col_180", MCColumnType.NUMBER);
		p.columnRslt_col_181 = p.beansFactory.createTableColumn("Rslt.col_181", MCColumnType.NUMBER);
		p.columnRslt_col_182 = p.beansFactory.createTableColumn("Rslt.col_182", MCColumnType.NUMBER);
		p.columnRslt_col_183 = p.beansFactory.createTableColumn("Rslt.col_183", MCColumnType.NUMBER);
		p.columnRslt_col_184 = p.beansFactory.createTableColumn("Rslt.col_184", MCColumnType.NUMBER);
		p.columnRslt_col_185 = p.beansFactory.createTableColumn("Rslt.col_185", MCColumnType.NUMBER);
		p.columnRslt_col_186 = p.beansFactory.createTableColumn("Rslt.col_186", MCColumnType.NUMBER);
		p.columnRslt_col_187 = p.beansFactory.createTableColumn("Rslt.col_187", MCColumnType.NUMBER);
		p.columnRslt_col_188 = p.beansFactory.createTableColumn("Rslt.col_188", MCColumnType.NUMBER);
		p.columnRslt_col_189 = p.beansFactory.createTableColumn("Rslt.col_189", MCColumnType.NUMBER);
		p.columnRslt_col_190 = p.beansFactory.createTableColumn("Rslt.col_190", MCColumnType.NUMBER);
		p.columnRslt_col_191 = p.beansFactory.createTableColumn("Rslt.col_191", MCColumnType.NUMBER);
		p.columnRslt_col_192 = p.beansFactory.createTableColumn("Rslt.col_192", MCColumnType.NUMBER);
		p.columnRslt_col_193 = p.beansFactory.createTableColumn("Rslt.col_193", MCColumnType.NUMBER);
		p.columnRslt_col_194 = p.beansFactory.createTableColumn("Rslt.col_194", MCColumnType.NUMBER);
		p.columnRslt_col_195 = p.beansFactory.createTableColumn("Rslt.col_195", MCColumnType.NUMBER);
		p.columnRslt_col_196 = p.beansFactory.createTableColumn("Rslt.col_196", MCColumnType.NUMBER);
		p.columnRslt_col_197 = p.beansFactory.createTableColumn("Rslt.col_197", MCColumnType.NUMBER);
		p.columnRslt_col_198 = p.beansFactory.createTableColumn("Rslt.col_198", MCColumnType.NUMBER);
		p.columnRslt_col_199 = p.beansFactory.createTableColumn("Rslt.col_199", MCColumnType.NUMBER);
		p.columnRslt_col_200 = p.beansFactory.createTableColumn("Rslt.col_200", MCColumnType.NUMBER);
		p.columnRslt_col_201 = p.beansFactory.createTableColumn("Rslt.col_201", MCColumnType.NUMBER);
		p.columnRslt_col_202 = p.beansFactory.createTableColumn("Rslt.col_202", MCColumnType.NUMBER);
		p.columnRslt_col_203 = p.beansFactory.createTableColumn("Rslt.col_203", MCColumnType.NUMBER);
		p.columnRslt_col_204 = p.beansFactory.createTableColumn("Rslt.col_204", MCColumnType.NUMBER);
		p.columnRslt_col_205 = p.beansFactory.createTableColumn("Rslt.col_205", MCColumnType.NUMBER);
		p.columnRslt_col_206 = p.beansFactory.createTableColumn("Rslt.col_206", MCColumnType.NUMBER);
		p.columnRslt_col_207 = p.beansFactory.createTableColumn("Rslt.col_207", MCColumnType.NUMBER);
		p.columnRslt_col_208 = p.beansFactory.createTableColumn("Rslt.col_208", MCColumnType.NUMBER);
		p.columnRslt_col_209 = p.beansFactory.createTableColumn("Rslt.col_209", MCColumnType.NUMBER);
		p.columnRslt_col_210 = p.beansFactory.createTableColumn("Rslt.col_210", MCColumnType.NUMBER);
		p.columnRslt_col_211 = p.beansFactory.createTableColumn("Rslt.col_211", MCColumnType.NUMBER);
		p.columnRslt_col_212 = p.beansFactory.createTableColumn("Rslt.col_212", MCColumnType.NUMBER);
		p.columnRslt_col_213 = p.beansFactory.createTableColumn("Rslt.col_213", MCColumnType.NUMBER);
		p.columnRslt_col_214 = p.beansFactory.createTableColumn("Rslt.col_214", MCColumnType.NUMBER);
		p.columnRslt_col_215 = p.beansFactory.createTableColumn("Rslt.col_215", MCColumnType.NUMBER);
		p.columnRslt_col_216 = p.beansFactory.createTableColumn("Rslt.col_216", MCColumnType.NUMBER);
		p.columnRslt_col_217 = p.beansFactory.createTableColumn("Rslt.col_217", MCColumnType.NUMBER);
		p.columnRslt_col_218 = p.beansFactory.createTableColumn("Rslt.col_218", MCColumnType.NUMBER);
		p.columnRslt_col_219 = p.beansFactory.createTableColumn("Rslt.col_219", MCColumnType.NUMBER);
		p.columnRslt_col_220 = p.beansFactory.createTableColumn("Rslt.col_220", MCColumnType.NUMBER);
		p.columnRslt_col_221 = p.beansFactory.createTableColumn("Rslt.col_221", MCColumnType.NUMBER);
		p.columnRslt_col_222 = p.beansFactory.createTableColumn("Rslt.col_222", MCColumnType.NUMBER);
		p.columnRslt_col_223 = p.beansFactory.createTableColumn("Rslt.col_223", MCColumnType.NUMBER);
		p.columnRslt_col_224 = p.beansFactory.createTableColumn("Rslt.col_224", MCColumnType.NUMBER);
		p.columnRslt_col_225 = p.beansFactory.createTableColumn("Rslt.col_225", MCColumnType.NUMBER);
		p.columnRslt_col_226 = p.beansFactory.createTableColumn("Rslt.col_226", MCColumnType.NUMBER);
		p.columnRslt_col_227 = p.beansFactory.createTableColumn("Rslt.col_227", MCColumnType.NUMBER);
		p.columnRslt_col_228 = p.beansFactory.createTableColumn("Rslt.col_228", MCColumnType.NUMBER);
		p.columnRslt_col_229 = p.beansFactory.createTableColumn("Rslt.col_229", MCColumnType.NUMBER);
		p.columnRslt_col_230 = p.beansFactory.createTableColumn("Rslt.col_230", MCColumnType.NUMBER);
		p.columnRslt_col_231 = p.beansFactory.createTableColumn("Rslt.col_231", MCColumnType.NUMBER);
		p.columnRslt_col_232 = p.beansFactory.createTableColumn("Rslt.col_232", MCColumnType.NUMBER);
		p.columnRslt_col_233 = p.beansFactory.createTableColumn("Rslt.col_233", MCColumnType.NUMBER);
		p.columnRslt_col_234 = p.beansFactory.createTableColumn("Rslt.col_234", MCColumnType.NUMBER);
		p.columnRslt_col_235 = p.beansFactory.createTableColumn("Rslt.col_235", MCColumnType.NUMBER);
		p.columnRslt_col_236 = p.beansFactory.createTableColumn("Rslt.col_236", MCColumnType.NUMBER);
		p.columnRslt_col_237 = p.beansFactory.createTableColumn("Rslt.col_237", MCColumnType.NUMBER);
		p.columnRslt_col_238 = p.beansFactory.createTableColumn("Rslt.col_238", MCColumnType.NUMBER);
		p.columnRslt_col_239 = p.beansFactory.createTableColumn("Rslt.col_239", MCColumnType.NUMBER);
		p.columnRslt_col_240 = p.beansFactory.createTableColumn("Rslt.col_240", MCColumnType.NUMBER);
		p.columnRslt_col_241 = p.beansFactory.createTableColumn("Rslt.col_241", MCColumnType.NUMBER);
		p.columnRslt_col_242 = p.beansFactory.createTableColumn("Rslt.col_242", MCColumnType.NUMBER);
		p.columnRslt_col_243 = p.beansFactory.createTableColumn("Rslt.col_243", MCColumnType.NUMBER);
		p.columnRslt_col_244 = p.beansFactory.createTableColumn("Rslt.col_244", MCColumnType.NUMBER);
		p.columnRslt_col_245 = p.beansFactory.createTableColumn("Rslt.col_245", MCColumnType.NUMBER);
		p.columnRslt_col_246 = p.beansFactory.createTableColumn("Rslt.col_246", MCColumnType.NUMBER);
		p.columnRslt_col_247 = p.beansFactory.createTableColumn("Rslt.col_247", MCColumnType.NUMBER);
		p.columnRslt_col_248 = p.beansFactory.createTableColumn("Rslt.col_248", MCColumnType.NUMBER);
		p.columnRslt_col_249 = p.beansFactory.createTableColumn("Rslt.col_249", MCColumnType.NUMBER);
		p.columnRslt_col_250 = p.beansFactory.createTableColumn("Rslt.col_250", MCColumnType.NUMBER);
		p.columnRslt_col_251 = p.beansFactory.createTableColumn("Rslt.col_251", MCColumnType.NUMBER);
		p.columnRslt_col_252 = p.beansFactory.createTableColumn("Rslt.col_252", MCColumnType.NUMBER);
		p.columnRslt_col_253 = p.beansFactory.createTableColumn("Rslt.col_253", MCColumnType.NUMBER);
		p.columnRslt_col_254 = p.beansFactory.createTableColumn("Rslt.col_254", MCColumnType.NUMBER);
		p.columnRslt_col_255 = p.beansFactory.createTableColumn("Rslt.col_255", MCColumnType.NUMBER);
		p.columnRslt_col_256 = p.beansFactory.createTableColumn("Rslt.col_256", MCColumnType.NUMBER);
		p.columnRslt_col_257 = p.beansFactory.createTableColumn("Rslt.col_257", MCColumnType.NUMBER);
		p.columnRslt_col_258 = p.beansFactory.createTableColumn("Rslt.col_258", MCColumnType.NUMBER);
		p.columnRslt_col_259 = p.beansFactory.createTableColumn("Rslt.col_259", MCColumnType.NUMBER);
		p.columnRslt_col_260 = p.beansFactory.createTableColumn("Rslt.col_260", MCColumnType.NUMBER);
		p.columnRslt_col_261 = p.beansFactory.createTableColumn("Rslt.col_261", MCColumnType.NUMBER);
		p.columnRslt_col_262 = p.beansFactory.createTableColumn("Rslt.col_262", MCColumnType.NUMBER);
		p.columnRslt_col_263 = p.beansFactory.createTableColumn("Rslt.col_263", MCColumnType.NUMBER);
		p.columnRslt_col_264 = p.beansFactory.createTableColumn("Rslt.col_264", MCColumnType.NUMBER);
		p.columnRslt_col_265 = p.beansFactory.createTableColumn("Rslt.col_265", MCColumnType.NUMBER);
		p.columnRslt_col_266 = p.beansFactory.createTableColumn("Rslt.col_266", MCColumnType.NUMBER);
		p.columnRslt_col_267 = p.beansFactory.createTableColumn("Rslt.col_267", MCColumnType.NUMBER);
		p.columnRslt_col_268 = p.beansFactory.createTableColumn("Rslt.col_268", MCColumnType.NUMBER);
		p.columnRslt_col_269 = p.beansFactory.createTableColumn("Rslt.col_269", MCColumnType.NUMBER);
		p.columnRslt_col_270 = p.beansFactory.createTableColumn("Rslt.col_270", MCColumnType.NUMBER);
		p.columnRslt_col_271 = p.beansFactory.createTableColumn("Rslt.col_271", MCColumnType.NUMBER);
		p.columnRslt_col_272 = p.beansFactory.createTableColumn("Rslt.col_272", MCColumnType.NUMBER);
		p.columnRslt_col_273 = p.beansFactory.createTableColumn("Rslt.col_273", MCColumnType.NUMBER);
		p.columnRslt_col_274 = p.beansFactory.createTableColumn("Rslt.col_274", MCColumnType.NUMBER);
		p.columnRslt_col_275 = p.beansFactory.createTableColumn("Rslt.col_275", MCColumnType.NUMBER);
		p.columnRslt_col_276 = p.beansFactory.createTableColumn("Rslt.col_276", MCColumnType.NUMBER);
		p.columnRslt_col_277 = p.beansFactory.createTableColumn("Rslt.col_277", MCColumnType.NUMBER);
		p.columnRslt_col_278 = p.beansFactory.createTableColumn("Rslt.col_278", MCColumnType.NUMBER);
		p.columnRslt_col_279 = p.beansFactory.createTableColumn("Rslt.col_279", MCColumnType.NUMBER);
		p.columnRslt_col_280 = p.beansFactory.createTableColumn("Rslt.col_280", MCColumnType.NUMBER);
		p.columnRslt_col_281 = p.beansFactory.createTableColumn("Rslt.col_281", MCColumnType.NUMBER);
		p.columnRslt_col_282 = p.beansFactory.createTableColumn("Rslt.col_282", MCColumnType.NUMBER);
		p.columnRslt_col_283 = p.beansFactory.createTableColumn("Rslt.col_283", MCColumnType.NUMBER);
		p.columnRslt_col_284 = p.beansFactory.createTableColumn("Rslt.col_284", MCColumnType.NUMBER);
		p.columnRslt_col_285 = p.beansFactory.createTableColumn("Rslt.col_285", MCColumnType.NUMBER);
		p.columnRslt_col_286 = p.beansFactory.createTableColumn("Rslt.col_286", MCColumnType.NUMBER);
		p.columnRslt_col_287 = p.beansFactory.createTableColumn("Rslt.col_287", MCColumnType.NUMBER);
		p.columnRslt_col_288 = p.beansFactory.createTableColumn("Rslt.col_288", MCColumnType.NUMBER);
		p.columnRslt_col_289 = p.beansFactory.createTableColumn("Rslt.col_289", MCColumnType.NUMBER);
		p.columnRslt_col_290 = p.beansFactory.createTableColumn("Rslt.col_290", MCColumnType.NUMBER);
		p.columnRslt_col_291 = p.beansFactory.createTableColumn("Rslt.col_291", MCColumnType.NUMBER);
		p.columnRslt_col_292 = p.beansFactory.createTableColumn("Rslt.col_292", MCColumnType.NUMBER);
		p.columnRslt_col_293 = p.beansFactory.createTableColumn("Rslt.col_293", MCColumnType.NUMBER);
		p.columnRslt_col_294 = p.beansFactory.createTableColumn("Rslt.col_294", MCColumnType.NUMBER);
		p.columnRslt_col_295 = p.beansFactory.createTableColumn("Rslt.col_295", MCColumnType.NUMBER);
		p.columnRslt_col_296 = p.beansFactory.createTableColumn("Rslt.col_296", MCColumnType.NUMBER);
		p.columnRslt_col_297 = p.beansFactory.createTableColumn("Rslt.col_297", MCColumnType.NUMBER);
		p.columnRslt_col_298 = p.beansFactory.createTableColumn("Rslt.col_298", MCColumnType.NUMBER);
		p.columnRslt_col_299 = p.beansFactory.createTableColumn("Rslt.col_299", MCColumnType.NUMBER);
		p.columnRslt_st_wip_key = p.beansFactory.createTableColumn("Rslt.st_wip_key", MCColumnType.NUMBER);
		p.cgRslt_cg_ttl = p.beansFactory.createColumnGroup("Rslt.cg_ttl");
		p.cgRslt_cg0 = p.beansFactory.createColumnGroup("Rslt.cg0");
		p.cgRslt_cg1 = p.beansFactory.createColumnGroup("Rslt.cg1");
		p.cgRslt_cg2 = p.beansFactory.createColumnGroup("Rslt.cg2");
		p.cgRslt_cg3 = p.beansFactory.createColumnGroup("Rslt.cg3");
		p.cgRslt_cg4 = p.beansFactory.createColumnGroup("Rslt.cg4");
		p.cgRslt_cg5 = p.beansFactory.createColumnGroup("Rslt.cg5");
		p.cgRslt_cg6 = p.beansFactory.createColumnGroup("Rslt.cg6");
		p.cgRslt_cg7 = p.beansFactory.createColumnGroup("Rslt.cg7");
		p.cgRslt_cg8 = p.beansFactory.createColumnGroup("Rslt.cg8");
		p.cgRslt_cg9 = p.beansFactory.createColumnGroup("Rslt.cg9");
		p.cgRslt_cg10 = p.beansFactory.createColumnGroup("Rslt.cg10");
		p.cgRslt_cg11 = p.beansFactory.createColumnGroup("Rslt.cg11");
		p.cgRslt_cg12 = p.beansFactory.createColumnGroup("Rslt.cg12");
		p.cgRslt_cg13 = p.beansFactory.createColumnGroup("Rslt.cg13");
		p.cgRslt_cg14 = p.beansFactory.createColumnGroup("Rslt.cg14");
		p.cgRslt_cg15 = p.beansFactory.createColumnGroup("Rslt.cg15");
		p.cgRslt_cg16 = p.beansFactory.createColumnGroup("Rslt.cg16");
		p.cgRslt_cg17 = p.beansFactory.createColumnGroup("Rslt.cg17");
		p.cgRslt_cg18 = p.beansFactory.createColumnGroup("Rslt.cg18");
		p.cgRslt_cg19 = p.beansFactory.createColumnGroup("Rslt.cg19");
		p.cgRslt_cg20 = p.beansFactory.createColumnGroup("Rslt.cg20");
		p.cgRslt_cg21 = p.beansFactory.createColumnGroup("Rslt.cg21");
		p.cgRslt_cg22 = p.beansFactory.createColumnGroup("Rslt.cg22");
		p.cgRslt_cg23 = p.beansFactory.createColumnGroup("Rslt.cg23");
		p.cgRslt_cg24 = p.beansFactory.createColumnGroup("Rslt.cg24");
		p.cgRslt_cg25 = p.beansFactory.createColumnGroup("Rslt.cg25");
		p.cgRslt_cg26 = p.beansFactory.createColumnGroup("Rslt.cg26");
		p.cgRslt_cg27 = p.beansFactory.createColumnGroup("Rslt.cg27");
		p.cgRslt_cg28 = p.beansFactory.createColumnGroup("Rslt.cg28");
		p.cgRslt_cg29 = p.beansFactory.createColumnGroup("Rslt.cg29");
		p.cgRslt_cg30 = p.beansFactory.createColumnGroup("Rslt.cg30");
		p.cgRslt_cg31 = p.beansFactory.createColumnGroup("Rslt.cg31");
		p.cgRslt_cg32 = p.beansFactory.createColumnGroup("Rslt.cg32");
		p.cgRslt_cg33 = p.beansFactory.createColumnGroup("Rslt.cg33");
		p.cgRslt_cg34 = p.beansFactory.createColumnGroup("Rslt.cg34");
		p.cgRslt_cg35 = p.beansFactory.createColumnGroup("Rslt.cg35");
		p.cgRslt_cg36 = p.beansFactory.createColumnGroup("Rslt.cg36");
		p.cgRslt_cg37 = p.beansFactory.createColumnGroup("Rslt.cg37");
		p.cgRslt_cg38 = p.beansFactory.createColumnGroup("Rslt.cg38");
		p.cgRslt_cg39 = p.beansFactory.createColumnGroup("Rslt.cg39");
		p.cgRslt_cg40 = p.beansFactory.createColumnGroup("Rslt.cg40");
		p.cgRslt_cg41 = p.beansFactory.createColumnGroup("Rslt.cg41");
		p.cgRslt_cg42 = p.beansFactory.createColumnGroup("Rslt.cg42");
		p.cgRslt_cg43 = p.beansFactory.createColumnGroup("Rslt.cg43");
		p.cgRslt_cg44 = p.beansFactory.createColumnGroup("Rslt.cg44");
		p.cgRslt_cg45 = p.beansFactory.createColumnGroup("Rslt.cg45");
		p.cgRslt_cg46 = p.beansFactory.createColumnGroup("Rslt.cg46");
		p.cgRslt_cg47 = p.beansFactory.createColumnGroup("Rslt.cg47");
		p.cgRslt_cg48 = p.beansFactory.createColumnGroup("Rslt.cg48");
		p.cgRslt_cg49 = p.beansFactory.createColumnGroup("Rslt.cg49");
		p.cgRslt_cg50 = p.beansFactory.createColumnGroup("Rslt.cg50");
		p.cgRslt_cg51 = p.beansFactory.createColumnGroup("Rslt.cg51");
		p.cgRslt_cg52 = p.beansFactory.createColumnGroup("Rslt.cg52");
		p.cgRslt_cg53 = p.beansFactory.createColumnGroup("Rslt.cg53");
		p.cgRslt_cg54 = p.beansFactory.createColumnGroup("Rslt.cg54");
		p.cgRslt_cg55 = p.beansFactory.createColumnGroup("Rslt.cg55");
		p.cgRslt_cg56 = p.beansFactory.createColumnGroup("Rslt.cg56");
		p.cgRslt_cg57 = p.beansFactory.createColumnGroup("Rslt.cg57");
		p.cgRslt_cg58 = p.beansFactory.createColumnGroup("Rslt.cg58");
		p.cgRslt_cg59 = p.beansFactory.createColumnGroup("Rslt.cg59");
		p.cgRslt_cg60 = p.beansFactory.createColumnGroup("Rslt.cg60");
		p.cgRslt_cg61 = p.beansFactory.createColumnGroup("Rslt.cg61");
		p.cgRslt_cg62 = p.beansFactory.createColumnGroup("Rslt.cg62");
		p.cgRslt_cg63 = p.beansFactory.createColumnGroup("Rslt.cg63");
		p.cgRslt_cg64 = p.beansFactory.createColumnGroup("Rslt.cg64");
		p.cgRslt_cg65 = p.beansFactory.createColumnGroup("Rslt.cg65");
		p.cgRslt_cg66 = p.beansFactory.createColumnGroup("Rslt.cg66");
		p.cgRslt_cg67 = p.beansFactory.createColumnGroup("Rslt.cg67");
		p.cgRslt_cg68 = p.beansFactory.createColumnGroup("Rslt.cg68");
		p.cgRslt_cg69 = p.beansFactory.createColumnGroup("Rslt.cg69");
		p.cgRslt_cg70 = p.beansFactory.createColumnGroup("Rslt.cg70");
		p.cgRslt_cg71 = p.beansFactory.createColumnGroup("Rslt.cg71");
		p.cgRslt_cg72 = p.beansFactory.createColumnGroup("Rslt.cg72");
		p.cgRslt_cg73 = p.beansFactory.createColumnGroup("Rslt.cg73");
		p.cgRslt_cg74 = p.beansFactory.createColumnGroup("Rslt.cg74");
		p.cgRslt_cg75 = p.beansFactory.createColumnGroup("Rslt.cg75");
		p.cgRslt_cg76 = p.beansFactory.createColumnGroup("Rslt.cg76");
		p.cgRslt_cg77 = p.beansFactory.createColumnGroup("Rslt.cg77");
		p.cgRslt_cg78 = p.beansFactory.createColumnGroup("Rslt.cg78");
		p.cgRslt_cg79 = p.beansFactory.createColumnGroup("Rslt.cg79");
		p.cgRslt_cg80 = p.beansFactory.createColumnGroup("Rslt.cg80");
		p.cgRslt_cg81 = p.beansFactory.createColumnGroup("Rslt.cg81");
		p.cgRslt_cg82 = p.beansFactory.createColumnGroup("Rslt.cg82");
		p.cgRslt_cg83 = p.beansFactory.createColumnGroup("Rslt.cg83");
		p.cgRslt_cg84 = p.beansFactory.createColumnGroup("Rslt.cg84");
		p.cgRslt_cg85 = p.beansFactory.createColumnGroup("Rslt.cg85");
		p.cgRslt_cg86 = p.beansFactory.createColumnGroup("Rslt.cg86");
		p.cgRslt_cg87 = p.beansFactory.createColumnGroup("Rslt.cg87");
		p.cgRslt_cg88 = p.beansFactory.createColumnGroup("Rslt.cg88");
		p.cgRslt_cg89 = p.beansFactory.createColumnGroup("Rslt.cg89");
		p.cgRslt_cg90 = p.beansFactory.createColumnGroup("Rslt.cg90");
		p.cgRslt_cg91 = p.beansFactory.createColumnGroup("Rslt.cg91");
		p.cgRslt_cg92 = p.beansFactory.createColumnGroup("Rslt.cg92");
		p.cgRslt_cg93 = p.beansFactory.createColumnGroup("Rslt.cg93");
		p.cgRslt_cg94 = p.beansFactory.createColumnGroup("Rslt.cg94");
		p.cgRslt_cg95 = p.beansFactory.createColumnGroup("Rslt.cg95");
		p.cgRslt_cg96 = p.beansFactory.createColumnGroup("Rslt.cg96");
		p.cgRslt_cg97 = p.beansFactory.createColumnGroup("Rslt.cg97");
		p.cgRslt_cg98 = p.beansFactory.createColumnGroup("Rslt.cg98");
		p.cgRslt_cg99 = p.beansFactory.createColumnGroup("Rslt.cg99");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0030 = p.beansFactory.createButton("Btn.open_MGBBP0030", "open");
		p.Btn_open_MGBBP0040 = p.beansFactory.createButton("Btn.open_MGBBP0040", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_bulk = p.beansFactory.createButton("Btn.del_bulk", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBBP_StWipReg p) {
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
	protected static void jbInitTop(MGBBP_StWipReg p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBBP_StWipReg p) {
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
	protected static void jbInitTab1(MGBBP_StWipReg p) {
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
	protected static void jbInitTab2(MGBBP_StWipReg p) {
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
	protected static void jbInitTab3(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DelCndPanel, null);
		p.Tab3Panel.setLastBeans(p.DelCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_DELBULK);
		p.Cnd_ope_DELBULK.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DELBULK);
		p.ScreenOpePanel.add(p.Cnd_ope_DELBULK);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.calc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_grp_nm, true);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_itm_mfg_inst_no);
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
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_oper_act_no);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.CndPanel.add(p.Cnd_oper_act_no_Label);
		p.CndPanel.add(p.Cnd_oper_act_no);
		p.Cnd_oper_act_no.setNextBeans(p.Cnd_site_cd);
		p.Cnd_oper_act_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.oper_act_no_META);
		p.setPluralValueEnable(p.Cnd_oper_act_no, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0220.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDelCnd(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.DelCndPanel.setValueCheck(false);
		p.DelCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DelCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DelCnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.DelCnd_calc_grp_cd.setLinkBeans(p.DelCnd_calc_grp_nm);
		p.DelCndPanel.add(p.DelCnd_calc_grp_cd_Label);
		p.DelCndPanel.add(p.DelCnd_calc_grp_cd);
		p.DelCndPanel.setLastBeans(p.DelCnd_calc_grp_cd);
		p.DelCnd_calc_grp_cd.setNextBeans(p.DelCnd_calc_grp_nm);
		p.DelCnd_calc_grp_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.calc_grp_cd_META);
		p.DelCndPanel.add(p.DelCnd_calc_grp_nm);
		p.DelCnd_calc_grp_nm.setNextBeans(p.DelCnd_ym);
		p.DelCnd_calc_grp_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.calc_grp_nm_META);
		p.DelCndPanel.add(p.DelCnd_ym_Label);
		p.DelCndPanel.add(p.DelCnd_ym);
		p.DelCnd_ym.setNextBeans(p.DelCnd_wg_cd);
		p.DelCnd_ym.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.ym_META);
		p.DelCnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DelCnd_wg_cd.setListType(MCListType.STRICT);
		p.DelCnd_wg_cd.setLinkBeans(p.DelCnd_wg_nm);
		p.DelCndPanel.add(p.DelCnd_wg_cd_Label);
		p.DelCndPanel.add(p.DelCnd_wg_cd);
		p.DelCnd_wg_cd.setNextBeans(p.DelCnd_wg_nm);
		p.DelCnd_wg_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.wg_cd_META);
		p.DelCndPanel.add(p.DelCnd_wg_nm);
		p.DelCnd_wg_nm.setNextBeans(p.DelCnd_site_cd);
		p.DelCnd_wg_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.wg_nm_META);
		p.DelCnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.DelCnd_site_cd, true);
		p.DelCnd_site_cd.setLinkBeans(p.DelCnd_site_nm);
		p.DelCndPanel.add(p.DelCnd_site_cd_Label);
		p.DelCndPanel.add(p.DelCnd_site_cd);
		p.DelCnd_site_cd.setNextBeans(p.DelCnd_site_nm);
		p.DelCnd_site_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.site_cd_META);
		p.DelCndPanel.add(p.DelCnd_site_nm);
		p.DelCnd_site_nm.setNextBeans(p.DelCnd_loc_cd);
		p.DelCnd_site_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.site_nm_META);
		p.DelCnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.DelCnd_loc_cd, true);
		p.DelCnd_loc_cd.setLinkBeans(p.DelCnd_loc_nm);
		p.DelCndPanel.add(p.DelCnd_loc_cd_Label);
		p.DelCndPanel.add(p.DelCnd_loc_cd);
		p.DelCnd_loc_cd.setNextBeans(p.DelCnd_loc_nm);
		p.DelCnd_loc_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.loc_cd_META);
		p.DelCndPanel.add(p.DelCnd_loc_nm);
		p.DelCnd_loc_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0220.DelCndR.loc_nm_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_disp_expns_grp);
		p.LPnlPanel.setLastBeans(p.LPnl_disp_expns_grp);
		p.LPnl_disp_expns_grp.setNextBeans(p.LPnl_disp_expns);
		p.LPnl_disp_expns_grp.setRow(p.getLPnlR(), mcframe.clientMGBB.MGBBP0220.LPnlR.disp_expns_grp_META);
		p.LPnlPanel.add(p.LPnl_disp_expns);
		p.LPnl_disp_expns.setRow(p.getLPnlR(), mcframe.clientMGBB.MGBBP0220.LPnlR.disp_expns_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBBP_StWipReg p) {
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
	protected static void jbInitRslt(MGBBP_StWipReg p) {
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
	protected static void jbInitBtn(MGBBP_StWipReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBBP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBBP0030);
		p.Btn_open_MGBBP0030.setNextBeans(p.Btn_open_MGBBP0040);
		p.Btn_open_MGBBP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBBP0040);
		p.Btn_open_MGBBP0040.setNextBeans(p.Btn_select_all);
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
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_bulk);
		p.Btn_del_bulk.setIcon("DELETE");
		p.Btn_del_bulk.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_bulk);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBBP_StWipReg p) {
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
		MGBBP_StWipReg_MC.mcInitScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitTop((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitFold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitTab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitTab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitTab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitCnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitDelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitLPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitCtrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitRslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitBtn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.mcInitEastBtn((MGBBP_StWipReg)this);

		// [UPD]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitUPD_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitUPD_EastBtn((MGBBP_StWipReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitSRCH__REF_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__REF_EastBtn((MGBBP_StWipReg)this);

		// [REF]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitREF_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitREF_EastBtn((MGBBP_StWipReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitSRCH__DEL_EastBtn((MGBBP_StWipReg)this);

		// [DEL]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitDEL_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL_EastBtn((MGBBP_StWipReg)this);

		// [DEL_BULK]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitDEL__BULK_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitDEL__BULK_EastBtn((MGBBP_StWipReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBBP_StWipReg_MC.statusInitFIX__U_ScreenOpe((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Top((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Fold((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Tab1((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Tab2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Tab3((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Cnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Cnd2((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_DelCnd((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_LPnl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Ctrl((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Rslt((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_Btn((MGBBP_StWipReg)this);
		MGBBP_StWipReg_MC.statusInitFIX__U_EastBtn((MGBBP_StWipReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBBP_StWipReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBBP_StWipReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBBP_StWipReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBBP_StWipReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBBP_StWipReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBBP_StWipReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_StWipReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_DELBULK.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_oper_act_no.setListListener(p);
		p.Cnd_oper_act_no.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_itm_grp_cd1.setListListener(p);
		p.Cnd_itm_grp_cd1.addAllListener(p);
		p.Cnd_itm_grp_nm1.setListListener(p);
		p.Cnd_itm_grp_nm1.addAllListener(p);
		p.Cnd_itm_grp_cd2.setListListener(p);
		p.Cnd_itm_grp_cd2.addAllListener(p);
		p.Cnd_itm_grp_nm2.setListListener(p);
		p.Cnd_itm_grp_nm2.addAllListener(p);
		p.Cnd_itm_grp_cd3.setListListener(p);
		p.Cnd_itm_grp_cd3.addAllListener(p);
		p.Cnd_itm_grp_nm3.setListListener(p);
		p.Cnd_itm_grp_nm3.addAllListener(p);
		p.Cnd_itm_grp_cd4.setListListener(p);
		p.Cnd_itm_grp_cd4.addAllListener(p);
		p.Cnd_itm_grp_nm4.setListListener(p);
		p.Cnd_itm_grp_nm4.addAllListener(p);
		p.Cnd_itm_grp_cd5.setListListener(p);
		p.Cnd_itm_grp_cd5.addAllListener(p);
		p.Cnd_itm_grp_nm5.setListListener(p);
		p.Cnd_itm_grp_nm5.addAllListener(p);
		p.Cnd_itm_grp_cd6.setListListener(p);
		p.Cnd_itm_grp_cd6.addAllListener(p);
		p.Cnd_itm_grp_nm6.setListListener(p);
		p.Cnd_itm_grp_nm6.addAllListener(p);
		p.Cnd_itm_grp_cd7.setListListener(p);
		p.Cnd_itm_grp_cd7.addAllListener(p);
		p.Cnd_itm_grp_nm7.setListListener(p);
		p.Cnd_itm_grp_nm7.addAllListener(p);
		p.Cnd_itm_grp_cd8.setListListener(p);
		p.Cnd_itm_grp_cd8.addAllListener(p);
		p.Cnd_itm_grp_nm8.setListListener(p);
		p.Cnd_itm_grp_nm8.addAllListener(p);
		p.Cnd_itm_grp_cd9.setListListener(p);
		p.Cnd_itm_grp_cd9.addAllListener(p);
		p.Cnd_itm_grp_nm9.setListListener(p);
		p.Cnd_itm_grp_nm9.addAllListener(p);
		p.Cnd_itm_grp_cd10.setListListener(p);
		p.Cnd_itm_grp_cd10.addAllListener(p);
		p.Cnd_itm_grp_nm10.setListListener(p);
		p.Cnd_itm_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBBP_StWipReg p) {
	}

	/**
	 *  [DelCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDelCnd(MGBBP_StWipReg p) {
		p.DelCnd_calc_grp_cd.setListListener(p);
		p.DelCnd_calc_grp_cd.addAllListener(p);
		p.DelCnd_calc_grp_nm.setListListener(p);
		p.DelCnd_calc_grp_nm.addAllListener(p);
		p.DelCnd_ym.setListListener(p);
		p.DelCnd_ym.addAllListener(p);
		p.DelCnd_wg_cd.setListListener(p);
		p.DelCnd_wg_cd.addAllListener(p);
		p.DelCnd_wg_nm.setListListener(p);
		p.DelCnd_wg_nm.addAllListener(p);
		p.DelCnd_site_cd.setListListener(p);
		p.DelCnd_site_cd.addAllListener(p);
		p.DelCnd_site_nm.setListListener(p);
		p.DelCnd_site_nm.addAllListener(p);
		p.DelCnd_loc_cd.setListListener(p);
		p.DelCnd_loc_cd.addAllListener(p);
		p.DelCnd_loc_nm.setListListener(p);
		p.DelCnd_loc_nm.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBBP_StWipReg p) {
		p.LPnl_disp_expns_grp.addAllListener(p);
		p.LPnl_disp_expns.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBBP_StWipReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_StWipReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_calc_grp_cd.addAllListener(p);
		p.columnRslt_calc_grp_cd.setListListener(p);
		p.columnRslt_calc_grp_nm.addAllListener(p);
		p.columnRslt_calc_grp_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_itm_jnl_cd.addAllListener(p);
		p.columnRslt_itm_jnl_cd.setListListener(p);
		p.columnRslt_itm_jnl_nm.addAllListener(p);
		p.columnRslt_itm_jnl_nm.setListListener(p);
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_mfg_act_no.addAllListener(p);
		p.columnRslt_mfg_act_no.setListListener(p);
		p.columnRslt_oper_act_no.addAllListener(p);
		p.columnRslt_oper_act_no.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_tgt_flg.addAllListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_wip_per.addAllListener(p);
		p.columnRslt_wip_per.setListListener(p);
		p.columnRslt_ttl.addAllListener(p);
		p.columnRslt_ttl.setListListener(p);
		p.columnRslt_ttl_wip_amt.addAllListener(p);
		p.columnRslt_ttl_wip_amt.setListListener(p);
		p.columnRslt_ttl_inpt_amt.addAllListener(p);
		p.columnRslt_ttl_inpt_amt.setListListener(p);
		p.columnRslt_col_000.addAllListener(p);
		p.columnRslt_col_000.setListListener(p);
		p.columnRslt_col_001.addAllListener(p);
		p.columnRslt_col_001.setListListener(p);
		p.columnRslt_col_002.addAllListener(p);
		p.columnRslt_col_002.setListListener(p);
		p.columnRslt_col_003.addAllListener(p);
		p.columnRslt_col_003.setListListener(p);
		p.columnRslt_col_004.addAllListener(p);
		p.columnRslt_col_004.setListListener(p);
		p.columnRslt_col_005.addAllListener(p);
		p.columnRslt_col_005.setListListener(p);
		p.columnRslt_col_006.addAllListener(p);
		p.columnRslt_col_006.setListListener(p);
		p.columnRslt_col_007.addAllListener(p);
		p.columnRslt_col_007.setListListener(p);
		p.columnRslt_col_008.addAllListener(p);
		p.columnRslt_col_008.setListListener(p);
		p.columnRslt_col_009.addAllListener(p);
		p.columnRslt_col_009.setListListener(p);
		p.columnRslt_col_010.addAllListener(p);
		p.columnRslt_col_010.setListListener(p);
		p.columnRslt_col_011.addAllListener(p);
		p.columnRslt_col_011.setListListener(p);
		p.columnRslt_col_012.addAllListener(p);
		p.columnRslt_col_012.setListListener(p);
		p.columnRslt_col_013.addAllListener(p);
		p.columnRslt_col_013.setListListener(p);
		p.columnRslt_col_014.addAllListener(p);
		p.columnRslt_col_014.setListListener(p);
		p.columnRslt_col_015.addAllListener(p);
		p.columnRslt_col_015.setListListener(p);
		p.columnRslt_col_016.addAllListener(p);
		p.columnRslt_col_016.setListListener(p);
		p.columnRslt_col_017.addAllListener(p);
		p.columnRslt_col_017.setListListener(p);
		p.columnRslt_col_018.addAllListener(p);
		p.columnRslt_col_018.setListListener(p);
		p.columnRslt_col_019.addAllListener(p);
		p.columnRslt_col_019.setListListener(p);
		p.columnRslt_col_020.addAllListener(p);
		p.columnRslt_col_020.setListListener(p);
		p.columnRslt_col_021.addAllListener(p);
		p.columnRslt_col_021.setListListener(p);
		p.columnRslt_col_022.addAllListener(p);
		p.columnRslt_col_022.setListListener(p);
		p.columnRslt_col_023.addAllListener(p);
		p.columnRslt_col_023.setListListener(p);
		p.columnRslt_col_024.addAllListener(p);
		p.columnRslt_col_024.setListListener(p);
		p.columnRslt_col_025.addAllListener(p);
		p.columnRslt_col_025.setListListener(p);
		p.columnRslt_col_026.addAllListener(p);
		p.columnRslt_col_026.setListListener(p);
		p.columnRslt_col_027.addAllListener(p);
		p.columnRslt_col_027.setListListener(p);
		p.columnRslt_col_028.addAllListener(p);
		p.columnRslt_col_028.setListListener(p);
		p.columnRslt_col_029.addAllListener(p);
		p.columnRslt_col_029.setListListener(p);
		p.columnRslt_col_030.addAllListener(p);
		p.columnRslt_col_030.setListListener(p);
		p.columnRslt_col_031.addAllListener(p);
		p.columnRslt_col_031.setListListener(p);
		p.columnRslt_col_032.addAllListener(p);
		p.columnRslt_col_032.setListListener(p);
		p.columnRslt_col_033.addAllListener(p);
		p.columnRslt_col_033.setListListener(p);
		p.columnRslt_col_034.addAllListener(p);
		p.columnRslt_col_034.setListListener(p);
		p.columnRslt_col_035.addAllListener(p);
		p.columnRslt_col_035.setListListener(p);
		p.columnRslt_col_036.addAllListener(p);
		p.columnRslt_col_036.setListListener(p);
		p.columnRslt_col_037.addAllListener(p);
		p.columnRslt_col_037.setListListener(p);
		p.columnRslt_col_038.addAllListener(p);
		p.columnRslt_col_038.setListListener(p);
		p.columnRslt_col_039.addAllListener(p);
		p.columnRslt_col_039.setListListener(p);
		p.columnRslt_col_040.addAllListener(p);
		p.columnRslt_col_040.setListListener(p);
		p.columnRslt_col_041.addAllListener(p);
		p.columnRslt_col_041.setListListener(p);
		p.columnRslt_col_042.addAllListener(p);
		p.columnRslt_col_042.setListListener(p);
		p.columnRslt_col_043.addAllListener(p);
		p.columnRslt_col_043.setListListener(p);
		p.columnRslt_col_044.addAllListener(p);
		p.columnRslt_col_044.setListListener(p);
		p.columnRslt_col_045.addAllListener(p);
		p.columnRslt_col_045.setListListener(p);
		p.columnRslt_col_046.addAllListener(p);
		p.columnRslt_col_046.setListListener(p);
		p.columnRslt_col_047.addAllListener(p);
		p.columnRslt_col_047.setListListener(p);
		p.columnRslt_col_048.addAllListener(p);
		p.columnRslt_col_048.setListListener(p);
		p.columnRslt_col_049.addAllListener(p);
		p.columnRslt_col_049.setListListener(p);
		p.columnRslt_col_050.addAllListener(p);
		p.columnRslt_col_050.setListListener(p);
		p.columnRslt_col_051.addAllListener(p);
		p.columnRslt_col_051.setListListener(p);
		p.columnRslt_col_052.addAllListener(p);
		p.columnRslt_col_052.setListListener(p);
		p.columnRslt_col_053.addAllListener(p);
		p.columnRslt_col_053.setListListener(p);
		p.columnRslt_col_054.addAllListener(p);
		p.columnRslt_col_054.setListListener(p);
		p.columnRslt_col_055.addAllListener(p);
		p.columnRslt_col_055.setListListener(p);
		p.columnRslt_col_056.addAllListener(p);
		p.columnRslt_col_056.setListListener(p);
		p.columnRslt_col_057.addAllListener(p);
		p.columnRslt_col_057.setListListener(p);
		p.columnRslt_col_058.addAllListener(p);
		p.columnRslt_col_058.setListListener(p);
		p.columnRslt_col_059.addAllListener(p);
		p.columnRslt_col_059.setListListener(p);
		p.columnRslt_col_060.addAllListener(p);
		p.columnRslt_col_060.setListListener(p);
		p.columnRslt_col_061.addAllListener(p);
		p.columnRslt_col_061.setListListener(p);
		p.columnRslt_col_062.addAllListener(p);
		p.columnRslt_col_062.setListListener(p);
		p.columnRslt_col_063.addAllListener(p);
		p.columnRslt_col_063.setListListener(p);
		p.columnRslt_col_064.addAllListener(p);
		p.columnRslt_col_064.setListListener(p);
		p.columnRslt_col_065.addAllListener(p);
		p.columnRslt_col_065.setListListener(p);
		p.columnRslt_col_066.addAllListener(p);
		p.columnRslt_col_066.setListListener(p);
		p.columnRslt_col_067.addAllListener(p);
		p.columnRslt_col_067.setListListener(p);
		p.columnRslt_col_068.addAllListener(p);
		p.columnRslt_col_068.setListListener(p);
		p.columnRslt_col_069.addAllListener(p);
		p.columnRslt_col_069.setListListener(p);
		p.columnRslt_col_070.addAllListener(p);
		p.columnRslt_col_070.setListListener(p);
		p.columnRslt_col_071.addAllListener(p);
		p.columnRslt_col_071.setListListener(p);
		p.columnRslt_col_072.addAllListener(p);
		p.columnRslt_col_072.setListListener(p);
		p.columnRslt_col_073.addAllListener(p);
		p.columnRslt_col_073.setListListener(p);
		p.columnRslt_col_074.addAllListener(p);
		p.columnRslt_col_074.setListListener(p);
		p.columnRslt_col_075.addAllListener(p);
		p.columnRslt_col_075.setListListener(p);
		p.columnRslt_col_076.addAllListener(p);
		p.columnRslt_col_076.setListListener(p);
		p.columnRslt_col_077.addAllListener(p);
		p.columnRslt_col_077.setListListener(p);
		p.columnRslt_col_078.addAllListener(p);
		p.columnRslt_col_078.setListListener(p);
		p.columnRslt_col_079.addAllListener(p);
		p.columnRslt_col_079.setListListener(p);
		p.columnRslt_col_080.addAllListener(p);
		p.columnRslt_col_080.setListListener(p);
		p.columnRslt_col_081.addAllListener(p);
		p.columnRslt_col_081.setListListener(p);
		p.columnRslt_col_082.addAllListener(p);
		p.columnRslt_col_082.setListListener(p);
		p.columnRslt_col_083.addAllListener(p);
		p.columnRslt_col_083.setListListener(p);
		p.columnRslt_col_084.addAllListener(p);
		p.columnRslt_col_084.setListListener(p);
		p.columnRslt_col_085.addAllListener(p);
		p.columnRslt_col_085.setListListener(p);
		p.columnRslt_col_086.addAllListener(p);
		p.columnRslt_col_086.setListListener(p);
		p.columnRslt_col_087.addAllListener(p);
		p.columnRslt_col_087.setListListener(p);
		p.columnRslt_col_088.addAllListener(p);
		p.columnRslt_col_088.setListListener(p);
		p.columnRslt_col_089.addAllListener(p);
		p.columnRslt_col_089.setListListener(p);
		p.columnRslt_col_090.addAllListener(p);
		p.columnRslt_col_090.setListListener(p);
		p.columnRslt_col_091.addAllListener(p);
		p.columnRslt_col_091.setListListener(p);
		p.columnRslt_col_092.addAllListener(p);
		p.columnRslt_col_092.setListListener(p);
		p.columnRslt_col_093.addAllListener(p);
		p.columnRslt_col_093.setListListener(p);
		p.columnRslt_col_094.addAllListener(p);
		p.columnRslt_col_094.setListListener(p);
		p.columnRslt_col_095.addAllListener(p);
		p.columnRslt_col_095.setListListener(p);
		p.columnRslt_col_096.addAllListener(p);
		p.columnRslt_col_096.setListListener(p);
		p.columnRslt_col_097.addAllListener(p);
		p.columnRslt_col_097.setListListener(p);
		p.columnRslt_col_098.addAllListener(p);
		p.columnRslt_col_098.setListListener(p);
		p.columnRslt_col_099.addAllListener(p);
		p.columnRslt_col_099.setListListener(p);
		p.columnRslt_col_100.addAllListener(p);
		p.columnRslt_col_100.setListListener(p);
		p.columnRslt_col_101.addAllListener(p);
		p.columnRslt_col_101.setListListener(p);
		p.columnRslt_col_102.addAllListener(p);
		p.columnRslt_col_102.setListListener(p);
		p.columnRslt_col_103.addAllListener(p);
		p.columnRslt_col_103.setListListener(p);
		p.columnRslt_col_104.addAllListener(p);
		p.columnRslt_col_104.setListListener(p);
		p.columnRslt_col_105.addAllListener(p);
		p.columnRslt_col_105.setListListener(p);
		p.columnRslt_col_106.addAllListener(p);
		p.columnRslt_col_106.setListListener(p);
		p.columnRslt_col_107.addAllListener(p);
		p.columnRslt_col_107.setListListener(p);
		p.columnRslt_col_108.addAllListener(p);
		p.columnRslt_col_108.setListListener(p);
		p.columnRslt_col_109.addAllListener(p);
		p.columnRslt_col_109.setListListener(p);
		p.columnRslt_col_110.addAllListener(p);
		p.columnRslt_col_110.setListListener(p);
		p.columnRslt_col_111.addAllListener(p);
		p.columnRslt_col_111.setListListener(p);
		p.columnRslt_col_112.addAllListener(p);
		p.columnRslt_col_112.setListListener(p);
		p.columnRslt_col_113.addAllListener(p);
		p.columnRslt_col_113.setListListener(p);
		p.columnRslt_col_114.addAllListener(p);
		p.columnRslt_col_114.setListListener(p);
		p.columnRslt_col_115.addAllListener(p);
		p.columnRslt_col_115.setListListener(p);
		p.columnRslt_col_116.addAllListener(p);
		p.columnRslt_col_116.setListListener(p);
		p.columnRslt_col_117.addAllListener(p);
		p.columnRslt_col_117.setListListener(p);
		p.columnRslt_col_118.addAllListener(p);
		p.columnRslt_col_118.setListListener(p);
		p.columnRslt_col_119.addAllListener(p);
		p.columnRslt_col_119.setListListener(p);
		p.columnRslt_col_120.addAllListener(p);
		p.columnRslt_col_120.setListListener(p);
		p.columnRslt_col_121.addAllListener(p);
		p.columnRslt_col_121.setListListener(p);
		p.columnRslt_col_122.addAllListener(p);
		p.columnRslt_col_122.setListListener(p);
		p.columnRslt_col_123.addAllListener(p);
		p.columnRslt_col_123.setListListener(p);
		p.columnRslt_col_124.addAllListener(p);
		p.columnRslt_col_124.setListListener(p);
		p.columnRslt_col_125.addAllListener(p);
		p.columnRslt_col_125.setListListener(p);
		p.columnRslt_col_126.addAllListener(p);
		p.columnRslt_col_126.setListListener(p);
		p.columnRslt_col_127.addAllListener(p);
		p.columnRslt_col_127.setListListener(p);
		p.columnRslt_col_128.addAllListener(p);
		p.columnRslt_col_128.setListListener(p);
		p.columnRslt_col_129.addAllListener(p);
		p.columnRslt_col_129.setListListener(p);
		p.columnRslt_col_130.addAllListener(p);
		p.columnRslt_col_130.setListListener(p);
		p.columnRslt_col_131.addAllListener(p);
		p.columnRslt_col_131.setListListener(p);
		p.columnRslt_col_132.addAllListener(p);
		p.columnRslt_col_132.setListListener(p);
		p.columnRslt_col_133.addAllListener(p);
		p.columnRslt_col_133.setListListener(p);
		p.columnRslt_col_134.addAllListener(p);
		p.columnRslt_col_134.setListListener(p);
		p.columnRslt_col_135.addAllListener(p);
		p.columnRslt_col_135.setListListener(p);
		p.columnRslt_col_136.addAllListener(p);
		p.columnRslt_col_136.setListListener(p);
		p.columnRslt_col_137.addAllListener(p);
		p.columnRslt_col_137.setListListener(p);
		p.columnRslt_col_138.addAllListener(p);
		p.columnRslt_col_138.setListListener(p);
		p.columnRslt_col_139.addAllListener(p);
		p.columnRslt_col_139.setListListener(p);
		p.columnRslt_col_140.addAllListener(p);
		p.columnRslt_col_140.setListListener(p);
		p.columnRslt_col_141.addAllListener(p);
		p.columnRslt_col_141.setListListener(p);
		p.columnRslt_col_142.addAllListener(p);
		p.columnRslt_col_142.setListListener(p);
		p.columnRslt_col_143.addAllListener(p);
		p.columnRslt_col_143.setListListener(p);
		p.columnRslt_col_144.addAllListener(p);
		p.columnRslt_col_144.setListListener(p);
		p.columnRslt_col_145.addAllListener(p);
		p.columnRslt_col_145.setListListener(p);
		p.columnRslt_col_146.addAllListener(p);
		p.columnRslt_col_146.setListListener(p);
		p.columnRslt_col_147.addAllListener(p);
		p.columnRslt_col_147.setListListener(p);
		p.columnRslt_col_148.addAllListener(p);
		p.columnRslt_col_148.setListListener(p);
		p.columnRslt_col_149.addAllListener(p);
		p.columnRslt_col_149.setListListener(p);
		p.columnRslt_col_150.addAllListener(p);
		p.columnRslt_col_150.setListListener(p);
		p.columnRslt_col_151.addAllListener(p);
		p.columnRslt_col_151.setListListener(p);
		p.columnRslt_col_152.addAllListener(p);
		p.columnRslt_col_152.setListListener(p);
		p.columnRslt_col_153.addAllListener(p);
		p.columnRslt_col_153.setListListener(p);
		p.columnRslt_col_154.addAllListener(p);
		p.columnRslt_col_154.setListListener(p);
		p.columnRslt_col_155.addAllListener(p);
		p.columnRslt_col_155.setListListener(p);
		p.columnRslt_col_156.addAllListener(p);
		p.columnRslt_col_156.setListListener(p);
		p.columnRslt_col_157.addAllListener(p);
		p.columnRslt_col_157.setListListener(p);
		p.columnRslt_col_158.addAllListener(p);
		p.columnRslt_col_158.setListListener(p);
		p.columnRslt_col_159.addAllListener(p);
		p.columnRslt_col_159.setListListener(p);
		p.columnRslt_col_160.addAllListener(p);
		p.columnRslt_col_160.setListListener(p);
		p.columnRslt_col_161.addAllListener(p);
		p.columnRslt_col_161.setListListener(p);
		p.columnRslt_col_162.addAllListener(p);
		p.columnRslt_col_162.setListListener(p);
		p.columnRslt_col_163.addAllListener(p);
		p.columnRslt_col_163.setListListener(p);
		p.columnRslt_col_164.addAllListener(p);
		p.columnRslt_col_164.setListListener(p);
		p.columnRslt_col_165.addAllListener(p);
		p.columnRslt_col_165.setListListener(p);
		p.columnRslt_col_166.addAllListener(p);
		p.columnRslt_col_166.setListListener(p);
		p.columnRslt_col_167.addAllListener(p);
		p.columnRslt_col_167.setListListener(p);
		p.columnRslt_col_168.addAllListener(p);
		p.columnRslt_col_168.setListListener(p);
		p.columnRslt_col_169.addAllListener(p);
		p.columnRslt_col_169.setListListener(p);
		p.columnRslt_col_170.addAllListener(p);
		p.columnRslt_col_170.setListListener(p);
		p.columnRslt_col_171.addAllListener(p);
		p.columnRslt_col_171.setListListener(p);
		p.columnRslt_col_172.addAllListener(p);
		p.columnRslt_col_172.setListListener(p);
		p.columnRslt_col_173.addAllListener(p);
		p.columnRslt_col_173.setListListener(p);
		p.columnRslt_col_174.addAllListener(p);
		p.columnRslt_col_174.setListListener(p);
		p.columnRslt_col_175.addAllListener(p);
		p.columnRslt_col_175.setListListener(p);
		p.columnRslt_col_176.addAllListener(p);
		p.columnRslt_col_176.setListListener(p);
		p.columnRslt_col_177.addAllListener(p);
		p.columnRslt_col_177.setListListener(p);
		p.columnRslt_col_178.addAllListener(p);
		p.columnRslt_col_178.setListListener(p);
		p.columnRslt_col_179.addAllListener(p);
		p.columnRslt_col_179.setListListener(p);
		p.columnRslt_col_180.addAllListener(p);
		p.columnRslt_col_180.setListListener(p);
		p.columnRslt_col_181.addAllListener(p);
		p.columnRslt_col_181.setListListener(p);
		p.columnRslt_col_182.addAllListener(p);
		p.columnRslt_col_182.setListListener(p);
		p.columnRslt_col_183.addAllListener(p);
		p.columnRslt_col_183.setListListener(p);
		p.columnRslt_col_184.addAllListener(p);
		p.columnRslt_col_184.setListListener(p);
		p.columnRslt_col_185.addAllListener(p);
		p.columnRslt_col_185.setListListener(p);
		p.columnRslt_col_186.addAllListener(p);
		p.columnRslt_col_186.setListListener(p);
		p.columnRslt_col_187.addAllListener(p);
		p.columnRslt_col_187.setListListener(p);
		p.columnRslt_col_188.addAllListener(p);
		p.columnRslt_col_188.setListListener(p);
		p.columnRslt_col_189.addAllListener(p);
		p.columnRslt_col_189.setListListener(p);
		p.columnRslt_col_190.addAllListener(p);
		p.columnRslt_col_190.setListListener(p);
		p.columnRslt_col_191.addAllListener(p);
		p.columnRslt_col_191.setListListener(p);
		p.columnRslt_col_192.addAllListener(p);
		p.columnRslt_col_192.setListListener(p);
		p.columnRslt_col_193.addAllListener(p);
		p.columnRslt_col_193.setListListener(p);
		p.columnRslt_col_194.addAllListener(p);
		p.columnRslt_col_194.setListListener(p);
		p.columnRslt_col_195.addAllListener(p);
		p.columnRslt_col_195.setListListener(p);
		p.columnRslt_col_196.addAllListener(p);
		p.columnRslt_col_196.setListListener(p);
		p.columnRslt_col_197.addAllListener(p);
		p.columnRslt_col_197.setListListener(p);
		p.columnRslt_col_198.addAllListener(p);
		p.columnRslt_col_198.setListListener(p);
		p.columnRslt_col_199.addAllListener(p);
		p.columnRslt_col_199.setListListener(p);
		p.columnRslt_col_200.addAllListener(p);
		p.columnRslt_col_200.setListListener(p);
		p.columnRslt_col_201.addAllListener(p);
		p.columnRslt_col_201.setListListener(p);
		p.columnRslt_col_202.addAllListener(p);
		p.columnRslt_col_202.setListListener(p);
		p.columnRslt_col_203.addAllListener(p);
		p.columnRslt_col_203.setListListener(p);
		p.columnRslt_col_204.addAllListener(p);
		p.columnRslt_col_204.setListListener(p);
		p.columnRslt_col_205.addAllListener(p);
		p.columnRslt_col_205.setListListener(p);
		p.columnRslt_col_206.addAllListener(p);
		p.columnRslt_col_206.setListListener(p);
		p.columnRslt_col_207.addAllListener(p);
		p.columnRslt_col_207.setListListener(p);
		p.columnRslt_col_208.addAllListener(p);
		p.columnRslt_col_208.setListListener(p);
		p.columnRslt_col_209.addAllListener(p);
		p.columnRslt_col_209.setListListener(p);
		p.columnRslt_col_210.addAllListener(p);
		p.columnRslt_col_210.setListListener(p);
		p.columnRslt_col_211.addAllListener(p);
		p.columnRslt_col_211.setListListener(p);
		p.columnRslt_col_212.addAllListener(p);
		p.columnRslt_col_212.setListListener(p);
		p.columnRslt_col_213.addAllListener(p);
		p.columnRslt_col_213.setListListener(p);
		p.columnRslt_col_214.addAllListener(p);
		p.columnRslt_col_214.setListListener(p);
		p.columnRslt_col_215.addAllListener(p);
		p.columnRslt_col_215.setListListener(p);
		p.columnRslt_col_216.addAllListener(p);
		p.columnRslt_col_216.setListListener(p);
		p.columnRslt_col_217.addAllListener(p);
		p.columnRslt_col_217.setListListener(p);
		p.columnRslt_col_218.addAllListener(p);
		p.columnRslt_col_218.setListListener(p);
		p.columnRslt_col_219.addAllListener(p);
		p.columnRslt_col_219.setListListener(p);
		p.columnRslt_col_220.addAllListener(p);
		p.columnRslt_col_220.setListListener(p);
		p.columnRslt_col_221.addAllListener(p);
		p.columnRslt_col_221.setListListener(p);
		p.columnRslt_col_222.addAllListener(p);
		p.columnRslt_col_222.setListListener(p);
		p.columnRslt_col_223.addAllListener(p);
		p.columnRslt_col_223.setListListener(p);
		p.columnRslt_col_224.addAllListener(p);
		p.columnRslt_col_224.setListListener(p);
		p.columnRslt_col_225.addAllListener(p);
		p.columnRslt_col_225.setListListener(p);
		p.columnRslt_col_226.addAllListener(p);
		p.columnRslt_col_226.setListListener(p);
		p.columnRslt_col_227.addAllListener(p);
		p.columnRslt_col_227.setListListener(p);
		p.columnRslt_col_228.addAllListener(p);
		p.columnRslt_col_228.setListListener(p);
		p.columnRslt_col_229.addAllListener(p);
		p.columnRslt_col_229.setListListener(p);
		p.columnRslt_col_230.addAllListener(p);
		p.columnRslt_col_230.setListListener(p);
		p.columnRslt_col_231.addAllListener(p);
		p.columnRslt_col_231.setListListener(p);
		p.columnRslt_col_232.addAllListener(p);
		p.columnRslt_col_232.setListListener(p);
		p.columnRslt_col_233.addAllListener(p);
		p.columnRslt_col_233.setListListener(p);
		p.columnRslt_col_234.addAllListener(p);
		p.columnRslt_col_234.setListListener(p);
		p.columnRslt_col_235.addAllListener(p);
		p.columnRslt_col_235.setListListener(p);
		p.columnRslt_col_236.addAllListener(p);
		p.columnRslt_col_236.setListListener(p);
		p.columnRslt_col_237.addAllListener(p);
		p.columnRslt_col_237.setListListener(p);
		p.columnRslt_col_238.addAllListener(p);
		p.columnRslt_col_238.setListListener(p);
		p.columnRslt_col_239.addAllListener(p);
		p.columnRslt_col_239.setListListener(p);
		p.columnRslt_col_240.addAllListener(p);
		p.columnRslt_col_240.setListListener(p);
		p.columnRslt_col_241.addAllListener(p);
		p.columnRslt_col_241.setListListener(p);
		p.columnRslt_col_242.addAllListener(p);
		p.columnRslt_col_242.setListListener(p);
		p.columnRslt_col_243.addAllListener(p);
		p.columnRslt_col_243.setListListener(p);
		p.columnRslt_col_244.addAllListener(p);
		p.columnRslt_col_244.setListListener(p);
		p.columnRslt_col_245.addAllListener(p);
		p.columnRslt_col_245.setListListener(p);
		p.columnRslt_col_246.addAllListener(p);
		p.columnRslt_col_246.setListListener(p);
		p.columnRslt_col_247.addAllListener(p);
		p.columnRslt_col_247.setListListener(p);
		p.columnRslt_col_248.addAllListener(p);
		p.columnRslt_col_248.setListListener(p);
		p.columnRslt_col_249.addAllListener(p);
		p.columnRslt_col_249.setListListener(p);
		p.columnRslt_col_250.addAllListener(p);
		p.columnRslt_col_250.setListListener(p);
		p.columnRslt_col_251.addAllListener(p);
		p.columnRslt_col_251.setListListener(p);
		p.columnRslt_col_252.addAllListener(p);
		p.columnRslt_col_252.setListListener(p);
		p.columnRslt_col_253.addAllListener(p);
		p.columnRslt_col_253.setListListener(p);
		p.columnRslt_col_254.addAllListener(p);
		p.columnRslt_col_254.setListListener(p);
		p.columnRslt_col_255.addAllListener(p);
		p.columnRslt_col_255.setListListener(p);
		p.columnRslt_col_256.addAllListener(p);
		p.columnRslt_col_256.setListListener(p);
		p.columnRslt_col_257.addAllListener(p);
		p.columnRslt_col_257.setListListener(p);
		p.columnRslt_col_258.addAllListener(p);
		p.columnRslt_col_258.setListListener(p);
		p.columnRslt_col_259.addAllListener(p);
		p.columnRslt_col_259.setListListener(p);
		p.columnRslt_col_260.addAllListener(p);
		p.columnRslt_col_260.setListListener(p);
		p.columnRslt_col_261.addAllListener(p);
		p.columnRslt_col_261.setListListener(p);
		p.columnRslt_col_262.addAllListener(p);
		p.columnRslt_col_262.setListListener(p);
		p.columnRslt_col_263.addAllListener(p);
		p.columnRslt_col_263.setListListener(p);
		p.columnRslt_col_264.addAllListener(p);
		p.columnRslt_col_264.setListListener(p);
		p.columnRslt_col_265.addAllListener(p);
		p.columnRslt_col_265.setListListener(p);
		p.columnRslt_col_266.addAllListener(p);
		p.columnRslt_col_266.setListListener(p);
		p.columnRslt_col_267.addAllListener(p);
		p.columnRslt_col_267.setListListener(p);
		p.columnRslt_col_268.addAllListener(p);
		p.columnRslt_col_268.setListListener(p);
		p.columnRslt_col_269.addAllListener(p);
		p.columnRslt_col_269.setListListener(p);
		p.columnRslt_col_270.addAllListener(p);
		p.columnRslt_col_270.setListListener(p);
		p.columnRslt_col_271.addAllListener(p);
		p.columnRslt_col_271.setListListener(p);
		p.columnRslt_col_272.addAllListener(p);
		p.columnRslt_col_272.setListListener(p);
		p.columnRslt_col_273.addAllListener(p);
		p.columnRslt_col_273.setListListener(p);
		p.columnRslt_col_274.addAllListener(p);
		p.columnRslt_col_274.setListListener(p);
		p.columnRslt_col_275.addAllListener(p);
		p.columnRslt_col_275.setListListener(p);
		p.columnRslt_col_276.addAllListener(p);
		p.columnRslt_col_276.setListListener(p);
		p.columnRslt_col_277.addAllListener(p);
		p.columnRslt_col_277.setListListener(p);
		p.columnRslt_col_278.addAllListener(p);
		p.columnRslt_col_278.setListListener(p);
		p.columnRslt_col_279.addAllListener(p);
		p.columnRslt_col_279.setListListener(p);
		p.columnRslt_col_280.addAllListener(p);
		p.columnRslt_col_280.setListListener(p);
		p.columnRslt_col_281.addAllListener(p);
		p.columnRslt_col_281.setListListener(p);
		p.columnRslt_col_282.addAllListener(p);
		p.columnRslt_col_282.setListListener(p);
		p.columnRslt_col_283.addAllListener(p);
		p.columnRslt_col_283.setListListener(p);
		p.columnRslt_col_284.addAllListener(p);
		p.columnRslt_col_284.setListListener(p);
		p.columnRslt_col_285.addAllListener(p);
		p.columnRslt_col_285.setListListener(p);
		p.columnRslt_col_286.addAllListener(p);
		p.columnRslt_col_286.setListListener(p);
		p.columnRslt_col_287.addAllListener(p);
		p.columnRslt_col_287.setListListener(p);
		p.columnRslt_col_288.addAllListener(p);
		p.columnRslt_col_288.setListListener(p);
		p.columnRslt_col_289.addAllListener(p);
		p.columnRslt_col_289.setListListener(p);
		p.columnRslt_col_290.addAllListener(p);
		p.columnRslt_col_290.setListListener(p);
		p.columnRslt_col_291.addAllListener(p);
		p.columnRslt_col_291.setListListener(p);
		p.columnRslt_col_292.addAllListener(p);
		p.columnRslt_col_292.setListListener(p);
		p.columnRslt_col_293.addAllListener(p);
		p.columnRslt_col_293.setListListener(p);
		p.columnRslt_col_294.addAllListener(p);
		p.columnRslt_col_294.setListListener(p);
		p.columnRslt_col_295.addAllListener(p);
		p.columnRslt_col_295.setListListener(p);
		p.columnRslt_col_296.addAllListener(p);
		p.columnRslt_col_296.setListListener(p);
		p.columnRslt_col_297.addAllListener(p);
		p.columnRslt_col_297.setListListener(p);
		p.columnRslt_col_298.addAllListener(p);
		p.columnRslt_col_298.setListListener(p);
		p.columnRslt_col_299.addAllListener(p);
		p.columnRslt_col_299.setListListener(p);
		p.columnRslt_st_wip_key.addAllListener(p);
		p.columnRslt_st_wip_key.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_StWipReg p) {
		p.Btn_open_MGBBP0030.addAllListener(p);
		p.Btn_open_MGBBP0030.setAPMethodName("doBtn_open_MGBBP0030");
		p.Btn_open_MGBBP0040.addAllListener(p);
		p.Btn_open_MGBBP0040.setAPMethodName("doBtn_open_MGBBP0040");
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
		p.Btn_del_bulk.addAllListener(p);
		p.Btn_del_bulk.setAPMethodName("doBtn_del_bulk");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBBP_StWipReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [UPD]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, UPD, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_mfg_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_oper_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ttl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_002.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_003.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_005.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_006.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_008.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_009.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_011.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_012.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_014.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_015.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_017.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_018.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_020.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_021.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_023.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_024.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_026.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_027.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_029.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_030.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_032.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_033.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_035.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_036.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_038.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_039.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_041.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_042.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_044.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_045.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_047.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_048.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_050.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_051.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_053.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_054.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_056.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_057.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_059.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_060.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_062.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_063.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_065.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_066.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_068.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_069.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_071.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_072.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_074.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_075.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_077.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_078.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_080.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_081.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_083.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_084.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_086.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_087.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_089.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_090.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_092.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_093.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_095.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_096.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_098.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_099.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_101.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_102.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_104.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_105.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_107.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_108.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_110.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_111.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_113.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_114.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_116.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_117.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_119.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_120.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_122.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_123.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_125.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_126.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_128.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_129.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_131.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_132.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_134.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_135.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_137.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_138.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_140.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_141.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_143.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_144.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_146.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_147.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_149.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_150.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_152.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_153.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_155.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_156.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_158.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_159.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_161.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_162.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_164.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_165.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_167.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_168.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_170.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_171.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_173.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_174.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_176.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_177.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_179.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_180.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_182.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_183.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_185.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_186.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_188.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_189.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_191.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_192.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_194.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_195.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_197.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_198.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_200.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_201.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_203.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_204.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_206.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_207.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_209.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_210.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_212.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_213.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_215.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_216.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_218.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_219.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_221.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_222.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_224.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_225.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_227.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_228.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_230.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_231.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_233.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_234.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_236.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_237.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_239.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_240.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_242.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_243.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_245.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_246.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_248.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_249.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_251.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_252.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_254.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_255.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_257.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_258.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_260.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_261.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_263.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_264.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_266.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_267.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_269.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_270.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_272.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_273.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_275.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_276.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_278.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_279.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_281.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_282.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_284.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_285.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_287.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_288.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_290.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_291.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_293.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_294.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_296.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_297.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_col_299.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_st_wip_key.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0040.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_REF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0040.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_DEL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0040.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, DEL, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0040.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_bulk.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Top(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL_BULK, MCMode.ENABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_calc_grp_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_wg_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.DelCnd_site_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.DelCnd_loc_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_BULK]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, DEL_BULK, MCMode.REQUIRED);

	}

	/**
	 * [DEL_BULK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL_BULK, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL_BULK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0040.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_del_bulk.putMode(p, DEL_BULK, MCMode.ENABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_EastBtn(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBBP_StWipReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MGBBP_StWipReg p){

	}

	/**
	 * [FIX_U]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DelCnd(MGBBP_StWipReg p){
		p.DelCnd_calc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LPnl(MGBBP_StWipReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_U, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBBP_StWipReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBBP_StWipReg p){
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wip_per.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ttl_wip_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ttl_inpt_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_100.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_101.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_102.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_103.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_104.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_105.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_106.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_107.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_108.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_109.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_110.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_111.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_112.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_113.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_114.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_115.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_116.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_117.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_118.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_119.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_120.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_121.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_122.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_123.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_124.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_125.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_126.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_127.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_128.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_129.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_130.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_131.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_132.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_133.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_134.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_135.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_136.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_137.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_138.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_139.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_140.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_141.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_142.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_143.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_144.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_145.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_146.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_147.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_148.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_149.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_150.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_151.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_152.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_153.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_154.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_155.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_156.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_157.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_158.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_159.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_160.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_161.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_162.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_163.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_164.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_165.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_166.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_167.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_168.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_169.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_170.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_171.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_172.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_173.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_174.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_175.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_176.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_177.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_178.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_179.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_180.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_181.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_182.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_183.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_184.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_185.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_186.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_187.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_188.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_189.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_190.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_191.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_192.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_193.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_194.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_195.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_196.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_197.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_198.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_199.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_200.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_201.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_202.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_203.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_204.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_205.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_206.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_207.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_208.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_209.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_210.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_211.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_212.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_213.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_214.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_215.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_216.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_217.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_218.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_219.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_220.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_221.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_222.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_223.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_224.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_225.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_226.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_227.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_228.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_229.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_230.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_231.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_232.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_233.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_234.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_235.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_236.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_237.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_238.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_239.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_240.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_241.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_242.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_243.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_244.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_245.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_246.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_247.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_248.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_249.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_250.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_251.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_252.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_253.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_254.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_255.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_256.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_257.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_258.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_259.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_260.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_261.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_262.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_263.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_264.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_265.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_266.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_267.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_268.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_269.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_270.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_271.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_272.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_273.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_274.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_275.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_276.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_277.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_278.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_279.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_280.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_281.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_282.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_283.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_284.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_285.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_286.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_287.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_288.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_289.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_290.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_291.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_292.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_293.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_294.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_295.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_296.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_297.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_298.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_col_299.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_st_wip_key.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBBP_StWipReg p){
		p.Btn_open_MGBBP0030.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0040.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBBP_StWipReg p){

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
		MGBBP_StWipReg_MC.setTableConfigRslt((MGBBP_StWipReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_StWipReg p) {
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_check.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_calc_grp_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.calc_grp_cd_META);
		p.columnRslt_calc_grp_cd.addLinkBeans(p.columnRslt_calc_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_cd);
		p.columnRslt_calc_grp_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.calc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ym.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_typ_META);
		p.columnRslt_itm_typ.addLinkBeans(p.columnRslt_itm_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_typ_d_cd_META);
		p.columnRslt_itm_typ_d_cd.addLinkBeans(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_jnl_cd_META);
		p.columnRslt_itm_jnl_cd.addLinkBeans(p.columnRslt_itm_jnl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_mfg_act_no.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.mfg_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_no);
		p.columnRslt_oper_act_no.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.oper_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_no);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.addLinkBeans(p.columnRslt_loc_nm,p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_tgt_flg.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.oper_cd_META);
		p.columnRslt_oper_cd.addLinkBeans(p.columnRslt_oper_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_wip_per.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.wip_per_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wip_per);
		p.columnRslt_ttl.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.ttl_META);
		p.columnRslt_ttl.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl);
		p.columnRslt_ttl_wip_amt.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.ttl_wip_amt_META);
		p.columnRslt_ttl_wip_amt.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl_wip_amt);
		p.columnRslt_ttl_inpt_amt.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.ttl_inpt_amt_META);
		p.columnRslt_ttl_inpt_amt.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl_inpt_amt);
		p.columnRslt_col_000.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_000_META);
		p.columnRslt_col_000.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_000);
		p.columnRslt_col_001.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_001_META);
		p.columnRslt_col_001.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_001);
		p.columnRslt_col_002.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_002_META);
		p.columnRslt_col_002.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_002);
		p.columnRslt_col_003.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_003_META);
		p.columnRslt_col_003.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_003);
		p.columnRslt_col_004.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_004_META);
		p.columnRslt_col_004.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_004);
		p.columnRslt_col_005.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_005_META);
		p.columnRslt_col_005.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_005);
		p.columnRslt_col_006.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_006_META);
		p.columnRslt_col_006.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_006);
		p.columnRslt_col_007.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_007_META);
		p.columnRslt_col_007.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_007);
		p.columnRslt_col_008.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_008_META);
		p.columnRslt_col_008.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_008);
		p.columnRslt_col_009.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_009_META);
		p.columnRslt_col_009.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_009);
		p.columnRslt_col_010.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_010_META);
		p.columnRslt_col_010.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_010);
		p.columnRslt_col_011.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_011_META);
		p.columnRslt_col_011.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_011);
		p.columnRslt_col_012.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_012_META);
		p.columnRslt_col_012.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_012);
		p.columnRslt_col_013.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_013_META);
		p.columnRslt_col_013.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_013);
		p.columnRslt_col_014.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_014_META);
		p.columnRslt_col_014.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_014);
		p.columnRslt_col_015.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_015_META);
		p.columnRslt_col_015.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_015);
		p.columnRslt_col_016.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_016_META);
		p.columnRslt_col_016.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_016);
		p.columnRslt_col_017.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_017_META);
		p.columnRslt_col_017.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_017);
		p.columnRslt_col_018.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_018_META);
		p.columnRslt_col_018.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_018);
		p.columnRslt_col_019.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_019_META);
		p.columnRslt_col_019.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_019);
		p.columnRslt_col_020.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_020_META);
		p.columnRslt_col_020.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_020);
		p.columnRslt_col_021.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_021_META);
		p.columnRslt_col_021.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_021);
		p.columnRslt_col_022.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_022_META);
		p.columnRslt_col_022.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_022);
		p.columnRslt_col_023.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_023_META);
		p.columnRslt_col_023.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_023);
		p.columnRslt_col_024.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_024_META);
		p.columnRslt_col_024.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_024);
		p.columnRslt_col_025.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_025_META);
		p.columnRslt_col_025.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_025);
		p.columnRslt_col_026.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_026_META);
		p.columnRslt_col_026.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_026);
		p.columnRslt_col_027.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_027_META);
		p.columnRslt_col_027.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_027);
		p.columnRslt_col_028.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_028_META);
		p.columnRslt_col_028.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_028);
		p.columnRslt_col_029.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_029_META);
		p.columnRslt_col_029.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_029);
		p.columnRslt_col_030.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_030_META);
		p.columnRslt_col_030.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_030);
		p.columnRslt_col_031.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_031_META);
		p.columnRslt_col_031.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_031);
		p.columnRslt_col_032.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_032_META);
		p.columnRslt_col_032.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_032);
		p.columnRslt_col_033.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_033_META);
		p.columnRslt_col_033.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_033);
		p.columnRslt_col_034.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_034_META);
		p.columnRslt_col_034.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_034);
		p.columnRslt_col_035.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_035_META);
		p.columnRslt_col_035.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_035);
		p.columnRslt_col_036.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_036_META);
		p.columnRslt_col_036.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_036);
		p.columnRslt_col_037.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_037_META);
		p.columnRslt_col_037.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_037);
		p.columnRslt_col_038.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_038_META);
		p.columnRslt_col_038.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_038);
		p.columnRslt_col_039.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_039_META);
		p.columnRslt_col_039.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_039);
		p.columnRslt_col_040.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_040_META);
		p.columnRslt_col_040.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_040);
		p.columnRslt_col_041.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_041_META);
		p.columnRslt_col_041.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_041);
		p.columnRslt_col_042.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_042_META);
		p.columnRslt_col_042.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_042);
		p.columnRslt_col_043.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_043_META);
		p.columnRslt_col_043.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_043);
		p.columnRslt_col_044.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_044_META);
		p.columnRslt_col_044.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_044);
		p.columnRslt_col_045.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_045_META);
		p.columnRslt_col_045.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_045);
		p.columnRslt_col_046.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_046_META);
		p.columnRslt_col_046.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_046);
		p.columnRslt_col_047.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_047_META);
		p.columnRslt_col_047.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_047);
		p.columnRslt_col_048.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_048_META);
		p.columnRslt_col_048.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_048);
		p.columnRslt_col_049.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_049_META);
		p.columnRslt_col_049.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_049);
		p.columnRslt_col_050.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_050_META);
		p.columnRslt_col_050.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_050);
		p.columnRslt_col_051.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_051_META);
		p.columnRslt_col_051.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_051);
		p.columnRslt_col_052.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_052_META);
		p.columnRslt_col_052.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_052);
		p.columnRslt_col_053.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_053_META);
		p.columnRslt_col_053.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_053);
		p.columnRslt_col_054.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_054_META);
		p.columnRslt_col_054.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_054);
		p.columnRslt_col_055.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_055_META);
		p.columnRslt_col_055.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_055);
		p.columnRslt_col_056.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_056_META);
		p.columnRslt_col_056.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_056);
		p.columnRslt_col_057.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_057_META);
		p.columnRslt_col_057.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_057);
		p.columnRslt_col_058.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_058_META);
		p.columnRslt_col_058.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_058);
		p.columnRslt_col_059.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_059_META);
		p.columnRslt_col_059.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_059);
		p.columnRslt_col_060.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_060_META);
		p.columnRslt_col_060.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_060);
		p.columnRslt_col_061.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_061_META);
		p.columnRslt_col_061.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_061);
		p.columnRslt_col_062.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_062_META);
		p.columnRslt_col_062.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_062);
		p.columnRslt_col_063.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_063_META);
		p.columnRslt_col_063.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_063);
		p.columnRslt_col_064.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_064_META);
		p.columnRslt_col_064.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_064);
		p.columnRslt_col_065.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_065_META);
		p.columnRslt_col_065.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_065);
		p.columnRslt_col_066.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_066_META);
		p.columnRslt_col_066.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_066);
		p.columnRslt_col_067.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_067_META);
		p.columnRslt_col_067.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_067);
		p.columnRslt_col_068.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_068_META);
		p.columnRslt_col_068.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_068);
		p.columnRslt_col_069.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_069_META);
		p.columnRslt_col_069.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_069);
		p.columnRslt_col_070.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_070_META);
		p.columnRslt_col_070.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_070);
		p.columnRslt_col_071.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_071_META);
		p.columnRslt_col_071.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_071);
		p.columnRslt_col_072.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_072_META);
		p.columnRslt_col_072.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_072);
		p.columnRslt_col_073.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_073_META);
		p.columnRslt_col_073.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_073);
		p.columnRslt_col_074.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_074_META);
		p.columnRslt_col_074.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_074);
		p.columnRslt_col_075.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_075_META);
		p.columnRslt_col_075.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_075);
		p.columnRslt_col_076.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_076_META);
		p.columnRslt_col_076.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_076);
		p.columnRslt_col_077.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_077_META);
		p.columnRslt_col_077.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_077);
		p.columnRslt_col_078.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_078_META);
		p.columnRslt_col_078.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_078);
		p.columnRslt_col_079.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_079_META);
		p.columnRslt_col_079.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_079);
		p.columnRslt_col_080.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_080_META);
		p.columnRslt_col_080.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_080);
		p.columnRslt_col_081.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_081_META);
		p.columnRslt_col_081.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_081);
		p.columnRslt_col_082.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_082_META);
		p.columnRslt_col_082.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_082);
		p.columnRslt_col_083.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_083_META);
		p.columnRslt_col_083.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_083);
		p.columnRslt_col_084.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_084_META);
		p.columnRslt_col_084.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_084);
		p.columnRslt_col_085.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_085_META);
		p.columnRslt_col_085.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_085);
		p.columnRslt_col_086.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_086_META);
		p.columnRslt_col_086.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_086);
		p.columnRslt_col_087.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_087_META);
		p.columnRslt_col_087.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_087);
		p.columnRslt_col_088.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_088_META);
		p.columnRslt_col_088.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_088);
		p.columnRslt_col_089.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_089_META);
		p.columnRslt_col_089.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_089);
		p.columnRslt_col_090.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_090_META);
		p.columnRslt_col_090.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_090);
		p.columnRslt_col_091.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_091_META);
		p.columnRslt_col_091.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_091);
		p.columnRslt_col_092.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_092_META);
		p.columnRslt_col_092.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_092);
		p.columnRslt_col_093.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_093_META);
		p.columnRslt_col_093.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_093);
		p.columnRslt_col_094.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_094_META);
		p.columnRslt_col_094.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_094);
		p.columnRslt_col_095.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_095_META);
		p.columnRslt_col_095.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_095);
		p.columnRslt_col_096.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_096_META);
		p.columnRslt_col_096.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_096);
		p.columnRslt_col_097.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_097_META);
		p.columnRslt_col_097.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_097);
		p.columnRslt_col_098.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_098_META);
		p.columnRslt_col_098.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_098);
		p.columnRslt_col_099.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_099_META);
		p.columnRslt_col_099.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_099);
		p.columnRslt_col_100.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_100_META);
		p.columnRslt_col_100.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_100);
		p.columnRslt_col_101.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_101_META);
		p.columnRslt_col_101.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_101);
		p.columnRslt_col_102.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_102_META);
		p.columnRslt_col_102.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_102);
		p.columnRslt_col_103.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_103_META);
		p.columnRslt_col_103.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_103);
		p.columnRslt_col_104.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_104_META);
		p.columnRslt_col_104.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_104);
		p.columnRslt_col_105.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_105_META);
		p.columnRslt_col_105.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_105);
		p.columnRslt_col_106.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_106_META);
		p.columnRslt_col_106.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_106);
		p.columnRslt_col_107.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_107_META);
		p.columnRslt_col_107.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_107);
		p.columnRslt_col_108.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_108_META);
		p.columnRslt_col_108.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_108);
		p.columnRslt_col_109.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_109_META);
		p.columnRslt_col_109.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_109);
		p.columnRslt_col_110.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_110_META);
		p.columnRslt_col_110.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_110);
		p.columnRslt_col_111.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_111_META);
		p.columnRslt_col_111.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_111);
		p.columnRslt_col_112.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_112_META);
		p.columnRslt_col_112.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_112);
		p.columnRslt_col_113.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_113_META);
		p.columnRslt_col_113.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_113);
		p.columnRslt_col_114.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_114_META);
		p.columnRslt_col_114.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_114);
		p.columnRslt_col_115.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_115_META);
		p.columnRslt_col_115.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_115);
		p.columnRslt_col_116.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_116_META);
		p.columnRslt_col_116.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_116);
		p.columnRslt_col_117.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_117_META);
		p.columnRslt_col_117.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_117);
		p.columnRslt_col_118.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_118_META);
		p.columnRslt_col_118.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_118);
		p.columnRslt_col_119.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_119_META);
		p.columnRslt_col_119.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_119);
		p.columnRslt_col_120.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_120_META);
		p.columnRslt_col_120.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_120);
		p.columnRslt_col_121.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_121_META);
		p.columnRslt_col_121.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_121);
		p.columnRslt_col_122.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_122_META);
		p.columnRslt_col_122.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_122);
		p.columnRslt_col_123.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_123_META);
		p.columnRslt_col_123.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_123);
		p.columnRslt_col_124.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_124_META);
		p.columnRslt_col_124.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_124);
		p.columnRslt_col_125.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_125_META);
		p.columnRslt_col_125.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_125);
		p.columnRslt_col_126.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_126_META);
		p.columnRslt_col_126.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_126);
		p.columnRslt_col_127.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_127_META);
		p.columnRslt_col_127.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_127);
		p.columnRslt_col_128.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_128_META);
		p.columnRslt_col_128.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_128);
		p.columnRslt_col_129.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_129_META);
		p.columnRslt_col_129.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_129);
		p.columnRslt_col_130.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_130_META);
		p.columnRslt_col_130.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_130);
		p.columnRslt_col_131.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_131_META);
		p.columnRslt_col_131.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_131);
		p.columnRslt_col_132.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_132_META);
		p.columnRslt_col_132.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_132);
		p.columnRslt_col_133.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_133_META);
		p.columnRslt_col_133.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_133);
		p.columnRslt_col_134.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_134_META);
		p.columnRslt_col_134.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_134);
		p.columnRslt_col_135.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_135_META);
		p.columnRslt_col_135.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_135);
		p.columnRslt_col_136.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_136_META);
		p.columnRslt_col_136.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_136);
		p.columnRslt_col_137.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_137_META);
		p.columnRslt_col_137.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_137);
		p.columnRslt_col_138.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_138_META);
		p.columnRslt_col_138.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_138);
		p.columnRslt_col_139.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_139_META);
		p.columnRslt_col_139.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_139);
		p.columnRslt_col_140.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_140_META);
		p.columnRslt_col_140.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_140);
		p.columnRslt_col_141.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_141_META);
		p.columnRslt_col_141.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_141);
		p.columnRslt_col_142.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_142_META);
		p.columnRslt_col_142.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_142);
		p.columnRslt_col_143.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_143_META);
		p.columnRslt_col_143.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_143);
		p.columnRslt_col_144.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_144_META);
		p.columnRslt_col_144.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_144);
		p.columnRslt_col_145.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_145_META);
		p.columnRslt_col_145.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_145);
		p.columnRslt_col_146.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_146_META);
		p.columnRslt_col_146.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_146);
		p.columnRslt_col_147.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_147_META);
		p.columnRslt_col_147.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_147);
		p.columnRslt_col_148.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_148_META);
		p.columnRslt_col_148.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_148);
		p.columnRslt_col_149.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_149_META);
		p.columnRslt_col_149.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_149);
		p.columnRslt_col_150.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_150_META);
		p.columnRslt_col_150.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_150);
		p.columnRslt_col_151.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_151_META);
		p.columnRslt_col_151.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_151);
		p.columnRslt_col_152.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_152_META);
		p.columnRslt_col_152.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_152);
		p.columnRslt_col_153.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_153_META);
		p.columnRslt_col_153.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_153);
		p.columnRslt_col_154.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_154_META);
		p.columnRslt_col_154.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_154);
		p.columnRslt_col_155.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_155_META);
		p.columnRslt_col_155.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_155);
		p.columnRslt_col_156.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_156_META);
		p.columnRslt_col_156.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_156);
		p.columnRslt_col_157.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_157_META);
		p.columnRslt_col_157.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_157);
		p.columnRslt_col_158.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_158_META);
		p.columnRslt_col_158.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_158);
		p.columnRslt_col_159.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_159_META);
		p.columnRslt_col_159.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_159);
		p.columnRslt_col_160.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_160_META);
		p.columnRslt_col_160.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_160);
		p.columnRslt_col_161.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_161_META);
		p.columnRslt_col_161.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_161);
		p.columnRslt_col_162.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_162_META);
		p.columnRslt_col_162.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_162);
		p.columnRslt_col_163.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_163_META);
		p.columnRslt_col_163.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_163);
		p.columnRslt_col_164.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_164_META);
		p.columnRslt_col_164.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_164);
		p.columnRslt_col_165.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_165_META);
		p.columnRslt_col_165.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_165);
		p.columnRslt_col_166.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_166_META);
		p.columnRslt_col_166.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_166);
		p.columnRslt_col_167.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_167_META);
		p.columnRslt_col_167.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_167);
		p.columnRslt_col_168.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_168_META);
		p.columnRslt_col_168.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_168);
		p.columnRslt_col_169.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_169_META);
		p.columnRslt_col_169.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_169);
		p.columnRslt_col_170.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_170_META);
		p.columnRslt_col_170.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_170);
		p.columnRslt_col_171.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_171_META);
		p.columnRslt_col_171.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_171);
		p.columnRslt_col_172.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_172_META);
		p.columnRslt_col_172.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_172);
		p.columnRslt_col_173.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_173_META);
		p.columnRslt_col_173.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_173);
		p.columnRslt_col_174.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_174_META);
		p.columnRslt_col_174.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_174);
		p.columnRslt_col_175.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_175_META);
		p.columnRslt_col_175.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_175);
		p.columnRslt_col_176.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_176_META);
		p.columnRslt_col_176.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_176);
		p.columnRslt_col_177.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_177_META);
		p.columnRslt_col_177.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_177);
		p.columnRslt_col_178.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_178_META);
		p.columnRslt_col_178.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_178);
		p.columnRslt_col_179.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_179_META);
		p.columnRslt_col_179.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_179);
		p.columnRslt_col_180.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_180_META);
		p.columnRslt_col_180.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_180);
		p.columnRslt_col_181.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_181_META);
		p.columnRslt_col_181.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_181);
		p.columnRslt_col_182.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_182_META);
		p.columnRslt_col_182.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_182);
		p.columnRslt_col_183.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_183_META);
		p.columnRslt_col_183.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_183);
		p.columnRslt_col_184.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_184_META);
		p.columnRslt_col_184.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_184);
		p.columnRslt_col_185.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_185_META);
		p.columnRslt_col_185.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_185);
		p.columnRslt_col_186.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_186_META);
		p.columnRslt_col_186.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_186);
		p.columnRslt_col_187.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_187_META);
		p.columnRslt_col_187.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_187);
		p.columnRslt_col_188.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_188_META);
		p.columnRslt_col_188.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_188);
		p.columnRslt_col_189.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_189_META);
		p.columnRslt_col_189.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_189);
		p.columnRslt_col_190.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_190_META);
		p.columnRslt_col_190.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_190);
		p.columnRslt_col_191.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_191_META);
		p.columnRslt_col_191.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_191);
		p.columnRslt_col_192.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_192_META);
		p.columnRslt_col_192.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_192);
		p.columnRslt_col_193.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_193_META);
		p.columnRslt_col_193.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_193);
		p.columnRslt_col_194.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_194_META);
		p.columnRslt_col_194.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_194);
		p.columnRslt_col_195.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_195_META);
		p.columnRslt_col_195.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_195);
		p.columnRslt_col_196.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_196_META);
		p.columnRslt_col_196.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_196);
		p.columnRslt_col_197.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_197_META);
		p.columnRslt_col_197.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_197);
		p.columnRslt_col_198.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_198_META);
		p.columnRslt_col_198.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_198);
		p.columnRslt_col_199.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_199_META);
		p.columnRslt_col_199.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_199);
		p.columnRslt_col_200.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_200_META);
		p.columnRslt_col_200.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_200);
		p.columnRslt_col_201.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_201_META);
		p.columnRslt_col_201.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_201);
		p.columnRslt_col_202.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_202_META);
		p.columnRslt_col_202.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_202);
		p.columnRslt_col_203.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_203_META);
		p.columnRslt_col_203.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_203);
		p.columnRslt_col_204.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_204_META);
		p.columnRslt_col_204.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_204);
		p.columnRslt_col_205.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_205_META);
		p.columnRslt_col_205.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_205);
		p.columnRslt_col_206.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_206_META);
		p.columnRslt_col_206.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_206);
		p.columnRslt_col_207.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_207_META);
		p.columnRslt_col_207.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_207);
		p.columnRslt_col_208.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_208_META);
		p.columnRslt_col_208.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_208);
		p.columnRslt_col_209.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_209_META);
		p.columnRslt_col_209.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_209);
		p.columnRslt_col_210.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_210_META);
		p.columnRslt_col_210.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_210);
		p.columnRslt_col_211.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_211_META);
		p.columnRslt_col_211.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_211);
		p.columnRslt_col_212.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_212_META);
		p.columnRslt_col_212.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_212);
		p.columnRslt_col_213.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_213_META);
		p.columnRslt_col_213.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_213);
		p.columnRslt_col_214.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_214_META);
		p.columnRslt_col_214.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_214);
		p.columnRslt_col_215.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_215_META);
		p.columnRslt_col_215.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_215);
		p.columnRslt_col_216.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_216_META);
		p.columnRslt_col_216.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_216);
		p.columnRslt_col_217.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_217_META);
		p.columnRslt_col_217.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_217);
		p.columnRslt_col_218.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_218_META);
		p.columnRslt_col_218.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_218);
		p.columnRslt_col_219.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_219_META);
		p.columnRslt_col_219.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_219);
		p.columnRslt_col_220.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_220_META);
		p.columnRslt_col_220.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_220);
		p.columnRslt_col_221.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_221_META);
		p.columnRslt_col_221.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_221);
		p.columnRslt_col_222.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_222_META);
		p.columnRslt_col_222.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_222);
		p.columnRslt_col_223.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_223_META);
		p.columnRslt_col_223.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_223);
		p.columnRslt_col_224.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_224_META);
		p.columnRslt_col_224.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_224);
		p.columnRslt_col_225.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_225_META);
		p.columnRslt_col_225.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_225);
		p.columnRslt_col_226.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_226_META);
		p.columnRslt_col_226.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_226);
		p.columnRslt_col_227.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_227_META);
		p.columnRslt_col_227.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_227);
		p.columnRslt_col_228.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_228_META);
		p.columnRslt_col_228.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_228);
		p.columnRslt_col_229.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_229_META);
		p.columnRslt_col_229.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_229);
		p.columnRslt_col_230.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_230_META);
		p.columnRslt_col_230.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_230);
		p.columnRslt_col_231.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_231_META);
		p.columnRslt_col_231.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_231);
		p.columnRslt_col_232.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_232_META);
		p.columnRslt_col_232.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_232);
		p.columnRslt_col_233.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_233_META);
		p.columnRslt_col_233.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_233);
		p.columnRslt_col_234.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_234_META);
		p.columnRslt_col_234.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_234);
		p.columnRslt_col_235.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_235_META);
		p.columnRslt_col_235.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_235);
		p.columnRslt_col_236.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_236_META);
		p.columnRslt_col_236.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_236);
		p.columnRslt_col_237.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_237_META);
		p.columnRslt_col_237.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_237);
		p.columnRslt_col_238.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_238_META);
		p.columnRslt_col_238.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_238);
		p.columnRslt_col_239.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_239_META);
		p.columnRslt_col_239.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_239);
		p.columnRslt_col_240.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_240_META);
		p.columnRslt_col_240.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_240);
		p.columnRslt_col_241.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_241_META);
		p.columnRslt_col_241.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_241);
		p.columnRslt_col_242.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_242_META);
		p.columnRslt_col_242.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_242);
		p.columnRslt_col_243.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_243_META);
		p.columnRslt_col_243.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_243);
		p.columnRslt_col_244.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_244_META);
		p.columnRslt_col_244.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_244);
		p.columnRslt_col_245.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_245_META);
		p.columnRslt_col_245.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_245);
		p.columnRslt_col_246.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_246_META);
		p.columnRslt_col_246.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_246);
		p.columnRslt_col_247.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_247_META);
		p.columnRslt_col_247.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_247);
		p.columnRslt_col_248.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_248_META);
		p.columnRslt_col_248.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_248);
		p.columnRslt_col_249.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_249_META);
		p.columnRslt_col_249.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_249);
		p.columnRslt_col_250.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_250_META);
		p.columnRslt_col_250.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_250);
		p.columnRslt_col_251.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_251_META);
		p.columnRslt_col_251.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_251);
		p.columnRslt_col_252.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_252_META);
		p.columnRslt_col_252.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_252);
		p.columnRslt_col_253.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_253_META);
		p.columnRslt_col_253.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_253);
		p.columnRslt_col_254.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_254_META);
		p.columnRslt_col_254.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_254);
		p.columnRslt_col_255.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_255_META);
		p.columnRslt_col_255.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_255);
		p.columnRslt_col_256.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_256_META);
		p.columnRslt_col_256.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_256);
		p.columnRslt_col_257.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_257_META);
		p.columnRslt_col_257.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_257);
		p.columnRslt_col_258.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_258_META);
		p.columnRslt_col_258.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_258);
		p.columnRslt_col_259.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_259_META);
		p.columnRslt_col_259.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_259);
		p.columnRslt_col_260.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_260_META);
		p.columnRslt_col_260.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_260);
		p.columnRslt_col_261.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_261_META);
		p.columnRslt_col_261.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_261);
		p.columnRslt_col_262.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_262_META);
		p.columnRslt_col_262.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_262);
		p.columnRslt_col_263.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_263_META);
		p.columnRslt_col_263.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_263);
		p.columnRslt_col_264.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_264_META);
		p.columnRslt_col_264.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_264);
		p.columnRslt_col_265.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_265_META);
		p.columnRslt_col_265.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_265);
		p.columnRslt_col_266.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_266_META);
		p.columnRslt_col_266.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_266);
		p.columnRslt_col_267.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_267_META);
		p.columnRslt_col_267.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_267);
		p.columnRslt_col_268.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_268_META);
		p.columnRslt_col_268.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_268);
		p.columnRslt_col_269.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_269_META);
		p.columnRslt_col_269.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_269);
		p.columnRslt_col_270.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_270_META);
		p.columnRslt_col_270.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_270);
		p.columnRslt_col_271.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_271_META);
		p.columnRslt_col_271.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_271);
		p.columnRslt_col_272.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_272_META);
		p.columnRslt_col_272.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_272);
		p.columnRslt_col_273.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_273_META);
		p.columnRslt_col_273.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_273);
		p.columnRslt_col_274.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_274_META);
		p.columnRslt_col_274.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_274);
		p.columnRslt_col_275.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_275_META);
		p.columnRslt_col_275.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_275);
		p.columnRslt_col_276.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_276_META);
		p.columnRslt_col_276.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_276);
		p.columnRslt_col_277.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_277_META);
		p.columnRslt_col_277.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_277);
		p.columnRslt_col_278.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_278_META);
		p.columnRslt_col_278.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_278);
		p.columnRslt_col_279.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_279_META);
		p.columnRslt_col_279.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_279);
		p.columnRslt_col_280.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_280_META);
		p.columnRslt_col_280.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_280);
		p.columnRslt_col_281.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_281_META);
		p.columnRslt_col_281.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_281);
		p.columnRslt_col_282.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_282_META);
		p.columnRslt_col_282.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_282);
		p.columnRslt_col_283.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_283_META);
		p.columnRslt_col_283.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_283);
		p.columnRslt_col_284.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_284_META);
		p.columnRslt_col_284.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_284);
		p.columnRslt_col_285.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_285_META);
		p.columnRslt_col_285.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_285);
		p.columnRslt_col_286.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_286_META);
		p.columnRslt_col_286.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_286);
		p.columnRslt_col_287.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_287_META);
		p.columnRslt_col_287.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_287);
		p.columnRslt_col_288.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_288_META);
		p.columnRslt_col_288.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_288);
		p.columnRslt_col_289.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_289_META);
		p.columnRslt_col_289.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_289);
		p.columnRslt_col_290.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_290_META);
		p.columnRslt_col_290.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_290);
		p.columnRslt_col_291.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_291_META);
		p.columnRslt_col_291.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_291);
		p.columnRslt_col_292.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_292_META);
		p.columnRslt_col_292.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_292);
		p.columnRslt_col_293.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_293_META);
		p.columnRslt_col_293.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_293);
		p.columnRslt_col_294.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_294_META);
		p.columnRslt_col_294.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_294);
		p.columnRslt_col_295.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_295_META);
		p.columnRslt_col_295.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_295);
		p.columnRslt_col_296.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_296_META);
		p.columnRslt_col_296.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_296);
		p.columnRslt_col_297.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_297_META);
		p.columnRslt_col_297.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_297);
		p.columnRslt_col_298.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_298_META);
		p.columnRslt_col_298.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_298);
		p.columnRslt_col_299.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.col_299_META);
		p.columnRslt_col_299.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_299);
		p.columnRslt_st_wip_key.setMeta(mcframe.clientMGBB.MGBBP0220.RsltR.st_wip_key_META);
		p.RsltTable.addColumnConfig(p.columnRslt_st_wip_key);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addColumnGroup(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addColumnGroup(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.RsltTable.addColumnGroup(p.Rslt_qty_p_PPanel.QtyTable);
		p.cgRslt_cg_ttl.add(p.columnRslt_ttl);
		p.cgRslt_cg_ttl.add(p.columnRslt_ttl_wip_amt);
		p.cgRslt_cg_ttl.add(p.columnRslt_ttl_inpt_amt);
		p.RsltTable.addColumnGroup(p.cgRslt_cg_ttl);
		p.cgRslt_cg0.add(p.columnRslt_col_000);
		p.cgRslt_cg0.add(p.columnRslt_col_001);
		p.cgRslt_cg0.add(p.columnRslt_col_002);
		p.RsltTable.addColumnGroup(p.cgRslt_cg0);
		p.cgRslt_cg1.add(p.columnRslt_col_003);
		p.cgRslt_cg1.add(p.columnRslt_col_004);
		p.cgRslt_cg1.add(p.columnRslt_col_005);
		p.RsltTable.addColumnGroup(p.cgRslt_cg1);
		p.cgRslt_cg2.add(p.columnRslt_col_006);
		p.cgRslt_cg2.add(p.columnRslt_col_007);
		p.cgRslt_cg2.add(p.columnRslt_col_008);
		p.RsltTable.addColumnGroup(p.cgRslt_cg2);
		p.cgRslt_cg3.add(p.columnRslt_col_009);
		p.cgRslt_cg3.add(p.columnRslt_col_010);
		p.cgRslt_cg3.add(p.columnRslt_col_011);
		p.RsltTable.addColumnGroup(p.cgRslt_cg3);
		p.cgRslt_cg4.add(p.columnRslt_col_012);
		p.cgRslt_cg4.add(p.columnRslt_col_013);
		p.cgRslt_cg4.add(p.columnRslt_col_014);
		p.RsltTable.addColumnGroup(p.cgRslt_cg4);
		p.cgRslt_cg5.add(p.columnRslt_col_015);
		p.cgRslt_cg5.add(p.columnRslt_col_016);
		p.cgRslt_cg5.add(p.columnRslt_col_017);
		p.RsltTable.addColumnGroup(p.cgRslt_cg5);
		p.cgRslt_cg6.add(p.columnRslt_col_018);
		p.cgRslt_cg6.add(p.columnRslt_col_019);
		p.cgRslt_cg6.add(p.columnRslt_col_020);
		p.RsltTable.addColumnGroup(p.cgRslt_cg6);
		p.cgRslt_cg7.add(p.columnRslt_col_021);
		p.cgRslt_cg7.add(p.columnRslt_col_022);
		p.cgRslt_cg7.add(p.columnRslt_col_023);
		p.RsltTable.addColumnGroup(p.cgRslt_cg7);
		p.cgRslt_cg8.add(p.columnRslt_col_024);
		p.cgRslt_cg8.add(p.columnRslt_col_025);
		p.cgRslt_cg8.add(p.columnRslt_col_026);
		p.RsltTable.addColumnGroup(p.cgRslt_cg8);
		p.cgRslt_cg9.add(p.columnRslt_col_027);
		p.cgRslt_cg9.add(p.columnRslt_col_028);
		p.cgRslt_cg9.add(p.columnRslt_col_029);
		p.RsltTable.addColumnGroup(p.cgRslt_cg9);
		p.cgRslt_cg10.add(p.columnRslt_col_030);
		p.cgRslt_cg10.add(p.columnRslt_col_031);
		p.cgRslt_cg10.add(p.columnRslt_col_032);
		p.RsltTable.addColumnGroup(p.cgRslt_cg10);
		p.cgRslt_cg11.add(p.columnRslt_col_033);
		p.cgRslt_cg11.add(p.columnRslt_col_034);
		p.cgRslt_cg11.add(p.columnRslt_col_035);
		p.RsltTable.addColumnGroup(p.cgRslt_cg11);
		p.cgRslt_cg12.add(p.columnRslt_col_036);
		p.cgRslt_cg12.add(p.columnRslt_col_037);
		p.cgRslt_cg12.add(p.columnRslt_col_038);
		p.RsltTable.addColumnGroup(p.cgRslt_cg12);
		p.cgRslt_cg13.add(p.columnRslt_col_039);
		p.cgRslt_cg13.add(p.columnRslt_col_040);
		p.cgRslt_cg13.add(p.columnRslt_col_041);
		p.RsltTable.addColumnGroup(p.cgRslt_cg13);
		p.cgRslt_cg14.add(p.columnRslt_col_042);
		p.cgRslt_cg14.add(p.columnRslt_col_043);
		p.cgRslt_cg14.add(p.columnRslt_col_044);
		p.RsltTable.addColumnGroup(p.cgRslt_cg14);
		p.cgRslt_cg15.add(p.columnRslt_col_045);
		p.cgRslt_cg15.add(p.columnRslt_col_046);
		p.cgRslt_cg15.add(p.columnRslt_col_047);
		p.RsltTable.addColumnGroup(p.cgRslt_cg15);
		p.cgRslt_cg16.add(p.columnRslt_col_048);
		p.cgRslt_cg16.add(p.columnRslt_col_049);
		p.cgRslt_cg16.add(p.columnRslt_col_050);
		p.RsltTable.addColumnGroup(p.cgRslt_cg16);
		p.cgRslt_cg17.add(p.columnRslt_col_051);
		p.cgRslt_cg17.add(p.columnRslt_col_052);
		p.cgRslt_cg17.add(p.columnRslt_col_053);
		p.RsltTable.addColumnGroup(p.cgRslt_cg17);
		p.cgRslt_cg18.add(p.columnRslt_col_054);
		p.cgRslt_cg18.add(p.columnRslt_col_055);
		p.cgRslt_cg18.add(p.columnRslt_col_056);
		p.RsltTable.addColumnGroup(p.cgRslt_cg18);
		p.cgRslt_cg19.add(p.columnRslt_col_057);
		p.cgRslt_cg19.add(p.columnRslt_col_058);
		p.cgRslt_cg19.add(p.columnRslt_col_059);
		p.RsltTable.addColumnGroup(p.cgRslt_cg19);
		p.cgRslt_cg20.add(p.columnRslt_col_060);
		p.cgRslt_cg20.add(p.columnRslt_col_061);
		p.cgRslt_cg20.add(p.columnRslt_col_062);
		p.RsltTable.addColumnGroup(p.cgRslt_cg20);
		p.cgRslt_cg21.add(p.columnRslt_col_063);
		p.cgRslt_cg21.add(p.columnRslt_col_064);
		p.cgRslt_cg21.add(p.columnRslt_col_065);
		p.RsltTable.addColumnGroup(p.cgRslt_cg21);
		p.cgRslt_cg22.add(p.columnRslt_col_066);
		p.cgRslt_cg22.add(p.columnRslt_col_067);
		p.cgRslt_cg22.add(p.columnRslt_col_068);
		p.RsltTable.addColumnGroup(p.cgRslt_cg22);
		p.cgRslt_cg23.add(p.columnRslt_col_069);
		p.cgRslt_cg23.add(p.columnRslt_col_070);
		p.cgRslt_cg23.add(p.columnRslt_col_071);
		p.RsltTable.addColumnGroup(p.cgRslt_cg23);
		p.cgRslt_cg24.add(p.columnRslt_col_072);
		p.cgRslt_cg24.add(p.columnRslt_col_073);
		p.cgRslt_cg24.add(p.columnRslt_col_074);
		p.RsltTable.addColumnGroup(p.cgRslt_cg24);
		p.cgRslt_cg25.add(p.columnRslt_col_075);
		p.cgRslt_cg25.add(p.columnRslt_col_076);
		p.cgRslt_cg25.add(p.columnRslt_col_077);
		p.RsltTable.addColumnGroup(p.cgRslt_cg25);
		p.cgRslt_cg26.add(p.columnRslt_col_078);
		p.cgRslt_cg26.add(p.columnRslt_col_079);
		p.cgRslt_cg26.add(p.columnRslt_col_080);
		p.RsltTable.addColumnGroup(p.cgRslt_cg26);
		p.cgRslt_cg27.add(p.columnRslt_col_081);
		p.cgRslt_cg27.add(p.columnRslt_col_082);
		p.cgRslt_cg27.add(p.columnRslt_col_083);
		p.RsltTable.addColumnGroup(p.cgRslt_cg27);
		p.cgRslt_cg28.add(p.columnRslt_col_084);
		p.cgRslt_cg28.add(p.columnRslt_col_085);
		p.cgRslt_cg28.add(p.columnRslt_col_086);
		p.RsltTable.addColumnGroup(p.cgRslt_cg28);
		p.cgRslt_cg29.add(p.columnRslt_col_087);
		p.cgRslt_cg29.add(p.columnRslt_col_088);
		p.cgRslt_cg29.add(p.columnRslt_col_089);
		p.RsltTable.addColumnGroup(p.cgRslt_cg29);
		p.cgRslt_cg30.add(p.columnRslt_col_090);
		p.cgRslt_cg30.add(p.columnRslt_col_091);
		p.cgRslt_cg30.add(p.columnRslt_col_092);
		p.RsltTable.addColumnGroup(p.cgRslt_cg30);
		p.cgRslt_cg31.add(p.columnRslt_col_093);
		p.cgRslt_cg31.add(p.columnRslt_col_094);
		p.cgRslt_cg31.add(p.columnRslt_col_095);
		p.RsltTable.addColumnGroup(p.cgRslt_cg31);
		p.cgRslt_cg32.add(p.columnRslt_col_096);
		p.cgRslt_cg32.add(p.columnRslt_col_097);
		p.cgRslt_cg32.add(p.columnRslt_col_098);
		p.RsltTable.addColumnGroup(p.cgRslt_cg32);
		p.cgRslt_cg33.add(p.columnRslt_col_099);
		p.cgRslt_cg33.add(p.columnRslt_col_100);
		p.cgRslt_cg33.add(p.columnRslt_col_101);
		p.RsltTable.addColumnGroup(p.cgRslt_cg33);
		p.cgRslt_cg34.add(p.columnRslt_col_102);
		p.cgRslt_cg34.add(p.columnRslt_col_103);
		p.cgRslt_cg34.add(p.columnRslt_col_104);
		p.RsltTable.addColumnGroup(p.cgRslt_cg34);
		p.cgRslt_cg35.add(p.columnRslt_col_105);
		p.cgRslt_cg35.add(p.columnRslt_col_106);
		p.cgRslt_cg35.add(p.columnRslt_col_107);
		p.RsltTable.addColumnGroup(p.cgRslt_cg35);
		p.cgRslt_cg36.add(p.columnRslt_col_108);
		p.cgRslt_cg36.add(p.columnRslt_col_109);
		p.cgRslt_cg36.add(p.columnRslt_col_110);
		p.RsltTable.addColumnGroup(p.cgRslt_cg36);
		p.cgRslt_cg37.add(p.columnRslt_col_111);
		p.cgRslt_cg37.add(p.columnRslt_col_112);
		p.cgRslt_cg37.add(p.columnRslt_col_113);
		p.RsltTable.addColumnGroup(p.cgRslt_cg37);
		p.cgRslt_cg38.add(p.columnRslt_col_114);
		p.cgRslt_cg38.add(p.columnRslt_col_115);
		p.cgRslt_cg38.add(p.columnRslt_col_116);
		p.RsltTable.addColumnGroup(p.cgRslt_cg38);
		p.cgRslt_cg39.add(p.columnRslt_col_117);
		p.cgRslt_cg39.add(p.columnRslt_col_118);
		p.cgRslt_cg39.add(p.columnRslt_col_119);
		p.RsltTable.addColumnGroup(p.cgRslt_cg39);
		p.cgRslt_cg40.add(p.columnRslt_col_120);
		p.cgRslt_cg40.add(p.columnRslt_col_121);
		p.cgRslt_cg40.add(p.columnRslt_col_122);
		p.RsltTable.addColumnGroup(p.cgRslt_cg40);
		p.cgRslt_cg41.add(p.columnRslt_col_123);
		p.cgRslt_cg41.add(p.columnRslt_col_124);
		p.cgRslt_cg41.add(p.columnRslt_col_125);
		p.RsltTable.addColumnGroup(p.cgRslt_cg41);
		p.cgRslt_cg42.add(p.columnRslt_col_126);
		p.cgRslt_cg42.add(p.columnRslt_col_127);
		p.cgRslt_cg42.add(p.columnRslt_col_128);
		p.RsltTable.addColumnGroup(p.cgRslt_cg42);
		p.cgRslt_cg43.add(p.columnRslt_col_129);
		p.cgRslt_cg43.add(p.columnRslt_col_130);
		p.cgRslt_cg43.add(p.columnRslt_col_131);
		p.RsltTable.addColumnGroup(p.cgRslt_cg43);
		p.cgRslt_cg44.add(p.columnRslt_col_132);
		p.cgRslt_cg44.add(p.columnRslt_col_133);
		p.cgRslt_cg44.add(p.columnRslt_col_134);
		p.RsltTable.addColumnGroup(p.cgRslt_cg44);
		p.cgRslt_cg45.add(p.columnRslt_col_135);
		p.cgRslt_cg45.add(p.columnRslt_col_136);
		p.cgRslt_cg45.add(p.columnRslt_col_137);
		p.RsltTable.addColumnGroup(p.cgRslt_cg45);
		p.cgRslt_cg46.add(p.columnRslt_col_138);
		p.cgRslt_cg46.add(p.columnRslt_col_139);
		p.cgRslt_cg46.add(p.columnRslt_col_140);
		p.RsltTable.addColumnGroup(p.cgRslt_cg46);
		p.cgRslt_cg47.add(p.columnRslt_col_141);
		p.cgRslt_cg47.add(p.columnRslt_col_142);
		p.cgRslt_cg47.add(p.columnRslt_col_143);
		p.RsltTable.addColumnGroup(p.cgRslt_cg47);
		p.cgRslt_cg48.add(p.columnRslt_col_144);
		p.cgRslt_cg48.add(p.columnRslt_col_145);
		p.cgRslt_cg48.add(p.columnRslt_col_146);
		p.RsltTable.addColumnGroup(p.cgRslt_cg48);
		p.cgRslt_cg49.add(p.columnRslt_col_147);
		p.cgRslt_cg49.add(p.columnRslt_col_148);
		p.cgRslt_cg49.add(p.columnRslt_col_149);
		p.RsltTable.addColumnGroup(p.cgRslt_cg49);
		p.cgRslt_cg50.add(p.columnRslt_col_150);
		p.cgRslt_cg50.add(p.columnRslt_col_151);
		p.cgRslt_cg50.add(p.columnRslt_col_152);
		p.RsltTable.addColumnGroup(p.cgRslt_cg50);
		p.cgRslt_cg51.add(p.columnRslt_col_153);
		p.cgRslt_cg51.add(p.columnRslt_col_154);
		p.cgRslt_cg51.add(p.columnRslt_col_155);
		p.RsltTable.addColumnGroup(p.cgRslt_cg51);
		p.cgRslt_cg52.add(p.columnRslt_col_156);
		p.cgRslt_cg52.add(p.columnRslt_col_157);
		p.cgRslt_cg52.add(p.columnRslt_col_158);
		p.RsltTable.addColumnGroup(p.cgRslt_cg52);
		p.cgRslt_cg53.add(p.columnRslt_col_159);
		p.cgRslt_cg53.add(p.columnRslt_col_160);
		p.cgRslt_cg53.add(p.columnRslt_col_161);
		p.RsltTable.addColumnGroup(p.cgRslt_cg53);
		p.cgRslt_cg54.add(p.columnRslt_col_162);
		p.cgRslt_cg54.add(p.columnRslt_col_163);
		p.cgRslt_cg54.add(p.columnRslt_col_164);
		p.RsltTable.addColumnGroup(p.cgRslt_cg54);
		p.cgRslt_cg55.add(p.columnRslt_col_165);
		p.cgRslt_cg55.add(p.columnRslt_col_166);
		p.cgRslt_cg55.add(p.columnRslt_col_167);
		p.RsltTable.addColumnGroup(p.cgRslt_cg55);
		p.cgRslt_cg56.add(p.columnRslt_col_168);
		p.cgRslt_cg56.add(p.columnRslt_col_169);
		p.cgRslt_cg56.add(p.columnRslt_col_170);
		p.RsltTable.addColumnGroup(p.cgRslt_cg56);
		p.cgRslt_cg57.add(p.columnRslt_col_171);
		p.cgRslt_cg57.add(p.columnRslt_col_172);
		p.cgRslt_cg57.add(p.columnRslt_col_173);
		p.RsltTable.addColumnGroup(p.cgRslt_cg57);
		p.cgRslt_cg58.add(p.columnRslt_col_174);
		p.cgRslt_cg58.add(p.columnRslt_col_175);
		p.cgRslt_cg58.add(p.columnRslt_col_176);
		p.RsltTable.addColumnGroup(p.cgRslt_cg58);
		p.cgRslt_cg59.add(p.columnRslt_col_177);
		p.cgRslt_cg59.add(p.columnRslt_col_178);
		p.cgRslt_cg59.add(p.columnRslt_col_179);
		p.RsltTable.addColumnGroup(p.cgRslt_cg59);
		p.cgRslt_cg60.add(p.columnRslt_col_180);
		p.cgRslt_cg60.add(p.columnRslt_col_181);
		p.cgRslt_cg60.add(p.columnRslt_col_182);
		p.RsltTable.addColumnGroup(p.cgRslt_cg60);
		p.cgRslt_cg61.add(p.columnRslt_col_183);
		p.cgRslt_cg61.add(p.columnRslt_col_184);
		p.cgRslt_cg61.add(p.columnRslt_col_185);
		p.RsltTable.addColumnGroup(p.cgRslt_cg61);
		p.cgRslt_cg62.add(p.columnRslt_col_186);
		p.cgRslt_cg62.add(p.columnRslt_col_187);
		p.cgRslt_cg62.add(p.columnRslt_col_188);
		p.RsltTable.addColumnGroup(p.cgRslt_cg62);
		p.cgRslt_cg63.add(p.columnRslt_col_189);
		p.cgRslt_cg63.add(p.columnRslt_col_190);
		p.cgRslt_cg63.add(p.columnRslt_col_191);
		p.RsltTable.addColumnGroup(p.cgRslt_cg63);
		p.cgRslt_cg64.add(p.columnRslt_col_192);
		p.cgRslt_cg64.add(p.columnRslt_col_193);
		p.cgRslt_cg64.add(p.columnRslt_col_194);
		p.RsltTable.addColumnGroup(p.cgRslt_cg64);
		p.cgRslt_cg65.add(p.columnRslt_col_195);
		p.cgRslt_cg65.add(p.columnRslt_col_196);
		p.cgRslt_cg65.add(p.columnRslt_col_197);
		p.RsltTable.addColumnGroup(p.cgRslt_cg65);
		p.cgRslt_cg66.add(p.columnRslt_col_198);
		p.cgRslt_cg66.add(p.columnRslt_col_199);
		p.cgRslt_cg66.add(p.columnRslt_col_200);
		p.RsltTable.addColumnGroup(p.cgRslt_cg66);
		p.cgRslt_cg67.add(p.columnRslt_col_201);
		p.cgRslt_cg67.add(p.columnRslt_col_202);
		p.cgRslt_cg67.add(p.columnRslt_col_203);
		p.RsltTable.addColumnGroup(p.cgRslt_cg67);
		p.cgRslt_cg68.add(p.columnRslt_col_204);
		p.cgRslt_cg68.add(p.columnRslt_col_205);
		p.cgRslt_cg68.add(p.columnRslt_col_206);
		p.RsltTable.addColumnGroup(p.cgRslt_cg68);
		p.cgRslt_cg69.add(p.columnRslt_col_207);
		p.cgRslt_cg69.add(p.columnRslt_col_208);
		p.cgRslt_cg69.add(p.columnRslt_col_209);
		p.RsltTable.addColumnGroup(p.cgRslt_cg69);
		p.cgRslt_cg70.add(p.columnRslt_col_210);
		p.cgRslt_cg70.add(p.columnRslt_col_211);
		p.cgRslt_cg70.add(p.columnRslt_col_212);
		p.RsltTable.addColumnGroup(p.cgRslt_cg70);
		p.cgRslt_cg71.add(p.columnRslt_col_213);
		p.cgRslt_cg71.add(p.columnRslt_col_214);
		p.cgRslt_cg71.add(p.columnRslt_col_215);
		p.RsltTable.addColumnGroup(p.cgRslt_cg71);
		p.cgRslt_cg72.add(p.columnRslt_col_216);
		p.cgRslt_cg72.add(p.columnRslt_col_217);
		p.cgRslt_cg72.add(p.columnRslt_col_218);
		p.RsltTable.addColumnGroup(p.cgRslt_cg72);
		p.cgRslt_cg73.add(p.columnRslt_col_219);
		p.cgRslt_cg73.add(p.columnRslt_col_220);
		p.cgRslt_cg73.add(p.columnRslt_col_221);
		p.RsltTable.addColumnGroup(p.cgRslt_cg73);
		p.cgRslt_cg74.add(p.columnRslt_col_222);
		p.cgRslt_cg74.add(p.columnRslt_col_223);
		p.cgRslt_cg74.add(p.columnRslt_col_224);
		p.RsltTable.addColumnGroup(p.cgRslt_cg74);
		p.cgRslt_cg75.add(p.columnRslt_col_225);
		p.cgRslt_cg75.add(p.columnRslt_col_226);
		p.cgRslt_cg75.add(p.columnRslt_col_227);
		p.RsltTable.addColumnGroup(p.cgRslt_cg75);
		p.cgRslt_cg76.add(p.columnRslt_col_228);
		p.cgRslt_cg76.add(p.columnRslt_col_229);
		p.cgRslt_cg76.add(p.columnRslt_col_230);
		p.RsltTable.addColumnGroup(p.cgRslt_cg76);
		p.cgRslt_cg77.add(p.columnRslt_col_231);
		p.cgRslt_cg77.add(p.columnRslt_col_232);
		p.cgRslt_cg77.add(p.columnRslt_col_233);
		p.RsltTable.addColumnGroup(p.cgRslt_cg77);
		p.cgRslt_cg78.add(p.columnRslt_col_234);
		p.cgRslt_cg78.add(p.columnRslt_col_235);
		p.cgRslt_cg78.add(p.columnRslt_col_236);
		p.RsltTable.addColumnGroup(p.cgRslt_cg78);
		p.cgRslt_cg79.add(p.columnRslt_col_237);
		p.cgRslt_cg79.add(p.columnRslt_col_238);
		p.cgRslt_cg79.add(p.columnRslt_col_239);
		p.RsltTable.addColumnGroup(p.cgRslt_cg79);
		p.cgRslt_cg80.add(p.columnRslt_col_240);
		p.cgRslt_cg80.add(p.columnRslt_col_241);
		p.cgRslt_cg80.add(p.columnRslt_col_242);
		p.RsltTable.addColumnGroup(p.cgRslt_cg80);
		p.cgRslt_cg81.add(p.columnRslt_col_243);
		p.cgRslt_cg81.add(p.columnRslt_col_244);
		p.cgRslt_cg81.add(p.columnRslt_col_245);
		p.RsltTable.addColumnGroup(p.cgRslt_cg81);
		p.cgRslt_cg82.add(p.columnRslt_col_246);
		p.cgRslt_cg82.add(p.columnRslt_col_247);
		p.cgRslt_cg82.add(p.columnRslt_col_248);
		p.RsltTable.addColumnGroup(p.cgRslt_cg82);
		p.cgRslt_cg83.add(p.columnRslt_col_249);
		p.cgRslt_cg83.add(p.columnRslt_col_250);
		p.cgRslt_cg83.add(p.columnRslt_col_251);
		p.RsltTable.addColumnGroup(p.cgRslt_cg83);
		p.cgRslt_cg84.add(p.columnRslt_col_252);
		p.cgRslt_cg84.add(p.columnRslt_col_253);
		p.cgRslt_cg84.add(p.columnRslt_col_254);
		p.RsltTable.addColumnGroup(p.cgRslt_cg84);
		p.cgRslt_cg85.add(p.columnRslt_col_255);
		p.cgRslt_cg85.add(p.columnRslt_col_256);
		p.cgRslt_cg85.add(p.columnRslt_col_257);
		p.RsltTable.addColumnGroup(p.cgRslt_cg85);
		p.cgRslt_cg86.add(p.columnRslt_col_258);
		p.cgRslt_cg86.add(p.columnRslt_col_259);
		p.cgRslt_cg86.add(p.columnRslt_col_260);
		p.RsltTable.addColumnGroup(p.cgRslt_cg86);
		p.cgRslt_cg87.add(p.columnRslt_col_261);
		p.cgRslt_cg87.add(p.columnRslt_col_262);
		p.cgRslt_cg87.add(p.columnRslt_col_263);
		p.RsltTable.addColumnGroup(p.cgRslt_cg87);
		p.cgRslt_cg88.add(p.columnRslt_col_264);
		p.cgRslt_cg88.add(p.columnRslt_col_265);
		p.cgRslt_cg88.add(p.columnRslt_col_266);
		p.RsltTable.addColumnGroup(p.cgRslt_cg88);
		p.cgRslt_cg89.add(p.columnRslt_col_267);
		p.cgRslt_cg89.add(p.columnRslt_col_268);
		p.cgRslt_cg89.add(p.columnRslt_col_269);
		p.RsltTable.addColumnGroup(p.cgRslt_cg89);
		p.cgRslt_cg90.add(p.columnRslt_col_270);
		p.cgRslt_cg90.add(p.columnRslt_col_271);
		p.cgRslt_cg90.add(p.columnRslt_col_272);
		p.RsltTable.addColumnGroup(p.cgRslt_cg90);
		p.cgRslt_cg91.add(p.columnRslt_col_273);
		p.cgRslt_cg91.add(p.columnRslt_col_274);
		p.cgRslt_cg91.add(p.columnRslt_col_275);
		p.RsltTable.addColumnGroup(p.cgRslt_cg91);
		p.cgRslt_cg92.add(p.columnRslt_col_276);
		p.cgRslt_cg92.add(p.columnRslt_col_277);
		p.cgRslt_cg92.add(p.columnRslt_col_278);
		p.RsltTable.addColumnGroup(p.cgRslt_cg92);
		p.cgRslt_cg93.add(p.columnRslt_col_279);
		p.cgRslt_cg93.add(p.columnRslt_col_280);
		p.cgRslt_cg93.add(p.columnRslt_col_281);
		p.RsltTable.addColumnGroup(p.cgRslt_cg93);
		p.cgRslt_cg94.add(p.columnRslt_col_282);
		p.cgRslt_cg94.add(p.columnRslt_col_283);
		p.cgRslt_cg94.add(p.columnRslt_col_284);
		p.RsltTable.addColumnGroup(p.cgRslt_cg94);
		p.cgRslt_cg95.add(p.columnRslt_col_285);
		p.cgRslt_cg95.add(p.columnRslt_col_286);
		p.cgRslt_cg95.add(p.columnRslt_col_287);
		p.RsltTable.addColumnGroup(p.cgRslt_cg95);
		p.cgRslt_cg96.add(p.columnRslt_col_288);
		p.cgRslt_cg96.add(p.columnRslt_col_289);
		p.cgRslt_cg96.add(p.columnRslt_col_290);
		p.RsltTable.addColumnGroup(p.cgRslt_cg96);
		p.cgRslt_cg97.add(p.columnRslt_col_291);
		p.cgRslt_cg97.add(p.columnRslt_col_292);
		p.cgRslt_cg97.add(p.columnRslt_col_293);
		p.RsltTable.addColumnGroup(p.cgRslt_cg97);
		p.cgRslt_cg98.add(p.columnRslt_col_294);
		p.cgRslt_cg98.add(p.columnRslt_col_295);
		p.cgRslt_cg98.add(p.columnRslt_col_296);
		p.RsltTable.addColumnGroup(p.cgRslt_cg98);
		p.cgRslt_cg99.add(p.columnRslt_col_297);
		p.cgRslt_cg99.add(p.columnRslt_col_298);
		p.cgRslt_cg99.add(p.columnRslt_col_299);
		p.RsltTable.addColumnGroup(p.cgRslt_cg99);
		p.RsltTable.addColumnGroup(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd1.getListConfig().setPutter(getCnd_itm_grp_cd1_ListPutter());
		Cnd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd2.getListConfig().setPutter(getCnd_itm_grp_cd2_ListPutter());
		Cnd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd3.getListConfig().setPutter(getCnd_itm_grp_cd3_ListPutter());
		Cnd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd4.getListConfig().setPutter(getCnd_itm_grp_cd4_ListPutter());
		Cnd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd5.getListConfig().setPutter(getCnd_itm_grp_cd5_ListPutter());
		Cnd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd6.getListConfig().setPutter(getCnd_itm_grp_cd6_ListPutter());
		Cnd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd7.getListConfig().setPutter(getCnd_itm_grp_cd7_ListPutter());
		Cnd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd8.getListConfig().setPutter(getCnd_itm_grp_cd8_ListPutter());
		Cnd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd9.getListConfig().setPutter(getCnd_itm_grp_cd9_ListPutter());
		Cnd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd10.getListConfig().setPutter(getCnd_itm_grp_cd10_ListPutter());
		DelCnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_calc_grp_cd.getListConfig().setPutter(getDelCnd_calc_grp_cd_ListPutter());
		DelCnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_wg_cd.getListConfig().setPutter(getDelCnd_wg_cd_ListPutter());
		DelCnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_site_cd.getListConfig().setPutter(getDelCnd_site_cd_ListPutter());
		DelCnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_loc_cd.getListConfig().setPutter(getDelCnd_loc_cd_ListPutter());
		columnRslt_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_grp_cd.getListConfig().setPutter(getRslt_calc_grp_cd_ListPutter());
		columnRslt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wg_cd.getListConfig().setPutter(getRslt_wg_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_typ.getListConfig().setPutter(getRslt_itm_typ_ListPutter());
		columnRslt_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_typ_d_cd.getListConfig().setPutter(getRslt_itm_typ_d_cd_ListPutter());
		columnRslt_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_jnl_cd.getListConfig().setPutter(getRslt_itm_jnl_cd_ListPutter());
		columnRslt_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
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
	 * この画面を[DEL_BULK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_BULKStatus() {
		status = DEL_BULK;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_BULK.equals(status)) {
			setDEL_BULKStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [DelCnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [DelCnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [DelCnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [DelCnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
		return lp;
	}
	 
	/**
	 * [Rslt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
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
	 * [Rslt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTypD");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Rslt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_itm_grp_cd1) return getCnd_itm_grp_cd1(row, info);
		if(combo == Cnd_itm_grp_cd2) return getCnd_itm_grp_cd2(row, info);
		if(combo == Cnd_itm_grp_cd3) return getCnd_itm_grp_cd3(row, info);
		if(combo == Cnd_itm_grp_cd4) return getCnd_itm_grp_cd4(row, info);
		if(combo == Cnd_itm_grp_cd5) return getCnd_itm_grp_cd5(row, info);
		if(combo == Cnd_itm_grp_cd6) return getCnd_itm_grp_cd6(row, info);
		if(combo == Cnd_itm_grp_cd7) return getCnd_itm_grp_cd7(row, info);
		if(combo == Cnd_itm_grp_cd8) return getCnd_itm_grp_cd8(row, info);
		if(combo == Cnd_itm_grp_cd9) return getCnd_itm_grp_cd9(row, info);
		if(combo == Cnd_itm_grp_cd10) return getCnd_itm_grp_cd10(row, info);
		if(combo == DelCnd_calc_grp_cd) return getDelCnd_calc_grp_cd(row, info);
		if(combo == DelCnd_wg_cd) return getDelCnd_wg_cd(row, info);
		if(combo == DelCnd_site_cd) return getDelCnd_site_cd(row, info);
		if(combo == DelCnd_loc_cd) return getDelCnd_loc_cd(row, info);
		if(combo == columnRslt_calc_grp_cd) return getRslt_calc_grp_cd(row, info);
		if(combo == columnRslt_wg_cd) return getRslt_wg_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_itm_typ) return getRslt_itm_typ(row, info);
		if(combo == columnRslt_itm_typ_d_cd) return getRslt_itm_typ_d_cd(row, info);
		if(combo == columnRslt_itm_jnl_cd) return getRslt_itm_jnl_cd(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
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
		else if (ap == Btn_open_MGBBP0030) doBtn_open_MGBBP0030(info);
		else if (ap == Btn_open_MGBBP0040) doBtn_open_MGBBP0040(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_bulk) doBtn_del_bulk(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0040(MCEventInfo info);

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
	 * [Btn]パネルの[del_bulk]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_bulk(MCEventInfo info);

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
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_oper_act_no) return doCnd_oper_act_no_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_itm_grp_cd1) return doCnd_itm_grp_cd1_VC(info);
		if (vc == Cnd_itm_grp_nm1) return doCnd_itm_grp_nm1_VC(info);
		if (vc == Cnd_itm_grp_cd2) return doCnd_itm_grp_cd2_VC(info);
		if (vc == Cnd_itm_grp_nm2) return doCnd_itm_grp_nm2_VC(info);
		if (vc == Cnd_itm_grp_cd3) return doCnd_itm_grp_cd3_VC(info);
		if (vc == Cnd_itm_grp_nm3) return doCnd_itm_grp_nm3_VC(info);
		if (vc == Cnd_itm_grp_cd4) return doCnd_itm_grp_cd4_VC(info);
		if (vc == Cnd_itm_grp_nm4) return doCnd_itm_grp_nm4_VC(info);
		if (vc == Cnd_itm_grp_cd5) return doCnd_itm_grp_cd5_VC(info);
		if (vc == Cnd_itm_grp_nm5) return doCnd_itm_grp_nm5_VC(info);
		if (vc == Cnd_itm_grp_cd6) return doCnd_itm_grp_cd6_VC(info);
		if (vc == Cnd_itm_grp_nm6) return doCnd_itm_grp_nm6_VC(info);
		if (vc == Cnd_itm_grp_cd7) return doCnd_itm_grp_cd7_VC(info);
		if (vc == Cnd_itm_grp_nm7) return doCnd_itm_grp_nm7_VC(info);
		if (vc == Cnd_itm_grp_cd8) return doCnd_itm_grp_cd8_VC(info);
		if (vc == Cnd_itm_grp_nm8) return doCnd_itm_grp_nm8_VC(info);
		if (vc == Cnd_itm_grp_cd9) return doCnd_itm_grp_cd9_VC(info);
		if (vc == Cnd_itm_grp_nm9) return doCnd_itm_grp_nm9_VC(info);
		if (vc == Cnd_itm_grp_cd10) return doCnd_itm_grp_cd10_VC(info);
		if (vc == Cnd_itm_grp_nm10) return doCnd_itm_grp_nm10_VC(info);
		if (vc == DelCnd_calc_grp_cd) return doDelCnd_calc_grp_cd_VC(info);
		if (vc == DelCnd_calc_grp_nm) return doDelCnd_calc_grp_nm_VC(info);
		if (vc == DelCnd_ym) return doDelCnd_ym_VC(info);
		if (vc == DelCnd_wg_cd) return doDelCnd_wg_cd_VC(info);
		if (vc == DelCnd_wg_nm) return doDelCnd_wg_nm_VC(info);
		if (vc == DelCnd_site_cd) return doDelCnd_site_cd_VC(info);
		if (vc == DelCnd_site_nm) return doDelCnd_site_nm_VC(info);
		if (vc == DelCnd_loc_cd) return doDelCnd_loc_cd_VC(info);
		if (vc == DelCnd_loc_nm) return doDelCnd_loc_nm_VC(info);
		if (vc == LPnl_disp_expns_grp) return doLPnl_disp_expns_grp_VC(info);
		if (vc == LPnl_disp_expns) return doLPnl_disp_expns_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_calc_grp_cd) return doRslt_calc_grp_cd_VC(info);
		if (vc == columnRslt_calc_grp_nm) return doRslt_calc_grp_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_mfg_act_no) return doRslt_mfg_act_no_VC(info);
		if (vc == columnRslt_oper_act_no) return doRslt_oper_act_no_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_tgt_flg) return doRslt_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_wip_per) return doRslt_wip_per_VC(info);
		if (vc == columnRslt_ttl) return doRslt_ttl_VC(info);
		if (vc == columnRslt_ttl_wip_amt) return doRslt_ttl_wip_amt_VC(info);
		if (vc == columnRslt_ttl_inpt_amt) return doRslt_ttl_inpt_amt_VC(info);
		if (vc == columnRslt_col_000) return doRslt_col_000_VC(info);
		if (vc == columnRslt_col_001) return doRslt_col_001_VC(info);
		if (vc == columnRslt_col_002) return doRslt_col_002_VC(info);
		if (vc == columnRslt_col_003) return doRslt_col_003_VC(info);
		if (vc == columnRslt_col_004) return doRslt_col_004_VC(info);
		if (vc == columnRslt_col_005) return doRslt_col_005_VC(info);
		if (vc == columnRslt_col_006) return doRslt_col_006_VC(info);
		if (vc == columnRslt_col_007) return doRslt_col_007_VC(info);
		if (vc == columnRslt_col_008) return doRslt_col_008_VC(info);
		if (vc == columnRslt_col_009) return doRslt_col_009_VC(info);
		if (vc == columnRslt_col_010) return doRslt_col_010_VC(info);
		if (vc == columnRslt_col_011) return doRslt_col_011_VC(info);
		if (vc == columnRslt_col_012) return doRslt_col_012_VC(info);
		if (vc == columnRslt_col_013) return doRslt_col_013_VC(info);
		if (vc == columnRslt_col_014) return doRslt_col_014_VC(info);
		if (vc == columnRslt_col_015) return doRslt_col_015_VC(info);
		if (vc == columnRslt_col_016) return doRslt_col_016_VC(info);
		if (vc == columnRslt_col_017) return doRslt_col_017_VC(info);
		if (vc == columnRslt_col_018) return doRslt_col_018_VC(info);
		if (vc == columnRslt_col_019) return doRslt_col_019_VC(info);
		if (vc == columnRslt_col_020) return doRslt_col_020_VC(info);
		if (vc == columnRslt_col_021) return doRslt_col_021_VC(info);
		if (vc == columnRslt_col_022) return doRslt_col_022_VC(info);
		if (vc == columnRslt_col_023) return doRslt_col_023_VC(info);
		if (vc == columnRslt_col_024) return doRslt_col_024_VC(info);
		if (vc == columnRslt_col_025) return doRslt_col_025_VC(info);
		if (vc == columnRslt_col_026) return doRslt_col_026_VC(info);
		if (vc == columnRslt_col_027) return doRslt_col_027_VC(info);
		if (vc == columnRslt_col_028) return doRslt_col_028_VC(info);
		if (vc == columnRslt_col_029) return doRslt_col_029_VC(info);
		if (vc == columnRslt_col_030) return doRslt_col_030_VC(info);
		if (vc == columnRslt_col_031) return doRslt_col_031_VC(info);
		if (vc == columnRslt_col_032) return doRslt_col_032_VC(info);
		if (vc == columnRslt_col_033) return doRslt_col_033_VC(info);
		if (vc == columnRslt_col_034) return doRslt_col_034_VC(info);
		if (vc == columnRslt_col_035) return doRslt_col_035_VC(info);
		if (vc == columnRslt_col_036) return doRslt_col_036_VC(info);
		if (vc == columnRslt_col_037) return doRslt_col_037_VC(info);
		if (vc == columnRslt_col_038) return doRslt_col_038_VC(info);
		if (vc == columnRslt_col_039) return doRslt_col_039_VC(info);
		if (vc == columnRslt_col_040) return doRslt_col_040_VC(info);
		if (vc == columnRslt_col_041) return doRslt_col_041_VC(info);
		if (vc == columnRslt_col_042) return doRslt_col_042_VC(info);
		if (vc == columnRslt_col_043) return doRslt_col_043_VC(info);
		if (vc == columnRslt_col_044) return doRslt_col_044_VC(info);
		if (vc == columnRslt_col_045) return doRslt_col_045_VC(info);
		if (vc == columnRslt_col_046) return doRslt_col_046_VC(info);
		if (vc == columnRslt_col_047) return doRslt_col_047_VC(info);
		if (vc == columnRslt_col_048) return doRslt_col_048_VC(info);
		if (vc == columnRslt_col_049) return doRslt_col_049_VC(info);
		if (vc == columnRslt_col_050) return doRslt_col_050_VC(info);
		if (vc == columnRslt_col_051) return doRslt_col_051_VC(info);
		if (vc == columnRslt_col_052) return doRslt_col_052_VC(info);
		if (vc == columnRslt_col_053) return doRslt_col_053_VC(info);
		if (vc == columnRslt_col_054) return doRslt_col_054_VC(info);
		if (vc == columnRslt_col_055) return doRslt_col_055_VC(info);
		if (vc == columnRslt_col_056) return doRslt_col_056_VC(info);
		if (vc == columnRslt_col_057) return doRslt_col_057_VC(info);
		if (vc == columnRslt_col_058) return doRslt_col_058_VC(info);
		if (vc == columnRslt_col_059) return doRslt_col_059_VC(info);
		if (vc == columnRslt_col_060) return doRslt_col_060_VC(info);
		if (vc == columnRslt_col_061) return doRslt_col_061_VC(info);
		if (vc == columnRslt_col_062) return doRslt_col_062_VC(info);
		if (vc == columnRslt_col_063) return doRslt_col_063_VC(info);
		if (vc == columnRslt_col_064) return doRslt_col_064_VC(info);
		if (vc == columnRslt_col_065) return doRslt_col_065_VC(info);
		if (vc == columnRslt_col_066) return doRslt_col_066_VC(info);
		if (vc == columnRslt_col_067) return doRslt_col_067_VC(info);
		if (vc == columnRslt_col_068) return doRslt_col_068_VC(info);
		if (vc == columnRslt_col_069) return doRslt_col_069_VC(info);
		if (vc == columnRslt_col_070) return doRslt_col_070_VC(info);
		if (vc == columnRslt_col_071) return doRslt_col_071_VC(info);
		if (vc == columnRslt_col_072) return doRslt_col_072_VC(info);
		if (vc == columnRslt_col_073) return doRslt_col_073_VC(info);
		if (vc == columnRslt_col_074) return doRslt_col_074_VC(info);
		if (vc == columnRslt_col_075) return doRslt_col_075_VC(info);
		if (vc == columnRslt_col_076) return doRslt_col_076_VC(info);
		if (vc == columnRslt_col_077) return doRslt_col_077_VC(info);
		if (vc == columnRslt_col_078) return doRslt_col_078_VC(info);
		if (vc == columnRslt_col_079) return doRslt_col_079_VC(info);
		if (vc == columnRslt_col_080) return doRslt_col_080_VC(info);
		if (vc == columnRslt_col_081) return doRslt_col_081_VC(info);
		if (vc == columnRslt_col_082) return doRslt_col_082_VC(info);
		if (vc == columnRslt_col_083) return doRslt_col_083_VC(info);
		if (vc == columnRslt_col_084) return doRslt_col_084_VC(info);
		if (vc == columnRslt_col_085) return doRslt_col_085_VC(info);
		if (vc == columnRslt_col_086) return doRslt_col_086_VC(info);
		if (vc == columnRslt_col_087) return doRslt_col_087_VC(info);
		if (vc == columnRslt_col_088) return doRslt_col_088_VC(info);
		if (vc == columnRslt_col_089) return doRslt_col_089_VC(info);
		if (vc == columnRslt_col_090) return doRslt_col_090_VC(info);
		if (vc == columnRslt_col_091) return doRslt_col_091_VC(info);
		if (vc == columnRslt_col_092) return doRslt_col_092_VC(info);
		if (vc == columnRslt_col_093) return doRslt_col_093_VC(info);
		if (vc == columnRslt_col_094) return doRslt_col_094_VC(info);
		if (vc == columnRslt_col_095) return doRslt_col_095_VC(info);
		if (vc == columnRslt_col_096) return doRslt_col_096_VC(info);
		if (vc == columnRslt_col_097) return doRslt_col_097_VC(info);
		if (vc == columnRslt_col_098) return doRslt_col_098_VC(info);
		if (vc == columnRslt_col_099) return doRslt_col_099_VC(info);
		if (vc == columnRslt_col_100) return doRslt_col_100_VC(info);
		if (vc == columnRslt_col_101) return doRslt_col_101_VC(info);
		if (vc == columnRslt_col_102) return doRslt_col_102_VC(info);
		if (vc == columnRslt_col_103) return doRslt_col_103_VC(info);
		if (vc == columnRslt_col_104) return doRslt_col_104_VC(info);
		if (vc == columnRslt_col_105) return doRslt_col_105_VC(info);
		if (vc == columnRslt_col_106) return doRslt_col_106_VC(info);
		if (vc == columnRslt_col_107) return doRslt_col_107_VC(info);
		if (vc == columnRslt_col_108) return doRslt_col_108_VC(info);
		if (vc == columnRslt_col_109) return doRslt_col_109_VC(info);
		if (vc == columnRslt_col_110) return doRslt_col_110_VC(info);
		if (vc == columnRslt_col_111) return doRslt_col_111_VC(info);
		if (vc == columnRslt_col_112) return doRslt_col_112_VC(info);
		if (vc == columnRslt_col_113) return doRslt_col_113_VC(info);
		if (vc == columnRslt_col_114) return doRslt_col_114_VC(info);
		if (vc == columnRslt_col_115) return doRslt_col_115_VC(info);
		if (vc == columnRslt_col_116) return doRslt_col_116_VC(info);
		if (vc == columnRslt_col_117) return doRslt_col_117_VC(info);
		if (vc == columnRslt_col_118) return doRslt_col_118_VC(info);
		if (vc == columnRslt_col_119) return doRslt_col_119_VC(info);
		if (vc == columnRslt_col_120) return doRslt_col_120_VC(info);
		if (vc == columnRslt_col_121) return doRslt_col_121_VC(info);
		if (vc == columnRslt_col_122) return doRslt_col_122_VC(info);
		if (vc == columnRslt_col_123) return doRslt_col_123_VC(info);
		if (vc == columnRslt_col_124) return doRslt_col_124_VC(info);
		if (vc == columnRslt_col_125) return doRslt_col_125_VC(info);
		if (vc == columnRslt_col_126) return doRslt_col_126_VC(info);
		if (vc == columnRslt_col_127) return doRslt_col_127_VC(info);
		if (vc == columnRslt_col_128) return doRslt_col_128_VC(info);
		if (vc == columnRslt_col_129) return doRslt_col_129_VC(info);
		if (vc == columnRslt_col_130) return doRslt_col_130_VC(info);
		if (vc == columnRslt_col_131) return doRslt_col_131_VC(info);
		if (vc == columnRslt_col_132) return doRslt_col_132_VC(info);
		if (vc == columnRslt_col_133) return doRslt_col_133_VC(info);
		if (vc == columnRslt_col_134) return doRslt_col_134_VC(info);
		if (vc == columnRslt_col_135) return doRslt_col_135_VC(info);
		if (vc == columnRslt_col_136) return doRslt_col_136_VC(info);
		if (vc == columnRslt_col_137) return doRslt_col_137_VC(info);
		if (vc == columnRslt_col_138) return doRslt_col_138_VC(info);
		if (vc == columnRslt_col_139) return doRslt_col_139_VC(info);
		if (vc == columnRslt_col_140) return doRslt_col_140_VC(info);
		if (vc == columnRslt_col_141) return doRslt_col_141_VC(info);
		if (vc == columnRslt_col_142) return doRslt_col_142_VC(info);
		if (vc == columnRslt_col_143) return doRslt_col_143_VC(info);
		if (vc == columnRslt_col_144) return doRslt_col_144_VC(info);
		if (vc == columnRslt_col_145) return doRslt_col_145_VC(info);
		if (vc == columnRslt_col_146) return doRslt_col_146_VC(info);
		if (vc == columnRslt_col_147) return doRslt_col_147_VC(info);
		if (vc == columnRslt_col_148) return doRslt_col_148_VC(info);
		if (vc == columnRslt_col_149) return doRslt_col_149_VC(info);
		if (vc == columnRslt_col_150) return doRslt_col_150_VC(info);
		if (vc == columnRslt_col_151) return doRslt_col_151_VC(info);
		if (vc == columnRslt_col_152) return doRslt_col_152_VC(info);
		if (vc == columnRslt_col_153) return doRslt_col_153_VC(info);
		if (vc == columnRslt_col_154) return doRslt_col_154_VC(info);
		if (vc == columnRslt_col_155) return doRslt_col_155_VC(info);
		if (vc == columnRslt_col_156) return doRslt_col_156_VC(info);
		if (vc == columnRslt_col_157) return doRslt_col_157_VC(info);
		if (vc == columnRslt_col_158) return doRslt_col_158_VC(info);
		if (vc == columnRslt_col_159) return doRslt_col_159_VC(info);
		if (vc == columnRslt_col_160) return doRslt_col_160_VC(info);
		if (vc == columnRslt_col_161) return doRslt_col_161_VC(info);
		if (vc == columnRslt_col_162) return doRslt_col_162_VC(info);
		if (vc == columnRslt_col_163) return doRslt_col_163_VC(info);
		if (vc == columnRslt_col_164) return doRslt_col_164_VC(info);
		if (vc == columnRslt_col_165) return doRslt_col_165_VC(info);
		if (vc == columnRslt_col_166) return doRslt_col_166_VC(info);
		if (vc == columnRslt_col_167) return doRslt_col_167_VC(info);
		if (vc == columnRslt_col_168) return doRslt_col_168_VC(info);
		if (vc == columnRslt_col_169) return doRslt_col_169_VC(info);
		if (vc == columnRslt_col_170) return doRslt_col_170_VC(info);
		if (vc == columnRslt_col_171) return doRslt_col_171_VC(info);
		if (vc == columnRslt_col_172) return doRslt_col_172_VC(info);
		if (vc == columnRslt_col_173) return doRslt_col_173_VC(info);
		if (vc == columnRslt_col_174) return doRslt_col_174_VC(info);
		if (vc == columnRslt_col_175) return doRslt_col_175_VC(info);
		if (vc == columnRslt_col_176) return doRslt_col_176_VC(info);
		if (vc == columnRslt_col_177) return doRslt_col_177_VC(info);
		if (vc == columnRslt_col_178) return doRslt_col_178_VC(info);
		if (vc == columnRslt_col_179) return doRslt_col_179_VC(info);
		if (vc == columnRslt_col_180) return doRslt_col_180_VC(info);
		if (vc == columnRslt_col_181) return doRslt_col_181_VC(info);
		if (vc == columnRslt_col_182) return doRslt_col_182_VC(info);
		if (vc == columnRslt_col_183) return doRslt_col_183_VC(info);
		if (vc == columnRslt_col_184) return doRslt_col_184_VC(info);
		if (vc == columnRslt_col_185) return doRslt_col_185_VC(info);
		if (vc == columnRslt_col_186) return doRslt_col_186_VC(info);
		if (vc == columnRslt_col_187) return doRslt_col_187_VC(info);
		if (vc == columnRslt_col_188) return doRslt_col_188_VC(info);
		if (vc == columnRslt_col_189) return doRslt_col_189_VC(info);
		if (vc == columnRslt_col_190) return doRslt_col_190_VC(info);
		if (vc == columnRslt_col_191) return doRslt_col_191_VC(info);
		if (vc == columnRslt_col_192) return doRslt_col_192_VC(info);
		if (vc == columnRslt_col_193) return doRslt_col_193_VC(info);
		if (vc == columnRslt_col_194) return doRslt_col_194_VC(info);
		if (vc == columnRslt_col_195) return doRslt_col_195_VC(info);
		if (vc == columnRslt_col_196) return doRslt_col_196_VC(info);
		if (vc == columnRslt_col_197) return doRslt_col_197_VC(info);
		if (vc == columnRslt_col_198) return doRslt_col_198_VC(info);
		if (vc == columnRslt_col_199) return doRslt_col_199_VC(info);
		if (vc == columnRslt_col_200) return doRslt_col_200_VC(info);
		if (vc == columnRslt_col_201) return doRslt_col_201_VC(info);
		if (vc == columnRslt_col_202) return doRslt_col_202_VC(info);
		if (vc == columnRslt_col_203) return doRslt_col_203_VC(info);
		if (vc == columnRslt_col_204) return doRslt_col_204_VC(info);
		if (vc == columnRslt_col_205) return doRslt_col_205_VC(info);
		if (vc == columnRslt_col_206) return doRslt_col_206_VC(info);
		if (vc == columnRslt_col_207) return doRslt_col_207_VC(info);
		if (vc == columnRslt_col_208) return doRslt_col_208_VC(info);
		if (vc == columnRslt_col_209) return doRslt_col_209_VC(info);
		if (vc == columnRslt_col_210) return doRslt_col_210_VC(info);
		if (vc == columnRslt_col_211) return doRslt_col_211_VC(info);
		if (vc == columnRslt_col_212) return doRslt_col_212_VC(info);
		if (vc == columnRslt_col_213) return doRslt_col_213_VC(info);
		if (vc == columnRslt_col_214) return doRslt_col_214_VC(info);
		if (vc == columnRslt_col_215) return doRslt_col_215_VC(info);
		if (vc == columnRslt_col_216) return doRslt_col_216_VC(info);
		if (vc == columnRslt_col_217) return doRslt_col_217_VC(info);
		if (vc == columnRslt_col_218) return doRslt_col_218_VC(info);
		if (vc == columnRslt_col_219) return doRslt_col_219_VC(info);
		if (vc == columnRslt_col_220) return doRslt_col_220_VC(info);
		if (vc == columnRslt_col_221) return doRslt_col_221_VC(info);
		if (vc == columnRslt_col_222) return doRslt_col_222_VC(info);
		if (vc == columnRslt_col_223) return doRslt_col_223_VC(info);
		if (vc == columnRslt_col_224) return doRslt_col_224_VC(info);
		if (vc == columnRslt_col_225) return doRslt_col_225_VC(info);
		if (vc == columnRslt_col_226) return doRslt_col_226_VC(info);
		if (vc == columnRslt_col_227) return doRslt_col_227_VC(info);
		if (vc == columnRslt_col_228) return doRslt_col_228_VC(info);
		if (vc == columnRslt_col_229) return doRslt_col_229_VC(info);
		if (vc == columnRslt_col_230) return doRslt_col_230_VC(info);
		if (vc == columnRslt_col_231) return doRslt_col_231_VC(info);
		if (vc == columnRslt_col_232) return doRslt_col_232_VC(info);
		if (vc == columnRslt_col_233) return doRslt_col_233_VC(info);
		if (vc == columnRslt_col_234) return doRslt_col_234_VC(info);
		if (vc == columnRslt_col_235) return doRslt_col_235_VC(info);
		if (vc == columnRslt_col_236) return doRslt_col_236_VC(info);
		if (vc == columnRslt_col_237) return doRslt_col_237_VC(info);
		if (vc == columnRslt_col_238) return doRslt_col_238_VC(info);
		if (vc == columnRslt_col_239) return doRslt_col_239_VC(info);
		if (vc == columnRslt_col_240) return doRslt_col_240_VC(info);
		if (vc == columnRslt_col_241) return doRslt_col_241_VC(info);
		if (vc == columnRslt_col_242) return doRslt_col_242_VC(info);
		if (vc == columnRslt_col_243) return doRslt_col_243_VC(info);
		if (vc == columnRslt_col_244) return doRslt_col_244_VC(info);
		if (vc == columnRslt_col_245) return doRslt_col_245_VC(info);
		if (vc == columnRslt_col_246) return doRslt_col_246_VC(info);
		if (vc == columnRslt_col_247) return doRslt_col_247_VC(info);
		if (vc == columnRslt_col_248) return doRslt_col_248_VC(info);
		if (vc == columnRslt_col_249) return doRslt_col_249_VC(info);
		if (vc == columnRslt_col_250) return doRslt_col_250_VC(info);
		if (vc == columnRslt_col_251) return doRslt_col_251_VC(info);
		if (vc == columnRslt_col_252) return doRslt_col_252_VC(info);
		if (vc == columnRslt_col_253) return doRslt_col_253_VC(info);
		if (vc == columnRslt_col_254) return doRslt_col_254_VC(info);
		if (vc == columnRslt_col_255) return doRslt_col_255_VC(info);
		if (vc == columnRslt_col_256) return doRslt_col_256_VC(info);
		if (vc == columnRslt_col_257) return doRslt_col_257_VC(info);
		if (vc == columnRslt_col_258) return doRslt_col_258_VC(info);
		if (vc == columnRslt_col_259) return doRslt_col_259_VC(info);
		if (vc == columnRslt_col_260) return doRslt_col_260_VC(info);
		if (vc == columnRslt_col_261) return doRslt_col_261_VC(info);
		if (vc == columnRslt_col_262) return doRslt_col_262_VC(info);
		if (vc == columnRslt_col_263) return doRslt_col_263_VC(info);
		if (vc == columnRslt_col_264) return doRslt_col_264_VC(info);
		if (vc == columnRslt_col_265) return doRslt_col_265_VC(info);
		if (vc == columnRslt_col_266) return doRslt_col_266_VC(info);
		if (vc == columnRslt_col_267) return doRslt_col_267_VC(info);
		if (vc == columnRslt_col_268) return doRslt_col_268_VC(info);
		if (vc == columnRslt_col_269) return doRslt_col_269_VC(info);
		if (vc == columnRslt_col_270) return doRslt_col_270_VC(info);
		if (vc == columnRslt_col_271) return doRslt_col_271_VC(info);
		if (vc == columnRslt_col_272) return doRslt_col_272_VC(info);
		if (vc == columnRslt_col_273) return doRslt_col_273_VC(info);
		if (vc == columnRslt_col_274) return doRslt_col_274_VC(info);
		if (vc == columnRslt_col_275) return doRslt_col_275_VC(info);
		if (vc == columnRslt_col_276) return doRslt_col_276_VC(info);
		if (vc == columnRslt_col_277) return doRslt_col_277_VC(info);
		if (vc == columnRslt_col_278) return doRslt_col_278_VC(info);
		if (vc == columnRslt_col_279) return doRslt_col_279_VC(info);
		if (vc == columnRslt_col_280) return doRslt_col_280_VC(info);
		if (vc == columnRslt_col_281) return doRslt_col_281_VC(info);
		if (vc == columnRslt_col_282) return doRslt_col_282_VC(info);
		if (vc == columnRslt_col_283) return doRslt_col_283_VC(info);
		if (vc == columnRslt_col_284) return doRslt_col_284_VC(info);
		if (vc == columnRslt_col_285) return doRslt_col_285_VC(info);
		if (vc == columnRslt_col_286) return doRslt_col_286_VC(info);
		if (vc == columnRslt_col_287) return doRslt_col_287_VC(info);
		if (vc == columnRslt_col_288) return doRslt_col_288_VC(info);
		if (vc == columnRslt_col_289) return doRslt_col_289_VC(info);
		if (vc == columnRslt_col_290) return doRslt_col_290_VC(info);
		if (vc == columnRslt_col_291) return doRslt_col_291_VC(info);
		if (vc == columnRslt_col_292) return doRslt_col_292_VC(info);
		if (vc == columnRslt_col_293) return doRslt_col_293_VC(info);
		if (vc == columnRslt_col_294) return doRslt_col_294_VC(info);
		if (vc == columnRslt_col_295) return doRslt_col_295_VC(info);
		if (vc == columnRslt_col_296) return doRslt_col_296_VC(info);
		if (vc == columnRslt_col_297) return doRslt_col_297_VC(info);
		if (vc == columnRslt_col_298) return doRslt_col_298_VC(info);
		if (vc == columnRslt_col_299) return doRslt_col_299_VC(info);
		if (vc == columnRslt_st_wip_key) return doRslt_st_wip_key_VC(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_expns]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_tgt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wip_per]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wip_per_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl_wip_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_wip_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl_inpt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_inpt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_100]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_100_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_101]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_101_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_102]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_102_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_103]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_103_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_104]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_104_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_105]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_105_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_106]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_106_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_107]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_107_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_108]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_108_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_109]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_109_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_110]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_110_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_111]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_111_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_112]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_112_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_113]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_113_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_114]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_114_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_115]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_115_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_116]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_116_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_117]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_117_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_118]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_118_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_119]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_119_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_120]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_120_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_121]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_121_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_122]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_122_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_123]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_123_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_124]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_124_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_125]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_125_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_126]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_126_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_127]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_127_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_128]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_128_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_129]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_129_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_130]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_130_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_131]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_131_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_132]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_132_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_133]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_133_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_134]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_134_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_135]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_135_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_136]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_136_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_137]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_137_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_138]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_138_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_139]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_139_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_140]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_140_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_141]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_141_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_142]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_142_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_143]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_143_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_144]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_144_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_145]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_145_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_146]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_146_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_147]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_147_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_148]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_148_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_149]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_149_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_150]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_150_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_151]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_151_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_152]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_152_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_153]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_153_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_154]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_154_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_155]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_155_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_156]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_156_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_157]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_157_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_158]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_158_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_159]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_159_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_160]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_160_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_161]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_161_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_162]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_162_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_163]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_163_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_164]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_164_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_165]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_165_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_166]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_166_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_167]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_167_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_168]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_168_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_169]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_169_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_170]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_170_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_171]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_171_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_172]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_172_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_173]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_173_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_174]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_174_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_175]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_175_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_176]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_176_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_177]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_177_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_178]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_178_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_179]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_179_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_180]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_180_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_181]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_181_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_182]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_182_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_183]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_183_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_184]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_184_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_185]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_185_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_186]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_186_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_187]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_187_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_188]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_188_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_189]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_189_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_190]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_190_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_191]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_191_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_192]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_192_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_193]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_193_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_194]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_194_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_195]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_195_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_196]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_196_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_197]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_197_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_198]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_198_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_199]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_199_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_200]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_200_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_201]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_201_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_202]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_202_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_203]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_203_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_204]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_204_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_205]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_205_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_206]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_206_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_207]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_207_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_208]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_208_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_209]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_209_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_210]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_210_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_211]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_211_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_212]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_212_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_213]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_213_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_214]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_214_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_215]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_215_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_216]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_216_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_217]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_217_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_218]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_218_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_219]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_219_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_220]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_220_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_221]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_221_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_222]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_222_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_223]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_223_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_224]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_224_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_225]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_225_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_226]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_226_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_227]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_227_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_228]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_228_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_229]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_229_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_230]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_230_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_231]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_231_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_232]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_232_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_233]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_233_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_234]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_234_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_235]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_235_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_236]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_236_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_237]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_237_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_238]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_238_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_239]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_239_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_240]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_240_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_241]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_241_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_242]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_242_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_243]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_243_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_244]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_244_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_245]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_245_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_246]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_246_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_247]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_247_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_248]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_248_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_249]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_249_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_250]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_250_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_251]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_251_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_252]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_252_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_253]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_253_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_254]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_254_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_255]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_255_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_256]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_256_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_257]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_257_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_258]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_258_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_259]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_259_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_260]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_260_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_261]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_261_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_262]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_262_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_263]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_263_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_264]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_264_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_265]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_265_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_266]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_266_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_267]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_267_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_268]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_268_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_269]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_269_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_270]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_270_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_271]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_271_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_272]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_272_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_273]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_273_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_274]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_274_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_275]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_275_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_276]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_276_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_277]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_277_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_278]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_278_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_279]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_279_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_280]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_280_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_281]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_281_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_282]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_282_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_283]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_283_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_284]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_284_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_285]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_285_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_286]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_286_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_287]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_287_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_288]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_288_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_289]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_289_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_290]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_290_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_291]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_291_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_292]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_292_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_293]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_293_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_294]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_294_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_295]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_295_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_296]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_296_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_297]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_297_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_298]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_298_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_299]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_299_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_wip_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_wip_key_VC(MCEventInfo info){
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
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_oper_act_no) doCnd_oper_act_no_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NC(info);
		else if (nc == DelCnd_calc_grp_cd) doDelCnd_calc_grp_cd_NC(info);
		else if (nc == DelCnd_calc_grp_nm) doDelCnd_calc_grp_nm_NC(info);
		else if (nc == DelCnd_ym) doDelCnd_ym_NC(info);
		else if (nc == DelCnd_wg_cd) doDelCnd_wg_cd_NC(info);
		else if (nc == DelCnd_wg_nm) doDelCnd_wg_nm_NC(info);
		else if (nc == DelCnd_site_cd) doDelCnd_site_cd_NC(info);
		else if (nc == DelCnd_site_nm) doDelCnd_site_nm_NC(info);
		else if (nc == DelCnd_loc_cd) doDelCnd_loc_cd_NC(info);
		else if (nc == DelCnd_loc_nm) doDelCnd_loc_nm_NC(info);
		else if (nc == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NC(info);
		else if (nc == LPnl_disp_expns) doLPnl_disp_expns_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NC(info);
		else if (nc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_mfg_act_no) doRslt_mfg_act_no_NC(info);
		else if (nc == columnRslt_oper_act_no) doRslt_oper_act_no_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_wip_per) doRslt_wip_per_NC(info);
		else if (nc == columnRslt_ttl) doRslt_ttl_NC(info);
		else if (nc == columnRslt_ttl_wip_amt) doRslt_ttl_wip_amt_NC(info);
		else if (nc == columnRslt_ttl_inpt_amt) doRslt_ttl_inpt_amt_NC(info);
		else if (nc == columnRslt_col_000) doRslt_col_000_NC(info);
		else if (nc == columnRslt_col_001) doRslt_col_001_NC(info);
		else if (nc == columnRslt_col_002) doRslt_col_002_NC(info);
		else if (nc == columnRslt_col_003) doRslt_col_003_NC(info);
		else if (nc == columnRslt_col_004) doRslt_col_004_NC(info);
		else if (nc == columnRslt_col_005) doRslt_col_005_NC(info);
		else if (nc == columnRslt_col_006) doRslt_col_006_NC(info);
		else if (nc == columnRslt_col_007) doRslt_col_007_NC(info);
		else if (nc == columnRslt_col_008) doRslt_col_008_NC(info);
		else if (nc == columnRslt_col_009) doRslt_col_009_NC(info);
		else if (nc == columnRslt_col_010) doRslt_col_010_NC(info);
		else if (nc == columnRslt_col_011) doRslt_col_011_NC(info);
		else if (nc == columnRslt_col_012) doRslt_col_012_NC(info);
		else if (nc == columnRslt_col_013) doRslt_col_013_NC(info);
		else if (nc == columnRslt_col_014) doRslt_col_014_NC(info);
		else if (nc == columnRslt_col_015) doRslt_col_015_NC(info);
		else if (nc == columnRslt_col_016) doRslt_col_016_NC(info);
		else if (nc == columnRslt_col_017) doRslt_col_017_NC(info);
		else if (nc == columnRslt_col_018) doRslt_col_018_NC(info);
		else if (nc == columnRslt_col_019) doRslt_col_019_NC(info);
		else if (nc == columnRslt_col_020) doRslt_col_020_NC(info);
		else if (nc == columnRslt_col_021) doRslt_col_021_NC(info);
		else if (nc == columnRslt_col_022) doRslt_col_022_NC(info);
		else if (nc == columnRslt_col_023) doRslt_col_023_NC(info);
		else if (nc == columnRslt_col_024) doRslt_col_024_NC(info);
		else if (nc == columnRslt_col_025) doRslt_col_025_NC(info);
		else if (nc == columnRslt_col_026) doRslt_col_026_NC(info);
		else if (nc == columnRslt_col_027) doRslt_col_027_NC(info);
		else if (nc == columnRslt_col_028) doRslt_col_028_NC(info);
		else if (nc == columnRslt_col_029) doRslt_col_029_NC(info);
		else if (nc == columnRslt_col_030) doRslt_col_030_NC(info);
		else if (nc == columnRslt_col_031) doRslt_col_031_NC(info);
		else if (nc == columnRslt_col_032) doRslt_col_032_NC(info);
		else if (nc == columnRslt_col_033) doRslt_col_033_NC(info);
		else if (nc == columnRslt_col_034) doRslt_col_034_NC(info);
		else if (nc == columnRslt_col_035) doRslt_col_035_NC(info);
		else if (nc == columnRslt_col_036) doRslt_col_036_NC(info);
		else if (nc == columnRslt_col_037) doRslt_col_037_NC(info);
		else if (nc == columnRslt_col_038) doRslt_col_038_NC(info);
		else if (nc == columnRslt_col_039) doRslt_col_039_NC(info);
		else if (nc == columnRslt_col_040) doRslt_col_040_NC(info);
		else if (nc == columnRslt_col_041) doRslt_col_041_NC(info);
		else if (nc == columnRslt_col_042) doRslt_col_042_NC(info);
		else if (nc == columnRslt_col_043) doRslt_col_043_NC(info);
		else if (nc == columnRslt_col_044) doRslt_col_044_NC(info);
		else if (nc == columnRslt_col_045) doRslt_col_045_NC(info);
		else if (nc == columnRslt_col_046) doRslt_col_046_NC(info);
		else if (nc == columnRslt_col_047) doRslt_col_047_NC(info);
		else if (nc == columnRslt_col_048) doRslt_col_048_NC(info);
		else if (nc == columnRslt_col_049) doRslt_col_049_NC(info);
		else if (nc == columnRslt_col_050) doRslt_col_050_NC(info);
		else if (nc == columnRslt_col_051) doRslt_col_051_NC(info);
		else if (nc == columnRslt_col_052) doRslt_col_052_NC(info);
		else if (nc == columnRslt_col_053) doRslt_col_053_NC(info);
		else if (nc == columnRslt_col_054) doRslt_col_054_NC(info);
		else if (nc == columnRslt_col_055) doRslt_col_055_NC(info);
		else if (nc == columnRslt_col_056) doRslt_col_056_NC(info);
		else if (nc == columnRslt_col_057) doRslt_col_057_NC(info);
		else if (nc == columnRslt_col_058) doRslt_col_058_NC(info);
		else if (nc == columnRslt_col_059) doRslt_col_059_NC(info);
		else if (nc == columnRslt_col_060) doRslt_col_060_NC(info);
		else if (nc == columnRslt_col_061) doRslt_col_061_NC(info);
		else if (nc == columnRslt_col_062) doRslt_col_062_NC(info);
		else if (nc == columnRslt_col_063) doRslt_col_063_NC(info);
		else if (nc == columnRslt_col_064) doRslt_col_064_NC(info);
		else if (nc == columnRslt_col_065) doRslt_col_065_NC(info);
		else if (nc == columnRslt_col_066) doRslt_col_066_NC(info);
		else if (nc == columnRslt_col_067) doRslt_col_067_NC(info);
		else if (nc == columnRslt_col_068) doRslt_col_068_NC(info);
		else if (nc == columnRslt_col_069) doRslt_col_069_NC(info);
		else if (nc == columnRslt_col_070) doRslt_col_070_NC(info);
		else if (nc == columnRslt_col_071) doRslt_col_071_NC(info);
		else if (nc == columnRslt_col_072) doRslt_col_072_NC(info);
		else if (nc == columnRslt_col_073) doRslt_col_073_NC(info);
		else if (nc == columnRslt_col_074) doRslt_col_074_NC(info);
		else if (nc == columnRslt_col_075) doRslt_col_075_NC(info);
		else if (nc == columnRslt_col_076) doRslt_col_076_NC(info);
		else if (nc == columnRslt_col_077) doRslt_col_077_NC(info);
		else if (nc == columnRslt_col_078) doRslt_col_078_NC(info);
		else if (nc == columnRslt_col_079) doRslt_col_079_NC(info);
		else if (nc == columnRslt_col_080) doRslt_col_080_NC(info);
		else if (nc == columnRslt_col_081) doRslt_col_081_NC(info);
		else if (nc == columnRslt_col_082) doRslt_col_082_NC(info);
		else if (nc == columnRslt_col_083) doRslt_col_083_NC(info);
		else if (nc == columnRslt_col_084) doRslt_col_084_NC(info);
		else if (nc == columnRslt_col_085) doRslt_col_085_NC(info);
		else if (nc == columnRslt_col_086) doRslt_col_086_NC(info);
		else if (nc == columnRslt_col_087) doRslt_col_087_NC(info);
		else if (nc == columnRslt_col_088) doRslt_col_088_NC(info);
		else if (nc == columnRslt_col_089) doRslt_col_089_NC(info);
		else if (nc == columnRslt_col_090) doRslt_col_090_NC(info);
		else if (nc == columnRslt_col_091) doRslt_col_091_NC(info);
		else if (nc == columnRslt_col_092) doRslt_col_092_NC(info);
		else if (nc == columnRslt_col_093) doRslt_col_093_NC(info);
		else if (nc == columnRslt_col_094) doRslt_col_094_NC(info);
		else if (nc == columnRslt_col_095) doRslt_col_095_NC(info);
		else if (nc == columnRslt_col_096) doRslt_col_096_NC(info);
		else if (nc == columnRslt_col_097) doRslt_col_097_NC(info);
		else if (nc == columnRslt_col_098) doRslt_col_098_NC(info);
		else if (nc == columnRslt_col_099) doRslt_col_099_NC(info);
		else if (nc == columnRslt_col_100) doRslt_col_100_NC(info);
		else if (nc == columnRslt_col_101) doRslt_col_101_NC(info);
		else if (nc == columnRslt_col_102) doRslt_col_102_NC(info);
		else if (nc == columnRslt_col_103) doRslt_col_103_NC(info);
		else if (nc == columnRslt_col_104) doRslt_col_104_NC(info);
		else if (nc == columnRslt_col_105) doRslt_col_105_NC(info);
		else if (nc == columnRslt_col_106) doRslt_col_106_NC(info);
		else if (nc == columnRslt_col_107) doRslt_col_107_NC(info);
		else if (nc == columnRslt_col_108) doRslt_col_108_NC(info);
		else if (nc == columnRslt_col_109) doRslt_col_109_NC(info);
		else if (nc == columnRslt_col_110) doRslt_col_110_NC(info);
		else if (nc == columnRslt_col_111) doRslt_col_111_NC(info);
		else if (nc == columnRslt_col_112) doRslt_col_112_NC(info);
		else if (nc == columnRslt_col_113) doRslt_col_113_NC(info);
		else if (nc == columnRslt_col_114) doRslt_col_114_NC(info);
		else if (nc == columnRslt_col_115) doRslt_col_115_NC(info);
		else if (nc == columnRslt_col_116) doRslt_col_116_NC(info);
		else if (nc == columnRslt_col_117) doRslt_col_117_NC(info);
		else if (nc == columnRslt_col_118) doRslt_col_118_NC(info);
		else if (nc == columnRslt_col_119) doRslt_col_119_NC(info);
		else if (nc == columnRslt_col_120) doRslt_col_120_NC(info);
		else if (nc == columnRslt_col_121) doRslt_col_121_NC(info);
		else if (nc == columnRslt_col_122) doRslt_col_122_NC(info);
		else if (nc == columnRslt_col_123) doRslt_col_123_NC(info);
		else if (nc == columnRslt_col_124) doRslt_col_124_NC(info);
		else if (nc == columnRslt_col_125) doRslt_col_125_NC(info);
		else if (nc == columnRslt_col_126) doRslt_col_126_NC(info);
		else if (nc == columnRslt_col_127) doRslt_col_127_NC(info);
		else if (nc == columnRslt_col_128) doRslt_col_128_NC(info);
		else if (nc == columnRslt_col_129) doRslt_col_129_NC(info);
		else if (nc == columnRslt_col_130) doRslt_col_130_NC(info);
		else if (nc == columnRslt_col_131) doRslt_col_131_NC(info);
		else if (nc == columnRslt_col_132) doRslt_col_132_NC(info);
		else if (nc == columnRslt_col_133) doRslt_col_133_NC(info);
		else if (nc == columnRslt_col_134) doRslt_col_134_NC(info);
		else if (nc == columnRslt_col_135) doRslt_col_135_NC(info);
		else if (nc == columnRslt_col_136) doRslt_col_136_NC(info);
		else if (nc == columnRslt_col_137) doRslt_col_137_NC(info);
		else if (nc == columnRslt_col_138) doRslt_col_138_NC(info);
		else if (nc == columnRslt_col_139) doRslt_col_139_NC(info);
		else if (nc == columnRslt_col_140) doRslt_col_140_NC(info);
		else if (nc == columnRslt_col_141) doRslt_col_141_NC(info);
		else if (nc == columnRslt_col_142) doRslt_col_142_NC(info);
		else if (nc == columnRslt_col_143) doRslt_col_143_NC(info);
		else if (nc == columnRslt_col_144) doRslt_col_144_NC(info);
		else if (nc == columnRslt_col_145) doRslt_col_145_NC(info);
		else if (nc == columnRslt_col_146) doRslt_col_146_NC(info);
		else if (nc == columnRslt_col_147) doRslt_col_147_NC(info);
		else if (nc == columnRslt_col_148) doRslt_col_148_NC(info);
		else if (nc == columnRslt_col_149) doRslt_col_149_NC(info);
		else if (nc == columnRslt_col_150) doRslt_col_150_NC(info);
		else if (nc == columnRslt_col_151) doRslt_col_151_NC(info);
		else if (nc == columnRslt_col_152) doRslt_col_152_NC(info);
		else if (nc == columnRslt_col_153) doRslt_col_153_NC(info);
		else if (nc == columnRslt_col_154) doRslt_col_154_NC(info);
		else if (nc == columnRslt_col_155) doRslt_col_155_NC(info);
		else if (nc == columnRslt_col_156) doRslt_col_156_NC(info);
		else if (nc == columnRslt_col_157) doRslt_col_157_NC(info);
		else if (nc == columnRslt_col_158) doRslt_col_158_NC(info);
		else if (nc == columnRslt_col_159) doRslt_col_159_NC(info);
		else if (nc == columnRslt_col_160) doRslt_col_160_NC(info);
		else if (nc == columnRslt_col_161) doRslt_col_161_NC(info);
		else if (nc == columnRslt_col_162) doRslt_col_162_NC(info);
		else if (nc == columnRslt_col_163) doRslt_col_163_NC(info);
		else if (nc == columnRslt_col_164) doRslt_col_164_NC(info);
		else if (nc == columnRslt_col_165) doRslt_col_165_NC(info);
		else if (nc == columnRslt_col_166) doRslt_col_166_NC(info);
		else if (nc == columnRslt_col_167) doRslt_col_167_NC(info);
		else if (nc == columnRslt_col_168) doRslt_col_168_NC(info);
		else if (nc == columnRslt_col_169) doRslt_col_169_NC(info);
		else if (nc == columnRslt_col_170) doRslt_col_170_NC(info);
		else if (nc == columnRslt_col_171) doRslt_col_171_NC(info);
		else if (nc == columnRslt_col_172) doRslt_col_172_NC(info);
		else if (nc == columnRslt_col_173) doRslt_col_173_NC(info);
		else if (nc == columnRslt_col_174) doRslt_col_174_NC(info);
		else if (nc == columnRslt_col_175) doRslt_col_175_NC(info);
		else if (nc == columnRslt_col_176) doRslt_col_176_NC(info);
		else if (nc == columnRslt_col_177) doRslt_col_177_NC(info);
		else if (nc == columnRslt_col_178) doRslt_col_178_NC(info);
		else if (nc == columnRslt_col_179) doRslt_col_179_NC(info);
		else if (nc == columnRslt_col_180) doRslt_col_180_NC(info);
		else if (nc == columnRslt_col_181) doRslt_col_181_NC(info);
		else if (nc == columnRslt_col_182) doRslt_col_182_NC(info);
		else if (nc == columnRslt_col_183) doRslt_col_183_NC(info);
		else if (nc == columnRslt_col_184) doRslt_col_184_NC(info);
		else if (nc == columnRslt_col_185) doRslt_col_185_NC(info);
		else if (nc == columnRslt_col_186) doRslt_col_186_NC(info);
		else if (nc == columnRslt_col_187) doRslt_col_187_NC(info);
		else if (nc == columnRslt_col_188) doRslt_col_188_NC(info);
		else if (nc == columnRslt_col_189) doRslt_col_189_NC(info);
		else if (nc == columnRslt_col_190) doRslt_col_190_NC(info);
		else if (nc == columnRslt_col_191) doRslt_col_191_NC(info);
		else if (nc == columnRslt_col_192) doRslt_col_192_NC(info);
		else if (nc == columnRslt_col_193) doRslt_col_193_NC(info);
		else if (nc == columnRslt_col_194) doRslt_col_194_NC(info);
		else if (nc == columnRslt_col_195) doRslt_col_195_NC(info);
		else if (nc == columnRslt_col_196) doRslt_col_196_NC(info);
		else if (nc == columnRslt_col_197) doRslt_col_197_NC(info);
		else if (nc == columnRslt_col_198) doRslt_col_198_NC(info);
		else if (nc == columnRslt_col_199) doRslt_col_199_NC(info);
		else if (nc == columnRslt_col_200) doRslt_col_200_NC(info);
		else if (nc == columnRslt_col_201) doRslt_col_201_NC(info);
		else if (nc == columnRslt_col_202) doRslt_col_202_NC(info);
		else if (nc == columnRslt_col_203) doRslt_col_203_NC(info);
		else if (nc == columnRslt_col_204) doRslt_col_204_NC(info);
		else if (nc == columnRslt_col_205) doRslt_col_205_NC(info);
		else if (nc == columnRslt_col_206) doRslt_col_206_NC(info);
		else if (nc == columnRslt_col_207) doRslt_col_207_NC(info);
		else if (nc == columnRslt_col_208) doRslt_col_208_NC(info);
		else if (nc == columnRslt_col_209) doRslt_col_209_NC(info);
		else if (nc == columnRslt_col_210) doRslt_col_210_NC(info);
		else if (nc == columnRslt_col_211) doRslt_col_211_NC(info);
		else if (nc == columnRslt_col_212) doRslt_col_212_NC(info);
		else if (nc == columnRslt_col_213) doRslt_col_213_NC(info);
		else if (nc == columnRslt_col_214) doRslt_col_214_NC(info);
		else if (nc == columnRslt_col_215) doRslt_col_215_NC(info);
		else if (nc == columnRslt_col_216) doRslt_col_216_NC(info);
		else if (nc == columnRslt_col_217) doRslt_col_217_NC(info);
		else if (nc == columnRslt_col_218) doRslt_col_218_NC(info);
		else if (nc == columnRslt_col_219) doRslt_col_219_NC(info);
		else if (nc == columnRslt_col_220) doRslt_col_220_NC(info);
		else if (nc == columnRslt_col_221) doRslt_col_221_NC(info);
		else if (nc == columnRslt_col_222) doRslt_col_222_NC(info);
		else if (nc == columnRslt_col_223) doRslt_col_223_NC(info);
		else if (nc == columnRslt_col_224) doRslt_col_224_NC(info);
		else if (nc == columnRslt_col_225) doRslt_col_225_NC(info);
		else if (nc == columnRslt_col_226) doRslt_col_226_NC(info);
		else if (nc == columnRslt_col_227) doRslt_col_227_NC(info);
		else if (nc == columnRslt_col_228) doRslt_col_228_NC(info);
		else if (nc == columnRslt_col_229) doRslt_col_229_NC(info);
		else if (nc == columnRslt_col_230) doRslt_col_230_NC(info);
		else if (nc == columnRslt_col_231) doRslt_col_231_NC(info);
		else if (nc == columnRslt_col_232) doRslt_col_232_NC(info);
		else if (nc == columnRslt_col_233) doRslt_col_233_NC(info);
		else if (nc == columnRslt_col_234) doRslt_col_234_NC(info);
		else if (nc == columnRslt_col_235) doRslt_col_235_NC(info);
		else if (nc == columnRslt_col_236) doRslt_col_236_NC(info);
		else if (nc == columnRslt_col_237) doRslt_col_237_NC(info);
		else if (nc == columnRslt_col_238) doRslt_col_238_NC(info);
		else if (nc == columnRslt_col_239) doRslt_col_239_NC(info);
		else if (nc == columnRslt_col_240) doRslt_col_240_NC(info);
		else if (nc == columnRslt_col_241) doRslt_col_241_NC(info);
		else if (nc == columnRslt_col_242) doRslt_col_242_NC(info);
		else if (nc == columnRslt_col_243) doRslt_col_243_NC(info);
		else if (nc == columnRslt_col_244) doRslt_col_244_NC(info);
		else if (nc == columnRslt_col_245) doRslt_col_245_NC(info);
		else if (nc == columnRslt_col_246) doRslt_col_246_NC(info);
		else if (nc == columnRslt_col_247) doRslt_col_247_NC(info);
		else if (nc == columnRslt_col_248) doRslt_col_248_NC(info);
		else if (nc == columnRslt_col_249) doRslt_col_249_NC(info);
		else if (nc == columnRslt_col_250) doRslt_col_250_NC(info);
		else if (nc == columnRslt_col_251) doRslt_col_251_NC(info);
		else if (nc == columnRslt_col_252) doRslt_col_252_NC(info);
		else if (nc == columnRslt_col_253) doRslt_col_253_NC(info);
		else if (nc == columnRslt_col_254) doRslt_col_254_NC(info);
		else if (nc == columnRslt_col_255) doRslt_col_255_NC(info);
		else if (nc == columnRslt_col_256) doRslt_col_256_NC(info);
		else if (nc == columnRslt_col_257) doRslt_col_257_NC(info);
		else if (nc == columnRslt_col_258) doRslt_col_258_NC(info);
		else if (nc == columnRslt_col_259) doRslt_col_259_NC(info);
		else if (nc == columnRslt_col_260) doRslt_col_260_NC(info);
		else if (nc == columnRslt_col_261) doRslt_col_261_NC(info);
		else if (nc == columnRslt_col_262) doRslt_col_262_NC(info);
		else if (nc == columnRslt_col_263) doRslt_col_263_NC(info);
		else if (nc == columnRslt_col_264) doRslt_col_264_NC(info);
		else if (nc == columnRslt_col_265) doRslt_col_265_NC(info);
		else if (nc == columnRslt_col_266) doRslt_col_266_NC(info);
		else if (nc == columnRslt_col_267) doRslt_col_267_NC(info);
		else if (nc == columnRslt_col_268) doRslt_col_268_NC(info);
		else if (nc == columnRslt_col_269) doRslt_col_269_NC(info);
		else if (nc == columnRslt_col_270) doRslt_col_270_NC(info);
		else if (nc == columnRslt_col_271) doRslt_col_271_NC(info);
		else if (nc == columnRslt_col_272) doRslt_col_272_NC(info);
		else if (nc == columnRslt_col_273) doRslt_col_273_NC(info);
		else if (nc == columnRslt_col_274) doRslt_col_274_NC(info);
		else if (nc == columnRslt_col_275) doRslt_col_275_NC(info);
		else if (nc == columnRslt_col_276) doRslt_col_276_NC(info);
		else if (nc == columnRslt_col_277) doRslt_col_277_NC(info);
		else if (nc == columnRslt_col_278) doRslt_col_278_NC(info);
		else if (nc == columnRslt_col_279) doRslt_col_279_NC(info);
		else if (nc == columnRslt_col_280) doRslt_col_280_NC(info);
		else if (nc == columnRslt_col_281) doRslt_col_281_NC(info);
		else if (nc == columnRslt_col_282) doRslt_col_282_NC(info);
		else if (nc == columnRslt_col_283) doRslt_col_283_NC(info);
		else if (nc == columnRslt_col_284) doRslt_col_284_NC(info);
		else if (nc == columnRslt_col_285) doRslt_col_285_NC(info);
		else if (nc == columnRslt_col_286) doRslt_col_286_NC(info);
		else if (nc == columnRslt_col_287) doRslt_col_287_NC(info);
		else if (nc == columnRslt_col_288) doRslt_col_288_NC(info);
		else if (nc == columnRslt_col_289) doRslt_col_289_NC(info);
		else if (nc == columnRslt_col_290) doRslt_col_290_NC(info);
		else if (nc == columnRslt_col_291) doRslt_col_291_NC(info);
		else if (nc == columnRslt_col_292) doRslt_col_292_NC(info);
		else if (nc == columnRslt_col_293) doRslt_col_293_NC(info);
		else if (nc == columnRslt_col_294) doRslt_col_294_NC(info);
		else if (nc == columnRslt_col_295) doRslt_col_295_NC(info);
		else if (nc == columnRslt_col_296) doRslt_col_296_NC(info);
		else if (nc == columnRslt_col_297) doRslt_col_297_NC(info);
		else if (nc == columnRslt_col_298) doRslt_col_298_NC(info);
		else if (nc == columnRslt_col_299) doRslt_col_299_NC(info);
		else if (nc == columnRslt_st_wip_key) doRslt_st_wip_key_NC(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wip_per]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_per_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_wip_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_wip_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_inpt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_inpt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_100]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_100_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_101]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_101_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_102]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_102_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_103]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_103_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_104]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_104_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_105]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_105_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_106]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_106_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_107]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_107_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_108]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_108_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_109]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_109_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_110]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_110_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_111]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_111_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_112]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_112_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_113]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_113_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_114]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_114_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_115]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_115_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_116]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_116_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_117]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_117_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_118]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_118_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_119]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_119_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_120]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_120_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_121]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_121_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_122]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_122_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_123]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_123_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_124]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_124_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_125]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_125_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_126]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_126_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_127]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_127_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_128]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_128_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_129]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_129_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_130]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_130_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_131]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_131_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_132]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_132_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_133]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_133_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_134]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_134_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_135]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_135_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_136]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_136_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_137]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_137_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_138]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_138_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_139]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_139_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_140]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_140_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_141]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_141_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_142]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_142_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_143]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_143_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_144]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_144_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_145]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_145_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_146]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_146_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_147]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_147_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_148]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_148_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_149]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_149_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_150]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_150_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_151]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_151_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_152]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_152_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_153]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_153_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_154]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_154_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_155]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_155_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_156]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_156_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_157]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_157_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_158]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_158_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_159]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_159_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_160]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_160_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_161]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_161_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_162]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_162_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_163]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_163_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_164]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_164_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_165]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_165_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_166]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_166_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_167]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_167_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_168]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_168_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_169]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_169_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_170]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_170_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_171]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_171_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_172]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_172_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_173]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_173_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_174]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_174_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_175]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_175_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_176]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_176_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_177]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_177_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_178]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_178_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_179]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_179_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_180]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_180_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_181]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_181_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_182]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_182_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_183]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_183_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_184]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_184_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_185]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_185_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_186]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_186_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_187]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_187_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_188]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_188_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_189]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_189_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_190]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_190_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_191]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_191_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_192]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_192_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_193]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_193_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_194]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_194_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_195]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_195_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_196]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_196_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_197]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_197_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_198]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_198_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_199]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_199_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_200]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_200_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_201]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_201_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_202]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_202_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_203]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_203_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_204]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_204_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_205]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_205_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_206]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_206_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_207]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_207_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_208]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_208_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_209]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_209_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_210]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_210_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_211]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_211_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_212]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_212_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_213]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_213_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_214]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_214_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_215]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_215_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_216]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_216_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_217]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_217_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_218]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_218_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_219]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_219_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_220]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_220_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_221]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_221_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_222]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_222_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_223]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_223_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_224]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_224_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_225]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_225_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_226]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_226_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_227]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_227_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_228]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_228_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_229]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_229_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_230]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_230_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_231]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_231_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_232]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_232_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_233]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_233_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_234]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_234_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_235]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_235_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_236]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_236_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_237]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_237_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_238]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_238_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_239]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_239_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_240]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_240_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_241]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_241_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_242]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_242_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_243]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_243_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_244]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_244_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_245]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_245_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_246]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_246_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_247]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_247_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_248]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_248_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_249]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_249_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_250]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_250_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_251]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_251_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_252]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_252_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_253]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_253_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_254]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_254_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_255]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_255_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_256]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_256_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_257]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_257_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_258]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_258_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_259]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_259_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_260]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_260_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_261]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_261_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_262]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_262_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_263]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_263_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_264]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_264_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_265]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_265_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_266]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_266_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_267]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_267_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_268]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_268_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_269]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_269_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_270]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_270_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_271]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_271_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_272]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_272_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_273]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_273_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_274]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_274_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_275]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_275_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_276]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_276_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_277]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_277_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_278]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_278_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_279]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_279_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_280]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_280_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_281]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_281_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_282]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_282_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_283]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_283_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_284]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_284_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_285]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_285_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_286]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_286_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_287]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_287_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_288]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_288_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_289]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_289_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_290]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_290_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_291]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_291_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_292]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_292_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_293]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_293_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_294]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_294_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_295]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_295_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_296]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_296_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_297]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_297_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_298]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_298_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_299]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_299_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_wip_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_wip_key_NC(MCEventInfo info){
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
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_oper_act_no) doCnd_oper_act_no_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NE(info);
		else if (ne == DelCnd_calc_grp_cd) doDelCnd_calc_grp_cd_NE(info);
		else if (ne == DelCnd_calc_grp_nm) doDelCnd_calc_grp_nm_NE(info);
		else if (ne == DelCnd_ym) doDelCnd_ym_NE(info);
		else if (ne == DelCnd_wg_cd) doDelCnd_wg_cd_NE(info);
		else if (ne == DelCnd_wg_nm) doDelCnd_wg_nm_NE(info);
		else if (ne == DelCnd_site_cd) doDelCnd_site_cd_NE(info);
		else if (ne == DelCnd_site_nm) doDelCnd_site_nm_NE(info);
		else if (ne == DelCnd_loc_cd) doDelCnd_loc_cd_NE(info);
		else if (ne == DelCnd_loc_nm) doDelCnd_loc_nm_NE(info);
		else if (ne == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NE(info);
		else if (ne == LPnl_disp_expns) doLPnl_disp_expns_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NE(info);
		else if (ne == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_mfg_act_no) doRslt_mfg_act_no_NE(info);
		else if (ne == columnRslt_oper_act_no) doRslt_oper_act_no_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_wip_per) doRslt_wip_per_NE(info);
		else if (ne == columnRslt_ttl) doRslt_ttl_NE(info);
		else if (ne == columnRslt_ttl_wip_amt) doRslt_ttl_wip_amt_NE(info);
		else if (ne == columnRslt_ttl_inpt_amt) doRslt_ttl_inpt_amt_NE(info);
		else if (ne == columnRslt_col_000) doRslt_col_000_NE(info);
		else if (ne == columnRslt_col_001) doRslt_col_001_NE(info);
		else if (ne == columnRslt_col_002) doRslt_col_002_NE(info);
		else if (ne == columnRslt_col_003) doRslt_col_003_NE(info);
		else if (ne == columnRslt_col_004) doRslt_col_004_NE(info);
		else if (ne == columnRslt_col_005) doRslt_col_005_NE(info);
		else if (ne == columnRslt_col_006) doRslt_col_006_NE(info);
		else if (ne == columnRslt_col_007) doRslt_col_007_NE(info);
		else if (ne == columnRslt_col_008) doRslt_col_008_NE(info);
		else if (ne == columnRslt_col_009) doRslt_col_009_NE(info);
		else if (ne == columnRslt_col_010) doRslt_col_010_NE(info);
		else if (ne == columnRslt_col_011) doRslt_col_011_NE(info);
		else if (ne == columnRslt_col_012) doRslt_col_012_NE(info);
		else if (ne == columnRslt_col_013) doRslt_col_013_NE(info);
		else if (ne == columnRslt_col_014) doRslt_col_014_NE(info);
		else if (ne == columnRslt_col_015) doRslt_col_015_NE(info);
		else if (ne == columnRslt_col_016) doRslt_col_016_NE(info);
		else if (ne == columnRslt_col_017) doRslt_col_017_NE(info);
		else if (ne == columnRslt_col_018) doRslt_col_018_NE(info);
		else if (ne == columnRslt_col_019) doRslt_col_019_NE(info);
		else if (ne == columnRslt_col_020) doRslt_col_020_NE(info);
		else if (ne == columnRslt_col_021) doRslt_col_021_NE(info);
		else if (ne == columnRslt_col_022) doRslt_col_022_NE(info);
		else if (ne == columnRslt_col_023) doRslt_col_023_NE(info);
		else if (ne == columnRslt_col_024) doRslt_col_024_NE(info);
		else if (ne == columnRslt_col_025) doRslt_col_025_NE(info);
		else if (ne == columnRslt_col_026) doRslt_col_026_NE(info);
		else if (ne == columnRslt_col_027) doRslt_col_027_NE(info);
		else if (ne == columnRslt_col_028) doRslt_col_028_NE(info);
		else if (ne == columnRslt_col_029) doRslt_col_029_NE(info);
		else if (ne == columnRslt_col_030) doRslt_col_030_NE(info);
		else if (ne == columnRslt_col_031) doRslt_col_031_NE(info);
		else if (ne == columnRslt_col_032) doRslt_col_032_NE(info);
		else if (ne == columnRslt_col_033) doRslt_col_033_NE(info);
		else if (ne == columnRslt_col_034) doRslt_col_034_NE(info);
		else if (ne == columnRslt_col_035) doRslt_col_035_NE(info);
		else if (ne == columnRslt_col_036) doRslt_col_036_NE(info);
		else if (ne == columnRslt_col_037) doRslt_col_037_NE(info);
		else if (ne == columnRslt_col_038) doRslt_col_038_NE(info);
		else if (ne == columnRslt_col_039) doRslt_col_039_NE(info);
		else if (ne == columnRslt_col_040) doRslt_col_040_NE(info);
		else if (ne == columnRslt_col_041) doRslt_col_041_NE(info);
		else if (ne == columnRslt_col_042) doRslt_col_042_NE(info);
		else if (ne == columnRslt_col_043) doRslt_col_043_NE(info);
		else if (ne == columnRslt_col_044) doRslt_col_044_NE(info);
		else if (ne == columnRslt_col_045) doRslt_col_045_NE(info);
		else if (ne == columnRslt_col_046) doRslt_col_046_NE(info);
		else if (ne == columnRslt_col_047) doRslt_col_047_NE(info);
		else if (ne == columnRslt_col_048) doRslt_col_048_NE(info);
		else if (ne == columnRslt_col_049) doRslt_col_049_NE(info);
		else if (ne == columnRslt_col_050) doRslt_col_050_NE(info);
		else if (ne == columnRslt_col_051) doRslt_col_051_NE(info);
		else if (ne == columnRslt_col_052) doRslt_col_052_NE(info);
		else if (ne == columnRslt_col_053) doRslt_col_053_NE(info);
		else if (ne == columnRslt_col_054) doRslt_col_054_NE(info);
		else if (ne == columnRslt_col_055) doRslt_col_055_NE(info);
		else if (ne == columnRslt_col_056) doRslt_col_056_NE(info);
		else if (ne == columnRslt_col_057) doRslt_col_057_NE(info);
		else if (ne == columnRslt_col_058) doRslt_col_058_NE(info);
		else if (ne == columnRslt_col_059) doRslt_col_059_NE(info);
		else if (ne == columnRslt_col_060) doRslt_col_060_NE(info);
		else if (ne == columnRslt_col_061) doRslt_col_061_NE(info);
		else if (ne == columnRslt_col_062) doRslt_col_062_NE(info);
		else if (ne == columnRslt_col_063) doRslt_col_063_NE(info);
		else if (ne == columnRslt_col_064) doRslt_col_064_NE(info);
		else if (ne == columnRslt_col_065) doRslt_col_065_NE(info);
		else if (ne == columnRslt_col_066) doRslt_col_066_NE(info);
		else if (ne == columnRslt_col_067) doRslt_col_067_NE(info);
		else if (ne == columnRslt_col_068) doRslt_col_068_NE(info);
		else if (ne == columnRslt_col_069) doRslt_col_069_NE(info);
		else if (ne == columnRslt_col_070) doRslt_col_070_NE(info);
		else if (ne == columnRslt_col_071) doRslt_col_071_NE(info);
		else if (ne == columnRslt_col_072) doRslt_col_072_NE(info);
		else if (ne == columnRslt_col_073) doRslt_col_073_NE(info);
		else if (ne == columnRslt_col_074) doRslt_col_074_NE(info);
		else if (ne == columnRslt_col_075) doRslt_col_075_NE(info);
		else if (ne == columnRslt_col_076) doRslt_col_076_NE(info);
		else if (ne == columnRslt_col_077) doRslt_col_077_NE(info);
		else if (ne == columnRslt_col_078) doRslt_col_078_NE(info);
		else if (ne == columnRslt_col_079) doRslt_col_079_NE(info);
		else if (ne == columnRslt_col_080) doRslt_col_080_NE(info);
		else if (ne == columnRslt_col_081) doRslt_col_081_NE(info);
		else if (ne == columnRslt_col_082) doRslt_col_082_NE(info);
		else if (ne == columnRslt_col_083) doRslt_col_083_NE(info);
		else if (ne == columnRslt_col_084) doRslt_col_084_NE(info);
		else if (ne == columnRslt_col_085) doRslt_col_085_NE(info);
		else if (ne == columnRslt_col_086) doRslt_col_086_NE(info);
		else if (ne == columnRslt_col_087) doRslt_col_087_NE(info);
		else if (ne == columnRslt_col_088) doRslt_col_088_NE(info);
		else if (ne == columnRslt_col_089) doRslt_col_089_NE(info);
		else if (ne == columnRslt_col_090) doRslt_col_090_NE(info);
		else if (ne == columnRslt_col_091) doRslt_col_091_NE(info);
		else if (ne == columnRslt_col_092) doRslt_col_092_NE(info);
		else if (ne == columnRslt_col_093) doRslt_col_093_NE(info);
		else if (ne == columnRslt_col_094) doRslt_col_094_NE(info);
		else if (ne == columnRslt_col_095) doRslt_col_095_NE(info);
		else if (ne == columnRslt_col_096) doRslt_col_096_NE(info);
		else if (ne == columnRslt_col_097) doRslt_col_097_NE(info);
		else if (ne == columnRslt_col_098) doRslt_col_098_NE(info);
		else if (ne == columnRslt_col_099) doRslt_col_099_NE(info);
		else if (ne == columnRslt_col_100) doRslt_col_100_NE(info);
		else if (ne == columnRslt_col_101) doRslt_col_101_NE(info);
		else if (ne == columnRslt_col_102) doRslt_col_102_NE(info);
		else if (ne == columnRslt_col_103) doRslt_col_103_NE(info);
		else if (ne == columnRslt_col_104) doRslt_col_104_NE(info);
		else if (ne == columnRslt_col_105) doRslt_col_105_NE(info);
		else if (ne == columnRslt_col_106) doRslt_col_106_NE(info);
		else if (ne == columnRslt_col_107) doRslt_col_107_NE(info);
		else if (ne == columnRslt_col_108) doRslt_col_108_NE(info);
		else if (ne == columnRslt_col_109) doRslt_col_109_NE(info);
		else if (ne == columnRslt_col_110) doRslt_col_110_NE(info);
		else if (ne == columnRslt_col_111) doRslt_col_111_NE(info);
		else if (ne == columnRslt_col_112) doRslt_col_112_NE(info);
		else if (ne == columnRslt_col_113) doRslt_col_113_NE(info);
		else if (ne == columnRslt_col_114) doRslt_col_114_NE(info);
		else if (ne == columnRslt_col_115) doRslt_col_115_NE(info);
		else if (ne == columnRslt_col_116) doRslt_col_116_NE(info);
		else if (ne == columnRslt_col_117) doRslt_col_117_NE(info);
		else if (ne == columnRslt_col_118) doRslt_col_118_NE(info);
		else if (ne == columnRslt_col_119) doRslt_col_119_NE(info);
		else if (ne == columnRslt_col_120) doRslt_col_120_NE(info);
		else if (ne == columnRslt_col_121) doRslt_col_121_NE(info);
		else if (ne == columnRslt_col_122) doRslt_col_122_NE(info);
		else if (ne == columnRslt_col_123) doRslt_col_123_NE(info);
		else if (ne == columnRslt_col_124) doRslt_col_124_NE(info);
		else if (ne == columnRslt_col_125) doRslt_col_125_NE(info);
		else if (ne == columnRslt_col_126) doRslt_col_126_NE(info);
		else if (ne == columnRslt_col_127) doRslt_col_127_NE(info);
		else if (ne == columnRslt_col_128) doRslt_col_128_NE(info);
		else if (ne == columnRslt_col_129) doRslt_col_129_NE(info);
		else if (ne == columnRslt_col_130) doRslt_col_130_NE(info);
		else if (ne == columnRslt_col_131) doRslt_col_131_NE(info);
		else if (ne == columnRslt_col_132) doRslt_col_132_NE(info);
		else if (ne == columnRslt_col_133) doRslt_col_133_NE(info);
		else if (ne == columnRslt_col_134) doRslt_col_134_NE(info);
		else if (ne == columnRslt_col_135) doRslt_col_135_NE(info);
		else if (ne == columnRslt_col_136) doRslt_col_136_NE(info);
		else if (ne == columnRslt_col_137) doRslt_col_137_NE(info);
		else if (ne == columnRslt_col_138) doRslt_col_138_NE(info);
		else if (ne == columnRslt_col_139) doRslt_col_139_NE(info);
		else if (ne == columnRslt_col_140) doRslt_col_140_NE(info);
		else if (ne == columnRslt_col_141) doRslt_col_141_NE(info);
		else if (ne == columnRslt_col_142) doRslt_col_142_NE(info);
		else if (ne == columnRslt_col_143) doRslt_col_143_NE(info);
		else if (ne == columnRslt_col_144) doRslt_col_144_NE(info);
		else if (ne == columnRslt_col_145) doRslt_col_145_NE(info);
		else if (ne == columnRslt_col_146) doRslt_col_146_NE(info);
		else if (ne == columnRslt_col_147) doRslt_col_147_NE(info);
		else if (ne == columnRslt_col_148) doRslt_col_148_NE(info);
		else if (ne == columnRslt_col_149) doRslt_col_149_NE(info);
		else if (ne == columnRslt_col_150) doRslt_col_150_NE(info);
		else if (ne == columnRslt_col_151) doRslt_col_151_NE(info);
		else if (ne == columnRslt_col_152) doRslt_col_152_NE(info);
		else if (ne == columnRslt_col_153) doRslt_col_153_NE(info);
		else if (ne == columnRslt_col_154) doRslt_col_154_NE(info);
		else if (ne == columnRslt_col_155) doRslt_col_155_NE(info);
		else if (ne == columnRslt_col_156) doRslt_col_156_NE(info);
		else if (ne == columnRslt_col_157) doRslt_col_157_NE(info);
		else if (ne == columnRslt_col_158) doRslt_col_158_NE(info);
		else if (ne == columnRslt_col_159) doRslt_col_159_NE(info);
		else if (ne == columnRslt_col_160) doRslt_col_160_NE(info);
		else if (ne == columnRslt_col_161) doRslt_col_161_NE(info);
		else if (ne == columnRslt_col_162) doRslt_col_162_NE(info);
		else if (ne == columnRslt_col_163) doRslt_col_163_NE(info);
		else if (ne == columnRslt_col_164) doRslt_col_164_NE(info);
		else if (ne == columnRslt_col_165) doRslt_col_165_NE(info);
		else if (ne == columnRslt_col_166) doRslt_col_166_NE(info);
		else if (ne == columnRslt_col_167) doRslt_col_167_NE(info);
		else if (ne == columnRslt_col_168) doRslt_col_168_NE(info);
		else if (ne == columnRslt_col_169) doRslt_col_169_NE(info);
		else if (ne == columnRslt_col_170) doRslt_col_170_NE(info);
		else if (ne == columnRslt_col_171) doRslt_col_171_NE(info);
		else if (ne == columnRslt_col_172) doRslt_col_172_NE(info);
		else if (ne == columnRslt_col_173) doRslt_col_173_NE(info);
		else if (ne == columnRslt_col_174) doRslt_col_174_NE(info);
		else if (ne == columnRslt_col_175) doRslt_col_175_NE(info);
		else if (ne == columnRslt_col_176) doRslt_col_176_NE(info);
		else if (ne == columnRslt_col_177) doRslt_col_177_NE(info);
		else if (ne == columnRslt_col_178) doRslt_col_178_NE(info);
		else if (ne == columnRslt_col_179) doRslt_col_179_NE(info);
		else if (ne == columnRslt_col_180) doRslt_col_180_NE(info);
		else if (ne == columnRslt_col_181) doRslt_col_181_NE(info);
		else if (ne == columnRslt_col_182) doRslt_col_182_NE(info);
		else if (ne == columnRslt_col_183) doRslt_col_183_NE(info);
		else if (ne == columnRslt_col_184) doRslt_col_184_NE(info);
		else if (ne == columnRslt_col_185) doRslt_col_185_NE(info);
		else if (ne == columnRslt_col_186) doRslt_col_186_NE(info);
		else if (ne == columnRslt_col_187) doRslt_col_187_NE(info);
		else if (ne == columnRslt_col_188) doRslt_col_188_NE(info);
		else if (ne == columnRslt_col_189) doRslt_col_189_NE(info);
		else if (ne == columnRslt_col_190) doRslt_col_190_NE(info);
		else if (ne == columnRslt_col_191) doRslt_col_191_NE(info);
		else if (ne == columnRslt_col_192) doRslt_col_192_NE(info);
		else if (ne == columnRslt_col_193) doRslt_col_193_NE(info);
		else if (ne == columnRslt_col_194) doRslt_col_194_NE(info);
		else if (ne == columnRslt_col_195) doRslt_col_195_NE(info);
		else if (ne == columnRslt_col_196) doRslt_col_196_NE(info);
		else if (ne == columnRslt_col_197) doRslt_col_197_NE(info);
		else if (ne == columnRslt_col_198) doRslt_col_198_NE(info);
		else if (ne == columnRslt_col_199) doRslt_col_199_NE(info);
		else if (ne == columnRslt_col_200) doRslt_col_200_NE(info);
		else if (ne == columnRslt_col_201) doRslt_col_201_NE(info);
		else if (ne == columnRslt_col_202) doRslt_col_202_NE(info);
		else if (ne == columnRslt_col_203) doRslt_col_203_NE(info);
		else if (ne == columnRslt_col_204) doRslt_col_204_NE(info);
		else if (ne == columnRslt_col_205) doRslt_col_205_NE(info);
		else if (ne == columnRslt_col_206) doRslt_col_206_NE(info);
		else if (ne == columnRslt_col_207) doRslt_col_207_NE(info);
		else if (ne == columnRslt_col_208) doRslt_col_208_NE(info);
		else if (ne == columnRslt_col_209) doRslt_col_209_NE(info);
		else if (ne == columnRslt_col_210) doRslt_col_210_NE(info);
		else if (ne == columnRslt_col_211) doRslt_col_211_NE(info);
		else if (ne == columnRslt_col_212) doRslt_col_212_NE(info);
		else if (ne == columnRslt_col_213) doRslt_col_213_NE(info);
		else if (ne == columnRslt_col_214) doRslt_col_214_NE(info);
		else if (ne == columnRslt_col_215) doRslt_col_215_NE(info);
		else if (ne == columnRslt_col_216) doRslt_col_216_NE(info);
		else if (ne == columnRslt_col_217) doRslt_col_217_NE(info);
		else if (ne == columnRslt_col_218) doRslt_col_218_NE(info);
		else if (ne == columnRslt_col_219) doRslt_col_219_NE(info);
		else if (ne == columnRslt_col_220) doRslt_col_220_NE(info);
		else if (ne == columnRslt_col_221) doRslt_col_221_NE(info);
		else if (ne == columnRslt_col_222) doRslt_col_222_NE(info);
		else if (ne == columnRslt_col_223) doRslt_col_223_NE(info);
		else if (ne == columnRslt_col_224) doRslt_col_224_NE(info);
		else if (ne == columnRslt_col_225) doRslt_col_225_NE(info);
		else if (ne == columnRslt_col_226) doRslt_col_226_NE(info);
		else if (ne == columnRslt_col_227) doRslt_col_227_NE(info);
		else if (ne == columnRslt_col_228) doRslt_col_228_NE(info);
		else if (ne == columnRslt_col_229) doRslt_col_229_NE(info);
		else if (ne == columnRslt_col_230) doRslt_col_230_NE(info);
		else if (ne == columnRslt_col_231) doRslt_col_231_NE(info);
		else if (ne == columnRslt_col_232) doRslt_col_232_NE(info);
		else if (ne == columnRslt_col_233) doRslt_col_233_NE(info);
		else if (ne == columnRslt_col_234) doRslt_col_234_NE(info);
		else if (ne == columnRslt_col_235) doRslt_col_235_NE(info);
		else if (ne == columnRslt_col_236) doRslt_col_236_NE(info);
		else if (ne == columnRslt_col_237) doRslt_col_237_NE(info);
		else if (ne == columnRslt_col_238) doRslt_col_238_NE(info);
		else if (ne == columnRslt_col_239) doRslt_col_239_NE(info);
		else if (ne == columnRslt_col_240) doRslt_col_240_NE(info);
		else if (ne == columnRslt_col_241) doRslt_col_241_NE(info);
		else if (ne == columnRslt_col_242) doRslt_col_242_NE(info);
		else if (ne == columnRslt_col_243) doRslt_col_243_NE(info);
		else if (ne == columnRslt_col_244) doRslt_col_244_NE(info);
		else if (ne == columnRslt_col_245) doRslt_col_245_NE(info);
		else if (ne == columnRslt_col_246) doRslt_col_246_NE(info);
		else if (ne == columnRslt_col_247) doRslt_col_247_NE(info);
		else if (ne == columnRslt_col_248) doRslt_col_248_NE(info);
		else if (ne == columnRslt_col_249) doRslt_col_249_NE(info);
		else if (ne == columnRslt_col_250) doRslt_col_250_NE(info);
		else if (ne == columnRslt_col_251) doRslt_col_251_NE(info);
		else if (ne == columnRslt_col_252) doRslt_col_252_NE(info);
		else if (ne == columnRslt_col_253) doRslt_col_253_NE(info);
		else if (ne == columnRslt_col_254) doRslt_col_254_NE(info);
		else if (ne == columnRslt_col_255) doRslt_col_255_NE(info);
		else if (ne == columnRslt_col_256) doRslt_col_256_NE(info);
		else if (ne == columnRslt_col_257) doRslt_col_257_NE(info);
		else if (ne == columnRslt_col_258) doRslt_col_258_NE(info);
		else if (ne == columnRslt_col_259) doRslt_col_259_NE(info);
		else if (ne == columnRslt_col_260) doRslt_col_260_NE(info);
		else if (ne == columnRslt_col_261) doRslt_col_261_NE(info);
		else if (ne == columnRslt_col_262) doRslt_col_262_NE(info);
		else if (ne == columnRslt_col_263) doRslt_col_263_NE(info);
		else if (ne == columnRslt_col_264) doRslt_col_264_NE(info);
		else if (ne == columnRslt_col_265) doRslt_col_265_NE(info);
		else if (ne == columnRslt_col_266) doRslt_col_266_NE(info);
		else if (ne == columnRslt_col_267) doRslt_col_267_NE(info);
		else if (ne == columnRslt_col_268) doRslt_col_268_NE(info);
		else if (ne == columnRslt_col_269) doRslt_col_269_NE(info);
		else if (ne == columnRslt_col_270) doRslt_col_270_NE(info);
		else if (ne == columnRslt_col_271) doRslt_col_271_NE(info);
		else if (ne == columnRslt_col_272) doRslt_col_272_NE(info);
		else if (ne == columnRslt_col_273) doRslt_col_273_NE(info);
		else if (ne == columnRslt_col_274) doRslt_col_274_NE(info);
		else if (ne == columnRslt_col_275) doRslt_col_275_NE(info);
		else if (ne == columnRslt_col_276) doRslt_col_276_NE(info);
		else if (ne == columnRslt_col_277) doRslt_col_277_NE(info);
		else if (ne == columnRslt_col_278) doRslt_col_278_NE(info);
		else if (ne == columnRslt_col_279) doRslt_col_279_NE(info);
		else if (ne == columnRslt_col_280) doRslt_col_280_NE(info);
		else if (ne == columnRslt_col_281) doRslt_col_281_NE(info);
		else if (ne == columnRslt_col_282) doRslt_col_282_NE(info);
		else if (ne == columnRslt_col_283) doRslt_col_283_NE(info);
		else if (ne == columnRslt_col_284) doRslt_col_284_NE(info);
		else if (ne == columnRslt_col_285) doRslt_col_285_NE(info);
		else if (ne == columnRslt_col_286) doRslt_col_286_NE(info);
		else if (ne == columnRslt_col_287) doRslt_col_287_NE(info);
		else if (ne == columnRslt_col_288) doRslt_col_288_NE(info);
		else if (ne == columnRslt_col_289) doRslt_col_289_NE(info);
		else if (ne == columnRslt_col_290) doRslt_col_290_NE(info);
		else if (ne == columnRslt_col_291) doRslt_col_291_NE(info);
		else if (ne == columnRslt_col_292) doRslt_col_292_NE(info);
		else if (ne == columnRslt_col_293) doRslt_col_293_NE(info);
		else if (ne == columnRslt_col_294) doRslt_col_294_NE(info);
		else if (ne == columnRslt_col_295) doRslt_col_295_NE(info);
		else if (ne == columnRslt_col_296) doRslt_col_296_NE(info);
		else if (ne == columnRslt_col_297) doRslt_col_297_NE(info);
		else if (ne == columnRslt_col_298) doRslt_col_298_NE(info);
		else if (ne == columnRslt_col_299) doRslt_col_299_NE(info);
		else if (ne == columnRslt_st_wip_key) doRslt_st_wip_key_NE(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wip_per]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_per_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_wip_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_wip_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_inpt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_inpt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_100]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_100_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_101]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_101_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_102]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_102_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_103]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_103_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_104]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_104_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_105]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_105_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_106]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_106_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_107]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_107_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_108]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_108_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_109]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_109_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_110]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_110_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_111]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_111_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_112]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_112_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_113]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_113_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_114]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_114_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_115]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_115_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_116]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_116_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_117]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_117_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_118]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_118_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_119]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_119_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_120]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_120_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_121]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_121_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_122]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_122_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_123]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_123_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_124]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_124_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_125]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_125_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_126]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_126_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_127]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_127_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_128]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_128_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_129]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_129_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_130]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_130_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_131]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_131_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_132]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_132_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_133]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_133_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_134]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_134_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_135]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_135_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_136]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_136_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_137]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_137_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_138]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_138_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_139]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_139_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_140]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_140_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_141]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_141_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_142]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_142_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_143]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_143_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_144]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_144_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_145]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_145_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_146]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_146_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_147]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_147_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_148]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_148_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_149]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_149_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_150]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_150_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_151]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_151_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_152]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_152_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_153]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_153_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_154]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_154_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_155]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_155_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_156]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_156_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_157]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_157_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_158]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_158_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_159]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_159_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_160]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_160_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_161]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_161_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_162]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_162_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_163]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_163_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_164]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_164_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_165]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_165_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_166]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_166_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_167]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_167_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_168]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_168_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_169]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_169_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_170]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_170_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_171]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_171_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_172]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_172_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_173]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_173_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_174]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_174_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_175]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_175_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_176]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_176_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_177]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_177_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_178]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_178_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_179]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_179_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_180]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_180_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_181]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_181_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_182]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_182_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_183]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_183_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_184]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_184_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_185]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_185_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_186]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_186_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_187]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_187_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_188]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_188_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_189]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_189_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_190]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_190_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_191]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_191_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_192]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_192_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_193]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_193_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_194]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_194_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_195]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_195_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_196]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_196_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_197]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_197_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_198]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_198_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_199]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_199_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_200]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_200_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_201]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_201_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_202]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_202_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_203]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_203_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_204]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_204_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_205]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_205_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_206]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_206_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_207]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_207_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_208]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_208_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_209]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_209_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_210]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_210_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_211]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_211_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_212]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_212_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_213]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_213_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_214]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_214_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_215]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_215_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_216]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_216_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_217]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_217_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_218]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_218_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_219]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_219_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_220]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_220_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_221]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_221_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_222]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_222_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_223]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_223_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_224]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_224_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_225]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_225_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_226]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_226_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_227]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_227_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_228]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_228_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_229]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_229_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_230]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_230_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_231]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_231_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_232]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_232_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_233]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_233_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_234]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_234_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_235]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_235_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_236]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_236_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_237]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_237_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_238]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_238_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_239]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_239_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_240]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_240_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_241]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_241_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_242]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_242_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_243]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_243_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_244]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_244_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_245]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_245_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_246]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_246_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_247]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_247_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_248]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_248_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_249]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_249_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_250]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_250_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_251]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_251_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_252]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_252_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_253]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_253_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_254]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_254_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_255]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_255_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_256]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_256_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_257]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_257_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_258]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_258_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_259]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_259_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_260]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_260_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_261]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_261_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_262]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_262_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_263]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_263_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_264]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_264_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_265]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_265_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_266]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_266_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_267]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_267_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_268]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_268_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_269]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_269_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_270]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_270_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_271]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_271_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_272]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_272_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_273]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_273_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_274]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_274_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_275]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_275_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_276]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_276_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_277]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_277_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_278]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_278_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_279]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_279_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_280]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_280_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_281]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_281_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_282]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_282_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_283]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_283_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_284]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_284_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_285]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_285_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_286]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_286_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_287]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_287_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_288]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_288_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_289]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_289_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_290]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_290_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_291]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_291_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_292]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_292_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_293]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_293_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_294]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_294_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_295]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_295_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_296]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_296_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_297]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_297_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_298]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_298_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_299]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_299_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_wip_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_wip_key_NE(MCEventInfo info){
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
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_oper_act_no) doCnd_oper_act_no_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NX(info);
		else if (nx == DelCnd_calc_grp_cd) doDelCnd_calc_grp_cd_NX(info);
		else if (nx == DelCnd_calc_grp_nm) doDelCnd_calc_grp_nm_NX(info);
		else if (nx == DelCnd_ym) doDelCnd_ym_NX(info);
		else if (nx == DelCnd_wg_cd) doDelCnd_wg_cd_NX(info);
		else if (nx == DelCnd_wg_nm) doDelCnd_wg_nm_NX(info);
		else if (nx == DelCnd_site_cd) doDelCnd_site_cd_NX(info);
		else if (nx == DelCnd_site_nm) doDelCnd_site_nm_NX(info);
		else if (nx == DelCnd_loc_cd) doDelCnd_loc_cd_NX(info);
		else if (nx == DelCnd_loc_nm) doDelCnd_loc_nm_NX(info);
		else if (nx == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NX(info);
		else if (nx == LPnl_disp_expns) doLPnl_disp_expns_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NX(info);
		else if (nx == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_mfg_act_no) doRslt_mfg_act_no_NX(info);
		else if (nx == columnRslt_oper_act_no) doRslt_oper_act_no_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_wip_per) doRslt_wip_per_NX(info);
		else if (nx == columnRslt_ttl) doRslt_ttl_NX(info);
		else if (nx == columnRslt_ttl_wip_amt) doRslt_ttl_wip_amt_NX(info);
		else if (nx == columnRslt_ttl_inpt_amt) doRslt_ttl_inpt_amt_NX(info);
		else if (nx == columnRslt_col_000) doRslt_col_000_NX(info);
		else if (nx == columnRslt_col_001) doRslt_col_001_NX(info);
		else if (nx == columnRslt_col_002) doRslt_col_002_NX(info);
		else if (nx == columnRslt_col_003) doRslt_col_003_NX(info);
		else if (nx == columnRslt_col_004) doRslt_col_004_NX(info);
		else if (nx == columnRslt_col_005) doRslt_col_005_NX(info);
		else if (nx == columnRslt_col_006) doRslt_col_006_NX(info);
		else if (nx == columnRslt_col_007) doRslt_col_007_NX(info);
		else if (nx == columnRslt_col_008) doRslt_col_008_NX(info);
		else if (nx == columnRslt_col_009) doRslt_col_009_NX(info);
		else if (nx == columnRslt_col_010) doRslt_col_010_NX(info);
		else if (nx == columnRslt_col_011) doRslt_col_011_NX(info);
		else if (nx == columnRslt_col_012) doRslt_col_012_NX(info);
		else if (nx == columnRslt_col_013) doRslt_col_013_NX(info);
		else if (nx == columnRslt_col_014) doRslt_col_014_NX(info);
		else if (nx == columnRslt_col_015) doRslt_col_015_NX(info);
		else if (nx == columnRslt_col_016) doRslt_col_016_NX(info);
		else if (nx == columnRslt_col_017) doRslt_col_017_NX(info);
		else if (nx == columnRslt_col_018) doRslt_col_018_NX(info);
		else if (nx == columnRslt_col_019) doRslt_col_019_NX(info);
		else if (nx == columnRslt_col_020) doRslt_col_020_NX(info);
		else if (nx == columnRslt_col_021) doRslt_col_021_NX(info);
		else if (nx == columnRslt_col_022) doRslt_col_022_NX(info);
		else if (nx == columnRslt_col_023) doRslt_col_023_NX(info);
		else if (nx == columnRslt_col_024) doRslt_col_024_NX(info);
		else if (nx == columnRslt_col_025) doRslt_col_025_NX(info);
		else if (nx == columnRslt_col_026) doRslt_col_026_NX(info);
		else if (nx == columnRslt_col_027) doRslt_col_027_NX(info);
		else if (nx == columnRslt_col_028) doRslt_col_028_NX(info);
		else if (nx == columnRslt_col_029) doRslt_col_029_NX(info);
		else if (nx == columnRslt_col_030) doRslt_col_030_NX(info);
		else if (nx == columnRslt_col_031) doRslt_col_031_NX(info);
		else if (nx == columnRslt_col_032) doRslt_col_032_NX(info);
		else if (nx == columnRslt_col_033) doRslt_col_033_NX(info);
		else if (nx == columnRslt_col_034) doRslt_col_034_NX(info);
		else if (nx == columnRslt_col_035) doRslt_col_035_NX(info);
		else if (nx == columnRslt_col_036) doRslt_col_036_NX(info);
		else if (nx == columnRslt_col_037) doRslt_col_037_NX(info);
		else if (nx == columnRslt_col_038) doRslt_col_038_NX(info);
		else if (nx == columnRslt_col_039) doRslt_col_039_NX(info);
		else if (nx == columnRslt_col_040) doRslt_col_040_NX(info);
		else if (nx == columnRslt_col_041) doRslt_col_041_NX(info);
		else if (nx == columnRslt_col_042) doRslt_col_042_NX(info);
		else if (nx == columnRslt_col_043) doRslt_col_043_NX(info);
		else if (nx == columnRslt_col_044) doRslt_col_044_NX(info);
		else if (nx == columnRslt_col_045) doRslt_col_045_NX(info);
		else if (nx == columnRslt_col_046) doRslt_col_046_NX(info);
		else if (nx == columnRslt_col_047) doRslt_col_047_NX(info);
		else if (nx == columnRslt_col_048) doRslt_col_048_NX(info);
		else if (nx == columnRslt_col_049) doRslt_col_049_NX(info);
		else if (nx == columnRslt_col_050) doRslt_col_050_NX(info);
		else if (nx == columnRslt_col_051) doRslt_col_051_NX(info);
		else if (nx == columnRslt_col_052) doRslt_col_052_NX(info);
		else if (nx == columnRslt_col_053) doRslt_col_053_NX(info);
		else if (nx == columnRslt_col_054) doRslt_col_054_NX(info);
		else if (nx == columnRslt_col_055) doRslt_col_055_NX(info);
		else if (nx == columnRslt_col_056) doRslt_col_056_NX(info);
		else if (nx == columnRslt_col_057) doRslt_col_057_NX(info);
		else if (nx == columnRslt_col_058) doRslt_col_058_NX(info);
		else if (nx == columnRslt_col_059) doRslt_col_059_NX(info);
		else if (nx == columnRslt_col_060) doRslt_col_060_NX(info);
		else if (nx == columnRslt_col_061) doRslt_col_061_NX(info);
		else if (nx == columnRslt_col_062) doRslt_col_062_NX(info);
		else if (nx == columnRslt_col_063) doRslt_col_063_NX(info);
		else if (nx == columnRslt_col_064) doRslt_col_064_NX(info);
		else if (nx == columnRslt_col_065) doRslt_col_065_NX(info);
		else if (nx == columnRslt_col_066) doRslt_col_066_NX(info);
		else if (nx == columnRslt_col_067) doRslt_col_067_NX(info);
		else if (nx == columnRslt_col_068) doRslt_col_068_NX(info);
		else if (nx == columnRslt_col_069) doRslt_col_069_NX(info);
		else if (nx == columnRslt_col_070) doRslt_col_070_NX(info);
		else if (nx == columnRslt_col_071) doRslt_col_071_NX(info);
		else if (nx == columnRslt_col_072) doRslt_col_072_NX(info);
		else if (nx == columnRslt_col_073) doRslt_col_073_NX(info);
		else if (nx == columnRslt_col_074) doRslt_col_074_NX(info);
		else if (nx == columnRslt_col_075) doRslt_col_075_NX(info);
		else if (nx == columnRslt_col_076) doRslt_col_076_NX(info);
		else if (nx == columnRslt_col_077) doRslt_col_077_NX(info);
		else if (nx == columnRslt_col_078) doRslt_col_078_NX(info);
		else if (nx == columnRslt_col_079) doRslt_col_079_NX(info);
		else if (nx == columnRslt_col_080) doRslt_col_080_NX(info);
		else if (nx == columnRslt_col_081) doRslt_col_081_NX(info);
		else if (nx == columnRslt_col_082) doRslt_col_082_NX(info);
		else if (nx == columnRslt_col_083) doRslt_col_083_NX(info);
		else if (nx == columnRslt_col_084) doRslt_col_084_NX(info);
		else if (nx == columnRslt_col_085) doRslt_col_085_NX(info);
		else if (nx == columnRslt_col_086) doRslt_col_086_NX(info);
		else if (nx == columnRslt_col_087) doRslt_col_087_NX(info);
		else if (nx == columnRslt_col_088) doRslt_col_088_NX(info);
		else if (nx == columnRslt_col_089) doRslt_col_089_NX(info);
		else if (nx == columnRslt_col_090) doRslt_col_090_NX(info);
		else if (nx == columnRslt_col_091) doRslt_col_091_NX(info);
		else if (nx == columnRslt_col_092) doRslt_col_092_NX(info);
		else if (nx == columnRslt_col_093) doRslt_col_093_NX(info);
		else if (nx == columnRslt_col_094) doRslt_col_094_NX(info);
		else if (nx == columnRslt_col_095) doRslt_col_095_NX(info);
		else if (nx == columnRslt_col_096) doRslt_col_096_NX(info);
		else if (nx == columnRslt_col_097) doRslt_col_097_NX(info);
		else if (nx == columnRslt_col_098) doRslt_col_098_NX(info);
		else if (nx == columnRslt_col_099) doRslt_col_099_NX(info);
		else if (nx == columnRslt_col_100) doRslt_col_100_NX(info);
		else if (nx == columnRslt_col_101) doRslt_col_101_NX(info);
		else if (nx == columnRslt_col_102) doRslt_col_102_NX(info);
		else if (nx == columnRslt_col_103) doRslt_col_103_NX(info);
		else if (nx == columnRslt_col_104) doRslt_col_104_NX(info);
		else if (nx == columnRslt_col_105) doRslt_col_105_NX(info);
		else if (nx == columnRslt_col_106) doRslt_col_106_NX(info);
		else if (nx == columnRslt_col_107) doRslt_col_107_NX(info);
		else if (nx == columnRslt_col_108) doRslt_col_108_NX(info);
		else if (nx == columnRslt_col_109) doRslt_col_109_NX(info);
		else if (nx == columnRslt_col_110) doRslt_col_110_NX(info);
		else if (nx == columnRslt_col_111) doRslt_col_111_NX(info);
		else if (nx == columnRslt_col_112) doRslt_col_112_NX(info);
		else if (nx == columnRslt_col_113) doRslt_col_113_NX(info);
		else if (nx == columnRslt_col_114) doRslt_col_114_NX(info);
		else if (nx == columnRslt_col_115) doRslt_col_115_NX(info);
		else if (nx == columnRslt_col_116) doRslt_col_116_NX(info);
		else if (nx == columnRslt_col_117) doRslt_col_117_NX(info);
		else if (nx == columnRslt_col_118) doRslt_col_118_NX(info);
		else if (nx == columnRslt_col_119) doRslt_col_119_NX(info);
		else if (nx == columnRslt_col_120) doRslt_col_120_NX(info);
		else if (nx == columnRslt_col_121) doRslt_col_121_NX(info);
		else if (nx == columnRslt_col_122) doRslt_col_122_NX(info);
		else if (nx == columnRslt_col_123) doRslt_col_123_NX(info);
		else if (nx == columnRslt_col_124) doRslt_col_124_NX(info);
		else if (nx == columnRslt_col_125) doRslt_col_125_NX(info);
		else if (nx == columnRslt_col_126) doRslt_col_126_NX(info);
		else if (nx == columnRslt_col_127) doRslt_col_127_NX(info);
		else if (nx == columnRslt_col_128) doRslt_col_128_NX(info);
		else if (nx == columnRslt_col_129) doRslt_col_129_NX(info);
		else if (nx == columnRslt_col_130) doRslt_col_130_NX(info);
		else if (nx == columnRslt_col_131) doRslt_col_131_NX(info);
		else if (nx == columnRslt_col_132) doRslt_col_132_NX(info);
		else if (nx == columnRslt_col_133) doRslt_col_133_NX(info);
		else if (nx == columnRslt_col_134) doRslt_col_134_NX(info);
		else if (nx == columnRslt_col_135) doRslt_col_135_NX(info);
		else if (nx == columnRslt_col_136) doRslt_col_136_NX(info);
		else if (nx == columnRslt_col_137) doRslt_col_137_NX(info);
		else if (nx == columnRslt_col_138) doRslt_col_138_NX(info);
		else if (nx == columnRslt_col_139) doRslt_col_139_NX(info);
		else if (nx == columnRslt_col_140) doRslt_col_140_NX(info);
		else if (nx == columnRslt_col_141) doRslt_col_141_NX(info);
		else if (nx == columnRslt_col_142) doRslt_col_142_NX(info);
		else if (nx == columnRslt_col_143) doRslt_col_143_NX(info);
		else if (nx == columnRslt_col_144) doRslt_col_144_NX(info);
		else if (nx == columnRslt_col_145) doRslt_col_145_NX(info);
		else if (nx == columnRslt_col_146) doRslt_col_146_NX(info);
		else if (nx == columnRslt_col_147) doRslt_col_147_NX(info);
		else if (nx == columnRslt_col_148) doRslt_col_148_NX(info);
		else if (nx == columnRslt_col_149) doRslt_col_149_NX(info);
		else if (nx == columnRslt_col_150) doRslt_col_150_NX(info);
		else if (nx == columnRslt_col_151) doRslt_col_151_NX(info);
		else if (nx == columnRslt_col_152) doRslt_col_152_NX(info);
		else if (nx == columnRslt_col_153) doRslt_col_153_NX(info);
		else if (nx == columnRslt_col_154) doRslt_col_154_NX(info);
		else if (nx == columnRslt_col_155) doRslt_col_155_NX(info);
		else if (nx == columnRslt_col_156) doRslt_col_156_NX(info);
		else if (nx == columnRslt_col_157) doRslt_col_157_NX(info);
		else if (nx == columnRslt_col_158) doRslt_col_158_NX(info);
		else if (nx == columnRslt_col_159) doRslt_col_159_NX(info);
		else if (nx == columnRslt_col_160) doRslt_col_160_NX(info);
		else if (nx == columnRslt_col_161) doRslt_col_161_NX(info);
		else if (nx == columnRslt_col_162) doRslt_col_162_NX(info);
		else if (nx == columnRslt_col_163) doRslt_col_163_NX(info);
		else if (nx == columnRslt_col_164) doRslt_col_164_NX(info);
		else if (nx == columnRslt_col_165) doRslt_col_165_NX(info);
		else if (nx == columnRslt_col_166) doRslt_col_166_NX(info);
		else if (nx == columnRslt_col_167) doRslt_col_167_NX(info);
		else if (nx == columnRslt_col_168) doRslt_col_168_NX(info);
		else if (nx == columnRslt_col_169) doRslt_col_169_NX(info);
		else if (nx == columnRslt_col_170) doRslt_col_170_NX(info);
		else if (nx == columnRslt_col_171) doRslt_col_171_NX(info);
		else if (nx == columnRslt_col_172) doRslt_col_172_NX(info);
		else if (nx == columnRslt_col_173) doRslt_col_173_NX(info);
		else if (nx == columnRslt_col_174) doRslt_col_174_NX(info);
		else if (nx == columnRslt_col_175) doRslt_col_175_NX(info);
		else if (nx == columnRslt_col_176) doRslt_col_176_NX(info);
		else if (nx == columnRslt_col_177) doRslt_col_177_NX(info);
		else if (nx == columnRslt_col_178) doRslt_col_178_NX(info);
		else if (nx == columnRslt_col_179) doRslt_col_179_NX(info);
		else if (nx == columnRslt_col_180) doRslt_col_180_NX(info);
		else if (nx == columnRslt_col_181) doRslt_col_181_NX(info);
		else if (nx == columnRslt_col_182) doRslt_col_182_NX(info);
		else if (nx == columnRslt_col_183) doRslt_col_183_NX(info);
		else if (nx == columnRslt_col_184) doRslt_col_184_NX(info);
		else if (nx == columnRslt_col_185) doRslt_col_185_NX(info);
		else if (nx == columnRslt_col_186) doRslt_col_186_NX(info);
		else if (nx == columnRslt_col_187) doRslt_col_187_NX(info);
		else if (nx == columnRslt_col_188) doRslt_col_188_NX(info);
		else if (nx == columnRslt_col_189) doRslt_col_189_NX(info);
		else if (nx == columnRslt_col_190) doRslt_col_190_NX(info);
		else if (nx == columnRslt_col_191) doRslt_col_191_NX(info);
		else if (nx == columnRslt_col_192) doRslt_col_192_NX(info);
		else if (nx == columnRslt_col_193) doRslt_col_193_NX(info);
		else if (nx == columnRslt_col_194) doRslt_col_194_NX(info);
		else if (nx == columnRslt_col_195) doRslt_col_195_NX(info);
		else if (nx == columnRslt_col_196) doRslt_col_196_NX(info);
		else if (nx == columnRslt_col_197) doRslt_col_197_NX(info);
		else if (nx == columnRslt_col_198) doRslt_col_198_NX(info);
		else if (nx == columnRslt_col_199) doRslt_col_199_NX(info);
		else if (nx == columnRslt_col_200) doRslt_col_200_NX(info);
		else if (nx == columnRslt_col_201) doRslt_col_201_NX(info);
		else if (nx == columnRslt_col_202) doRslt_col_202_NX(info);
		else if (nx == columnRslt_col_203) doRslt_col_203_NX(info);
		else if (nx == columnRslt_col_204) doRslt_col_204_NX(info);
		else if (nx == columnRslt_col_205) doRslt_col_205_NX(info);
		else if (nx == columnRslt_col_206) doRslt_col_206_NX(info);
		else if (nx == columnRslt_col_207) doRslt_col_207_NX(info);
		else if (nx == columnRslt_col_208) doRslt_col_208_NX(info);
		else if (nx == columnRslt_col_209) doRslt_col_209_NX(info);
		else if (nx == columnRslt_col_210) doRslt_col_210_NX(info);
		else if (nx == columnRslt_col_211) doRslt_col_211_NX(info);
		else if (nx == columnRslt_col_212) doRslt_col_212_NX(info);
		else if (nx == columnRslt_col_213) doRslt_col_213_NX(info);
		else if (nx == columnRslt_col_214) doRslt_col_214_NX(info);
		else if (nx == columnRslt_col_215) doRslt_col_215_NX(info);
		else if (nx == columnRslt_col_216) doRslt_col_216_NX(info);
		else if (nx == columnRslt_col_217) doRslt_col_217_NX(info);
		else if (nx == columnRslt_col_218) doRslt_col_218_NX(info);
		else if (nx == columnRslt_col_219) doRslt_col_219_NX(info);
		else if (nx == columnRslt_col_220) doRslt_col_220_NX(info);
		else if (nx == columnRslt_col_221) doRslt_col_221_NX(info);
		else if (nx == columnRslt_col_222) doRslt_col_222_NX(info);
		else if (nx == columnRslt_col_223) doRslt_col_223_NX(info);
		else if (nx == columnRslt_col_224) doRslt_col_224_NX(info);
		else if (nx == columnRslt_col_225) doRslt_col_225_NX(info);
		else if (nx == columnRslt_col_226) doRslt_col_226_NX(info);
		else if (nx == columnRslt_col_227) doRslt_col_227_NX(info);
		else if (nx == columnRslt_col_228) doRslt_col_228_NX(info);
		else if (nx == columnRslt_col_229) doRslt_col_229_NX(info);
		else if (nx == columnRslt_col_230) doRslt_col_230_NX(info);
		else if (nx == columnRslt_col_231) doRslt_col_231_NX(info);
		else if (nx == columnRslt_col_232) doRslt_col_232_NX(info);
		else if (nx == columnRslt_col_233) doRslt_col_233_NX(info);
		else if (nx == columnRslt_col_234) doRslt_col_234_NX(info);
		else if (nx == columnRslt_col_235) doRslt_col_235_NX(info);
		else if (nx == columnRslt_col_236) doRslt_col_236_NX(info);
		else if (nx == columnRslt_col_237) doRslt_col_237_NX(info);
		else if (nx == columnRslt_col_238) doRslt_col_238_NX(info);
		else if (nx == columnRslt_col_239) doRslt_col_239_NX(info);
		else if (nx == columnRslt_col_240) doRslt_col_240_NX(info);
		else if (nx == columnRslt_col_241) doRslt_col_241_NX(info);
		else if (nx == columnRslt_col_242) doRslt_col_242_NX(info);
		else if (nx == columnRslt_col_243) doRslt_col_243_NX(info);
		else if (nx == columnRslt_col_244) doRslt_col_244_NX(info);
		else if (nx == columnRslt_col_245) doRslt_col_245_NX(info);
		else if (nx == columnRslt_col_246) doRslt_col_246_NX(info);
		else if (nx == columnRslt_col_247) doRslt_col_247_NX(info);
		else if (nx == columnRslt_col_248) doRslt_col_248_NX(info);
		else if (nx == columnRslt_col_249) doRslt_col_249_NX(info);
		else if (nx == columnRslt_col_250) doRslt_col_250_NX(info);
		else if (nx == columnRslt_col_251) doRslt_col_251_NX(info);
		else if (nx == columnRslt_col_252) doRslt_col_252_NX(info);
		else if (nx == columnRslt_col_253) doRslt_col_253_NX(info);
		else if (nx == columnRslt_col_254) doRslt_col_254_NX(info);
		else if (nx == columnRslt_col_255) doRslt_col_255_NX(info);
		else if (nx == columnRslt_col_256) doRslt_col_256_NX(info);
		else if (nx == columnRslt_col_257) doRslt_col_257_NX(info);
		else if (nx == columnRslt_col_258) doRslt_col_258_NX(info);
		else if (nx == columnRslt_col_259) doRslt_col_259_NX(info);
		else if (nx == columnRslt_col_260) doRslt_col_260_NX(info);
		else if (nx == columnRslt_col_261) doRslt_col_261_NX(info);
		else if (nx == columnRslt_col_262) doRslt_col_262_NX(info);
		else if (nx == columnRslt_col_263) doRslt_col_263_NX(info);
		else if (nx == columnRslt_col_264) doRslt_col_264_NX(info);
		else if (nx == columnRslt_col_265) doRslt_col_265_NX(info);
		else if (nx == columnRslt_col_266) doRslt_col_266_NX(info);
		else if (nx == columnRslt_col_267) doRslt_col_267_NX(info);
		else if (nx == columnRslt_col_268) doRslt_col_268_NX(info);
		else if (nx == columnRslt_col_269) doRslt_col_269_NX(info);
		else if (nx == columnRslt_col_270) doRslt_col_270_NX(info);
		else if (nx == columnRslt_col_271) doRslt_col_271_NX(info);
		else if (nx == columnRslt_col_272) doRslt_col_272_NX(info);
		else if (nx == columnRslt_col_273) doRslt_col_273_NX(info);
		else if (nx == columnRslt_col_274) doRslt_col_274_NX(info);
		else if (nx == columnRslt_col_275) doRslt_col_275_NX(info);
		else if (nx == columnRslt_col_276) doRslt_col_276_NX(info);
		else if (nx == columnRslt_col_277) doRslt_col_277_NX(info);
		else if (nx == columnRslt_col_278) doRslt_col_278_NX(info);
		else if (nx == columnRslt_col_279) doRslt_col_279_NX(info);
		else if (nx == columnRslt_col_280) doRslt_col_280_NX(info);
		else if (nx == columnRslt_col_281) doRslt_col_281_NX(info);
		else if (nx == columnRslt_col_282) doRslt_col_282_NX(info);
		else if (nx == columnRslt_col_283) doRslt_col_283_NX(info);
		else if (nx == columnRslt_col_284) doRslt_col_284_NX(info);
		else if (nx == columnRslt_col_285) doRslt_col_285_NX(info);
		else if (nx == columnRslt_col_286) doRslt_col_286_NX(info);
		else if (nx == columnRslt_col_287) doRslt_col_287_NX(info);
		else if (nx == columnRslt_col_288) doRslt_col_288_NX(info);
		else if (nx == columnRslt_col_289) doRslt_col_289_NX(info);
		else if (nx == columnRslt_col_290) doRslt_col_290_NX(info);
		else if (nx == columnRslt_col_291) doRslt_col_291_NX(info);
		else if (nx == columnRslt_col_292) doRslt_col_292_NX(info);
		else if (nx == columnRslt_col_293) doRslt_col_293_NX(info);
		else if (nx == columnRslt_col_294) doRslt_col_294_NX(info);
		else if (nx == columnRslt_col_295) doRslt_col_295_NX(info);
		else if (nx == columnRslt_col_296) doRslt_col_296_NX(info);
		else if (nx == columnRslt_col_297) doRslt_col_297_NX(info);
		else if (nx == columnRslt_col_298) doRslt_col_298_NX(info);
		else if (nx == columnRslt_col_299) doRslt_col_299_NX(info);
		else if (nx == columnRslt_st_wip_key) doRslt_st_wip_key_NX(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wip_per]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_per_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_wip_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_wip_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_inpt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_inpt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_100]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_100_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_101]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_101_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_102]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_102_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_103]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_103_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_104]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_104_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_105]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_105_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_106]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_106_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_107]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_107_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_108]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_108_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_109]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_109_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_110]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_110_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_111]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_111_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_112]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_112_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_113]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_113_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_114]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_114_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_115]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_115_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_116]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_116_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_117]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_117_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_118]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_118_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_119]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_119_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_120]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_120_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_121]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_121_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_122]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_122_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_123]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_123_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_124]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_124_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_125]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_125_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_126]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_126_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_127]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_127_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_128]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_128_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_129]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_129_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_130]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_130_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_131]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_131_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_132]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_132_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_133]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_133_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_134]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_134_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_135]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_135_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_136]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_136_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_137]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_137_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_138]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_138_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_139]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_139_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_140]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_140_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_141]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_141_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_142]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_142_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_143]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_143_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_144]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_144_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_145]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_145_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_146]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_146_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_147]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_147_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_148]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_148_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_149]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_149_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_150]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_150_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_151]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_151_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_152]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_152_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_153]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_153_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_154]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_154_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_155]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_155_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_156]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_156_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_157]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_157_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_158]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_158_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_159]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_159_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_160]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_160_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_161]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_161_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_162]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_162_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_163]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_163_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_164]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_164_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_165]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_165_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_166]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_166_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_167]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_167_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_168]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_168_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_169]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_169_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_170]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_170_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_171]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_171_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_172]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_172_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_173]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_173_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_174]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_174_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_175]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_175_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_176]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_176_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_177]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_177_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_178]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_178_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_179]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_179_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_180]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_180_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_181]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_181_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_182]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_182_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_183]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_183_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_184]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_184_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_185]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_185_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_186]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_186_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_187]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_187_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_188]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_188_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_189]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_189_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_190]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_190_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_191]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_191_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_192]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_192_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_193]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_193_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_194]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_194_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_195]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_195_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_196]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_196_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_197]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_197_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_198]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_198_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_199]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_199_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_200]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_200_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_201]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_201_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_202]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_202_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_203]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_203_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_204]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_204_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_205]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_205_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_206]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_206_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_207]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_207_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_208]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_208_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_209]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_209_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_210]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_210_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_211]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_211_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_212]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_212_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_213]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_213_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_214]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_214_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_215]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_215_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_216]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_216_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_217]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_217_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_218]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_218_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_219]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_219_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_220]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_220_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_221]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_221_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_222]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_222_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_223]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_223_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_224]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_224_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_225]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_225_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_226]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_226_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_227]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_227_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_228]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_228_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_229]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_229_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_230]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_230_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_231]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_231_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_232]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_232_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_233]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_233_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_234]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_234_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_235]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_235_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_236]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_236_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_237]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_237_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_238]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_238_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_239]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_239_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_240]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_240_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_241]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_241_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_242]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_242_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_243]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_243_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_244]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_244_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_245]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_245_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_246]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_246_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_247]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_247_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_248]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_248_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_249]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_249_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_250]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_250_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_251]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_251_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_252]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_252_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_253]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_253_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_254]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_254_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_255]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_255_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_256]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_256_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_257]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_257_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_258]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_258_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_259]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_259_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_260]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_260_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_261]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_261_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_262]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_262_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_263]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_263_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_264]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_264_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_265]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_265_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_266]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_266_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_267]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_267_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_268]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_268_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_269]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_269_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_270]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_270_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_271]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_271_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_272]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_272_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_273]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_273_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_274]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_274_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_275]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_275_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_276]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_276_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_277]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_277_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_278]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_278_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_279]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_279_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_280]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_280_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_281]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_281_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_282]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_282_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_283]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_283_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_284]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_284_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_285]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_285_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_286]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_286_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_287]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_287_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_288]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_288_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_289]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_289_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_290]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_290_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_291]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_291_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_292]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_292_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_293]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_293_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_294]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_294_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_295]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_295_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_296]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_296_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_297]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_297_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_298]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_298_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_299]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_299_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_wip_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_wip_key_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_oper_act_no) doCnd_oper_act_no_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_LC(info);
		else if (lc == DelCnd_calc_grp_cd) doDelCnd_calc_grp_cd_LC(info);
		else if (lc == DelCnd_calc_grp_nm) doDelCnd_calc_grp_nm_LC(info);
		else if (lc == DelCnd_ym) doDelCnd_ym_LC(info);
		else if (lc == DelCnd_wg_cd) doDelCnd_wg_cd_LC(info);
		else if (lc == DelCnd_wg_nm) doDelCnd_wg_nm_LC(info);
		else if (lc == DelCnd_site_cd) doDelCnd_site_cd_LC(info);
		else if (lc == DelCnd_site_nm) doDelCnd_site_nm_LC(info);
		else if (lc == DelCnd_loc_cd) doDelCnd_loc_cd_LC(info);
		else if (lc == DelCnd_loc_nm) doDelCnd_loc_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_LC(info);
		else if (lc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_mfg_act_no) doRslt_mfg_act_no_LC(info);
		else if (lc == columnRslt_oper_act_no) doRslt_oper_act_no_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_wip_per) doRslt_wip_per_LC(info);
		else if (lc == columnRslt_ttl) doRslt_ttl_LC(info);
		else if (lc == columnRslt_ttl_wip_amt) doRslt_ttl_wip_amt_LC(info);
		else if (lc == columnRslt_ttl_inpt_amt) doRslt_ttl_inpt_amt_LC(info);
		else if (lc == columnRslt_col_000) doRslt_col_000_LC(info);
		else if (lc == columnRslt_col_001) doRslt_col_001_LC(info);
		else if (lc == columnRslt_col_002) doRslt_col_002_LC(info);
		else if (lc == columnRslt_col_003) doRslt_col_003_LC(info);
		else if (lc == columnRslt_col_004) doRslt_col_004_LC(info);
		else if (lc == columnRslt_col_005) doRslt_col_005_LC(info);
		else if (lc == columnRslt_col_006) doRslt_col_006_LC(info);
		else if (lc == columnRslt_col_007) doRslt_col_007_LC(info);
		else if (lc == columnRslt_col_008) doRslt_col_008_LC(info);
		else if (lc == columnRslt_col_009) doRslt_col_009_LC(info);
		else if (lc == columnRslt_col_010) doRslt_col_010_LC(info);
		else if (lc == columnRslt_col_011) doRslt_col_011_LC(info);
		else if (lc == columnRslt_col_012) doRslt_col_012_LC(info);
		else if (lc == columnRslt_col_013) doRslt_col_013_LC(info);
		else if (lc == columnRslt_col_014) doRslt_col_014_LC(info);
		else if (lc == columnRslt_col_015) doRslt_col_015_LC(info);
		else if (lc == columnRslt_col_016) doRslt_col_016_LC(info);
		else if (lc == columnRslt_col_017) doRslt_col_017_LC(info);
		else if (lc == columnRslt_col_018) doRslt_col_018_LC(info);
		else if (lc == columnRslt_col_019) doRslt_col_019_LC(info);
		else if (lc == columnRslt_col_020) doRslt_col_020_LC(info);
		else if (lc == columnRslt_col_021) doRslt_col_021_LC(info);
		else if (lc == columnRslt_col_022) doRslt_col_022_LC(info);
		else if (lc == columnRslt_col_023) doRslt_col_023_LC(info);
		else if (lc == columnRslt_col_024) doRslt_col_024_LC(info);
		else if (lc == columnRslt_col_025) doRslt_col_025_LC(info);
		else if (lc == columnRslt_col_026) doRslt_col_026_LC(info);
		else if (lc == columnRslt_col_027) doRslt_col_027_LC(info);
		else if (lc == columnRslt_col_028) doRslt_col_028_LC(info);
		else if (lc == columnRslt_col_029) doRslt_col_029_LC(info);
		else if (lc == columnRslt_col_030) doRslt_col_030_LC(info);
		else if (lc == columnRslt_col_031) doRslt_col_031_LC(info);
		else if (lc == columnRslt_col_032) doRslt_col_032_LC(info);
		else if (lc == columnRslt_col_033) doRslt_col_033_LC(info);
		else if (lc == columnRslt_col_034) doRslt_col_034_LC(info);
		else if (lc == columnRslt_col_035) doRslt_col_035_LC(info);
		else if (lc == columnRslt_col_036) doRslt_col_036_LC(info);
		else if (lc == columnRslt_col_037) doRslt_col_037_LC(info);
		else if (lc == columnRslt_col_038) doRslt_col_038_LC(info);
		else if (lc == columnRslt_col_039) doRslt_col_039_LC(info);
		else if (lc == columnRslt_col_040) doRslt_col_040_LC(info);
		else if (lc == columnRslt_col_041) doRslt_col_041_LC(info);
		else if (lc == columnRslt_col_042) doRslt_col_042_LC(info);
		else if (lc == columnRslt_col_043) doRslt_col_043_LC(info);
		else if (lc == columnRslt_col_044) doRslt_col_044_LC(info);
		else if (lc == columnRslt_col_045) doRslt_col_045_LC(info);
		else if (lc == columnRslt_col_046) doRslt_col_046_LC(info);
		else if (lc == columnRslt_col_047) doRslt_col_047_LC(info);
		else if (lc == columnRslt_col_048) doRslt_col_048_LC(info);
		else if (lc == columnRslt_col_049) doRslt_col_049_LC(info);
		else if (lc == columnRslt_col_050) doRslt_col_050_LC(info);
		else if (lc == columnRslt_col_051) doRslt_col_051_LC(info);
		else if (lc == columnRslt_col_052) doRslt_col_052_LC(info);
		else if (lc == columnRslt_col_053) doRslt_col_053_LC(info);
		else if (lc == columnRslt_col_054) doRslt_col_054_LC(info);
		else if (lc == columnRslt_col_055) doRslt_col_055_LC(info);
		else if (lc == columnRslt_col_056) doRslt_col_056_LC(info);
		else if (lc == columnRslt_col_057) doRslt_col_057_LC(info);
		else if (lc == columnRslt_col_058) doRslt_col_058_LC(info);
		else if (lc == columnRslt_col_059) doRslt_col_059_LC(info);
		else if (lc == columnRslt_col_060) doRslt_col_060_LC(info);
		else if (lc == columnRslt_col_061) doRslt_col_061_LC(info);
		else if (lc == columnRslt_col_062) doRslt_col_062_LC(info);
		else if (lc == columnRslt_col_063) doRslt_col_063_LC(info);
		else if (lc == columnRslt_col_064) doRslt_col_064_LC(info);
		else if (lc == columnRslt_col_065) doRslt_col_065_LC(info);
		else if (lc == columnRslt_col_066) doRslt_col_066_LC(info);
		else if (lc == columnRslt_col_067) doRslt_col_067_LC(info);
		else if (lc == columnRslt_col_068) doRslt_col_068_LC(info);
		else if (lc == columnRslt_col_069) doRslt_col_069_LC(info);
		else if (lc == columnRslt_col_070) doRslt_col_070_LC(info);
		else if (lc == columnRslt_col_071) doRslt_col_071_LC(info);
		else if (lc == columnRslt_col_072) doRslt_col_072_LC(info);
		else if (lc == columnRslt_col_073) doRslt_col_073_LC(info);
		else if (lc == columnRslt_col_074) doRslt_col_074_LC(info);
		else if (lc == columnRslt_col_075) doRslt_col_075_LC(info);
		else if (lc == columnRslt_col_076) doRslt_col_076_LC(info);
		else if (lc == columnRslt_col_077) doRslt_col_077_LC(info);
		else if (lc == columnRslt_col_078) doRslt_col_078_LC(info);
		else if (lc == columnRslt_col_079) doRslt_col_079_LC(info);
		else if (lc == columnRslt_col_080) doRslt_col_080_LC(info);
		else if (lc == columnRslt_col_081) doRslt_col_081_LC(info);
		else if (lc == columnRslt_col_082) doRslt_col_082_LC(info);
		else if (lc == columnRslt_col_083) doRslt_col_083_LC(info);
		else if (lc == columnRslt_col_084) doRslt_col_084_LC(info);
		else if (lc == columnRslt_col_085) doRslt_col_085_LC(info);
		else if (lc == columnRslt_col_086) doRslt_col_086_LC(info);
		else if (lc == columnRslt_col_087) doRslt_col_087_LC(info);
		else if (lc == columnRslt_col_088) doRslt_col_088_LC(info);
		else if (lc == columnRslt_col_089) doRslt_col_089_LC(info);
		else if (lc == columnRslt_col_090) doRslt_col_090_LC(info);
		else if (lc == columnRslt_col_091) doRslt_col_091_LC(info);
		else if (lc == columnRslt_col_092) doRslt_col_092_LC(info);
		else if (lc == columnRslt_col_093) doRslt_col_093_LC(info);
		else if (lc == columnRslt_col_094) doRslt_col_094_LC(info);
		else if (lc == columnRslt_col_095) doRslt_col_095_LC(info);
		else if (lc == columnRslt_col_096) doRslt_col_096_LC(info);
		else if (lc == columnRslt_col_097) doRslt_col_097_LC(info);
		else if (lc == columnRslt_col_098) doRslt_col_098_LC(info);
		else if (lc == columnRslt_col_099) doRslt_col_099_LC(info);
		else if (lc == columnRslt_col_100) doRslt_col_100_LC(info);
		else if (lc == columnRslt_col_101) doRslt_col_101_LC(info);
		else if (lc == columnRslt_col_102) doRslt_col_102_LC(info);
		else if (lc == columnRslt_col_103) doRslt_col_103_LC(info);
		else if (lc == columnRslt_col_104) doRslt_col_104_LC(info);
		else if (lc == columnRslt_col_105) doRslt_col_105_LC(info);
		else if (lc == columnRslt_col_106) doRslt_col_106_LC(info);
		else if (lc == columnRslt_col_107) doRslt_col_107_LC(info);
		else if (lc == columnRslt_col_108) doRslt_col_108_LC(info);
		else if (lc == columnRslt_col_109) doRslt_col_109_LC(info);
		else if (lc == columnRslt_col_110) doRslt_col_110_LC(info);
		else if (lc == columnRslt_col_111) doRslt_col_111_LC(info);
		else if (lc == columnRslt_col_112) doRslt_col_112_LC(info);
		else if (lc == columnRslt_col_113) doRslt_col_113_LC(info);
		else if (lc == columnRslt_col_114) doRslt_col_114_LC(info);
		else if (lc == columnRslt_col_115) doRslt_col_115_LC(info);
		else if (lc == columnRslt_col_116) doRslt_col_116_LC(info);
		else if (lc == columnRslt_col_117) doRslt_col_117_LC(info);
		else if (lc == columnRslt_col_118) doRslt_col_118_LC(info);
		else if (lc == columnRslt_col_119) doRslt_col_119_LC(info);
		else if (lc == columnRslt_col_120) doRslt_col_120_LC(info);
		else if (lc == columnRslt_col_121) doRslt_col_121_LC(info);
		else if (lc == columnRslt_col_122) doRslt_col_122_LC(info);
		else if (lc == columnRslt_col_123) doRslt_col_123_LC(info);
		else if (lc == columnRslt_col_124) doRslt_col_124_LC(info);
		else if (lc == columnRslt_col_125) doRslt_col_125_LC(info);
		else if (lc == columnRslt_col_126) doRslt_col_126_LC(info);
		else if (lc == columnRslt_col_127) doRslt_col_127_LC(info);
		else if (lc == columnRslt_col_128) doRslt_col_128_LC(info);
		else if (lc == columnRslt_col_129) doRslt_col_129_LC(info);
		else if (lc == columnRslt_col_130) doRslt_col_130_LC(info);
		else if (lc == columnRslt_col_131) doRslt_col_131_LC(info);
		else if (lc == columnRslt_col_132) doRslt_col_132_LC(info);
		else if (lc == columnRslt_col_133) doRslt_col_133_LC(info);
		else if (lc == columnRslt_col_134) doRslt_col_134_LC(info);
		else if (lc == columnRslt_col_135) doRslt_col_135_LC(info);
		else if (lc == columnRslt_col_136) doRslt_col_136_LC(info);
		else if (lc == columnRslt_col_137) doRslt_col_137_LC(info);
		else if (lc == columnRslt_col_138) doRslt_col_138_LC(info);
		else if (lc == columnRslt_col_139) doRslt_col_139_LC(info);
		else if (lc == columnRslt_col_140) doRslt_col_140_LC(info);
		else if (lc == columnRslt_col_141) doRslt_col_141_LC(info);
		else if (lc == columnRslt_col_142) doRslt_col_142_LC(info);
		else if (lc == columnRslt_col_143) doRslt_col_143_LC(info);
		else if (lc == columnRslt_col_144) doRslt_col_144_LC(info);
		else if (lc == columnRslt_col_145) doRslt_col_145_LC(info);
		else if (lc == columnRslt_col_146) doRslt_col_146_LC(info);
		else if (lc == columnRslt_col_147) doRslt_col_147_LC(info);
		else if (lc == columnRslt_col_148) doRslt_col_148_LC(info);
		else if (lc == columnRslt_col_149) doRslt_col_149_LC(info);
		else if (lc == columnRslt_col_150) doRslt_col_150_LC(info);
		else if (lc == columnRslt_col_151) doRslt_col_151_LC(info);
		else if (lc == columnRslt_col_152) doRslt_col_152_LC(info);
		else if (lc == columnRslt_col_153) doRslt_col_153_LC(info);
		else if (lc == columnRslt_col_154) doRslt_col_154_LC(info);
		else if (lc == columnRslt_col_155) doRslt_col_155_LC(info);
		else if (lc == columnRslt_col_156) doRslt_col_156_LC(info);
		else if (lc == columnRslt_col_157) doRslt_col_157_LC(info);
		else if (lc == columnRslt_col_158) doRslt_col_158_LC(info);
		else if (lc == columnRslt_col_159) doRslt_col_159_LC(info);
		else if (lc == columnRslt_col_160) doRslt_col_160_LC(info);
		else if (lc == columnRslt_col_161) doRslt_col_161_LC(info);
		else if (lc == columnRslt_col_162) doRslt_col_162_LC(info);
		else if (lc == columnRslt_col_163) doRslt_col_163_LC(info);
		else if (lc == columnRslt_col_164) doRslt_col_164_LC(info);
		else if (lc == columnRslt_col_165) doRslt_col_165_LC(info);
		else if (lc == columnRslt_col_166) doRslt_col_166_LC(info);
		else if (lc == columnRslt_col_167) doRslt_col_167_LC(info);
		else if (lc == columnRslt_col_168) doRslt_col_168_LC(info);
		else if (lc == columnRslt_col_169) doRslt_col_169_LC(info);
		else if (lc == columnRslt_col_170) doRslt_col_170_LC(info);
		else if (lc == columnRslt_col_171) doRslt_col_171_LC(info);
		else if (lc == columnRslt_col_172) doRslt_col_172_LC(info);
		else if (lc == columnRslt_col_173) doRslt_col_173_LC(info);
		else if (lc == columnRslt_col_174) doRslt_col_174_LC(info);
		else if (lc == columnRslt_col_175) doRslt_col_175_LC(info);
		else if (lc == columnRslt_col_176) doRslt_col_176_LC(info);
		else if (lc == columnRslt_col_177) doRslt_col_177_LC(info);
		else if (lc == columnRslt_col_178) doRslt_col_178_LC(info);
		else if (lc == columnRslt_col_179) doRslt_col_179_LC(info);
		else if (lc == columnRslt_col_180) doRslt_col_180_LC(info);
		else if (lc == columnRslt_col_181) doRslt_col_181_LC(info);
		else if (lc == columnRslt_col_182) doRslt_col_182_LC(info);
		else if (lc == columnRslt_col_183) doRslt_col_183_LC(info);
		else if (lc == columnRslt_col_184) doRslt_col_184_LC(info);
		else if (lc == columnRslt_col_185) doRslt_col_185_LC(info);
		else if (lc == columnRslt_col_186) doRslt_col_186_LC(info);
		else if (lc == columnRslt_col_187) doRslt_col_187_LC(info);
		else if (lc == columnRslt_col_188) doRslt_col_188_LC(info);
		else if (lc == columnRslt_col_189) doRslt_col_189_LC(info);
		else if (lc == columnRslt_col_190) doRslt_col_190_LC(info);
		else if (lc == columnRslt_col_191) doRslt_col_191_LC(info);
		else if (lc == columnRslt_col_192) doRslt_col_192_LC(info);
		else if (lc == columnRslt_col_193) doRslt_col_193_LC(info);
		else if (lc == columnRslt_col_194) doRslt_col_194_LC(info);
		else if (lc == columnRslt_col_195) doRslt_col_195_LC(info);
		else if (lc == columnRslt_col_196) doRslt_col_196_LC(info);
		else if (lc == columnRslt_col_197) doRslt_col_197_LC(info);
		else if (lc == columnRslt_col_198) doRslt_col_198_LC(info);
		else if (lc == columnRslt_col_199) doRslt_col_199_LC(info);
		else if (lc == columnRslt_col_200) doRslt_col_200_LC(info);
		else if (lc == columnRslt_col_201) doRslt_col_201_LC(info);
		else if (lc == columnRslt_col_202) doRslt_col_202_LC(info);
		else if (lc == columnRslt_col_203) doRslt_col_203_LC(info);
		else if (lc == columnRslt_col_204) doRslt_col_204_LC(info);
		else if (lc == columnRslt_col_205) doRslt_col_205_LC(info);
		else if (lc == columnRslt_col_206) doRslt_col_206_LC(info);
		else if (lc == columnRslt_col_207) doRslt_col_207_LC(info);
		else if (lc == columnRslt_col_208) doRslt_col_208_LC(info);
		else if (lc == columnRslt_col_209) doRslt_col_209_LC(info);
		else if (lc == columnRslt_col_210) doRslt_col_210_LC(info);
		else if (lc == columnRslt_col_211) doRslt_col_211_LC(info);
		else if (lc == columnRslt_col_212) doRslt_col_212_LC(info);
		else if (lc == columnRslt_col_213) doRslt_col_213_LC(info);
		else if (lc == columnRslt_col_214) doRslt_col_214_LC(info);
		else if (lc == columnRslt_col_215) doRslt_col_215_LC(info);
		else if (lc == columnRslt_col_216) doRslt_col_216_LC(info);
		else if (lc == columnRslt_col_217) doRslt_col_217_LC(info);
		else if (lc == columnRslt_col_218) doRslt_col_218_LC(info);
		else if (lc == columnRslt_col_219) doRslt_col_219_LC(info);
		else if (lc == columnRslt_col_220) doRslt_col_220_LC(info);
		else if (lc == columnRslt_col_221) doRslt_col_221_LC(info);
		else if (lc == columnRslt_col_222) doRslt_col_222_LC(info);
		else if (lc == columnRslt_col_223) doRslt_col_223_LC(info);
		else if (lc == columnRslt_col_224) doRslt_col_224_LC(info);
		else if (lc == columnRslt_col_225) doRslt_col_225_LC(info);
		else if (lc == columnRslt_col_226) doRslt_col_226_LC(info);
		else if (lc == columnRslt_col_227) doRslt_col_227_LC(info);
		else if (lc == columnRslt_col_228) doRslt_col_228_LC(info);
		else if (lc == columnRslt_col_229) doRslt_col_229_LC(info);
		else if (lc == columnRslt_col_230) doRslt_col_230_LC(info);
		else if (lc == columnRslt_col_231) doRslt_col_231_LC(info);
		else if (lc == columnRslt_col_232) doRslt_col_232_LC(info);
		else if (lc == columnRslt_col_233) doRslt_col_233_LC(info);
		else if (lc == columnRslt_col_234) doRslt_col_234_LC(info);
		else if (lc == columnRslt_col_235) doRslt_col_235_LC(info);
		else if (lc == columnRslt_col_236) doRslt_col_236_LC(info);
		else if (lc == columnRslt_col_237) doRslt_col_237_LC(info);
		else if (lc == columnRslt_col_238) doRslt_col_238_LC(info);
		else if (lc == columnRslt_col_239) doRslt_col_239_LC(info);
		else if (lc == columnRslt_col_240) doRslt_col_240_LC(info);
		else if (lc == columnRslt_col_241) doRslt_col_241_LC(info);
		else if (lc == columnRslt_col_242) doRslt_col_242_LC(info);
		else if (lc == columnRslt_col_243) doRslt_col_243_LC(info);
		else if (lc == columnRslt_col_244) doRslt_col_244_LC(info);
		else if (lc == columnRslt_col_245) doRslt_col_245_LC(info);
		else if (lc == columnRslt_col_246) doRslt_col_246_LC(info);
		else if (lc == columnRslt_col_247) doRslt_col_247_LC(info);
		else if (lc == columnRslt_col_248) doRslt_col_248_LC(info);
		else if (lc == columnRslt_col_249) doRslt_col_249_LC(info);
		else if (lc == columnRslt_col_250) doRslt_col_250_LC(info);
		else if (lc == columnRslt_col_251) doRslt_col_251_LC(info);
		else if (lc == columnRslt_col_252) doRslt_col_252_LC(info);
		else if (lc == columnRslt_col_253) doRslt_col_253_LC(info);
		else if (lc == columnRslt_col_254) doRslt_col_254_LC(info);
		else if (lc == columnRslt_col_255) doRslt_col_255_LC(info);
		else if (lc == columnRslt_col_256) doRslt_col_256_LC(info);
		else if (lc == columnRslt_col_257) doRslt_col_257_LC(info);
		else if (lc == columnRslt_col_258) doRslt_col_258_LC(info);
		else if (lc == columnRslt_col_259) doRslt_col_259_LC(info);
		else if (lc == columnRslt_col_260) doRslt_col_260_LC(info);
		else if (lc == columnRslt_col_261) doRslt_col_261_LC(info);
		else if (lc == columnRslt_col_262) doRslt_col_262_LC(info);
		else if (lc == columnRslt_col_263) doRslt_col_263_LC(info);
		else if (lc == columnRslt_col_264) doRslt_col_264_LC(info);
		else if (lc == columnRslt_col_265) doRslt_col_265_LC(info);
		else if (lc == columnRslt_col_266) doRslt_col_266_LC(info);
		else if (lc == columnRslt_col_267) doRslt_col_267_LC(info);
		else if (lc == columnRslt_col_268) doRslt_col_268_LC(info);
		else if (lc == columnRslt_col_269) doRslt_col_269_LC(info);
		else if (lc == columnRslt_col_270) doRslt_col_270_LC(info);
		else if (lc == columnRslt_col_271) doRslt_col_271_LC(info);
		else if (lc == columnRslt_col_272) doRslt_col_272_LC(info);
		else if (lc == columnRslt_col_273) doRslt_col_273_LC(info);
		else if (lc == columnRslt_col_274) doRslt_col_274_LC(info);
		else if (lc == columnRslt_col_275) doRslt_col_275_LC(info);
		else if (lc == columnRslt_col_276) doRslt_col_276_LC(info);
		else if (lc == columnRslt_col_277) doRslt_col_277_LC(info);
		else if (lc == columnRslt_col_278) doRslt_col_278_LC(info);
		else if (lc == columnRslt_col_279) doRslt_col_279_LC(info);
		else if (lc == columnRslt_col_280) doRslt_col_280_LC(info);
		else if (lc == columnRslt_col_281) doRslt_col_281_LC(info);
		else if (lc == columnRslt_col_282) doRslt_col_282_LC(info);
		else if (lc == columnRslt_col_283) doRslt_col_283_LC(info);
		else if (lc == columnRslt_col_284) doRslt_col_284_LC(info);
		else if (lc == columnRslt_col_285) doRslt_col_285_LC(info);
		else if (lc == columnRslt_col_286) doRslt_col_286_LC(info);
		else if (lc == columnRslt_col_287) doRslt_col_287_LC(info);
		else if (lc == columnRslt_col_288) doRslt_col_288_LC(info);
		else if (lc == columnRslt_col_289) doRslt_col_289_LC(info);
		else if (lc == columnRslt_col_290) doRslt_col_290_LC(info);
		else if (lc == columnRslt_col_291) doRslt_col_291_LC(info);
		else if (lc == columnRslt_col_292) doRslt_col_292_LC(info);
		else if (lc == columnRslt_col_293) doRslt_col_293_LC(info);
		else if (lc == columnRslt_col_294) doRslt_col_294_LC(info);
		else if (lc == columnRslt_col_295) doRslt_col_295_LC(info);
		else if (lc == columnRslt_col_296) doRslt_col_296_LC(info);
		else if (lc == columnRslt_col_297) doRslt_col_297_LC(info);
		else if (lc == columnRslt_col_298) doRslt_col_298_LC(info);
		else if (lc == columnRslt_col_299) doRslt_col_299_LC(info);
		else if (lc == columnRslt_st_wip_key) doRslt_st_wip_key_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wip_per]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_per_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_wip_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_wip_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl_inpt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_inpt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_100]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_100_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_101]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_101_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_102]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_102_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_103]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_103_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_104]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_104_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_105]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_105_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_106]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_106_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_107]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_107_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_108]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_108_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_109]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_109_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_110]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_110_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_111]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_111_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_112]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_112_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_113]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_113_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_114]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_114_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_115]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_115_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_116]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_116_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_117]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_117_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_118]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_118_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_119]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_119_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_120]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_120_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_121]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_121_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_122]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_122_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_123]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_123_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_124]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_124_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_125]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_125_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_126]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_126_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_127]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_127_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_128]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_128_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_129]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_129_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_130]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_130_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_131]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_131_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_132]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_132_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_133]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_133_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_134]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_134_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_135]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_135_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_136]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_136_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_137]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_137_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_138]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_138_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_139]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_139_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_140]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_140_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_141]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_141_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_142]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_142_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_143]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_143_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_144]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_144_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_145]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_145_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_146]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_146_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_147]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_147_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_148]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_148_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_149]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_149_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_150]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_150_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_151]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_151_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_152]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_152_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_153]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_153_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_154]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_154_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_155]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_155_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_156]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_156_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_157]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_157_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_158]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_158_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_159]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_159_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_160]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_160_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_161]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_161_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_162]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_162_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_163]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_163_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_164]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_164_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_165]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_165_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_166]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_166_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_167]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_167_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_168]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_168_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_169]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_169_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_170]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_170_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_171]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_171_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_172]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_172_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_173]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_173_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_174]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_174_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_175]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_175_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_176]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_176_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_177]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_177_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_178]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_178_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_179]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_179_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_180]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_180_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_181]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_181_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_182]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_182_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_183]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_183_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_184]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_184_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_185]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_185_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_186]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_186_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_187]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_187_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_188]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_188_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_189]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_189_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_190]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_190_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_191]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_191_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_192]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_192_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_193]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_193_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_194]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_194_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_195]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_195_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_196]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_196_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_197]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_197_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_198]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_198_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_199]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_199_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_200]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_200_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_201]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_201_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_202]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_202_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_203]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_203_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_204]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_204_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_205]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_205_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_206]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_206_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_207]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_207_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_208]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_208_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_209]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_209_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_210]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_210_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_211]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_211_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_212]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_212_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_213]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_213_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_214]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_214_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_215]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_215_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_216]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_216_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_217]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_217_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_218]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_218_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_219]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_219_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_220]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_220_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_221]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_221_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_222]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_222_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_223]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_223_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_224]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_224_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_225]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_225_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_226]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_226_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_227]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_227_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_228]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_228_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_229]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_229_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_230]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_230_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_231]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_231_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_232]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_232_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_233]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_233_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_234]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_234_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_235]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_235_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_236]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_236_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_237]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_237_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_238]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_238_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_239]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_239_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_240]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_240_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_241]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_241_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_242]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_242_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_243]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_243_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_244]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_244_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_245]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_245_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_246]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_246_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_247]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_247_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_248]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_248_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_249]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_249_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_250]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_250_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_251]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_251_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_252]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_252_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_253]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_253_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_254]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_254_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_255]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_255_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_256]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_256_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_257]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_257_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_258]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_258_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_259]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_259_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_260]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_260_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_261]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_261_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_262]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_262_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_263]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_263_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_264]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_264_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_265]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_265_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_266]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_266_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_267]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_267_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_268]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_268_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_269]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_269_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_270]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_270_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_271]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_271_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_272]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_272_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_273]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_273_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_274]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_274_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_275]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_275_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_276]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_276_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_277]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_277_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_278]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_278_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_279]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_279_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_280]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_280_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_281]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_281_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_282]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_282_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_283]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_283_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_284]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_284_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_285]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_285_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_286]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_286_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_287]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_287_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_288]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_288_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_289]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_289_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_290]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_290_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_291]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_291_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_292]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_292_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_293]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_293_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_294]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_294_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_295]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_295_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_296]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_296_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_297]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_297_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_298]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_298_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_299]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_299_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_wip_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_wip_key_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
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
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
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
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getDelCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_wg_cd]の作成メソッド
	 */
	public MCList getDelCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_site_cd]の作成メソッド
	 */
	public MCList getDelCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_loc_cd]の作成メソッド
	 */
	public MCList getDelCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_calc_grp_cd]の作成メソッド
	 */
	public MCList getRslt_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wg_cd]の作成メソッド
	 */
	public MCList getRslt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
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
	 * コンボ／リストのリスト[columnRslt_itm_typ]の作成メソッド
	 */
	public MCList getRslt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getRslt_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTypD(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_jnl_cd]の作成メソッド
	 */
	public MCList getRslt_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0220.Srch01")) {
			return new MG_MGBBL0220_Srch01Bridge();
		}
		if (id.equals("MG.MGBBL0220.Upd01")) {
			return new MG_MGBBL0220_Upd01Bridge();
		}
		if (id.equals("MG.MGBBL0220.Del01")) {
			return new MG_MGBBL0220_Del01Bridge();
		}
		if (id.equals("MG.MGBBL0220.Del02")) {
			return new MG_MGBBL0220_Del02Bridge();
		}
		if (id.equals("MG.MGBBL0220.Imp01")) {
			return new MG_MGBBL0220_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0220_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0220_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0220_Srch01Bridge() {
			p_MG_MGBBL0220_Srch01 = new MCParam(PDef.MG_MGBBL0220_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0220_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0220.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));

			p_MG_MGBBL0220_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0220_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0220_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0220_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0220_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0220.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0220.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0220_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0220_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)p_MG_MGBBL0220_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBBL0220_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0220_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0220_Upd01;

		/** コンストラクタ */
		protected MG_MGBBL0220_Upd01Bridge() {
			p_MG_MGBBL0220_Upd01 = new MCParam(PDef.MG_MGBBL0220_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0220_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));

			p_MG_MGBBL0220_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0220_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0220_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0220_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0220_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0220_Upd01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0220_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)p_MG_MGBBL0220_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBBL0220_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0220_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0220_Del01;

		/** コンストラクタ */
		protected MG_MGBBL0220_Del01Bridge() {
			p_MG_MGBBL0220_Del01 = new MCParam(PDef.MG_MGBBL0220_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0220_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));

			p_MG_MGBBL0220_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0220_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0220_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0220_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0220_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0220_Del01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0220_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)p_MG_MGBBL0220_Del01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBBL0220_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0220_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0220_Del02;

		/** コンストラクタ */
		protected MG_MGBBL0220_Del02Bridge() {
			p_MG_MGBBL0220_Del02 = new MCParam(PDef.MG_MGBBL0220_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0220_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0220.DelCndR.create());
			// Down

			p_MG_MGBBL0220_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0220_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0220_Del02.addUpBlock(getDelCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0220_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0220_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0220.DelCndR up0() {
			return (mcframe.clientMGBB.MGBBP0220.DelCndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0220_Del02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBBL0220_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0220_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0220_Imp01;

		/** コンストラクタ */
		protected MG_MGBBL0220_Imp01Bridge() {
			p_MG_MGBBL0220_Imp01 = new MCParam(PDef.MG_MGBBL0220_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0220_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));

			p_MG_MGBBL0220_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0220_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0220_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0220_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0220_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0220.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0220_Imp01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0220_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0220.RsltR>)p_MG_MGBBL0220_Imp01.getContainerParam().getDownBlock(0));
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