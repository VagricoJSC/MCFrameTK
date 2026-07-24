package mcframe.clientMGBF.MGBFP0420;

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
import mcframe.clientMGBF.MGBFP0420.MGBFP_AveFixSrch_MC.MG_MGBFL0420_Srch01Caller;

/**
 * 画面"MGBFP_AveFixSrch"パネルクラスです。<p>
 *
 * 月別に総平均単価情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_AveFixSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBFP0420";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	public MCLabel Cnd_mng_dpt_cd_Label = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCTextField Cnd_mng_dpt_nm = null;
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
	public MCTextField Cnd_sublot_no = null;
	public MCLabel Cnd_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_sno1 = null;
	public MCLabel Cnd_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_sno2 = null;
	public MCLabel Cnd_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_sno3 = null;
	public MCLabel Cnd_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_sno4 = null;
	public MCLabel Cnd_asst_typ_Label = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCTextField Cnd_asst_typ_nm = null;
	/**
	 * Exclude other company's asset 他社資産除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_oth_flg = null;
	public MCLabel Cnd_repurc_obli_typ_Label = null;
	/**
	 * Repurchase obligation type 買戻義務区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_repurc_obli_typ = null;
	/**
	 * Repurchase obligation type name 買戻義務区分名.<p>
	 *
	 */
	public MCTextField Cnd_repurc_obli_typ_nm = null;
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
	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_sppl_flg = null;
	public MCLabel Cnd_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Cnd_cntry_nm = null;
	public MCLabel Cnd_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Cnd_area_nm = null;
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
	public MCLabel Cnd_sppl_grp_cd1_Label = null;
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd1 = null;
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm1 = null;
	public MCLabel Cnd_sppl_grp_cd2_Label = null;
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd2 = null;
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm2 = null;
	public MCLabel Cnd_sppl_grp_cd3_Label = null;
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd3 = null;
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm3 = null;
	public MCLabel Cnd_sppl_grp_cd4_Label = null;
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd4 = null;
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm4 = null;
	public MCLabel Cnd_sppl_grp_cd5_Label = null;
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd5 = null;
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm5 = null;
	public MCLabel Cnd_sppl_grp_cd6_Label = null;
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd6 = null;
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm6 = null;
	public MCLabel Cnd_sppl_grp_cd7_Label = null;
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd7 = null;
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm7 = null;
	public MCLabel Cnd_sppl_grp_cd8_Label = null;
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd8 = null;
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm8 = null;
	public MCLabel Cnd_sppl_grp_cd9_Label = null;
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd9 = null;
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm9 = null;
	public MCLabel Cnd_sppl_grp_cd10_Label = null;
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd10 = null;
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm10 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_std = null;
	/**
	 * Display one unit base １単位基準表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_unit = null;
	/**
	 * Display amount 金額表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_ave_upri = null;
	/**
	 * Display amount (1 unit) 金額（１単位）表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_ave_unit = null;
	/**
	 * Display standard 標準表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_std_upri = null;
	/**
	 * Display standard (1 unit) 標準（１単位）表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_std_unit = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispRslt]ブロック関連のField定義
	public MCPanel DispRsltPanel = null;
	public MCScrollPane DispRsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBF.MGBFP0420.DispRsltR> DispRsltTable = null;
	// [DispRslt]ブロックの項目のField定義
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wg_nm = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispRslt_itm_p_PPanel;
	public MCColumnConfig columnDispRslt_itm_cd;// [DispRslt]の[itm_p.itm_cd]を[columnDispRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub1;// [DispRslt]の[itm_p.itm_sub1]を[columnDispRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub2;// [DispRslt]の[itm_p.itm_sub2]を[columnDispRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub3;// [DispRslt]の[itm_p.itm_sub3]を[columnDispRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_nm;// [DispRslt]の[itm_p.itm_nm]を[columnDispRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_nm = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno4 = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sppl_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ_nm = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_repurc_obli_flg = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_000;// [DispRslt]の[qty_00_p.qty]を[columnDispRslt_col_000]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_001 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_002 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_003 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_004 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_01_p_PPanel;
	public MCColumnConfig columnDispRslt_col_005;// [DispRslt]の[qty_01_p.qty]を[columnDispRslt_col_005]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_006 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_007 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_008 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_009 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_010;// [DispRslt]の[qty_02_p.qty]を[columnDispRslt_col_010]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_011 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_012 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_013 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_014 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_03_p_PPanel;
	public MCColumnConfig columnDispRslt_col_015;// [DispRslt]の[qty_03_p.qty]を[columnDispRslt_col_015]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_016 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_017 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_018 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_019 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_020;// [DispRslt]の[qty_04_p.qty]を[columnDispRslt_col_020]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_021 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_022 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_023 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_024 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_05_p_PPanel;
	public MCColumnConfig columnDispRslt_col_025;// [DispRslt]の[qty_05_p.qty]を[columnDispRslt_col_025]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_026 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_027 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_028 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_029 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_030;// [DispRslt]の[qty_06_p.qty]を[columnDispRslt_col_030]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_031 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_032 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_033 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_034 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_07_p_PPanel;
	public MCColumnConfig columnDispRslt_col_035;// [DispRslt]の[qty_07_p.qty]を[columnDispRslt_col_035]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_036 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_037 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_038 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_039 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_040;// [DispRslt]の[qty_08_p.qty]を[columnDispRslt_col_040]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_041 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_042 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_043 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_044 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_09_p_PPanel;
	public MCColumnConfig columnDispRslt_col_045;// [DispRslt]の[qty_09_p.qty]を[columnDispRslt_col_045]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_046 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_047 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_048 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_049 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_050;// [DispRslt]の[qty_10_p.qty]を[columnDispRslt_col_050]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_051 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_052 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_053 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_054 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_11_p_PPanel;
	public MCColumnConfig columnDispRslt_col_055;// [DispRslt]の[qty_11_p.qty]を[columnDispRslt_col_055]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_056 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_057 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_058 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_059 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_12_p_PPanel;
	public MCColumnConfig columnDispRslt_col_060;// [DispRslt]の[qty_12_p.qty]を[columnDispRslt_col_060]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_061 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_062 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_063 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_064 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_13_p_PPanel;
	public MCColumnConfig columnDispRslt_col_065;// [DispRslt]の[qty_13_p.qty]を[columnDispRslt_col_065]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_066 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_067 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_068 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_069 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_14_p_PPanel;
	public MCColumnConfig columnDispRslt_col_070;// [DispRslt]の[qty_14_p.qty]を[columnDispRslt_col_070]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_071 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_072 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_073 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_074 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_15_p_PPanel;
	public MCColumnConfig columnDispRslt_col_075;// [DispRslt]の[qty_15_p.qty]を[columnDispRslt_col_075]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_076 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_077 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_078 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_079 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_16_p_PPanel;
	public MCColumnConfig columnDispRslt_col_080;// [DispRslt]の[qty_16_p.qty]を[columnDispRslt_col_080]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_081 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_082 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_083 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_084 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_17_p_PPanel;
	public MCColumnConfig columnDispRslt_col_085;// [DispRslt]の[qty_17_p.qty]を[columnDispRslt_col_085]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_086 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_087 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_088 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_089 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_18_p_PPanel;
	public MCColumnConfig columnDispRslt_col_090;// [DispRslt]の[qty_18_p.qty]を[columnDispRslt_col_090]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_091 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_092 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_093 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_094 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_19_p_PPanel;
	public MCColumnConfig columnDispRslt_col_095;// [DispRslt]の[qty_19_p.qty]を[columnDispRslt_col_095]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_096 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_097 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_098 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_099 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_20_p_PPanel;
	public MCColumnConfig columnDispRslt_col_100;// [DispRslt]の[qty_20_p.qty]を[columnDispRslt_col_100]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_101 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_102 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_103 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_104 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_21_p_PPanel;
	public MCColumnConfig columnDispRslt_col_105;// [DispRslt]の[qty_21_p.qty]を[columnDispRslt_col_105]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_106 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_107 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_108 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_109 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_22_p_PPanel;
	public MCColumnConfig columnDispRslt_col_110;// [DispRslt]の[qty_22_p.qty]を[columnDispRslt_col_110]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_111 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_112 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_113 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_114 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_23_p_PPanel;
	public MCColumnConfig columnDispRslt_col_115;// [DispRslt]の[qty_23_p.qty]を[columnDispRslt_col_115]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_116 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_117 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_118 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_119 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_24_p_PPanel;
	public MCColumnConfig columnDispRslt_col_120;// [DispRslt]の[qty_24_p.qty]を[columnDispRslt_col_120]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_121 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_122 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_123 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_124 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_25_p_PPanel;
	public MCColumnConfig columnDispRslt_col_125;// [DispRslt]の[qty_25_p.qty]を[columnDispRslt_col_125]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_126 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_127 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_128 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_129 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_26_p_PPanel;
	public MCColumnConfig columnDispRslt_col_130;// [DispRslt]の[qty_26_p.qty]を[columnDispRslt_col_130]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_131 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_132 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_133 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_134 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_27_p_PPanel;
	public MCColumnConfig columnDispRslt_col_135;// [DispRslt]の[qty_27_p.qty]を[columnDispRslt_col_135]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_136 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_137 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_138 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_139 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_28_p_PPanel;
	public MCColumnConfig columnDispRslt_col_140;// [DispRslt]の[qty_28_p.qty]を[columnDispRslt_col_140]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_141 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_142 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_143 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_144 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_29_p_PPanel;
	public MCColumnConfig columnDispRslt_col_145;// [DispRslt]の[qty_29_p.qty]を[columnDispRslt_col_145]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_146 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_147 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_148 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_149 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_30_p_PPanel;
	public MCColumnConfig columnDispRslt_col_150;// [DispRslt]の[qty_30_p.qty]を[columnDispRslt_col_150]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_151 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_152 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_153 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_154 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_31_p_PPanel;
	public MCColumnConfig columnDispRslt_col_155;// [DispRslt]の[qty_31_p.qty]を[columnDispRslt_col_155]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_156 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_157 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_158 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_159 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_32_p_PPanel;
	public MCColumnConfig columnDispRslt_col_160;// [DispRslt]の[qty_32_p.qty]を[columnDispRslt_col_160]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_161 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_162 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_163 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_164 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_33_p_PPanel;
	public MCColumnConfig columnDispRslt_col_165;// [DispRslt]の[qty_33_p.qty]を[columnDispRslt_col_165]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_166 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_167 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_168 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_169 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_34_p_PPanel;
	public MCColumnConfig columnDispRslt_col_170;// [DispRslt]の[qty_34_p.qty]を[columnDispRslt_col_170]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_171 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_172 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_173 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_174 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_35_p_PPanel;
	public MCColumnConfig columnDispRslt_col_175;// [DispRslt]の[qty_35_p.qty]を[columnDispRslt_col_175]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_176 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_177 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_178 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_179 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_36_p_PPanel;
	public MCColumnConfig columnDispRslt_col_180;// [DispRslt]の[qty_36_p.qty]を[columnDispRslt_col_180]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_181 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_182 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_183 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_184 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_37_p_PPanel;
	public MCColumnConfig columnDispRslt_col_185;// [DispRslt]の[qty_37_p.qty]を[columnDispRslt_col_185]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_186 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_187 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_188 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_189 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_38_p_PPanel;
	public MCColumnConfig columnDispRslt_col_190;// [DispRslt]の[qty_38_p.qty]を[columnDispRslt_col_190]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_191 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_192 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_193 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_194 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_39_p_PPanel;
	public MCColumnConfig columnDispRslt_col_195;// [DispRslt]の[qty_39_p.qty]を[columnDispRslt_col_195]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_196 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_197 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_198 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_199 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_40_p_PPanel;
	public MCColumnConfig columnDispRslt_col_200;// [DispRslt]の[qty_40_p.qty]を[columnDispRslt_col_200]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_201 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_202 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_203 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_204 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_41_p_PPanel;
	public MCColumnConfig columnDispRslt_col_205;// [DispRslt]の[qty_41_p.qty]を[columnDispRslt_col_205]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_206 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_207 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_208 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_209 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_42_p_PPanel;
	public MCColumnConfig columnDispRslt_col_210;// [DispRslt]の[qty_42_p.qty]を[columnDispRslt_col_210]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_211 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_212 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_213 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_214 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_43_p_PPanel;
	public MCColumnConfig columnDispRslt_col_215;// [DispRslt]の[qty_43_p.qty]を[columnDispRslt_col_215]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_216 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_217 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_218 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_219 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_44_p_PPanel;
	public MCColumnConfig columnDispRslt_col_220;// [DispRslt]の[qty_44_p.qty]を[columnDispRslt_col_220]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_221 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_222 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_223 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_224 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_45_p_PPanel;
	public MCColumnConfig columnDispRslt_col_225;// [DispRslt]の[qty_45_p.qty]を[columnDispRslt_col_225]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_226 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_227 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_228 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_229 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_46_p_PPanel;
	public MCColumnConfig columnDispRslt_col_230;// [DispRslt]の[qty_46_p.qty]を[columnDispRslt_col_230]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_231 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_232 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_233 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_234 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_47_p_PPanel;
	public MCColumnConfig columnDispRslt_col_235;// [DispRslt]の[qty_47_p.qty]を[columnDispRslt_col_235]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_236 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_237 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_238 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_239 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_48_p_PPanel;
	public MCColumnConfig columnDispRslt_col_240;// [DispRslt]の[qty_48_p.qty]を[columnDispRslt_col_240]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_241 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_242 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_243 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_244 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_49_p_PPanel;
	public MCColumnConfig columnDispRslt_col_245;// [DispRslt]の[qty_49_p.qty]を[columnDispRslt_col_245]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_246 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_247 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_248 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_249 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_50_p_PPanel;
	public MCColumnConfig columnDispRslt_col_250;// [DispRslt]の[qty_50_p.qty]を[columnDispRslt_col_250]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_251 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_252 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_253 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_254 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_51_p_PPanel;
	public MCColumnConfig columnDispRslt_col_255;// [DispRslt]の[qty_51_p.qty]を[columnDispRslt_col_255]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_256 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_257 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_258 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_259 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_52_p_PPanel;
	public MCColumnConfig columnDispRslt_col_260;// [DispRslt]の[qty_52_p.qty]を[columnDispRslt_col_260]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_261 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_262 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_263 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_264 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_53_p_PPanel;
	public MCColumnConfig columnDispRslt_col_265;// [DispRslt]の[qty_53_p.qty]を[columnDispRslt_col_265]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_266 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_267 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_268 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_269 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_54_p_PPanel;
	public MCColumnConfig columnDispRslt_col_270;// [DispRslt]の[qty_54_p.qty]を[columnDispRslt_col_270]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_271 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_272 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_273 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_274 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_55_p_PPanel;
	public MCColumnConfig columnDispRslt_col_275;// [DispRslt]の[qty_55_p.qty]を[columnDispRslt_col_275]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_276 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_277 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_278 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_279 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_56_p_PPanel;
	public MCColumnConfig columnDispRslt_col_280;// [DispRslt]の[qty_56_p.qty]を[columnDispRslt_col_280]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_281 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_282 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_283 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_284 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_57_p_PPanel;
	public MCColumnConfig columnDispRslt_col_285;// [DispRslt]の[qty_57_p.qty]を[columnDispRslt_col_285]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_286 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_287 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_288 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_289 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_58_p_PPanel;
	public MCColumnConfig columnDispRslt_col_290;// [DispRslt]の[qty_58_p.qty]を[columnDispRslt_col_290]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_291 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_292 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_293 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_294 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_59_p_PPanel;
	public MCColumnConfig columnDispRslt_col_295;// [DispRslt]の[qty_59_p.qty]を[columnDispRslt_col_295]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_296 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_297 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_298 = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_299 = null;
	public MCColumnGroup cgDispRslt_cg0 = null;
	public MCColumnGroup cgDispRslt_cg1 = null;
	public MCColumnGroup cgDispRslt_cg2 = null;
	public MCColumnGroup cgDispRslt_cg3 = null;
	public MCColumnGroup cgDispRslt_cg4 = null;
	public MCColumnGroup cgDispRslt_cg5 = null;
	public MCColumnGroup cgDispRslt_cg6 = null;
	public MCColumnGroup cgDispRslt_cg7 = null;
	public MCColumnGroup cgDispRslt_cg8 = null;
	public MCColumnGroup cgDispRslt_cg9 = null;
	public MCColumnGroup cgDispRslt_cg10 = null;
	public MCColumnGroup cgDispRslt_cg11 = null;
	public MCColumnGroup cgDispRslt_cg12 = null;
	public MCColumnGroup cgDispRslt_cg13 = null;
	public MCColumnGroup cgDispRslt_cg14 = null;
	public MCColumnGroup cgDispRslt_cg15 = null;
	public MCColumnGroup cgDispRslt_cg16 = null;
	public MCColumnGroup cgDispRslt_cg17 = null;
	public MCColumnGroup cgDispRslt_cg18 = null;
	public MCColumnGroup cgDispRslt_cg19 = null;
	public MCColumnGroup cgDispRslt_cg20 = null;
	public MCColumnGroup cgDispRslt_cg21 = null;
	public MCColumnGroup cgDispRslt_cg22 = null;
	public MCColumnGroup cgDispRslt_cg23 = null;
	public MCColumnGroup cgDispRslt_cg24 = null;
	public MCColumnGroup cgDispRslt_cg25 = null;
	public MCColumnGroup cgDispRslt_cg26 = null;
	public MCColumnGroup cgDispRslt_cg27 = null;
	public MCColumnGroup cgDispRslt_cg28 = null;
	public MCColumnGroup cgDispRslt_cg29 = null;
	public MCColumnGroup cgDispRslt_cg30 = null;
	public MCColumnGroup cgDispRslt_cg31 = null;
	public MCColumnGroup cgDispRslt_cg32 = null;
	public MCColumnGroup cgDispRslt_cg33 = null;
	public MCColumnGroup cgDispRslt_cg34 = null;
	public MCColumnGroup cgDispRslt_cg35 = null;
	public MCColumnGroup cgDispRslt_cg36 = null;
	public MCColumnGroup cgDispRslt_cg37 = null;
	public MCColumnGroup cgDispRslt_cg38 = null;
	public MCColumnGroup cgDispRslt_cg39 = null;
	public MCColumnGroup cgDispRslt_cg40 = null;
	public MCColumnGroup cgDispRslt_cg41 = null;
	public MCColumnGroup cgDispRslt_cg42 = null;
	public MCColumnGroup cgDispRslt_cg43 = null;
	public MCColumnGroup cgDispRslt_cg44 = null;
	public MCColumnGroup cgDispRslt_cg45 = null;
	public MCColumnGroup cgDispRslt_cg46 = null;
	public MCColumnGroup cgDispRslt_cg47 = null;
	public MCColumnGroup cgDispRslt_cg48 = null;
	public MCColumnGroup cgDispRslt_cg49 = null;
	public MCColumnGroup cgDispRslt_cg50 = null;
	public MCColumnGroup cgDispRslt_cg51 = null;
	public MCColumnGroup cgDispRslt_cg52 = null;
	public MCColumnGroup cgDispRslt_cg53 = null;
	public MCColumnGroup cgDispRslt_cg54 = null;
	public MCColumnGroup cgDispRslt_cg55 = null;
	public MCColumnGroup cgDispRslt_cg56 = null;
	public MCColumnGroup cgDispRslt_cg57 = null;
	public MCColumnGroup cgDispRslt_cg58 = null;
	public MCColumnGroup cgDispRslt_cg59 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MG_MGBFL0420_Srch01]のCallerの作成 */
	protected MGBFP_AveFixSrch_MC.MG_MGBFL0420_Srch01Caller createMG_MGBFL0420_Srch01() {
		MGBFP_AveFixSrch_MC.MG_MGBFL0420_Srch01Caller<MGBFP_AveFixSrch, MG_MGBFL0420_Srch01Bridge>
		caller = ((MGBFP_AveFixSrch_MC)this).new MG_MGBFL0420_Srch01Caller<MGBFP_AveFixSrch, MG_MGBFL0420_Srch01Bridge>(
					(MGBFP_AveFixSrch)this, new MG_MGBFL0420_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0420_Srch01]の呼び出し */
	protected void callMG_MGBFL0420_Srch01() {
		MCCaller caller = createMG_MGBFL0420_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0420.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0420.LPnlR aLPnlR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0420.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0420.RsltR> aRsltL;
	/** [Fix]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0420.FixR> aFixL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0420.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0420.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0420.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0420.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBF.MGBFP0420.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0420.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0420.LPnlR createLPnlR() {
		return mcframe.clientMGBF.MGBFP0420.LPnlR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBF.MGBFP0420.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBF.MGBFP0420.DispRsltR createDispRsltR() {
		return mcframe.clientMGBF.MGBFP0420.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.class);
	}

	/**
	 * DispRsltTableを初期化します。
	 */
	protected void createDispRsltTable(){
		if(DispRsltTable == null){
			DispRsltTable = beansFactory.createColumnGroupTable("DispRslt.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0420.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0420.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0420.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0420.RsltR.class);
	}

	/**
	 * コピーによってaFixLを設定します。
	 *
	 * aFixLのインスタンスは変更されません。
	 *
	 * @param dataset FixL
	 */
	public void setFixL(MCList<mcframe.clientMGBF.MGBFP0420.FixR> aList) {
		if (getFixL() != aList) {
			getFixL().setAll(aList);
		}
	}

	/**
	 * [Fix]ブロックのコンテナaFixLを返します。
	 *
	 * @return FixL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.FixR> getFixL() {
		return aFixL;
	}

	/**
	 * aFixRを作成します。
	 *
	 * @return FixR
	 */
	public mcframe.clientMGBF.MGBFP0420.FixR createFixR() {
		return mcframe.clientMGBF.MGBFP0420.FixR.create();
	}

	/**
	 * aFixLを作成します。
	 *
	 * @return FixL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0420.FixR> createFixL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0420.FixR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
		if(!MCCollectionUtil.contains(ret, getDispRsltL())) ret.add(getDispRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getFixL())) ret.add(getFixL());
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
		if(aCnt == getLPnlR()) return "LPnl";
		if(aCnt == getDispRsltL()) return "DispRslt";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getFixL()) return "Fix";
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
		if(bId.equals("LPnl")) return getLPnlR();
		if(bId.equals("DispRslt")) return getDispRsltL();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Fix")) return getFixL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_AveFixSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();
		aFixL = createFixL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_AveFixSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aDispRsltL = createDispRsltL();
		createDispRsltTable();
		DispRsltTable.setRowName(name);
		aRsltL = createRsltL();
		aFixL = createFixL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_AveFixSrch_MC.jbCreateTop((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateFold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateTab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateTab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateTab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateCnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateCnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateCnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateLPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateCtrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbCreateDispRslt((MGBFP_AveFixSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_AveFixSrch p) {
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
	protected static void jbCreateCnd2(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBFP_AveFixSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_AveFixSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_AveFixSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBFP_AveFixSrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$itm_p);
		p.DispRslt_itm_p_PPanel.setName("DispRslt.itm_p");
		p.columnDispRslt_itm_cd = p.DispRslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnDispRslt_itm_cd.addAliasName("DispRslt.itm_cd", p);
		p.columnDispRslt_itm_sub1 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDispRslt_itm_sub1.addAliasName("DispRslt.itm_sub1", p);
		p.columnDispRslt_itm_sub2 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDispRslt_itm_sub2.addAliasName("DispRslt.itm_sub2", p);
		p.columnDispRslt_itm_sub3 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDispRslt_itm_sub3.addAliasName("DispRslt.itm_sub3", p);
		p.columnDispRslt_itm_nm = p.DispRslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnDispRslt_itm_nm.addAliasName("DispRslt.itm_nm", p);
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_000 = p.DispRslt_qty_00_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_000.addAliasName("DispRslt.col_000", p);
		p.DispRslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_01_p);
		p.DispRslt_qty_01_p_PPanel.setName("DispRslt.qty_01_p");
		p.columnDispRslt_col_005 = p.DispRslt_qty_01_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_005.addAliasName("DispRslt.col_005", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_010 = p.DispRslt_qty_02_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_010.addAliasName("DispRslt.col_010", p);
		p.DispRslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_03_p);
		p.DispRslt_qty_03_p_PPanel.setName("DispRslt.qty_03_p");
		p.columnDispRslt_col_015 = p.DispRslt_qty_03_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_015.addAliasName("DispRslt.col_015", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_020 = p.DispRslt_qty_04_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_020.addAliasName("DispRslt.col_020", p);
		p.DispRslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_05_p);
		p.DispRslt_qty_05_p_PPanel.setName("DispRslt.qty_05_p");
		p.columnDispRslt_col_025 = p.DispRslt_qty_05_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_025.addAliasName("DispRslt.col_025", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_030 = p.DispRslt_qty_06_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_030.addAliasName("DispRslt.col_030", p);
		p.DispRslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_07_p);
		p.DispRslt_qty_07_p_PPanel.setName("DispRslt.qty_07_p");
		p.columnDispRslt_col_035 = p.DispRslt_qty_07_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_035.addAliasName("DispRslt.col_035", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_040 = p.DispRslt_qty_08_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_040.addAliasName("DispRslt.col_040", p);
		p.DispRslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_09_p);
		p.DispRslt_qty_09_p_PPanel.setName("DispRslt.qty_09_p");
		p.columnDispRslt_col_045 = p.DispRslt_qty_09_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_045.addAliasName("DispRslt.col_045", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_050 = p.DispRslt_qty_10_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_050.addAliasName("DispRslt.col_050", p);
		p.DispRslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_11_p);
		p.DispRslt_qty_11_p_PPanel.setName("DispRslt.qty_11_p");
		p.columnDispRslt_col_055 = p.DispRslt_qty_11_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_055.addAliasName("DispRslt.col_055", p);
		p.DispRslt_qty_12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_12_p);
		p.DispRslt_qty_12_p_PPanel.setName("DispRslt.qty_12_p");
		p.columnDispRslt_col_060 = p.DispRslt_qty_12_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_060.addAliasName("DispRslt.col_060", p);
		p.DispRslt_qty_13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_13_p);
		p.DispRslt_qty_13_p_PPanel.setName("DispRslt.qty_13_p");
		p.columnDispRslt_col_065 = p.DispRslt_qty_13_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_065.addAliasName("DispRslt.col_065", p);
		p.DispRslt_qty_14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_14_p);
		p.DispRslt_qty_14_p_PPanel.setName("DispRslt.qty_14_p");
		p.columnDispRslt_col_070 = p.DispRslt_qty_14_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_070.addAliasName("DispRslt.col_070", p);
		p.DispRslt_qty_15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_15_p);
		p.DispRslt_qty_15_p_PPanel.setName("DispRslt.qty_15_p");
		p.columnDispRslt_col_075 = p.DispRslt_qty_15_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_075.addAliasName("DispRslt.col_075", p);
		p.DispRslt_qty_16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_16_p);
		p.DispRslt_qty_16_p_PPanel.setName("DispRslt.qty_16_p");
		p.columnDispRslt_col_080 = p.DispRslt_qty_16_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_080.addAliasName("DispRslt.col_080", p);
		p.DispRslt_qty_17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_17_p);
		p.DispRslt_qty_17_p_PPanel.setName("DispRslt.qty_17_p");
		p.columnDispRslt_col_085 = p.DispRslt_qty_17_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_085.addAliasName("DispRslt.col_085", p);
		p.DispRslt_qty_18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_18_p);
		p.DispRslt_qty_18_p_PPanel.setName("DispRslt.qty_18_p");
		p.columnDispRslt_col_090 = p.DispRslt_qty_18_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_090.addAliasName("DispRslt.col_090", p);
		p.DispRslt_qty_19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_19_p);
		p.DispRslt_qty_19_p_PPanel.setName("DispRslt.qty_19_p");
		p.columnDispRslt_col_095 = p.DispRslt_qty_19_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_095.addAliasName("DispRslt.col_095", p);
		p.DispRslt_qty_20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_20_p);
		p.DispRslt_qty_20_p_PPanel.setName("DispRslt.qty_20_p");
		p.columnDispRslt_col_100 = p.DispRslt_qty_20_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_100.addAliasName("DispRslt.col_100", p);
		p.DispRslt_qty_21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_21_p);
		p.DispRslt_qty_21_p_PPanel.setName("DispRslt.qty_21_p");
		p.columnDispRslt_col_105 = p.DispRslt_qty_21_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_105.addAliasName("DispRslt.col_105", p);
		p.DispRslt_qty_22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_22_p);
		p.DispRslt_qty_22_p_PPanel.setName("DispRslt.qty_22_p");
		p.columnDispRslt_col_110 = p.DispRslt_qty_22_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_110.addAliasName("DispRslt.col_110", p);
		p.DispRslt_qty_23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_23_p);
		p.DispRslt_qty_23_p_PPanel.setName("DispRslt.qty_23_p");
		p.columnDispRslt_col_115 = p.DispRslt_qty_23_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_115.addAliasName("DispRslt.col_115", p);
		p.DispRslt_qty_24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_24_p);
		p.DispRslt_qty_24_p_PPanel.setName("DispRslt.qty_24_p");
		p.columnDispRslt_col_120 = p.DispRslt_qty_24_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_120.addAliasName("DispRslt.col_120", p);
		p.DispRslt_qty_25_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_25_p);
		p.DispRslt_qty_25_p_PPanel.setName("DispRslt.qty_25_p");
		p.columnDispRslt_col_125 = p.DispRslt_qty_25_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_125.addAliasName("DispRslt.col_125", p);
		p.DispRslt_qty_26_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_26_p);
		p.DispRslt_qty_26_p_PPanel.setName("DispRslt.qty_26_p");
		p.columnDispRslt_col_130 = p.DispRslt_qty_26_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_130.addAliasName("DispRslt.col_130", p);
		p.DispRslt_qty_27_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_27_p);
		p.DispRslt_qty_27_p_PPanel.setName("DispRslt.qty_27_p");
		p.columnDispRslt_col_135 = p.DispRslt_qty_27_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_135.addAliasName("DispRslt.col_135", p);
		p.DispRslt_qty_28_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_28_p);
		p.DispRslt_qty_28_p_PPanel.setName("DispRslt.qty_28_p");
		p.columnDispRslt_col_140 = p.DispRslt_qty_28_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_140.addAliasName("DispRslt.col_140", p);
		p.DispRslt_qty_29_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_29_p);
		p.DispRslt_qty_29_p_PPanel.setName("DispRslt.qty_29_p");
		p.columnDispRslt_col_145 = p.DispRslt_qty_29_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_145.addAliasName("DispRslt.col_145", p);
		p.DispRslt_qty_30_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_30_p);
		p.DispRslt_qty_30_p_PPanel.setName("DispRslt.qty_30_p");
		p.columnDispRslt_col_150 = p.DispRslt_qty_30_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_150.addAliasName("DispRslt.col_150", p);
		p.DispRslt_qty_31_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_31_p);
		p.DispRslt_qty_31_p_PPanel.setName("DispRslt.qty_31_p");
		p.columnDispRslt_col_155 = p.DispRslt_qty_31_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_155.addAliasName("DispRslt.col_155", p);
		p.DispRslt_qty_32_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_32_p);
		p.DispRslt_qty_32_p_PPanel.setName("DispRslt.qty_32_p");
		p.columnDispRslt_col_160 = p.DispRslt_qty_32_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_160.addAliasName("DispRslt.col_160", p);
		p.DispRslt_qty_33_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_33_p);
		p.DispRslt_qty_33_p_PPanel.setName("DispRslt.qty_33_p");
		p.columnDispRslt_col_165 = p.DispRslt_qty_33_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_165.addAliasName("DispRslt.col_165", p);
		p.DispRslt_qty_34_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_34_p);
		p.DispRslt_qty_34_p_PPanel.setName("DispRslt.qty_34_p");
		p.columnDispRslt_col_170 = p.DispRslt_qty_34_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_170.addAliasName("DispRslt.col_170", p);
		p.DispRslt_qty_35_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_35_p);
		p.DispRslt_qty_35_p_PPanel.setName("DispRslt.qty_35_p");
		p.columnDispRslt_col_175 = p.DispRslt_qty_35_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_175.addAliasName("DispRslt.col_175", p);
		p.DispRslt_qty_36_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_36_p);
		p.DispRslt_qty_36_p_PPanel.setName("DispRslt.qty_36_p");
		p.columnDispRslt_col_180 = p.DispRslt_qty_36_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_180.addAliasName("DispRslt.col_180", p);
		p.DispRslt_qty_37_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_37_p);
		p.DispRslt_qty_37_p_PPanel.setName("DispRslt.qty_37_p");
		p.columnDispRslt_col_185 = p.DispRslt_qty_37_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_185.addAliasName("DispRslt.col_185", p);
		p.DispRslt_qty_38_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_38_p);
		p.DispRslt_qty_38_p_PPanel.setName("DispRslt.qty_38_p");
		p.columnDispRslt_col_190 = p.DispRslt_qty_38_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_190.addAliasName("DispRslt.col_190", p);
		p.DispRslt_qty_39_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_39_p);
		p.DispRslt_qty_39_p_PPanel.setName("DispRslt.qty_39_p");
		p.columnDispRslt_col_195 = p.DispRslt_qty_39_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_195.addAliasName("DispRslt.col_195", p);
		p.DispRslt_qty_40_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_40_p);
		p.DispRslt_qty_40_p_PPanel.setName("DispRslt.qty_40_p");
		p.columnDispRslt_col_200 = p.DispRslt_qty_40_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_200.addAliasName("DispRslt.col_200", p);
		p.DispRslt_qty_41_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_41_p);
		p.DispRslt_qty_41_p_PPanel.setName("DispRslt.qty_41_p");
		p.columnDispRslt_col_205 = p.DispRslt_qty_41_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_205.addAliasName("DispRslt.col_205", p);
		p.DispRslt_qty_42_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_42_p);
		p.DispRslt_qty_42_p_PPanel.setName("DispRslt.qty_42_p");
		p.columnDispRslt_col_210 = p.DispRslt_qty_42_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_210.addAliasName("DispRslt.col_210", p);
		p.DispRslt_qty_43_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_43_p);
		p.DispRslt_qty_43_p_PPanel.setName("DispRslt.qty_43_p");
		p.columnDispRslt_col_215 = p.DispRslt_qty_43_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_215.addAliasName("DispRslt.col_215", p);
		p.DispRslt_qty_44_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_44_p);
		p.DispRslt_qty_44_p_PPanel.setName("DispRslt.qty_44_p");
		p.columnDispRslt_col_220 = p.DispRslt_qty_44_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_220.addAliasName("DispRslt.col_220", p);
		p.DispRslt_qty_45_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_45_p);
		p.DispRslt_qty_45_p_PPanel.setName("DispRslt.qty_45_p");
		p.columnDispRslt_col_225 = p.DispRslt_qty_45_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_225.addAliasName("DispRslt.col_225", p);
		p.DispRslt_qty_46_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_46_p);
		p.DispRslt_qty_46_p_PPanel.setName("DispRslt.qty_46_p");
		p.columnDispRslt_col_230 = p.DispRslt_qty_46_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_230.addAliasName("DispRslt.col_230", p);
		p.DispRslt_qty_47_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_47_p);
		p.DispRslt_qty_47_p_PPanel.setName("DispRslt.qty_47_p");
		p.columnDispRslt_col_235 = p.DispRslt_qty_47_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_235.addAliasName("DispRslt.col_235", p);
		p.DispRslt_qty_48_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_48_p);
		p.DispRslt_qty_48_p_PPanel.setName("DispRslt.qty_48_p");
		p.columnDispRslt_col_240 = p.DispRslt_qty_48_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_240.addAliasName("DispRslt.col_240", p);
		p.DispRslt_qty_49_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_49_p);
		p.DispRslt_qty_49_p_PPanel.setName("DispRslt.qty_49_p");
		p.columnDispRslt_col_245 = p.DispRslt_qty_49_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_245.addAliasName("DispRslt.col_245", p);
		p.DispRslt_qty_50_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_50_p);
		p.DispRslt_qty_50_p_PPanel.setName("DispRslt.qty_50_p");
		p.columnDispRslt_col_250 = p.DispRslt_qty_50_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_250.addAliasName("DispRslt.col_250", p);
		p.DispRslt_qty_51_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_51_p);
		p.DispRslt_qty_51_p_PPanel.setName("DispRslt.qty_51_p");
		p.columnDispRslt_col_255 = p.DispRslt_qty_51_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_255.addAliasName("DispRslt.col_255", p);
		p.DispRslt_qty_52_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_52_p);
		p.DispRslt_qty_52_p_PPanel.setName("DispRslt.qty_52_p");
		p.columnDispRslt_col_260 = p.DispRslt_qty_52_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_260.addAliasName("DispRslt.col_260", p);
		p.DispRslt_qty_53_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_53_p);
		p.DispRslt_qty_53_p_PPanel.setName("DispRslt.qty_53_p");
		p.columnDispRslt_col_265 = p.DispRslt_qty_53_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_265.addAliasName("DispRslt.col_265", p);
		p.DispRslt_qty_54_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_54_p);
		p.DispRslt_qty_54_p_PPanel.setName("DispRslt.qty_54_p");
		p.columnDispRslt_col_270 = p.DispRslt_qty_54_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_270.addAliasName("DispRslt.col_270", p);
		p.DispRslt_qty_55_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_55_p);
		p.DispRslt_qty_55_p_PPanel.setName("DispRslt.qty_55_p");
		p.columnDispRslt_col_275 = p.DispRslt_qty_55_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_275.addAliasName("DispRslt.col_275", p);
		p.DispRslt_qty_56_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_56_p);
		p.DispRslt_qty_56_p_PPanel.setName("DispRslt.qty_56_p");
		p.columnDispRslt_col_280 = p.DispRslt_qty_56_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_280.addAliasName("DispRslt.col_280", p);
		p.DispRslt_qty_57_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_57_p);
		p.DispRslt_qty_57_p_PPanel.setName("DispRslt.qty_57_p");
		p.columnDispRslt_col_285 = p.DispRslt_qty_57_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_285.addAliasName("DispRslt.col_285", p);
		p.DispRslt_qty_58_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_58_p);
		p.DispRslt_qty_58_p_PPanel.setName("DispRslt.qty_58_p");
		p.columnDispRslt_col_290 = p.DispRslt_qty_58_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_290.addAliasName("DispRslt.col_290", p);
		p.DispRslt_qty_59_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0420.DispRsltR.$qty_59_p);
		p.DispRslt_qty_59_p_PPanel.setName("DispRslt.qty_59_p");
		p.columnDispRslt_col_295 = p.DispRslt_qty_59_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_295.addAliasName("DispRslt.col_295", p);
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
	
	
	/** [Cnd_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mng_dpt_cd_p = null;

	/**
	 * [Cnd_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mng_dpt_cd_ListPutter() {
		if (Cnd_mng_dpt_cd_p == null) {
			Cnd_mng_dpt_cd_p = createCnd_mng_dpt_cd_ListPutter(Cnd_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return Cnd_mng_dpt_cd_p;
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
	
	
	/** [Cnd_asst_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asst_typ_p = null;

	/**
	 * [Cnd_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asst_typ_ListPutter() {
		if (Cnd_asst_typ_p == null) {
			Cnd_asst_typ_p = createCnd_asst_typ_ListPutter(Cnd_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Cnd_asst_typ_p;
	}
	
	
	/** [Cnd_repurc_obli_typ_ListPutter]の定義 */
	private MCListPutter Cnd_repurc_obli_typ_p = null;

	/**
	 * [Cnd_repurc_obli_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_repurc_obli_typ_ListPutter() {
		if (Cnd_repurc_obli_typ_p == null) {
			Cnd_repurc_obli_typ_p = createCnd_repurc_obli_typ_ListPutter(Cnd_repurc_obli_typ, "repurc_obli_typ", "repurc_obli_typ_nm");

		}
		return Cnd_repurc_obli_typ_p;
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
	
	
	/** [Cnd_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cntry_cd_p = null;

	/**
	 * [Cnd_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cntry_cd_ListPutter() {
		if (Cnd_cntry_cd_p == null) {
			Cnd_cntry_cd_p = createCnd_cntry_cd_ListPutter(Cnd_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Cnd_cntry_cd_p;
	}
	
	
	/** [Cnd_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_area_cd_p = null;

	/**
	 * [Cnd_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_area_cd_ListPutter() {
		if (Cnd_area_cd_p == null) {
			Cnd_area_cd_p = createCnd_area_cd_ListPutter(Cnd_area_cd, "area_cd", "area_nm");

		}
		return Cnd_area_cd_p;
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
	
	
	/** [Cnd_sppl_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd1_p = null;

	/**
	 * [Cnd_sppl_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd1_ListPutter() {
		if (Cnd_sppl_grp_cd1_p == null) {
			Cnd_sppl_grp_cd1_p = createCnd_sppl_grp_cd1_ListPutter(Cnd_sppl_grp_cd1, "sppl_grp_cd1", "sppl_grp_nm1");

		}
		return Cnd_sppl_grp_cd1_p;
	}
	
	
	/** [Cnd_sppl_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd2_p = null;

	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd2_ListPutter() {
		if (Cnd_sppl_grp_cd2_p == null) {
			Cnd_sppl_grp_cd2_p = createCnd_sppl_grp_cd2_ListPutter(Cnd_sppl_grp_cd2, "sppl_grp_cd2", "sppl_grp_nm2");

		}
		return Cnd_sppl_grp_cd2_p;
	}
	
	
	/** [Cnd_sppl_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd3_p = null;

	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd3_ListPutter() {
		if (Cnd_sppl_grp_cd3_p == null) {
			Cnd_sppl_grp_cd3_p = createCnd_sppl_grp_cd3_ListPutter(Cnd_sppl_grp_cd3, "sppl_grp_cd3", "sppl_grp_nm3");

		}
		return Cnd_sppl_grp_cd3_p;
	}
	
	
	/** [Cnd_sppl_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd4_p = null;

	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd4_ListPutter() {
		if (Cnd_sppl_grp_cd4_p == null) {
			Cnd_sppl_grp_cd4_p = createCnd_sppl_grp_cd4_ListPutter(Cnd_sppl_grp_cd4, "sppl_grp_cd4", "sppl_grp_nm4");

		}
		return Cnd_sppl_grp_cd4_p;
	}
	
	
	/** [Cnd_sppl_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd5_p = null;

	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd5_ListPutter() {
		if (Cnd_sppl_grp_cd5_p == null) {
			Cnd_sppl_grp_cd5_p = createCnd_sppl_grp_cd5_ListPutter(Cnd_sppl_grp_cd5, "sppl_grp_cd5", "sppl_grp_nm5");

		}
		return Cnd_sppl_grp_cd5_p;
	}
	
	
	/** [Cnd_sppl_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd6_p = null;

	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd6_ListPutter() {
		if (Cnd_sppl_grp_cd6_p == null) {
			Cnd_sppl_grp_cd6_p = createCnd_sppl_grp_cd6_ListPutter(Cnd_sppl_grp_cd6, "sppl_grp_cd6", "sppl_grp_nm6");

		}
		return Cnd_sppl_grp_cd6_p;
	}
	
	
	/** [Cnd_sppl_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd7_p = null;

	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd7_ListPutter() {
		if (Cnd_sppl_grp_cd7_p == null) {
			Cnd_sppl_grp_cd7_p = createCnd_sppl_grp_cd7_ListPutter(Cnd_sppl_grp_cd7, "sppl_grp_cd7", "sppl_grp_nm7");

		}
		return Cnd_sppl_grp_cd7_p;
	}
	
	
	/** [Cnd_sppl_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd8_p = null;

	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd8_ListPutter() {
		if (Cnd_sppl_grp_cd8_p == null) {
			Cnd_sppl_grp_cd8_p = createCnd_sppl_grp_cd8_ListPutter(Cnd_sppl_grp_cd8, "sppl_grp_cd8", "sppl_grp_nm8");

		}
		return Cnd_sppl_grp_cd8_p;
	}
	
	
	/** [Cnd_sppl_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd9_p = null;

	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd9_ListPutter() {
		if (Cnd_sppl_grp_cd9_p == null) {
			Cnd_sppl_grp_cd9_p = createCnd_sppl_grp_cd9_ListPutter(Cnd_sppl_grp_cd9, "sppl_grp_cd9", "sppl_grp_nm9");

		}
		return Cnd_sppl_grp_cd9_p;
	}
	
	
	/** [Cnd_sppl_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd10_p = null;

	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd10_ListPutter() {
		if (Cnd_sppl_grp_cd10_p == null) {
			Cnd_sppl_grp_cd10_p = createCnd_sppl_grp_cd10_ListPutter(Cnd_sppl_grp_cd10, "sppl_grp_cd10", "sppl_grp_nm10");

		}
		return Cnd_sppl_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_AveFixSrch create(){
		MGBFP_AveFixSrch p = new MGBFP_AveFixSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_AveFixSrch create(String name){
		MGBFP_AveFixSrch p = new MGBFP_AveFixSrch(name);
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
		MGBFP_AveFixSrch_MC.jbfInitTop((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitFold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitTab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitTab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitTab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitCnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitCnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitCnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitLPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitCtrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbfInitDispRslt((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitTop((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitFold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitTab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitTab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitTab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitCnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitCnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitCnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitLPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitCtrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.jbInitDispRslt((MGBFP_AveFixSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBFP_AveFixSrch p) {
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
	protected static void jbfInitTab1(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
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
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextField("Cnd.sublot_no");
		p.Cnd_sno1_Label = p.beansFactory.createLabel("Cnd.sno1_Label");
		p.Cnd_sno1 = p.beansFactory.createTextField("Cnd.sno1");
		p.Cnd_sno1.setLabel(p.Cnd_sno1_Label);
		p.Cnd_sno2_Label = p.beansFactory.createLabel("Cnd.sno2_Label");
		p.Cnd_sno2 = p.beansFactory.createTextField("Cnd.sno2");
		p.Cnd_sno2.setLabel(p.Cnd_sno2_Label);
		p.Cnd_sno3_Label = p.beansFactory.createLabel("Cnd.sno3_Label");
		p.Cnd_sno3 = p.beansFactory.createTextField("Cnd.sno3");
		p.Cnd_sno3.setLabel(p.Cnd_sno3_Label);
		p.Cnd_sno4_Label = p.beansFactory.createLabel("Cnd.sno4_Label");
		p.Cnd_sno4 = p.beansFactory.createTextField("Cnd.sno4");
		p.Cnd_sno4.setLabel(p.Cnd_sno4_Label);
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_except_oth_flg = p.beansFactory.createCheckBox("Cnd.except_oth_flg");
		p.Cnd_repurc_obli_typ_Label = p.beansFactory.createLabel("Cnd.repurc_obli_typ_Label");
		p.Cnd_repurc_obli_typ = p.beansFactory.createTextComboBox("Cnd.repurc_obli_typ");
		p.Cnd_repurc_obli_typ.setLabel(p.Cnd_repurc_obli_typ_Label);
		p.Cnd_repurc_obli_typ_nm = p.beansFactory.createTextField("Cnd.repurc_obli_typ_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_no_sppl_flg = p.beansFactory.createCheckBox("Cnd.no_sppl_flg");
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
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
		p.Cnd_sppl_grp_cd1_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd1_Label");
		p.Cnd_sppl_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd1");
		p.Cnd_sppl_grp_cd1.setLabel(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd_sppl_grp_nm1 = p.beansFactory.createTextField("Cnd.sppl_grp_nm1");
		p.Cnd_sppl_grp_cd2_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd2_Label");
		p.Cnd_sppl_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd2");
		p.Cnd_sppl_grp_cd2.setLabel(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd_sppl_grp_nm2 = p.beansFactory.createTextField("Cnd.sppl_grp_nm2");
		p.Cnd_sppl_grp_cd3_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd3_Label");
		p.Cnd_sppl_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd3");
		p.Cnd_sppl_grp_cd3.setLabel(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd_sppl_grp_nm3 = p.beansFactory.createTextField("Cnd.sppl_grp_nm3");
		p.Cnd_sppl_grp_cd4_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd4_Label");
		p.Cnd_sppl_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd4");
		p.Cnd_sppl_grp_cd4.setLabel(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd_sppl_grp_nm4 = p.beansFactory.createTextField("Cnd.sppl_grp_nm4");
		p.Cnd_sppl_grp_cd5_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd5_Label");
		p.Cnd_sppl_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd5");
		p.Cnd_sppl_grp_cd5.setLabel(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd_sppl_grp_nm5 = p.beansFactory.createTextField("Cnd.sppl_grp_nm5");
		p.Cnd_sppl_grp_cd6_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd6_Label");
		p.Cnd_sppl_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd6");
		p.Cnd_sppl_grp_cd6.setLabel(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd_sppl_grp_nm6 = p.beansFactory.createTextField("Cnd.sppl_grp_nm6");
		p.Cnd_sppl_grp_cd7_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd7_Label");
		p.Cnd_sppl_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd7");
		p.Cnd_sppl_grp_cd7.setLabel(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd_sppl_grp_nm7 = p.beansFactory.createTextField("Cnd.sppl_grp_nm7");
		p.Cnd_sppl_grp_cd8_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd8_Label");
		p.Cnd_sppl_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd8");
		p.Cnd_sppl_grp_cd8.setLabel(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd_sppl_grp_nm8 = p.beansFactory.createTextField("Cnd.sppl_grp_nm8");
		p.Cnd_sppl_grp_cd9_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd9_Label");
		p.Cnd_sppl_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd9");
		p.Cnd_sppl_grp_cd9.setLabel(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd_sppl_grp_nm9 = p.beansFactory.createTextField("Cnd.sppl_grp_nm9");
		p.Cnd_sppl_grp_cd10_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd10_Label");
		p.Cnd_sppl_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd10");
		p.Cnd_sppl_grp_cd10.setLabel(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd_sppl_grp_nm10 = p.beansFactory.createTextField("Cnd.sppl_grp_nm10");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_disp_std = p.beansFactory.createCheckBox("LPnl.disp_std");
		p.LPnl_disp_unit = p.beansFactory.createCheckBox("LPnl.disp_unit");
		p.LPnl_disp_ave_upri = p.beansFactory.createCheckBox("LPnl.disp_ave_upri");
		p.LPnl_disp_ave_unit = p.beansFactory.createCheckBox("LPnl.disp_ave_unit");
		p.LPnl_disp_std_upri = p.beansFactory.createCheckBox("LPnl.disp_std_upri");
		p.LPnl_disp_std_unit = p.beansFactory.createCheckBox("LPnl.disp_std_unit");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_calc_grp_cd = p.beansFactory.createTableColumn("DispRslt.calc_grp_cd", MCColumnType.TEXT);
		p.columnDispRslt_calc_grp_nm = p.beansFactory.createTableColumn("DispRslt.calc_grp_nm", MCColumnType.TEXT);
		p.columnDispRslt_wg_cd = p.beansFactory.createTableColumn("DispRslt.wg_cd", MCColumnType.TEXT);
		p.columnDispRslt_wg_nm = p.beansFactory.createTableColumn("DispRslt.wg_nm", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_cd = p.beansFactory.createTableColumn("DispRslt.mng_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_nm = p.beansFactory.createTableColumn("DispRslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ = p.beansFactory.createTableColumn("DispRslt.itm_typ", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_jnl_cd = p.beansFactory.createTableColumn("DispRslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnDispRslt_itm_jnl_nm = p.beansFactory.createTableColumn("DispRslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDispRslt_lot_no = p.beansFactory.createTableColumn("DispRslt.lot_no", MCColumnType.TEXT);
		p.columnDispRslt_sublot_no = p.beansFactory.createTableColumn("DispRslt.sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_sno1 = p.beansFactory.createTableColumn("DispRslt.sno1", MCColumnType.TEXT);
		p.columnDispRslt_sno2 = p.beansFactory.createTableColumn("DispRslt.sno2", MCColumnType.TEXT);
		p.columnDispRslt_sno3 = p.beansFactory.createTableColumn("DispRslt.sno3", MCColumnType.TEXT);
		p.columnDispRslt_sno4 = p.beansFactory.createTableColumn("DispRslt.sno4", MCColumnType.TEXT);
		p.columnDispRslt_sppl_cd = p.beansFactory.createTableColumn("DispRslt.sppl_cd", MCColumnType.TEXT);
		p.columnDispRslt_sppl_nm = p.beansFactory.createTableColumn("DispRslt.sppl_nm", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_repurc_obli_flg = p.beansFactory.createTableColumn("DispRslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_col_001 = p.beansFactory.createTableColumn("DispRslt.col_001", MCColumnType.NUMBER);
		p.columnDispRslt_col_002 = p.beansFactory.createTableColumn("DispRslt.col_002", MCColumnType.NUMBER);
		p.columnDispRslt_col_003 = p.beansFactory.createTableColumn("DispRslt.col_003", MCColumnType.NUMBER);
		p.columnDispRslt_col_004 = p.beansFactory.createTableColumn("DispRslt.col_004", MCColumnType.NUMBER);
		p.columnDispRslt_col_006 = p.beansFactory.createTableColumn("DispRslt.col_006", MCColumnType.NUMBER);
		p.columnDispRslt_col_007 = p.beansFactory.createTableColumn("DispRslt.col_007", MCColumnType.NUMBER);
		p.columnDispRslt_col_008 = p.beansFactory.createTableColumn("DispRslt.col_008", MCColumnType.NUMBER);
		p.columnDispRslt_col_009 = p.beansFactory.createTableColumn("DispRslt.col_009", MCColumnType.NUMBER);
		p.columnDispRslt_col_011 = p.beansFactory.createTableColumn("DispRslt.col_011", MCColumnType.NUMBER);
		p.columnDispRslt_col_012 = p.beansFactory.createTableColumn("DispRslt.col_012", MCColumnType.NUMBER);
		p.columnDispRslt_col_013 = p.beansFactory.createTableColumn("DispRslt.col_013", MCColumnType.NUMBER);
		p.columnDispRslt_col_014 = p.beansFactory.createTableColumn("DispRslt.col_014", MCColumnType.NUMBER);
		p.columnDispRslt_col_016 = p.beansFactory.createTableColumn("DispRslt.col_016", MCColumnType.NUMBER);
		p.columnDispRslt_col_017 = p.beansFactory.createTableColumn("DispRslt.col_017", MCColumnType.NUMBER);
		p.columnDispRslt_col_018 = p.beansFactory.createTableColumn("DispRslt.col_018", MCColumnType.NUMBER);
		p.columnDispRslt_col_019 = p.beansFactory.createTableColumn("DispRslt.col_019", MCColumnType.NUMBER);
		p.columnDispRslt_col_021 = p.beansFactory.createTableColumn("DispRslt.col_021", MCColumnType.NUMBER);
		p.columnDispRslt_col_022 = p.beansFactory.createTableColumn("DispRslt.col_022", MCColumnType.NUMBER);
		p.columnDispRslt_col_023 = p.beansFactory.createTableColumn("DispRslt.col_023", MCColumnType.NUMBER);
		p.columnDispRslt_col_024 = p.beansFactory.createTableColumn("DispRslt.col_024", MCColumnType.NUMBER);
		p.columnDispRslt_col_026 = p.beansFactory.createTableColumn("DispRslt.col_026", MCColumnType.NUMBER);
		p.columnDispRslt_col_027 = p.beansFactory.createTableColumn("DispRslt.col_027", MCColumnType.NUMBER);
		p.columnDispRslt_col_028 = p.beansFactory.createTableColumn("DispRslt.col_028", MCColumnType.NUMBER);
		p.columnDispRslt_col_029 = p.beansFactory.createTableColumn("DispRslt.col_029", MCColumnType.NUMBER);
		p.columnDispRslt_col_031 = p.beansFactory.createTableColumn("DispRslt.col_031", MCColumnType.NUMBER);
		p.columnDispRslt_col_032 = p.beansFactory.createTableColumn("DispRslt.col_032", MCColumnType.NUMBER);
		p.columnDispRslt_col_033 = p.beansFactory.createTableColumn("DispRslt.col_033", MCColumnType.NUMBER);
		p.columnDispRslt_col_034 = p.beansFactory.createTableColumn("DispRslt.col_034", MCColumnType.NUMBER);
		p.columnDispRslt_col_036 = p.beansFactory.createTableColumn("DispRslt.col_036", MCColumnType.NUMBER);
		p.columnDispRslt_col_037 = p.beansFactory.createTableColumn("DispRslt.col_037", MCColumnType.NUMBER);
		p.columnDispRslt_col_038 = p.beansFactory.createTableColumn("DispRslt.col_038", MCColumnType.NUMBER);
		p.columnDispRslt_col_039 = p.beansFactory.createTableColumn("DispRslt.col_039", MCColumnType.NUMBER);
		p.columnDispRslt_col_041 = p.beansFactory.createTableColumn("DispRslt.col_041", MCColumnType.NUMBER);
		p.columnDispRslt_col_042 = p.beansFactory.createTableColumn("DispRslt.col_042", MCColumnType.NUMBER);
		p.columnDispRslt_col_043 = p.beansFactory.createTableColumn("DispRslt.col_043", MCColumnType.NUMBER);
		p.columnDispRslt_col_044 = p.beansFactory.createTableColumn("DispRslt.col_044", MCColumnType.NUMBER);
		p.columnDispRslt_col_046 = p.beansFactory.createTableColumn("DispRslt.col_046", MCColumnType.NUMBER);
		p.columnDispRslt_col_047 = p.beansFactory.createTableColumn("DispRslt.col_047", MCColumnType.NUMBER);
		p.columnDispRslt_col_048 = p.beansFactory.createTableColumn("DispRslt.col_048", MCColumnType.NUMBER);
		p.columnDispRslt_col_049 = p.beansFactory.createTableColumn("DispRslt.col_049", MCColumnType.NUMBER);
		p.columnDispRslt_col_051 = p.beansFactory.createTableColumn("DispRslt.col_051", MCColumnType.NUMBER);
		p.columnDispRslt_col_052 = p.beansFactory.createTableColumn("DispRslt.col_052", MCColumnType.NUMBER);
		p.columnDispRslt_col_053 = p.beansFactory.createTableColumn("DispRslt.col_053", MCColumnType.NUMBER);
		p.columnDispRslt_col_054 = p.beansFactory.createTableColumn("DispRslt.col_054", MCColumnType.NUMBER);
		p.columnDispRslt_col_056 = p.beansFactory.createTableColumn("DispRslt.col_056", MCColumnType.NUMBER);
		p.columnDispRslt_col_057 = p.beansFactory.createTableColumn("DispRslt.col_057", MCColumnType.NUMBER);
		p.columnDispRslt_col_058 = p.beansFactory.createTableColumn("DispRslt.col_058", MCColumnType.NUMBER);
		p.columnDispRslt_col_059 = p.beansFactory.createTableColumn("DispRslt.col_059", MCColumnType.NUMBER);
		p.columnDispRslt_col_061 = p.beansFactory.createTableColumn("DispRslt.col_061", MCColumnType.NUMBER);
		p.columnDispRslt_col_062 = p.beansFactory.createTableColumn("DispRslt.col_062", MCColumnType.NUMBER);
		p.columnDispRslt_col_063 = p.beansFactory.createTableColumn("DispRslt.col_063", MCColumnType.NUMBER);
		p.columnDispRslt_col_064 = p.beansFactory.createTableColumn("DispRslt.col_064", MCColumnType.NUMBER);
		p.columnDispRslt_col_066 = p.beansFactory.createTableColumn("DispRslt.col_066", MCColumnType.NUMBER);
		p.columnDispRslt_col_067 = p.beansFactory.createTableColumn("DispRslt.col_067", MCColumnType.NUMBER);
		p.columnDispRslt_col_068 = p.beansFactory.createTableColumn("DispRslt.col_068", MCColumnType.NUMBER);
		p.columnDispRslt_col_069 = p.beansFactory.createTableColumn("DispRslt.col_069", MCColumnType.NUMBER);
		p.columnDispRslt_col_071 = p.beansFactory.createTableColumn("DispRslt.col_071", MCColumnType.NUMBER);
		p.columnDispRslt_col_072 = p.beansFactory.createTableColumn("DispRslt.col_072", MCColumnType.NUMBER);
		p.columnDispRslt_col_073 = p.beansFactory.createTableColumn("DispRslt.col_073", MCColumnType.NUMBER);
		p.columnDispRslt_col_074 = p.beansFactory.createTableColumn("DispRslt.col_074", MCColumnType.NUMBER);
		p.columnDispRslt_col_076 = p.beansFactory.createTableColumn("DispRslt.col_076", MCColumnType.NUMBER);
		p.columnDispRslt_col_077 = p.beansFactory.createTableColumn("DispRslt.col_077", MCColumnType.NUMBER);
		p.columnDispRslt_col_078 = p.beansFactory.createTableColumn("DispRslt.col_078", MCColumnType.NUMBER);
		p.columnDispRslt_col_079 = p.beansFactory.createTableColumn("DispRslt.col_079", MCColumnType.NUMBER);
		p.columnDispRslt_col_081 = p.beansFactory.createTableColumn("DispRslt.col_081", MCColumnType.NUMBER);
		p.columnDispRslt_col_082 = p.beansFactory.createTableColumn("DispRslt.col_082", MCColumnType.NUMBER);
		p.columnDispRslt_col_083 = p.beansFactory.createTableColumn("DispRslt.col_083", MCColumnType.NUMBER);
		p.columnDispRslt_col_084 = p.beansFactory.createTableColumn("DispRslt.col_084", MCColumnType.NUMBER);
		p.columnDispRslt_col_086 = p.beansFactory.createTableColumn("DispRslt.col_086", MCColumnType.NUMBER);
		p.columnDispRslt_col_087 = p.beansFactory.createTableColumn("DispRslt.col_087", MCColumnType.NUMBER);
		p.columnDispRslt_col_088 = p.beansFactory.createTableColumn("DispRslt.col_088", MCColumnType.NUMBER);
		p.columnDispRslt_col_089 = p.beansFactory.createTableColumn("DispRslt.col_089", MCColumnType.NUMBER);
		p.columnDispRslt_col_091 = p.beansFactory.createTableColumn("DispRslt.col_091", MCColumnType.NUMBER);
		p.columnDispRslt_col_092 = p.beansFactory.createTableColumn("DispRslt.col_092", MCColumnType.NUMBER);
		p.columnDispRslt_col_093 = p.beansFactory.createTableColumn("DispRslt.col_093", MCColumnType.NUMBER);
		p.columnDispRslt_col_094 = p.beansFactory.createTableColumn("DispRslt.col_094", MCColumnType.NUMBER);
		p.columnDispRslt_col_096 = p.beansFactory.createTableColumn("DispRslt.col_096", MCColumnType.NUMBER);
		p.columnDispRslt_col_097 = p.beansFactory.createTableColumn("DispRslt.col_097", MCColumnType.NUMBER);
		p.columnDispRslt_col_098 = p.beansFactory.createTableColumn("DispRslt.col_098", MCColumnType.NUMBER);
		p.columnDispRslt_col_099 = p.beansFactory.createTableColumn("DispRslt.col_099", MCColumnType.NUMBER);
		p.columnDispRslt_col_101 = p.beansFactory.createTableColumn("DispRslt.col_101", MCColumnType.NUMBER);
		p.columnDispRslt_col_102 = p.beansFactory.createTableColumn("DispRslt.col_102", MCColumnType.NUMBER);
		p.columnDispRslt_col_103 = p.beansFactory.createTableColumn("DispRslt.col_103", MCColumnType.NUMBER);
		p.columnDispRslt_col_104 = p.beansFactory.createTableColumn("DispRslt.col_104", MCColumnType.NUMBER);
		p.columnDispRslt_col_106 = p.beansFactory.createTableColumn("DispRslt.col_106", MCColumnType.NUMBER);
		p.columnDispRslt_col_107 = p.beansFactory.createTableColumn("DispRslt.col_107", MCColumnType.NUMBER);
		p.columnDispRslt_col_108 = p.beansFactory.createTableColumn("DispRslt.col_108", MCColumnType.NUMBER);
		p.columnDispRslt_col_109 = p.beansFactory.createTableColumn("DispRslt.col_109", MCColumnType.NUMBER);
		p.columnDispRslt_col_111 = p.beansFactory.createTableColumn("DispRslt.col_111", MCColumnType.NUMBER);
		p.columnDispRslt_col_112 = p.beansFactory.createTableColumn("DispRslt.col_112", MCColumnType.NUMBER);
		p.columnDispRslt_col_113 = p.beansFactory.createTableColumn("DispRslt.col_113", MCColumnType.NUMBER);
		p.columnDispRslt_col_114 = p.beansFactory.createTableColumn("DispRslt.col_114", MCColumnType.NUMBER);
		p.columnDispRslt_col_116 = p.beansFactory.createTableColumn("DispRslt.col_116", MCColumnType.NUMBER);
		p.columnDispRslt_col_117 = p.beansFactory.createTableColumn("DispRslt.col_117", MCColumnType.NUMBER);
		p.columnDispRslt_col_118 = p.beansFactory.createTableColumn("DispRslt.col_118", MCColumnType.NUMBER);
		p.columnDispRslt_col_119 = p.beansFactory.createTableColumn("DispRslt.col_119", MCColumnType.NUMBER);
		p.columnDispRslt_col_121 = p.beansFactory.createTableColumn("DispRslt.col_121", MCColumnType.NUMBER);
		p.columnDispRslt_col_122 = p.beansFactory.createTableColumn("DispRslt.col_122", MCColumnType.NUMBER);
		p.columnDispRslt_col_123 = p.beansFactory.createTableColumn("DispRslt.col_123", MCColumnType.NUMBER);
		p.columnDispRslt_col_124 = p.beansFactory.createTableColumn("DispRslt.col_124", MCColumnType.NUMBER);
		p.columnDispRslt_col_126 = p.beansFactory.createTableColumn("DispRslt.col_126", MCColumnType.NUMBER);
		p.columnDispRslt_col_127 = p.beansFactory.createTableColumn("DispRslt.col_127", MCColumnType.NUMBER);
		p.columnDispRslt_col_128 = p.beansFactory.createTableColumn("DispRslt.col_128", MCColumnType.NUMBER);
		p.columnDispRslt_col_129 = p.beansFactory.createTableColumn("DispRslt.col_129", MCColumnType.NUMBER);
		p.columnDispRslt_col_131 = p.beansFactory.createTableColumn("DispRslt.col_131", MCColumnType.NUMBER);
		p.columnDispRslt_col_132 = p.beansFactory.createTableColumn("DispRslt.col_132", MCColumnType.NUMBER);
		p.columnDispRslt_col_133 = p.beansFactory.createTableColumn("DispRslt.col_133", MCColumnType.NUMBER);
		p.columnDispRslt_col_134 = p.beansFactory.createTableColumn("DispRslt.col_134", MCColumnType.NUMBER);
		p.columnDispRslt_col_136 = p.beansFactory.createTableColumn("DispRslt.col_136", MCColumnType.NUMBER);
		p.columnDispRslt_col_137 = p.beansFactory.createTableColumn("DispRslt.col_137", MCColumnType.NUMBER);
		p.columnDispRslt_col_138 = p.beansFactory.createTableColumn("DispRslt.col_138", MCColumnType.NUMBER);
		p.columnDispRslt_col_139 = p.beansFactory.createTableColumn("DispRslt.col_139", MCColumnType.NUMBER);
		p.columnDispRslt_col_141 = p.beansFactory.createTableColumn("DispRslt.col_141", MCColumnType.NUMBER);
		p.columnDispRslt_col_142 = p.beansFactory.createTableColumn("DispRslt.col_142", MCColumnType.NUMBER);
		p.columnDispRslt_col_143 = p.beansFactory.createTableColumn("DispRslt.col_143", MCColumnType.NUMBER);
		p.columnDispRslt_col_144 = p.beansFactory.createTableColumn("DispRslt.col_144", MCColumnType.NUMBER);
		p.columnDispRslt_col_146 = p.beansFactory.createTableColumn("DispRslt.col_146", MCColumnType.NUMBER);
		p.columnDispRslt_col_147 = p.beansFactory.createTableColumn("DispRslt.col_147", MCColumnType.NUMBER);
		p.columnDispRslt_col_148 = p.beansFactory.createTableColumn("DispRslt.col_148", MCColumnType.NUMBER);
		p.columnDispRslt_col_149 = p.beansFactory.createTableColumn("DispRslt.col_149", MCColumnType.NUMBER);
		p.columnDispRslt_col_151 = p.beansFactory.createTableColumn("DispRslt.col_151", MCColumnType.NUMBER);
		p.columnDispRslt_col_152 = p.beansFactory.createTableColumn("DispRslt.col_152", MCColumnType.NUMBER);
		p.columnDispRslt_col_153 = p.beansFactory.createTableColumn("DispRslt.col_153", MCColumnType.NUMBER);
		p.columnDispRslt_col_154 = p.beansFactory.createTableColumn("DispRslt.col_154", MCColumnType.NUMBER);
		p.columnDispRslt_col_156 = p.beansFactory.createTableColumn("DispRslt.col_156", MCColumnType.NUMBER);
		p.columnDispRslt_col_157 = p.beansFactory.createTableColumn("DispRslt.col_157", MCColumnType.NUMBER);
		p.columnDispRslt_col_158 = p.beansFactory.createTableColumn("DispRslt.col_158", MCColumnType.NUMBER);
		p.columnDispRslt_col_159 = p.beansFactory.createTableColumn("DispRslt.col_159", MCColumnType.NUMBER);
		p.columnDispRslt_col_161 = p.beansFactory.createTableColumn("DispRslt.col_161", MCColumnType.NUMBER);
		p.columnDispRslt_col_162 = p.beansFactory.createTableColumn("DispRslt.col_162", MCColumnType.NUMBER);
		p.columnDispRslt_col_163 = p.beansFactory.createTableColumn("DispRslt.col_163", MCColumnType.NUMBER);
		p.columnDispRslt_col_164 = p.beansFactory.createTableColumn("DispRslt.col_164", MCColumnType.NUMBER);
		p.columnDispRslt_col_166 = p.beansFactory.createTableColumn("DispRslt.col_166", MCColumnType.NUMBER);
		p.columnDispRslt_col_167 = p.beansFactory.createTableColumn("DispRslt.col_167", MCColumnType.NUMBER);
		p.columnDispRslt_col_168 = p.beansFactory.createTableColumn("DispRslt.col_168", MCColumnType.NUMBER);
		p.columnDispRslt_col_169 = p.beansFactory.createTableColumn("DispRslt.col_169", MCColumnType.NUMBER);
		p.columnDispRslt_col_171 = p.beansFactory.createTableColumn("DispRslt.col_171", MCColumnType.NUMBER);
		p.columnDispRslt_col_172 = p.beansFactory.createTableColumn("DispRslt.col_172", MCColumnType.NUMBER);
		p.columnDispRslt_col_173 = p.beansFactory.createTableColumn("DispRslt.col_173", MCColumnType.NUMBER);
		p.columnDispRslt_col_174 = p.beansFactory.createTableColumn("DispRslt.col_174", MCColumnType.NUMBER);
		p.columnDispRslt_col_176 = p.beansFactory.createTableColumn("DispRslt.col_176", MCColumnType.NUMBER);
		p.columnDispRslt_col_177 = p.beansFactory.createTableColumn("DispRslt.col_177", MCColumnType.NUMBER);
		p.columnDispRslt_col_178 = p.beansFactory.createTableColumn("DispRslt.col_178", MCColumnType.NUMBER);
		p.columnDispRslt_col_179 = p.beansFactory.createTableColumn("DispRslt.col_179", MCColumnType.NUMBER);
		p.columnDispRslt_col_181 = p.beansFactory.createTableColumn("DispRslt.col_181", MCColumnType.NUMBER);
		p.columnDispRslt_col_182 = p.beansFactory.createTableColumn("DispRslt.col_182", MCColumnType.NUMBER);
		p.columnDispRslt_col_183 = p.beansFactory.createTableColumn("DispRslt.col_183", MCColumnType.NUMBER);
		p.columnDispRslt_col_184 = p.beansFactory.createTableColumn("DispRslt.col_184", MCColumnType.NUMBER);
		p.columnDispRslt_col_186 = p.beansFactory.createTableColumn("DispRslt.col_186", MCColumnType.NUMBER);
		p.columnDispRslt_col_187 = p.beansFactory.createTableColumn("DispRslt.col_187", MCColumnType.NUMBER);
		p.columnDispRslt_col_188 = p.beansFactory.createTableColumn("DispRslt.col_188", MCColumnType.NUMBER);
		p.columnDispRslt_col_189 = p.beansFactory.createTableColumn("DispRslt.col_189", MCColumnType.NUMBER);
		p.columnDispRslt_col_191 = p.beansFactory.createTableColumn("DispRslt.col_191", MCColumnType.NUMBER);
		p.columnDispRslt_col_192 = p.beansFactory.createTableColumn("DispRslt.col_192", MCColumnType.NUMBER);
		p.columnDispRslt_col_193 = p.beansFactory.createTableColumn("DispRslt.col_193", MCColumnType.NUMBER);
		p.columnDispRslt_col_194 = p.beansFactory.createTableColumn("DispRslt.col_194", MCColumnType.NUMBER);
		p.columnDispRslt_col_196 = p.beansFactory.createTableColumn("DispRslt.col_196", MCColumnType.NUMBER);
		p.columnDispRslt_col_197 = p.beansFactory.createTableColumn("DispRslt.col_197", MCColumnType.NUMBER);
		p.columnDispRslt_col_198 = p.beansFactory.createTableColumn("DispRslt.col_198", MCColumnType.NUMBER);
		p.columnDispRslt_col_199 = p.beansFactory.createTableColumn("DispRslt.col_199", MCColumnType.NUMBER);
		p.columnDispRslt_col_201 = p.beansFactory.createTableColumn("DispRslt.col_201", MCColumnType.NUMBER);
		p.columnDispRslt_col_202 = p.beansFactory.createTableColumn("DispRslt.col_202", MCColumnType.NUMBER);
		p.columnDispRslt_col_203 = p.beansFactory.createTableColumn("DispRslt.col_203", MCColumnType.NUMBER);
		p.columnDispRslt_col_204 = p.beansFactory.createTableColumn("DispRslt.col_204", MCColumnType.NUMBER);
		p.columnDispRslt_col_206 = p.beansFactory.createTableColumn("DispRslt.col_206", MCColumnType.NUMBER);
		p.columnDispRslt_col_207 = p.beansFactory.createTableColumn("DispRslt.col_207", MCColumnType.NUMBER);
		p.columnDispRslt_col_208 = p.beansFactory.createTableColumn("DispRslt.col_208", MCColumnType.NUMBER);
		p.columnDispRslt_col_209 = p.beansFactory.createTableColumn("DispRslt.col_209", MCColumnType.NUMBER);
		p.columnDispRslt_col_211 = p.beansFactory.createTableColumn("DispRslt.col_211", MCColumnType.NUMBER);
		p.columnDispRslt_col_212 = p.beansFactory.createTableColumn("DispRslt.col_212", MCColumnType.NUMBER);
		p.columnDispRslt_col_213 = p.beansFactory.createTableColumn("DispRslt.col_213", MCColumnType.NUMBER);
		p.columnDispRslt_col_214 = p.beansFactory.createTableColumn("DispRslt.col_214", MCColumnType.NUMBER);
		p.columnDispRslt_col_216 = p.beansFactory.createTableColumn("DispRslt.col_216", MCColumnType.NUMBER);
		p.columnDispRslt_col_217 = p.beansFactory.createTableColumn("DispRslt.col_217", MCColumnType.NUMBER);
		p.columnDispRslt_col_218 = p.beansFactory.createTableColumn("DispRslt.col_218", MCColumnType.NUMBER);
		p.columnDispRslt_col_219 = p.beansFactory.createTableColumn("DispRslt.col_219", MCColumnType.NUMBER);
		p.columnDispRslt_col_221 = p.beansFactory.createTableColumn("DispRslt.col_221", MCColumnType.NUMBER);
		p.columnDispRslt_col_222 = p.beansFactory.createTableColumn("DispRslt.col_222", MCColumnType.NUMBER);
		p.columnDispRslt_col_223 = p.beansFactory.createTableColumn("DispRslt.col_223", MCColumnType.NUMBER);
		p.columnDispRslt_col_224 = p.beansFactory.createTableColumn("DispRslt.col_224", MCColumnType.NUMBER);
		p.columnDispRslt_col_226 = p.beansFactory.createTableColumn("DispRslt.col_226", MCColumnType.NUMBER);
		p.columnDispRslt_col_227 = p.beansFactory.createTableColumn("DispRslt.col_227", MCColumnType.NUMBER);
		p.columnDispRslt_col_228 = p.beansFactory.createTableColumn("DispRslt.col_228", MCColumnType.NUMBER);
		p.columnDispRslt_col_229 = p.beansFactory.createTableColumn("DispRslt.col_229", MCColumnType.NUMBER);
		p.columnDispRslt_col_231 = p.beansFactory.createTableColumn("DispRslt.col_231", MCColumnType.NUMBER);
		p.columnDispRslt_col_232 = p.beansFactory.createTableColumn("DispRslt.col_232", MCColumnType.NUMBER);
		p.columnDispRslt_col_233 = p.beansFactory.createTableColumn("DispRslt.col_233", MCColumnType.NUMBER);
		p.columnDispRslt_col_234 = p.beansFactory.createTableColumn("DispRslt.col_234", MCColumnType.NUMBER);
		p.columnDispRslt_col_236 = p.beansFactory.createTableColumn("DispRslt.col_236", MCColumnType.NUMBER);
		p.columnDispRslt_col_237 = p.beansFactory.createTableColumn("DispRslt.col_237", MCColumnType.NUMBER);
		p.columnDispRslt_col_238 = p.beansFactory.createTableColumn("DispRslt.col_238", MCColumnType.NUMBER);
		p.columnDispRslt_col_239 = p.beansFactory.createTableColumn("DispRslt.col_239", MCColumnType.NUMBER);
		p.columnDispRslt_col_241 = p.beansFactory.createTableColumn("DispRslt.col_241", MCColumnType.NUMBER);
		p.columnDispRslt_col_242 = p.beansFactory.createTableColumn("DispRslt.col_242", MCColumnType.NUMBER);
		p.columnDispRslt_col_243 = p.beansFactory.createTableColumn("DispRslt.col_243", MCColumnType.NUMBER);
		p.columnDispRslt_col_244 = p.beansFactory.createTableColumn("DispRslt.col_244", MCColumnType.NUMBER);
		p.columnDispRslt_col_246 = p.beansFactory.createTableColumn("DispRslt.col_246", MCColumnType.NUMBER);
		p.columnDispRslt_col_247 = p.beansFactory.createTableColumn("DispRslt.col_247", MCColumnType.NUMBER);
		p.columnDispRslt_col_248 = p.beansFactory.createTableColumn("DispRslt.col_248", MCColumnType.NUMBER);
		p.columnDispRslt_col_249 = p.beansFactory.createTableColumn("DispRslt.col_249", MCColumnType.NUMBER);
		p.columnDispRslt_col_251 = p.beansFactory.createTableColumn("DispRslt.col_251", MCColumnType.NUMBER);
		p.columnDispRslt_col_252 = p.beansFactory.createTableColumn("DispRslt.col_252", MCColumnType.NUMBER);
		p.columnDispRslt_col_253 = p.beansFactory.createTableColumn("DispRslt.col_253", MCColumnType.NUMBER);
		p.columnDispRslt_col_254 = p.beansFactory.createTableColumn("DispRslt.col_254", MCColumnType.NUMBER);
		p.columnDispRslt_col_256 = p.beansFactory.createTableColumn("DispRslt.col_256", MCColumnType.NUMBER);
		p.columnDispRslt_col_257 = p.beansFactory.createTableColumn("DispRslt.col_257", MCColumnType.NUMBER);
		p.columnDispRslt_col_258 = p.beansFactory.createTableColumn("DispRslt.col_258", MCColumnType.NUMBER);
		p.columnDispRslt_col_259 = p.beansFactory.createTableColumn("DispRslt.col_259", MCColumnType.NUMBER);
		p.columnDispRslt_col_261 = p.beansFactory.createTableColumn("DispRslt.col_261", MCColumnType.NUMBER);
		p.columnDispRslt_col_262 = p.beansFactory.createTableColumn("DispRslt.col_262", MCColumnType.NUMBER);
		p.columnDispRslt_col_263 = p.beansFactory.createTableColumn("DispRslt.col_263", MCColumnType.NUMBER);
		p.columnDispRslt_col_264 = p.beansFactory.createTableColumn("DispRslt.col_264", MCColumnType.NUMBER);
		p.columnDispRslt_col_266 = p.beansFactory.createTableColumn("DispRslt.col_266", MCColumnType.NUMBER);
		p.columnDispRslt_col_267 = p.beansFactory.createTableColumn("DispRslt.col_267", MCColumnType.NUMBER);
		p.columnDispRslt_col_268 = p.beansFactory.createTableColumn("DispRslt.col_268", MCColumnType.NUMBER);
		p.columnDispRslt_col_269 = p.beansFactory.createTableColumn("DispRslt.col_269", MCColumnType.NUMBER);
		p.columnDispRslt_col_271 = p.beansFactory.createTableColumn("DispRslt.col_271", MCColumnType.NUMBER);
		p.columnDispRslt_col_272 = p.beansFactory.createTableColumn("DispRslt.col_272", MCColumnType.NUMBER);
		p.columnDispRslt_col_273 = p.beansFactory.createTableColumn("DispRslt.col_273", MCColumnType.NUMBER);
		p.columnDispRslt_col_274 = p.beansFactory.createTableColumn("DispRslt.col_274", MCColumnType.NUMBER);
		p.columnDispRslt_col_276 = p.beansFactory.createTableColumn("DispRslt.col_276", MCColumnType.NUMBER);
		p.columnDispRslt_col_277 = p.beansFactory.createTableColumn("DispRslt.col_277", MCColumnType.NUMBER);
		p.columnDispRslt_col_278 = p.beansFactory.createTableColumn("DispRslt.col_278", MCColumnType.NUMBER);
		p.columnDispRslt_col_279 = p.beansFactory.createTableColumn("DispRslt.col_279", MCColumnType.NUMBER);
		p.columnDispRslt_col_281 = p.beansFactory.createTableColumn("DispRslt.col_281", MCColumnType.NUMBER);
		p.columnDispRslt_col_282 = p.beansFactory.createTableColumn("DispRslt.col_282", MCColumnType.NUMBER);
		p.columnDispRslt_col_283 = p.beansFactory.createTableColumn("DispRslt.col_283", MCColumnType.NUMBER);
		p.columnDispRslt_col_284 = p.beansFactory.createTableColumn("DispRslt.col_284", MCColumnType.NUMBER);
		p.columnDispRslt_col_286 = p.beansFactory.createTableColumn("DispRslt.col_286", MCColumnType.NUMBER);
		p.columnDispRslt_col_287 = p.beansFactory.createTableColumn("DispRslt.col_287", MCColumnType.NUMBER);
		p.columnDispRslt_col_288 = p.beansFactory.createTableColumn("DispRslt.col_288", MCColumnType.NUMBER);
		p.columnDispRslt_col_289 = p.beansFactory.createTableColumn("DispRslt.col_289", MCColumnType.NUMBER);
		p.columnDispRslt_col_291 = p.beansFactory.createTableColumn("DispRslt.col_291", MCColumnType.NUMBER);
		p.columnDispRslt_col_292 = p.beansFactory.createTableColumn("DispRslt.col_292", MCColumnType.NUMBER);
		p.columnDispRslt_col_293 = p.beansFactory.createTableColumn("DispRslt.col_293", MCColumnType.NUMBER);
		p.columnDispRslt_col_294 = p.beansFactory.createTableColumn("DispRslt.col_294", MCColumnType.NUMBER);
		p.columnDispRslt_col_296 = p.beansFactory.createTableColumn("DispRslt.col_296", MCColumnType.NUMBER);
		p.columnDispRslt_col_297 = p.beansFactory.createTableColumn("DispRslt.col_297", MCColumnType.NUMBER);
		p.columnDispRslt_col_298 = p.beansFactory.createTableColumn("DispRslt.col_298", MCColumnType.NUMBER);
		p.columnDispRslt_col_299 = p.beansFactory.createTableColumn("DispRslt.col_299", MCColumnType.NUMBER);
		p.cgDispRslt_cg0 = p.beansFactory.createColumnGroup("DispRslt.cg0");
		p.cgDispRslt_cg1 = p.beansFactory.createColumnGroup("DispRslt.cg1");
		p.cgDispRslt_cg2 = p.beansFactory.createColumnGroup("DispRslt.cg2");
		p.cgDispRslt_cg3 = p.beansFactory.createColumnGroup("DispRslt.cg3");
		p.cgDispRslt_cg4 = p.beansFactory.createColumnGroup("DispRslt.cg4");
		p.cgDispRslt_cg5 = p.beansFactory.createColumnGroup("DispRslt.cg5");
		p.cgDispRslt_cg6 = p.beansFactory.createColumnGroup("DispRslt.cg6");
		p.cgDispRslt_cg7 = p.beansFactory.createColumnGroup("DispRslt.cg7");
		p.cgDispRslt_cg8 = p.beansFactory.createColumnGroup("DispRslt.cg8");
		p.cgDispRslt_cg9 = p.beansFactory.createColumnGroup("DispRslt.cg9");
		p.cgDispRslt_cg10 = p.beansFactory.createColumnGroup("DispRslt.cg10");
		p.cgDispRslt_cg11 = p.beansFactory.createColumnGroup("DispRslt.cg11");
		p.cgDispRslt_cg12 = p.beansFactory.createColumnGroup("DispRslt.cg12");
		p.cgDispRslt_cg13 = p.beansFactory.createColumnGroup("DispRslt.cg13");
		p.cgDispRslt_cg14 = p.beansFactory.createColumnGroup("DispRslt.cg14");
		p.cgDispRslt_cg15 = p.beansFactory.createColumnGroup("DispRslt.cg15");
		p.cgDispRslt_cg16 = p.beansFactory.createColumnGroup("DispRslt.cg16");
		p.cgDispRslt_cg17 = p.beansFactory.createColumnGroup("DispRslt.cg17");
		p.cgDispRslt_cg18 = p.beansFactory.createColumnGroup("DispRslt.cg18");
		p.cgDispRslt_cg19 = p.beansFactory.createColumnGroup("DispRslt.cg19");
		p.cgDispRslt_cg20 = p.beansFactory.createColumnGroup("DispRslt.cg20");
		p.cgDispRslt_cg21 = p.beansFactory.createColumnGroup("DispRslt.cg21");
		p.cgDispRslt_cg22 = p.beansFactory.createColumnGroup("DispRslt.cg22");
		p.cgDispRslt_cg23 = p.beansFactory.createColumnGroup("DispRslt.cg23");
		p.cgDispRslt_cg24 = p.beansFactory.createColumnGroup("DispRslt.cg24");
		p.cgDispRslt_cg25 = p.beansFactory.createColumnGroup("DispRslt.cg25");
		p.cgDispRslt_cg26 = p.beansFactory.createColumnGroup("DispRslt.cg26");
		p.cgDispRslt_cg27 = p.beansFactory.createColumnGroup("DispRslt.cg27");
		p.cgDispRslt_cg28 = p.beansFactory.createColumnGroup("DispRslt.cg28");
		p.cgDispRslt_cg29 = p.beansFactory.createColumnGroup("DispRslt.cg29");
		p.cgDispRslt_cg30 = p.beansFactory.createColumnGroup("DispRslt.cg30");
		p.cgDispRslt_cg31 = p.beansFactory.createColumnGroup("DispRslt.cg31");
		p.cgDispRslt_cg32 = p.beansFactory.createColumnGroup("DispRslt.cg32");
		p.cgDispRslt_cg33 = p.beansFactory.createColumnGroup("DispRslt.cg33");
		p.cgDispRslt_cg34 = p.beansFactory.createColumnGroup("DispRslt.cg34");
		p.cgDispRslt_cg35 = p.beansFactory.createColumnGroup("DispRslt.cg35");
		p.cgDispRslt_cg36 = p.beansFactory.createColumnGroup("DispRslt.cg36");
		p.cgDispRslt_cg37 = p.beansFactory.createColumnGroup("DispRslt.cg37");
		p.cgDispRslt_cg38 = p.beansFactory.createColumnGroup("DispRslt.cg38");
		p.cgDispRslt_cg39 = p.beansFactory.createColumnGroup("DispRslt.cg39");
		p.cgDispRslt_cg40 = p.beansFactory.createColumnGroup("DispRslt.cg40");
		p.cgDispRslt_cg41 = p.beansFactory.createColumnGroup("DispRslt.cg41");
		p.cgDispRslt_cg42 = p.beansFactory.createColumnGroup("DispRslt.cg42");
		p.cgDispRslt_cg43 = p.beansFactory.createColumnGroup("DispRslt.cg43");
		p.cgDispRslt_cg44 = p.beansFactory.createColumnGroup("DispRslt.cg44");
		p.cgDispRslt_cg45 = p.beansFactory.createColumnGroup("DispRslt.cg45");
		p.cgDispRslt_cg46 = p.beansFactory.createColumnGroup("DispRslt.cg46");
		p.cgDispRslt_cg47 = p.beansFactory.createColumnGroup("DispRslt.cg47");
		p.cgDispRslt_cg48 = p.beansFactory.createColumnGroup("DispRslt.cg48");
		p.cgDispRslt_cg49 = p.beansFactory.createColumnGroup("DispRslt.cg49");
		p.cgDispRslt_cg50 = p.beansFactory.createColumnGroup("DispRslt.cg50");
		p.cgDispRslt_cg51 = p.beansFactory.createColumnGroup("DispRslt.cg51");
		p.cgDispRslt_cg52 = p.beansFactory.createColumnGroup("DispRslt.cg52");
		p.cgDispRslt_cg53 = p.beansFactory.createColumnGroup("DispRslt.cg53");
		p.cgDispRslt_cg54 = p.beansFactory.createColumnGroup("DispRslt.cg54");
		p.cgDispRslt_cg55 = p.beansFactory.createColumnGroup("DispRslt.cg55");
		p.cgDispRslt_cg56 = p.beansFactory.createColumnGroup("DispRslt.cg56");
		p.cgDispRslt_cg57 = p.beansFactory.createColumnGroup("DispRslt.cg57");
		p.cgDispRslt_cg58 = p.beansFactory.createColumnGroup("DispRslt.cg58");
		p.cgDispRslt_cg59 = p.beansFactory.createColumnGroup("DispRslt.cg59");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispRsltPanel);
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
	protected static void jbInitFold(MGBFP_AveFixSrch p) {
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
	protected static void jbInitTab1(MGBFP_AveFixSrch p) {
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
	protected static void jbInitTab2(MGBFP_AveFixSrch p) {
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
	protected static void jbInitTab3(MGBFP_AveFixSrch p) {
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
	protected static void jbInitCnd(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
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
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_except_oth_flg);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asst_typ_nm, true);
		p.CndPanel.add(p.Cnd_except_oth_flg);
		p.Cnd_except_oth_flg.setNextBeans(p.Cnd_repurc_obli_typ);
		p.Cnd_except_oth_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.except_oth_flg_META);
		p.Cnd_repurc_obli_typ.setListType(MCListType.STRICT);
		p.Cnd_repurc_obli_typ.setLinkBeans(p.Cnd_repurc_obli_typ_nm);
		p.CndPanel.add(p.Cnd_repurc_obli_typ_Label);
		p.CndPanel.add(p.Cnd_repurc_obli_typ);
		p.Cnd_repurc_obli_typ.setNextBeans(p.Cnd_repurc_obli_typ_nm);
		p.Cnd_repurc_obli_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.repurc_obli_typ_META);
		p.CndPanel.add(p.Cnd_repurc_obli_typ_nm);
		p.Cnd_repurc_obli_typ_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_repurc_obli_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.repurc_obli_typ_nm_META);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_no_sppl_flg);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_no_sppl_flg);
		p.Cnd_no_sppl_flg.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_no_sppl_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.no_sppl_flg_META);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_area_cd);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_sppl_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd1, true);
		p.Cnd_sppl_grp_cd1.setLinkBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_sppl_grp_cd1);
		p.Cnd_sppl_grp_cd1.setNextBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_nm1.setNextBeans(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm1, true);
		p.Cnd_sppl_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd2, true);
		p.Cnd_sppl_grp_cd2.setLinkBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_cd2.setNextBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_nm2.setNextBeans(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm2, true);
		p.Cnd_sppl_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd3, true);
		p.Cnd_sppl_grp_cd3.setLinkBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_cd3.setNextBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_nm3.setNextBeans(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm3, true);
		p.Cnd_sppl_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd4, true);
		p.Cnd_sppl_grp_cd4.setLinkBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_cd4.setNextBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_nm4.setNextBeans(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm4, true);
		p.Cnd_sppl_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd5, true);
		p.Cnd_sppl_grp_cd5.setLinkBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_cd5.setNextBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_nm5.setNextBeans(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm5, true);
		p.Cnd_sppl_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd6, true);
		p.Cnd_sppl_grp_cd6.setLinkBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_cd6.setNextBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_nm6.setNextBeans(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm6, true);
		p.Cnd_sppl_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd7, true);
		p.Cnd_sppl_grp_cd7.setLinkBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_cd7.setNextBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_nm7.setNextBeans(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm7, true);
		p.Cnd_sppl_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd8, true);
		p.Cnd_sppl_grp_cd8.setLinkBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_cd8.setNextBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_nm8.setNextBeans(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm8, true);
		p.Cnd_sppl_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd9, true);
		p.Cnd_sppl_grp_cd9.setLinkBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_cd9.setNextBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_nm9.setNextBeans(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm9, true);
		p.Cnd_sppl_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd10, true);
		p.Cnd_sppl_grp_cd10.setLinkBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_cd10.setNextBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0420.CndR.sppl_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm10, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_disp_std);
		p.LPnlPanel.setLastBeans(p.LPnl_disp_std);
		p.LPnl_disp_std.setNextBeans(p.LPnl_disp_unit);
		p.LPnl_disp_std.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_std_META);
		p.LPnlPanel.add(p.LPnl_disp_unit);
		p.LPnl_disp_unit.setNextBeans(p.LPnl_disp_ave_upri);
		p.LPnl_disp_unit.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_unit_META);
		p.LPnlPanel.add(p.LPnl_disp_ave_upri);
		p.LPnl_disp_ave_upri.setNextBeans(p.LPnl_disp_ave_unit);
		p.LPnl_disp_ave_upri.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_ave_upri_META);
		p.LPnlPanel.add(p.LPnl_disp_ave_unit);
		p.LPnl_disp_ave_unit.setNextBeans(p.LPnl_disp_std_upri);
		p.LPnl_disp_ave_unit.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_ave_unit_META);
		p.LPnlPanel.add(p.LPnl_disp_std_upri);
		p.LPnl_disp_std_upri.setNextBeans(p.LPnl_disp_std_unit);
		p.LPnl_disp_std_upri.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_std_upri_META);
		p.LPnlPanel.add(p.LPnl_disp_std_unit);
		p.LPnl_disp_std_unit.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0420.LPnlR.disp_std_unit_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispRslt(MGBFP_AveFixSrch p) {
		// ブロック関連の初期化
		p.add(p.DispRsltPanel);
		p.DispRsltPanel.add(p.DispRsltScrollPane);
		p.DispRsltPanel.setLastBeans(p.DispRsltTable);
		p.DispRsltScrollPane.setViewportView(p.DispRsltTable);
		p.DispRsltTable.setList(p.getDispRsltL());
		p.DispRsltTable.setStatusColumnVisible(false);
		p.DispRsltPanel.setLayoutPosition("CBC");
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
		MGBFP_AveFixSrch_MC.mcInitTop((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitFold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitTab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitTab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitTab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitCnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitCnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitCnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitLPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitCtrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.mcInitDispRslt((MGBFP_AveFixSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_AveFixSrch_MC.statusInitSRCH_Top((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Fold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Tab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Tab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Tab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Cnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Cnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Cnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_LPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Ctrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_DispRslt((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Rslt((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitSRCH_Fix((MGBFP_AveFixSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_AveFixSrch_MC.statusInitREF_Top((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Fold((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Tab1((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Tab2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Tab3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Cnd((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Cnd2((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Cnd3((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_LPnl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Ctrl((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_DispRslt((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Rslt((MGBFP_AveFixSrch)this);
		MGBFP_AveFixSrch_MC.statusInitREF_Fix((MGBFP_AveFixSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBFP_AveFixSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_AveFixSrch p) {
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
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_sno1.setListListener(p);
		p.Cnd_sno1.addAllListener(p);
		p.Cnd_sno2.setListListener(p);
		p.Cnd_sno2.addAllListener(p);
		p.Cnd_sno3.setListListener(p);
		p.Cnd_sno3.addAllListener(p);
		p.Cnd_sno4.setListListener(p);
		p.Cnd_sno4.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_except_oth_flg.addAllListener(p);
		p.Cnd_repurc_obli_typ.setListListener(p);
		p.Cnd_repurc_obli_typ.addAllListener(p);
		p.Cnd_repurc_obli_typ_nm.setListListener(p);
		p.Cnd_repurc_obli_typ_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_no_sppl_flg.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
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
		p.Cnd_sppl_grp_cd1.setListListener(p);
		p.Cnd_sppl_grp_cd1.addAllListener(p);
		p.Cnd_sppl_grp_nm1.setListListener(p);
		p.Cnd_sppl_grp_nm1.addAllListener(p);
		p.Cnd_sppl_grp_cd2.setListListener(p);
		p.Cnd_sppl_grp_cd2.addAllListener(p);
		p.Cnd_sppl_grp_nm2.setListListener(p);
		p.Cnd_sppl_grp_nm2.addAllListener(p);
		p.Cnd_sppl_grp_cd3.setListListener(p);
		p.Cnd_sppl_grp_cd3.addAllListener(p);
		p.Cnd_sppl_grp_nm3.setListListener(p);
		p.Cnd_sppl_grp_nm3.addAllListener(p);
		p.Cnd_sppl_grp_cd4.setListListener(p);
		p.Cnd_sppl_grp_cd4.addAllListener(p);
		p.Cnd_sppl_grp_nm4.setListListener(p);
		p.Cnd_sppl_grp_nm4.addAllListener(p);
		p.Cnd_sppl_grp_cd5.setListListener(p);
		p.Cnd_sppl_grp_cd5.addAllListener(p);
		p.Cnd_sppl_grp_nm5.setListListener(p);
		p.Cnd_sppl_grp_nm5.addAllListener(p);
		p.Cnd_sppl_grp_cd6.setListListener(p);
		p.Cnd_sppl_grp_cd6.addAllListener(p);
		p.Cnd_sppl_grp_nm6.setListListener(p);
		p.Cnd_sppl_grp_nm6.addAllListener(p);
		p.Cnd_sppl_grp_cd7.setListListener(p);
		p.Cnd_sppl_grp_cd7.addAllListener(p);
		p.Cnd_sppl_grp_nm7.setListListener(p);
		p.Cnd_sppl_grp_nm7.addAllListener(p);
		p.Cnd_sppl_grp_cd8.setListListener(p);
		p.Cnd_sppl_grp_cd8.addAllListener(p);
		p.Cnd_sppl_grp_nm8.setListListener(p);
		p.Cnd_sppl_grp_nm8.addAllListener(p);
		p.Cnd_sppl_grp_cd9.setListListener(p);
		p.Cnd_sppl_grp_cd9.addAllListener(p);
		p.Cnd_sppl_grp_nm9.setListListener(p);
		p.Cnd_sppl_grp_nm9.addAllListener(p);
		p.Cnd_sppl_grp_cd10.setListListener(p);
		p.Cnd_sppl_grp_cd10.addAllListener(p);
		p.Cnd_sppl_grp_nm10.setListListener(p);
		p.Cnd_sppl_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBFP_AveFixSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_AveFixSrch p) {
		p.LPnl_disp_std.addAllListener(p);
		p.LPnl_disp_unit.addAllListener(p);
		p.LPnl_disp_ave_upri.addAllListener(p);
		p.LPnl_disp_ave_unit.addAllListener(p);
		p.LPnl_disp_std_upri.addAllListener(p);
		p.LPnl_disp_std_unit.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_AveFixSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBFP_AveFixSrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_calc_grp_cd.addAllListener(p);
		p.columnDispRslt_calc_grp_cd.setListListener(p);
		p.columnDispRslt_calc_grp_nm.addAllListener(p);
		p.columnDispRslt_calc_grp_nm.setListListener(p);
		p.columnDispRslt_wg_cd.addAllListener(p);
		p.columnDispRslt_wg_cd.setListListener(p);
		p.columnDispRslt_wg_nm.addAllListener(p);
		p.columnDispRslt_wg_nm.setListListener(p);
		p.columnDispRslt_mng_dpt_cd.addAllListener(p);
		p.columnDispRslt_mng_dpt_cd.setListListener(p);
		p.columnDispRslt_mng_dpt_nm.addAllListener(p);
		p.columnDispRslt_mng_dpt_nm.setListListener(p);
		p.columnDispRslt_itm_typ.addAllListener(p);
		p.columnDispRslt_itm_typ.setListListener(p);
		p.columnDispRslt_itm_typ_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_nm.setListListener(p);
		p.columnDispRslt_itm_typ_d_cd.addAllListener(p);
		p.columnDispRslt_itm_typ_d_cd.setListListener(p);
		p.columnDispRslt_itm_typ_d_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_d_nm.setListListener(p);
		p.columnDispRslt_itm_jnl_cd.addAllListener(p);
		p.columnDispRslt_itm_jnl_cd.setListListener(p);
		p.columnDispRslt_itm_jnl_nm.addAllListener(p);
		p.columnDispRslt_itm_jnl_nm.setListListener(p);
		p.columnDispRslt_lot_no.addAllListener(p);
		p.columnDispRslt_lot_no.setListListener(p);
		p.columnDispRslt_sublot_no.addAllListener(p);
		p.columnDispRslt_sublot_no.setListListener(p);
		p.columnDispRslt_sno1.addAllListener(p);
		p.columnDispRslt_sno1.setListListener(p);
		p.columnDispRslt_sno2.addAllListener(p);
		p.columnDispRslt_sno2.setListListener(p);
		p.columnDispRslt_sno3.addAllListener(p);
		p.columnDispRslt_sno3.setListListener(p);
		p.columnDispRslt_sno4.addAllListener(p);
		p.columnDispRslt_sno4.setListListener(p);
		p.columnDispRslt_sppl_cd.addAllListener(p);
		p.columnDispRslt_sppl_cd.setListListener(p);
		p.columnDispRslt_sppl_nm.addAllListener(p);
		p.columnDispRslt_sppl_nm.setListListener(p);
		p.columnDispRslt_asst_typ.addAllListener(p);
		p.columnDispRslt_asst_typ.setListListener(p);
		p.columnDispRslt_asst_typ_nm.addAllListener(p);
		p.columnDispRslt_asst_typ_nm.setListListener(p);
		p.columnDispRslt_repurc_obli_flg.addAllListener(p);
		p.columnDispRslt_unit_cd.addAllListener(p);
		p.columnDispRslt_unit_cd.setListListener(p);
		p.columnDispRslt_unit_nm.addAllListener(p);
		p.columnDispRslt_unit_nm.setListListener(p);
		p.columnDispRslt_dec_place.addAllListener(p);
		p.columnDispRslt_dec_place.setListListener(p);
		p.columnDispRslt_col_001.addAllListener(p);
		p.columnDispRslt_col_001.setListListener(p);
		p.columnDispRslt_col_002.addAllListener(p);
		p.columnDispRslt_col_002.setListListener(p);
		p.columnDispRslt_col_003.addAllListener(p);
		p.columnDispRslt_col_003.setListListener(p);
		p.columnDispRslt_col_004.addAllListener(p);
		p.columnDispRslt_col_004.setListListener(p);
		p.columnDispRslt_col_006.addAllListener(p);
		p.columnDispRslt_col_006.setListListener(p);
		p.columnDispRslt_col_007.addAllListener(p);
		p.columnDispRslt_col_007.setListListener(p);
		p.columnDispRslt_col_008.addAllListener(p);
		p.columnDispRslt_col_008.setListListener(p);
		p.columnDispRslt_col_009.addAllListener(p);
		p.columnDispRslt_col_009.setListListener(p);
		p.columnDispRslt_col_011.addAllListener(p);
		p.columnDispRslt_col_011.setListListener(p);
		p.columnDispRslt_col_012.addAllListener(p);
		p.columnDispRslt_col_012.setListListener(p);
		p.columnDispRslt_col_013.addAllListener(p);
		p.columnDispRslt_col_013.setListListener(p);
		p.columnDispRslt_col_014.addAllListener(p);
		p.columnDispRslt_col_014.setListListener(p);
		p.columnDispRslt_col_016.addAllListener(p);
		p.columnDispRslt_col_016.setListListener(p);
		p.columnDispRslt_col_017.addAllListener(p);
		p.columnDispRslt_col_017.setListListener(p);
		p.columnDispRslt_col_018.addAllListener(p);
		p.columnDispRslt_col_018.setListListener(p);
		p.columnDispRslt_col_019.addAllListener(p);
		p.columnDispRslt_col_019.setListListener(p);
		p.columnDispRslt_col_021.addAllListener(p);
		p.columnDispRslt_col_021.setListListener(p);
		p.columnDispRslt_col_022.addAllListener(p);
		p.columnDispRslt_col_022.setListListener(p);
		p.columnDispRslt_col_023.addAllListener(p);
		p.columnDispRslt_col_023.setListListener(p);
		p.columnDispRslt_col_024.addAllListener(p);
		p.columnDispRslt_col_024.setListListener(p);
		p.columnDispRslt_col_026.addAllListener(p);
		p.columnDispRslt_col_026.setListListener(p);
		p.columnDispRslt_col_027.addAllListener(p);
		p.columnDispRslt_col_027.setListListener(p);
		p.columnDispRslt_col_028.addAllListener(p);
		p.columnDispRslt_col_028.setListListener(p);
		p.columnDispRslt_col_029.addAllListener(p);
		p.columnDispRslt_col_029.setListListener(p);
		p.columnDispRslt_col_031.addAllListener(p);
		p.columnDispRslt_col_031.setListListener(p);
		p.columnDispRslt_col_032.addAllListener(p);
		p.columnDispRslt_col_032.setListListener(p);
		p.columnDispRslt_col_033.addAllListener(p);
		p.columnDispRslt_col_033.setListListener(p);
		p.columnDispRslt_col_034.addAllListener(p);
		p.columnDispRslt_col_034.setListListener(p);
		p.columnDispRslt_col_036.addAllListener(p);
		p.columnDispRslt_col_036.setListListener(p);
		p.columnDispRslt_col_037.addAllListener(p);
		p.columnDispRslt_col_037.setListListener(p);
		p.columnDispRslt_col_038.addAllListener(p);
		p.columnDispRslt_col_038.setListListener(p);
		p.columnDispRslt_col_039.addAllListener(p);
		p.columnDispRslt_col_039.setListListener(p);
		p.columnDispRslt_col_041.addAllListener(p);
		p.columnDispRslt_col_041.setListListener(p);
		p.columnDispRslt_col_042.addAllListener(p);
		p.columnDispRslt_col_042.setListListener(p);
		p.columnDispRslt_col_043.addAllListener(p);
		p.columnDispRslt_col_043.setListListener(p);
		p.columnDispRslt_col_044.addAllListener(p);
		p.columnDispRslt_col_044.setListListener(p);
		p.columnDispRslt_col_046.addAllListener(p);
		p.columnDispRslt_col_046.setListListener(p);
		p.columnDispRslt_col_047.addAllListener(p);
		p.columnDispRslt_col_047.setListListener(p);
		p.columnDispRslt_col_048.addAllListener(p);
		p.columnDispRslt_col_048.setListListener(p);
		p.columnDispRslt_col_049.addAllListener(p);
		p.columnDispRslt_col_049.setListListener(p);
		p.columnDispRslt_col_051.addAllListener(p);
		p.columnDispRslt_col_051.setListListener(p);
		p.columnDispRslt_col_052.addAllListener(p);
		p.columnDispRslt_col_052.setListListener(p);
		p.columnDispRslt_col_053.addAllListener(p);
		p.columnDispRslt_col_053.setListListener(p);
		p.columnDispRslt_col_054.addAllListener(p);
		p.columnDispRslt_col_054.setListListener(p);
		p.columnDispRslt_col_056.addAllListener(p);
		p.columnDispRslt_col_056.setListListener(p);
		p.columnDispRslt_col_057.addAllListener(p);
		p.columnDispRslt_col_057.setListListener(p);
		p.columnDispRslt_col_058.addAllListener(p);
		p.columnDispRslt_col_058.setListListener(p);
		p.columnDispRslt_col_059.addAllListener(p);
		p.columnDispRslt_col_059.setListListener(p);
		p.columnDispRslt_col_061.addAllListener(p);
		p.columnDispRslt_col_061.setListListener(p);
		p.columnDispRslt_col_062.addAllListener(p);
		p.columnDispRslt_col_062.setListListener(p);
		p.columnDispRslt_col_063.addAllListener(p);
		p.columnDispRslt_col_063.setListListener(p);
		p.columnDispRslt_col_064.addAllListener(p);
		p.columnDispRslt_col_064.setListListener(p);
		p.columnDispRslt_col_066.addAllListener(p);
		p.columnDispRslt_col_066.setListListener(p);
		p.columnDispRslt_col_067.addAllListener(p);
		p.columnDispRslt_col_067.setListListener(p);
		p.columnDispRslt_col_068.addAllListener(p);
		p.columnDispRslt_col_068.setListListener(p);
		p.columnDispRslt_col_069.addAllListener(p);
		p.columnDispRslt_col_069.setListListener(p);
		p.columnDispRslt_col_071.addAllListener(p);
		p.columnDispRslt_col_071.setListListener(p);
		p.columnDispRslt_col_072.addAllListener(p);
		p.columnDispRslt_col_072.setListListener(p);
		p.columnDispRslt_col_073.addAllListener(p);
		p.columnDispRslt_col_073.setListListener(p);
		p.columnDispRslt_col_074.addAllListener(p);
		p.columnDispRslt_col_074.setListListener(p);
		p.columnDispRslt_col_076.addAllListener(p);
		p.columnDispRslt_col_076.setListListener(p);
		p.columnDispRslt_col_077.addAllListener(p);
		p.columnDispRslt_col_077.setListListener(p);
		p.columnDispRslt_col_078.addAllListener(p);
		p.columnDispRslt_col_078.setListListener(p);
		p.columnDispRslt_col_079.addAllListener(p);
		p.columnDispRslt_col_079.setListListener(p);
		p.columnDispRslt_col_081.addAllListener(p);
		p.columnDispRslt_col_081.setListListener(p);
		p.columnDispRslt_col_082.addAllListener(p);
		p.columnDispRslt_col_082.setListListener(p);
		p.columnDispRslt_col_083.addAllListener(p);
		p.columnDispRslt_col_083.setListListener(p);
		p.columnDispRslt_col_084.addAllListener(p);
		p.columnDispRslt_col_084.setListListener(p);
		p.columnDispRslt_col_086.addAllListener(p);
		p.columnDispRslt_col_086.setListListener(p);
		p.columnDispRslt_col_087.addAllListener(p);
		p.columnDispRslt_col_087.setListListener(p);
		p.columnDispRslt_col_088.addAllListener(p);
		p.columnDispRslt_col_088.setListListener(p);
		p.columnDispRslt_col_089.addAllListener(p);
		p.columnDispRslt_col_089.setListListener(p);
		p.columnDispRslt_col_091.addAllListener(p);
		p.columnDispRslt_col_091.setListListener(p);
		p.columnDispRslt_col_092.addAllListener(p);
		p.columnDispRslt_col_092.setListListener(p);
		p.columnDispRslt_col_093.addAllListener(p);
		p.columnDispRslt_col_093.setListListener(p);
		p.columnDispRslt_col_094.addAllListener(p);
		p.columnDispRslt_col_094.setListListener(p);
		p.columnDispRslt_col_096.addAllListener(p);
		p.columnDispRslt_col_096.setListListener(p);
		p.columnDispRslt_col_097.addAllListener(p);
		p.columnDispRslt_col_097.setListListener(p);
		p.columnDispRslt_col_098.addAllListener(p);
		p.columnDispRslt_col_098.setListListener(p);
		p.columnDispRslt_col_099.addAllListener(p);
		p.columnDispRslt_col_099.setListListener(p);
		p.columnDispRslt_col_101.addAllListener(p);
		p.columnDispRslt_col_101.setListListener(p);
		p.columnDispRslt_col_102.addAllListener(p);
		p.columnDispRslt_col_102.setListListener(p);
		p.columnDispRslt_col_103.addAllListener(p);
		p.columnDispRslt_col_103.setListListener(p);
		p.columnDispRslt_col_104.addAllListener(p);
		p.columnDispRslt_col_104.setListListener(p);
		p.columnDispRslt_col_106.addAllListener(p);
		p.columnDispRslt_col_106.setListListener(p);
		p.columnDispRslt_col_107.addAllListener(p);
		p.columnDispRslt_col_107.setListListener(p);
		p.columnDispRslt_col_108.addAllListener(p);
		p.columnDispRslt_col_108.setListListener(p);
		p.columnDispRslt_col_109.addAllListener(p);
		p.columnDispRslt_col_109.setListListener(p);
		p.columnDispRslt_col_111.addAllListener(p);
		p.columnDispRslt_col_111.setListListener(p);
		p.columnDispRslt_col_112.addAllListener(p);
		p.columnDispRslt_col_112.setListListener(p);
		p.columnDispRslt_col_113.addAllListener(p);
		p.columnDispRslt_col_113.setListListener(p);
		p.columnDispRslt_col_114.addAllListener(p);
		p.columnDispRslt_col_114.setListListener(p);
		p.columnDispRslt_col_116.addAllListener(p);
		p.columnDispRslt_col_116.setListListener(p);
		p.columnDispRslt_col_117.addAllListener(p);
		p.columnDispRslt_col_117.setListListener(p);
		p.columnDispRslt_col_118.addAllListener(p);
		p.columnDispRslt_col_118.setListListener(p);
		p.columnDispRslt_col_119.addAllListener(p);
		p.columnDispRslt_col_119.setListListener(p);
		p.columnDispRslt_col_121.addAllListener(p);
		p.columnDispRslt_col_121.setListListener(p);
		p.columnDispRslt_col_122.addAllListener(p);
		p.columnDispRslt_col_122.setListListener(p);
		p.columnDispRslt_col_123.addAllListener(p);
		p.columnDispRslt_col_123.setListListener(p);
		p.columnDispRslt_col_124.addAllListener(p);
		p.columnDispRslt_col_124.setListListener(p);
		p.columnDispRslt_col_126.addAllListener(p);
		p.columnDispRslt_col_126.setListListener(p);
		p.columnDispRslt_col_127.addAllListener(p);
		p.columnDispRslt_col_127.setListListener(p);
		p.columnDispRslt_col_128.addAllListener(p);
		p.columnDispRslt_col_128.setListListener(p);
		p.columnDispRslt_col_129.addAllListener(p);
		p.columnDispRslt_col_129.setListListener(p);
		p.columnDispRslt_col_131.addAllListener(p);
		p.columnDispRslt_col_131.setListListener(p);
		p.columnDispRslt_col_132.addAllListener(p);
		p.columnDispRslt_col_132.setListListener(p);
		p.columnDispRslt_col_133.addAllListener(p);
		p.columnDispRslt_col_133.setListListener(p);
		p.columnDispRslt_col_134.addAllListener(p);
		p.columnDispRslt_col_134.setListListener(p);
		p.columnDispRslt_col_136.addAllListener(p);
		p.columnDispRslt_col_136.setListListener(p);
		p.columnDispRslt_col_137.addAllListener(p);
		p.columnDispRslt_col_137.setListListener(p);
		p.columnDispRslt_col_138.addAllListener(p);
		p.columnDispRslt_col_138.setListListener(p);
		p.columnDispRslt_col_139.addAllListener(p);
		p.columnDispRslt_col_139.setListListener(p);
		p.columnDispRslt_col_141.addAllListener(p);
		p.columnDispRslt_col_141.setListListener(p);
		p.columnDispRslt_col_142.addAllListener(p);
		p.columnDispRslt_col_142.setListListener(p);
		p.columnDispRslt_col_143.addAllListener(p);
		p.columnDispRslt_col_143.setListListener(p);
		p.columnDispRslt_col_144.addAllListener(p);
		p.columnDispRslt_col_144.setListListener(p);
		p.columnDispRslt_col_146.addAllListener(p);
		p.columnDispRslt_col_146.setListListener(p);
		p.columnDispRslt_col_147.addAllListener(p);
		p.columnDispRslt_col_147.setListListener(p);
		p.columnDispRslt_col_148.addAllListener(p);
		p.columnDispRslt_col_148.setListListener(p);
		p.columnDispRslt_col_149.addAllListener(p);
		p.columnDispRslt_col_149.setListListener(p);
		p.columnDispRslt_col_151.addAllListener(p);
		p.columnDispRslt_col_151.setListListener(p);
		p.columnDispRslt_col_152.addAllListener(p);
		p.columnDispRslt_col_152.setListListener(p);
		p.columnDispRslt_col_153.addAllListener(p);
		p.columnDispRslt_col_153.setListListener(p);
		p.columnDispRslt_col_154.addAllListener(p);
		p.columnDispRslt_col_154.setListListener(p);
		p.columnDispRslt_col_156.addAllListener(p);
		p.columnDispRslt_col_156.setListListener(p);
		p.columnDispRslt_col_157.addAllListener(p);
		p.columnDispRslt_col_157.setListListener(p);
		p.columnDispRslt_col_158.addAllListener(p);
		p.columnDispRslt_col_158.setListListener(p);
		p.columnDispRslt_col_159.addAllListener(p);
		p.columnDispRslt_col_159.setListListener(p);
		p.columnDispRslt_col_161.addAllListener(p);
		p.columnDispRslt_col_161.setListListener(p);
		p.columnDispRslt_col_162.addAllListener(p);
		p.columnDispRslt_col_162.setListListener(p);
		p.columnDispRslt_col_163.addAllListener(p);
		p.columnDispRslt_col_163.setListListener(p);
		p.columnDispRslt_col_164.addAllListener(p);
		p.columnDispRslt_col_164.setListListener(p);
		p.columnDispRslt_col_166.addAllListener(p);
		p.columnDispRslt_col_166.setListListener(p);
		p.columnDispRslt_col_167.addAllListener(p);
		p.columnDispRslt_col_167.setListListener(p);
		p.columnDispRslt_col_168.addAllListener(p);
		p.columnDispRslt_col_168.setListListener(p);
		p.columnDispRslt_col_169.addAllListener(p);
		p.columnDispRslt_col_169.setListListener(p);
		p.columnDispRslt_col_171.addAllListener(p);
		p.columnDispRslt_col_171.setListListener(p);
		p.columnDispRslt_col_172.addAllListener(p);
		p.columnDispRslt_col_172.setListListener(p);
		p.columnDispRslt_col_173.addAllListener(p);
		p.columnDispRslt_col_173.setListListener(p);
		p.columnDispRslt_col_174.addAllListener(p);
		p.columnDispRslt_col_174.setListListener(p);
		p.columnDispRslt_col_176.addAllListener(p);
		p.columnDispRslt_col_176.setListListener(p);
		p.columnDispRslt_col_177.addAllListener(p);
		p.columnDispRslt_col_177.setListListener(p);
		p.columnDispRslt_col_178.addAllListener(p);
		p.columnDispRslt_col_178.setListListener(p);
		p.columnDispRslt_col_179.addAllListener(p);
		p.columnDispRslt_col_179.setListListener(p);
		p.columnDispRslt_col_181.addAllListener(p);
		p.columnDispRslt_col_181.setListListener(p);
		p.columnDispRslt_col_182.addAllListener(p);
		p.columnDispRslt_col_182.setListListener(p);
		p.columnDispRslt_col_183.addAllListener(p);
		p.columnDispRslt_col_183.setListListener(p);
		p.columnDispRslt_col_184.addAllListener(p);
		p.columnDispRslt_col_184.setListListener(p);
		p.columnDispRslt_col_186.addAllListener(p);
		p.columnDispRslt_col_186.setListListener(p);
		p.columnDispRslt_col_187.addAllListener(p);
		p.columnDispRslt_col_187.setListListener(p);
		p.columnDispRslt_col_188.addAllListener(p);
		p.columnDispRslt_col_188.setListListener(p);
		p.columnDispRslt_col_189.addAllListener(p);
		p.columnDispRslt_col_189.setListListener(p);
		p.columnDispRslt_col_191.addAllListener(p);
		p.columnDispRslt_col_191.setListListener(p);
		p.columnDispRslt_col_192.addAllListener(p);
		p.columnDispRslt_col_192.setListListener(p);
		p.columnDispRslt_col_193.addAllListener(p);
		p.columnDispRslt_col_193.setListListener(p);
		p.columnDispRslt_col_194.addAllListener(p);
		p.columnDispRslt_col_194.setListListener(p);
		p.columnDispRslt_col_196.addAllListener(p);
		p.columnDispRslt_col_196.setListListener(p);
		p.columnDispRslt_col_197.addAllListener(p);
		p.columnDispRslt_col_197.setListListener(p);
		p.columnDispRslt_col_198.addAllListener(p);
		p.columnDispRslt_col_198.setListListener(p);
		p.columnDispRslt_col_199.addAllListener(p);
		p.columnDispRslt_col_199.setListListener(p);
		p.columnDispRslt_col_201.addAllListener(p);
		p.columnDispRslt_col_201.setListListener(p);
		p.columnDispRslt_col_202.addAllListener(p);
		p.columnDispRslt_col_202.setListListener(p);
		p.columnDispRslt_col_203.addAllListener(p);
		p.columnDispRslt_col_203.setListListener(p);
		p.columnDispRslt_col_204.addAllListener(p);
		p.columnDispRslt_col_204.setListListener(p);
		p.columnDispRslt_col_206.addAllListener(p);
		p.columnDispRslt_col_206.setListListener(p);
		p.columnDispRslt_col_207.addAllListener(p);
		p.columnDispRslt_col_207.setListListener(p);
		p.columnDispRslt_col_208.addAllListener(p);
		p.columnDispRslt_col_208.setListListener(p);
		p.columnDispRslt_col_209.addAllListener(p);
		p.columnDispRslt_col_209.setListListener(p);
		p.columnDispRslt_col_211.addAllListener(p);
		p.columnDispRslt_col_211.setListListener(p);
		p.columnDispRslt_col_212.addAllListener(p);
		p.columnDispRslt_col_212.setListListener(p);
		p.columnDispRslt_col_213.addAllListener(p);
		p.columnDispRslt_col_213.setListListener(p);
		p.columnDispRslt_col_214.addAllListener(p);
		p.columnDispRslt_col_214.setListListener(p);
		p.columnDispRslt_col_216.addAllListener(p);
		p.columnDispRslt_col_216.setListListener(p);
		p.columnDispRslt_col_217.addAllListener(p);
		p.columnDispRslt_col_217.setListListener(p);
		p.columnDispRslt_col_218.addAllListener(p);
		p.columnDispRslt_col_218.setListListener(p);
		p.columnDispRslt_col_219.addAllListener(p);
		p.columnDispRslt_col_219.setListListener(p);
		p.columnDispRslt_col_221.addAllListener(p);
		p.columnDispRslt_col_221.setListListener(p);
		p.columnDispRslt_col_222.addAllListener(p);
		p.columnDispRslt_col_222.setListListener(p);
		p.columnDispRslt_col_223.addAllListener(p);
		p.columnDispRslt_col_223.setListListener(p);
		p.columnDispRslt_col_224.addAllListener(p);
		p.columnDispRslt_col_224.setListListener(p);
		p.columnDispRslt_col_226.addAllListener(p);
		p.columnDispRslt_col_226.setListListener(p);
		p.columnDispRslt_col_227.addAllListener(p);
		p.columnDispRslt_col_227.setListListener(p);
		p.columnDispRslt_col_228.addAllListener(p);
		p.columnDispRslt_col_228.setListListener(p);
		p.columnDispRslt_col_229.addAllListener(p);
		p.columnDispRslt_col_229.setListListener(p);
		p.columnDispRslt_col_231.addAllListener(p);
		p.columnDispRslt_col_231.setListListener(p);
		p.columnDispRslt_col_232.addAllListener(p);
		p.columnDispRslt_col_232.setListListener(p);
		p.columnDispRslt_col_233.addAllListener(p);
		p.columnDispRslt_col_233.setListListener(p);
		p.columnDispRslt_col_234.addAllListener(p);
		p.columnDispRslt_col_234.setListListener(p);
		p.columnDispRslt_col_236.addAllListener(p);
		p.columnDispRslt_col_236.setListListener(p);
		p.columnDispRslt_col_237.addAllListener(p);
		p.columnDispRslt_col_237.setListListener(p);
		p.columnDispRslt_col_238.addAllListener(p);
		p.columnDispRslt_col_238.setListListener(p);
		p.columnDispRslt_col_239.addAllListener(p);
		p.columnDispRslt_col_239.setListListener(p);
		p.columnDispRslt_col_241.addAllListener(p);
		p.columnDispRslt_col_241.setListListener(p);
		p.columnDispRslt_col_242.addAllListener(p);
		p.columnDispRslt_col_242.setListListener(p);
		p.columnDispRslt_col_243.addAllListener(p);
		p.columnDispRslt_col_243.setListListener(p);
		p.columnDispRslt_col_244.addAllListener(p);
		p.columnDispRslt_col_244.setListListener(p);
		p.columnDispRslt_col_246.addAllListener(p);
		p.columnDispRslt_col_246.setListListener(p);
		p.columnDispRslt_col_247.addAllListener(p);
		p.columnDispRslt_col_247.setListListener(p);
		p.columnDispRslt_col_248.addAllListener(p);
		p.columnDispRslt_col_248.setListListener(p);
		p.columnDispRslt_col_249.addAllListener(p);
		p.columnDispRslt_col_249.setListListener(p);
		p.columnDispRslt_col_251.addAllListener(p);
		p.columnDispRslt_col_251.setListListener(p);
		p.columnDispRslt_col_252.addAllListener(p);
		p.columnDispRslt_col_252.setListListener(p);
		p.columnDispRslt_col_253.addAllListener(p);
		p.columnDispRslt_col_253.setListListener(p);
		p.columnDispRslt_col_254.addAllListener(p);
		p.columnDispRslt_col_254.setListListener(p);
		p.columnDispRslt_col_256.addAllListener(p);
		p.columnDispRslt_col_256.setListListener(p);
		p.columnDispRslt_col_257.addAllListener(p);
		p.columnDispRslt_col_257.setListListener(p);
		p.columnDispRslt_col_258.addAllListener(p);
		p.columnDispRslt_col_258.setListListener(p);
		p.columnDispRslt_col_259.addAllListener(p);
		p.columnDispRslt_col_259.setListListener(p);
		p.columnDispRslt_col_261.addAllListener(p);
		p.columnDispRslt_col_261.setListListener(p);
		p.columnDispRslt_col_262.addAllListener(p);
		p.columnDispRslt_col_262.setListListener(p);
		p.columnDispRslt_col_263.addAllListener(p);
		p.columnDispRslt_col_263.setListListener(p);
		p.columnDispRslt_col_264.addAllListener(p);
		p.columnDispRslt_col_264.setListListener(p);
		p.columnDispRslt_col_266.addAllListener(p);
		p.columnDispRslt_col_266.setListListener(p);
		p.columnDispRslt_col_267.addAllListener(p);
		p.columnDispRslt_col_267.setListListener(p);
		p.columnDispRslt_col_268.addAllListener(p);
		p.columnDispRslt_col_268.setListListener(p);
		p.columnDispRslt_col_269.addAllListener(p);
		p.columnDispRslt_col_269.setListListener(p);
		p.columnDispRslt_col_271.addAllListener(p);
		p.columnDispRslt_col_271.setListListener(p);
		p.columnDispRslt_col_272.addAllListener(p);
		p.columnDispRslt_col_272.setListListener(p);
		p.columnDispRslt_col_273.addAllListener(p);
		p.columnDispRslt_col_273.setListListener(p);
		p.columnDispRslt_col_274.addAllListener(p);
		p.columnDispRslt_col_274.setListListener(p);
		p.columnDispRslt_col_276.addAllListener(p);
		p.columnDispRslt_col_276.setListListener(p);
		p.columnDispRslt_col_277.addAllListener(p);
		p.columnDispRslt_col_277.setListListener(p);
		p.columnDispRslt_col_278.addAllListener(p);
		p.columnDispRslt_col_278.setListListener(p);
		p.columnDispRslt_col_279.addAllListener(p);
		p.columnDispRslt_col_279.setListListener(p);
		p.columnDispRslt_col_281.addAllListener(p);
		p.columnDispRslt_col_281.setListListener(p);
		p.columnDispRslt_col_282.addAllListener(p);
		p.columnDispRslt_col_282.setListListener(p);
		p.columnDispRslt_col_283.addAllListener(p);
		p.columnDispRslt_col_283.setListListener(p);
		p.columnDispRslt_col_284.addAllListener(p);
		p.columnDispRslt_col_284.setListListener(p);
		p.columnDispRslt_col_286.addAllListener(p);
		p.columnDispRslt_col_286.setListListener(p);
		p.columnDispRslt_col_287.addAllListener(p);
		p.columnDispRslt_col_287.setListListener(p);
		p.columnDispRslt_col_288.addAllListener(p);
		p.columnDispRslt_col_288.setListListener(p);
		p.columnDispRslt_col_289.addAllListener(p);
		p.columnDispRslt_col_289.setListListener(p);
		p.columnDispRslt_col_291.addAllListener(p);
		p.columnDispRslt_col_291.setListListener(p);
		p.columnDispRslt_col_292.addAllListener(p);
		p.columnDispRslt_col_292.setListListener(p);
		p.columnDispRslt_col_293.addAllListener(p);
		p.columnDispRslt_col_293.setListListener(p);
		p.columnDispRslt_col_294.addAllListener(p);
		p.columnDispRslt_col_294.setListListener(p);
		p.columnDispRslt_col_296.addAllListener(p);
		p.columnDispRslt_col_296.setListListener(p);
		p.columnDispRslt_col_297.addAllListener(p);
		p.columnDispRslt_col_297.setListListener(p);
		p.columnDispRslt_col_298.addAllListener(p);
		p.columnDispRslt_col_298.setListListener(p);
		p.columnDispRslt_col_299.addAllListener(p);
		p.columnDispRslt_col_299.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_AveFixSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_except_oth_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_repurc_obli_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_repurc_obli_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBFP_AveFixSrch p){
		p.LPnl_disp_std.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_disp_unit.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_disp_ave_upri.putMode(p, SRCH, MCMode.INVISIBLE);
		p.LPnl_disp_ave_unit.putMode(p, SRCH, MCMode.INVISIBLE);
		p.LPnl_disp_std_upri.putMode(p, SRCH, MCMode.INVISIBLE);
		p.LPnl_disp_std_unit.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBFP_AveFixSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DispRslt_qty_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_13_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_15_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_17_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_19_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_101.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_102.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_103.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_104.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_21_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_106.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_107.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_108.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_109.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_111.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_112.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_113.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_114.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_23_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_116.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_117.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_118.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_119.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_24_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_121.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_122.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_123.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_124.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_25_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_126.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_127.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_128.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_129.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_26_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_131.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_132.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_133.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_134.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_27_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_136.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_137.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_138.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_139.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_28_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_141.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_142.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_143.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_144.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_29_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_146.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_147.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_148.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_149.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_30_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_151.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_152.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_153.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_154.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_31_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_156.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_157.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_158.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_159.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_32_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_161.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_162.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_163.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_164.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_33_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_166.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_167.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_168.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_169.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_34_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_171.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_172.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_173.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_174.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_35_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_176.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_177.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_178.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_179.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_36_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_181.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_182.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_183.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_184.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_37_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_186.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_187.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_188.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_189.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_38_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_191.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_192.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_193.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_194.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_39_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_196.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_197.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_198.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_199.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_40_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_201.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_202.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_203.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_204.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_41_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_206.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_207.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_208.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_209.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_42_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_211.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_212.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_213.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_214.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_43_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_216.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_217.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_218.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_219.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_44_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_221.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_222.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_223.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_224.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_45_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_226.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_227.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_228.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_229.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_46_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_231.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_232.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_233.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_234.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_47_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_236.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_237.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_238.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_239.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_48_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_241.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_242.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_243.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_244.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_49_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_246.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_247.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_248.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_249.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_50_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_251.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_252.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_253.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_254.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_51_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_256.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_257.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_258.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_259.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_52_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_261.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_262.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_263.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_264.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_53_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_266.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_267.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_268.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_269.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_54_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_271.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_272.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_273.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_274.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_55_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_276.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_277.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_278.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_279.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_56_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_281.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_282.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_283.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_284.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_57_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_286.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_287.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_288.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_289.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_58_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_291.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_292.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_293.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_294.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_59_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_296.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_297.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_298.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_299.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBFP_AveFixSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fix(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_AveFixSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_except_oth_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_repurc_obli_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_repurc_obli_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_sppl_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBFP_AveFixSrch p){
		p.LPnl_disp_std.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_unit.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_ave_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.LPnl_disp_ave_unit.putMode(p, REF, MCMode.INVISIBLE);
		p.LPnl_disp_std_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.LPnl_disp_std_unit.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBFP_AveFixSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DispRslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_099.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_101.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_102.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_103.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_104.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_106.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_107.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_108.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_109.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_111.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_112.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_113.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_114.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_116.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_117.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_118.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_119.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_121.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_122.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_123.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_124.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_25_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_126.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_127.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_128.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_129.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_26_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_131.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_132.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_133.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_134.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_27_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_136.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_137.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_138.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_139.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_28_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_141.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_142.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_143.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_144.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_29_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_146.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_147.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_148.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_149.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_30_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_151.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_152.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_153.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_154.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_31_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_156.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_157.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_158.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_159.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_32_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_161.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_162.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_163.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_164.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_33_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_166.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_167.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_168.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_169.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_34_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_171.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_172.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_173.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_174.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_35_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_176.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_177.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_178.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_179.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_36_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_181.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_182.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_183.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_184.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_37_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_186.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_187.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_188.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_189.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_38_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_191.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_192.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_193.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_194.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_39_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_196.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_197.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_198.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_199.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_40_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_201.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_202.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_203.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_204.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_41_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_206.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_207.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_208.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_209.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_42_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_211.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_212.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_213.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_214.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_43_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_216.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_217.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_218.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_219.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_44_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_221.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_222.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_223.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_224.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_45_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_226.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_227.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_228.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_229.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_46_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_231.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_232.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_233.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_234.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_47_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_236.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_237.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_238.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_239.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_48_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_241.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_242.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_243.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_244.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_49_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_246.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_247.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_248.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_249.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_50_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_251.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_252.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_253.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_254.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_51_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_256.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_257.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_258.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_259.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_52_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_261.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_262.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_263.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_264.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_53_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_266.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_267.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_268.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_269.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_54_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_271.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_272.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_273.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_274.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_55_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_276.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_277.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_278.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_279.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_56_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_281.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_282.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_283.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_284.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_57_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_286.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_287.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_288.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_289.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_58_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_291.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_292.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_293.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_294.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_59_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_296.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_297.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_298.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_299.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_AveFixSrch p){

	}

	/**
	 * [REF]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fix(MGBFP_AveFixSrch p){

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
		MGBFP_AveFixSrch_MC.setTableConfigDispRslt((MGBFP_AveFixSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBFP_AveFixSrch p) {
		p.columnDispRslt_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.calc_grp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_cd);
		p.columnDispRslt_calc_grp_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.calc_grp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_nm);
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_sppl_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sppl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sppl_cd);
		p.columnDispRslt_sppl_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.sppl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sppl_nm);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_repurc_obli_flg.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.repurc_obli_flg_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_repurc_obli_flg);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.DispRsltTable.addTable(p.DispRslt_qty_00_p_PPanel.QtyTable);
		p.columnDispRslt_col_001.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_001_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_001);
		p.columnDispRslt_col_002.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_002_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_002);
		p.columnDispRslt_col_003.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_003_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_003);
		p.columnDispRslt_col_004.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_004_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_004);
		p.DispRsltTable.addTable(p.DispRslt_qty_01_p_PPanel.QtyTable);
		p.columnDispRslt_col_006.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_006_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_006);
		p.columnDispRslt_col_007.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_007_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_007);
		p.columnDispRslt_col_008.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_008_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_008);
		p.columnDispRslt_col_009.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_009_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_009);
		p.DispRsltTable.addTable(p.DispRslt_qty_02_p_PPanel.QtyTable);
		p.columnDispRslt_col_011.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_011_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_011);
		p.columnDispRslt_col_012.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_012_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_012);
		p.columnDispRslt_col_013.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_013_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_013);
		p.columnDispRslt_col_014.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_014_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_014);
		p.DispRsltTable.addTable(p.DispRslt_qty_03_p_PPanel.QtyTable);
		p.columnDispRslt_col_016.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_016_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_016);
		p.columnDispRslt_col_017.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_017_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_017);
		p.columnDispRslt_col_018.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_018_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_018);
		p.columnDispRslt_col_019.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_019_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_019);
		p.DispRsltTable.addTable(p.DispRslt_qty_04_p_PPanel.QtyTable);
		p.columnDispRslt_col_021.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_021_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_021);
		p.columnDispRslt_col_022.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_022_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_022);
		p.columnDispRslt_col_023.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_023_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_023);
		p.columnDispRslt_col_024.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_024_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_024);
		p.DispRsltTable.addTable(p.DispRslt_qty_05_p_PPanel.QtyTable);
		p.columnDispRslt_col_026.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_026_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_026);
		p.columnDispRslt_col_027.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_027_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_027);
		p.columnDispRslt_col_028.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_028_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_028);
		p.columnDispRslt_col_029.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_029_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_029);
		p.DispRsltTable.addTable(p.DispRslt_qty_06_p_PPanel.QtyTable);
		p.columnDispRslt_col_031.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_031_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_031);
		p.columnDispRslt_col_032.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_032_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_032);
		p.columnDispRslt_col_033.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_033_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_033);
		p.columnDispRslt_col_034.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_034_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_034);
		p.DispRsltTable.addTable(p.DispRslt_qty_07_p_PPanel.QtyTable);
		p.columnDispRslt_col_036.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_036_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_036);
		p.columnDispRslt_col_037.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_037_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_037);
		p.columnDispRslt_col_038.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_038_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_038);
		p.columnDispRslt_col_039.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_039_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_039);
		p.DispRsltTable.addTable(p.DispRslt_qty_08_p_PPanel.QtyTable);
		p.columnDispRslt_col_041.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_041_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_041);
		p.columnDispRslt_col_042.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_042_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_042);
		p.columnDispRslt_col_043.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_043_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_043);
		p.columnDispRslt_col_044.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_044_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_044);
		p.DispRsltTable.addTable(p.DispRslt_qty_09_p_PPanel.QtyTable);
		p.columnDispRslt_col_046.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_046_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_046);
		p.columnDispRslt_col_047.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_047_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_047);
		p.columnDispRslt_col_048.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_048_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_048);
		p.columnDispRslt_col_049.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_049_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_049);
		p.DispRsltTable.addTable(p.DispRslt_qty_10_p_PPanel.QtyTable);
		p.columnDispRslt_col_051.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_051_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_051);
		p.columnDispRslt_col_052.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_052_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_052);
		p.columnDispRslt_col_053.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_053_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_053);
		p.columnDispRslt_col_054.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_054_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_054);
		p.DispRsltTable.addTable(p.DispRslt_qty_11_p_PPanel.QtyTable);
		p.columnDispRslt_col_056.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_056_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_056);
		p.columnDispRslt_col_057.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_057_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_057);
		p.columnDispRslt_col_058.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_058_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_058);
		p.columnDispRslt_col_059.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_059_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_059);
		p.DispRsltTable.addTable(p.DispRslt_qty_12_p_PPanel.QtyTable);
		p.columnDispRslt_col_061.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_061_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_061);
		p.columnDispRslt_col_062.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_062_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_062);
		p.columnDispRslt_col_063.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_063_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_063);
		p.columnDispRslt_col_064.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_064_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_064);
		p.DispRsltTable.addTable(p.DispRslt_qty_13_p_PPanel.QtyTable);
		p.columnDispRslt_col_066.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_066_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_066);
		p.columnDispRslt_col_067.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_067_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_067);
		p.columnDispRslt_col_068.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_068_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_068);
		p.columnDispRslt_col_069.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_069_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_069);
		p.DispRsltTable.addTable(p.DispRslt_qty_14_p_PPanel.QtyTable);
		p.columnDispRslt_col_071.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_071_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_071);
		p.columnDispRslt_col_072.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_072_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_072);
		p.columnDispRslt_col_073.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_073_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_073);
		p.columnDispRslt_col_074.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_074_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_074);
		p.DispRsltTable.addTable(p.DispRslt_qty_15_p_PPanel.QtyTable);
		p.columnDispRslt_col_076.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_076_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_076);
		p.columnDispRslt_col_077.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_077_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_077);
		p.columnDispRslt_col_078.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_078_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_078);
		p.columnDispRslt_col_079.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_079_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_079);
		p.DispRsltTable.addTable(p.DispRslt_qty_16_p_PPanel.QtyTable);
		p.columnDispRslt_col_081.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_081_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_081);
		p.columnDispRslt_col_082.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_082_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_082);
		p.columnDispRslt_col_083.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_083_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_083);
		p.columnDispRslt_col_084.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_084_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_084);
		p.DispRsltTable.addTable(p.DispRslt_qty_17_p_PPanel.QtyTable);
		p.columnDispRslt_col_086.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_086_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_086);
		p.columnDispRslt_col_087.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_087_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_087);
		p.columnDispRslt_col_088.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_088_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_088);
		p.columnDispRslt_col_089.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_089_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_089);
		p.DispRsltTable.addTable(p.DispRslt_qty_18_p_PPanel.QtyTable);
		p.columnDispRslt_col_091.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_091_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_091);
		p.columnDispRslt_col_092.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_092_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_092);
		p.columnDispRslt_col_093.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_093_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_093);
		p.columnDispRslt_col_094.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_094_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_094);
		p.DispRsltTable.addTable(p.DispRslt_qty_19_p_PPanel.QtyTable);
		p.columnDispRslt_col_096.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_096_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_096);
		p.columnDispRslt_col_097.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_097_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_097);
		p.columnDispRslt_col_098.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_098_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_098);
		p.columnDispRslt_col_099.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_099_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_099);
		p.DispRsltTable.addTable(p.DispRslt_qty_20_p_PPanel.QtyTable);
		p.columnDispRslt_col_101.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_101_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_101);
		p.columnDispRslt_col_102.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_102_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_102);
		p.columnDispRslt_col_103.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_103_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_103);
		p.columnDispRslt_col_104.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_104_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_104);
		p.DispRsltTable.addTable(p.DispRslt_qty_21_p_PPanel.QtyTable);
		p.columnDispRslt_col_106.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_106_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_106);
		p.columnDispRslt_col_107.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_107_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_107);
		p.columnDispRslt_col_108.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_108_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_108);
		p.columnDispRslt_col_109.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_109_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_109);
		p.DispRsltTable.addTable(p.DispRslt_qty_22_p_PPanel.QtyTable);
		p.columnDispRslt_col_111.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_111_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_111);
		p.columnDispRslt_col_112.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_112_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_112);
		p.columnDispRslt_col_113.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_113_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_113);
		p.columnDispRslt_col_114.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_114_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_114);
		p.DispRsltTable.addTable(p.DispRslt_qty_23_p_PPanel.QtyTable);
		p.columnDispRslt_col_116.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_116_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_116);
		p.columnDispRslt_col_117.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_117_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_117);
		p.columnDispRslt_col_118.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_118_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_118);
		p.columnDispRslt_col_119.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_119_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_119);
		p.DispRsltTable.addTable(p.DispRslt_qty_24_p_PPanel.QtyTable);
		p.columnDispRslt_col_121.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_121_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_121);
		p.columnDispRslt_col_122.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_122_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_122);
		p.columnDispRslt_col_123.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_123_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_123);
		p.columnDispRslt_col_124.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_124_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_124);
		p.DispRsltTable.addTable(p.DispRslt_qty_25_p_PPanel.QtyTable);
		p.columnDispRslt_col_126.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_126_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_126);
		p.columnDispRslt_col_127.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_127_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_127);
		p.columnDispRslt_col_128.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_128_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_128);
		p.columnDispRslt_col_129.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_129_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_129);
		p.DispRsltTable.addTable(p.DispRslt_qty_26_p_PPanel.QtyTable);
		p.columnDispRslt_col_131.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_131_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_131);
		p.columnDispRslt_col_132.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_132_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_132);
		p.columnDispRslt_col_133.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_133_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_133);
		p.columnDispRslt_col_134.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_134_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_134);
		p.DispRsltTable.addTable(p.DispRslt_qty_27_p_PPanel.QtyTable);
		p.columnDispRslt_col_136.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_136_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_136);
		p.columnDispRslt_col_137.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_137_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_137);
		p.columnDispRslt_col_138.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_138_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_138);
		p.columnDispRslt_col_139.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_139_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_139);
		p.DispRsltTable.addTable(p.DispRslt_qty_28_p_PPanel.QtyTable);
		p.columnDispRslt_col_141.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_141_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_141);
		p.columnDispRslt_col_142.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_142_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_142);
		p.columnDispRslt_col_143.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_143_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_143);
		p.columnDispRslt_col_144.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_144_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_144);
		p.DispRsltTable.addTable(p.DispRslt_qty_29_p_PPanel.QtyTable);
		p.columnDispRslt_col_146.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_146_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_146);
		p.columnDispRslt_col_147.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_147_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_147);
		p.columnDispRslt_col_148.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_148_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_148);
		p.columnDispRslt_col_149.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_149_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_149);
		p.DispRsltTable.addTable(p.DispRslt_qty_30_p_PPanel.QtyTable);
		p.columnDispRslt_col_151.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_151_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_151);
		p.columnDispRslt_col_152.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_152_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_152);
		p.columnDispRslt_col_153.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_153_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_153);
		p.columnDispRslt_col_154.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_154_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_154);
		p.DispRsltTable.addTable(p.DispRslt_qty_31_p_PPanel.QtyTable);
		p.columnDispRslt_col_156.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_156_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_156);
		p.columnDispRslt_col_157.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_157_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_157);
		p.columnDispRslt_col_158.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_158_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_158);
		p.columnDispRslt_col_159.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_159_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_159);
		p.DispRsltTable.addTable(p.DispRslt_qty_32_p_PPanel.QtyTable);
		p.columnDispRslt_col_161.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_161_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_161);
		p.columnDispRslt_col_162.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_162_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_162);
		p.columnDispRslt_col_163.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_163_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_163);
		p.columnDispRslt_col_164.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_164_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_164);
		p.DispRsltTable.addTable(p.DispRslt_qty_33_p_PPanel.QtyTable);
		p.columnDispRslt_col_166.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_166_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_166);
		p.columnDispRslt_col_167.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_167_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_167);
		p.columnDispRslt_col_168.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_168_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_168);
		p.columnDispRslt_col_169.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_169_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_169);
		p.DispRsltTable.addTable(p.DispRslt_qty_34_p_PPanel.QtyTable);
		p.columnDispRslt_col_171.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_171_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_171);
		p.columnDispRslt_col_172.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_172_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_172);
		p.columnDispRslt_col_173.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_173_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_173);
		p.columnDispRslt_col_174.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_174_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_174);
		p.DispRsltTable.addTable(p.DispRslt_qty_35_p_PPanel.QtyTable);
		p.columnDispRslt_col_176.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_176_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_176);
		p.columnDispRslt_col_177.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_177_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_177);
		p.columnDispRslt_col_178.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_178_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_178);
		p.columnDispRslt_col_179.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_179_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_179);
		p.DispRsltTable.addTable(p.DispRslt_qty_36_p_PPanel.QtyTable);
		p.columnDispRslt_col_181.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_181_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_181);
		p.columnDispRslt_col_182.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_182_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_182);
		p.columnDispRslt_col_183.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_183_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_183);
		p.columnDispRslt_col_184.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_184_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_184);
		p.DispRsltTable.addTable(p.DispRslt_qty_37_p_PPanel.QtyTable);
		p.columnDispRslt_col_186.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_186_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_186);
		p.columnDispRslt_col_187.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_187_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_187);
		p.columnDispRslt_col_188.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_188_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_188);
		p.columnDispRslt_col_189.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_189_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_189);
		p.DispRsltTable.addTable(p.DispRslt_qty_38_p_PPanel.QtyTable);
		p.columnDispRslt_col_191.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_191_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_191);
		p.columnDispRslt_col_192.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_192_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_192);
		p.columnDispRslt_col_193.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_193_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_193);
		p.columnDispRslt_col_194.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_194_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_194);
		p.DispRsltTable.addTable(p.DispRslt_qty_39_p_PPanel.QtyTable);
		p.columnDispRslt_col_196.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_196_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_196);
		p.columnDispRslt_col_197.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_197_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_197);
		p.columnDispRslt_col_198.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_198_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_198);
		p.columnDispRslt_col_199.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_199_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_199);
		p.DispRsltTable.addTable(p.DispRslt_qty_40_p_PPanel.QtyTable);
		p.columnDispRslt_col_201.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_201_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_201);
		p.columnDispRslt_col_202.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_202_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_202);
		p.columnDispRslt_col_203.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_203_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_203);
		p.columnDispRslt_col_204.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_204_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_204);
		p.DispRsltTable.addTable(p.DispRslt_qty_41_p_PPanel.QtyTable);
		p.columnDispRslt_col_206.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_206_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_206);
		p.columnDispRslt_col_207.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_207_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_207);
		p.columnDispRslt_col_208.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_208_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_208);
		p.columnDispRslt_col_209.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_209_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_209);
		p.DispRsltTable.addTable(p.DispRslt_qty_42_p_PPanel.QtyTable);
		p.columnDispRslt_col_211.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_211_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_211);
		p.columnDispRslt_col_212.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_212_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_212);
		p.columnDispRslt_col_213.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_213_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_213);
		p.columnDispRslt_col_214.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_214_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_214);
		p.DispRsltTable.addTable(p.DispRslt_qty_43_p_PPanel.QtyTable);
		p.columnDispRslt_col_216.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_216_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_216);
		p.columnDispRslt_col_217.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_217_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_217);
		p.columnDispRslt_col_218.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_218_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_218);
		p.columnDispRslt_col_219.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_219_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_219);
		p.DispRsltTable.addTable(p.DispRslt_qty_44_p_PPanel.QtyTable);
		p.columnDispRslt_col_221.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_221_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_221);
		p.columnDispRslt_col_222.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_222_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_222);
		p.columnDispRslt_col_223.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_223_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_223);
		p.columnDispRslt_col_224.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_224_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_224);
		p.DispRsltTable.addTable(p.DispRslt_qty_45_p_PPanel.QtyTable);
		p.columnDispRslt_col_226.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_226_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_226);
		p.columnDispRslt_col_227.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_227_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_227);
		p.columnDispRslt_col_228.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_228_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_228);
		p.columnDispRslt_col_229.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_229_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_229);
		p.DispRsltTable.addTable(p.DispRslt_qty_46_p_PPanel.QtyTable);
		p.columnDispRslt_col_231.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_231_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_231);
		p.columnDispRslt_col_232.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_232_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_232);
		p.columnDispRslt_col_233.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_233_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_233);
		p.columnDispRslt_col_234.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_234_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_234);
		p.DispRsltTable.addTable(p.DispRslt_qty_47_p_PPanel.QtyTable);
		p.columnDispRslt_col_236.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_236_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_236);
		p.columnDispRslt_col_237.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_237_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_237);
		p.columnDispRslt_col_238.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_238_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_238);
		p.columnDispRslt_col_239.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_239_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_239);
		p.DispRsltTable.addTable(p.DispRslt_qty_48_p_PPanel.QtyTable);
		p.columnDispRslt_col_241.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_241_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_241);
		p.columnDispRslt_col_242.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_242_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_242);
		p.columnDispRslt_col_243.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_243_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_243);
		p.columnDispRslt_col_244.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_244_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_244);
		p.DispRsltTable.addTable(p.DispRslt_qty_49_p_PPanel.QtyTable);
		p.columnDispRslt_col_246.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_246_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_246);
		p.columnDispRslt_col_247.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_247_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_247);
		p.columnDispRslt_col_248.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_248_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_248);
		p.columnDispRslt_col_249.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_249_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_249);
		p.DispRsltTable.addTable(p.DispRslt_qty_50_p_PPanel.QtyTable);
		p.columnDispRslt_col_251.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_251_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_251);
		p.columnDispRslt_col_252.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_252_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_252);
		p.columnDispRslt_col_253.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_253_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_253);
		p.columnDispRslt_col_254.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_254_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_254);
		p.DispRsltTable.addTable(p.DispRslt_qty_51_p_PPanel.QtyTable);
		p.columnDispRslt_col_256.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_256_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_256);
		p.columnDispRslt_col_257.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_257_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_257);
		p.columnDispRslt_col_258.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_258_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_258);
		p.columnDispRslt_col_259.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_259_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_259);
		p.DispRsltTable.addTable(p.DispRslt_qty_52_p_PPanel.QtyTable);
		p.columnDispRslt_col_261.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_261_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_261);
		p.columnDispRslt_col_262.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_262_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_262);
		p.columnDispRslt_col_263.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_263_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_263);
		p.columnDispRslt_col_264.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_264_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_264);
		p.DispRsltTable.addTable(p.DispRslt_qty_53_p_PPanel.QtyTable);
		p.columnDispRslt_col_266.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_266_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_266);
		p.columnDispRslt_col_267.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_267_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_267);
		p.columnDispRslt_col_268.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_268_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_268);
		p.columnDispRslt_col_269.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_269_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_269);
		p.DispRsltTable.addTable(p.DispRslt_qty_54_p_PPanel.QtyTable);
		p.columnDispRslt_col_271.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_271_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_271);
		p.columnDispRslt_col_272.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_272_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_272);
		p.columnDispRslt_col_273.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_273_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_273);
		p.columnDispRslt_col_274.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_274_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_274);
		p.DispRsltTable.addTable(p.DispRslt_qty_55_p_PPanel.QtyTable);
		p.columnDispRslt_col_276.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_276_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_276);
		p.columnDispRslt_col_277.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_277_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_277);
		p.columnDispRslt_col_278.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_278_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_278);
		p.columnDispRslt_col_279.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_279_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_279);
		p.DispRsltTable.addTable(p.DispRslt_qty_56_p_PPanel.QtyTable);
		p.columnDispRslt_col_281.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_281_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_281);
		p.columnDispRslt_col_282.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_282_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_282);
		p.columnDispRslt_col_283.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_283_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_283);
		p.columnDispRslt_col_284.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_284_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_284);
		p.DispRsltTable.addTable(p.DispRslt_qty_57_p_PPanel.QtyTable);
		p.columnDispRslt_col_286.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_286_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_286);
		p.columnDispRslt_col_287.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_287_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_287);
		p.columnDispRslt_col_288.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_288_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_288);
		p.columnDispRslt_col_289.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_289_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_289);
		p.DispRsltTable.addTable(p.DispRslt_qty_58_p_PPanel.QtyTable);
		p.columnDispRslt_col_291.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_291_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_291);
		p.columnDispRslt_col_292.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_292_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_292);
		p.columnDispRslt_col_293.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_293_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_293);
		p.columnDispRslt_col_294.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_294_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_294);
		p.DispRsltTable.addTable(p.DispRslt_qty_59_p_PPanel.QtyTable);
		p.columnDispRslt_col_296.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_296_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_296);
		p.columnDispRslt_col_297.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_297_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_297);
		p.columnDispRslt_col_298.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_298_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_298);
		p.columnDispRslt_col_299.setMeta(mcframe.clientMGBF.MGBFP0420.DispRsltR.col_299_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_299);
		p.DispRsltTable.addColumnGroup(p.DispRslt_itm_p_PPanel.ItmTable);
		p.cgDispRslt_cg0.add(p.DispRslt_qty_00_p_PPanel.QtyTable);
		p.cgDispRslt_cg0.add(p.columnDispRslt_col_001);
		p.cgDispRslt_cg0.add(p.columnDispRslt_col_002);
		p.cgDispRslt_cg0.add(p.columnDispRslt_col_003);
		p.cgDispRslt_cg0.add(p.columnDispRslt_col_004);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg0);
		p.cgDispRslt_cg1.add(p.DispRslt_qty_01_p_PPanel.QtyTable);
		p.cgDispRslt_cg1.add(p.columnDispRslt_col_006);
		p.cgDispRslt_cg1.add(p.columnDispRslt_col_007);
		p.cgDispRslt_cg1.add(p.columnDispRslt_col_008);
		p.cgDispRslt_cg1.add(p.columnDispRslt_col_009);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg1);
		p.cgDispRslt_cg2.add(p.DispRslt_qty_02_p_PPanel.QtyTable);
		p.cgDispRslt_cg2.add(p.columnDispRslt_col_011);
		p.cgDispRslt_cg2.add(p.columnDispRslt_col_012);
		p.cgDispRslt_cg2.add(p.columnDispRslt_col_013);
		p.cgDispRslt_cg2.add(p.columnDispRslt_col_014);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg2);
		p.cgDispRslt_cg3.add(p.DispRslt_qty_03_p_PPanel.QtyTable);
		p.cgDispRslt_cg3.add(p.columnDispRslt_col_016);
		p.cgDispRslt_cg3.add(p.columnDispRslt_col_017);
		p.cgDispRslt_cg3.add(p.columnDispRslt_col_018);
		p.cgDispRslt_cg3.add(p.columnDispRslt_col_019);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg3);
		p.cgDispRslt_cg4.add(p.DispRslt_qty_04_p_PPanel.QtyTable);
		p.cgDispRslt_cg4.add(p.columnDispRslt_col_021);
		p.cgDispRslt_cg4.add(p.columnDispRslt_col_022);
		p.cgDispRslt_cg4.add(p.columnDispRslt_col_023);
		p.cgDispRslt_cg4.add(p.columnDispRslt_col_024);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg4);
		p.cgDispRslt_cg5.add(p.DispRslt_qty_05_p_PPanel.QtyTable);
		p.cgDispRslt_cg5.add(p.columnDispRslt_col_026);
		p.cgDispRslt_cg5.add(p.columnDispRslt_col_027);
		p.cgDispRslt_cg5.add(p.columnDispRslt_col_028);
		p.cgDispRslt_cg5.add(p.columnDispRslt_col_029);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg5);
		p.cgDispRslt_cg6.add(p.DispRslt_qty_06_p_PPanel.QtyTable);
		p.cgDispRslt_cg6.add(p.columnDispRslt_col_031);
		p.cgDispRslt_cg6.add(p.columnDispRslt_col_032);
		p.cgDispRslt_cg6.add(p.columnDispRslt_col_033);
		p.cgDispRslt_cg6.add(p.columnDispRslt_col_034);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg6);
		p.cgDispRslt_cg7.add(p.DispRslt_qty_07_p_PPanel.QtyTable);
		p.cgDispRslt_cg7.add(p.columnDispRslt_col_036);
		p.cgDispRslt_cg7.add(p.columnDispRslt_col_037);
		p.cgDispRslt_cg7.add(p.columnDispRslt_col_038);
		p.cgDispRslt_cg7.add(p.columnDispRslt_col_039);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg7);
		p.cgDispRslt_cg8.add(p.DispRslt_qty_08_p_PPanel.QtyTable);
		p.cgDispRslt_cg8.add(p.columnDispRslt_col_041);
		p.cgDispRslt_cg8.add(p.columnDispRslt_col_042);
		p.cgDispRslt_cg8.add(p.columnDispRslt_col_043);
		p.cgDispRslt_cg8.add(p.columnDispRslt_col_044);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg8);
		p.cgDispRslt_cg9.add(p.DispRslt_qty_09_p_PPanel.QtyTable);
		p.cgDispRslt_cg9.add(p.columnDispRslt_col_046);
		p.cgDispRslt_cg9.add(p.columnDispRslt_col_047);
		p.cgDispRslt_cg9.add(p.columnDispRslt_col_048);
		p.cgDispRslt_cg9.add(p.columnDispRslt_col_049);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg9);
		p.cgDispRslt_cg10.add(p.DispRslt_qty_10_p_PPanel.QtyTable);
		p.cgDispRslt_cg10.add(p.columnDispRslt_col_051);
		p.cgDispRslt_cg10.add(p.columnDispRslt_col_052);
		p.cgDispRslt_cg10.add(p.columnDispRslt_col_053);
		p.cgDispRslt_cg10.add(p.columnDispRslt_col_054);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg10);
		p.cgDispRslt_cg11.add(p.DispRslt_qty_11_p_PPanel.QtyTable);
		p.cgDispRslt_cg11.add(p.columnDispRslt_col_056);
		p.cgDispRslt_cg11.add(p.columnDispRslt_col_057);
		p.cgDispRslt_cg11.add(p.columnDispRslt_col_058);
		p.cgDispRslt_cg11.add(p.columnDispRslt_col_059);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg11);
		p.cgDispRslt_cg12.add(p.DispRslt_qty_12_p_PPanel.QtyTable);
		p.cgDispRslt_cg12.add(p.columnDispRslt_col_061);
		p.cgDispRslt_cg12.add(p.columnDispRslt_col_062);
		p.cgDispRslt_cg12.add(p.columnDispRslt_col_063);
		p.cgDispRslt_cg12.add(p.columnDispRslt_col_064);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg12);
		p.cgDispRslt_cg13.add(p.DispRslt_qty_13_p_PPanel.QtyTable);
		p.cgDispRslt_cg13.add(p.columnDispRslt_col_066);
		p.cgDispRslt_cg13.add(p.columnDispRslt_col_067);
		p.cgDispRslt_cg13.add(p.columnDispRslt_col_068);
		p.cgDispRslt_cg13.add(p.columnDispRslt_col_069);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg13);
		p.cgDispRslt_cg14.add(p.DispRslt_qty_14_p_PPanel.QtyTable);
		p.cgDispRslt_cg14.add(p.columnDispRslt_col_071);
		p.cgDispRslt_cg14.add(p.columnDispRslt_col_072);
		p.cgDispRslt_cg14.add(p.columnDispRslt_col_073);
		p.cgDispRslt_cg14.add(p.columnDispRslt_col_074);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg14);
		p.cgDispRslt_cg15.add(p.DispRslt_qty_15_p_PPanel.QtyTable);
		p.cgDispRslt_cg15.add(p.columnDispRslt_col_076);
		p.cgDispRslt_cg15.add(p.columnDispRslt_col_077);
		p.cgDispRslt_cg15.add(p.columnDispRslt_col_078);
		p.cgDispRslt_cg15.add(p.columnDispRslt_col_079);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg15);
		p.cgDispRslt_cg16.add(p.DispRslt_qty_16_p_PPanel.QtyTable);
		p.cgDispRslt_cg16.add(p.columnDispRslt_col_081);
		p.cgDispRslt_cg16.add(p.columnDispRslt_col_082);
		p.cgDispRslt_cg16.add(p.columnDispRslt_col_083);
		p.cgDispRslt_cg16.add(p.columnDispRslt_col_084);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg16);
		p.cgDispRslt_cg17.add(p.DispRslt_qty_17_p_PPanel.QtyTable);
		p.cgDispRslt_cg17.add(p.columnDispRslt_col_086);
		p.cgDispRslt_cg17.add(p.columnDispRslt_col_087);
		p.cgDispRslt_cg17.add(p.columnDispRslt_col_088);
		p.cgDispRslt_cg17.add(p.columnDispRslt_col_089);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg17);
		p.cgDispRslt_cg18.add(p.DispRslt_qty_18_p_PPanel.QtyTable);
		p.cgDispRslt_cg18.add(p.columnDispRslt_col_091);
		p.cgDispRslt_cg18.add(p.columnDispRslt_col_092);
		p.cgDispRslt_cg18.add(p.columnDispRslt_col_093);
		p.cgDispRslt_cg18.add(p.columnDispRslt_col_094);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg18);
		p.cgDispRslt_cg19.add(p.DispRslt_qty_19_p_PPanel.QtyTable);
		p.cgDispRslt_cg19.add(p.columnDispRslt_col_096);
		p.cgDispRslt_cg19.add(p.columnDispRslt_col_097);
		p.cgDispRslt_cg19.add(p.columnDispRslt_col_098);
		p.cgDispRslt_cg19.add(p.columnDispRslt_col_099);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg19);
		p.cgDispRslt_cg20.add(p.DispRslt_qty_20_p_PPanel.QtyTable);
		p.cgDispRslt_cg20.add(p.columnDispRslt_col_101);
		p.cgDispRslt_cg20.add(p.columnDispRslt_col_102);
		p.cgDispRslt_cg20.add(p.columnDispRslt_col_103);
		p.cgDispRslt_cg20.add(p.columnDispRslt_col_104);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg20);
		p.cgDispRslt_cg21.add(p.DispRslt_qty_21_p_PPanel.QtyTable);
		p.cgDispRslt_cg21.add(p.columnDispRslt_col_106);
		p.cgDispRslt_cg21.add(p.columnDispRslt_col_107);
		p.cgDispRslt_cg21.add(p.columnDispRslt_col_108);
		p.cgDispRslt_cg21.add(p.columnDispRslt_col_109);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg21);
		p.cgDispRslt_cg22.add(p.DispRslt_qty_22_p_PPanel.QtyTable);
		p.cgDispRslt_cg22.add(p.columnDispRslt_col_111);
		p.cgDispRslt_cg22.add(p.columnDispRslt_col_112);
		p.cgDispRslt_cg22.add(p.columnDispRslt_col_113);
		p.cgDispRslt_cg22.add(p.columnDispRslt_col_114);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg22);
		p.cgDispRslt_cg23.add(p.DispRslt_qty_23_p_PPanel.QtyTable);
		p.cgDispRslt_cg23.add(p.columnDispRslt_col_116);
		p.cgDispRslt_cg23.add(p.columnDispRslt_col_117);
		p.cgDispRslt_cg23.add(p.columnDispRslt_col_118);
		p.cgDispRslt_cg23.add(p.columnDispRslt_col_119);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg23);
		p.cgDispRslt_cg24.add(p.DispRslt_qty_24_p_PPanel.QtyTable);
		p.cgDispRslt_cg24.add(p.columnDispRslt_col_121);
		p.cgDispRslt_cg24.add(p.columnDispRslt_col_122);
		p.cgDispRslt_cg24.add(p.columnDispRslt_col_123);
		p.cgDispRslt_cg24.add(p.columnDispRslt_col_124);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg24);
		p.cgDispRslt_cg25.add(p.DispRslt_qty_25_p_PPanel.QtyTable);
		p.cgDispRslt_cg25.add(p.columnDispRslt_col_126);
		p.cgDispRslt_cg25.add(p.columnDispRslt_col_127);
		p.cgDispRslt_cg25.add(p.columnDispRslt_col_128);
		p.cgDispRslt_cg25.add(p.columnDispRslt_col_129);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg25);
		p.cgDispRslt_cg26.add(p.DispRslt_qty_26_p_PPanel.QtyTable);
		p.cgDispRslt_cg26.add(p.columnDispRslt_col_131);
		p.cgDispRslt_cg26.add(p.columnDispRslt_col_132);
		p.cgDispRslt_cg26.add(p.columnDispRslt_col_133);
		p.cgDispRslt_cg26.add(p.columnDispRslt_col_134);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg26);
		p.cgDispRslt_cg27.add(p.DispRslt_qty_27_p_PPanel.QtyTable);
		p.cgDispRslt_cg27.add(p.columnDispRslt_col_136);
		p.cgDispRslt_cg27.add(p.columnDispRslt_col_137);
		p.cgDispRslt_cg27.add(p.columnDispRslt_col_138);
		p.cgDispRslt_cg27.add(p.columnDispRslt_col_139);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg27);
		p.cgDispRslt_cg28.add(p.DispRslt_qty_28_p_PPanel.QtyTable);
		p.cgDispRslt_cg28.add(p.columnDispRslt_col_141);
		p.cgDispRslt_cg28.add(p.columnDispRslt_col_142);
		p.cgDispRslt_cg28.add(p.columnDispRslt_col_143);
		p.cgDispRslt_cg28.add(p.columnDispRslt_col_144);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg28);
		p.cgDispRslt_cg29.add(p.DispRslt_qty_29_p_PPanel.QtyTable);
		p.cgDispRslt_cg29.add(p.columnDispRslt_col_146);
		p.cgDispRslt_cg29.add(p.columnDispRslt_col_147);
		p.cgDispRslt_cg29.add(p.columnDispRslt_col_148);
		p.cgDispRslt_cg29.add(p.columnDispRslt_col_149);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg29);
		p.cgDispRslt_cg30.add(p.DispRslt_qty_30_p_PPanel.QtyTable);
		p.cgDispRslt_cg30.add(p.columnDispRslt_col_151);
		p.cgDispRslt_cg30.add(p.columnDispRslt_col_152);
		p.cgDispRslt_cg30.add(p.columnDispRslt_col_153);
		p.cgDispRslt_cg30.add(p.columnDispRslt_col_154);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg30);
		p.cgDispRslt_cg31.add(p.DispRslt_qty_31_p_PPanel.QtyTable);
		p.cgDispRslt_cg31.add(p.columnDispRslt_col_156);
		p.cgDispRslt_cg31.add(p.columnDispRslt_col_157);
		p.cgDispRslt_cg31.add(p.columnDispRslt_col_158);
		p.cgDispRslt_cg31.add(p.columnDispRslt_col_159);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg31);
		p.cgDispRslt_cg32.add(p.DispRslt_qty_32_p_PPanel.QtyTable);
		p.cgDispRslt_cg32.add(p.columnDispRslt_col_161);
		p.cgDispRslt_cg32.add(p.columnDispRslt_col_162);
		p.cgDispRslt_cg32.add(p.columnDispRslt_col_163);
		p.cgDispRslt_cg32.add(p.columnDispRslt_col_164);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg32);
		p.cgDispRslt_cg33.add(p.DispRslt_qty_33_p_PPanel.QtyTable);
		p.cgDispRslt_cg33.add(p.columnDispRslt_col_166);
		p.cgDispRslt_cg33.add(p.columnDispRslt_col_167);
		p.cgDispRslt_cg33.add(p.columnDispRslt_col_168);
		p.cgDispRslt_cg33.add(p.columnDispRslt_col_169);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg33);
		p.cgDispRslt_cg34.add(p.DispRslt_qty_34_p_PPanel.QtyTable);
		p.cgDispRslt_cg34.add(p.columnDispRslt_col_171);
		p.cgDispRslt_cg34.add(p.columnDispRslt_col_172);
		p.cgDispRslt_cg34.add(p.columnDispRslt_col_173);
		p.cgDispRslt_cg34.add(p.columnDispRslt_col_174);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg34);
		p.cgDispRslt_cg35.add(p.DispRslt_qty_35_p_PPanel.QtyTable);
		p.cgDispRslt_cg35.add(p.columnDispRslt_col_176);
		p.cgDispRslt_cg35.add(p.columnDispRslt_col_177);
		p.cgDispRslt_cg35.add(p.columnDispRslt_col_178);
		p.cgDispRslt_cg35.add(p.columnDispRslt_col_179);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg35);
		p.cgDispRslt_cg36.add(p.DispRslt_qty_36_p_PPanel.QtyTable);
		p.cgDispRslt_cg36.add(p.columnDispRslt_col_181);
		p.cgDispRslt_cg36.add(p.columnDispRslt_col_182);
		p.cgDispRslt_cg36.add(p.columnDispRslt_col_183);
		p.cgDispRslt_cg36.add(p.columnDispRslt_col_184);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg36);
		p.cgDispRslt_cg37.add(p.DispRslt_qty_37_p_PPanel.QtyTable);
		p.cgDispRslt_cg37.add(p.columnDispRslt_col_186);
		p.cgDispRslt_cg37.add(p.columnDispRslt_col_187);
		p.cgDispRslt_cg37.add(p.columnDispRslt_col_188);
		p.cgDispRslt_cg37.add(p.columnDispRslt_col_189);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg37);
		p.cgDispRslt_cg38.add(p.DispRslt_qty_38_p_PPanel.QtyTable);
		p.cgDispRslt_cg38.add(p.columnDispRslt_col_191);
		p.cgDispRslt_cg38.add(p.columnDispRslt_col_192);
		p.cgDispRslt_cg38.add(p.columnDispRslt_col_193);
		p.cgDispRslt_cg38.add(p.columnDispRslt_col_194);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg38);
		p.cgDispRslt_cg39.add(p.DispRslt_qty_39_p_PPanel.QtyTable);
		p.cgDispRslt_cg39.add(p.columnDispRslt_col_196);
		p.cgDispRslt_cg39.add(p.columnDispRslt_col_197);
		p.cgDispRslt_cg39.add(p.columnDispRslt_col_198);
		p.cgDispRslt_cg39.add(p.columnDispRslt_col_199);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg39);
		p.cgDispRslt_cg40.add(p.DispRslt_qty_40_p_PPanel.QtyTable);
		p.cgDispRslt_cg40.add(p.columnDispRslt_col_201);
		p.cgDispRslt_cg40.add(p.columnDispRslt_col_202);
		p.cgDispRslt_cg40.add(p.columnDispRslt_col_203);
		p.cgDispRslt_cg40.add(p.columnDispRslt_col_204);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg40);
		p.cgDispRslt_cg41.add(p.DispRslt_qty_41_p_PPanel.QtyTable);
		p.cgDispRslt_cg41.add(p.columnDispRslt_col_206);
		p.cgDispRslt_cg41.add(p.columnDispRslt_col_207);
		p.cgDispRslt_cg41.add(p.columnDispRslt_col_208);
		p.cgDispRslt_cg41.add(p.columnDispRslt_col_209);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg41);
		p.cgDispRslt_cg42.add(p.DispRslt_qty_42_p_PPanel.QtyTable);
		p.cgDispRslt_cg42.add(p.columnDispRslt_col_211);
		p.cgDispRslt_cg42.add(p.columnDispRslt_col_212);
		p.cgDispRslt_cg42.add(p.columnDispRslt_col_213);
		p.cgDispRslt_cg42.add(p.columnDispRslt_col_214);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg42);
		p.cgDispRslt_cg43.add(p.DispRslt_qty_43_p_PPanel.QtyTable);
		p.cgDispRslt_cg43.add(p.columnDispRslt_col_216);
		p.cgDispRslt_cg43.add(p.columnDispRslt_col_217);
		p.cgDispRslt_cg43.add(p.columnDispRslt_col_218);
		p.cgDispRslt_cg43.add(p.columnDispRslt_col_219);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg43);
		p.cgDispRslt_cg44.add(p.DispRslt_qty_44_p_PPanel.QtyTable);
		p.cgDispRslt_cg44.add(p.columnDispRslt_col_221);
		p.cgDispRslt_cg44.add(p.columnDispRslt_col_222);
		p.cgDispRslt_cg44.add(p.columnDispRslt_col_223);
		p.cgDispRslt_cg44.add(p.columnDispRslt_col_224);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg44);
		p.cgDispRslt_cg45.add(p.DispRslt_qty_45_p_PPanel.QtyTable);
		p.cgDispRslt_cg45.add(p.columnDispRslt_col_226);
		p.cgDispRslt_cg45.add(p.columnDispRslt_col_227);
		p.cgDispRslt_cg45.add(p.columnDispRslt_col_228);
		p.cgDispRslt_cg45.add(p.columnDispRslt_col_229);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg45);
		p.cgDispRslt_cg46.add(p.DispRslt_qty_46_p_PPanel.QtyTable);
		p.cgDispRslt_cg46.add(p.columnDispRslt_col_231);
		p.cgDispRslt_cg46.add(p.columnDispRslt_col_232);
		p.cgDispRslt_cg46.add(p.columnDispRslt_col_233);
		p.cgDispRslt_cg46.add(p.columnDispRslt_col_234);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg46);
		p.cgDispRslt_cg47.add(p.DispRslt_qty_47_p_PPanel.QtyTable);
		p.cgDispRslt_cg47.add(p.columnDispRslt_col_236);
		p.cgDispRslt_cg47.add(p.columnDispRslt_col_237);
		p.cgDispRslt_cg47.add(p.columnDispRslt_col_238);
		p.cgDispRslt_cg47.add(p.columnDispRslt_col_239);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg47);
		p.cgDispRslt_cg48.add(p.DispRslt_qty_48_p_PPanel.QtyTable);
		p.cgDispRslt_cg48.add(p.columnDispRslt_col_241);
		p.cgDispRslt_cg48.add(p.columnDispRslt_col_242);
		p.cgDispRslt_cg48.add(p.columnDispRslt_col_243);
		p.cgDispRslt_cg48.add(p.columnDispRslt_col_244);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg48);
		p.cgDispRslt_cg49.add(p.DispRslt_qty_49_p_PPanel.QtyTable);
		p.cgDispRslt_cg49.add(p.columnDispRslt_col_246);
		p.cgDispRslt_cg49.add(p.columnDispRslt_col_247);
		p.cgDispRslt_cg49.add(p.columnDispRslt_col_248);
		p.cgDispRslt_cg49.add(p.columnDispRslt_col_249);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg49);
		p.cgDispRslt_cg50.add(p.DispRslt_qty_50_p_PPanel.QtyTable);
		p.cgDispRslt_cg50.add(p.columnDispRslt_col_251);
		p.cgDispRslt_cg50.add(p.columnDispRslt_col_252);
		p.cgDispRslt_cg50.add(p.columnDispRslt_col_253);
		p.cgDispRslt_cg50.add(p.columnDispRslt_col_254);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg50);
		p.cgDispRslt_cg51.add(p.DispRslt_qty_51_p_PPanel.QtyTable);
		p.cgDispRslt_cg51.add(p.columnDispRslt_col_256);
		p.cgDispRslt_cg51.add(p.columnDispRslt_col_257);
		p.cgDispRslt_cg51.add(p.columnDispRslt_col_258);
		p.cgDispRslt_cg51.add(p.columnDispRslt_col_259);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg51);
		p.cgDispRslt_cg52.add(p.DispRslt_qty_52_p_PPanel.QtyTable);
		p.cgDispRslt_cg52.add(p.columnDispRslt_col_261);
		p.cgDispRslt_cg52.add(p.columnDispRslt_col_262);
		p.cgDispRslt_cg52.add(p.columnDispRslt_col_263);
		p.cgDispRslt_cg52.add(p.columnDispRslt_col_264);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg52);
		p.cgDispRslt_cg53.add(p.DispRslt_qty_53_p_PPanel.QtyTable);
		p.cgDispRslt_cg53.add(p.columnDispRslt_col_266);
		p.cgDispRslt_cg53.add(p.columnDispRslt_col_267);
		p.cgDispRslt_cg53.add(p.columnDispRslt_col_268);
		p.cgDispRslt_cg53.add(p.columnDispRslt_col_269);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg53);
		p.cgDispRslt_cg54.add(p.DispRslt_qty_54_p_PPanel.QtyTable);
		p.cgDispRslt_cg54.add(p.columnDispRslt_col_271);
		p.cgDispRslt_cg54.add(p.columnDispRslt_col_272);
		p.cgDispRslt_cg54.add(p.columnDispRslt_col_273);
		p.cgDispRslt_cg54.add(p.columnDispRslt_col_274);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg54);
		p.cgDispRslt_cg55.add(p.DispRslt_qty_55_p_PPanel.QtyTable);
		p.cgDispRslt_cg55.add(p.columnDispRslt_col_276);
		p.cgDispRslt_cg55.add(p.columnDispRslt_col_277);
		p.cgDispRslt_cg55.add(p.columnDispRslt_col_278);
		p.cgDispRslt_cg55.add(p.columnDispRslt_col_279);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg55);
		p.cgDispRslt_cg56.add(p.DispRslt_qty_56_p_PPanel.QtyTable);
		p.cgDispRslt_cg56.add(p.columnDispRslt_col_281);
		p.cgDispRslt_cg56.add(p.columnDispRslt_col_282);
		p.cgDispRslt_cg56.add(p.columnDispRslt_col_283);
		p.cgDispRslt_cg56.add(p.columnDispRslt_col_284);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg56);
		p.cgDispRslt_cg57.add(p.DispRslt_qty_57_p_PPanel.QtyTable);
		p.cgDispRslt_cg57.add(p.columnDispRslt_col_286);
		p.cgDispRslt_cg57.add(p.columnDispRslt_col_287);
		p.cgDispRslt_cg57.add(p.columnDispRslt_col_288);
		p.cgDispRslt_cg57.add(p.columnDispRslt_col_289);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg57);
		p.cgDispRslt_cg58.add(p.DispRslt_qty_58_p_PPanel.QtyTable);
		p.cgDispRslt_cg58.add(p.columnDispRslt_col_291);
		p.cgDispRslt_cg58.add(p.columnDispRslt_col_292);
		p.cgDispRslt_cg58.add(p.columnDispRslt_col_293);
		p.cgDispRslt_cg58.add(p.columnDispRslt_col_294);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg58);
		p.cgDispRslt_cg59.add(p.DispRslt_qty_59_p_PPanel.QtyTable);
		p.cgDispRslt_cg59.add(p.columnDispRslt_col_296);
		p.cgDispRslt_cg59.add(p.columnDispRslt_col_297);
		p.cgDispRslt_cg59.add(p.columnDispRslt_col_298);
		p.cgDispRslt_cg59.add(p.columnDispRslt_col_299);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg59);
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
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_repurc_obli_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_repurc_obli_typ.getListConfig().setPutter(getCnd_repurc_obli_typ_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
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
		Cnd_sppl_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd1.getListConfig().setPutter(getCnd_sppl_grp_cd1_ListPutter());
		Cnd_sppl_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd2.getListConfig().setPutter(getCnd_sppl_grp_cd2_ListPutter());
		Cnd_sppl_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd3.getListConfig().setPutter(getCnd_sppl_grp_cd3_ListPutter());
		Cnd_sppl_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd4.getListConfig().setPutter(getCnd_sppl_grp_cd4_ListPutter());
		Cnd_sppl_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd5.getListConfig().setPutter(getCnd_sppl_grp_cd5_ListPutter());
		Cnd_sppl_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd6.getListConfig().setPutter(getCnd_sppl_grp_cd6_ListPutter());
		Cnd_sppl_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd7.getListConfig().setPutter(getCnd_sppl_grp_cd7_ListPutter());
		Cnd_sppl_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd8.getListConfig().setPutter(getCnd_sppl_grp_cd8_ListPutter());
		Cnd_sppl_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd9.getListConfig().setPutter(getCnd_sppl_grp_cd9_ListPutter());
		Cnd_sppl_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd10.getListConfig().setPutter(getCnd_sppl_grp_cd10_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
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
	 * [Cnd_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
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
	 * [Cnd_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_repurc_obli_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_repurc_obli_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.RepurcObliTyp");
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
	 * [Cnd_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
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
	 * [Cnd_sppl_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
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
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_repurc_obli_typ) return getCnd_repurc_obli_typ(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
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
		if(combo == Cnd_sppl_grp_cd1) return getCnd_sppl_grp_cd1(row, info);
		if(combo == Cnd_sppl_grp_cd2) return getCnd_sppl_grp_cd2(row, info);
		if(combo == Cnd_sppl_grp_cd3) return getCnd_sppl_grp_cd3(row, info);
		if(combo == Cnd_sppl_grp_cd4) return getCnd_sppl_grp_cd4(row, info);
		if(combo == Cnd_sppl_grp_cd5) return getCnd_sppl_grp_cd5(row, info);
		if(combo == Cnd_sppl_grp_cd6) return getCnd_sppl_grp_cd6(row, info);
		if(combo == Cnd_sppl_grp_cd7) return getCnd_sppl_grp_cd7(row, info);
		if(combo == Cnd_sppl_grp_cd8) return getCnd_sppl_grp_cd8(row, info);
		if(combo == Cnd_sppl_grp_cd9) return getCnd_sppl_grp_cd9(row, info);
		if(combo == Cnd_sppl_grp_cd10) return getCnd_sppl_grp_cd10(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == DispRsltTable) return doDispRslt_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_except_oth_flg) return doCnd_except_oth_flg_VC(info);
		if (vc == Cnd_repurc_obli_typ) return doCnd_repurc_obli_typ_VC(info);
		if (vc == Cnd_repurc_obli_typ_nm) return doCnd_repurc_obli_typ_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_no_sppl_flg) return doCnd_no_sppl_flg_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
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
		if (vc == Cnd_sppl_grp_cd1) return doCnd_sppl_grp_cd1_VC(info);
		if (vc == Cnd_sppl_grp_nm1) return doCnd_sppl_grp_nm1_VC(info);
		if (vc == Cnd_sppl_grp_cd2) return doCnd_sppl_grp_cd2_VC(info);
		if (vc == Cnd_sppl_grp_nm2) return doCnd_sppl_grp_nm2_VC(info);
		if (vc == Cnd_sppl_grp_cd3) return doCnd_sppl_grp_cd3_VC(info);
		if (vc == Cnd_sppl_grp_nm3) return doCnd_sppl_grp_nm3_VC(info);
		if (vc == Cnd_sppl_grp_cd4) return doCnd_sppl_grp_cd4_VC(info);
		if (vc == Cnd_sppl_grp_nm4) return doCnd_sppl_grp_nm4_VC(info);
		if (vc == Cnd_sppl_grp_cd5) return doCnd_sppl_grp_cd5_VC(info);
		if (vc == Cnd_sppl_grp_nm5) return doCnd_sppl_grp_nm5_VC(info);
		if (vc == Cnd_sppl_grp_cd6) return doCnd_sppl_grp_cd6_VC(info);
		if (vc == Cnd_sppl_grp_nm6) return doCnd_sppl_grp_nm6_VC(info);
		if (vc == Cnd_sppl_grp_cd7) return doCnd_sppl_grp_cd7_VC(info);
		if (vc == Cnd_sppl_grp_nm7) return doCnd_sppl_grp_nm7_VC(info);
		if (vc == Cnd_sppl_grp_cd8) return doCnd_sppl_grp_cd8_VC(info);
		if (vc == Cnd_sppl_grp_nm8) return doCnd_sppl_grp_nm8_VC(info);
		if (vc == Cnd_sppl_grp_cd9) return doCnd_sppl_grp_cd9_VC(info);
		if (vc == Cnd_sppl_grp_nm9) return doCnd_sppl_grp_nm9_VC(info);
		if (vc == Cnd_sppl_grp_cd10) return doCnd_sppl_grp_cd10_VC(info);
		if (vc == Cnd_sppl_grp_nm10) return doCnd_sppl_grp_nm10_VC(info);
		if (vc == LPnl_disp_std) return doLPnl_disp_std_VC(info);
		if (vc == LPnl_disp_unit) return doLPnl_disp_unit_VC(info);
		if (vc == LPnl_disp_ave_upri) return doLPnl_disp_ave_upri_VC(info);
		if (vc == LPnl_disp_ave_unit) return doLPnl_disp_ave_unit_VC(info);
		if (vc == LPnl_disp_std_upri) return doLPnl_disp_std_upri_VC(info);
		if (vc == LPnl_disp_std_unit) return doLPnl_disp_std_unit_VC(info);
		if (vc == columnDispRslt_calc_grp_cd) return doDispRslt_calc_grp_cd_VC(info);
		if (vc == columnDispRslt_calc_grp_nm) return doDispRslt_calc_grp_nm_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_mng_dpt_cd) return doDispRslt_mng_dpt_cd_VC(info);
		if (vc == columnDispRslt_mng_dpt_nm) return doDispRslt_mng_dpt_nm_VC(info);
		if (vc == columnDispRslt_itm_typ) return doDispRslt_itm_typ_VC(info);
		if (vc == columnDispRslt_itm_typ_nm) return doDispRslt_itm_typ_nm_VC(info);
		if (vc == columnDispRslt_itm_typ_d_cd) return doDispRslt_itm_typ_d_cd_VC(info);
		if (vc == columnDispRslt_itm_typ_d_nm) return doDispRslt_itm_typ_d_nm_VC(info);
		if (vc == columnDispRslt_itm_jnl_cd) return doDispRslt_itm_jnl_cd_VC(info);
		if (vc == columnDispRslt_itm_jnl_nm) return doDispRslt_itm_jnl_nm_VC(info);
		if (vc == columnDispRslt_lot_no) return doDispRslt_lot_no_VC(info);
		if (vc == columnDispRslt_sublot_no) return doDispRslt_sublot_no_VC(info);
		if (vc == columnDispRslt_sno1) return doDispRslt_sno1_VC(info);
		if (vc == columnDispRslt_sno2) return doDispRslt_sno2_VC(info);
		if (vc == columnDispRslt_sno3) return doDispRslt_sno3_VC(info);
		if (vc == columnDispRslt_sno4) return doDispRslt_sno4_VC(info);
		if (vc == columnDispRslt_sppl_cd) return doDispRslt_sppl_cd_VC(info);
		if (vc == columnDispRslt_sppl_nm) return doDispRslt_sppl_nm_VC(info);
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_repurc_obli_flg) return doDispRslt_repurc_obli_flg_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
		if (vc == columnDispRslt_col_001) return doDispRslt_col_001_VC(info);
		if (vc == columnDispRslt_col_002) return doDispRslt_col_002_VC(info);
		if (vc == columnDispRslt_col_003) return doDispRslt_col_003_VC(info);
		if (vc == columnDispRslt_col_004) return doDispRslt_col_004_VC(info);
		if (vc == columnDispRslt_col_006) return doDispRslt_col_006_VC(info);
		if (vc == columnDispRslt_col_007) return doDispRslt_col_007_VC(info);
		if (vc == columnDispRslt_col_008) return doDispRslt_col_008_VC(info);
		if (vc == columnDispRslt_col_009) return doDispRslt_col_009_VC(info);
		if (vc == columnDispRslt_col_011) return doDispRslt_col_011_VC(info);
		if (vc == columnDispRslt_col_012) return doDispRslt_col_012_VC(info);
		if (vc == columnDispRslt_col_013) return doDispRslt_col_013_VC(info);
		if (vc == columnDispRslt_col_014) return doDispRslt_col_014_VC(info);
		if (vc == columnDispRslt_col_016) return doDispRslt_col_016_VC(info);
		if (vc == columnDispRslt_col_017) return doDispRslt_col_017_VC(info);
		if (vc == columnDispRslt_col_018) return doDispRslt_col_018_VC(info);
		if (vc == columnDispRslt_col_019) return doDispRslt_col_019_VC(info);
		if (vc == columnDispRslt_col_021) return doDispRslt_col_021_VC(info);
		if (vc == columnDispRslt_col_022) return doDispRslt_col_022_VC(info);
		if (vc == columnDispRslt_col_023) return doDispRslt_col_023_VC(info);
		if (vc == columnDispRslt_col_024) return doDispRslt_col_024_VC(info);
		if (vc == columnDispRslt_col_026) return doDispRslt_col_026_VC(info);
		if (vc == columnDispRslt_col_027) return doDispRslt_col_027_VC(info);
		if (vc == columnDispRslt_col_028) return doDispRslt_col_028_VC(info);
		if (vc == columnDispRslt_col_029) return doDispRslt_col_029_VC(info);
		if (vc == columnDispRslt_col_031) return doDispRslt_col_031_VC(info);
		if (vc == columnDispRslt_col_032) return doDispRslt_col_032_VC(info);
		if (vc == columnDispRslt_col_033) return doDispRslt_col_033_VC(info);
		if (vc == columnDispRslt_col_034) return doDispRslt_col_034_VC(info);
		if (vc == columnDispRslt_col_036) return doDispRslt_col_036_VC(info);
		if (vc == columnDispRslt_col_037) return doDispRslt_col_037_VC(info);
		if (vc == columnDispRslt_col_038) return doDispRslt_col_038_VC(info);
		if (vc == columnDispRslt_col_039) return doDispRslt_col_039_VC(info);
		if (vc == columnDispRslt_col_041) return doDispRslt_col_041_VC(info);
		if (vc == columnDispRslt_col_042) return doDispRslt_col_042_VC(info);
		if (vc == columnDispRslt_col_043) return doDispRslt_col_043_VC(info);
		if (vc == columnDispRslt_col_044) return doDispRslt_col_044_VC(info);
		if (vc == columnDispRslt_col_046) return doDispRslt_col_046_VC(info);
		if (vc == columnDispRslt_col_047) return doDispRslt_col_047_VC(info);
		if (vc == columnDispRslt_col_048) return doDispRslt_col_048_VC(info);
		if (vc == columnDispRslt_col_049) return doDispRslt_col_049_VC(info);
		if (vc == columnDispRslt_col_051) return doDispRslt_col_051_VC(info);
		if (vc == columnDispRslt_col_052) return doDispRslt_col_052_VC(info);
		if (vc == columnDispRslt_col_053) return doDispRslt_col_053_VC(info);
		if (vc == columnDispRslt_col_054) return doDispRslt_col_054_VC(info);
		if (vc == columnDispRslt_col_056) return doDispRslt_col_056_VC(info);
		if (vc == columnDispRslt_col_057) return doDispRslt_col_057_VC(info);
		if (vc == columnDispRslt_col_058) return doDispRslt_col_058_VC(info);
		if (vc == columnDispRslt_col_059) return doDispRslt_col_059_VC(info);
		if (vc == columnDispRslt_col_061) return doDispRslt_col_061_VC(info);
		if (vc == columnDispRslt_col_062) return doDispRslt_col_062_VC(info);
		if (vc == columnDispRslt_col_063) return doDispRslt_col_063_VC(info);
		if (vc == columnDispRslt_col_064) return doDispRslt_col_064_VC(info);
		if (vc == columnDispRslt_col_066) return doDispRslt_col_066_VC(info);
		if (vc == columnDispRslt_col_067) return doDispRslt_col_067_VC(info);
		if (vc == columnDispRslt_col_068) return doDispRslt_col_068_VC(info);
		if (vc == columnDispRslt_col_069) return doDispRslt_col_069_VC(info);
		if (vc == columnDispRslt_col_071) return doDispRslt_col_071_VC(info);
		if (vc == columnDispRslt_col_072) return doDispRslt_col_072_VC(info);
		if (vc == columnDispRslt_col_073) return doDispRslt_col_073_VC(info);
		if (vc == columnDispRslt_col_074) return doDispRslt_col_074_VC(info);
		if (vc == columnDispRslt_col_076) return doDispRslt_col_076_VC(info);
		if (vc == columnDispRslt_col_077) return doDispRslt_col_077_VC(info);
		if (vc == columnDispRslt_col_078) return doDispRslt_col_078_VC(info);
		if (vc == columnDispRslt_col_079) return doDispRslt_col_079_VC(info);
		if (vc == columnDispRslt_col_081) return doDispRslt_col_081_VC(info);
		if (vc == columnDispRslt_col_082) return doDispRslt_col_082_VC(info);
		if (vc == columnDispRslt_col_083) return doDispRslt_col_083_VC(info);
		if (vc == columnDispRslt_col_084) return doDispRslt_col_084_VC(info);
		if (vc == columnDispRslt_col_086) return doDispRslt_col_086_VC(info);
		if (vc == columnDispRslt_col_087) return doDispRslt_col_087_VC(info);
		if (vc == columnDispRslt_col_088) return doDispRslt_col_088_VC(info);
		if (vc == columnDispRslt_col_089) return doDispRslt_col_089_VC(info);
		if (vc == columnDispRslt_col_091) return doDispRslt_col_091_VC(info);
		if (vc == columnDispRslt_col_092) return doDispRslt_col_092_VC(info);
		if (vc == columnDispRslt_col_093) return doDispRslt_col_093_VC(info);
		if (vc == columnDispRslt_col_094) return doDispRslt_col_094_VC(info);
		if (vc == columnDispRslt_col_096) return doDispRslt_col_096_VC(info);
		if (vc == columnDispRslt_col_097) return doDispRslt_col_097_VC(info);
		if (vc == columnDispRslt_col_098) return doDispRslt_col_098_VC(info);
		if (vc == columnDispRslt_col_099) return doDispRslt_col_099_VC(info);
		if (vc == columnDispRslt_col_101) return doDispRslt_col_101_VC(info);
		if (vc == columnDispRslt_col_102) return doDispRslt_col_102_VC(info);
		if (vc == columnDispRslt_col_103) return doDispRslt_col_103_VC(info);
		if (vc == columnDispRslt_col_104) return doDispRslt_col_104_VC(info);
		if (vc == columnDispRslt_col_106) return doDispRslt_col_106_VC(info);
		if (vc == columnDispRslt_col_107) return doDispRslt_col_107_VC(info);
		if (vc == columnDispRslt_col_108) return doDispRslt_col_108_VC(info);
		if (vc == columnDispRslt_col_109) return doDispRslt_col_109_VC(info);
		if (vc == columnDispRslt_col_111) return doDispRslt_col_111_VC(info);
		if (vc == columnDispRslt_col_112) return doDispRslt_col_112_VC(info);
		if (vc == columnDispRslt_col_113) return doDispRslt_col_113_VC(info);
		if (vc == columnDispRslt_col_114) return doDispRslt_col_114_VC(info);
		if (vc == columnDispRslt_col_116) return doDispRslt_col_116_VC(info);
		if (vc == columnDispRslt_col_117) return doDispRslt_col_117_VC(info);
		if (vc == columnDispRslt_col_118) return doDispRslt_col_118_VC(info);
		if (vc == columnDispRslt_col_119) return doDispRslt_col_119_VC(info);
		if (vc == columnDispRslt_col_121) return doDispRslt_col_121_VC(info);
		if (vc == columnDispRslt_col_122) return doDispRslt_col_122_VC(info);
		if (vc == columnDispRslt_col_123) return doDispRslt_col_123_VC(info);
		if (vc == columnDispRslt_col_124) return doDispRslt_col_124_VC(info);
		if (vc == columnDispRslt_col_126) return doDispRslt_col_126_VC(info);
		if (vc == columnDispRslt_col_127) return doDispRslt_col_127_VC(info);
		if (vc == columnDispRslt_col_128) return doDispRslt_col_128_VC(info);
		if (vc == columnDispRslt_col_129) return doDispRslt_col_129_VC(info);
		if (vc == columnDispRslt_col_131) return doDispRslt_col_131_VC(info);
		if (vc == columnDispRslt_col_132) return doDispRslt_col_132_VC(info);
		if (vc == columnDispRslt_col_133) return doDispRslt_col_133_VC(info);
		if (vc == columnDispRslt_col_134) return doDispRslt_col_134_VC(info);
		if (vc == columnDispRslt_col_136) return doDispRslt_col_136_VC(info);
		if (vc == columnDispRslt_col_137) return doDispRslt_col_137_VC(info);
		if (vc == columnDispRslt_col_138) return doDispRslt_col_138_VC(info);
		if (vc == columnDispRslt_col_139) return doDispRslt_col_139_VC(info);
		if (vc == columnDispRslt_col_141) return doDispRslt_col_141_VC(info);
		if (vc == columnDispRslt_col_142) return doDispRslt_col_142_VC(info);
		if (vc == columnDispRslt_col_143) return doDispRslt_col_143_VC(info);
		if (vc == columnDispRslt_col_144) return doDispRslt_col_144_VC(info);
		if (vc == columnDispRslt_col_146) return doDispRslt_col_146_VC(info);
		if (vc == columnDispRslt_col_147) return doDispRslt_col_147_VC(info);
		if (vc == columnDispRslt_col_148) return doDispRslt_col_148_VC(info);
		if (vc == columnDispRslt_col_149) return doDispRslt_col_149_VC(info);
		if (vc == columnDispRslt_col_151) return doDispRslt_col_151_VC(info);
		if (vc == columnDispRslt_col_152) return doDispRslt_col_152_VC(info);
		if (vc == columnDispRslt_col_153) return doDispRslt_col_153_VC(info);
		if (vc == columnDispRslt_col_154) return doDispRslt_col_154_VC(info);
		if (vc == columnDispRslt_col_156) return doDispRslt_col_156_VC(info);
		if (vc == columnDispRslt_col_157) return doDispRslt_col_157_VC(info);
		if (vc == columnDispRslt_col_158) return doDispRslt_col_158_VC(info);
		if (vc == columnDispRslt_col_159) return doDispRslt_col_159_VC(info);
		if (vc == columnDispRslt_col_161) return doDispRslt_col_161_VC(info);
		if (vc == columnDispRslt_col_162) return doDispRslt_col_162_VC(info);
		if (vc == columnDispRslt_col_163) return doDispRslt_col_163_VC(info);
		if (vc == columnDispRslt_col_164) return doDispRslt_col_164_VC(info);
		if (vc == columnDispRslt_col_166) return doDispRslt_col_166_VC(info);
		if (vc == columnDispRslt_col_167) return doDispRslt_col_167_VC(info);
		if (vc == columnDispRslt_col_168) return doDispRslt_col_168_VC(info);
		if (vc == columnDispRslt_col_169) return doDispRslt_col_169_VC(info);
		if (vc == columnDispRslt_col_171) return doDispRslt_col_171_VC(info);
		if (vc == columnDispRslt_col_172) return doDispRslt_col_172_VC(info);
		if (vc == columnDispRslt_col_173) return doDispRslt_col_173_VC(info);
		if (vc == columnDispRslt_col_174) return doDispRslt_col_174_VC(info);
		if (vc == columnDispRslt_col_176) return doDispRslt_col_176_VC(info);
		if (vc == columnDispRslt_col_177) return doDispRslt_col_177_VC(info);
		if (vc == columnDispRslt_col_178) return doDispRslt_col_178_VC(info);
		if (vc == columnDispRslt_col_179) return doDispRslt_col_179_VC(info);
		if (vc == columnDispRslt_col_181) return doDispRslt_col_181_VC(info);
		if (vc == columnDispRslt_col_182) return doDispRslt_col_182_VC(info);
		if (vc == columnDispRslt_col_183) return doDispRslt_col_183_VC(info);
		if (vc == columnDispRslt_col_184) return doDispRslt_col_184_VC(info);
		if (vc == columnDispRslt_col_186) return doDispRslt_col_186_VC(info);
		if (vc == columnDispRslt_col_187) return doDispRslt_col_187_VC(info);
		if (vc == columnDispRslt_col_188) return doDispRslt_col_188_VC(info);
		if (vc == columnDispRslt_col_189) return doDispRslt_col_189_VC(info);
		if (vc == columnDispRslt_col_191) return doDispRslt_col_191_VC(info);
		if (vc == columnDispRslt_col_192) return doDispRslt_col_192_VC(info);
		if (vc == columnDispRslt_col_193) return doDispRslt_col_193_VC(info);
		if (vc == columnDispRslt_col_194) return doDispRslt_col_194_VC(info);
		if (vc == columnDispRslt_col_196) return doDispRslt_col_196_VC(info);
		if (vc == columnDispRslt_col_197) return doDispRslt_col_197_VC(info);
		if (vc == columnDispRslt_col_198) return doDispRslt_col_198_VC(info);
		if (vc == columnDispRslt_col_199) return doDispRslt_col_199_VC(info);
		if (vc == columnDispRslt_col_201) return doDispRslt_col_201_VC(info);
		if (vc == columnDispRslt_col_202) return doDispRslt_col_202_VC(info);
		if (vc == columnDispRslt_col_203) return doDispRslt_col_203_VC(info);
		if (vc == columnDispRslt_col_204) return doDispRslt_col_204_VC(info);
		if (vc == columnDispRslt_col_206) return doDispRslt_col_206_VC(info);
		if (vc == columnDispRslt_col_207) return doDispRslt_col_207_VC(info);
		if (vc == columnDispRslt_col_208) return doDispRslt_col_208_VC(info);
		if (vc == columnDispRslt_col_209) return doDispRslt_col_209_VC(info);
		if (vc == columnDispRslt_col_211) return doDispRslt_col_211_VC(info);
		if (vc == columnDispRslt_col_212) return doDispRslt_col_212_VC(info);
		if (vc == columnDispRslt_col_213) return doDispRslt_col_213_VC(info);
		if (vc == columnDispRslt_col_214) return doDispRslt_col_214_VC(info);
		if (vc == columnDispRslt_col_216) return doDispRslt_col_216_VC(info);
		if (vc == columnDispRslt_col_217) return doDispRslt_col_217_VC(info);
		if (vc == columnDispRslt_col_218) return doDispRslt_col_218_VC(info);
		if (vc == columnDispRslt_col_219) return doDispRslt_col_219_VC(info);
		if (vc == columnDispRslt_col_221) return doDispRslt_col_221_VC(info);
		if (vc == columnDispRslt_col_222) return doDispRslt_col_222_VC(info);
		if (vc == columnDispRslt_col_223) return doDispRslt_col_223_VC(info);
		if (vc == columnDispRslt_col_224) return doDispRslt_col_224_VC(info);
		if (vc == columnDispRslt_col_226) return doDispRslt_col_226_VC(info);
		if (vc == columnDispRslt_col_227) return doDispRslt_col_227_VC(info);
		if (vc == columnDispRslt_col_228) return doDispRslt_col_228_VC(info);
		if (vc == columnDispRslt_col_229) return doDispRslt_col_229_VC(info);
		if (vc == columnDispRslt_col_231) return doDispRslt_col_231_VC(info);
		if (vc == columnDispRslt_col_232) return doDispRslt_col_232_VC(info);
		if (vc == columnDispRslt_col_233) return doDispRslt_col_233_VC(info);
		if (vc == columnDispRslt_col_234) return doDispRslt_col_234_VC(info);
		if (vc == columnDispRslt_col_236) return doDispRslt_col_236_VC(info);
		if (vc == columnDispRslt_col_237) return doDispRslt_col_237_VC(info);
		if (vc == columnDispRslt_col_238) return doDispRslt_col_238_VC(info);
		if (vc == columnDispRslt_col_239) return doDispRslt_col_239_VC(info);
		if (vc == columnDispRslt_col_241) return doDispRslt_col_241_VC(info);
		if (vc == columnDispRslt_col_242) return doDispRslt_col_242_VC(info);
		if (vc == columnDispRslt_col_243) return doDispRslt_col_243_VC(info);
		if (vc == columnDispRslt_col_244) return doDispRslt_col_244_VC(info);
		if (vc == columnDispRslt_col_246) return doDispRslt_col_246_VC(info);
		if (vc == columnDispRslt_col_247) return doDispRslt_col_247_VC(info);
		if (vc == columnDispRslt_col_248) return doDispRslt_col_248_VC(info);
		if (vc == columnDispRslt_col_249) return doDispRslt_col_249_VC(info);
		if (vc == columnDispRslt_col_251) return doDispRslt_col_251_VC(info);
		if (vc == columnDispRslt_col_252) return doDispRslt_col_252_VC(info);
		if (vc == columnDispRslt_col_253) return doDispRslt_col_253_VC(info);
		if (vc == columnDispRslt_col_254) return doDispRslt_col_254_VC(info);
		if (vc == columnDispRslt_col_256) return doDispRslt_col_256_VC(info);
		if (vc == columnDispRslt_col_257) return doDispRslt_col_257_VC(info);
		if (vc == columnDispRslt_col_258) return doDispRslt_col_258_VC(info);
		if (vc == columnDispRslt_col_259) return doDispRslt_col_259_VC(info);
		if (vc == columnDispRslt_col_261) return doDispRslt_col_261_VC(info);
		if (vc == columnDispRslt_col_262) return doDispRslt_col_262_VC(info);
		if (vc == columnDispRslt_col_263) return doDispRslt_col_263_VC(info);
		if (vc == columnDispRslt_col_264) return doDispRslt_col_264_VC(info);
		if (vc == columnDispRslt_col_266) return doDispRslt_col_266_VC(info);
		if (vc == columnDispRslt_col_267) return doDispRslt_col_267_VC(info);
		if (vc == columnDispRslt_col_268) return doDispRslt_col_268_VC(info);
		if (vc == columnDispRslt_col_269) return doDispRslt_col_269_VC(info);
		if (vc == columnDispRslt_col_271) return doDispRslt_col_271_VC(info);
		if (vc == columnDispRslt_col_272) return doDispRslt_col_272_VC(info);
		if (vc == columnDispRslt_col_273) return doDispRslt_col_273_VC(info);
		if (vc == columnDispRslt_col_274) return doDispRslt_col_274_VC(info);
		if (vc == columnDispRslt_col_276) return doDispRslt_col_276_VC(info);
		if (vc == columnDispRslt_col_277) return doDispRslt_col_277_VC(info);
		if (vc == columnDispRslt_col_278) return doDispRslt_col_278_VC(info);
		if (vc == columnDispRslt_col_279) return doDispRslt_col_279_VC(info);
		if (vc == columnDispRslt_col_281) return doDispRslt_col_281_VC(info);
		if (vc == columnDispRslt_col_282) return doDispRslt_col_282_VC(info);
		if (vc == columnDispRslt_col_283) return doDispRslt_col_283_VC(info);
		if (vc == columnDispRslt_col_284) return doDispRslt_col_284_VC(info);
		if (vc == columnDispRslt_col_286) return doDispRslt_col_286_VC(info);
		if (vc == columnDispRslt_col_287) return doDispRslt_col_287_VC(info);
		if (vc == columnDispRslt_col_288) return doDispRslt_col_288_VC(info);
		if (vc == columnDispRslt_col_289) return doDispRslt_col_289_VC(info);
		if (vc == columnDispRslt_col_291) return doDispRslt_col_291_VC(info);
		if (vc == columnDispRslt_col_292) return doDispRslt_col_292_VC(info);
		if (vc == columnDispRslt_col_293) return doDispRslt_col_293_VC(info);
		if (vc == columnDispRslt_col_294) return doDispRslt_col_294_VC(info);
		if (vc == columnDispRslt_col_296) return doDispRslt_col_296_VC(info);
		if (vc == columnDispRslt_col_297) return doDispRslt_col_297_VC(info);
		if (vc == columnDispRslt_col_298) return doDispRslt_col_298_VC(info);
		if (vc == columnDispRslt_col_299) return doDispRslt_col_299_VC(info);
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
	 * [DispRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[except_oth_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_oth_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_repurc_obli_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_repurc_obli_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_std]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_std_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_ave_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_ave_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_ave_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_ave_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_std_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_std_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_std_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_std_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_101]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_101_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_102]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_102_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_103]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_103_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_104]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_104_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_106]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_106_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_107]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_107_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_108]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_108_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_109]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_109_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_111]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_111_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_112]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_112_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_113]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_113_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_114]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_114_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_116]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_116_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_117]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_117_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_118]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_118_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_119]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_119_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_121]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_121_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_122]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_122_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_123]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_123_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_124]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_124_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_126]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_126_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_127]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_127_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_128]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_128_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_129]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_129_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_131]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_131_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_132]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_132_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_133]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_133_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_134]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_134_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_136]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_136_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_137]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_137_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_138]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_138_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_139]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_139_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_141]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_141_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_142]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_142_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_143]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_143_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_144]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_144_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_146]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_146_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_147]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_147_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_148]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_148_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_149]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_149_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_151]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_151_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_152]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_152_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_153]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_153_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_154]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_154_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_156]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_156_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_157]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_157_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_158]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_158_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_159]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_159_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_161]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_161_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_162]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_162_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_163]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_163_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_164]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_164_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_166]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_166_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_167]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_167_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_168]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_168_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_169]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_169_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_171]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_171_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_172]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_172_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_173]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_173_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_174]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_174_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_176]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_176_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_177]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_177_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_178]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_178_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_179]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_179_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_181]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_181_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_182]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_182_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_183]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_183_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_184]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_184_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_186]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_186_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_187]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_187_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_188]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_188_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_189]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_189_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_191]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_191_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_192]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_192_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_193]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_193_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_194]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_194_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_196]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_196_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_197]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_197_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_198]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_198_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_199]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_199_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_201]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_201_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_202]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_202_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_203]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_203_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_204]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_204_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_206]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_206_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_207]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_207_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_208]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_208_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_209]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_209_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_211]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_211_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_212]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_212_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_213]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_213_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_214]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_214_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_216]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_216_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_217]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_217_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_218]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_218_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_219]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_219_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_221]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_221_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_222]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_222_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_223]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_223_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_224]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_224_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_226]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_226_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_227]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_227_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_228]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_228_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_229]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_229_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_231]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_231_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_232]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_232_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_233]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_233_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_234]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_234_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_236]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_236_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_237]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_237_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_238]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_238_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_239]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_239_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_241]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_241_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_242]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_242_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_243]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_243_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_244]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_244_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_246]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_246_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_247]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_247_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_248]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_248_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_249]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_249_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_251]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_251_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_252]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_252_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_253]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_253_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_254]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_254_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_256]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_256_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_257]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_257_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_258]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_258_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_259]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_259_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_261]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_261_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_262]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_262_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_263]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_263_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_264]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_264_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_266]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_266_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_267]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_267_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_268]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_268_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_269]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_269_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_271]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_271_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_272]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_272_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_273]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_273_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_274]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_274_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_276]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_276_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_277]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_277_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_278]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_278_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_279]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_279_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_281]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_281_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_282]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_282_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_283]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_283_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_284]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_284_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_286]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_286_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_287]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_287_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_288]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_288_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_289]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_289_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_291]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_291_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_292]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_292_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_293]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_293_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_294]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_294_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_296]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_296_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_297]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_297_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_298]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_298_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_299]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_299_VC(MCEventInfo info){
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
		else if (nc == DispRsltTable) doDispRslt_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_except_oth_flg) doCnd_except_oth_flg_NC(info);
		else if (nc == Cnd_repurc_obli_typ) doCnd_repurc_obli_typ_NC(info);
		else if (nc == Cnd_repurc_obli_typ_nm) doCnd_repurc_obli_typ_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
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
		else if (nc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NC(info);
		else if (nc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NC(info);
		else if (nc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NC(info);
		else if (nc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NC(info);
		else if (nc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NC(info);
		else if (nc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NC(info);
		else if (nc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NC(info);
		else if (nc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NC(info);
		else if (nc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NC(info);
		else if (nc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NC(info);
		else if (nc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NC(info);
		else if (nc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NC(info);
		else if (nc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NC(info);
		else if (nc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NC(info);
		else if (nc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NC(info);
		else if (nc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NC(info);
		else if (nc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NC(info);
		else if (nc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NC(info);
		else if (nc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NC(info);
		else if (nc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NC(info);
		else if (nc == LPnl_disp_std) doLPnl_disp_std_NC(info);
		else if (nc == LPnl_disp_unit) doLPnl_disp_unit_NC(info);
		else if (nc == LPnl_disp_ave_upri) doLPnl_disp_ave_upri_NC(info);
		else if (nc == LPnl_disp_ave_unit) doLPnl_disp_ave_unit_NC(info);
		else if (nc == LPnl_disp_std_upri) doLPnl_disp_std_upri_NC(info);
		else if (nc == LPnl_disp_std_unit) doLPnl_disp_std_unit_NC(info);
		else if (nc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NC(info);
		else if (nc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NC(info);
		else if (nc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ) doDispRslt_itm_typ_NC(info);
		else if (nc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NC(info);
		else if (nc == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NC(info);
		else if (nc == columnDispRslt_lot_no) doDispRslt_lot_no_NC(info);
		else if (nc == columnDispRslt_sublot_no) doDispRslt_sublot_no_NC(info);
		else if (nc == columnDispRslt_sno1) doDispRslt_sno1_NC(info);
		else if (nc == columnDispRslt_sno2) doDispRslt_sno2_NC(info);
		else if (nc == columnDispRslt_sno3) doDispRslt_sno3_NC(info);
		else if (nc == columnDispRslt_sno4) doDispRslt_sno4_NC(info);
		else if (nc == columnDispRslt_sppl_cd) doDispRslt_sppl_cd_NC(info);
		else if (nc == columnDispRslt_sppl_nm) doDispRslt_sppl_nm_NC(info);
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_repurc_obli_flg) doDispRslt_repurc_obli_flg_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
		else if (nc == columnDispRslt_col_001) doDispRslt_col_001_NC(info);
		else if (nc == columnDispRslt_col_002) doDispRslt_col_002_NC(info);
		else if (nc == columnDispRslt_col_003) doDispRslt_col_003_NC(info);
		else if (nc == columnDispRslt_col_004) doDispRslt_col_004_NC(info);
		else if (nc == columnDispRslt_col_006) doDispRslt_col_006_NC(info);
		else if (nc == columnDispRslt_col_007) doDispRslt_col_007_NC(info);
		else if (nc == columnDispRslt_col_008) doDispRslt_col_008_NC(info);
		else if (nc == columnDispRslt_col_009) doDispRslt_col_009_NC(info);
		else if (nc == columnDispRslt_col_011) doDispRslt_col_011_NC(info);
		else if (nc == columnDispRslt_col_012) doDispRslt_col_012_NC(info);
		else if (nc == columnDispRslt_col_013) doDispRslt_col_013_NC(info);
		else if (nc == columnDispRslt_col_014) doDispRslt_col_014_NC(info);
		else if (nc == columnDispRslt_col_016) doDispRslt_col_016_NC(info);
		else if (nc == columnDispRslt_col_017) doDispRslt_col_017_NC(info);
		else if (nc == columnDispRslt_col_018) doDispRslt_col_018_NC(info);
		else if (nc == columnDispRslt_col_019) doDispRslt_col_019_NC(info);
		else if (nc == columnDispRslt_col_021) doDispRslt_col_021_NC(info);
		else if (nc == columnDispRslt_col_022) doDispRslt_col_022_NC(info);
		else if (nc == columnDispRslt_col_023) doDispRslt_col_023_NC(info);
		else if (nc == columnDispRslt_col_024) doDispRslt_col_024_NC(info);
		else if (nc == columnDispRslt_col_026) doDispRslt_col_026_NC(info);
		else if (nc == columnDispRslt_col_027) doDispRslt_col_027_NC(info);
		else if (nc == columnDispRslt_col_028) doDispRslt_col_028_NC(info);
		else if (nc == columnDispRslt_col_029) doDispRslt_col_029_NC(info);
		else if (nc == columnDispRslt_col_031) doDispRslt_col_031_NC(info);
		else if (nc == columnDispRslt_col_032) doDispRslt_col_032_NC(info);
		else if (nc == columnDispRslt_col_033) doDispRslt_col_033_NC(info);
		else if (nc == columnDispRslt_col_034) doDispRslt_col_034_NC(info);
		else if (nc == columnDispRslt_col_036) doDispRslt_col_036_NC(info);
		else if (nc == columnDispRslt_col_037) doDispRslt_col_037_NC(info);
		else if (nc == columnDispRslt_col_038) doDispRslt_col_038_NC(info);
		else if (nc == columnDispRslt_col_039) doDispRslt_col_039_NC(info);
		else if (nc == columnDispRslt_col_041) doDispRslt_col_041_NC(info);
		else if (nc == columnDispRslt_col_042) doDispRslt_col_042_NC(info);
		else if (nc == columnDispRslt_col_043) doDispRslt_col_043_NC(info);
		else if (nc == columnDispRslt_col_044) doDispRslt_col_044_NC(info);
		else if (nc == columnDispRslt_col_046) doDispRslt_col_046_NC(info);
		else if (nc == columnDispRslt_col_047) doDispRslt_col_047_NC(info);
		else if (nc == columnDispRslt_col_048) doDispRslt_col_048_NC(info);
		else if (nc == columnDispRslt_col_049) doDispRslt_col_049_NC(info);
		else if (nc == columnDispRslt_col_051) doDispRslt_col_051_NC(info);
		else if (nc == columnDispRslt_col_052) doDispRslt_col_052_NC(info);
		else if (nc == columnDispRslt_col_053) doDispRslt_col_053_NC(info);
		else if (nc == columnDispRslt_col_054) doDispRslt_col_054_NC(info);
		else if (nc == columnDispRslt_col_056) doDispRslt_col_056_NC(info);
		else if (nc == columnDispRslt_col_057) doDispRslt_col_057_NC(info);
		else if (nc == columnDispRslt_col_058) doDispRslt_col_058_NC(info);
		else if (nc == columnDispRslt_col_059) doDispRslt_col_059_NC(info);
		else if (nc == columnDispRslt_col_061) doDispRslt_col_061_NC(info);
		else if (nc == columnDispRslt_col_062) doDispRslt_col_062_NC(info);
		else if (nc == columnDispRslt_col_063) doDispRslt_col_063_NC(info);
		else if (nc == columnDispRslt_col_064) doDispRslt_col_064_NC(info);
		else if (nc == columnDispRslt_col_066) doDispRslt_col_066_NC(info);
		else if (nc == columnDispRslt_col_067) doDispRslt_col_067_NC(info);
		else if (nc == columnDispRslt_col_068) doDispRslt_col_068_NC(info);
		else if (nc == columnDispRslt_col_069) doDispRslt_col_069_NC(info);
		else if (nc == columnDispRslt_col_071) doDispRslt_col_071_NC(info);
		else if (nc == columnDispRslt_col_072) doDispRslt_col_072_NC(info);
		else if (nc == columnDispRslt_col_073) doDispRslt_col_073_NC(info);
		else if (nc == columnDispRslt_col_074) doDispRslt_col_074_NC(info);
		else if (nc == columnDispRslt_col_076) doDispRslt_col_076_NC(info);
		else if (nc == columnDispRslt_col_077) doDispRslt_col_077_NC(info);
		else if (nc == columnDispRslt_col_078) doDispRslt_col_078_NC(info);
		else if (nc == columnDispRslt_col_079) doDispRslt_col_079_NC(info);
		else if (nc == columnDispRslt_col_081) doDispRslt_col_081_NC(info);
		else if (nc == columnDispRslt_col_082) doDispRslt_col_082_NC(info);
		else if (nc == columnDispRslt_col_083) doDispRslt_col_083_NC(info);
		else if (nc == columnDispRslt_col_084) doDispRslt_col_084_NC(info);
		else if (nc == columnDispRslt_col_086) doDispRslt_col_086_NC(info);
		else if (nc == columnDispRslt_col_087) doDispRslt_col_087_NC(info);
		else if (nc == columnDispRslt_col_088) doDispRslt_col_088_NC(info);
		else if (nc == columnDispRslt_col_089) doDispRslt_col_089_NC(info);
		else if (nc == columnDispRslt_col_091) doDispRslt_col_091_NC(info);
		else if (nc == columnDispRslt_col_092) doDispRslt_col_092_NC(info);
		else if (nc == columnDispRslt_col_093) doDispRslt_col_093_NC(info);
		else if (nc == columnDispRslt_col_094) doDispRslt_col_094_NC(info);
		else if (nc == columnDispRslt_col_096) doDispRslt_col_096_NC(info);
		else if (nc == columnDispRslt_col_097) doDispRslt_col_097_NC(info);
		else if (nc == columnDispRslt_col_098) doDispRslt_col_098_NC(info);
		else if (nc == columnDispRslt_col_099) doDispRslt_col_099_NC(info);
		else if (nc == columnDispRslt_col_101) doDispRslt_col_101_NC(info);
		else if (nc == columnDispRslt_col_102) doDispRslt_col_102_NC(info);
		else if (nc == columnDispRslt_col_103) doDispRslt_col_103_NC(info);
		else if (nc == columnDispRslt_col_104) doDispRslt_col_104_NC(info);
		else if (nc == columnDispRslt_col_106) doDispRslt_col_106_NC(info);
		else if (nc == columnDispRslt_col_107) doDispRslt_col_107_NC(info);
		else if (nc == columnDispRslt_col_108) doDispRslt_col_108_NC(info);
		else if (nc == columnDispRslt_col_109) doDispRslt_col_109_NC(info);
		else if (nc == columnDispRslt_col_111) doDispRslt_col_111_NC(info);
		else if (nc == columnDispRslt_col_112) doDispRslt_col_112_NC(info);
		else if (nc == columnDispRslt_col_113) doDispRslt_col_113_NC(info);
		else if (nc == columnDispRslt_col_114) doDispRslt_col_114_NC(info);
		else if (nc == columnDispRslt_col_116) doDispRslt_col_116_NC(info);
		else if (nc == columnDispRslt_col_117) doDispRslt_col_117_NC(info);
		else if (nc == columnDispRslt_col_118) doDispRslt_col_118_NC(info);
		else if (nc == columnDispRslt_col_119) doDispRslt_col_119_NC(info);
		else if (nc == columnDispRslt_col_121) doDispRslt_col_121_NC(info);
		else if (nc == columnDispRslt_col_122) doDispRslt_col_122_NC(info);
		else if (nc == columnDispRslt_col_123) doDispRslt_col_123_NC(info);
		else if (nc == columnDispRslt_col_124) doDispRslt_col_124_NC(info);
		else if (nc == columnDispRslt_col_126) doDispRslt_col_126_NC(info);
		else if (nc == columnDispRslt_col_127) doDispRslt_col_127_NC(info);
		else if (nc == columnDispRslt_col_128) doDispRslt_col_128_NC(info);
		else if (nc == columnDispRslt_col_129) doDispRslt_col_129_NC(info);
		else if (nc == columnDispRslt_col_131) doDispRslt_col_131_NC(info);
		else if (nc == columnDispRslt_col_132) doDispRslt_col_132_NC(info);
		else if (nc == columnDispRslt_col_133) doDispRslt_col_133_NC(info);
		else if (nc == columnDispRslt_col_134) doDispRslt_col_134_NC(info);
		else if (nc == columnDispRslt_col_136) doDispRslt_col_136_NC(info);
		else if (nc == columnDispRslt_col_137) doDispRslt_col_137_NC(info);
		else if (nc == columnDispRslt_col_138) doDispRslt_col_138_NC(info);
		else if (nc == columnDispRslt_col_139) doDispRslt_col_139_NC(info);
		else if (nc == columnDispRslt_col_141) doDispRslt_col_141_NC(info);
		else if (nc == columnDispRslt_col_142) doDispRslt_col_142_NC(info);
		else if (nc == columnDispRslt_col_143) doDispRslt_col_143_NC(info);
		else if (nc == columnDispRslt_col_144) doDispRslt_col_144_NC(info);
		else if (nc == columnDispRslt_col_146) doDispRslt_col_146_NC(info);
		else if (nc == columnDispRslt_col_147) doDispRslt_col_147_NC(info);
		else if (nc == columnDispRslt_col_148) doDispRslt_col_148_NC(info);
		else if (nc == columnDispRslt_col_149) doDispRslt_col_149_NC(info);
		else if (nc == columnDispRslt_col_151) doDispRslt_col_151_NC(info);
		else if (nc == columnDispRslt_col_152) doDispRslt_col_152_NC(info);
		else if (nc == columnDispRslt_col_153) doDispRslt_col_153_NC(info);
		else if (nc == columnDispRslt_col_154) doDispRslt_col_154_NC(info);
		else if (nc == columnDispRslt_col_156) doDispRslt_col_156_NC(info);
		else if (nc == columnDispRslt_col_157) doDispRslt_col_157_NC(info);
		else if (nc == columnDispRslt_col_158) doDispRslt_col_158_NC(info);
		else if (nc == columnDispRslt_col_159) doDispRslt_col_159_NC(info);
		else if (nc == columnDispRslt_col_161) doDispRslt_col_161_NC(info);
		else if (nc == columnDispRslt_col_162) doDispRslt_col_162_NC(info);
		else if (nc == columnDispRslt_col_163) doDispRslt_col_163_NC(info);
		else if (nc == columnDispRslt_col_164) doDispRslt_col_164_NC(info);
		else if (nc == columnDispRslt_col_166) doDispRslt_col_166_NC(info);
		else if (nc == columnDispRslt_col_167) doDispRslt_col_167_NC(info);
		else if (nc == columnDispRslt_col_168) doDispRslt_col_168_NC(info);
		else if (nc == columnDispRslt_col_169) doDispRslt_col_169_NC(info);
		else if (nc == columnDispRslt_col_171) doDispRslt_col_171_NC(info);
		else if (nc == columnDispRslt_col_172) doDispRslt_col_172_NC(info);
		else if (nc == columnDispRslt_col_173) doDispRslt_col_173_NC(info);
		else if (nc == columnDispRslt_col_174) doDispRslt_col_174_NC(info);
		else if (nc == columnDispRslt_col_176) doDispRslt_col_176_NC(info);
		else if (nc == columnDispRslt_col_177) doDispRslt_col_177_NC(info);
		else if (nc == columnDispRslt_col_178) doDispRslt_col_178_NC(info);
		else if (nc == columnDispRslt_col_179) doDispRslt_col_179_NC(info);
		else if (nc == columnDispRslt_col_181) doDispRslt_col_181_NC(info);
		else if (nc == columnDispRslt_col_182) doDispRslt_col_182_NC(info);
		else if (nc == columnDispRslt_col_183) doDispRslt_col_183_NC(info);
		else if (nc == columnDispRslt_col_184) doDispRslt_col_184_NC(info);
		else if (nc == columnDispRslt_col_186) doDispRslt_col_186_NC(info);
		else if (nc == columnDispRslt_col_187) doDispRslt_col_187_NC(info);
		else if (nc == columnDispRslt_col_188) doDispRslt_col_188_NC(info);
		else if (nc == columnDispRslt_col_189) doDispRslt_col_189_NC(info);
		else if (nc == columnDispRslt_col_191) doDispRslt_col_191_NC(info);
		else if (nc == columnDispRslt_col_192) doDispRslt_col_192_NC(info);
		else if (nc == columnDispRslt_col_193) doDispRslt_col_193_NC(info);
		else if (nc == columnDispRslt_col_194) doDispRslt_col_194_NC(info);
		else if (nc == columnDispRslt_col_196) doDispRslt_col_196_NC(info);
		else if (nc == columnDispRslt_col_197) doDispRslt_col_197_NC(info);
		else if (nc == columnDispRslt_col_198) doDispRslt_col_198_NC(info);
		else if (nc == columnDispRslt_col_199) doDispRslt_col_199_NC(info);
		else if (nc == columnDispRslt_col_201) doDispRslt_col_201_NC(info);
		else if (nc == columnDispRslt_col_202) doDispRslt_col_202_NC(info);
		else if (nc == columnDispRslt_col_203) doDispRslt_col_203_NC(info);
		else if (nc == columnDispRslt_col_204) doDispRslt_col_204_NC(info);
		else if (nc == columnDispRslt_col_206) doDispRslt_col_206_NC(info);
		else if (nc == columnDispRslt_col_207) doDispRslt_col_207_NC(info);
		else if (nc == columnDispRslt_col_208) doDispRslt_col_208_NC(info);
		else if (nc == columnDispRslt_col_209) doDispRslt_col_209_NC(info);
		else if (nc == columnDispRslt_col_211) doDispRslt_col_211_NC(info);
		else if (nc == columnDispRslt_col_212) doDispRslt_col_212_NC(info);
		else if (nc == columnDispRslt_col_213) doDispRslt_col_213_NC(info);
		else if (nc == columnDispRslt_col_214) doDispRslt_col_214_NC(info);
		else if (nc == columnDispRslt_col_216) doDispRslt_col_216_NC(info);
		else if (nc == columnDispRslt_col_217) doDispRslt_col_217_NC(info);
		else if (nc == columnDispRslt_col_218) doDispRslt_col_218_NC(info);
		else if (nc == columnDispRslt_col_219) doDispRslt_col_219_NC(info);
		else if (nc == columnDispRslt_col_221) doDispRslt_col_221_NC(info);
		else if (nc == columnDispRslt_col_222) doDispRslt_col_222_NC(info);
		else if (nc == columnDispRslt_col_223) doDispRslt_col_223_NC(info);
		else if (nc == columnDispRslt_col_224) doDispRslt_col_224_NC(info);
		else if (nc == columnDispRslt_col_226) doDispRslt_col_226_NC(info);
		else if (nc == columnDispRslt_col_227) doDispRslt_col_227_NC(info);
		else if (nc == columnDispRslt_col_228) doDispRslt_col_228_NC(info);
		else if (nc == columnDispRslt_col_229) doDispRslt_col_229_NC(info);
		else if (nc == columnDispRslt_col_231) doDispRslt_col_231_NC(info);
		else if (nc == columnDispRslt_col_232) doDispRslt_col_232_NC(info);
		else if (nc == columnDispRslt_col_233) doDispRslt_col_233_NC(info);
		else if (nc == columnDispRslt_col_234) doDispRslt_col_234_NC(info);
		else if (nc == columnDispRslt_col_236) doDispRslt_col_236_NC(info);
		else if (nc == columnDispRslt_col_237) doDispRslt_col_237_NC(info);
		else if (nc == columnDispRslt_col_238) doDispRslt_col_238_NC(info);
		else if (nc == columnDispRslt_col_239) doDispRslt_col_239_NC(info);
		else if (nc == columnDispRslt_col_241) doDispRslt_col_241_NC(info);
		else if (nc == columnDispRslt_col_242) doDispRslt_col_242_NC(info);
		else if (nc == columnDispRslt_col_243) doDispRslt_col_243_NC(info);
		else if (nc == columnDispRslt_col_244) doDispRslt_col_244_NC(info);
		else if (nc == columnDispRslt_col_246) doDispRslt_col_246_NC(info);
		else if (nc == columnDispRslt_col_247) doDispRslt_col_247_NC(info);
		else if (nc == columnDispRslt_col_248) doDispRslt_col_248_NC(info);
		else if (nc == columnDispRslt_col_249) doDispRslt_col_249_NC(info);
		else if (nc == columnDispRslt_col_251) doDispRslt_col_251_NC(info);
		else if (nc == columnDispRslt_col_252) doDispRslt_col_252_NC(info);
		else if (nc == columnDispRslt_col_253) doDispRslt_col_253_NC(info);
		else if (nc == columnDispRslt_col_254) doDispRslt_col_254_NC(info);
		else if (nc == columnDispRslt_col_256) doDispRslt_col_256_NC(info);
		else if (nc == columnDispRslt_col_257) doDispRslt_col_257_NC(info);
		else if (nc == columnDispRslt_col_258) doDispRslt_col_258_NC(info);
		else if (nc == columnDispRslt_col_259) doDispRslt_col_259_NC(info);
		else if (nc == columnDispRslt_col_261) doDispRslt_col_261_NC(info);
		else if (nc == columnDispRslt_col_262) doDispRslt_col_262_NC(info);
		else if (nc == columnDispRslt_col_263) doDispRslt_col_263_NC(info);
		else if (nc == columnDispRslt_col_264) doDispRslt_col_264_NC(info);
		else if (nc == columnDispRslt_col_266) doDispRslt_col_266_NC(info);
		else if (nc == columnDispRslt_col_267) doDispRslt_col_267_NC(info);
		else if (nc == columnDispRslt_col_268) doDispRslt_col_268_NC(info);
		else if (nc == columnDispRslt_col_269) doDispRslt_col_269_NC(info);
		else if (nc == columnDispRslt_col_271) doDispRslt_col_271_NC(info);
		else if (nc == columnDispRslt_col_272) doDispRslt_col_272_NC(info);
		else if (nc == columnDispRslt_col_273) doDispRslt_col_273_NC(info);
		else if (nc == columnDispRslt_col_274) doDispRslt_col_274_NC(info);
		else if (nc == columnDispRslt_col_276) doDispRslt_col_276_NC(info);
		else if (nc == columnDispRslt_col_277) doDispRslt_col_277_NC(info);
		else if (nc == columnDispRslt_col_278) doDispRslt_col_278_NC(info);
		else if (nc == columnDispRslt_col_279) doDispRslt_col_279_NC(info);
		else if (nc == columnDispRslt_col_281) doDispRslt_col_281_NC(info);
		else if (nc == columnDispRslt_col_282) doDispRslt_col_282_NC(info);
		else if (nc == columnDispRslt_col_283) doDispRslt_col_283_NC(info);
		else if (nc == columnDispRslt_col_284) doDispRslt_col_284_NC(info);
		else if (nc == columnDispRslt_col_286) doDispRslt_col_286_NC(info);
		else if (nc == columnDispRslt_col_287) doDispRslt_col_287_NC(info);
		else if (nc == columnDispRslt_col_288) doDispRslt_col_288_NC(info);
		else if (nc == columnDispRslt_col_289) doDispRslt_col_289_NC(info);
		else if (nc == columnDispRslt_col_291) doDispRslt_col_291_NC(info);
		else if (nc == columnDispRslt_col_292) doDispRslt_col_292_NC(info);
		else if (nc == columnDispRslt_col_293) doDispRslt_col_293_NC(info);
		else if (nc == columnDispRslt_col_294) doDispRslt_col_294_NC(info);
		else if (nc == columnDispRslt_col_296) doDispRslt_col_296_NC(info);
		else if (nc == columnDispRslt_col_297) doDispRslt_col_297_NC(info);
		else if (nc == columnDispRslt_col_298) doDispRslt_col_298_NC(info);
		else if (nc == columnDispRslt_col_299) doDispRslt_col_299_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_oth_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_oth_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_unit_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_upri_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_unit_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_upri_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_unit_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_122]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_122_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_123]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_123_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_124]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_124_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_126]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_126_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_127]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_127_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_128]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_128_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_129]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_129_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_131]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_131_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_132]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_132_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_133]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_133_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_134]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_134_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_136]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_136_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_137]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_137_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_138]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_138_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_139]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_139_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_141]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_141_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_142]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_142_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_143]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_143_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_144]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_144_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_146]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_146_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_147]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_147_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_148]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_148_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_149]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_149_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_151]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_151_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_152]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_152_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_153]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_153_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_154]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_154_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_156]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_156_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_157]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_157_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_158]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_158_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_159]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_159_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_161]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_161_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_162]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_162_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_163]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_163_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_164]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_164_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_166]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_166_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_167]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_167_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_168]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_168_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_169]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_169_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_171]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_171_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_172]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_172_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_173]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_173_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_174]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_174_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_176]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_176_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_177]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_177_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_178]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_178_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_179]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_179_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_181]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_181_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_182]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_182_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_183]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_183_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_184]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_184_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_186]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_186_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_187]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_187_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_188]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_188_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_189]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_189_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_191]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_191_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_192]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_192_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_193]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_193_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_194]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_194_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_196]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_196_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_197]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_197_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_198]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_198_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_199]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_199_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_201]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_201_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_202]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_202_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_203]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_203_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_204]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_204_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_206]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_206_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_207]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_207_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_208]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_208_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_209]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_209_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_211]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_211_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_212]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_212_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_213]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_213_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_214]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_214_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_216]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_216_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_217]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_217_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_218]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_218_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_219]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_219_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_221]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_221_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_222]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_222_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_223]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_223_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_224]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_224_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_226]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_226_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_227]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_227_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_228]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_228_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_229]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_229_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_231]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_231_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_232]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_232_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_233]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_233_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_234]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_234_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_236]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_236_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_237]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_237_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_238]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_238_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_239]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_239_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_241]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_241_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_242]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_242_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_243]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_243_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_244]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_244_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_246]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_246_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_247]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_247_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_248]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_248_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_249]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_249_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_251]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_251_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_252]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_252_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_253]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_253_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_254]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_254_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_256]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_256_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_257]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_257_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_258]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_258_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_259]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_259_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_261]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_261_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_262]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_262_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_263]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_263_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_264]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_264_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_266]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_266_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_267]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_267_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_268]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_268_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_269]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_269_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_271]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_271_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_272]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_272_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_273]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_273_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_274]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_274_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_276]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_276_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_277]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_277_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_278]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_278_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_279]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_279_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_281]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_281_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_282]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_282_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_283]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_283_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_284]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_284_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_286]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_286_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_287]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_287_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_288]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_288_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_289]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_289_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_291]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_291_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_292]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_292_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_293]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_293_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_294]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_294_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_296]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_296_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_297]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_297_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_298]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_298_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_299]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_299_NC(MCEventInfo info){
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
		else if (ne == DispRsltTable) doDispRslt_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_except_oth_flg) doCnd_except_oth_flg_NE(info);
		else if (ne == Cnd_repurc_obli_typ) doCnd_repurc_obli_typ_NE(info);
		else if (ne == Cnd_repurc_obli_typ_nm) doCnd_repurc_obli_typ_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
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
		else if (ne == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NE(info);
		else if (ne == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NE(info);
		else if (ne == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NE(info);
		else if (ne == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NE(info);
		else if (ne == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NE(info);
		else if (ne == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NE(info);
		else if (ne == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NE(info);
		else if (ne == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NE(info);
		else if (ne == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NE(info);
		else if (ne == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NE(info);
		else if (ne == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NE(info);
		else if (ne == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NE(info);
		else if (ne == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NE(info);
		else if (ne == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NE(info);
		else if (ne == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NE(info);
		else if (ne == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NE(info);
		else if (ne == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NE(info);
		else if (ne == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NE(info);
		else if (ne == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NE(info);
		else if (ne == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NE(info);
		else if (ne == LPnl_disp_std) doLPnl_disp_std_NE(info);
		else if (ne == LPnl_disp_unit) doLPnl_disp_unit_NE(info);
		else if (ne == LPnl_disp_ave_upri) doLPnl_disp_ave_upri_NE(info);
		else if (ne == LPnl_disp_ave_unit) doLPnl_disp_ave_unit_NE(info);
		else if (ne == LPnl_disp_std_upri) doLPnl_disp_std_upri_NE(info);
		else if (ne == LPnl_disp_std_unit) doLPnl_disp_std_unit_NE(info);
		else if (ne == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NE(info);
		else if (ne == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NE(info);
		else if (ne == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ) doDispRslt_itm_typ_NE(info);
		else if (ne == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NE(info);
		else if (ne == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NE(info);
		else if (ne == columnDispRslt_lot_no) doDispRslt_lot_no_NE(info);
		else if (ne == columnDispRslt_sublot_no) doDispRslt_sublot_no_NE(info);
		else if (ne == columnDispRslt_sno1) doDispRslt_sno1_NE(info);
		else if (ne == columnDispRslt_sno2) doDispRslt_sno2_NE(info);
		else if (ne == columnDispRslt_sno3) doDispRslt_sno3_NE(info);
		else if (ne == columnDispRslt_sno4) doDispRslt_sno4_NE(info);
		else if (ne == columnDispRslt_sppl_cd) doDispRslt_sppl_cd_NE(info);
		else if (ne == columnDispRslt_sppl_nm) doDispRslt_sppl_nm_NE(info);
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_repurc_obli_flg) doDispRslt_repurc_obli_flg_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
		else if (ne == columnDispRslt_col_001) doDispRslt_col_001_NE(info);
		else if (ne == columnDispRslt_col_002) doDispRslt_col_002_NE(info);
		else if (ne == columnDispRslt_col_003) doDispRslt_col_003_NE(info);
		else if (ne == columnDispRslt_col_004) doDispRslt_col_004_NE(info);
		else if (ne == columnDispRslt_col_006) doDispRslt_col_006_NE(info);
		else if (ne == columnDispRslt_col_007) doDispRslt_col_007_NE(info);
		else if (ne == columnDispRslt_col_008) doDispRslt_col_008_NE(info);
		else if (ne == columnDispRslt_col_009) doDispRslt_col_009_NE(info);
		else if (ne == columnDispRslt_col_011) doDispRslt_col_011_NE(info);
		else if (ne == columnDispRslt_col_012) doDispRslt_col_012_NE(info);
		else if (ne == columnDispRslt_col_013) doDispRslt_col_013_NE(info);
		else if (ne == columnDispRslt_col_014) doDispRslt_col_014_NE(info);
		else if (ne == columnDispRslt_col_016) doDispRslt_col_016_NE(info);
		else if (ne == columnDispRslt_col_017) doDispRslt_col_017_NE(info);
		else if (ne == columnDispRslt_col_018) doDispRslt_col_018_NE(info);
		else if (ne == columnDispRslt_col_019) doDispRslt_col_019_NE(info);
		else if (ne == columnDispRslt_col_021) doDispRslt_col_021_NE(info);
		else if (ne == columnDispRslt_col_022) doDispRslt_col_022_NE(info);
		else if (ne == columnDispRslt_col_023) doDispRslt_col_023_NE(info);
		else if (ne == columnDispRslt_col_024) doDispRslt_col_024_NE(info);
		else if (ne == columnDispRslt_col_026) doDispRslt_col_026_NE(info);
		else if (ne == columnDispRslt_col_027) doDispRslt_col_027_NE(info);
		else if (ne == columnDispRslt_col_028) doDispRslt_col_028_NE(info);
		else if (ne == columnDispRslt_col_029) doDispRslt_col_029_NE(info);
		else if (ne == columnDispRslt_col_031) doDispRslt_col_031_NE(info);
		else if (ne == columnDispRslt_col_032) doDispRslt_col_032_NE(info);
		else if (ne == columnDispRslt_col_033) doDispRslt_col_033_NE(info);
		else if (ne == columnDispRslt_col_034) doDispRslt_col_034_NE(info);
		else if (ne == columnDispRslt_col_036) doDispRslt_col_036_NE(info);
		else if (ne == columnDispRslt_col_037) doDispRslt_col_037_NE(info);
		else if (ne == columnDispRslt_col_038) doDispRslt_col_038_NE(info);
		else if (ne == columnDispRslt_col_039) doDispRslt_col_039_NE(info);
		else if (ne == columnDispRslt_col_041) doDispRslt_col_041_NE(info);
		else if (ne == columnDispRslt_col_042) doDispRslt_col_042_NE(info);
		else if (ne == columnDispRslt_col_043) doDispRslt_col_043_NE(info);
		else if (ne == columnDispRslt_col_044) doDispRslt_col_044_NE(info);
		else if (ne == columnDispRslt_col_046) doDispRslt_col_046_NE(info);
		else if (ne == columnDispRslt_col_047) doDispRslt_col_047_NE(info);
		else if (ne == columnDispRslt_col_048) doDispRslt_col_048_NE(info);
		else if (ne == columnDispRslt_col_049) doDispRslt_col_049_NE(info);
		else if (ne == columnDispRslt_col_051) doDispRslt_col_051_NE(info);
		else if (ne == columnDispRslt_col_052) doDispRslt_col_052_NE(info);
		else if (ne == columnDispRslt_col_053) doDispRslt_col_053_NE(info);
		else if (ne == columnDispRslt_col_054) doDispRslt_col_054_NE(info);
		else if (ne == columnDispRslt_col_056) doDispRslt_col_056_NE(info);
		else if (ne == columnDispRslt_col_057) doDispRslt_col_057_NE(info);
		else if (ne == columnDispRslt_col_058) doDispRslt_col_058_NE(info);
		else if (ne == columnDispRslt_col_059) doDispRslt_col_059_NE(info);
		else if (ne == columnDispRslt_col_061) doDispRslt_col_061_NE(info);
		else if (ne == columnDispRslt_col_062) doDispRslt_col_062_NE(info);
		else if (ne == columnDispRslt_col_063) doDispRslt_col_063_NE(info);
		else if (ne == columnDispRslt_col_064) doDispRslt_col_064_NE(info);
		else if (ne == columnDispRslt_col_066) doDispRslt_col_066_NE(info);
		else if (ne == columnDispRslt_col_067) doDispRslt_col_067_NE(info);
		else if (ne == columnDispRslt_col_068) doDispRslt_col_068_NE(info);
		else if (ne == columnDispRslt_col_069) doDispRslt_col_069_NE(info);
		else if (ne == columnDispRslt_col_071) doDispRslt_col_071_NE(info);
		else if (ne == columnDispRslt_col_072) doDispRslt_col_072_NE(info);
		else if (ne == columnDispRslt_col_073) doDispRslt_col_073_NE(info);
		else if (ne == columnDispRslt_col_074) doDispRslt_col_074_NE(info);
		else if (ne == columnDispRslt_col_076) doDispRslt_col_076_NE(info);
		else if (ne == columnDispRslt_col_077) doDispRslt_col_077_NE(info);
		else if (ne == columnDispRslt_col_078) doDispRslt_col_078_NE(info);
		else if (ne == columnDispRslt_col_079) doDispRslt_col_079_NE(info);
		else if (ne == columnDispRslt_col_081) doDispRslt_col_081_NE(info);
		else if (ne == columnDispRslt_col_082) doDispRslt_col_082_NE(info);
		else if (ne == columnDispRslt_col_083) doDispRslt_col_083_NE(info);
		else if (ne == columnDispRslt_col_084) doDispRslt_col_084_NE(info);
		else if (ne == columnDispRslt_col_086) doDispRslt_col_086_NE(info);
		else if (ne == columnDispRslt_col_087) doDispRslt_col_087_NE(info);
		else if (ne == columnDispRslt_col_088) doDispRslt_col_088_NE(info);
		else if (ne == columnDispRslt_col_089) doDispRslt_col_089_NE(info);
		else if (ne == columnDispRslt_col_091) doDispRslt_col_091_NE(info);
		else if (ne == columnDispRslt_col_092) doDispRslt_col_092_NE(info);
		else if (ne == columnDispRslt_col_093) doDispRslt_col_093_NE(info);
		else if (ne == columnDispRslt_col_094) doDispRslt_col_094_NE(info);
		else if (ne == columnDispRslt_col_096) doDispRslt_col_096_NE(info);
		else if (ne == columnDispRslt_col_097) doDispRslt_col_097_NE(info);
		else if (ne == columnDispRslt_col_098) doDispRslt_col_098_NE(info);
		else if (ne == columnDispRslt_col_099) doDispRslt_col_099_NE(info);
		else if (ne == columnDispRslt_col_101) doDispRslt_col_101_NE(info);
		else if (ne == columnDispRslt_col_102) doDispRslt_col_102_NE(info);
		else if (ne == columnDispRslt_col_103) doDispRslt_col_103_NE(info);
		else if (ne == columnDispRslt_col_104) doDispRslt_col_104_NE(info);
		else if (ne == columnDispRslt_col_106) doDispRslt_col_106_NE(info);
		else if (ne == columnDispRslt_col_107) doDispRslt_col_107_NE(info);
		else if (ne == columnDispRslt_col_108) doDispRslt_col_108_NE(info);
		else if (ne == columnDispRslt_col_109) doDispRslt_col_109_NE(info);
		else if (ne == columnDispRslt_col_111) doDispRslt_col_111_NE(info);
		else if (ne == columnDispRslt_col_112) doDispRslt_col_112_NE(info);
		else if (ne == columnDispRslt_col_113) doDispRslt_col_113_NE(info);
		else if (ne == columnDispRslt_col_114) doDispRslt_col_114_NE(info);
		else if (ne == columnDispRslt_col_116) doDispRslt_col_116_NE(info);
		else if (ne == columnDispRslt_col_117) doDispRslt_col_117_NE(info);
		else if (ne == columnDispRslt_col_118) doDispRslt_col_118_NE(info);
		else if (ne == columnDispRslt_col_119) doDispRslt_col_119_NE(info);
		else if (ne == columnDispRslt_col_121) doDispRslt_col_121_NE(info);
		else if (ne == columnDispRslt_col_122) doDispRslt_col_122_NE(info);
		else if (ne == columnDispRslt_col_123) doDispRslt_col_123_NE(info);
		else if (ne == columnDispRslt_col_124) doDispRslt_col_124_NE(info);
		else if (ne == columnDispRslt_col_126) doDispRslt_col_126_NE(info);
		else if (ne == columnDispRslt_col_127) doDispRslt_col_127_NE(info);
		else if (ne == columnDispRslt_col_128) doDispRslt_col_128_NE(info);
		else if (ne == columnDispRslt_col_129) doDispRslt_col_129_NE(info);
		else if (ne == columnDispRslt_col_131) doDispRslt_col_131_NE(info);
		else if (ne == columnDispRslt_col_132) doDispRslt_col_132_NE(info);
		else if (ne == columnDispRslt_col_133) doDispRslt_col_133_NE(info);
		else if (ne == columnDispRslt_col_134) doDispRslt_col_134_NE(info);
		else if (ne == columnDispRslt_col_136) doDispRslt_col_136_NE(info);
		else if (ne == columnDispRslt_col_137) doDispRslt_col_137_NE(info);
		else if (ne == columnDispRslt_col_138) doDispRslt_col_138_NE(info);
		else if (ne == columnDispRslt_col_139) doDispRslt_col_139_NE(info);
		else if (ne == columnDispRslt_col_141) doDispRslt_col_141_NE(info);
		else if (ne == columnDispRslt_col_142) doDispRslt_col_142_NE(info);
		else if (ne == columnDispRslt_col_143) doDispRslt_col_143_NE(info);
		else if (ne == columnDispRslt_col_144) doDispRslt_col_144_NE(info);
		else if (ne == columnDispRslt_col_146) doDispRslt_col_146_NE(info);
		else if (ne == columnDispRslt_col_147) doDispRslt_col_147_NE(info);
		else if (ne == columnDispRslt_col_148) doDispRslt_col_148_NE(info);
		else if (ne == columnDispRslt_col_149) doDispRslt_col_149_NE(info);
		else if (ne == columnDispRslt_col_151) doDispRslt_col_151_NE(info);
		else if (ne == columnDispRslt_col_152) doDispRslt_col_152_NE(info);
		else if (ne == columnDispRslt_col_153) doDispRslt_col_153_NE(info);
		else if (ne == columnDispRslt_col_154) doDispRslt_col_154_NE(info);
		else if (ne == columnDispRslt_col_156) doDispRslt_col_156_NE(info);
		else if (ne == columnDispRslt_col_157) doDispRslt_col_157_NE(info);
		else if (ne == columnDispRslt_col_158) doDispRslt_col_158_NE(info);
		else if (ne == columnDispRslt_col_159) doDispRslt_col_159_NE(info);
		else if (ne == columnDispRslt_col_161) doDispRslt_col_161_NE(info);
		else if (ne == columnDispRslt_col_162) doDispRslt_col_162_NE(info);
		else if (ne == columnDispRslt_col_163) doDispRslt_col_163_NE(info);
		else if (ne == columnDispRslt_col_164) doDispRslt_col_164_NE(info);
		else if (ne == columnDispRslt_col_166) doDispRslt_col_166_NE(info);
		else if (ne == columnDispRslt_col_167) doDispRslt_col_167_NE(info);
		else if (ne == columnDispRslt_col_168) doDispRslt_col_168_NE(info);
		else if (ne == columnDispRslt_col_169) doDispRslt_col_169_NE(info);
		else if (ne == columnDispRslt_col_171) doDispRslt_col_171_NE(info);
		else if (ne == columnDispRslt_col_172) doDispRslt_col_172_NE(info);
		else if (ne == columnDispRslt_col_173) doDispRslt_col_173_NE(info);
		else if (ne == columnDispRslt_col_174) doDispRslt_col_174_NE(info);
		else if (ne == columnDispRslt_col_176) doDispRslt_col_176_NE(info);
		else if (ne == columnDispRslt_col_177) doDispRslt_col_177_NE(info);
		else if (ne == columnDispRslt_col_178) doDispRslt_col_178_NE(info);
		else if (ne == columnDispRslt_col_179) doDispRslt_col_179_NE(info);
		else if (ne == columnDispRslt_col_181) doDispRslt_col_181_NE(info);
		else if (ne == columnDispRslt_col_182) doDispRslt_col_182_NE(info);
		else if (ne == columnDispRslt_col_183) doDispRslt_col_183_NE(info);
		else if (ne == columnDispRslt_col_184) doDispRslt_col_184_NE(info);
		else if (ne == columnDispRslt_col_186) doDispRslt_col_186_NE(info);
		else if (ne == columnDispRslt_col_187) doDispRslt_col_187_NE(info);
		else if (ne == columnDispRslt_col_188) doDispRslt_col_188_NE(info);
		else if (ne == columnDispRslt_col_189) doDispRslt_col_189_NE(info);
		else if (ne == columnDispRslt_col_191) doDispRslt_col_191_NE(info);
		else if (ne == columnDispRslt_col_192) doDispRslt_col_192_NE(info);
		else if (ne == columnDispRslt_col_193) doDispRslt_col_193_NE(info);
		else if (ne == columnDispRslt_col_194) doDispRslt_col_194_NE(info);
		else if (ne == columnDispRslt_col_196) doDispRslt_col_196_NE(info);
		else if (ne == columnDispRslt_col_197) doDispRslt_col_197_NE(info);
		else if (ne == columnDispRslt_col_198) doDispRslt_col_198_NE(info);
		else if (ne == columnDispRslt_col_199) doDispRslt_col_199_NE(info);
		else if (ne == columnDispRslt_col_201) doDispRslt_col_201_NE(info);
		else if (ne == columnDispRslt_col_202) doDispRslt_col_202_NE(info);
		else if (ne == columnDispRslt_col_203) doDispRslt_col_203_NE(info);
		else if (ne == columnDispRslt_col_204) doDispRslt_col_204_NE(info);
		else if (ne == columnDispRslt_col_206) doDispRslt_col_206_NE(info);
		else if (ne == columnDispRslt_col_207) doDispRslt_col_207_NE(info);
		else if (ne == columnDispRslt_col_208) doDispRslt_col_208_NE(info);
		else if (ne == columnDispRslt_col_209) doDispRslt_col_209_NE(info);
		else if (ne == columnDispRslt_col_211) doDispRslt_col_211_NE(info);
		else if (ne == columnDispRslt_col_212) doDispRslt_col_212_NE(info);
		else if (ne == columnDispRslt_col_213) doDispRslt_col_213_NE(info);
		else if (ne == columnDispRslt_col_214) doDispRslt_col_214_NE(info);
		else if (ne == columnDispRslt_col_216) doDispRslt_col_216_NE(info);
		else if (ne == columnDispRslt_col_217) doDispRslt_col_217_NE(info);
		else if (ne == columnDispRslt_col_218) doDispRslt_col_218_NE(info);
		else if (ne == columnDispRslt_col_219) doDispRslt_col_219_NE(info);
		else if (ne == columnDispRslt_col_221) doDispRslt_col_221_NE(info);
		else if (ne == columnDispRslt_col_222) doDispRslt_col_222_NE(info);
		else if (ne == columnDispRslt_col_223) doDispRslt_col_223_NE(info);
		else if (ne == columnDispRslt_col_224) doDispRslt_col_224_NE(info);
		else if (ne == columnDispRslt_col_226) doDispRslt_col_226_NE(info);
		else if (ne == columnDispRslt_col_227) doDispRslt_col_227_NE(info);
		else if (ne == columnDispRslt_col_228) doDispRslt_col_228_NE(info);
		else if (ne == columnDispRslt_col_229) doDispRslt_col_229_NE(info);
		else if (ne == columnDispRslt_col_231) doDispRslt_col_231_NE(info);
		else if (ne == columnDispRslt_col_232) doDispRslt_col_232_NE(info);
		else if (ne == columnDispRslt_col_233) doDispRslt_col_233_NE(info);
		else if (ne == columnDispRslt_col_234) doDispRslt_col_234_NE(info);
		else if (ne == columnDispRslt_col_236) doDispRslt_col_236_NE(info);
		else if (ne == columnDispRslt_col_237) doDispRslt_col_237_NE(info);
		else if (ne == columnDispRslt_col_238) doDispRslt_col_238_NE(info);
		else if (ne == columnDispRslt_col_239) doDispRslt_col_239_NE(info);
		else if (ne == columnDispRslt_col_241) doDispRslt_col_241_NE(info);
		else if (ne == columnDispRslt_col_242) doDispRslt_col_242_NE(info);
		else if (ne == columnDispRslt_col_243) doDispRslt_col_243_NE(info);
		else if (ne == columnDispRslt_col_244) doDispRslt_col_244_NE(info);
		else if (ne == columnDispRslt_col_246) doDispRslt_col_246_NE(info);
		else if (ne == columnDispRslt_col_247) doDispRslt_col_247_NE(info);
		else if (ne == columnDispRslt_col_248) doDispRslt_col_248_NE(info);
		else if (ne == columnDispRslt_col_249) doDispRslt_col_249_NE(info);
		else if (ne == columnDispRslt_col_251) doDispRslt_col_251_NE(info);
		else if (ne == columnDispRslt_col_252) doDispRslt_col_252_NE(info);
		else if (ne == columnDispRslt_col_253) doDispRslt_col_253_NE(info);
		else if (ne == columnDispRslt_col_254) doDispRslt_col_254_NE(info);
		else if (ne == columnDispRslt_col_256) doDispRslt_col_256_NE(info);
		else if (ne == columnDispRslt_col_257) doDispRslt_col_257_NE(info);
		else if (ne == columnDispRslt_col_258) doDispRslt_col_258_NE(info);
		else if (ne == columnDispRslt_col_259) doDispRslt_col_259_NE(info);
		else if (ne == columnDispRslt_col_261) doDispRslt_col_261_NE(info);
		else if (ne == columnDispRslt_col_262) doDispRslt_col_262_NE(info);
		else if (ne == columnDispRslt_col_263) doDispRslt_col_263_NE(info);
		else if (ne == columnDispRslt_col_264) doDispRslt_col_264_NE(info);
		else if (ne == columnDispRslt_col_266) doDispRslt_col_266_NE(info);
		else if (ne == columnDispRslt_col_267) doDispRslt_col_267_NE(info);
		else if (ne == columnDispRslt_col_268) doDispRslt_col_268_NE(info);
		else if (ne == columnDispRslt_col_269) doDispRslt_col_269_NE(info);
		else if (ne == columnDispRslt_col_271) doDispRslt_col_271_NE(info);
		else if (ne == columnDispRslt_col_272) doDispRslt_col_272_NE(info);
		else if (ne == columnDispRslt_col_273) doDispRslt_col_273_NE(info);
		else if (ne == columnDispRslt_col_274) doDispRslt_col_274_NE(info);
		else if (ne == columnDispRslt_col_276) doDispRslt_col_276_NE(info);
		else if (ne == columnDispRslt_col_277) doDispRslt_col_277_NE(info);
		else if (ne == columnDispRslt_col_278) doDispRslt_col_278_NE(info);
		else if (ne == columnDispRslt_col_279) doDispRslt_col_279_NE(info);
		else if (ne == columnDispRslt_col_281) doDispRslt_col_281_NE(info);
		else if (ne == columnDispRslt_col_282) doDispRslt_col_282_NE(info);
		else if (ne == columnDispRslt_col_283) doDispRslt_col_283_NE(info);
		else if (ne == columnDispRslt_col_284) doDispRslt_col_284_NE(info);
		else if (ne == columnDispRslt_col_286) doDispRslt_col_286_NE(info);
		else if (ne == columnDispRslt_col_287) doDispRslt_col_287_NE(info);
		else if (ne == columnDispRslt_col_288) doDispRslt_col_288_NE(info);
		else if (ne == columnDispRslt_col_289) doDispRslt_col_289_NE(info);
		else if (ne == columnDispRslt_col_291) doDispRslt_col_291_NE(info);
		else if (ne == columnDispRslt_col_292) doDispRslt_col_292_NE(info);
		else if (ne == columnDispRslt_col_293) doDispRslt_col_293_NE(info);
		else if (ne == columnDispRslt_col_294) doDispRslt_col_294_NE(info);
		else if (ne == columnDispRslt_col_296) doDispRslt_col_296_NE(info);
		else if (ne == columnDispRslt_col_297) doDispRslt_col_297_NE(info);
		else if (ne == columnDispRslt_col_298) doDispRslt_col_298_NE(info);
		else if (ne == columnDispRslt_col_299) doDispRslt_col_299_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_oth_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_oth_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[no_sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_unit_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_upri_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_unit_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_upri_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_unit_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_122]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_122_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_123]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_123_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_124]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_124_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_126]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_126_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_127]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_127_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_128]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_128_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_129]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_129_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_131]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_131_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_132]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_132_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_133]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_133_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_134]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_134_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_136]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_136_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_137]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_137_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_138]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_138_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_139]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_139_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_141]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_141_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_142]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_142_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_143]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_143_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_144]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_144_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_146]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_146_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_147]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_147_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_148]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_148_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_149]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_149_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_151]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_151_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_152]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_152_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_153]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_153_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_154]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_154_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_156]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_156_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_157]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_157_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_158]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_158_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_159]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_159_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_161]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_161_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_162]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_162_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_163]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_163_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_164]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_164_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_166]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_166_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_167]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_167_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_168]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_168_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_169]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_169_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_171]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_171_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_172]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_172_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_173]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_173_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_174]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_174_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_176]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_176_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_177]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_177_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_178]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_178_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_179]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_179_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_181]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_181_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_182]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_182_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_183]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_183_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_184]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_184_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_186]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_186_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_187]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_187_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_188]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_188_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_189]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_189_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_191]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_191_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_192]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_192_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_193]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_193_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_194]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_194_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_196]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_196_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_197]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_197_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_198]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_198_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_199]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_199_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_201]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_201_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_202]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_202_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_203]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_203_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_204]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_204_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_206]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_206_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_207]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_207_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_208]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_208_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_209]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_209_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_211]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_211_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_212]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_212_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_213]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_213_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_214]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_214_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_216]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_216_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_217]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_217_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_218]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_218_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_219]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_219_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_221]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_221_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_222]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_222_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_223]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_223_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_224]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_224_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_226]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_226_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_227]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_227_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_228]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_228_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_229]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_229_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_231]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_231_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_232]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_232_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_233]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_233_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_234]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_234_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_236]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_236_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_237]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_237_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_238]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_238_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_239]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_239_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_241]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_241_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_242]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_242_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_243]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_243_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_244]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_244_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_246]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_246_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_247]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_247_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_248]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_248_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_249]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_249_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_251]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_251_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_252]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_252_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_253]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_253_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_254]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_254_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_256]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_256_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_257]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_257_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_258]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_258_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_259]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_259_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_261]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_261_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_262]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_262_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_263]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_263_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_264]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_264_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_266]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_266_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_267]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_267_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_268]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_268_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_269]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_269_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_271]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_271_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_272]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_272_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_273]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_273_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_274]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_274_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_276]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_276_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_277]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_277_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_278]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_278_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_279]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_279_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_281]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_281_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_282]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_282_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_283]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_283_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_284]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_284_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_286]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_286_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_287]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_287_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_288]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_288_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_289]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_289_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_291]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_291_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_292]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_292_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_293]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_293_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_294]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_294_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_296]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_296_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_297]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_297_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_298]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_298_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_299]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_299_NE(MCEventInfo info){
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
		else if (nx == DispRsltTable) doDispRslt_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_except_oth_flg) doCnd_except_oth_flg_NX(info);
		else if (nx == Cnd_repurc_obli_typ) doCnd_repurc_obli_typ_NX(info);
		else if (nx == Cnd_repurc_obli_typ_nm) doCnd_repurc_obli_typ_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
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
		else if (nx == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NX(info);
		else if (nx == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NX(info);
		else if (nx == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NX(info);
		else if (nx == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NX(info);
		else if (nx == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NX(info);
		else if (nx == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NX(info);
		else if (nx == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NX(info);
		else if (nx == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NX(info);
		else if (nx == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NX(info);
		else if (nx == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NX(info);
		else if (nx == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NX(info);
		else if (nx == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NX(info);
		else if (nx == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NX(info);
		else if (nx == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NX(info);
		else if (nx == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NX(info);
		else if (nx == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NX(info);
		else if (nx == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NX(info);
		else if (nx == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NX(info);
		else if (nx == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NX(info);
		else if (nx == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NX(info);
		else if (nx == LPnl_disp_std) doLPnl_disp_std_NX(info);
		else if (nx == LPnl_disp_unit) doLPnl_disp_unit_NX(info);
		else if (nx == LPnl_disp_ave_upri) doLPnl_disp_ave_upri_NX(info);
		else if (nx == LPnl_disp_ave_unit) doLPnl_disp_ave_unit_NX(info);
		else if (nx == LPnl_disp_std_upri) doLPnl_disp_std_upri_NX(info);
		else if (nx == LPnl_disp_std_unit) doLPnl_disp_std_unit_NX(info);
		else if (nx == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NX(info);
		else if (nx == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NX(info);
		else if (nx == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ) doDispRslt_itm_typ_NX(info);
		else if (nx == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NX(info);
		else if (nx == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NX(info);
		else if (nx == columnDispRslt_lot_no) doDispRslt_lot_no_NX(info);
		else if (nx == columnDispRslt_sublot_no) doDispRslt_sublot_no_NX(info);
		else if (nx == columnDispRslt_sno1) doDispRslt_sno1_NX(info);
		else if (nx == columnDispRslt_sno2) doDispRslt_sno2_NX(info);
		else if (nx == columnDispRslt_sno3) doDispRslt_sno3_NX(info);
		else if (nx == columnDispRslt_sno4) doDispRslt_sno4_NX(info);
		else if (nx == columnDispRslt_sppl_cd) doDispRslt_sppl_cd_NX(info);
		else if (nx == columnDispRslt_sppl_nm) doDispRslt_sppl_nm_NX(info);
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_repurc_obli_flg) doDispRslt_repurc_obli_flg_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
		else if (nx == columnDispRslt_col_001) doDispRslt_col_001_NX(info);
		else if (nx == columnDispRslt_col_002) doDispRslt_col_002_NX(info);
		else if (nx == columnDispRslt_col_003) doDispRslt_col_003_NX(info);
		else if (nx == columnDispRslt_col_004) doDispRslt_col_004_NX(info);
		else if (nx == columnDispRslt_col_006) doDispRslt_col_006_NX(info);
		else if (nx == columnDispRslt_col_007) doDispRslt_col_007_NX(info);
		else if (nx == columnDispRslt_col_008) doDispRslt_col_008_NX(info);
		else if (nx == columnDispRslt_col_009) doDispRslt_col_009_NX(info);
		else if (nx == columnDispRslt_col_011) doDispRslt_col_011_NX(info);
		else if (nx == columnDispRslt_col_012) doDispRslt_col_012_NX(info);
		else if (nx == columnDispRslt_col_013) doDispRslt_col_013_NX(info);
		else if (nx == columnDispRslt_col_014) doDispRslt_col_014_NX(info);
		else if (nx == columnDispRslt_col_016) doDispRslt_col_016_NX(info);
		else if (nx == columnDispRslt_col_017) doDispRslt_col_017_NX(info);
		else if (nx == columnDispRslt_col_018) doDispRslt_col_018_NX(info);
		else if (nx == columnDispRslt_col_019) doDispRslt_col_019_NX(info);
		else if (nx == columnDispRslt_col_021) doDispRslt_col_021_NX(info);
		else if (nx == columnDispRslt_col_022) doDispRslt_col_022_NX(info);
		else if (nx == columnDispRslt_col_023) doDispRslt_col_023_NX(info);
		else if (nx == columnDispRslt_col_024) doDispRslt_col_024_NX(info);
		else if (nx == columnDispRslt_col_026) doDispRslt_col_026_NX(info);
		else if (nx == columnDispRslt_col_027) doDispRslt_col_027_NX(info);
		else if (nx == columnDispRslt_col_028) doDispRslt_col_028_NX(info);
		else if (nx == columnDispRslt_col_029) doDispRslt_col_029_NX(info);
		else if (nx == columnDispRslt_col_031) doDispRslt_col_031_NX(info);
		else if (nx == columnDispRslt_col_032) doDispRslt_col_032_NX(info);
		else if (nx == columnDispRslt_col_033) doDispRslt_col_033_NX(info);
		else if (nx == columnDispRslt_col_034) doDispRslt_col_034_NX(info);
		else if (nx == columnDispRslt_col_036) doDispRslt_col_036_NX(info);
		else if (nx == columnDispRslt_col_037) doDispRslt_col_037_NX(info);
		else if (nx == columnDispRslt_col_038) doDispRslt_col_038_NX(info);
		else if (nx == columnDispRslt_col_039) doDispRslt_col_039_NX(info);
		else if (nx == columnDispRslt_col_041) doDispRslt_col_041_NX(info);
		else if (nx == columnDispRslt_col_042) doDispRslt_col_042_NX(info);
		else if (nx == columnDispRslt_col_043) doDispRslt_col_043_NX(info);
		else if (nx == columnDispRslt_col_044) doDispRslt_col_044_NX(info);
		else if (nx == columnDispRslt_col_046) doDispRslt_col_046_NX(info);
		else if (nx == columnDispRslt_col_047) doDispRslt_col_047_NX(info);
		else if (nx == columnDispRslt_col_048) doDispRslt_col_048_NX(info);
		else if (nx == columnDispRslt_col_049) doDispRslt_col_049_NX(info);
		else if (nx == columnDispRslt_col_051) doDispRslt_col_051_NX(info);
		else if (nx == columnDispRslt_col_052) doDispRslt_col_052_NX(info);
		else if (nx == columnDispRslt_col_053) doDispRslt_col_053_NX(info);
		else if (nx == columnDispRslt_col_054) doDispRslt_col_054_NX(info);
		else if (nx == columnDispRslt_col_056) doDispRslt_col_056_NX(info);
		else if (nx == columnDispRslt_col_057) doDispRslt_col_057_NX(info);
		else if (nx == columnDispRslt_col_058) doDispRslt_col_058_NX(info);
		else if (nx == columnDispRslt_col_059) doDispRslt_col_059_NX(info);
		else if (nx == columnDispRslt_col_061) doDispRslt_col_061_NX(info);
		else if (nx == columnDispRslt_col_062) doDispRslt_col_062_NX(info);
		else if (nx == columnDispRslt_col_063) doDispRslt_col_063_NX(info);
		else if (nx == columnDispRslt_col_064) doDispRslt_col_064_NX(info);
		else if (nx == columnDispRslt_col_066) doDispRslt_col_066_NX(info);
		else if (nx == columnDispRslt_col_067) doDispRslt_col_067_NX(info);
		else if (nx == columnDispRslt_col_068) doDispRslt_col_068_NX(info);
		else if (nx == columnDispRslt_col_069) doDispRslt_col_069_NX(info);
		else if (nx == columnDispRslt_col_071) doDispRslt_col_071_NX(info);
		else if (nx == columnDispRslt_col_072) doDispRslt_col_072_NX(info);
		else if (nx == columnDispRslt_col_073) doDispRslt_col_073_NX(info);
		else if (nx == columnDispRslt_col_074) doDispRslt_col_074_NX(info);
		else if (nx == columnDispRslt_col_076) doDispRslt_col_076_NX(info);
		else if (nx == columnDispRslt_col_077) doDispRslt_col_077_NX(info);
		else if (nx == columnDispRslt_col_078) doDispRslt_col_078_NX(info);
		else if (nx == columnDispRslt_col_079) doDispRslt_col_079_NX(info);
		else if (nx == columnDispRslt_col_081) doDispRslt_col_081_NX(info);
		else if (nx == columnDispRslt_col_082) doDispRslt_col_082_NX(info);
		else if (nx == columnDispRslt_col_083) doDispRslt_col_083_NX(info);
		else if (nx == columnDispRslt_col_084) doDispRslt_col_084_NX(info);
		else if (nx == columnDispRslt_col_086) doDispRslt_col_086_NX(info);
		else if (nx == columnDispRslt_col_087) doDispRslt_col_087_NX(info);
		else if (nx == columnDispRslt_col_088) doDispRslt_col_088_NX(info);
		else if (nx == columnDispRslt_col_089) doDispRslt_col_089_NX(info);
		else if (nx == columnDispRslt_col_091) doDispRslt_col_091_NX(info);
		else if (nx == columnDispRslt_col_092) doDispRslt_col_092_NX(info);
		else if (nx == columnDispRslt_col_093) doDispRslt_col_093_NX(info);
		else if (nx == columnDispRslt_col_094) doDispRslt_col_094_NX(info);
		else if (nx == columnDispRslt_col_096) doDispRslt_col_096_NX(info);
		else if (nx == columnDispRslt_col_097) doDispRslt_col_097_NX(info);
		else if (nx == columnDispRslt_col_098) doDispRslt_col_098_NX(info);
		else if (nx == columnDispRslt_col_099) doDispRslt_col_099_NX(info);
		else if (nx == columnDispRslt_col_101) doDispRslt_col_101_NX(info);
		else if (nx == columnDispRslt_col_102) doDispRslt_col_102_NX(info);
		else if (nx == columnDispRslt_col_103) doDispRslt_col_103_NX(info);
		else if (nx == columnDispRslt_col_104) doDispRslt_col_104_NX(info);
		else if (nx == columnDispRslt_col_106) doDispRslt_col_106_NX(info);
		else if (nx == columnDispRslt_col_107) doDispRslt_col_107_NX(info);
		else if (nx == columnDispRslt_col_108) doDispRslt_col_108_NX(info);
		else if (nx == columnDispRslt_col_109) doDispRslt_col_109_NX(info);
		else if (nx == columnDispRslt_col_111) doDispRslt_col_111_NX(info);
		else if (nx == columnDispRslt_col_112) doDispRslt_col_112_NX(info);
		else if (nx == columnDispRslt_col_113) doDispRslt_col_113_NX(info);
		else if (nx == columnDispRslt_col_114) doDispRslt_col_114_NX(info);
		else if (nx == columnDispRslt_col_116) doDispRslt_col_116_NX(info);
		else if (nx == columnDispRslt_col_117) doDispRslt_col_117_NX(info);
		else if (nx == columnDispRslt_col_118) doDispRslt_col_118_NX(info);
		else if (nx == columnDispRslt_col_119) doDispRslt_col_119_NX(info);
		else if (nx == columnDispRslt_col_121) doDispRslt_col_121_NX(info);
		else if (nx == columnDispRslt_col_122) doDispRslt_col_122_NX(info);
		else if (nx == columnDispRslt_col_123) doDispRslt_col_123_NX(info);
		else if (nx == columnDispRslt_col_124) doDispRslt_col_124_NX(info);
		else if (nx == columnDispRslt_col_126) doDispRslt_col_126_NX(info);
		else if (nx == columnDispRslt_col_127) doDispRslt_col_127_NX(info);
		else if (nx == columnDispRslt_col_128) doDispRslt_col_128_NX(info);
		else if (nx == columnDispRslt_col_129) doDispRslt_col_129_NX(info);
		else if (nx == columnDispRslt_col_131) doDispRslt_col_131_NX(info);
		else if (nx == columnDispRslt_col_132) doDispRslt_col_132_NX(info);
		else if (nx == columnDispRslt_col_133) doDispRslt_col_133_NX(info);
		else if (nx == columnDispRslt_col_134) doDispRslt_col_134_NX(info);
		else if (nx == columnDispRslt_col_136) doDispRslt_col_136_NX(info);
		else if (nx == columnDispRslt_col_137) doDispRslt_col_137_NX(info);
		else if (nx == columnDispRslt_col_138) doDispRslt_col_138_NX(info);
		else if (nx == columnDispRslt_col_139) doDispRslt_col_139_NX(info);
		else if (nx == columnDispRslt_col_141) doDispRslt_col_141_NX(info);
		else if (nx == columnDispRslt_col_142) doDispRslt_col_142_NX(info);
		else if (nx == columnDispRslt_col_143) doDispRslt_col_143_NX(info);
		else if (nx == columnDispRslt_col_144) doDispRslt_col_144_NX(info);
		else if (nx == columnDispRslt_col_146) doDispRslt_col_146_NX(info);
		else if (nx == columnDispRslt_col_147) doDispRslt_col_147_NX(info);
		else if (nx == columnDispRslt_col_148) doDispRslt_col_148_NX(info);
		else if (nx == columnDispRslt_col_149) doDispRslt_col_149_NX(info);
		else if (nx == columnDispRslt_col_151) doDispRslt_col_151_NX(info);
		else if (nx == columnDispRslt_col_152) doDispRslt_col_152_NX(info);
		else if (nx == columnDispRslt_col_153) doDispRslt_col_153_NX(info);
		else if (nx == columnDispRslt_col_154) doDispRslt_col_154_NX(info);
		else if (nx == columnDispRslt_col_156) doDispRslt_col_156_NX(info);
		else if (nx == columnDispRslt_col_157) doDispRslt_col_157_NX(info);
		else if (nx == columnDispRslt_col_158) doDispRslt_col_158_NX(info);
		else if (nx == columnDispRslt_col_159) doDispRslt_col_159_NX(info);
		else if (nx == columnDispRslt_col_161) doDispRslt_col_161_NX(info);
		else if (nx == columnDispRslt_col_162) doDispRslt_col_162_NX(info);
		else if (nx == columnDispRslt_col_163) doDispRslt_col_163_NX(info);
		else if (nx == columnDispRslt_col_164) doDispRslt_col_164_NX(info);
		else if (nx == columnDispRslt_col_166) doDispRslt_col_166_NX(info);
		else if (nx == columnDispRslt_col_167) doDispRslt_col_167_NX(info);
		else if (nx == columnDispRslt_col_168) doDispRslt_col_168_NX(info);
		else if (nx == columnDispRslt_col_169) doDispRslt_col_169_NX(info);
		else if (nx == columnDispRslt_col_171) doDispRslt_col_171_NX(info);
		else if (nx == columnDispRslt_col_172) doDispRslt_col_172_NX(info);
		else if (nx == columnDispRslt_col_173) doDispRslt_col_173_NX(info);
		else if (nx == columnDispRslt_col_174) doDispRslt_col_174_NX(info);
		else if (nx == columnDispRslt_col_176) doDispRslt_col_176_NX(info);
		else if (nx == columnDispRslt_col_177) doDispRslt_col_177_NX(info);
		else if (nx == columnDispRslt_col_178) doDispRslt_col_178_NX(info);
		else if (nx == columnDispRslt_col_179) doDispRslt_col_179_NX(info);
		else if (nx == columnDispRslt_col_181) doDispRslt_col_181_NX(info);
		else if (nx == columnDispRslt_col_182) doDispRslt_col_182_NX(info);
		else if (nx == columnDispRslt_col_183) doDispRslt_col_183_NX(info);
		else if (nx == columnDispRslt_col_184) doDispRslt_col_184_NX(info);
		else if (nx == columnDispRslt_col_186) doDispRslt_col_186_NX(info);
		else if (nx == columnDispRslt_col_187) doDispRslt_col_187_NX(info);
		else if (nx == columnDispRslt_col_188) doDispRslt_col_188_NX(info);
		else if (nx == columnDispRslt_col_189) doDispRslt_col_189_NX(info);
		else if (nx == columnDispRslt_col_191) doDispRslt_col_191_NX(info);
		else if (nx == columnDispRslt_col_192) doDispRslt_col_192_NX(info);
		else if (nx == columnDispRslt_col_193) doDispRslt_col_193_NX(info);
		else if (nx == columnDispRslt_col_194) doDispRslt_col_194_NX(info);
		else if (nx == columnDispRslt_col_196) doDispRslt_col_196_NX(info);
		else if (nx == columnDispRslt_col_197) doDispRslt_col_197_NX(info);
		else if (nx == columnDispRslt_col_198) doDispRslt_col_198_NX(info);
		else if (nx == columnDispRslt_col_199) doDispRslt_col_199_NX(info);
		else if (nx == columnDispRslt_col_201) doDispRslt_col_201_NX(info);
		else if (nx == columnDispRslt_col_202) doDispRslt_col_202_NX(info);
		else if (nx == columnDispRslt_col_203) doDispRslt_col_203_NX(info);
		else if (nx == columnDispRslt_col_204) doDispRslt_col_204_NX(info);
		else if (nx == columnDispRslt_col_206) doDispRslt_col_206_NX(info);
		else if (nx == columnDispRslt_col_207) doDispRslt_col_207_NX(info);
		else if (nx == columnDispRslt_col_208) doDispRslt_col_208_NX(info);
		else if (nx == columnDispRslt_col_209) doDispRslt_col_209_NX(info);
		else if (nx == columnDispRslt_col_211) doDispRslt_col_211_NX(info);
		else if (nx == columnDispRslt_col_212) doDispRslt_col_212_NX(info);
		else if (nx == columnDispRslt_col_213) doDispRslt_col_213_NX(info);
		else if (nx == columnDispRslt_col_214) doDispRslt_col_214_NX(info);
		else if (nx == columnDispRslt_col_216) doDispRslt_col_216_NX(info);
		else if (nx == columnDispRslt_col_217) doDispRslt_col_217_NX(info);
		else if (nx == columnDispRslt_col_218) doDispRslt_col_218_NX(info);
		else if (nx == columnDispRslt_col_219) doDispRslt_col_219_NX(info);
		else if (nx == columnDispRslt_col_221) doDispRslt_col_221_NX(info);
		else if (nx == columnDispRslt_col_222) doDispRslt_col_222_NX(info);
		else if (nx == columnDispRslt_col_223) doDispRslt_col_223_NX(info);
		else if (nx == columnDispRslt_col_224) doDispRslt_col_224_NX(info);
		else if (nx == columnDispRslt_col_226) doDispRslt_col_226_NX(info);
		else if (nx == columnDispRslt_col_227) doDispRslt_col_227_NX(info);
		else if (nx == columnDispRslt_col_228) doDispRslt_col_228_NX(info);
		else if (nx == columnDispRslt_col_229) doDispRslt_col_229_NX(info);
		else if (nx == columnDispRslt_col_231) doDispRslt_col_231_NX(info);
		else if (nx == columnDispRslt_col_232) doDispRslt_col_232_NX(info);
		else if (nx == columnDispRslt_col_233) doDispRslt_col_233_NX(info);
		else if (nx == columnDispRslt_col_234) doDispRslt_col_234_NX(info);
		else if (nx == columnDispRslt_col_236) doDispRslt_col_236_NX(info);
		else if (nx == columnDispRslt_col_237) doDispRslt_col_237_NX(info);
		else if (nx == columnDispRslt_col_238) doDispRslt_col_238_NX(info);
		else if (nx == columnDispRslt_col_239) doDispRslt_col_239_NX(info);
		else if (nx == columnDispRslt_col_241) doDispRslt_col_241_NX(info);
		else if (nx == columnDispRslt_col_242) doDispRslt_col_242_NX(info);
		else if (nx == columnDispRslt_col_243) doDispRslt_col_243_NX(info);
		else if (nx == columnDispRslt_col_244) doDispRslt_col_244_NX(info);
		else if (nx == columnDispRslt_col_246) doDispRslt_col_246_NX(info);
		else if (nx == columnDispRslt_col_247) doDispRslt_col_247_NX(info);
		else if (nx == columnDispRslt_col_248) doDispRslt_col_248_NX(info);
		else if (nx == columnDispRslt_col_249) doDispRslt_col_249_NX(info);
		else if (nx == columnDispRslt_col_251) doDispRslt_col_251_NX(info);
		else if (nx == columnDispRslt_col_252) doDispRslt_col_252_NX(info);
		else if (nx == columnDispRslt_col_253) doDispRslt_col_253_NX(info);
		else if (nx == columnDispRslt_col_254) doDispRslt_col_254_NX(info);
		else if (nx == columnDispRslt_col_256) doDispRslt_col_256_NX(info);
		else if (nx == columnDispRslt_col_257) doDispRslt_col_257_NX(info);
		else if (nx == columnDispRslt_col_258) doDispRslt_col_258_NX(info);
		else if (nx == columnDispRslt_col_259) doDispRslt_col_259_NX(info);
		else if (nx == columnDispRslt_col_261) doDispRslt_col_261_NX(info);
		else if (nx == columnDispRslt_col_262) doDispRslt_col_262_NX(info);
		else if (nx == columnDispRslt_col_263) doDispRslt_col_263_NX(info);
		else if (nx == columnDispRslt_col_264) doDispRslt_col_264_NX(info);
		else if (nx == columnDispRslt_col_266) doDispRslt_col_266_NX(info);
		else if (nx == columnDispRslt_col_267) doDispRslt_col_267_NX(info);
		else if (nx == columnDispRslt_col_268) doDispRslt_col_268_NX(info);
		else if (nx == columnDispRslt_col_269) doDispRslt_col_269_NX(info);
		else if (nx == columnDispRslt_col_271) doDispRslt_col_271_NX(info);
		else if (nx == columnDispRslt_col_272) doDispRslt_col_272_NX(info);
		else if (nx == columnDispRslt_col_273) doDispRslt_col_273_NX(info);
		else if (nx == columnDispRslt_col_274) doDispRslt_col_274_NX(info);
		else if (nx == columnDispRslt_col_276) doDispRslt_col_276_NX(info);
		else if (nx == columnDispRslt_col_277) doDispRslt_col_277_NX(info);
		else if (nx == columnDispRslt_col_278) doDispRslt_col_278_NX(info);
		else if (nx == columnDispRslt_col_279) doDispRslt_col_279_NX(info);
		else if (nx == columnDispRslt_col_281) doDispRslt_col_281_NX(info);
		else if (nx == columnDispRslt_col_282) doDispRslt_col_282_NX(info);
		else if (nx == columnDispRslt_col_283) doDispRslt_col_283_NX(info);
		else if (nx == columnDispRslt_col_284) doDispRslt_col_284_NX(info);
		else if (nx == columnDispRslt_col_286) doDispRslt_col_286_NX(info);
		else if (nx == columnDispRslt_col_287) doDispRslt_col_287_NX(info);
		else if (nx == columnDispRslt_col_288) doDispRslt_col_288_NX(info);
		else if (nx == columnDispRslt_col_289) doDispRslt_col_289_NX(info);
		else if (nx == columnDispRslt_col_291) doDispRslt_col_291_NX(info);
		else if (nx == columnDispRslt_col_292) doDispRslt_col_292_NX(info);
		else if (nx == columnDispRslt_col_293) doDispRslt_col_293_NX(info);
		else if (nx == columnDispRslt_col_294) doDispRslt_col_294_NX(info);
		else if (nx == columnDispRslt_col_296) doDispRslt_col_296_NX(info);
		else if (nx == columnDispRslt_col_297) doDispRslt_col_297_NX(info);
		else if (nx == columnDispRslt_col_298) doDispRslt_col_298_NX(info);
		else if (nx == columnDispRslt_col_299) doDispRslt_col_299_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_oth_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_oth_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[no_sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_unit_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_upri_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_ave_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_ave_unit_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_upri_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_std_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_std_unit_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_122]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_122_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_123]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_123_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_124]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_124_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_126]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_126_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_127]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_127_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_128]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_128_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_129]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_129_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_131]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_131_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_132]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_132_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_133]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_133_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_134]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_134_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_136]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_136_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_137]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_137_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_138]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_138_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_139]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_139_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_141]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_141_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_142]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_142_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_143]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_143_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_144]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_144_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_146]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_146_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_147]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_147_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_148]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_148_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_149]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_149_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_151]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_151_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_152]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_152_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_153]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_153_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_154]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_154_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_156]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_156_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_157]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_157_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_158]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_158_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_159]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_159_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_161]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_161_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_162]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_162_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_163]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_163_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_164]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_164_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_166]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_166_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_167]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_167_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_168]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_168_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_169]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_169_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_171]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_171_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_172]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_172_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_173]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_173_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_174]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_174_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_176]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_176_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_177]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_177_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_178]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_178_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_179]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_179_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_181]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_181_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_182]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_182_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_183]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_183_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_184]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_184_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_186]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_186_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_187]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_187_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_188]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_188_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_189]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_189_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_191]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_191_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_192]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_192_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_193]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_193_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_194]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_194_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_196]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_196_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_197]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_197_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_198]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_198_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_199]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_199_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_201]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_201_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_202]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_202_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_203]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_203_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_204]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_204_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_206]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_206_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_207]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_207_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_208]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_208_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_209]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_209_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_211]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_211_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_212]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_212_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_213]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_213_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_214]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_214_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_216]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_216_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_217]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_217_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_218]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_218_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_219]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_219_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_221]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_221_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_222]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_222_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_223]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_223_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_224]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_224_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_226]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_226_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_227]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_227_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_228]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_228_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_229]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_229_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_231]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_231_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_232]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_232_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_233]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_233_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_234]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_234_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_236]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_236_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_237]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_237_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_238]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_238_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_239]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_239_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_241]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_241_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_242]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_242_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_243]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_243_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_244]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_244_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_246]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_246_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_247]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_247_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_248]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_248_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_249]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_249_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_251]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_251_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_252]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_252_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_253]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_253_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_254]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_254_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_256]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_256_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_257]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_257_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_258]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_258_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_259]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_259_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_261]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_261_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_262]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_262_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_263]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_263_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_264]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_264_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_266]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_266_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_267]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_267_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_268]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_268_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_269]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_269_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_271]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_271_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_272]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_272_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_273]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_273_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_274]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_274_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_276]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_276_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_277]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_277_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_278]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_278_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_279]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_279_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_281]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_281_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_282]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_282_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_283]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_283_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_284]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_284_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_286]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_286_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_287]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_287_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_288]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_288_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_289]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_289_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_291]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_291_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_292]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_292_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_293]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_293_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_294]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_294_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_296]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_296_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_297]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_297_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_298]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_298_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_299]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_299_NX(MCEventInfo info){
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
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_repurc_obli_typ) doCnd_repurc_obli_typ_LC(info);
		else if (lc == Cnd_repurc_obli_typ_nm) doCnd_repurc_obli_typ_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
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
		else if (lc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_LC(info);
		else if (lc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_LC(info);
		else if (lc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_LC(info);
		else if (lc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_LC(info);
		else if (lc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_LC(info);
		else if (lc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_LC(info);
		else if (lc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_LC(info);
		else if (lc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_LC(info);
		else if (lc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_LC(info);
		else if (lc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_LC(info);
		else if (lc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_LC(info);
		else if (lc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_LC(info);
		else if (lc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_LC(info);
		else if (lc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_LC(info);
		else if (lc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_LC(info);
		else if (lc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_LC(info);
		else if (lc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_LC(info);
		else if (lc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_LC(info);
		else if (lc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_LC(info);
		else if (lc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_LC(info);
		else if (lc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_LC(info);
		else if (lc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_LC(info);
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_LC(info);
		else if (lc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ) doDispRslt_itm_typ_LC(info);
		else if (lc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_LC(info);
		else if (lc == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_LC(info);
		else if (lc == columnDispRslt_lot_no) doDispRslt_lot_no_LC(info);
		else if (lc == columnDispRslt_sublot_no) doDispRslt_sublot_no_LC(info);
		else if (lc == columnDispRslt_sno1) doDispRslt_sno1_LC(info);
		else if (lc == columnDispRslt_sno2) doDispRslt_sno2_LC(info);
		else if (lc == columnDispRslt_sno3) doDispRslt_sno3_LC(info);
		else if (lc == columnDispRslt_sno4) doDispRslt_sno4_LC(info);
		else if (lc == columnDispRslt_sppl_cd) doDispRslt_sppl_cd_LC(info);
		else if (lc == columnDispRslt_sppl_nm) doDispRslt_sppl_nm_LC(info);
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
		else if (lc == columnDispRslt_col_001) doDispRslt_col_001_LC(info);
		else if (lc == columnDispRslt_col_002) doDispRslt_col_002_LC(info);
		else if (lc == columnDispRslt_col_003) doDispRslt_col_003_LC(info);
		else if (lc == columnDispRslt_col_004) doDispRslt_col_004_LC(info);
		else if (lc == columnDispRslt_col_006) doDispRslt_col_006_LC(info);
		else if (lc == columnDispRslt_col_007) doDispRslt_col_007_LC(info);
		else if (lc == columnDispRslt_col_008) doDispRslt_col_008_LC(info);
		else if (lc == columnDispRslt_col_009) doDispRslt_col_009_LC(info);
		else if (lc == columnDispRslt_col_011) doDispRslt_col_011_LC(info);
		else if (lc == columnDispRslt_col_012) doDispRslt_col_012_LC(info);
		else if (lc == columnDispRslt_col_013) doDispRslt_col_013_LC(info);
		else if (lc == columnDispRslt_col_014) doDispRslt_col_014_LC(info);
		else if (lc == columnDispRslt_col_016) doDispRslt_col_016_LC(info);
		else if (lc == columnDispRslt_col_017) doDispRslt_col_017_LC(info);
		else if (lc == columnDispRslt_col_018) doDispRslt_col_018_LC(info);
		else if (lc == columnDispRslt_col_019) doDispRslt_col_019_LC(info);
		else if (lc == columnDispRslt_col_021) doDispRslt_col_021_LC(info);
		else if (lc == columnDispRslt_col_022) doDispRslt_col_022_LC(info);
		else if (lc == columnDispRslt_col_023) doDispRslt_col_023_LC(info);
		else if (lc == columnDispRslt_col_024) doDispRslt_col_024_LC(info);
		else if (lc == columnDispRslt_col_026) doDispRslt_col_026_LC(info);
		else if (lc == columnDispRslt_col_027) doDispRslt_col_027_LC(info);
		else if (lc == columnDispRslt_col_028) doDispRslt_col_028_LC(info);
		else if (lc == columnDispRslt_col_029) doDispRslt_col_029_LC(info);
		else if (lc == columnDispRslt_col_031) doDispRslt_col_031_LC(info);
		else if (lc == columnDispRslt_col_032) doDispRslt_col_032_LC(info);
		else if (lc == columnDispRslt_col_033) doDispRslt_col_033_LC(info);
		else if (lc == columnDispRslt_col_034) doDispRslt_col_034_LC(info);
		else if (lc == columnDispRslt_col_036) doDispRslt_col_036_LC(info);
		else if (lc == columnDispRslt_col_037) doDispRslt_col_037_LC(info);
		else if (lc == columnDispRslt_col_038) doDispRslt_col_038_LC(info);
		else if (lc == columnDispRslt_col_039) doDispRslt_col_039_LC(info);
		else if (lc == columnDispRslt_col_041) doDispRslt_col_041_LC(info);
		else if (lc == columnDispRslt_col_042) doDispRslt_col_042_LC(info);
		else if (lc == columnDispRslt_col_043) doDispRslt_col_043_LC(info);
		else if (lc == columnDispRslt_col_044) doDispRslt_col_044_LC(info);
		else if (lc == columnDispRslt_col_046) doDispRslt_col_046_LC(info);
		else if (lc == columnDispRslt_col_047) doDispRslt_col_047_LC(info);
		else if (lc == columnDispRslt_col_048) doDispRslt_col_048_LC(info);
		else if (lc == columnDispRslt_col_049) doDispRslt_col_049_LC(info);
		else if (lc == columnDispRslt_col_051) doDispRslt_col_051_LC(info);
		else if (lc == columnDispRslt_col_052) doDispRslt_col_052_LC(info);
		else if (lc == columnDispRslt_col_053) doDispRslt_col_053_LC(info);
		else if (lc == columnDispRslt_col_054) doDispRslt_col_054_LC(info);
		else if (lc == columnDispRslt_col_056) doDispRslt_col_056_LC(info);
		else if (lc == columnDispRslt_col_057) doDispRslt_col_057_LC(info);
		else if (lc == columnDispRslt_col_058) doDispRslt_col_058_LC(info);
		else if (lc == columnDispRslt_col_059) doDispRslt_col_059_LC(info);
		else if (lc == columnDispRslt_col_061) doDispRslt_col_061_LC(info);
		else if (lc == columnDispRslt_col_062) doDispRslt_col_062_LC(info);
		else if (lc == columnDispRslt_col_063) doDispRslt_col_063_LC(info);
		else if (lc == columnDispRslt_col_064) doDispRslt_col_064_LC(info);
		else if (lc == columnDispRslt_col_066) doDispRslt_col_066_LC(info);
		else if (lc == columnDispRslt_col_067) doDispRslt_col_067_LC(info);
		else if (lc == columnDispRslt_col_068) doDispRslt_col_068_LC(info);
		else if (lc == columnDispRslt_col_069) doDispRslt_col_069_LC(info);
		else if (lc == columnDispRslt_col_071) doDispRslt_col_071_LC(info);
		else if (lc == columnDispRslt_col_072) doDispRslt_col_072_LC(info);
		else if (lc == columnDispRslt_col_073) doDispRslt_col_073_LC(info);
		else if (lc == columnDispRslt_col_074) doDispRslt_col_074_LC(info);
		else if (lc == columnDispRslt_col_076) doDispRslt_col_076_LC(info);
		else if (lc == columnDispRslt_col_077) doDispRslt_col_077_LC(info);
		else if (lc == columnDispRslt_col_078) doDispRslt_col_078_LC(info);
		else if (lc == columnDispRslt_col_079) doDispRslt_col_079_LC(info);
		else if (lc == columnDispRslt_col_081) doDispRslt_col_081_LC(info);
		else if (lc == columnDispRslt_col_082) doDispRslt_col_082_LC(info);
		else if (lc == columnDispRslt_col_083) doDispRslt_col_083_LC(info);
		else if (lc == columnDispRslt_col_084) doDispRslt_col_084_LC(info);
		else if (lc == columnDispRslt_col_086) doDispRslt_col_086_LC(info);
		else if (lc == columnDispRslt_col_087) doDispRslt_col_087_LC(info);
		else if (lc == columnDispRslt_col_088) doDispRslt_col_088_LC(info);
		else if (lc == columnDispRslt_col_089) doDispRslt_col_089_LC(info);
		else if (lc == columnDispRslt_col_091) doDispRslt_col_091_LC(info);
		else if (lc == columnDispRslt_col_092) doDispRslt_col_092_LC(info);
		else if (lc == columnDispRslt_col_093) doDispRslt_col_093_LC(info);
		else if (lc == columnDispRslt_col_094) doDispRslt_col_094_LC(info);
		else if (lc == columnDispRslt_col_096) doDispRslt_col_096_LC(info);
		else if (lc == columnDispRslt_col_097) doDispRslt_col_097_LC(info);
		else if (lc == columnDispRslt_col_098) doDispRslt_col_098_LC(info);
		else if (lc == columnDispRslt_col_099) doDispRslt_col_099_LC(info);
		else if (lc == columnDispRslt_col_101) doDispRslt_col_101_LC(info);
		else if (lc == columnDispRslt_col_102) doDispRslt_col_102_LC(info);
		else if (lc == columnDispRslt_col_103) doDispRslt_col_103_LC(info);
		else if (lc == columnDispRslt_col_104) doDispRslt_col_104_LC(info);
		else if (lc == columnDispRslt_col_106) doDispRslt_col_106_LC(info);
		else if (lc == columnDispRslt_col_107) doDispRslt_col_107_LC(info);
		else if (lc == columnDispRslt_col_108) doDispRslt_col_108_LC(info);
		else if (lc == columnDispRslt_col_109) doDispRslt_col_109_LC(info);
		else if (lc == columnDispRslt_col_111) doDispRslt_col_111_LC(info);
		else if (lc == columnDispRslt_col_112) doDispRslt_col_112_LC(info);
		else if (lc == columnDispRslt_col_113) doDispRslt_col_113_LC(info);
		else if (lc == columnDispRslt_col_114) doDispRslt_col_114_LC(info);
		else if (lc == columnDispRslt_col_116) doDispRslt_col_116_LC(info);
		else if (lc == columnDispRslt_col_117) doDispRslt_col_117_LC(info);
		else if (lc == columnDispRslt_col_118) doDispRslt_col_118_LC(info);
		else if (lc == columnDispRslt_col_119) doDispRslt_col_119_LC(info);
		else if (lc == columnDispRslt_col_121) doDispRslt_col_121_LC(info);
		else if (lc == columnDispRslt_col_122) doDispRslt_col_122_LC(info);
		else if (lc == columnDispRslt_col_123) doDispRslt_col_123_LC(info);
		else if (lc == columnDispRslt_col_124) doDispRslt_col_124_LC(info);
		else if (lc == columnDispRslt_col_126) doDispRslt_col_126_LC(info);
		else if (lc == columnDispRslt_col_127) doDispRslt_col_127_LC(info);
		else if (lc == columnDispRslt_col_128) doDispRslt_col_128_LC(info);
		else if (lc == columnDispRslt_col_129) doDispRslt_col_129_LC(info);
		else if (lc == columnDispRslt_col_131) doDispRslt_col_131_LC(info);
		else if (lc == columnDispRslt_col_132) doDispRslt_col_132_LC(info);
		else if (lc == columnDispRslt_col_133) doDispRslt_col_133_LC(info);
		else if (lc == columnDispRslt_col_134) doDispRslt_col_134_LC(info);
		else if (lc == columnDispRslt_col_136) doDispRslt_col_136_LC(info);
		else if (lc == columnDispRslt_col_137) doDispRslt_col_137_LC(info);
		else if (lc == columnDispRslt_col_138) doDispRslt_col_138_LC(info);
		else if (lc == columnDispRslt_col_139) doDispRslt_col_139_LC(info);
		else if (lc == columnDispRslt_col_141) doDispRslt_col_141_LC(info);
		else if (lc == columnDispRslt_col_142) doDispRslt_col_142_LC(info);
		else if (lc == columnDispRslt_col_143) doDispRslt_col_143_LC(info);
		else if (lc == columnDispRslt_col_144) doDispRslt_col_144_LC(info);
		else if (lc == columnDispRslt_col_146) doDispRslt_col_146_LC(info);
		else if (lc == columnDispRslt_col_147) doDispRslt_col_147_LC(info);
		else if (lc == columnDispRslt_col_148) doDispRslt_col_148_LC(info);
		else if (lc == columnDispRslt_col_149) doDispRslt_col_149_LC(info);
		else if (lc == columnDispRslt_col_151) doDispRslt_col_151_LC(info);
		else if (lc == columnDispRslt_col_152) doDispRslt_col_152_LC(info);
		else if (lc == columnDispRslt_col_153) doDispRslt_col_153_LC(info);
		else if (lc == columnDispRslt_col_154) doDispRslt_col_154_LC(info);
		else if (lc == columnDispRslt_col_156) doDispRslt_col_156_LC(info);
		else if (lc == columnDispRslt_col_157) doDispRslt_col_157_LC(info);
		else if (lc == columnDispRslt_col_158) doDispRslt_col_158_LC(info);
		else if (lc == columnDispRslt_col_159) doDispRslt_col_159_LC(info);
		else if (lc == columnDispRslt_col_161) doDispRslt_col_161_LC(info);
		else if (lc == columnDispRslt_col_162) doDispRslt_col_162_LC(info);
		else if (lc == columnDispRslt_col_163) doDispRslt_col_163_LC(info);
		else if (lc == columnDispRslt_col_164) doDispRslt_col_164_LC(info);
		else if (lc == columnDispRslt_col_166) doDispRslt_col_166_LC(info);
		else if (lc == columnDispRslt_col_167) doDispRslt_col_167_LC(info);
		else if (lc == columnDispRslt_col_168) doDispRslt_col_168_LC(info);
		else if (lc == columnDispRslt_col_169) doDispRslt_col_169_LC(info);
		else if (lc == columnDispRslt_col_171) doDispRslt_col_171_LC(info);
		else if (lc == columnDispRslt_col_172) doDispRslt_col_172_LC(info);
		else if (lc == columnDispRslt_col_173) doDispRslt_col_173_LC(info);
		else if (lc == columnDispRslt_col_174) doDispRslt_col_174_LC(info);
		else if (lc == columnDispRslt_col_176) doDispRslt_col_176_LC(info);
		else if (lc == columnDispRslt_col_177) doDispRslt_col_177_LC(info);
		else if (lc == columnDispRslt_col_178) doDispRslt_col_178_LC(info);
		else if (lc == columnDispRslt_col_179) doDispRslt_col_179_LC(info);
		else if (lc == columnDispRslt_col_181) doDispRslt_col_181_LC(info);
		else if (lc == columnDispRslt_col_182) doDispRslt_col_182_LC(info);
		else if (lc == columnDispRslt_col_183) doDispRslt_col_183_LC(info);
		else if (lc == columnDispRslt_col_184) doDispRslt_col_184_LC(info);
		else if (lc == columnDispRslt_col_186) doDispRslt_col_186_LC(info);
		else if (lc == columnDispRslt_col_187) doDispRslt_col_187_LC(info);
		else if (lc == columnDispRslt_col_188) doDispRslt_col_188_LC(info);
		else if (lc == columnDispRslt_col_189) doDispRslt_col_189_LC(info);
		else if (lc == columnDispRslt_col_191) doDispRslt_col_191_LC(info);
		else if (lc == columnDispRslt_col_192) doDispRslt_col_192_LC(info);
		else if (lc == columnDispRslt_col_193) doDispRslt_col_193_LC(info);
		else if (lc == columnDispRslt_col_194) doDispRslt_col_194_LC(info);
		else if (lc == columnDispRslt_col_196) doDispRslt_col_196_LC(info);
		else if (lc == columnDispRslt_col_197) doDispRslt_col_197_LC(info);
		else if (lc == columnDispRslt_col_198) doDispRslt_col_198_LC(info);
		else if (lc == columnDispRslt_col_199) doDispRslt_col_199_LC(info);
		else if (lc == columnDispRslt_col_201) doDispRslt_col_201_LC(info);
		else if (lc == columnDispRslt_col_202) doDispRslt_col_202_LC(info);
		else if (lc == columnDispRslt_col_203) doDispRslt_col_203_LC(info);
		else if (lc == columnDispRslt_col_204) doDispRslt_col_204_LC(info);
		else if (lc == columnDispRslt_col_206) doDispRslt_col_206_LC(info);
		else if (lc == columnDispRslt_col_207) doDispRslt_col_207_LC(info);
		else if (lc == columnDispRslt_col_208) doDispRslt_col_208_LC(info);
		else if (lc == columnDispRslt_col_209) doDispRslt_col_209_LC(info);
		else if (lc == columnDispRslt_col_211) doDispRslt_col_211_LC(info);
		else if (lc == columnDispRslt_col_212) doDispRslt_col_212_LC(info);
		else if (lc == columnDispRslt_col_213) doDispRslt_col_213_LC(info);
		else if (lc == columnDispRslt_col_214) doDispRslt_col_214_LC(info);
		else if (lc == columnDispRslt_col_216) doDispRslt_col_216_LC(info);
		else if (lc == columnDispRslt_col_217) doDispRslt_col_217_LC(info);
		else if (lc == columnDispRslt_col_218) doDispRslt_col_218_LC(info);
		else if (lc == columnDispRslt_col_219) doDispRslt_col_219_LC(info);
		else if (lc == columnDispRslt_col_221) doDispRslt_col_221_LC(info);
		else if (lc == columnDispRslt_col_222) doDispRslt_col_222_LC(info);
		else if (lc == columnDispRslt_col_223) doDispRslt_col_223_LC(info);
		else if (lc == columnDispRslt_col_224) doDispRslt_col_224_LC(info);
		else if (lc == columnDispRslt_col_226) doDispRslt_col_226_LC(info);
		else if (lc == columnDispRslt_col_227) doDispRslt_col_227_LC(info);
		else if (lc == columnDispRslt_col_228) doDispRslt_col_228_LC(info);
		else if (lc == columnDispRslt_col_229) doDispRslt_col_229_LC(info);
		else if (lc == columnDispRslt_col_231) doDispRslt_col_231_LC(info);
		else if (lc == columnDispRslt_col_232) doDispRslt_col_232_LC(info);
		else if (lc == columnDispRslt_col_233) doDispRslt_col_233_LC(info);
		else if (lc == columnDispRslt_col_234) doDispRslt_col_234_LC(info);
		else if (lc == columnDispRslt_col_236) doDispRslt_col_236_LC(info);
		else if (lc == columnDispRslt_col_237) doDispRslt_col_237_LC(info);
		else if (lc == columnDispRslt_col_238) doDispRslt_col_238_LC(info);
		else if (lc == columnDispRslt_col_239) doDispRslt_col_239_LC(info);
		else if (lc == columnDispRslt_col_241) doDispRslt_col_241_LC(info);
		else if (lc == columnDispRslt_col_242) doDispRslt_col_242_LC(info);
		else if (lc == columnDispRslt_col_243) doDispRslt_col_243_LC(info);
		else if (lc == columnDispRslt_col_244) doDispRslt_col_244_LC(info);
		else if (lc == columnDispRslt_col_246) doDispRslt_col_246_LC(info);
		else if (lc == columnDispRslt_col_247) doDispRslt_col_247_LC(info);
		else if (lc == columnDispRslt_col_248) doDispRslt_col_248_LC(info);
		else if (lc == columnDispRslt_col_249) doDispRslt_col_249_LC(info);
		else if (lc == columnDispRslt_col_251) doDispRslt_col_251_LC(info);
		else if (lc == columnDispRslt_col_252) doDispRslt_col_252_LC(info);
		else if (lc == columnDispRslt_col_253) doDispRslt_col_253_LC(info);
		else if (lc == columnDispRslt_col_254) doDispRslt_col_254_LC(info);
		else if (lc == columnDispRslt_col_256) doDispRslt_col_256_LC(info);
		else if (lc == columnDispRslt_col_257) doDispRslt_col_257_LC(info);
		else if (lc == columnDispRslt_col_258) doDispRslt_col_258_LC(info);
		else if (lc == columnDispRslt_col_259) doDispRslt_col_259_LC(info);
		else if (lc == columnDispRslt_col_261) doDispRslt_col_261_LC(info);
		else if (lc == columnDispRslt_col_262) doDispRslt_col_262_LC(info);
		else if (lc == columnDispRslt_col_263) doDispRslt_col_263_LC(info);
		else if (lc == columnDispRslt_col_264) doDispRslt_col_264_LC(info);
		else if (lc == columnDispRslt_col_266) doDispRslt_col_266_LC(info);
		else if (lc == columnDispRslt_col_267) doDispRslt_col_267_LC(info);
		else if (lc == columnDispRslt_col_268) doDispRslt_col_268_LC(info);
		else if (lc == columnDispRslt_col_269) doDispRslt_col_269_LC(info);
		else if (lc == columnDispRslt_col_271) doDispRslt_col_271_LC(info);
		else if (lc == columnDispRslt_col_272) doDispRslt_col_272_LC(info);
		else if (lc == columnDispRslt_col_273) doDispRslt_col_273_LC(info);
		else if (lc == columnDispRslt_col_274) doDispRslt_col_274_LC(info);
		else if (lc == columnDispRslt_col_276) doDispRslt_col_276_LC(info);
		else if (lc == columnDispRslt_col_277) doDispRslt_col_277_LC(info);
		else if (lc == columnDispRslt_col_278) doDispRslt_col_278_LC(info);
		else if (lc == columnDispRslt_col_279) doDispRslt_col_279_LC(info);
		else if (lc == columnDispRslt_col_281) doDispRslt_col_281_LC(info);
		else if (lc == columnDispRslt_col_282) doDispRslt_col_282_LC(info);
		else if (lc == columnDispRslt_col_283) doDispRslt_col_283_LC(info);
		else if (lc == columnDispRslt_col_284) doDispRslt_col_284_LC(info);
		else if (lc == columnDispRslt_col_286) doDispRslt_col_286_LC(info);
		else if (lc == columnDispRslt_col_287) doDispRslt_col_287_LC(info);
		else if (lc == columnDispRslt_col_288) doDispRslt_col_288_LC(info);
		else if (lc == columnDispRslt_col_289) doDispRslt_col_289_LC(info);
		else if (lc == columnDispRslt_col_291) doDispRslt_col_291_LC(info);
		else if (lc == columnDispRslt_col_292) doDispRslt_col_292_LC(info);
		else if (lc == columnDispRslt_col_293) doDispRslt_col_293_LC(info);
		else if (lc == columnDispRslt_col_294) doDispRslt_col_294_LC(info);
		else if (lc == columnDispRslt_col_296) doDispRslt_col_296_LC(info);
		else if (lc == columnDispRslt_col_297) doDispRslt_col_297_LC(info);
		else if (lc == columnDispRslt_col_298) doDispRslt_col_298_LC(info);
		else if (lc == columnDispRslt_col_299) doDispRslt_col_299_LC(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[repurc_obli_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_repurc_obli_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_122]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_122_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_123]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_123_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_124]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_124_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_126]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_126_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_127]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_127_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_128]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_128_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_129]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_129_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_131]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_131_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_132]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_132_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_133]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_133_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_134]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_134_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_136]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_136_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_137]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_137_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_138]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_138_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_139]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_139_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_141]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_141_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_142]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_142_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_143]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_143_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_144]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_144_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_146]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_146_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_147]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_147_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_148]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_148_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_149]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_149_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_151]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_151_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_152]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_152_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_153]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_153_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_154]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_154_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_156]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_156_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_157]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_157_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_158]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_158_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_159]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_159_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_161]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_161_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_162]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_162_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_163]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_163_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_164]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_164_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_166]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_166_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_167]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_167_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_168]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_168_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_169]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_169_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_171]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_171_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_172]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_172_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_173]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_173_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_174]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_174_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_176]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_176_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_177]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_177_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_178]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_178_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_179]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_179_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_181]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_181_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_182]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_182_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_183]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_183_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_184]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_184_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_186]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_186_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_187]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_187_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_188]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_188_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_189]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_189_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_191]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_191_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_192]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_192_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_193]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_193_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_194]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_194_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_196]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_196_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_197]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_197_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_198]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_198_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_199]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_199_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_201]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_201_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_202]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_202_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_203]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_203_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_204]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_204_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_206]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_206_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_207]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_207_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_208]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_208_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_209]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_209_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_211]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_211_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_212]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_212_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_213]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_213_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_214]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_214_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_216]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_216_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_217]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_217_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_218]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_218_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_219]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_219_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_221]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_221_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_222]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_222_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_223]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_223_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_224]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_224_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_226]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_226_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_227]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_227_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_228]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_228_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_229]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_229_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_231]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_231_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_232]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_232_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_233]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_233_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_234]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_234_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_236]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_236_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_237]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_237_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_238]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_238_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_239]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_239_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_241]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_241_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_242]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_242_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_243]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_243_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_244]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_244_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_246]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_246_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_247]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_247_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_248]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_248_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_249]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_249_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_251]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_251_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_252]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_252_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_253]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_253_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_254]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_254_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_256]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_256_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_257]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_257_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_258]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_258_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_259]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_259_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_261]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_261_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_262]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_262_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_263]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_263_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_264]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_264_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_266]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_266_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_267]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_267_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_268]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_268_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_269]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_269_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_271]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_271_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_272]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_272_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_273]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_273_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_274]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_274_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_276]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_276_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_277]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_277_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_278]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_278_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_279]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_279_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_281]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_281_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_282]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_282_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_283]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_283_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_284]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_284_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_286]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_286_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_287]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_287_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_288]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_288_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_289]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_289_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_291]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_291_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_292]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_292_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_293]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_293_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_294]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_294_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_296]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_296_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_297]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_297_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_298]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_298_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_299]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_299_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
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
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_repurc_obli_typ]の作成メソッド
	 */
	public MCList getCnd_repurc_obli_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getRepurcObliTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_area_cd]の作成メソッド
	 */
	public MCList getCnd_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
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
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0420.Srch01")) {
			return new MG_MGBFL0420_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0420_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0420_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0420_Srch01Bridge() {
			p_MG_MGBFL0420_Srch01 = new MCParam(PDef.MG_MGBFL0420_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0420_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0420.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0420.FixR.class));

			p_MG_MGBFL0420_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0420_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0420_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0420_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0420_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0420.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0420.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0420.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0420.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0420.FixR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0420.FixR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0420.RsltR.class));
			p_MG_MGBFL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0420.FixR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0420_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0420.RsltR>)p_MG_MGBFL0420_Srch01.getContainerParam().getDownBlock(0));
			setFixL((MCList<mcframe.clientMGBF.MGBFP0420.FixR>)p_MG_MGBFL0420_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getFixL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getFixL());
			return result;
		}
	}
}