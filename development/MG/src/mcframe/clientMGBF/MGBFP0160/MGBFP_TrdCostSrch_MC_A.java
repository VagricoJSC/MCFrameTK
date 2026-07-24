package mcframe.clientMGBF.MGBFP0160;

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
import mcframe.clientMGBF.MGBFP0160.MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch01Caller;
import mcframe.clientMGBF.MGBFP0160.MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch02Caller;

/**
 * 画面"MGBFP_TrdCostSrch"パネルクラスです。<p>
 *
 * 振替原価を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_TrdCostSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
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
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym = null;
	public MCLabel Cnd_trd_grp_Label = null;
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public MCTextField Cnd_trd_grp = null;
	/**
	 * Exclude transfer difference = 0 振替差額＝０除く.<p>
	 *
	 */
	public MCCheckBox Cnd_not_trd_zero_flg = null;
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
	public MCTable2<mcframe.clientMGBF.MGBFP0160.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_grp = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl = null;
	public MCColumnConfig columnRslt_col_000 = null;
	public MCColumnConfig columnRslt_col_001 = null;
	public MCColumnConfig columnRslt_col_002 = null;
	public MCColumnConfig columnRslt_col_003 = null;
	public MCColumnConfig columnRslt_col_004 = null;
	public MCColumnConfig columnRslt_col_005 = null;
	public MCColumnConfig columnRslt_col_006 = null;
	public MCColumnConfig columnRslt_col_007 = null;
	public MCColumnConfig columnRslt_col_008 = null;
	public MCColumnConfig columnRslt_col_009 = null;
	public MCColumnConfig columnRslt_col_010 = null;
	public MCColumnConfig columnRslt_col_011 = null;
	public MCColumnConfig columnRslt_col_012 = null;
	public MCColumnConfig columnRslt_col_013 = null;
	public MCColumnConfig columnRslt_col_014 = null;
	public MCColumnConfig columnRslt_col_015 = null;
	public MCColumnConfig columnRslt_col_016 = null;
	public MCColumnConfig columnRslt_col_017 = null;
	public MCColumnConfig columnRslt_col_018 = null;
	public MCColumnConfig columnRslt_col_019 = null;
	public MCColumnConfig columnRslt_col_020 = null;
	public MCColumnConfig columnRslt_col_021 = null;
	public MCColumnConfig columnRslt_col_022 = null;
	public MCColumnConfig columnRslt_col_023 = null;
	public MCColumnConfig columnRslt_col_024 = null;
	public MCColumnConfig columnRslt_col_025 = null;
	public MCColumnConfig columnRslt_col_026 = null;
	public MCColumnConfig columnRslt_col_027 = null;
	public MCColumnConfig columnRslt_col_028 = null;
	public MCColumnConfig columnRslt_col_029 = null;
	public MCColumnConfig columnRslt_col_030 = null;
	public MCColumnConfig columnRslt_col_031 = null;
	public MCColumnConfig columnRslt_col_032 = null;
	public MCColumnConfig columnRslt_col_033 = null;
	public MCColumnConfig columnRslt_col_034 = null;
	public MCColumnConfig columnRslt_col_035 = null;
	public MCColumnConfig columnRslt_col_036 = null;
	public MCColumnConfig columnRslt_col_037 = null;
	public MCColumnConfig columnRslt_col_038 = null;
	public MCColumnConfig columnRslt_col_039 = null;
	public MCColumnConfig columnRslt_col_040 = null;
	public MCColumnConfig columnRslt_col_041 = null;
	public MCColumnConfig columnRslt_col_042 = null;
	public MCColumnConfig columnRslt_col_043 = null;
	public MCColumnConfig columnRslt_col_044 = null;
	public MCColumnConfig columnRslt_col_045 = null;
	public MCColumnConfig columnRslt_col_046 = null;
	public MCColumnConfig columnRslt_col_047 = null;
	public MCColumnConfig columnRslt_col_048 = null;
	public MCColumnConfig columnRslt_col_049 = null;
	public MCColumnConfig columnRslt_col_050 = null;
	public MCColumnConfig columnRslt_col_051 = null;
	public MCColumnConfig columnRslt_col_052 = null;
	public MCColumnConfig columnRslt_col_053 = null;
	public MCColumnConfig columnRslt_col_054 = null;
	public MCColumnConfig columnRslt_col_055 = null;
	public MCColumnConfig columnRslt_col_056 = null;
	public MCColumnConfig columnRslt_col_057 = null;
	public MCColumnConfig columnRslt_col_058 = null;
	public MCColumnConfig columnRslt_col_059 = null;
	public MCColumnConfig columnRslt_col_060 = null;
	public MCColumnConfig columnRslt_col_061 = null;
	public MCColumnConfig columnRslt_col_062 = null;
	public MCColumnConfig columnRslt_col_063 = null;
	public MCColumnConfig columnRslt_col_064 = null;
	public MCColumnConfig columnRslt_col_065 = null;
	public MCColumnConfig columnRslt_col_066 = null;
	public MCColumnConfig columnRslt_col_067 = null;
	public MCColumnConfig columnRslt_col_068 = null;
	public MCColumnConfig columnRslt_col_069 = null;
	public MCColumnConfig columnRslt_col_070 = null;
	public MCColumnConfig columnRslt_col_071 = null;
	public MCColumnConfig columnRslt_col_072 = null;
	public MCColumnConfig columnRslt_col_073 = null;
	public MCColumnConfig columnRslt_col_074 = null;
	public MCColumnConfig columnRslt_col_075 = null;
	public MCColumnConfig columnRslt_col_076 = null;
	public MCColumnConfig columnRslt_col_077 = null;
	public MCColumnConfig columnRslt_col_078 = null;
	public MCColumnConfig columnRslt_col_079 = null;
	public MCColumnConfig columnRslt_col_080 = null;
	public MCColumnConfig columnRslt_col_081 = null;
	public MCColumnConfig columnRslt_col_082 = null;
	public MCColumnConfig columnRslt_col_083 = null;
	public MCColumnConfig columnRslt_col_084 = null;
	public MCColumnConfig columnRslt_col_085 = null;
	public MCColumnConfig columnRslt_col_086 = null;
	public MCColumnConfig columnRslt_col_087 = null;
	public MCColumnConfig columnRslt_col_088 = null;
	public MCColumnConfig columnRslt_col_089 = null;
	public MCColumnConfig columnRslt_col_090 = null;
	public MCColumnConfig columnRslt_col_091 = null;
	public MCColumnConfig columnRslt_col_092 = null;
	public MCColumnConfig columnRslt_col_093 = null;
	public MCColumnConfig columnRslt_col_094 = null;
	public MCColumnConfig columnRslt_col_095 = null;
	public MCColumnConfig columnRslt_col_096 = null;
	public MCColumnConfig columnRslt_col_097 = null;
	public MCColumnConfig columnRslt_col_098 = null;
	public MCColumnConfig columnRslt_col_099 = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_cd = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_no = null;
	/**
	 * Searched 検索済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_srched_flg = null;
	// [OutDtl]ブロック関連のField定義
	public MCPanel OutDtlPanel = null;
	public MCTitledBorder OutDtlTitledBorder = null;
	public MCScrollPane OutDtlScrollPane = null;
	public MCTable2<mcframe.clientMGBF.MGBFP0160.OutDtlR> OutDtlTable = null;
	// [OutDtl]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_wg_nm = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D OutDtl_itm_p_PPanel;
	public MCColumnConfig columnOutDtl_itm_cd;// [OutDtl]の[itm_p.itm_cd]を[columnOutDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnOutDtl_itm_sub1;// [OutDtl]の[itm_p.itm_sub1]を[columnOutDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnOutDtl_itm_sub2;// [OutDtl]の[itm_p.itm_sub2]を[columnOutDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnOutDtl_itm_sub3;// [OutDtl]の[itm_p.itm_sub3]を[columnOutDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnOutDtl_itm_nm;// [OutDtl]の[itm_p.itm_nm]を[columnOutDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_itm_jnl_nm = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_sno4 = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_bp_nm = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ac_rsn_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_asst_typ_nm = null;
	/**
	 * Transfer ratio (%) 振替比率（％）.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_per = null;
	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_mfg_cost_ratio = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D OutDtl_qty_p_PPanel;
	public MCColumnConfig columnOutDtl_qty;// [OutDtl]の[qty_p.qty]を[columnOutDtl_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_dec_place = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_upri = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ttl = null;
	public MCColumnConfig columnOutDtl_col_000 = null;
	public MCColumnConfig columnOutDtl_col_001 = null;
	public MCColumnConfig columnOutDtl_col_002 = null;
	public MCColumnConfig columnOutDtl_col_003 = null;
	public MCColumnConfig columnOutDtl_col_004 = null;
	public MCColumnConfig columnOutDtl_col_005 = null;
	public MCColumnConfig columnOutDtl_col_006 = null;
	public MCColumnConfig columnOutDtl_col_007 = null;
	public MCColumnConfig columnOutDtl_col_008 = null;
	public MCColumnConfig columnOutDtl_col_009 = null;
	public MCColumnConfig columnOutDtl_col_010 = null;
	public MCColumnConfig columnOutDtl_col_011 = null;
	public MCColumnConfig columnOutDtl_col_012 = null;
	public MCColumnConfig columnOutDtl_col_013 = null;
	public MCColumnConfig columnOutDtl_col_014 = null;
	public MCColumnConfig columnOutDtl_col_015 = null;
	public MCColumnConfig columnOutDtl_col_016 = null;
	public MCColumnConfig columnOutDtl_col_017 = null;
	public MCColumnConfig columnOutDtl_col_018 = null;
	public MCColumnConfig columnOutDtl_col_019 = null;
	public MCColumnConfig columnOutDtl_col_020 = null;
	public MCColumnConfig columnOutDtl_col_021 = null;
	public MCColumnConfig columnOutDtl_col_022 = null;
	public MCColumnConfig columnOutDtl_col_023 = null;
	public MCColumnConfig columnOutDtl_col_024 = null;
	public MCColumnConfig columnOutDtl_col_025 = null;
	public MCColumnConfig columnOutDtl_col_026 = null;
	public MCColumnConfig columnOutDtl_col_027 = null;
	public MCColumnConfig columnOutDtl_col_028 = null;
	public MCColumnConfig columnOutDtl_col_029 = null;
	public MCColumnConfig columnOutDtl_col_030 = null;
	public MCColumnConfig columnOutDtl_col_031 = null;
	public MCColumnConfig columnOutDtl_col_032 = null;
	public MCColumnConfig columnOutDtl_col_033 = null;
	public MCColumnConfig columnOutDtl_col_034 = null;
	public MCColumnConfig columnOutDtl_col_035 = null;
	public MCColumnConfig columnOutDtl_col_036 = null;
	public MCColumnConfig columnOutDtl_col_037 = null;
	public MCColumnConfig columnOutDtl_col_038 = null;
	public MCColumnConfig columnOutDtl_col_039 = null;
	public MCColumnConfig columnOutDtl_col_040 = null;
	public MCColumnConfig columnOutDtl_col_041 = null;
	public MCColumnConfig columnOutDtl_col_042 = null;
	public MCColumnConfig columnOutDtl_col_043 = null;
	public MCColumnConfig columnOutDtl_col_044 = null;
	public MCColumnConfig columnOutDtl_col_045 = null;
	public MCColumnConfig columnOutDtl_col_046 = null;
	public MCColumnConfig columnOutDtl_col_047 = null;
	public MCColumnConfig columnOutDtl_col_048 = null;
	public MCColumnConfig columnOutDtl_col_049 = null;
	public MCColumnConfig columnOutDtl_col_050 = null;
	public MCColumnConfig columnOutDtl_col_051 = null;
	public MCColumnConfig columnOutDtl_col_052 = null;
	public MCColumnConfig columnOutDtl_col_053 = null;
	public MCColumnConfig columnOutDtl_col_054 = null;
	public MCColumnConfig columnOutDtl_col_055 = null;
	public MCColumnConfig columnOutDtl_col_056 = null;
	public MCColumnConfig columnOutDtl_col_057 = null;
	public MCColumnConfig columnOutDtl_col_058 = null;
	public MCColumnConfig columnOutDtl_col_059 = null;
	public MCColumnConfig columnOutDtl_col_060 = null;
	public MCColumnConfig columnOutDtl_col_061 = null;
	public MCColumnConfig columnOutDtl_col_062 = null;
	public MCColumnConfig columnOutDtl_col_063 = null;
	public MCColumnConfig columnOutDtl_col_064 = null;
	public MCColumnConfig columnOutDtl_col_065 = null;
	public MCColumnConfig columnOutDtl_col_066 = null;
	public MCColumnConfig columnOutDtl_col_067 = null;
	public MCColumnConfig columnOutDtl_col_068 = null;
	public MCColumnConfig columnOutDtl_col_069 = null;
	public MCColumnConfig columnOutDtl_col_070 = null;
	public MCColumnConfig columnOutDtl_col_071 = null;
	public MCColumnConfig columnOutDtl_col_072 = null;
	public MCColumnConfig columnOutDtl_col_073 = null;
	public MCColumnConfig columnOutDtl_col_074 = null;
	public MCColumnConfig columnOutDtl_col_075 = null;
	public MCColumnConfig columnOutDtl_col_076 = null;
	public MCColumnConfig columnOutDtl_col_077 = null;
	public MCColumnConfig columnOutDtl_col_078 = null;
	public MCColumnConfig columnOutDtl_col_079 = null;
	public MCColumnConfig columnOutDtl_col_080 = null;
	public MCColumnConfig columnOutDtl_col_081 = null;
	public MCColumnConfig columnOutDtl_col_082 = null;
	public MCColumnConfig columnOutDtl_col_083 = null;
	public MCColumnConfig columnOutDtl_col_084 = null;
	public MCColumnConfig columnOutDtl_col_085 = null;
	public MCColumnConfig columnOutDtl_col_086 = null;
	public MCColumnConfig columnOutDtl_col_087 = null;
	public MCColumnConfig columnOutDtl_col_088 = null;
	public MCColumnConfig columnOutDtl_col_089 = null;
	public MCColumnConfig columnOutDtl_col_090 = null;
	public MCColumnConfig columnOutDtl_col_091 = null;
	public MCColumnConfig columnOutDtl_col_092 = null;
	public MCColumnConfig columnOutDtl_col_093 = null;
	public MCColumnConfig columnOutDtl_col_094 = null;
	public MCColumnConfig columnOutDtl_col_095 = null;
	public MCColumnConfig columnOutDtl_col_096 = null;
	public MCColumnConfig columnOutDtl_col_097 = null;
	public MCColumnConfig columnOutDtl_col_098 = null;
	public MCColumnConfig columnOutDtl_col_099 = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_ym = null;
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_trd_grp = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_calc_grp_cd = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnOutDtl_calc_no = null;
	// [InDtl]ブロック関連のField定義
	public MCPanel InDtlPanel = null;
	public MCTitledBorder InDtlTitledBorder = null;
	public MCScrollPane InDtlScrollPane = null;
	public MCTable2<mcframe.clientMGBF.MGBFP0160.OutDtlR> InDtlTable = null;
	// [InDtl]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_wg_nm = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D InDtl_itm_p_PPanel;
	public MCColumnConfig columnInDtl_itm_cd;// [InDtl]の[itm_p.itm_cd]を[columnInDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnInDtl_itm_sub1;// [InDtl]の[itm_p.itm_sub1]を[columnInDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnInDtl_itm_sub2;// [InDtl]の[itm_p.itm_sub2]を[columnInDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnInDtl_itm_sub3;// [InDtl]の[itm_p.itm_sub3]を[columnInDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnInDtl_itm_nm;// [InDtl]の[itm_p.itm_nm]を[columnInDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_itm_jnl_nm = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_sno4 = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_bp_nm = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ac_rsn_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_asst_typ_nm = null;
	/**
	 * Transfer ratio (%) 振替比率（％）.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_per = null;
	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_mfg_cost_ratio = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D InDtl_qty_p_PPanel;
	public MCColumnConfig columnInDtl_qty;// [InDtl]の[qty_p.qty]を[columnInDtl_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_dec_place = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_upri = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ttl = null;
	public MCColumnConfig columnInDtl_col_000 = null;
	public MCColumnConfig columnInDtl_col_001 = null;
	public MCColumnConfig columnInDtl_col_002 = null;
	public MCColumnConfig columnInDtl_col_003 = null;
	public MCColumnConfig columnInDtl_col_004 = null;
	public MCColumnConfig columnInDtl_col_005 = null;
	public MCColumnConfig columnInDtl_col_006 = null;
	public MCColumnConfig columnInDtl_col_007 = null;
	public MCColumnConfig columnInDtl_col_008 = null;
	public MCColumnConfig columnInDtl_col_009 = null;
	public MCColumnConfig columnInDtl_col_010 = null;
	public MCColumnConfig columnInDtl_col_011 = null;
	public MCColumnConfig columnInDtl_col_012 = null;
	public MCColumnConfig columnInDtl_col_013 = null;
	public MCColumnConfig columnInDtl_col_014 = null;
	public MCColumnConfig columnInDtl_col_015 = null;
	public MCColumnConfig columnInDtl_col_016 = null;
	public MCColumnConfig columnInDtl_col_017 = null;
	public MCColumnConfig columnInDtl_col_018 = null;
	public MCColumnConfig columnInDtl_col_019 = null;
	public MCColumnConfig columnInDtl_col_020 = null;
	public MCColumnConfig columnInDtl_col_021 = null;
	public MCColumnConfig columnInDtl_col_022 = null;
	public MCColumnConfig columnInDtl_col_023 = null;
	public MCColumnConfig columnInDtl_col_024 = null;
	public MCColumnConfig columnInDtl_col_025 = null;
	public MCColumnConfig columnInDtl_col_026 = null;
	public MCColumnConfig columnInDtl_col_027 = null;
	public MCColumnConfig columnInDtl_col_028 = null;
	public MCColumnConfig columnInDtl_col_029 = null;
	public MCColumnConfig columnInDtl_col_030 = null;
	public MCColumnConfig columnInDtl_col_031 = null;
	public MCColumnConfig columnInDtl_col_032 = null;
	public MCColumnConfig columnInDtl_col_033 = null;
	public MCColumnConfig columnInDtl_col_034 = null;
	public MCColumnConfig columnInDtl_col_035 = null;
	public MCColumnConfig columnInDtl_col_036 = null;
	public MCColumnConfig columnInDtl_col_037 = null;
	public MCColumnConfig columnInDtl_col_038 = null;
	public MCColumnConfig columnInDtl_col_039 = null;
	public MCColumnConfig columnInDtl_col_040 = null;
	public MCColumnConfig columnInDtl_col_041 = null;
	public MCColumnConfig columnInDtl_col_042 = null;
	public MCColumnConfig columnInDtl_col_043 = null;
	public MCColumnConfig columnInDtl_col_044 = null;
	public MCColumnConfig columnInDtl_col_045 = null;
	public MCColumnConfig columnInDtl_col_046 = null;
	public MCColumnConfig columnInDtl_col_047 = null;
	public MCColumnConfig columnInDtl_col_048 = null;
	public MCColumnConfig columnInDtl_col_049 = null;
	public MCColumnConfig columnInDtl_col_050 = null;
	public MCColumnConfig columnInDtl_col_051 = null;
	public MCColumnConfig columnInDtl_col_052 = null;
	public MCColumnConfig columnInDtl_col_053 = null;
	public MCColumnConfig columnInDtl_col_054 = null;
	public MCColumnConfig columnInDtl_col_055 = null;
	public MCColumnConfig columnInDtl_col_056 = null;
	public MCColumnConfig columnInDtl_col_057 = null;
	public MCColumnConfig columnInDtl_col_058 = null;
	public MCColumnConfig columnInDtl_col_059 = null;
	public MCColumnConfig columnInDtl_col_060 = null;
	public MCColumnConfig columnInDtl_col_061 = null;
	public MCColumnConfig columnInDtl_col_062 = null;
	public MCColumnConfig columnInDtl_col_063 = null;
	public MCColumnConfig columnInDtl_col_064 = null;
	public MCColumnConfig columnInDtl_col_065 = null;
	public MCColumnConfig columnInDtl_col_066 = null;
	public MCColumnConfig columnInDtl_col_067 = null;
	public MCColumnConfig columnInDtl_col_068 = null;
	public MCColumnConfig columnInDtl_col_069 = null;
	public MCColumnConfig columnInDtl_col_070 = null;
	public MCColumnConfig columnInDtl_col_071 = null;
	public MCColumnConfig columnInDtl_col_072 = null;
	public MCColumnConfig columnInDtl_col_073 = null;
	public MCColumnConfig columnInDtl_col_074 = null;
	public MCColumnConfig columnInDtl_col_075 = null;
	public MCColumnConfig columnInDtl_col_076 = null;
	public MCColumnConfig columnInDtl_col_077 = null;
	public MCColumnConfig columnInDtl_col_078 = null;
	public MCColumnConfig columnInDtl_col_079 = null;
	public MCColumnConfig columnInDtl_col_080 = null;
	public MCColumnConfig columnInDtl_col_081 = null;
	public MCColumnConfig columnInDtl_col_082 = null;
	public MCColumnConfig columnInDtl_col_083 = null;
	public MCColumnConfig columnInDtl_col_084 = null;
	public MCColumnConfig columnInDtl_col_085 = null;
	public MCColumnConfig columnInDtl_col_086 = null;
	public MCColumnConfig columnInDtl_col_087 = null;
	public MCColumnConfig columnInDtl_col_088 = null;
	public MCColumnConfig columnInDtl_col_089 = null;
	public MCColumnConfig columnInDtl_col_090 = null;
	public MCColumnConfig columnInDtl_col_091 = null;
	public MCColumnConfig columnInDtl_col_092 = null;
	public MCColumnConfig columnInDtl_col_093 = null;
	public MCColumnConfig columnInDtl_col_094 = null;
	public MCColumnConfig columnInDtl_col_095 = null;
	public MCColumnConfig columnInDtl_col_096 = null;
	public MCColumnConfig columnInDtl_col_097 = null;
	public MCColumnConfig columnInDtl_col_098 = null;
	public MCColumnConfig columnInDtl_col_099 = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_ym = null;
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_trd_grp = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_calc_grp_cd = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnInDtl_calc_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	public mcframe.clientFSBA.FSBAP0020.FSBAP0020 Btn_sync_p_PPanel;
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
	
	/** [MG_MGBFL0160_Srch01]のCallerの作成 */
	protected MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch01Caller createMG_MGBFL0160_Srch01() {
		MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch01Caller<MGBFP_TrdCostSrch, MG_MGBFL0160_Srch01Bridge>
		caller = ((MGBFP_TrdCostSrch_MC)this).new MG_MGBFL0160_Srch01Caller<MGBFP_TrdCostSrch, MG_MGBFL0160_Srch01Bridge>(
					(MGBFP_TrdCostSrch)this, new MG_MGBFL0160_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0160_Srch01]の呼び出し */
	protected void callMG_MGBFL0160_Srch01() {
		MCCaller caller = createMG_MGBFL0160_Srch01();
		caller.exec();
	}
	/** [MG_MGBFL0160_Srch02]のCallerの作成 */
	protected MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch02Caller createMG_MGBFL0160_Srch02() {
		MGBFP_TrdCostSrch_MC.MG_MGBFL0160_Srch02Caller<MGBFP_TrdCostSrch, MG_MGBFL0160_Srch02Bridge>
		caller = ((MGBFP_TrdCostSrch_MC)this).new MG_MGBFL0160_Srch02Caller<MGBFP_TrdCostSrch, MG_MGBFL0160_Srch02Bridge>(
					(MGBFP_TrdCostSrch)this, new MG_MGBFL0160_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBFL0160_Srch02]の呼び出し */
	protected void callMG_MGBFL0160_Srch02() {
		MCCaller caller = createMG_MGBFL0160_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0160.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0160.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0160.RsltR> aRsltL;
	/** [OutDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> aOutDtlL;
	/** [InDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> aInDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0160.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0160.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBF.MGBFP0160.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0160.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0160.LPnlR createLPnlR() {
		return mcframe.clientMGBF.MGBFP0160.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0160.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0160.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0160.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0160.RsltR.class);
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
	 * コピーによってaOutDtlLを設定します。
	 *
	 * aOutDtlLのインスタンスは変更されません。
	 *
	 * @param dataset OutDtlL
	 */
	public void setOutDtlL(MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> aList) {
		if (getOutDtlL() != aList) {
			getOutDtlL().setAll(aList);
		}
	}

	/**
	 * [OutDtl]ブロックのコンテナaOutDtlLを返します。
	 *
	 * @return OutDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> getOutDtlL() {
		return aOutDtlL;
	}

	/**
	 * aOutDtlRを作成します。
	 *
	 * @return OutDtlR
	 */
	public mcframe.clientMGBF.MGBFP0160.OutDtlR createOutDtlR() {
		return mcframe.clientMGBF.MGBFP0160.OutDtlR.create();
	}

	/**
	 * aOutDtlLを作成します。
	 *
	 * @return OutDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> createOutDtlL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class);
	}

	/**
	 * OutDtlTableを初期化します。
	 */
	protected void createOutDtlTable(){
		if(OutDtlTable == null){
			OutDtlTable = beansFactory.createTable2("OutDtl.table");
		}
	}

	/**
	 * コピーによってaInDtlLを設定します。
	 *
	 * aInDtlLのインスタンスは変更されません。
	 *
	 * @param dataset InDtlL
	 */
	public void setInDtlL(MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> aList) {
		if (getInDtlL() != aList) {
			getInDtlL().setAll(aList);
		}
	}

	/**
	 * [InDtl]ブロックのコンテナaInDtlLを返します。
	 *
	 * @return InDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> getInDtlL() {
		return aInDtlL;
	}

	/**
	 * aInDtlRを作成します。
	 *
	 * @return InDtlR
	 */
	public mcframe.clientMGBF.MGBFP0160.OutDtlR createInDtlR() {
		return mcframe.clientMGBF.MGBFP0160.OutDtlR.create();
	}

	/**
	 * aInDtlLを作成します。
	 *
	 * @return InDtlL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> createInDtlL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class);
	}

	/**
	 * InDtlTableを初期化します。
	 */
	protected void createInDtlTable(){
		if(InDtlTable == null){
			InDtlTable = beansFactory.createTable2("InDtl.table");
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getOutDtlL())) ret.add(getOutDtlL());
		if(!MCCollectionUtil.contains(ret, getInDtlL())) ret.add(getInDtlL());
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
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getOutDtlL()) return "OutDtl";
		if(aCnt == getInDtlL()) return "InDtl";
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
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("OutDtl")) return getOutDtlL();
		if(bId.equals("InDtl")) return getInDtlL();
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
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(OutDtlPanel);
		ret.add(InDtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_TrdCostSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		aOutDtlL = createOutDtlL();
		aInDtlL = createInDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_TrdCostSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aOutDtlL = createOutDtlL();
		createOutDtlTable();
		OutDtlTable.setRowName(name);
		aInDtlL = createInDtlL();
		createInDtlTable();
		InDtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_TrdCostSrch_MC.jbCreateTop((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateCnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateLPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateCtrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateRslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateOutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateInDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbCreateBtn((MGBFP_TrdCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_TrdCostSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_TrdCostSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_TrdCostSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_TrdCostSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBFP_TrdCostSrch p) {
	}

	/**
	 * [OutDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOutDtl(MGBFP_TrdCostSrch p) {
		p.OutDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.$itm_p);
		p.OutDtl_itm_p_PPanel.setName("OutDtl.itm_p");
		p.columnOutDtl_itm_cd = p.OutDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnOutDtl_itm_cd.addAliasName("OutDtl.itm_cd", p);
		p.columnOutDtl_itm_sub1 = p.OutDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnOutDtl_itm_sub1.addAliasName("OutDtl.itm_sub1", p);
		p.columnOutDtl_itm_sub2 = p.OutDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnOutDtl_itm_sub2.addAliasName("OutDtl.itm_sub2", p);
		p.columnOutDtl_itm_sub3 = p.OutDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnOutDtl_itm_sub3.addAliasName("OutDtl.itm_sub3", p);
		p.columnOutDtl_itm_nm = p.OutDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnOutDtl_itm_nm.addAliasName("OutDtl.itm_nm", p);
		p.OutDtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.$qty_p);
		p.OutDtl_qty_p_PPanel.setName("OutDtl.qty_p");
		p.columnOutDtl_qty = p.OutDtl_qty_p_PPanel.columnQty_qty;
		p.columnOutDtl_qty.addAliasName("OutDtl.qty", p);
	}

	/**
	 * [InDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInDtl(MGBFP_TrdCostSrch p) {
		p.InDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.$itm_p);
		p.InDtl_itm_p_PPanel.setName("InDtl.itm_p");
		p.columnInDtl_itm_cd = p.InDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnInDtl_itm_cd.addAliasName("InDtl.itm_cd", p);
		p.columnInDtl_itm_sub1 = p.InDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnInDtl_itm_sub1.addAliasName("InDtl.itm_sub1", p);
		p.columnInDtl_itm_sub2 = p.InDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnInDtl_itm_sub2.addAliasName("InDtl.itm_sub2", p);
		p.columnInDtl_itm_sub3 = p.InDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnInDtl_itm_sub3.addAliasName("InDtl.itm_sub3", p);
		p.columnInDtl_itm_nm = p.InDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnInDtl_itm_nm.addAliasName("InDtl.itm_nm", p);
		p.InDtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.$qty_p);
		p.InDtl_qty_p_PPanel.setName("InDtl.qty_p");
		p.columnInDtl_qty = p.InDtl_qty_p_PPanel.columnQty_qty;
		p.columnInDtl_qty.addAliasName("InDtl.qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBFP_TrdCostSrch p) {
		p.Btn_sync_p_PPanel = mcframe.clientFSBA.FSBAP0020.FSBAP0020.create();
		p.Btn_sync_p_PPanel.setName("Btn.sync_p");
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
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Cnd_ym_ListPutter]の定義 */
	private MCListPutter Cnd_ym_p = null;

	/**
	 * [Cnd_ym_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_ListPutter() {
		if (Cnd_ym_p == null) {
			Cnd_ym_p = createCnd_ym_ListPutter(Cnd_ym, "ym");

		}
		return Cnd_ym_p;
	}
	
	
	/** [OutDtl_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter OutDtl_mng_dpt_cd_p = null;

	/**
	 * [OutDtl_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getOutDtl_mng_dpt_cd_ListPutter() {
		if (OutDtl_mng_dpt_cd_p == null) {
			OutDtl_mng_dpt_cd_p = createOutDtl_mng_dpt_cd_ListPutter(columnOutDtl_mng_dpt_cd, "mng_dpt_cd");

		}
		return OutDtl_mng_dpt_cd_p;
	}
	
	
	/** [InDtl_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter InDtl_mng_dpt_cd_p = null;

	/**
	 * [InDtl_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getInDtl_mng_dpt_cd_ListPutter() {
		if (InDtl_mng_dpt_cd_p == null) {
			InDtl_mng_dpt_cd_p = createInDtl_mng_dpt_cd_ListPutter(columnInDtl_mng_dpt_cd, "mng_dpt_cd");

		}
		return InDtl_mng_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_TrdCostSrch create(){
		MGBFP_TrdCostSrch p = new MGBFP_TrdCostSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_TrdCostSrch create(String name){
		MGBFP_TrdCostSrch p = new MGBFP_TrdCostSrch(name);
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
		MGBFP_TrdCostSrch_MC.jbfInitTop((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitCnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitLPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitCtrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitRslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitOutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitInDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbfInitBtn((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitTop((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitCnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitLPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitCtrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitRslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitOutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitInDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.jbInitBtn((MGBFP_TrdCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateComboBox("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_trd_grp_Label = p.beansFactory.createLabel("Cnd.trd_grp_Label");
		p.Cnd_trd_grp = p.beansFactory.createTextField("Cnd.trd_grp");
		p.Cnd_trd_grp.setLabel(p.Cnd_trd_grp_Label);
		p.Cnd_not_trd_zero_flg = p.beansFactory.createCheckBox("Cnd.not_trd_zero_flg");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_disp_expns_grp = p.beansFactory.createCheckBox("LPnl.disp_expns_grp");
		p.LPnl_disp_expns = p.beansFactory.createCheckBox("LPnl.disp_expns");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_trd_grp = p.beansFactory.createTableColumn("Rslt.trd_grp", MCColumnType.TEXT);
		p.columnRslt_ttl = p.beansFactory.createTableColumn("Rslt.ttl", MCColumnType.NUMBER);
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
		p.columnRslt_calc_grp_cd = p.beansFactory.createTableColumn("Rslt.calc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_calc_no = p.beansFactory.createTableColumn("Rslt.calc_no", MCColumnType.TEXT);
		p.columnRslt_srched_flg = p.beansFactory.createTableColumn("Rslt.srched_flg", MCColumnType.CHECK);
	}

	/**
	 * [OutDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOutDtl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.OutDtlPanel = p.beansFactory.createPanel("OutDtl");
		p.OutDtlTitledBorder = p.beansFactory.createTitledBorder();
		p.OutDtlScrollPane = p.beansFactory.createScrollPane("OutDtl.scroll");
		p.createOutDtlTable();
		// ブロックの項目の初期化
		p.columnOutDtl_wg_cd = p.beansFactory.createTableColumn("OutDtl.wg_cd", MCColumnType.TEXT);
		p.columnOutDtl_wg_nm = p.beansFactory.createTableColumn("OutDtl.wg_nm", MCColumnType.TEXT);
		p.columnOutDtl_mng_dpt_cd = p.beansFactory.createTableColumn("OutDtl.mng_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnOutDtl_mng_dpt_nm = p.beansFactory.createTableColumn("OutDtl.mng_dpt_nm", MCColumnType.TEXT);
		p.columnOutDtl_itm_typ = p.beansFactory.createTableColumn("OutDtl.itm_typ", MCColumnType.TEXT);
		p.columnOutDtl_itm_typ_nm = p.beansFactory.createTableColumn("OutDtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnOutDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("OutDtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnOutDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("OutDtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnOutDtl_itm_jnl_cd = p.beansFactory.createTableColumn("OutDtl.itm_jnl_cd", MCColumnType.TEXT);
		p.columnOutDtl_itm_jnl_nm = p.beansFactory.createTableColumn("OutDtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnOutDtl_lot_no = p.beansFactory.createTableColumn("OutDtl.lot_no", MCColumnType.TEXT);
		p.columnOutDtl_sublot_no = p.beansFactory.createTableColumn("OutDtl.sublot_no", MCColumnType.TEXT);
		p.columnOutDtl_sno1 = p.beansFactory.createTableColumn("OutDtl.sno1", MCColumnType.TEXT);
		p.columnOutDtl_sno2 = p.beansFactory.createTableColumn("OutDtl.sno2", MCColumnType.TEXT);
		p.columnOutDtl_sno3 = p.beansFactory.createTableColumn("OutDtl.sno3", MCColumnType.TEXT);
		p.columnOutDtl_sno4 = p.beansFactory.createTableColumn("OutDtl.sno4", MCColumnType.TEXT);
		p.columnOutDtl_bp_cd = p.beansFactory.createTableColumn("OutDtl.bp_cd", MCColumnType.TEXT);
		p.columnOutDtl_bp_nm = p.beansFactory.createTableColumn("OutDtl.bp_nm", MCColumnType.TEXT);
		p.columnOutDtl_ac_slip_typ = p.beansFactory.createTableColumn("OutDtl.ac_slip_typ", MCColumnType.TEXT);
		p.columnOutDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("OutDtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnOutDtl_ac_rsn_cd = p.beansFactory.createTableColumn("OutDtl.ac_rsn_cd", MCColumnType.TEXT);
		p.columnOutDtl_ac_rsn_nm = p.beansFactory.createTableColumn("OutDtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnOutDtl_asst_typ = p.beansFactory.createTableColumn("OutDtl.asst_typ", MCColumnType.TEXT);
		p.columnOutDtl_asst_typ_nm = p.beansFactory.createTableColumn("OutDtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnOutDtl_per = p.beansFactory.createTableColumn("OutDtl.per", MCColumnType.NUMBER);
		p.columnOutDtl_mfg_cost_ratio = p.beansFactory.createTableColumn("OutDtl.mfg_cost_ratio", MCColumnType.NUMBER);
		p.columnOutDtl_unit_cd = p.beansFactory.createTableColumn("OutDtl.unit_cd", MCColumnType.TEXT);
		p.columnOutDtl_unit_nm = p.beansFactory.createTableColumn("OutDtl.unit_nm", MCColumnType.TEXT);
		p.columnOutDtl_dec_place = p.beansFactory.createTableColumn("OutDtl.dec_place", MCColumnType.NUMBER);
		p.columnOutDtl_upri = p.beansFactory.createTableColumn("OutDtl.upri", MCColumnType.NUMBER);
		p.columnOutDtl_ttl = p.beansFactory.createTableColumn("OutDtl.ttl", MCColumnType.NUMBER);
		p.columnOutDtl_col_000 = p.beansFactory.createTableColumn("OutDtl.col_000", MCColumnType.NUMBER);
		p.columnOutDtl_col_001 = p.beansFactory.createTableColumn("OutDtl.col_001", MCColumnType.NUMBER);
		p.columnOutDtl_col_002 = p.beansFactory.createTableColumn("OutDtl.col_002", MCColumnType.NUMBER);
		p.columnOutDtl_col_003 = p.beansFactory.createTableColumn("OutDtl.col_003", MCColumnType.NUMBER);
		p.columnOutDtl_col_004 = p.beansFactory.createTableColumn("OutDtl.col_004", MCColumnType.NUMBER);
		p.columnOutDtl_col_005 = p.beansFactory.createTableColumn("OutDtl.col_005", MCColumnType.NUMBER);
		p.columnOutDtl_col_006 = p.beansFactory.createTableColumn("OutDtl.col_006", MCColumnType.NUMBER);
		p.columnOutDtl_col_007 = p.beansFactory.createTableColumn("OutDtl.col_007", MCColumnType.NUMBER);
		p.columnOutDtl_col_008 = p.beansFactory.createTableColumn("OutDtl.col_008", MCColumnType.NUMBER);
		p.columnOutDtl_col_009 = p.beansFactory.createTableColumn("OutDtl.col_009", MCColumnType.NUMBER);
		p.columnOutDtl_col_010 = p.beansFactory.createTableColumn("OutDtl.col_010", MCColumnType.NUMBER);
		p.columnOutDtl_col_011 = p.beansFactory.createTableColumn("OutDtl.col_011", MCColumnType.NUMBER);
		p.columnOutDtl_col_012 = p.beansFactory.createTableColumn("OutDtl.col_012", MCColumnType.NUMBER);
		p.columnOutDtl_col_013 = p.beansFactory.createTableColumn("OutDtl.col_013", MCColumnType.NUMBER);
		p.columnOutDtl_col_014 = p.beansFactory.createTableColumn("OutDtl.col_014", MCColumnType.NUMBER);
		p.columnOutDtl_col_015 = p.beansFactory.createTableColumn("OutDtl.col_015", MCColumnType.NUMBER);
		p.columnOutDtl_col_016 = p.beansFactory.createTableColumn("OutDtl.col_016", MCColumnType.NUMBER);
		p.columnOutDtl_col_017 = p.beansFactory.createTableColumn("OutDtl.col_017", MCColumnType.NUMBER);
		p.columnOutDtl_col_018 = p.beansFactory.createTableColumn("OutDtl.col_018", MCColumnType.NUMBER);
		p.columnOutDtl_col_019 = p.beansFactory.createTableColumn("OutDtl.col_019", MCColumnType.NUMBER);
		p.columnOutDtl_col_020 = p.beansFactory.createTableColumn("OutDtl.col_020", MCColumnType.NUMBER);
		p.columnOutDtl_col_021 = p.beansFactory.createTableColumn("OutDtl.col_021", MCColumnType.NUMBER);
		p.columnOutDtl_col_022 = p.beansFactory.createTableColumn("OutDtl.col_022", MCColumnType.NUMBER);
		p.columnOutDtl_col_023 = p.beansFactory.createTableColumn("OutDtl.col_023", MCColumnType.NUMBER);
		p.columnOutDtl_col_024 = p.beansFactory.createTableColumn("OutDtl.col_024", MCColumnType.NUMBER);
		p.columnOutDtl_col_025 = p.beansFactory.createTableColumn("OutDtl.col_025", MCColumnType.NUMBER);
		p.columnOutDtl_col_026 = p.beansFactory.createTableColumn("OutDtl.col_026", MCColumnType.NUMBER);
		p.columnOutDtl_col_027 = p.beansFactory.createTableColumn("OutDtl.col_027", MCColumnType.NUMBER);
		p.columnOutDtl_col_028 = p.beansFactory.createTableColumn("OutDtl.col_028", MCColumnType.NUMBER);
		p.columnOutDtl_col_029 = p.beansFactory.createTableColumn("OutDtl.col_029", MCColumnType.NUMBER);
		p.columnOutDtl_col_030 = p.beansFactory.createTableColumn("OutDtl.col_030", MCColumnType.NUMBER);
		p.columnOutDtl_col_031 = p.beansFactory.createTableColumn("OutDtl.col_031", MCColumnType.NUMBER);
		p.columnOutDtl_col_032 = p.beansFactory.createTableColumn("OutDtl.col_032", MCColumnType.NUMBER);
		p.columnOutDtl_col_033 = p.beansFactory.createTableColumn("OutDtl.col_033", MCColumnType.NUMBER);
		p.columnOutDtl_col_034 = p.beansFactory.createTableColumn("OutDtl.col_034", MCColumnType.NUMBER);
		p.columnOutDtl_col_035 = p.beansFactory.createTableColumn("OutDtl.col_035", MCColumnType.NUMBER);
		p.columnOutDtl_col_036 = p.beansFactory.createTableColumn("OutDtl.col_036", MCColumnType.NUMBER);
		p.columnOutDtl_col_037 = p.beansFactory.createTableColumn("OutDtl.col_037", MCColumnType.NUMBER);
		p.columnOutDtl_col_038 = p.beansFactory.createTableColumn("OutDtl.col_038", MCColumnType.NUMBER);
		p.columnOutDtl_col_039 = p.beansFactory.createTableColumn("OutDtl.col_039", MCColumnType.NUMBER);
		p.columnOutDtl_col_040 = p.beansFactory.createTableColumn("OutDtl.col_040", MCColumnType.NUMBER);
		p.columnOutDtl_col_041 = p.beansFactory.createTableColumn("OutDtl.col_041", MCColumnType.NUMBER);
		p.columnOutDtl_col_042 = p.beansFactory.createTableColumn("OutDtl.col_042", MCColumnType.NUMBER);
		p.columnOutDtl_col_043 = p.beansFactory.createTableColumn("OutDtl.col_043", MCColumnType.NUMBER);
		p.columnOutDtl_col_044 = p.beansFactory.createTableColumn("OutDtl.col_044", MCColumnType.NUMBER);
		p.columnOutDtl_col_045 = p.beansFactory.createTableColumn("OutDtl.col_045", MCColumnType.NUMBER);
		p.columnOutDtl_col_046 = p.beansFactory.createTableColumn("OutDtl.col_046", MCColumnType.NUMBER);
		p.columnOutDtl_col_047 = p.beansFactory.createTableColumn("OutDtl.col_047", MCColumnType.NUMBER);
		p.columnOutDtl_col_048 = p.beansFactory.createTableColumn("OutDtl.col_048", MCColumnType.NUMBER);
		p.columnOutDtl_col_049 = p.beansFactory.createTableColumn("OutDtl.col_049", MCColumnType.NUMBER);
		p.columnOutDtl_col_050 = p.beansFactory.createTableColumn("OutDtl.col_050", MCColumnType.NUMBER);
		p.columnOutDtl_col_051 = p.beansFactory.createTableColumn("OutDtl.col_051", MCColumnType.NUMBER);
		p.columnOutDtl_col_052 = p.beansFactory.createTableColumn("OutDtl.col_052", MCColumnType.NUMBER);
		p.columnOutDtl_col_053 = p.beansFactory.createTableColumn("OutDtl.col_053", MCColumnType.NUMBER);
		p.columnOutDtl_col_054 = p.beansFactory.createTableColumn("OutDtl.col_054", MCColumnType.NUMBER);
		p.columnOutDtl_col_055 = p.beansFactory.createTableColumn("OutDtl.col_055", MCColumnType.NUMBER);
		p.columnOutDtl_col_056 = p.beansFactory.createTableColumn("OutDtl.col_056", MCColumnType.NUMBER);
		p.columnOutDtl_col_057 = p.beansFactory.createTableColumn("OutDtl.col_057", MCColumnType.NUMBER);
		p.columnOutDtl_col_058 = p.beansFactory.createTableColumn("OutDtl.col_058", MCColumnType.NUMBER);
		p.columnOutDtl_col_059 = p.beansFactory.createTableColumn("OutDtl.col_059", MCColumnType.NUMBER);
		p.columnOutDtl_col_060 = p.beansFactory.createTableColumn("OutDtl.col_060", MCColumnType.NUMBER);
		p.columnOutDtl_col_061 = p.beansFactory.createTableColumn("OutDtl.col_061", MCColumnType.NUMBER);
		p.columnOutDtl_col_062 = p.beansFactory.createTableColumn("OutDtl.col_062", MCColumnType.NUMBER);
		p.columnOutDtl_col_063 = p.beansFactory.createTableColumn("OutDtl.col_063", MCColumnType.NUMBER);
		p.columnOutDtl_col_064 = p.beansFactory.createTableColumn("OutDtl.col_064", MCColumnType.NUMBER);
		p.columnOutDtl_col_065 = p.beansFactory.createTableColumn("OutDtl.col_065", MCColumnType.NUMBER);
		p.columnOutDtl_col_066 = p.beansFactory.createTableColumn("OutDtl.col_066", MCColumnType.NUMBER);
		p.columnOutDtl_col_067 = p.beansFactory.createTableColumn("OutDtl.col_067", MCColumnType.NUMBER);
		p.columnOutDtl_col_068 = p.beansFactory.createTableColumn("OutDtl.col_068", MCColumnType.NUMBER);
		p.columnOutDtl_col_069 = p.beansFactory.createTableColumn("OutDtl.col_069", MCColumnType.NUMBER);
		p.columnOutDtl_col_070 = p.beansFactory.createTableColumn("OutDtl.col_070", MCColumnType.NUMBER);
		p.columnOutDtl_col_071 = p.beansFactory.createTableColumn("OutDtl.col_071", MCColumnType.NUMBER);
		p.columnOutDtl_col_072 = p.beansFactory.createTableColumn("OutDtl.col_072", MCColumnType.NUMBER);
		p.columnOutDtl_col_073 = p.beansFactory.createTableColumn("OutDtl.col_073", MCColumnType.NUMBER);
		p.columnOutDtl_col_074 = p.beansFactory.createTableColumn("OutDtl.col_074", MCColumnType.NUMBER);
		p.columnOutDtl_col_075 = p.beansFactory.createTableColumn("OutDtl.col_075", MCColumnType.NUMBER);
		p.columnOutDtl_col_076 = p.beansFactory.createTableColumn("OutDtl.col_076", MCColumnType.NUMBER);
		p.columnOutDtl_col_077 = p.beansFactory.createTableColumn("OutDtl.col_077", MCColumnType.NUMBER);
		p.columnOutDtl_col_078 = p.beansFactory.createTableColumn("OutDtl.col_078", MCColumnType.NUMBER);
		p.columnOutDtl_col_079 = p.beansFactory.createTableColumn("OutDtl.col_079", MCColumnType.NUMBER);
		p.columnOutDtl_col_080 = p.beansFactory.createTableColumn("OutDtl.col_080", MCColumnType.NUMBER);
		p.columnOutDtl_col_081 = p.beansFactory.createTableColumn("OutDtl.col_081", MCColumnType.NUMBER);
		p.columnOutDtl_col_082 = p.beansFactory.createTableColumn("OutDtl.col_082", MCColumnType.NUMBER);
		p.columnOutDtl_col_083 = p.beansFactory.createTableColumn("OutDtl.col_083", MCColumnType.NUMBER);
		p.columnOutDtl_col_084 = p.beansFactory.createTableColumn("OutDtl.col_084", MCColumnType.NUMBER);
		p.columnOutDtl_col_085 = p.beansFactory.createTableColumn("OutDtl.col_085", MCColumnType.NUMBER);
		p.columnOutDtl_col_086 = p.beansFactory.createTableColumn("OutDtl.col_086", MCColumnType.NUMBER);
		p.columnOutDtl_col_087 = p.beansFactory.createTableColumn("OutDtl.col_087", MCColumnType.NUMBER);
		p.columnOutDtl_col_088 = p.beansFactory.createTableColumn("OutDtl.col_088", MCColumnType.NUMBER);
		p.columnOutDtl_col_089 = p.beansFactory.createTableColumn("OutDtl.col_089", MCColumnType.NUMBER);
		p.columnOutDtl_col_090 = p.beansFactory.createTableColumn("OutDtl.col_090", MCColumnType.NUMBER);
		p.columnOutDtl_col_091 = p.beansFactory.createTableColumn("OutDtl.col_091", MCColumnType.NUMBER);
		p.columnOutDtl_col_092 = p.beansFactory.createTableColumn("OutDtl.col_092", MCColumnType.NUMBER);
		p.columnOutDtl_col_093 = p.beansFactory.createTableColumn("OutDtl.col_093", MCColumnType.NUMBER);
		p.columnOutDtl_col_094 = p.beansFactory.createTableColumn("OutDtl.col_094", MCColumnType.NUMBER);
		p.columnOutDtl_col_095 = p.beansFactory.createTableColumn("OutDtl.col_095", MCColumnType.NUMBER);
		p.columnOutDtl_col_096 = p.beansFactory.createTableColumn("OutDtl.col_096", MCColumnType.NUMBER);
		p.columnOutDtl_col_097 = p.beansFactory.createTableColumn("OutDtl.col_097", MCColumnType.NUMBER);
		p.columnOutDtl_col_098 = p.beansFactory.createTableColumn("OutDtl.col_098", MCColumnType.NUMBER);
		p.columnOutDtl_col_099 = p.beansFactory.createTableColumn("OutDtl.col_099", MCColumnType.NUMBER);
		p.columnOutDtl_ym = p.beansFactory.createTableColumn("OutDtl.ym", MCColumnType.DATE);
		p.columnOutDtl_trd_grp = p.beansFactory.createTableColumn("OutDtl.trd_grp", MCColumnType.TEXT);
		p.columnOutDtl_calc_grp_cd = p.beansFactory.createTableColumn("OutDtl.calc_grp_cd", MCColumnType.TEXT);
		p.columnOutDtl_calc_no = p.beansFactory.createTableColumn("OutDtl.calc_no", MCColumnType.TEXT);
	}

	/**
	 * [InDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInDtl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.InDtlPanel = p.beansFactory.createPanel("InDtl");
		p.InDtlTitledBorder = p.beansFactory.createTitledBorder();
		p.InDtlScrollPane = p.beansFactory.createScrollPane("InDtl.scroll");
		p.createInDtlTable();
		// ブロックの項目の初期化
		p.columnInDtl_wg_cd = p.beansFactory.createTableColumn("InDtl.wg_cd", MCColumnType.TEXT);
		p.columnInDtl_wg_nm = p.beansFactory.createTableColumn("InDtl.wg_nm", MCColumnType.TEXT);
		p.columnInDtl_mng_dpt_cd = p.beansFactory.createTableColumn("InDtl.mng_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnInDtl_mng_dpt_nm = p.beansFactory.createTableColumn("InDtl.mng_dpt_nm", MCColumnType.TEXT);
		p.columnInDtl_itm_typ = p.beansFactory.createTableColumn("InDtl.itm_typ", MCColumnType.TEXT);
		p.columnInDtl_itm_typ_nm = p.beansFactory.createTableColumn("InDtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnInDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("InDtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnInDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("InDtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnInDtl_itm_jnl_cd = p.beansFactory.createTableColumn("InDtl.itm_jnl_cd", MCColumnType.TEXT);
		p.columnInDtl_itm_jnl_nm = p.beansFactory.createTableColumn("InDtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnInDtl_lot_no = p.beansFactory.createTableColumn("InDtl.lot_no", MCColumnType.TEXT);
		p.columnInDtl_sublot_no = p.beansFactory.createTableColumn("InDtl.sublot_no", MCColumnType.TEXT);
		p.columnInDtl_sno1 = p.beansFactory.createTableColumn("InDtl.sno1", MCColumnType.TEXT);
		p.columnInDtl_sno2 = p.beansFactory.createTableColumn("InDtl.sno2", MCColumnType.TEXT);
		p.columnInDtl_sno3 = p.beansFactory.createTableColumn("InDtl.sno3", MCColumnType.TEXT);
		p.columnInDtl_sno4 = p.beansFactory.createTableColumn("InDtl.sno4", MCColumnType.TEXT);
		p.columnInDtl_bp_cd = p.beansFactory.createTableColumn("InDtl.bp_cd", MCColumnType.TEXT);
		p.columnInDtl_bp_nm = p.beansFactory.createTableColumn("InDtl.bp_nm", MCColumnType.TEXT);
		p.columnInDtl_ac_slip_typ = p.beansFactory.createTableColumn("InDtl.ac_slip_typ", MCColumnType.TEXT);
		p.columnInDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("InDtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnInDtl_ac_rsn_cd = p.beansFactory.createTableColumn("InDtl.ac_rsn_cd", MCColumnType.TEXT);
		p.columnInDtl_ac_rsn_nm = p.beansFactory.createTableColumn("InDtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnInDtl_asst_typ = p.beansFactory.createTableColumn("InDtl.asst_typ", MCColumnType.TEXT);
		p.columnInDtl_asst_typ_nm = p.beansFactory.createTableColumn("InDtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnInDtl_per = p.beansFactory.createTableColumn("InDtl.per", MCColumnType.NUMBER);
		p.columnInDtl_mfg_cost_ratio = p.beansFactory.createTableColumn("InDtl.mfg_cost_ratio", MCColumnType.NUMBER);
		p.columnInDtl_unit_cd = p.beansFactory.createTableColumn("InDtl.unit_cd", MCColumnType.TEXT);
		p.columnInDtl_unit_nm = p.beansFactory.createTableColumn("InDtl.unit_nm", MCColumnType.TEXT);
		p.columnInDtl_dec_place = p.beansFactory.createTableColumn("InDtl.dec_place", MCColumnType.NUMBER);
		p.columnInDtl_upri = p.beansFactory.createTableColumn("InDtl.upri", MCColumnType.NUMBER);
		p.columnInDtl_ttl = p.beansFactory.createTableColumn("InDtl.ttl", MCColumnType.NUMBER);
		p.columnInDtl_col_000 = p.beansFactory.createTableColumn("InDtl.col_000", MCColumnType.NUMBER);
		p.columnInDtl_col_001 = p.beansFactory.createTableColumn("InDtl.col_001", MCColumnType.NUMBER);
		p.columnInDtl_col_002 = p.beansFactory.createTableColumn("InDtl.col_002", MCColumnType.NUMBER);
		p.columnInDtl_col_003 = p.beansFactory.createTableColumn("InDtl.col_003", MCColumnType.NUMBER);
		p.columnInDtl_col_004 = p.beansFactory.createTableColumn("InDtl.col_004", MCColumnType.NUMBER);
		p.columnInDtl_col_005 = p.beansFactory.createTableColumn("InDtl.col_005", MCColumnType.NUMBER);
		p.columnInDtl_col_006 = p.beansFactory.createTableColumn("InDtl.col_006", MCColumnType.NUMBER);
		p.columnInDtl_col_007 = p.beansFactory.createTableColumn("InDtl.col_007", MCColumnType.NUMBER);
		p.columnInDtl_col_008 = p.beansFactory.createTableColumn("InDtl.col_008", MCColumnType.NUMBER);
		p.columnInDtl_col_009 = p.beansFactory.createTableColumn("InDtl.col_009", MCColumnType.NUMBER);
		p.columnInDtl_col_010 = p.beansFactory.createTableColumn("InDtl.col_010", MCColumnType.NUMBER);
		p.columnInDtl_col_011 = p.beansFactory.createTableColumn("InDtl.col_011", MCColumnType.NUMBER);
		p.columnInDtl_col_012 = p.beansFactory.createTableColumn("InDtl.col_012", MCColumnType.NUMBER);
		p.columnInDtl_col_013 = p.beansFactory.createTableColumn("InDtl.col_013", MCColumnType.NUMBER);
		p.columnInDtl_col_014 = p.beansFactory.createTableColumn("InDtl.col_014", MCColumnType.NUMBER);
		p.columnInDtl_col_015 = p.beansFactory.createTableColumn("InDtl.col_015", MCColumnType.NUMBER);
		p.columnInDtl_col_016 = p.beansFactory.createTableColumn("InDtl.col_016", MCColumnType.NUMBER);
		p.columnInDtl_col_017 = p.beansFactory.createTableColumn("InDtl.col_017", MCColumnType.NUMBER);
		p.columnInDtl_col_018 = p.beansFactory.createTableColumn("InDtl.col_018", MCColumnType.NUMBER);
		p.columnInDtl_col_019 = p.beansFactory.createTableColumn("InDtl.col_019", MCColumnType.NUMBER);
		p.columnInDtl_col_020 = p.beansFactory.createTableColumn("InDtl.col_020", MCColumnType.NUMBER);
		p.columnInDtl_col_021 = p.beansFactory.createTableColumn("InDtl.col_021", MCColumnType.NUMBER);
		p.columnInDtl_col_022 = p.beansFactory.createTableColumn("InDtl.col_022", MCColumnType.NUMBER);
		p.columnInDtl_col_023 = p.beansFactory.createTableColumn("InDtl.col_023", MCColumnType.NUMBER);
		p.columnInDtl_col_024 = p.beansFactory.createTableColumn("InDtl.col_024", MCColumnType.NUMBER);
		p.columnInDtl_col_025 = p.beansFactory.createTableColumn("InDtl.col_025", MCColumnType.NUMBER);
		p.columnInDtl_col_026 = p.beansFactory.createTableColumn("InDtl.col_026", MCColumnType.NUMBER);
		p.columnInDtl_col_027 = p.beansFactory.createTableColumn("InDtl.col_027", MCColumnType.NUMBER);
		p.columnInDtl_col_028 = p.beansFactory.createTableColumn("InDtl.col_028", MCColumnType.NUMBER);
		p.columnInDtl_col_029 = p.beansFactory.createTableColumn("InDtl.col_029", MCColumnType.NUMBER);
		p.columnInDtl_col_030 = p.beansFactory.createTableColumn("InDtl.col_030", MCColumnType.NUMBER);
		p.columnInDtl_col_031 = p.beansFactory.createTableColumn("InDtl.col_031", MCColumnType.NUMBER);
		p.columnInDtl_col_032 = p.beansFactory.createTableColumn("InDtl.col_032", MCColumnType.NUMBER);
		p.columnInDtl_col_033 = p.beansFactory.createTableColumn("InDtl.col_033", MCColumnType.NUMBER);
		p.columnInDtl_col_034 = p.beansFactory.createTableColumn("InDtl.col_034", MCColumnType.NUMBER);
		p.columnInDtl_col_035 = p.beansFactory.createTableColumn("InDtl.col_035", MCColumnType.NUMBER);
		p.columnInDtl_col_036 = p.beansFactory.createTableColumn("InDtl.col_036", MCColumnType.NUMBER);
		p.columnInDtl_col_037 = p.beansFactory.createTableColumn("InDtl.col_037", MCColumnType.NUMBER);
		p.columnInDtl_col_038 = p.beansFactory.createTableColumn("InDtl.col_038", MCColumnType.NUMBER);
		p.columnInDtl_col_039 = p.beansFactory.createTableColumn("InDtl.col_039", MCColumnType.NUMBER);
		p.columnInDtl_col_040 = p.beansFactory.createTableColumn("InDtl.col_040", MCColumnType.NUMBER);
		p.columnInDtl_col_041 = p.beansFactory.createTableColumn("InDtl.col_041", MCColumnType.NUMBER);
		p.columnInDtl_col_042 = p.beansFactory.createTableColumn("InDtl.col_042", MCColumnType.NUMBER);
		p.columnInDtl_col_043 = p.beansFactory.createTableColumn("InDtl.col_043", MCColumnType.NUMBER);
		p.columnInDtl_col_044 = p.beansFactory.createTableColumn("InDtl.col_044", MCColumnType.NUMBER);
		p.columnInDtl_col_045 = p.beansFactory.createTableColumn("InDtl.col_045", MCColumnType.NUMBER);
		p.columnInDtl_col_046 = p.beansFactory.createTableColumn("InDtl.col_046", MCColumnType.NUMBER);
		p.columnInDtl_col_047 = p.beansFactory.createTableColumn("InDtl.col_047", MCColumnType.NUMBER);
		p.columnInDtl_col_048 = p.beansFactory.createTableColumn("InDtl.col_048", MCColumnType.NUMBER);
		p.columnInDtl_col_049 = p.beansFactory.createTableColumn("InDtl.col_049", MCColumnType.NUMBER);
		p.columnInDtl_col_050 = p.beansFactory.createTableColumn("InDtl.col_050", MCColumnType.NUMBER);
		p.columnInDtl_col_051 = p.beansFactory.createTableColumn("InDtl.col_051", MCColumnType.NUMBER);
		p.columnInDtl_col_052 = p.beansFactory.createTableColumn("InDtl.col_052", MCColumnType.NUMBER);
		p.columnInDtl_col_053 = p.beansFactory.createTableColumn("InDtl.col_053", MCColumnType.NUMBER);
		p.columnInDtl_col_054 = p.beansFactory.createTableColumn("InDtl.col_054", MCColumnType.NUMBER);
		p.columnInDtl_col_055 = p.beansFactory.createTableColumn("InDtl.col_055", MCColumnType.NUMBER);
		p.columnInDtl_col_056 = p.beansFactory.createTableColumn("InDtl.col_056", MCColumnType.NUMBER);
		p.columnInDtl_col_057 = p.beansFactory.createTableColumn("InDtl.col_057", MCColumnType.NUMBER);
		p.columnInDtl_col_058 = p.beansFactory.createTableColumn("InDtl.col_058", MCColumnType.NUMBER);
		p.columnInDtl_col_059 = p.beansFactory.createTableColumn("InDtl.col_059", MCColumnType.NUMBER);
		p.columnInDtl_col_060 = p.beansFactory.createTableColumn("InDtl.col_060", MCColumnType.NUMBER);
		p.columnInDtl_col_061 = p.beansFactory.createTableColumn("InDtl.col_061", MCColumnType.NUMBER);
		p.columnInDtl_col_062 = p.beansFactory.createTableColumn("InDtl.col_062", MCColumnType.NUMBER);
		p.columnInDtl_col_063 = p.beansFactory.createTableColumn("InDtl.col_063", MCColumnType.NUMBER);
		p.columnInDtl_col_064 = p.beansFactory.createTableColumn("InDtl.col_064", MCColumnType.NUMBER);
		p.columnInDtl_col_065 = p.beansFactory.createTableColumn("InDtl.col_065", MCColumnType.NUMBER);
		p.columnInDtl_col_066 = p.beansFactory.createTableColumn("InDtl.col_066", MCColumnType.NUMBER);
		p.columnInDtl_col_067 = p.beansFactory.createTableColumn("InDtl.col_067", MCColumnType.NUMBER);
		p.columnInDtl_col_068 = p.beansFactory.createTableColumn("InDtl.col_068", MCColumnType.NUMBER);
		p.columnInDtl_col_069 = p.beansFactory.createTableColumn("InDtl.col_069", MCColumnType.NUMBER);
		p.columnInDtl_col_070 = p.beansFactory.createTableColumn("InDtl.col_070", MCColumnType.NUMBER);
		p.columnInDtl_col_071 = p.beansFactory.createTableColumn("InDtl.col_071", MCColumnType.NUMBER);
		p.columnInDtl_col_072 = p.beansFactory.createTableColumn("InDtl.col_072", MCColumnType.NUMBER);
		p.columnInDtl_col_073 = p.beansFactory.createTableColumn("InDtl.col_073", MCColumnType.NUMBER);
		p.columnInDtl_col_074 = p.beansFactory.createTableColumn("InDtl.col_074", MCColumnType.NUMBER);
		p.columnInDtl_col_075 = p.beansFactory.createTableColumn("InDtl.col_075", MCColumnType.NUMBER);
		p.columnInDtl_col_076 = p.beansFactory.createTableColumn("InDtl.col_076", MCColumnType.NUMBER);
		p.columnInDtl_col_077 = p.beansFactory.createTableColumn("InDtl.col_077", MCColumnType.NUMBER);
		p.columnInDtl_col_078 = p.beansFactory.createTableColumn("InDtl.col_078", MCColumnType.NUMBER);
		p.columnInDtl_col_079 = p.beansFactory.createTableColumn("InDtl.col_079", MCColumnType.NUMBER);
		p.columnInDtl_col_080 = p.beansFactory.createTableColumn("InDtl.col_080", MCColumnType.NUMBER);
		p.columnInDtl_col_081 = p.beansFactory.createTableColumn("InDtl.col_081", MCColumnType.NUMBER);
		p.columnInDtl_col_082 = p.beansFactory.createTableColumn("InDtl.col_082", MCColumnType.NUMBER);
		p.columnInDtl_col_083 = p.beansFactory.createTableColumn("InDtl.col_083", MCColumnType.NUMBER);
		p.columnInDtl_col_084 = p.beansFactory.createTableColumn("InDtl.col_084", MCColumnType.NUMBER);
		p.columnInDtl_col_085 = p.beansFactory.createTableColumn("InDtl.col_085", MCColumnType.NUMBER);
		p.columnInDtl_col_086 = p.beansFactory.createTableColumn("InDtl.col_086", MCColumnType.NUMBER);
		p.columnInDtl_col_087 = p.beansFactory.createTableColumn("InDtl.col_087", MCColumnType.NUMBER);
		p.columnInDtl_col_088 = p.beansFactory.createTableColumn("InDtl.col_088", MCColumnType.NUMBER);
		p.columnInDtl_col_089 = p.beansFactory.createTableColumn("InDtl.col_089", MCColumnType.NUMBER);
		p.columnInDtl_col_090 = p.beansFactory.createTableColumn("InDtl.col_090", MCColumnType.NUMBER);
		p.columnInDtl_col_091 = p.beansFactory.createTableColumn("InDtl.col_091", MCColumnType.NUMBER);
		p.columnInDtl_col_092 = p.beansFactory.createTableColumn("InDtl.col_092", MCColumnType.NUMBER);
		p.columnInDtl_col_093 = p.beansFactory.createTableColumn("InDtl.col_093", MCColumnType.NUMBER);
		p.columnInDtl_col_094 = p.beansFactory.createTableColumn("InDtl.col_094", MCColumnType.NUMBER);
		p.columnInDtl_col_095 = p.beansFactory.createTableColumn("InDtl.col_095", MCColumnType.NUMBER);
		p.columnInDtl_col_096 = p.beansFactory.createTableColumn("InDtl.col_096", MCColumnType.NUMBER);
		p.columnInDtl_col_097 = p.beansFactory.createTableColumn("InDtl.col_097", MCColumnType.NUMBER);
		p.columnInDtl_col_098 = p.beansFactory.createTableColumn("InDtl.col_098", MCColumnType.NUMBER);
		p.columnInDtl_col_099 = p.beansFactory.createTableColumn("InDtl.col_099", MCColumnType.NUMBER);
		p.columnInDtl_ym = p.beansFactory.createTableColumn("InDtl.ym", MCColumnType.DATE);
		p.columnInDtl_trd_grp = p.beansFactory.createTableColumn("InDtl.trd_grp", MCColumnType.TEXT);
		p.columnInDtl_calc_grp_cd = p.beansFactory.createTableColumn("InDtl.calc_grp_cd", MCColumnType.TEXT);
		p.columnInDtl_calc_no = p.beansFactory.createTableColumn("InDtl.calc_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0160.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0160.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_ym);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_calc_no_p_PPanel.CalcNo_calc_no, true);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.Cnd_ym.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_trd_grp);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0160.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_trd_grp_Label);
		p.CndPanel.add(p.Cnd_trd_grp);
		p.Cnd_trd_grp.setNextBeans(p.Cnd_not_trd_zero_flg);
		p.Cnd_trd_grp.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0160.CndR.trd_grp_META);
		p.setPluralValueEnable(p.Cnd_trd_grp, true);
		p.CndPanel.add(p.Cnd_not_trd_zero_flg);
		p.Cnd_not_trd_zero_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0160.CndR.not_trd_zero_flg_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_disp_expns_grp);
		p.LPnlPanel.setLastBeans(p.LPnl_disp_expns_grp);
		p.LPnl_disp_expns_grp.setNextBeans(p.LPnl_disp_expns);
		p.LPnl_disp_expns_grp.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0160.LPnlR.disp_expns_grp_META);
		p.LPnlPanel.add(p.LPnl_disp_expns);
		p.LPnl_disp_expns.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0160.LPnlR.disp_expns_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_TrdCostSrch p) {
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
	protected static void jbInitRslt(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.OutDtlPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [OutDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOutDtl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.OutDtlPanel.setBorder(p.OutDtlTitledBorder);
		p.add(p.OutDtlPanel);
		p.OutDtlPanel.setNextBeans(p.InDtlPanel);
		p.OutDtlPanel.add(p.OutDtlScrollPane);
		p.OutDtlPanel.setLastBeans(p.OutDtlTable);
		p.OutDtlScrollPane.setViewportView(p.OutDtlTable);
		p.OutDtlTable.setList(p.getOutDtlL());
		p.OutDtlTable.setStatusColumnVisible(false);
		p.OutDtlPanel.setLayoutPosition("CBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [InDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInDtl(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.InDtlPanel.setBorder(p.InDtlTitledBorder);
		p.add(p.InDtlPanel);
		p.InDtlPanel.setNextBeans(p.BtnPanel);
		p.InDtlPanel.add(p.InDtlScrollPane);
		p.InDtlPanel.setLastBeans(p.InDtlTable);
		p.InDtlScrollPane.setViewportView(p.InDtlTable);
		p.InDtlTable.setList(p.getInDtlL());
		p.InDtlTable.setStatusColumnVisible(false);
		p.InDtlPanel.setLayoutPosition("CBCBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBFP_TrdCostSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_sync_p_PPanel);
		p.BtnPanel.setLastBeans(p.Btn_sync_p_PPanel);
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
		MGBFP_TrdCostSrch_MC.mcInitTop((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitCnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitLPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitCtrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitRslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitOutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitInDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.mcInitBtn((MGBFP_TrdCostSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_TrdCostSrch_MC.statusInitSRCH_Top((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_Cnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_LPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_Ctrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_Rslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_OutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_InDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitSRCH_Btn((MGBFP_TrdCostSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_TrdCostSrch_MC.statusInitREF_Top((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_Cnd((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_LPnl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_Ctrl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_Rslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_OutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_InDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.statusInitREF_Btn((MGBFP_TrdCostSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_TrdCostSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_TrdCostSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_trd_grp.setListListener(p);
		p.Cnd_trd_grp.addAllListener(p);
		p.Cnd_not_trd_zero_flg.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_TrdCostSrch p) {
		p.LPnl_disp_expns_grp.addAllListener(p);
		p.LPnl_disp_expns.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_TrdCostSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBFP_TrdCostSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_trd_grp.addAllListener(p);
		p.columnRslt_trd_grp.setListListener(p);
		p.columnRslt_ttl.addAllListener(p);
		p.columnRslt_ttl.setListListener(p);
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
		p.columnRslt_calc_grp_cd.addAllListener(p);
		p.columnRslt_calc_grp_cd.setListListener(p);
		p.columnRslt_calc_no.addAllListener(p);
		p.columnRslt_calc_no.setListListener(p);
		p.columnRslt_srched_flg.addAllListener(p);
	}

	/**
	 *  [OutDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOutDtl(MGBFP_TrdCostSrch p) {
		p.OutDtlTable.addAllListener(p);
		p.columnOutDtl_wg_cd.addAllListener(p);
		p.columnOutDtl_wg_cd.setListListener(p);
		p.columnOutDtl_wg_nm.addAllListener(p);
		p.columnOutDtl_wg_nm.setListListener(p);
		p.columnOutDtl_mng_dpt_cd.addAllListener(p);
		p.columnOutDtl_mng_dpt_cd.setListListener(p);
		p.columnOutDtl_mng_dpt_nm.addAllListener(p);
		p.columnOutDtl_mng_dpt_nm.setListListener(p);
		p.columnOutDtl_itm_typ.addAllListener(p);
		p.columnOutDtl_itm_typ.setListListener(p);
		p.columnOutDtl_itm_typ_nm.addAllListener(p);
		p.columnOutDtl_itm_typ_nm.setListListener(p);
		p.columnOutDtl_itm_typ_d_cd.addAllListener(p);
		p.columnOutDtl_itm_typ_d_cd.setListListener(p);
		p.columnOutDtl_itm_typ_d_nm.addAllListener(p);
		p.columnOutDtl_itm_typ_d_nm.setListListener(p);
		p.columnOutDtl_itm_jnl_cd.addAllListener(p);
		p.columnOutDtl_itm_jnl_cd.setListListener(p);
		p.columnOutDtl_itm_jnl_nm.addAllListener(p);
		p.columnOutDtl_itm_jnl_nm.setListListener(p);
		p.columnOutDtl_lot_no.addAllListener(p);
		p.columnOutDtl_lot_no.setListListener(p);
		p.columnOutDtl_sublot_no.addAllListener(p);
		p.columnOutDtl_sublot_no.setListListener(p);
		p.columnOutDtl_sno1.addAllListener(p);
		p.columnOutDtl_sno1.setListListener(p);
		p.columnOutDtl_sno2.addAllListener(p);
		p.columnOutDtl_sno2.setListListener(p);
		p.columnOutDtl_sno3.addAllListener(p);
		p.columnOutDtl_sno3.setListListener(p);
		p.columnOutDtl_sno4.addAllListener(p);
		p.columnOutDtl_sno4.setListListener(p);
		p.columnOutDtl_bp_cd.addAllListener(p);
		p.columnOutDtl_bp_cd.setListListener(p);
		p.columnOutDtl_bp_nm.addAllListener(p);
		p.columnOutDtl_bp_nm.setListListener(p);
		p.columnOutDtl_ac_slip_typ.addAllListener(p);
		p.columnOutDtl_ac_slip_typ.setListListener(p);
		p.columnOutDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnOutDtl_ac_slip_typ_nm.setListListener(p);
		p.columnOutDtl_ac_rsn_cd.addAllListener(p);
		p.columnOutDtl_ac_rsn_cd.setListListener(p);
		p.columnOutDtl_ac_rsn_nm.addAllListener(p);
		p.columnOutDtl_ac_rsn_nm.setListListener(p);
		p.columnOutDtl_asst_typ.addAllListener(p);
		p.columnOutDtl_asst_typ.setListListener(p);
		p.columnOutDtl_asst_typ_nm.addAllListener(p);
		p.columnOutDtl_asst_typ_nm.setListListener(p);
		p.columnOutDtl_per.addAllListener(p);
		p.columnOutDtl_per.setListListener(p);
		p.columnOutDtl_mfg_cost_ratio.addAllListener(p);
		p.columnOutDtl_mfg_cost_ratio.setListListener(p);
		p.columnOutDtl_unit_cd.addAllListener(p);
		p.columnOutDtl_unit_cd.setListListener(p);
		p.columnOutDtl_unit_nm.addAllListener(p);
		p.columnOutDtl_unit_nm.setListListener(p);
		p.columnOutDtl_dec_place.addAllListener(p);
		p.columnOutDtl_dec_place.setListListener(p);
		p.columnOutDtl_upri.addAllListener(p);
		p.columnOutDtl_upri.setListListener(p);
		p.columnOutDtl_ttl.addAllListener(p);
		p.columnOutDtl_ttl.setListListener(p);
		p.columnOutDtl_col_000.addAllListener(p);
		p.columnOutDtl_col_000.setListListener(p);
		p.columnOutDtl_col_001.addAllListener(p);
		p.columnOutDtl_col_001.setListListener(p);
		p.columnOutDtl_col_002.addAllListener(p);
		p.columnOutDtl_col_002.setListListener(p);
		p.columnOutDtl_col_003.addAllListener(p);
		p.columnOutDtl_col_003.setListListener(p);
		p.columnOutDtl_col_004.addAllListener(p);
		p.columnOutDtl_col_004.setListListener(p);
		p.columnOutDtl_col_005.addAllListener(p);
		p.columnOutDtl_col_005.setListListener(p);
		p.columnOutDtl_col_006.addAllListener(p);
		p.columnOutDtl_col_006.setListListener(p);
		p.columnOutDtl_col_007.addAllListener(p);
		p.columnOutDtl_col_007.setListListener(p);
		p.columnOutDtl_col_008.addAllListener(p);
		p.columnOutDtl_col_008.setListListener(p);
		p.columnOutDtl_col_009.addAllListener(p);
		p.columnOutDtl_col_009.setListListener(p);
		p.columnOutDtl_col_010.addAllListener(p);
		p.columnOutDtl_col_010.setListListener(p);
		p.columnOutDtl_col_011.addAllListener(p);
		p.columnOutDtl_col_011.setListListener(p);
		p.columnOutDtl_col_012.addAllListener(p);
		p.columnOutDtl_col_012.setListListener(p);
		p.columnOutDtl_col_013.addAllListener(p);
		p.columnOutDtl_col_013.setListListener(p);
		p.columnOutDtl_col_014.addAllListener(p);
		p.columnOutDtl_col_014.setListListener(p);
		p.columnOutDtl_col_015.addAllListener(p);
		p.columnOutDtl_col_015.setListListener(p);
		p.columnOutDtl_col_016.addAllListener(p);
		p.columnOutDtl_col_016.setListListener(p);
		p.columnOutDtl_col_017.addAllListener(p);
		p.columnOutDtl_col_017.setListListener(p);
		p.columnOutDtl_col_018.addAllListener(p);
		p.columnOutDtl_col_018.setListListener(p);
		p.columnOutDtl_col_019.addAllListener(p);
		p.columnOutDtl_col_019.setListListener(p);
		p.columnOutDtl_col_020.addAllListener(p);
		p.columnOutDtl_col_020.setListListener(p);
		p.columnOutDtl_col_021.addAllListener(p);
		p.columnOutDtl_col_021.setListListener(p);
		p.columnOutDtl_col_022.addAllListener(p);
		p.columnOutDtl_col_022.setListListener(p);
		p.columnOutDtl_col_023.addAllListener(p);
		p.columnOutDtl_col_023.setListListener(p);
		p.columnOutDtl_col_024.addAllListener(p);
		p.columnOutDtl_col_024.setListListener(p);
		p.columnOutDtl_col_025.addAllListener(p);
		p.columnOutDtl_col_025.setListListener(p);
		p.columnOutDtl_col_026.addAllListener(p);
		p.columnOutDtl_col_026.setListListener(p);
		p.columnOutDtl_col_027.addAllListener(p);
		p.columnOutDtl_col_027.setListListener(p);
		p.columnOutDtl_col_028.addAllListener(p);
		p.columnOutDtl_col_028.setListListener(p);
		p.columnOutDtl_col_029.addAllListener(p);
		p.columnOutDtl_col_029.setListListener(p);
		p.columnOutDtl_col_030.addAllListener(p);
		p.columnOutDtl_col_030.setListListener(p);
		p.columnOutDtl_col_031.addAllListener(p);
		p.columnOutDtl_col_031.setListListener(p);
		p.columnOutDtl_col_032.addAllListener(p);
		p.columnOutDtl_col_032.setListListener(p);
		p.columnOutDtl_col_033.addAllListener(p);
		p.columnOutDtl_col_033.setListListener(p);
		p.columnOutDtl_col_034.addAllListener(p);
		p.columnOutDtl_col_034.setListListener(p);
		p.columnOutDtl_col_035.addAllListener(p);
		p.columnOutDtl_col_035.setListListener(p);
		p.columnOutDtl_col_036.addAllListener(p);
		p.columnOutDtl_col_036.setListListener(p);
		p.columnOutDtl_col_037.addAllListener(p);
		p.columnOutDtl_col_037.setListListener(p);
		p.columnOutDtl_col_038.addAllListener(p);
		p.columnOutDtl_col_038.setListListener(p);
		p.columnOutDtl_col_039.addAllListener(p);
		p.columnOutDtl_col_039.setListListener(p);
		p.columnOutDtl_col_040.addAllListener(p);
		p.columnOutDtl_col_040.setListListener(p);
		p.columnOutDtl_col_041.addAllListener(p);
		p.columnOutDtl_col_041.setListListener(p);
		p.columnOutDtl_col_042.addAllListener(p);
		p.columnOutDtl_col_042.setListListener(p);
		p.columnOutDtl_col_043.addAllListener(p);
		p.columnOutDtl_col_043.setListListener(p);
		p.columnOutDtl_col_044.addAllListener(p);
		p.columnOutDtl_col_044.setListListener(p);
		p.columnOutDtl_col_045.addAllListener(p);
		p.columnOutDtl_col_045.setListListener(p);
		p.columnOutDtl_col_046.addAllListener(p);
		p.columnOutDtl_col_046.setListListener(p);
		p.columnOutDtl_col_047.addAllListener(p);
		p.columnOutDtl_col_047.setListListener(p);
		p.columnOutDtl_col_048.addAllListener(p);
		p.columnOutDtl_col_048.setListListener(p);
		p.columnOutDtl_col_049.addAllListener(p);
		p.columnOutDtl_col_049.setListListener(p);
		p.columnOutDtl_col_050.addAllListener(p);
		p.columnOutDtl_col_050.setListListener(p);
		p.columnOutDtl_col_051.addAllListener(p);
		p.columnOutDtl_col_051.setListListener(p);
		p.columnOutDtl_col_052.addAllListener(p);
		p.columnOutDtl_col_052.setListListener(p);
		p.columnOutDtl_col_053.addAllListener(p);
		p.columnOutDtl_col_053.setListListener(p);
		p.columnOutDtl_col_054.addAllListener(p);
		p.columnOutDtl_col_054.setListListener(p);
		p.columnOutDtl_col_055.addAllListener(p);
		p.columnOutDtl_col_055.setListListener(p);
		p.columnOutDtl_col_056.addAllListener(p);
		p.columnOutDtl_col_056.setListListener(p);
		p.columnOutDtl_col_057.addAllListener(p);
		p.columnOutDtl_col_057.setListListener(p);
		p.columnOutDtl_col_058.addAllListener(p);
		p.columnOutDtl_col_058.setListListener(p);
		p.columnOutDtl_col_059.addAllListener(p);
		p.columnOutDtl_col_059.setListListener(p);
		p.columnOutDtl_col_060.addAllListener(p);
		p.columnOutDtl_col_060.setListListener(p);
		p.columnOutDtl_col_061.addAllListener(p);
		p.columnOutDtl_col_061.setListListener(p);
		p.columnOutDtl_col_062.addAllListener(p);
		p.columnOutDtl_col_062.setListListener(p);
		p.columnOutDtl_col_063.addAllListener(p);
		p.columnOutDtl_col_063.setListListener(p);
		p.columnOutDtl_col_064.addAllListener(p);
		p.columnOutDtl_col_064.setListListener(p);
		p.columnOutDtl_col_065.addAllListener(p);
		p.columnOutDtl_col_065.setListListener(p);
		p.columnOutDtl_col_066.addAllListener(p);
		p.columnOutDtl_col_066.setListListener(p);
		p.columnOutDtl_col_067.addAllListener(p);
		p.columnOutDtl_col_067.setListListener(p);
		p.columnOutDtl_col_068.addAllListener(p);
		p.columnOutDtl_col_068.setListListener(p);
		p.columnOutDtl_col_069.addAllListener(p);
		p.columnOutDtl_col_069.setListListener(p);
		p.columnOutDtl_col_070.addAllListener(p);
		p.columnOutDtl_col_070.setListListener(p);
		p.columnOutDtl_col_071.addAllListener(p);
		p.columnOutDtl_col_071.setListListener(p);
		p.columnOutDtl_col_072.addAllListener(p);
		p.columnOutDtl_col_072.setListListener(p);
		p.columnOutDtl_col_073.addAllListener(p);
		p.columnOutDtl_col_073.setListListener(p);
		p.columnOutDtl_col_074.addAllListener(p);
		p.columnOutDtl_col_074.setListListener(p);
		p.columnOutDtl_col_075.addAllListener(p);
		p.columnOutDtl_col_075.setListListener(p);
		p.columnOutDtl_col_076.addAllListener(p);
		p.columnOutDtl_col_076.setListListener(p);
		p.columnOutDtl_col_077.addAllListener(p);
		p.columnOutDtl_col_077.setListListener(p);
		p.columnOutDtl_col_078.addAllListener(p);
		p.columnOutDtl_col_078.setListListener(p);
		p.columnOutDtl_col_079.addAllListener(p);
		p.columnOutDtl_col_079.setListListener(p);
		p.columnOutDtl_col_080.addAllListener(p);
		p.columnOutDtl_col_080.setListListener(p);
		p.columnOutDtl_col_081.addAllListener(p);
		p.columnOutDtl_col_081.setListListener(p);
		p.columnOutDtl_col_082.addAllListener(p);
		p.columnOutDtl_col_082.setListListener(p);
		p.columnOutDtl_col_083.addAllListener(p);
		p.columnOutDtl_col_083.setListListener(p);
		p.columnOutDtl_col_084.addAllListener(p);
		p.columnOutDtl_col_084.setListListener(p);
		p.columnOutDtl_col_085.addAllListener(p);
		p.columnOutDtl_col_085.setListListener(p);
		p.columnOutDtl_col_086.addAllListener(p);
		p.columnOutDtl_col_086.setListListener(p);
		p.columnOutDtl_col_087.addAllListener(p);
		p.columnOutDtl_col_087.setListListener(p);
		p.columnOutDtl_col_088.addAllListener(p);
		p.columnOutDtl_col_088.setListListener(p);
		p.columnOutDtl_col_089.addAllListener(p);
		p.columnOutDtl_col_089.setListListener(p);
		p.columnOutDtl_col_090.addAllListener(p);
		p.columnOutDtl_col_090.setListListener(p);
		p.columnOutDtl_col_091.addAllListener(p);
		p.columnOutDtl_col_091.setListListener(p);
		p.columnOutDtl_col_092.addAllListener(p);
		p.columnOutDtl_col_092.setListListener(p);
		p.columnOutDtl_col_093.addAllListener(p);
		p.columnOutDtl_col_093.setListListener(p);
		p.columnOutDtl_col_094.addAllListener(p);
		p.columnOutDtl_col_094.setListListener(p);
		p.columnOutDtl_col_095.addAllListener(p);
		p.columnOutDtl_col_095.setListListener(p);
		p.columnOutDtl_col_096.addAllListener(p);
		p.columnOutDtl_col_096.setListListener(p);
		p.columnOutDtl_col_097.addAllListener(p);
		p.columnOutDtl_col_097.setListListener(p);
		p.columnOutDtl_col_098.addAllListener(p);
		p.columnOutDtl_col_098.setListListener(p);
		p.columnOutDtl_col_099.addAllListener(p);
		p.columnOutDtl_col_099.setListListener(p);
		p.columnOutDtl_ym.addAllListener(p);
		p.columnOutDtl_ym.setListListener(p);
		p.columnOutDtl_trd_grp.addAllListener(p);
		p.columnOutDtl_trd_grp.setListListener(p);
		p.columnOutDtl_calc_grp_cd.addAllListener(p);
		p.columnOutDtl_calc_grp_cd.setListListener(p);
		p.columnOutDtl_calc_no.addAllListener(p);
		p.columnOutDtl_calc_no.setListListener(p);
	}

	/**
	 *  [InDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInDtl(MGBFP_TrdCostSrch p) {
		p.InDtlTable.addAllListener(p);
		p.columnInDtl_wg_cd.addAllListener(p);
		p.columnInDtl_wg_cd.setListListener(p);
		p.columnInDtl_wg_nm.addAllListener(p);
		p.columnInDtl_wg_nm.setListListener(p);
		p.columnInDtl_mng_dpt_cd.addAllListener(p);
		p.columnInDtl_mng_dpt_cd.setListListener(p);
		p.columnInDtl_mng_dpt_nm.addAllListener(p);
		p.columnInDtl_mng_dpt_nm.setListListener(p);
		p.columnInDtl_itm_typ.addAllListener(p);
		p.columnInDtl_itm_typ.setListListener(p);
		p.columnInDtl_itm_typ_nm.addAllListener(p);
		p.columnInDtl_itm_typ_nm.setListListener(p);
		p.columnInDtl_itm_typ_d_cd.addAllListener(p);
		p.columnInDtl_itm_typ_d_cd.setListListener(p);
		p.columnInDtl_itm_typ_d_nm.addAllListener(p);
		p.columnInDtl_itm_typ_d_nm.setListListener(p);
		p.columnInDtl_itm_jnl_cd.addAllListener(p);
		p.columnInDtl_itm_jnl_cd.setListListener(p);
		p.columnInDtl_itm_jnl_nm.addAllListener(p);
		p.columnInDtl_itm_jnl_nm.setListListener(p);
		p.columnInDtl_lot_no.addAllListener(p);
		p.columnInDtl_lot_no.setListListener(p);
		p.columnInDtl_sublot_no.addAllListener(p);
		p.columnInDtl_sublot_no.setListListener(p);
		p.columnInDtl_sno1.addAllListener(p);
		p.columnInDtl_sno1.setListListener(p);
		p.columnInDtl_sno2.addAllListener(p);
		p.columnInDtl_sno2.setListListener(p);
		p.columnInDtl_sno3.addAllListener(p);
		p.columnInDtl_sno3.setListListener(p);
		p.columnInDtl_sno4.addAllListener(p);
		p.columnInDtl_sno4.setListListener(p);
		p.columnInDtl_bp_cd.addAllListener(p);
		p.columnInDtl_bp_cd.setListListener(p);
		p.columnInDtl_bp_nm.addAllListener(p);
		p.columnInDtl_bp_nm.setListListener(p);
		p.columnInDtl_ac_slip_typ.addAllListener(p);
		p.columnInDtl_ac_slip_typ.setListListener(p);
		p.columnInDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnInDtl_ac_slip_typ_nm.setListListener(p);
		p.columnInDtl_ac_rsn_cd.addAllListener(p);
		p.columnInDtl_ac_rsn_cd.setListListener(p);
		p.columnInDtl_ac_rsn_nm.addAllListener(p);
		p.columnInDtl_ac_rsn_nm.setListListener(p);
		p.columnInDtl_asst_typ.addAllListener(p);
		p.columnInDtl_asst_typ.setListListener(p);
		p.columnInDtl_asst_typ_nm.addAllListener(p);
		p.columnInDtl_asst_typ_nm.setListListener(p);
		p.columnInDtl_per.addAllListener(p);
		p.columnInDtl_per.setListListener(p);
		p.columnInDtl_mfg_cost_ratio.addAllListener(p);
		p.columnInDtl_mfg_cost_ratio.setListListener(p);
		p.columnInDtl_unit_cd.addAllListener(p);
		p.columnInDtl_unit_cd.setListListener(p);
		p.columnInDtl_unit_nm.addAllListener(p);
		p.columnInDtl_unit_nm.setListListener(p);
		p.columnInDtl_dec_place.addAllListener(p);
		p.columnInDtl_dec_place.setListListener(p);
		p.columnInDtl_upri.addAllListener(p);
		p.columnInDtl_upri.setListListener(p);
		p.columnInDtl_ttl.addAllListener(p);
		p.columnInDtl_ttl.setListListener(p);
		p.columnInDtl_col_000.addAllListener(p);
		p.columnInDtl_col_000.setListListener(p);
		p.columnInDtl_col_001.addAllListener(p);
		p.columnInDtl_col_001.setListListener(p);
		p.columnInDtl_col_002.addAllListener(p);
		p.columnInDtl_col_002.setListListener(p);
		p.columnInDtl_col_003.addAllListener(p);
		p.columnInDtl_col_003.setListListener(p);
		p.columnInDtl_col_004.addAllListener(p);
		p.columnInDtl_col_004.setListListener(p);
		p.columnInDtl_col_005.addAllListener(p);
		p.columnInDtl_col_005.setListListener(p);
		p.columnInDtl_col_006.addAllListener(p);
		p.columnInDtl_col_006.setListListener(p);
		p.columnInDtl_col_007.addAllListener(p);
		p.columnInDtl_col_007.setListListener(p);
		p.columnInDtl_col_008.addAllListener(p);
		p.columnInDtl_col_008.setListListener(p);
		p.columnInDtl_col_009.addAllListener(p);
		p.columnInDtl_col_009.setListListener(p);
		p.columnInDtl_col_010.addAllListener(p);
		p.columnInDtl_col_010.setListListener(p);
		p.columnInDtl_col_011.addAllListener(p);
		p.columnInDtl_col_011.setListListener(p);
		p.columnInDtl_col_012.addAllListener(p);
		p.columnInDtl_col_012.setListListener(p);
		p.columnInDtl_col_013.addAllListener(p);
		p.columnInDtl_col_013.setListListener(p);
		p.columnInDtl_col_014.addAllListener(p);
		p.columnInDtl_col_014.setListListener(p);
		p.columnInDtl_col_015.addAllListener(p);
		p.columnInDtl_col_015.setListListener(p);
		p.columnInDtl_col_016.addAllListener(p);
		p.columnInDtl_col_016.setListListener(p);
		p.columnInDtl_col_017.addAllListener(p);
		p.columnInDtl_col_017.setListListener(p);
		p.columnInDtl_col_018.addAllListener(p);
		p.columnInDtl_col_018.setListListener(p);
		p.columnInDtl_col_019.addAllListener(p);
		p.columnInDtl_col_019.setListListener(p);
		p.columnInDtl_col_020.addAllListener(p);
		p.columnInDtl_col_020.setListListener(p);
		p.columnInDtl_col_021.addAllListener(p);
		p.columnInDtl_col_021.setListListener(p);
		p.columnInDtl_col_022.addAllListener(p);
		p.columnInDtl_col_022.setListListener(p);
		p.columnInDtl_col_023.addAllListener(p);
		p.columnInDtl_col_023.setListListener(p);
		p.columnInDtl_col_024.addAllListener(p);
		p.columnInDtl_col_024.setListListener(p);
		p.columnInDtl_col_025.addAllListener(p);
		p.columnInDtl_col_025.setListListener(p);
		p.columnInDtl_col_026.addAllListener(p);
		p.columnInDtl_col_026.setListListener(p);
		p.columnInDtl_col_027.addAllListener(p);
		p.columnInDtl_col_027.setListListener(p);
		p.columnInDtl_col_028.addAllListener(p);
		p.columnInDtl_col_028.setListListener(p);
		p.columnInDtl_col_029.addAllListener(p);
		p.columnInDtl_col_029.setListListener(p);
		p.columnInDtl_col_030.addAllListener(p);
		p.columnInDtl_col_030.setListListener(p);
		p.columnInDtl_col_031.addAllListener(p);
		p.columnInDtl_col_031.setListListener(p);
		p.columnInDtl_col_032.addAllListener(p);
		p.columnInDtl_col_032.setListListener(p);
		p.columnInDtl_col_033.addAllListener(p);
		p.columnInDtl_col_033.setListListener(p);
		p.columnInDtl_col_034.addAllListener(p);
		p.columnInDtl_col_034.setListListener(p);
		p.columnInDtl_col_035.addAllListener(p);
		p.columnInDtl_col_035.setListListener(p);
		p.columnInDtl_col_036.addAllListener(p);
		p.columnInDtl_col_036.setListListener(p);
		p.columnInDtl_col_037.addAllListener(p);
		p.columnInDtl_col_037.setListListener(p);
		p.columnInDtl_col_038.addAllListener(p);
		p.columnInDtl_col_038.setListListener(p);
		p.columnInDtl_col_039.addAllListener(p);
		p.columnInDtl_col_039.setListListener(p);
		p.columnInDtl_col_040.addAllListener(p);
		p.columnInDtl_col_040.setListListener(p);
		p.columnInDtl_col_041.addAllListener(p);
		p.columnInDtl_col_041.setListListener(p);
		p.columnInDtl_col_042.addAllListener(p);
		p.columnInDtl_col_042.setListListener(p);
		p.columnInDtl_col_043.addAllListener(p);
		p.columnInDtl_col_043.setListListener(p);
		p.columnInDtl_col_044.addAllListener(p);
		p.columnInDtl_col_044.setListListener(p);
		p.columnInDtl_col_045.addAllListener(p);
		p.columnInDtl_col_045.setListListener(p);
		p.columnInDtl_col_046.addAllListener(p);
		p.columnInDtl_col_046.setListListener(p);
		p.columnInDtl_col_047.addAllListener(p);
		p.columnInDtl_col_047.setListListener(p);
		p.columnInDtl_col_048.addAllListener(p);
		p.columnInDtl_col_048.setListListener(p);
		p.columnInDtl_col_049.addAllListener(p);
		p.columnInDtl_col_049.setListListener(p);
		p.columnInDtl_col_050.addAllListener(p);
		p.columnInDtl_col_050.setListListener(p);
		p.columnInDtl_col_051.addAllListener(p);
		p.columnInDtl_col_051.setListListener(p);
		p.columnInDtl_col_052.addAllListener(p);
		p.columnInDtl_col_052.setListListener(p);
		p.columnInDtl_col_053.addAllListener(p);
		p.columnInDtl_col_053.setListListener(p);
		p.columnInDtl_col_054.addAllListener(p);
		p.columnInDtl_col_054.setListListener(p);
		p.columnInDtl_col_055.addAllListener(p);
		p.columnInDtl_col_055.setListListener(p);
		p.columnInDtl_col_056.addAllListener(p);
		p.columnInDtl_col_056.setListListener(p);
		p.columnInDtl_col_057.addAllListener(p);
		p.columnInDtl_col_057.setListListener(p);
		p.columnInDtl_col_058.addAllListener(p);
		p.columnInDtl_col_058.setListListener(p);
		p.columnInDtl_col_059.addAllListener(p);
		p.columnInDtl_col_059.setListListener(p);
		p.columnInDtl_col_060.addAllListener(p);
		p.columnInDtl_col_060.setListListener(p);
		p.columnInDtl_col_061.addAllListener(p);
		p.columnInDtl_col_061.setListListener(p);
		p.columnInDtl_col_062.addAllListener(p);
		p.columnInDtl_col_062.setListListener(p);
		p.columnInDtl_col_063.addAllListener(p);
		p.columnInDtl_col_063.setListListener(p);
		p.columnInDtl_col_064.addAllListener(p);
		p.columnInDtl_col_064.setListListener(p);
		p.columnInDtl_col_065.addAllListener(p);
		p.columnInDtl_col_065.setListListener(p);
		p.columnInDtl_col_066.addAllListener(p);
		p.columnInDtl_col_066.setListListener(p);
		p.columnInDtl_col_067.addAllListener(p);
		p.columnInDtl_col_067.setListListener(p);
		p.columnInDtl_col_068.addAllListener(p);
		p.columnInDtl_col_068.setListListener(p);
		p.columnInDtl_col_069.addAllListener(p);
		p.columnInDtl_col_069.setListListener(p);
		p.columnInDtl_col_070.addAllListener(p);
		p.columnInDtl_col_070.setListListener(p);
		p.columnInDtl_col_071.addAllListener(p);
		p.columnInDtl_col_071.setListListener(p);
		p.columnInDtl_col_072.addAllListener(p);
		p.columnInDtl_col_072.setListListener(p);
		p.columnInDtl_col_073.addAllListener(p);
		p.columnInDtl_col_073.setListListener(p);
		p.columnInDtl_col_074.addAllListener(p);
		p.columnInDtl_col_074.setListListener(p);
		p.columnInDtl_col_075.addAllListener(p);
		p.columnInDtl_col_075.setListListener(p);
		p.columnInDtl_col_076.addAllListener(p);
		p.columnInDtl_col_076.setListListener(p);
		p.columnInDtl_col_077.addAllListener(p);
		p.columnInDtl_col_077.setListListener(p);
		p.columnInDtl_col_078.addAllListener(p);
		p.columnInDtl_col_078.setListListener(p);
		p.columnInDtl_col_079.addAllListener(p);
		p.columnInDtl_col_079.setListListener(p);
		p.columnInDtl_col_080.addAllListener(p);
		p.columnInDtl_col_080.setListListener(p);
		p.columnInDtl_col_081.addAllListener(p);
		p.columnInDtl_col_081.setListListener(p);
		p.columnInDtl_col_082.addAllListener(p);
		p.columnInDtl_col_082.setListListener(p);
		p.columnInDtl_col_083.addAllListener(p);
		p.columnInDtl_col_083.setListListener(p);
		p.columnInDtl_col_084.addAllListener(p);
		p.columnInDtl_col_084.setListListener(p);
		p.columnInDtl_col_085.addAllListener(p);
		p.columnInDtl_col_085.setListListener(p);
		p.columnInDtl_col_086.addAllListener(p);
		p.columnInDtl_col_086.setListListener(p);
		p.columnInDtl_col_087.addAllListener(p);
		p.columnInDtl_col_087.setListListener(p);
		p.columnInDtl_col_088.addAllListener(p);
		p.columnInDtl_col_088.setListListener(p);
		p.columnInDtl_col_089.addAllListener(p);
		p.columnInDtl_col_089.setListListener(p);
		p.columnInDtl_col_090.addAllListener(p);
		p.columnInDtl_col_090.setListListener(p);
		p.columnInDtl_col_091.addAllListener(p);
		p.columnInDtl_col_091.setListListener(p);
		p.columnInDtl_col_092.addAllListener(p);
		p.columnInDtl_col_092.setListListener(p);
		p.columnInDtl_col_093.addAllListener(p);
		p.columnInDtl_col_093.setListListener(p);
		p.columnInDtl_col_094.addAllListener(p);
		p.columnInDtl_col_094.setListListener(p);
		p.columnInDtl_col_095.addAllListener(p);
		p.columnInDtl_col_095.setListListener(p);
		p.columnInDtl_col_096.addAllListener(p);
		p.columnInDtl_col_096.setListListener(p);
		p.columnInDtl_col_097.addAllListener(p);
		p.columnInDtl_col_097.setListListener(p);
		p.columnInDtl_col_098.addAllListener(p);
		p.columnInDtl_col_098.setListListener(p);
		p.columnInDtl_col_099.addAllListener(p);
		p.columnInDtl_col_099.setListListener(p);
		p.columnInDtl_ym.addAllListener(p);
		p.columnInDtl_ym.setListListener(p);
		p.columnInDtl_trd_grp.addAllListener(p);
		p.columnInDtl_trd_grp.setListListener(p);
		p.columnInDtl_calc_grp_cd.addAllListener(p);
		p.columnInDtl_calc_grp_cd.setListListener(p);
		p.columnInDtl_calc_no.addAllListener(p);
		p.columnInDtl_calc_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBFP_TrdCostSrch p) {
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_TrdCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_TrdCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_grp.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_trd_zero_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBFP_TrdCostSrch p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_TrdCostSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBFP_TrdCostSrch p){
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_grp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_srched_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[OutDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_OutDtl(MGBFP_TrdCostSrch p){
		p.columnOutDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.OutDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnOutDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_per.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_mfg_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.OutDtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnOutDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnOutDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ttl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_000.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_col_099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnOutDtl_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnOutDtl_trd_grp.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnOutDtl_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnOutDtl_calc_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[InDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_InDtl(MGBFP_TrdCostSrch p){
		p.columnInDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnInDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_per.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_mfg_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InDtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnInDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnInDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ttl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_000.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_col_099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnInDtl_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnInDtl_trd_grp.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnInDtl_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnInDtl_calc_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBFP_TrdCostSrch p){
		p.Btn_sync_p_PPanel.putStatus(SRCH, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_TrdCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_TrdCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_grp.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_trd_zero_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBFP_TrdCostSrch p){
		p.LPnl_disp_expns_grp.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_TrdCostSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_TrdCostSrch p){
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_calc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_calc_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_srched_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[OutDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_OutDtl(MGBFP_TrdCostSrch p){
		p.columnOutDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.OutDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnOutDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_per.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_mfg_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.OutDtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnOutDtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnOutDtl_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ttl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_000.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_col_099.putMode(p, REF, MCMode.READ_ONLY);
		p.columnOutDtl_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.columnOutDtl_trd_grp.putMode(p, REF, MCMode.INVISIBLE);
		p.columnOutDtl_calc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnOutDtl_calc_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[InDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_InDtl(MGBFP_TrdCostSrch p){
		p.columnInDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.InDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnInDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_per.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_mfg_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.InDtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnInDtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnInDtl_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ttl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_000.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_col_099.putMode(p, REF, MCMode.READ_ONLY);
		p.columnInDtl_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.columnInDtl_trd_grp.putMode(p, REF, MCMode.INVISIBLE);
		p.columnInDtl_calc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnInDtl_calc_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBFP_TrdCostSrch p){
		p.Btn_sync_p_PPanel.putStatus(REF, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);

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
		MGBFP_TrdCostSrch_MC.setTableConfigRslt((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.setTableConfigOutDtl((MGBFP_TrdCostSrch)this);
		MGBFP_TrdCostSrch_MC.setTableConfigInDtl((MGBFP_TrdCostSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBFP_TrdCostSrch p) {
		p.columnRslt_ym.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_trd_grp.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.trd_grp_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_grp);
		p.columnRslt_ttl.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.ttl_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl);
		p.columnRslt_col_000.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_000_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_000);
		p.columnRslt_col_001.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_001_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_001);
		p.columnRslt_col_002.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_002_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_002);
		p.columnRslt_col_003.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_003_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_003);
		p.columnRslt_col_004.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_004_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_004);
		p.columnRslt_col_005.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_005_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_005);
		p.columnRslt_col_006.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_006_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_006);
		p.columnRslt_col_007.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_007_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_007);
		p.columnRslt_col_008.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_008_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_008);
		p.columnRslt_col_009.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_009_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_009);
		p.columnRslt_col_010.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_010_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_010);
		p.columnRslt_col_011.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_011_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_011);
		p.columnRslt_col_012.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_012_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_012);
		p.columnRslt_col_013.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_013_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_013);
		p.columnRslt_col_014.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_014_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_014);
		p.columnRslt_col_015.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_015_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_015);
		p.columnRslt_col_016.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_016_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_016);
		p.columnRslt_col_017.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_017_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_017);
		p.columnRslt_col_018.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_018_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_018);
		p.columnRslt_col_019.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_019_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_019);
		p.columnRslt_col_020.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_020_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_020);
		p.columnRslt_col_021.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_021_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_021);
		p.columnRslt_col_022.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_022_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_022);
		p.columnRslt_col_023.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_023_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_023);
		p.columnRslt_col_024.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_024_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_024);
		p.columnRslt_col_025.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_025_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_025);
		p.columnRslt_col_026.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_026_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_026);
		p.columnRslt_col_027.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_027_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_027);
		p.columnRslt_col_028.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_028_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_028);
		p.columnRslt_col_029.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_029_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_029);
		p.columnRslt_col_030.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_030_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_030);
		p.columnRslt_col_031.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_031_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_031);
		p.columnRslt_col_032.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_032_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_032);
		p.columnRslt_col_033.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_033_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_033);
		p.columnRslt_col_034.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_034_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_034);
		p.columnRslt_col_035.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_035_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_035);
		p.columnRslt_col_036.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_036_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_036);
		p.columnRslt_col_037.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_037_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_037);
		p.columnRslt_col_038.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_038_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_038);
		p.columnRslt_col_039.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_039_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_039);
		p.columnRslt_col_040.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_040_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_040);
		p.columnRslt_col_041.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_041_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_041);
		p.columnRslt_col_042.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_042_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_042);
		p.columnRslt_col_043.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_043_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_043);
		p.columnRslt_col_044.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_044_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_044);
		p.columnRslt_col_045.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_045_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_045);
		p.columnRslt_col_046.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_046_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_046);
		p.columnRslt_col_047.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_047_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_047);
		p.columnRslt_col_048.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_048_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_048);
		p.columnRslt_col_049.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_049_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_049);
		p.columnRslt_col_050.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_050_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_050);
		p.columnRslt_col_051.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_051_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_051);
		p.columnRslt_col_052.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_052_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_052);
		p.columnRslt_col_053.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_053_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_053);
		p.columnRslt_col_054.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_054_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_054);
		p.columnRslt_col_055.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_055_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_055);
		p.columnRslt_col_056.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_056_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_056);
		p.columnRslt_col_057.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_057_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_057);
		p.columnRslt_col_058.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_058_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_058);
		p.columnRslt_col_059.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_059_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_059);
		p.columnRslt_col_060.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_060_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_060);
		p.columnRslt_col_061.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_061_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_061);
		p.columnRslt_col_062.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_062_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_062);
		p.columnRslt_col_063.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_063_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_063);
		p.columnRslt_col_064.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_064_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_064);
		p.columnRslt_col_065.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_065_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_065);
		p.columnRslt_col_066.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_066_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_066);
		p.columnRslt_col_067.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_067_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_067);
		p.columnRslt_col_068.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_068_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_068);
		p.columnRslt_col_069.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_069_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_069);
		p.columnRslt_col_070.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_070_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_070);
		p.columnRslt_col_071.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_071_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_071);
		p.columnRslt_col_072.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_072_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_072);
		p.columnRslt_col_073.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_073_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_073);
		p.columnRslt_col_074.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_074_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_074);
		p.columnRslt_col_075.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_075_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_075);
		p.columnRslt_col_076.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_076_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_076);
		p.columnRslt_col_077.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_077_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_077);
		p.columnRslt_col_078.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_078_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_078);
		p.columnRslt_col_079.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_079_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_079);
		p.columnRslt_col_080.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_080_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_080);
		p.columnRslt_col_081.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_081_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_081);
		p.columnRslt_col_082.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_082_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_082);
		p.columnRslt_col_083.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_083_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_083);
		p.columnRslt_col_084.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_084_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_084);
		p.columnRslt_col_085.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_085_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_085);
		p.columnRslt_col_086.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_086_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_086);
		p.columnRslt_col_087.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_087_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_087);
		p.columnRslt_col_088.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_088_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_088);
		p.columnRslt_col_089.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_089_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_089);
		p.columnRslt_col_090.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_090_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_090);
		p.columnRslt_col_091.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_091_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_091);
		p.columnRslt_col_092.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_092_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_092);
		p.columnRslt_col_093.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_093_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_093);
		p.columnRslt_col_094.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_094_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_094);
		p.columnRslt_col_095.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_095_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_095);
		p.columnRslt_col_096.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_096_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_096);
		p.columnRslt_col_097.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_097_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_097);
		p.columnRslt_col_098.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_098_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_098);
		p.columnRslt_col_099.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.col_099_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_099);
		p.columnRslt_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.calc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_cd);
		p.columnRslt_calc_no.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.calc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_no);
		p.columnRslt_srched_flg.setMeta(mcframe.clientMGBF.MGBFP0160.RsltR.srched_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_srched_flg);
	}

	/**
	 * [OutDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigOutDtl(MGBFP_TrdCostSrch p) {
		p.columnOutDtl_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.wg_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_wg_cd);
		p.columnOutDtl_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.wg_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_wg_nm);
		p.columnOutDtl_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mng_dpt_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_mng_dpt_cd);
		p.columnOutDtl_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mng_dpt_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_mng_dpt_nm);
		p.OutDtlTable.addTable(p.OutDtl_itm_p_PPanel.ItmTable);
		p.columnOutDtl_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_typ);
		p.columnOutDtl_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_typ_nm);
		p.columnOutDtl_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_d_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_typ_d_cd);
		p.columnOutDtl_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_d_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_typ_d_nm);
		p.columnOutDtl_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_jnl_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_jnl_cd);
		p.columnOutDtl_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_jnl_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_itm_jnl_nm);
		p.columnOutDtl_lot_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.lot_no_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_lot_no);
		p.columnOutDtl_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sublot_no_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_sublot_no);
		p.columnOutDtl_sno1.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno1_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_sno1);
		p.columnOutDtl_sno2.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno2_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_sno2);
		p.columnOutDtl_sno3.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno3_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_sno3);
		p.columnOutDtl_sno4.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno4_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_sno4);
		p.columnOutDtl_bp_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.bp_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_bp_cd);
		p.columnOutDtl_bp_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.bp_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_bp_nm);
		p.columnOutDtl_ac_slip_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_slip_typ_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ac_slip_typ);
		p.columnOutDtl_ac_slip_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_slip_typ_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ac_slip_typ_nm);
		p.columnOutDtl_ac_rsn_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_rsn_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ac_rsn_cd);
		p.columnOutDtl_ac_rsn_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_rsn_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ac_rsn_nm);
		p.columnOutDtl_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.asst_typ_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_asst_typ);
		p.columnOutDtl_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.asst_typ_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_asst_typ_nm);
		p.columnOutDtl_per.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.per_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_per);
		p.columnOutDtl_mfg_cost_ratio.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mfg_cost_ratio_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_mfg_cost_ratio);
		p.OutDtlTable.addTable(p.OutDtl_qty_p_PPanel.QtyTable);
		p.OutDtl_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnOutDtl_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.unit_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_unit_cd);
		p.columnOutDtl_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.unit_nm_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_unit_nm);
		p.columnOutDtl_dec_place.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.dec_place_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_dec_place);
		p.columnOutDtl_upri.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.upri_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_upri);
		p.columnOutDtl_ttl.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ttl_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ttl);
		p.columnOutDtl_col_000.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_000_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_000);
		p.columnOutDtl_col_001.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_001_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_001);
		p.columnOutDtl_col_002.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_002_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_002);
		p.columnOutDtl_col_003.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_003_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_003);
		p.columnOutDtl_col_004.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_004_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_004);
		p.columnOutDtl_col_005.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_005_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_005);
		p.columnOutDtl_col_006.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_006_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_006);
		p.columnOutDtl_col_007.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_007_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_007);
		p.columnOutDtl_col_008.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_008_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_008);
		p.columnOutDtl_col_009.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_009_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_009);
		p.columnOutDtl_col_010.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_010_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_010);
		p.columnOutDtl_col_011.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_011_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_011);
		p.columnOutDtl_col_012.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_012_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_012);
		p.columnOutDtl_col_013.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_013_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_013);
		p.columnOutDtl_col_014.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_014_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_014);
		p.columnOutDtl_col_015.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_015_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_015);
		p.columnOutDtl_col_016.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_016_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_016);
		p.columnOutDtl_col_017.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_017_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_017);
		p.columnOutDtl_col_018.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_018_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_018);
		p.columnOutDtl_col_019.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_019_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_019);
		p.columnOutDtl_col_020.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_020_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_020);
		p.columnOutDtl_col_021.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_021_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_021);
		p.columnOutDtl_col_022.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_022_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_022);
		p.columnOutDtl_col_023.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_023_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_023);
		p.columnOutDtl_col_024.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_024_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_024);
		p.columnOutDtl_col_025.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_025_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_025);
		p.columnOutDtl_col_026.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_026_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_026);
		p.columnOutDtl_col_027.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_027_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_027);
		p.columnOutDtl_col_028.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_028_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_028);
		p.columnOutDtl_col_029.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_029_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_029);
		p.columnOutDtl_col_030.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_030_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_030);
		p.columnOutDtl_col_031.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_031_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_031);
		p.columnOutDtl_col_032.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_032_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_032);
		p.columnOutDtl_col_033.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_033_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_033);
		p.columnOutDtl_col_034.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_034_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_034);
		p.columnOutDtl_col_035.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_035_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_035);
		p.columnOutDtl_col_036.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_036_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_036);
		p.columnOutDtl_col_037.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_037_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_037);
		p.columnOutDtl_col_038.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_038_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_038);
		p.columnOutDtl_col_039.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_039_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_039);
		p.columnOutDtl_col_040.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_040_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_040);
		p.columnOutDtl_col_041.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_041_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_041);
		p.columnOutDtl_col_042.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_042_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_042);
		p.columnOutDtl_col_043.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_043_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_043);
		p.columnOutDtl_col_044.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_044_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_044);
		p.columnOutDtl_col_045.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_045_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_045);
		p.columnOutDtl_col_046.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_046_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_046);
		p.columnOutDtl_col_047.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_047_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_047);
		p.columnOutDtl_col_048.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_048_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_048);
		p.columnOutDtl_col_049.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_049_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_049);
		p.columnOutDtl_col_050.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_050_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_050);
		p.columnOutDtl_col_051.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_051_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_051);
		p.columnOutDtl_col_052.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_052_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_052);
		p.columnOutDtl_col_053.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_053_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_053);
		p.columnOutDtl_col_054.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_054_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_054);
		p.columnOutDtl_col_055.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_055_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_055);
		p.columnOutDtl_col_056.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_056_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_056);
		p.columnOutDtl_col_057.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_057_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_057);
		p.columnOutDtl_col_058.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_058_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_058);
		p.columnOutDtl_col_059.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_059_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_059);
		p.columnOutDtl_col_060.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_060_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_060);
		p.columnOutDtl_col_061.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_061_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_061);
		p.columnOutDtl_col_062.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_062_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_062);
		p.columnOutDtl_col_063.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_063_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_063);
		p.columnOutDtl_col_064.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_064_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_064);
		p.columnOutDtl_col_065.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_065_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_065);
		p.columnOutDtl_col_066.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_066_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_066);
		p.columnOutDtl_col_067.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_067_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_067);
		p.columnOutDtl_col_068.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_068_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_068);
		p.columnOutDtl_col_069.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_069_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_069);
		p.columnOutDtl_col_070.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_070_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_070);
		p.columnOutDtl_col_071.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_071_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_071);
		p.columnOutDtl_col_072.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_072_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_072);
		p.columnOutDtl_col_073.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_073_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_073);
		p.columnOutDtl_col_074.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_074_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_074);
		p.columnOutDtl_col_075.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_075_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_075);
		p.columnOutDtl_col_076.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_076_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_076);
		p.columnOutDtl_col_077.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_077_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_077);
		p.columnOutDtl_col_078.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_078_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_078);
		p.columnOutDtl_col_079.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_079_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_079);
		p.columnOutDtl_col_080.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_080_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_080);
		p.columnOutDtl_col_081.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_081_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_081);
		p.columnOutDtl_col_082.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_082_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_082);
		p.columnOutDtl_col_083.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_083_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_083);
		p.columnOutDtl_col_084.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_084_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_084);
		p.columnOutDtl_col_085.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_085_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_085);
		p.columnOutDtl_col_086.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_086_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_086);
		p.columnOutDtl_col_087.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_087_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_087);
		p.columnOutDtl_col_088.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_088_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_088);
		p.columnOutDtl_col_089.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_089_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_089);
		p.columnOutDtl_col_090.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_090_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_090);
		p.columnOutDtl_col_091.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_091_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_091);
		p.columnOutDtl_col_092.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_092_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_092);
		p.columnOutDtl_col_093.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_093_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_093);
		p.columnOutDtl_col_094.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_094_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_094);
		p.columnOutDtl_col_095.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_095_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_095);
		p.columnOutDtl_col_096.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_096_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_096);
		p.columnOutDtl_col_097.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_097_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_097);
		p.columnOutDtl_col_098.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_098_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_098);
		p.columnOutDtl_col_099.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_099_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_col_099);
		p.columnOutDtl_ym.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ym_META);
		p.columnOutDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_ym);
		p.columnOutDtl_trd_grp.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.trd_grp_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_trd_grp);
		p.columnOutDtl_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.calc_grp_cd_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_calc_grp_cd);
		p.columnOutDtl_calc_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.calc_no_META);
		p.OutDtlTable.addColumnConfig(p.columnOutDtl_calc_no);
	}

	/**
	 * [InDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigInDtl(MGBFP_TrdCostSrch p) {
		p.columnInDtl_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.wg_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_wg_cd);
		p.columnInDtl_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.wg_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_wg_nm);
		p.columnInDtl_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mng_dpt_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_mng_dpt_cd);
		p.columnInDtl_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mng_dpt_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_mng_dpt_nm);
		p.InDtlTable.addTable(p.InDtl_itm_p_PPanel.ItmTable);
		p.columnInDtl_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_typ);
		p.columnInDtl_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_typ_nm);
		p.columnInDtl_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_d_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_typ_d_cd);
		p.columnInDtl_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_typ_d_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_typ_d_nm);
		p.columnInDtl_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_jnl_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_jnl_cd);
		p.columnInDtl_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.itm_jnl_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_itm_jnl_nm);
		p.columnInDtl_lot_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.lot_no_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_lot_no);
		p.columnInDtl_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sublot_no_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_sublot_no);
		p.columnInDtl_sno1.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno1_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_sno1);
		p.columnInDtl_sno2.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno2_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_sno2);
		p.columnInDtl_sno3.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno3_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_sno3);
		p.columnInDtl_sno4.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.sno4_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_sno4);
		p.columnInDtl_bp_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.bp_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_bp_cd);
		p.columnInDtl_bp_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.bp_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_bp_nm);
		p.columnInDtl_ac_slip_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_slip_typ_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ac_slip_typ);
		p.columnInDtl_ac_slip_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_slip_typ_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ac_slip_typ_nm);
		p.columnInDtl_ac_rsn_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_rsn_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ac_rsn_cd);
		p.columnInDtl_ac_rsn_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ac_rsn_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ac_rsn_nm);
		p.columnInDtl_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.asst_typ_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_asst_typ);
		p.columnInDtl_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.asst_typ_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_asst_typ_nm);
		p.columnInDtl_per.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.per_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_per);
		p.columnInDtl_mfg_cost_ratio.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.mfg_cost_ratio_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_mfg_cost_ratio);
		p.InDtlTable.addTable(p.InDtl_qty_p_PPanel.QtyTable);
		p.InDtl_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnInDtl_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.unit_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_unit_cd);
		p.columnInDtl_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.unit_nm_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_unit_nm);
		p.columnInDtl_dec_place.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.dec_place_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_dec_place);
		p.columnInDtl_upri.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.upri_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_upri);
		p.columnInDtl_ttl.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ttl_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ttl);
		p.columnInDtl_col_000.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_000_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_000);
		p.columnInDtl_col_001.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_001_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_001);
		p.columnInDtl_col_002.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_002_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_002);
		p.columnInDtl_col_003.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_003_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_003);
		p.columnInDtl_col_004.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_004_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_004);
		p.columnInDtl_col_005.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_005_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_005);
		p.columnInDtl_col_006.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_006_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_006);
		p.columnInDtl_col_007.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_007_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_007);
		p.columnInDtl_col_008.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_008_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_008);
		p.columnInDtl_col_009.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_009_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_009);
		p.columnInDtl_col_010.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_010_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_010);
		p.columnInDtl_col_011.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_011_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_011);
		p.columnInDtl_col_012.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_012_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_012);
		p.columnInDtl_col_013.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_013_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_013);
		p.columnInDtl_col_014.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_014_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_014);
		p.columnInDtl_col_015.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_015_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_015);
		p.columnInDtl_col_016.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_016_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_016);
		p.columnInDtl_col_017.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_017_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_017);
		p.columnInDtl_col_018.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_018_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_018);
		p.columnInDtl_col_019.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_019_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_019);
		p.columnInDtl_col_020.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_020_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_020);
		p.columnInDtl_col_021.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_021_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_021);
		p.columnInDtl_col_022.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_022_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_022);
		p.columnInDtl_col_023.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_023_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_023);
		p.columnInDtl_col_024.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_024_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_024);
		p.columnInDtl_col_025.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_025_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_025);
		p.columnInDtl_col_026.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_026_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_026);
		p.columnInDtl_col_027.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_027_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_027);
		p.columnInDtl_col_028.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_028_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_028);
		p.columnInDtl_col_029.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_029_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_029);
		p.columnInDtl_col_030.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_030_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_030);
		p.columnInDtl_col_031.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_031_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_031);
		p.columnInDtl_col_032.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_032_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_032);
		p.columnInDtl_col_033.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_033_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_033);
		p.columnInDtl_col_034.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_034_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_034);
		p.columnInDtl_col_035.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_035_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_035);
		p.columnInDtl_col_036.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_036_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_036);
		p.columnInDtl_col_037.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_037_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_037);
		p.columnInDtl_col_038.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_038_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_038);
		p.columnInDtl_col_039.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_039_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_039);
		p.columnInDtl_col_040.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_040_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_040);
		p.columnInDtl_col_041.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_041_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_041);
		p.columnInDtl_col_042.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_042_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_042);
		p.columnInDtl_col_043.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_043_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_043);
		p.columnInDtl_col_044.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_044_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_044);
		p.columnInDtl_col_045.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_045_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_045);
		p.columnInDtl_col_046.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_046_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_046);
		p.columnInDtl_col_047.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_047_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_047);
		p.columnInDtl_col_048.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_048_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_048);
		p.columnInDtl_col_049.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_049_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_049);
		p.columnInDtl_col_050.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_050_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_050);
		p.columnInDtl_col_051.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_051_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_051);
		p.columnInDtl_col_052.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_052_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_052);
		p.columnInDtl_col_053.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_053_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_053);
		p.columnInDtl_col_054.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_054_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_054);
		p.columnInDtl_col_055.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_055_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_055);
		p.columnInDtl_col_056.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_056_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_056);
		p.columnInDtl_col_057.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_057_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_057);
		p.columnInDtl_col_058.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_058_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_058);
		p.columnInDtl_col_059.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_059_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_059);
		p.columnInDtl_col_060.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_060_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_060);
		p.columnInDtl_col_061.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_061_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_061);
		p.columnInDtl_col_062.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_062_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_062);
		p.columnInDtl_col_063.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_063_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_063);
		p.columnInDtl_col_064.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_064_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_064);
		p.columnInDtl_col_065.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_065_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_065);
		p.columnInDtl_col_066.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_066_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_066);
		p.columnInDtl_col_067.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_067_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_067);
		p.columnInDtl_col_068.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_068_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_068);
		p.columnInDtl_col_069.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_069_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_069);
		p.columnInDtl_col_070.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_070_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_070);
		p.columnInDtl_col_071.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_071_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_071);
		p.columnInDtl_col_072.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_072_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_072);
		p.columnInDtl_col_073.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_073_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_073);
		p.columnInDtl_col_074.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_074_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_074);
		p.columnInDtl_col_075.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_075_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_075);
		p.columnInDtl_col_076.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_076_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_076);
		p.columnInDtl_col_077.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_077_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_077);
		p.columnInDtl_col_078.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_078_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_078);
		p.columnInDtl_col_079.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_079_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_079);
		p.columnInDtl_col_080.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_080_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_080);
		p.columnInDtl_col_081.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_081_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_081);
		p.columnInDtl_col_082.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_082_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_082);
		p.columnInDtl_col_083.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_083_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_083);
		p.columnInDtl_col_084.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_084_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_084);
		p.columnInDtl_col_085.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_085_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_085);
		p.columnInDtl_col_086.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_086_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_086);
		p.columnInDtl_col_087.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_087_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_087);
		p.columnInDtl_col_088.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_088_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_088);
		p.columnInDtl_col_089.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_089_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_089);
		p.columnInDtl_col_090.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_090_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_090);
		p.columnInDtl_col_091.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_091_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_091);
		p.columnInDtl_col_092.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_092_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_092);
		p.columnInDtl_col_093.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_093_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_093);
		p.columnInDtl_col_094.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_094_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_094);
		p.columnInDtl_col_095.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_095_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_095);
		p.columnInDtl_col_096.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_096_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_096);
		p.columnInDtl_col_097.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_097_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_097);
		p.columnInDtl_col_098.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_098_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_098);
		p.columnInDtl_col_099.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.col_099_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_col_099);
		p.columnInDtl_ym.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.ym_META);
		p.columnInDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.InDtlTable.addColumnConfig(p.columnInDtl_ym);
		p.columnInDtl_trd_grp.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.trd_grp_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_trd_grp);
		p.columnInDtl_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.calc_grp_cd_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_calc_grp_cd);
		p.columnInDtl_calc_no.setMeta(mcframe.clientMGBF.MGBFP0160.OutDtlR.calc_no_META);
		p.InDtlTable.addColumnConfig(p.columnInDtl_calc_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		Cnd_ym.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym.getListConfig().setPutter(getCnd_ym_ListPutter());
		columnOutDtl_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnOutDtl_mng_dpt_cd.getListConfig().setPutter(getOutDtl_mng_dpt_cd_ListPutter());
		columnInDtl_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnInDtl_mng_dpt_cd.getListConfig().setPutter(getInDtl_mng_dpt_cd_ListPutter());
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
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Cnd_ym_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcArgYm");
		return lp;
	}
	 
	/**
	 * [OutDtl_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createOutDtl_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [InDtl_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createInDtl_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_ym) return getCnd_ym(row, info);
		if(combo == columnOutDtl_mng_dpt_cd) return getOutDtl_mng_dpt_cd(row, info);
		if(combo == columnInDtl_mng_dpt_cd) return getInDtl_mng_dpt_cd(row, info);
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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == OutDtlTable) return doOutDtl_VC(info);
		if (vc == InDtlTable) return doInDtl_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_trd_grp) return doCnd_trd_grp_VC(info);
		if (vc == Cnd_not_trd_zero_flg) return doCnd_not_trd_zero_flg_VC(info);
		if (vc == LPnl_disp_expns_grp) return doLPnl_disp_expns_grp_VC(info);
		if (vc == LPnl_disp_expns) return doLPnl_disp_expns_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_trd_grp) return doRslt_trd_grp_VC(info);
		if (vc == columnRslt_ttl) return doRslt_ttl_VC(info);
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
		if (vc == columnRslt_calc_grp_cd) return doRslt_calc_grp_cd_VC(info);
		if (vc == columnRslt_calc_no) return doRslt_calc_no_VC(info);
		if (vc == columnRslt_srched_flg) return doRslt_srched_flg_VC(info);
		if (vc == columnOutDtl_wg_cd) return doOutDtl_wg_cd_VC(info);
		if (vc == columnOutDtl_wg_nm) return doOutDtl_wg_nm_VC(info);
		if (vc == columnOutDtl_mng_dpt_cd) return doOutDtl_mng_dpt_cd_VC(info);
		if (vc == columnOutDtl_mng_dpt_nm) return doOutDtl_mng_dpt_nm_VC(info);
		if (vc == columnOutDtl_itm_typ) return doOutDtl_itm_typ_VC(info);
		if (vc == columnOutDtl_itm_typ_nm) return doOutDtl_itm_typ_nm_VC(info);
		if (vc == columnOutDtl_itm_typ_d_cd) return doOutDtl_itm_typ_d_cd_VC(info);
		if (vc == columnOutDtl_itm_typ_d_nm) return doOutDtl_itm_typ_d_nm_VC(info);
		if (vc == columnOutDtl_itm_jnl_cd) return doOutDtl_itm_jnl_cd_VC(info);
		if (vc == columnOutDtl_itm_jnl_nm) return doOutDtl_itm_jnl_nm_VC(info);
		if (vc == columnOutDtl_lot_no) return doOutDtl_lot_no_VC(info);
		if (vc == columnOutDtl_sublot_no) return doOutDtl_sublot_no_VC(info);
		if (vc == columnOutDtl_sno1) return doOutDtl_sno1_VC(info);
		if (vc == columnOutDtl_sno2) return doOutDtl_sno2_VC(info);
		if (vc == columnOutDtl_sno3) return doOutDtl_sno3_VC(info);
		if (vc == columnOutDtl_sno4) return doOutDtl_sno4_VC(info);
		if (vc == columnOutDtl_bp_cd) return doOutDtl_bp_cd_VC(info);
		if (vc == columnOutDtl_bp_nm) return doOutDtl_bp_nm_VC(info);
		if (vc == columnOutDtl_ac_slip_typ) return doOutDtl_ac_slip_typ_VC(info);
		if (vc == columnOutDtl_ac_slip_typ_nm) return doOutDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnOutDtl_ac_rsn_cd) return doOutDtl_ac_rsn_cd_VC(info);
		if (vc == columnOutDtl_ac_rsn_nm) return doOutDtl_ac_rsn_nm_VC(info);
		if (vc == columnOutDtl_asst_typ) return doOutDtl_asst_typ_VC(info);
		if (vc == columnOutDtl_asst_typ_nm) return doOutDtl_asst_typ_nm_VC(info);
		if (vc == columnOutDtl_per) return doOutDtl_per_VC(info);
		if (vc == columnOutDtl_mfg_cost_ratio) return doOutDtl_mfg_cost_ratio_VC(info);
		if (vc == columnOutDtl_unit_cd) return doOutDtl_unit_cd_VC(info);
		if (vc == columnOutDtl_unit_nm) return doOutDtl_unit_nm_VC(info);
		if (vc == columnOutDtl_dec_place) return doOutDtl_dec_place_VC(info);
		if (vc == columnOutDtl_upri) return doOutDtl_upri_VC(info);
		if (vc == columnOutDtl_ttl) return doOutDtl_ttl_VC(info);
		if (vc == columnOutDtl_col_000) return doOutDtl_col_000_VC(info);
		if (vc == columnOutDtl_col_001) return doOutDtl_col_001_VC(info);
		if (vc == columnOutDtl_col_002) return doOutDtl_col_002_VC(info);
		if (vc == columnOutDtl_col_003) return doOutDtl_col_003_VC(info);
		if (vc == columnOutDtl_col_004) return doOutDtl_col_004_VC(info);
		if (vc == columnOutDtl_col_005) return doOutDtl_col_005_VC(info);
		if (vc == columnOutDtl_col_006) return doOutDtl_col_006_VC(info);
		if (vc == columnOutDtl_col_007) return doOutDtl_col_007_VC(info);
		if (vc == columnOutDtl_col_008) return doOutDtl_col_008_VC(info);
		if (vc == columnOutDtl_col_009) return doOutDtl_col_009_VC(info);
		if (vc == columnOutDtl_col_010) return doOutDtl_col_010_VC(info);
		if (vc == columnOutDtl_col_011) return doOutDtl_col_011_VC(info);
		if (vc == columnOutDtl_col_012) return doOutDtl_col_012_VC(info);
		if (vc == columnOutDtl_col_013) return doOutDtl_col_013_VC(info);
		if (vc == columnOutDtl_col_014) return doOutDtl_col_014_VC(info);
		if (vc == columnOutDtl_col_015) return doOutDtl_col_015_VC(info);
		if (vc == columnOutDtl_col_016) return doOutDtl_col_016_VC(info);
		if (vc == columnOutDtl_col_017) return doOutDtl_col_017_VC(info);
		if (vc == columnOutDtl_col_018) return doOutDtl_col_018_VC(info);
		if (vc == columnOutDtl_col_019) return doOutDtl_col_019_VC(info);
		if (vc == columnOutDtl_col_020) return doOutDtl_col_020_VC(info);
		if (vc == columnOutDtl_col_021) return doOutDtl_col_021_VC(info);
		if (vc == columnOutDtl_col_022) return doOutDtl_col_022_VC(info);
		if (vc == columnOutDtl_col_023) return doOutDtl_col_023_VC(info);
		if (vc == columnOutDtl_col_024) return doOutDtl_col_024_VC(info);
		if (vc == columnOutDtl_col_025) return doOutDtl_col_025_VC(info);
		if (vc == columnOutDtl_col_026) return doOutDtl_col_026_VC(info);
		if (vc == columnOutDtl_col_027) return doOutDtl_col_027_VC(info);
		if (vc == columnOutDtl_col_028) return doOutDtl_col_028_VC(info);
		if (vc == columnOutDtl_col_029) return doOutDtl_col_029_VC(info);
		if (vc == columnOutDtl_col_030) return doOutDtl_col_030_VC(info);
		if (vc == columnOutDtl_col_031) return doOutDtl_col_031_VC(info);
		if (vc == columnOutDtl_col_032) return doOutDtl_col_032_VC(info);
		if (vc == columnOutDtl_col_033) return doOutDtl_col_033_VC(info);
		if (vc == columnOutDtl_col_034) return doOutDtl_col_034_VC(info);
		if (vc == columnOutDtl_col_035) return doOutDtl_col_035_VC(info);
		if (vc == columnOutDtl_col_036) return doOutDtl_col_036_VC(info);
		if (vc == columnOutDtl_col_037) return doOutDtl_col_037_VC(info);
		if (vc == columnOutDtl_col_038) return doOutDtl_col_038_VC(info);
		if (vc == columnOutDtl_col_039) return doOutDtl_col_039_VC(info);
		if (vc == columnOutDtl_col_040) return doOutDtl_col_040_VC(info);
		if (vc == columnOutDtl_col_041) return doOutDtl_col_041_VC(info);
		if (vc == columnOutDtl_col_042) return doOutDtl_col_042_VC(info);
		if (vc == columnOutDtl_col_043) return doOutDtl_col_043_VC(info);
		if (vc == columnOutDtl_col_044) return doOutDtl_col_044_VC(info);
		if (vc == columnOutDtl_col_045) return doOutDtl_col_045_VC(info);
		if (vc == columnOutDtl_col_046) return doOutDtl_col_046_VC(info);
		if (vc == columnOutDtl_col_047) return doOutDtl_col_047_VC(info);
		if (vc == columnOutDtl_col_048) return doOutDtl_col_048_VC(info);
		if (vc == columnOutDtl_col_049) return doOutDtl_col_049_VC(info);
		if (vc == columnOutDtl_col_050) return doOutDtl_col_050_VC(info);
		if (vc == columnOutDtl_col_051) return doOutDtl_col_051_VC(info);
		if (vc == columnOutDtl_col_052) return doOutDtl_col_052_VC(info);
		if (vc == columnOutDtl_col_053) return doOutDtl_col_053_VC(info);
		if (vc == columnOutDtl_col_054) return doOutDtl_col_054_VC(info);
		if (vc == columnOutDtl_col_055) return doOutDtl_col_055_VC(info);
		if (vc == columnOutDtl_col_056) return doOutDtl_col_056_VC(info);
		if (vc == columnOutDtl_col_057) return doOutDtl_col_057_VC(info);
		if (vc == columnOutDtl_col_058) return doOutDtl_col_058_VC(info);
		if (vc == columnOutDtl_col_059) return doOutDtl_col_059_VC(info);
		if (vc == columnOutDtl_col_060) return doOutDtl_col_060_VC(info);
		if (vc == columnOutDtl_col_061) return doOutDtl_col_061_VC(info);
		if (vc == columnOutDtl_col_062) return doOutDtl_col_062_VC(info);
		if (vc == columnOutDtl_col_063) return doOutDtl_col_063_VC(info);
		if (vc == columnOutDtl_col_064) return doOutDtl_col_064_VC(info);
		if (vc == columnOutDtl_col_065) return doOutDtl_col_065_VC(info);
		if (vc == columnOutDtl_col_066) return doOutDtl_col_066_VC(info);
		if (vc == columnOutDtl_col_067) return doOutDtl_col_067_VC(info);
		if (vc == columnOutDtl_col_068) return doOutDtl_col_068_VC(info);
		if (vc == columnOutDtl_col_069) return doOutDtl_col_069_VC(info);
		if (vc == columnOutDtl_col_070) return doOutDtl_col_070_VC(info);
		if (vc == columnOutDtl_col_071) return doOutDtl_col_071_VC(info);
		if (vc == columnOutDtl_col_072) return doOutDtl_col_072_VC(info);
		if (vc == columnOutDtl_col_073) return doOutDtl_col_073_VC(info);
		if (vc == columnOutDtl_col_074) return doOutDtl_col_074_VC(info);
		if (vc == columnOutDtl_col_075) return doOutDtl_col_075_VC(info);
		if (vc == columnOutDtl_col_076) return doOutDtl_col_076_VC(info);
		if (vc == columnOutDtl_col_077) return doOutDtl_col_077_VC(info);
		if (vc == columnOutDtl_col_078) return doOutDtl_col_078_VC(info);
		if (vc == columnOutDtl_col_079) return doOutDtl_col_079_VC(info);
		if (vc == columnOutDtl_col_080) return doOutDtl_col_080_VC(info);
		if (vc == columnOutDtl_col_081) return doOutDtl_col_081_VC(info);
		if (vc == columnOutDtl_col_082) return doOutDtl_col_082_VC(info);
		if (vc == columnOutDtl_col_083) return doOutDtl_col_083_VC(info);
		if (vc == columnOutDtl_col_084) return doOutDtl_col_084_VC(info);
		if (vc == columnOutDtl_col_085) return doOutDtl_col_085_VC(info);
		if (vc == columnOutDtl_col_086) return doOutDtl_col_086_VC(info);
		if (vc == columnOutDtl_col_087) return doOutDtl_col_087_VC(info);
		if (vc == columnOutDtl_col_088) return doOutDtl_col_088_VC(info);
		if (vc == columnOutDtl_col_089) return doOutDtl_col_089_VC(info);
		if (vc == columnOutDtl_col_090) return doOutDtl_col_090_VC(info);
		if (vc == columnOutDtl_col_091) return doOutDtl_col_091_VC(info);
		if (vc == columnOutDtl_col_092) return doOutDtl_col_092_VC(info);
		if (vc == columnOutDtl_col_093) return doOutDtl_col_093_VC(info);
		if (vc == columnOutDtl_col_094) return doOutDtl_col_094_VC(info);
		if (vc == columnOutDtl_col_095) return doOutDtl_col_095_VC(info);
		if (vc == columnOutDtl_col_096) return doOutDtl_col_096_VC(info);
		if (vc == columnOutDtl_col_097) return doOutDtl_col_097_VC(info);
		if (vc == columnOutDtl_col_098) return doOutDtl_col_098_VC(info);
		if (vc == columnOutDtl_col_099) return doOutDtl_col_099_VC(info);
		if (vc == columnOutDtl_ym) return doOutDtl_ym_VC(info);
		if (vc == columnOutDtl_trd_grp) return doOutDtl_trd_grp_VC(info);
		if (vc == columnOutDtl_calc_grp_cd) return doOutDtl_calc_grp_cd_VC(info);
		if (vc == columnOutDtl_calc_no) return doOutDtl_calc_no_VC(info);
		if (vc == columnInDtl_wg_cd) return doInDtl_wg_cd_VC(info);
		if (vc == columnInDtl_wg_nm) return doInDtl_wg_nm_VC(info);
		if (vc == columnInDtl_mng_dpt_cd) return doInDtl_mng_dpt_cd_VC(info);
		if (vc == columnInDtl_mng_dpt_nm) return doInDtl_mng_dpt_nm_VC(info);
		if (vc == columnInDtl_itm_typ) return doInDtl_itm_typ_VC(info);
		if (vc == columnInDtl_itm_typ_nm) return doInDtl_itm_typ_nm_VC(info);
		if (vc == columnInDtl_itm_typ_d_cd) return doInDtl_itm_typ_d_cd_VC(info);
		if (vc == columnInDtl_itm_typ_d_nm) return doInDtl_itm_typ_d_nm_VC(info);
		if (vc == columnInDtl_itm_jnl_cd) return doInDtl_itm_jnl_cd_VC(info);
		if (vc == columnInDtl_itm_jnl_nm) return doInDtl_itm_jnl_nm_VC(info);
		if (vc == columnInDtl_lot_no) return doInDtl_lot_no_VC(info);
		if (vc == columnInDtl_sublot_no) return doInDtl_sublot_no_VC(info);
		if (vc == columnInDtl_sno1) return doInDtl_sno1_VC(info);
		if (vc == columnInDtl_sno2) return doInDtl_sno2_VC(info);
		if (vc == columnInDtl_sno3) return doInDtl_sno3_VC(info);
		if (vc == columnInDtl_sno4) return doInDtl_sno4_VC(info);
		if (vc == columnInDtl_bp_cd) return doInDtl_bp_cd_VC(info);
		if (vc == columnInDtl_bp_nm) return doInDtl_bp_nm_VC(info);
		if (vc == columnInDtl_ac_slip_typ) return doInDtl_ac_slip_typ_VC(info);
		if (vc == columnInDtl_ac_slip_typ_nm) return doInDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnInDtl_ac_rsn_cd) return doInDtl_ac_rsn_cd_VC(info);
		if (vc == columnInDtl_ac_rsn_nm) return doInDtl_ac_rsn_nm_VC(info);
		if (vc == columnInDtl_asst_typ) return doInDtl_asst_typ_VC(info);
		if (vc == columnInDtl_asst_typ_nm) return doInDtl_asst_typ_nm_VC(info);
		if (vc == columnInDtl_per) return doInDtl_per_VC(info);
		if (vc == columnInDtl_mfg_cost_ratio) return doInDtl_mfg_cost_ratio_VC(info);
		if (vc == columnInDtl_unit_cd) return doInDtl_unit_cd_VC(info);
		if (vc == columnInDtl_unit_nm) return doInDtl_unit_nm_VC(info);
		if (vc == columnInDtl_dec_place) return doInDtl_dec_place_VC(info);
		if (vc == columnInDtl_upri) return doInDtl_upri_VC(info);
		if (vc == columnInDtl_ttl) return doInDtl_ttl_VC(info);
		if (vc == columnInDtl_col_000) return doInDtl_col_000_VC(info);
		if (vc == columnInDtl_col_001) return doInDtl_col_001_VC(info);
		if (vc == columnInDtl_col_002) return doInDtl_col_002_VC(info);
		if (vc == columnInDtl_col_003) return doInDtl_col_003_VC(info);
		if (vc == columnInDtl_col_004) return doInDtl_col_004_VC(info);
		if (vc == columnInDtl_col_005) return doInDtl_col_005_VC(info);
		if (vc == columnInDtl_col_006) return doInDtl_col_006_VC(info);
		if (vc == columnInDtl_col_007) return doInDtl_col_007_VC(info);
		if (vc == columnInDtl_col_008) return doInDtl_col_008_VC(info);
		if (vc == columnInDtl_col_009) return doInDtl_col_009_VC(info);
		if (vc == columnInDtl_col_010) return doInDtl_col_010_VC(info);
		if (vc == columnInDtl_col_011) return doInDtl_col_011_VC(info);
		if (vc == columnInDtl_col_012) return doInDtl_col_012_VC(info);
		if (vc == columnInDtl_col_013) return doInDtl_col_013_VC(info);
		if (vc == columnInDtl_col_014) return doInDtl_col_014_VC(info);
		if (vc == columnInDtl_col_015) return doInDtl_col_015_VC(info);
		if (vc == columnInDtl_col_016) return doInDtl_col_016_VC(info);
		if (vc == columnInDtl_col_017) return doInDtl_col_017_VC(info);
		if (vc == columnInDtl_col_018) return doInDtl_col_018_VC(info);
		if (vc == columnInDtl_col_019) return doInDtl_col_019_VC(info);
		if (vc == columnInDtl_col_020) return doInDtl_col_020_VC(info);
		if (vc == columnInDtl_col_021) return doInDtl_col_021_VC(info);
		if (vc == columnInDtl_col_022) return doInDtl_col_022_VC(info);
		if (vc == columnInDtl_col_023) return doInDtl_col_023_VC(info);
		if (vc == columnInDtl_col_024) return doInDtl_col_024_VC(info);
		if (vc == columnInDtl_col_025) return doInDtl_col_025_VC(info);
		if (vc == columnInDtl_col_026) return doInDtl_col_026_VC(info);
		if (vc == columnInDtl_col_027) return doInDtl_col_027_VC(info);
		if (vc == columnInDtl_col_028) return doInDtl_col_028_VC(info);
		if (vc == columnInDtl_col_029) return doInDtl_col_029_VC(info);
		if (vc == columnInDtl_col_030) return doInDtl_col_030_VC(info);
		if (vc == columnInDtl_col_031) return doInDtl_col_031_VC(info);
		if (vc == columnInDtl_col_032) return doInDtl_col_032_VC(info);
		if (vc == columnInDtl_col_033) return doInDtl_col_033_VC(info);
		if (vc == columnInDtl_col_034) return doInDtl_col_034_VC(info);
		if (vc == columnInDtl_col_035) return doInDtl_col_035_VC(info);
		if (vc == columnInDtl_col_036) return doInDtl_col_036_VC(info);
		if (vc == columnInDtl_col_037) return doInDtl_col_037_VC(info);
		if (vc == columnInDtl_col_038) return doInDtl_col_038_VC(info);
		if (vc == columnInDtl_col_039) return doInDtl_col_039_VC(info);
		if (vc == columnInDtl_col_040) return doInDtl_col_040_VC(info);
		if (vc == columnInDtl_col_041) return doInDtl_col_041_VC(info);
		if (vc == columnInDtl_col_042) return doInDtl_col_042_VC(info);
		if (vc == columnInDtl_col_043) return doInDtl_col_043_VC(info);
		if (vc == columnInDtl_col_044) return doInDtl_col_044_VC(info);
		if (vc == columnInDtl_col_045) return doInDtl_col_045_VC(info);
		if (vc == columnInDtl_col_046) return doInDtl_col_046_VC(info);
		if (vc == columnInDtl_col_047) return doInDtl_col_047_VC(info);
		if (vc == columnInDtl_col_048) return doInDtl_col_048_VC(info);
		if (vc == columnInDtl_col_049) return doInDtl_col_049_VC(info);
		if (vc == columnInDtl_col_050) return doInDtl_col_050_VC(info);
		if (vc == columnInDtl_col_051) return doInDtl_col_051_VC(info);
		if (vc == columnInDtl_col_052) return doInDtl_col_052_VC(info);
		if (vc == columnInDtl_col_053) return doInDtl_col_053_VC(info);
		if (vc == columnInDtl_col_054) return doInDtl_col_054_VC(info);
		if (vc == columnInDtl_col_055) return doInDtl_col_055_VC(info);
		if (vc == columnInDtl_col_056) return doInDtl_col_056_VC(info);
		if (vc == columnInDtl_col_057) return doInDtl_col_057_VC(info);
		if (vc == columnInDtl_col_058) return doInDtl_col_058_VC(info);
		if (vc == columnInDtl_col_059) return doInDtl_col_059_VC(info);
		if (vc == columnInDtl_col_060) return doInDtl_col_060_VC(info);
		if (vc == columnInDtl_col_061) return doInDtl_col_061_VC(info);
		if (vc == columnInDtl_col_062) return doInDtl_col_062_VC(info);
		if (vc == columnInDtl_col_063) return doInDtl_col_063_VC(info);
		if (vc == columnInDtl_col_064) return doInDtl_col_064_VC(info);
		if (vc == columnInDtl_col_065) return doInDtl_col_065_VC(info);
		if (vc == columnInDtl_col_066) return doInDtl_col_066_VC(info);
		if (vc == columnInDtl_col_067) return doInDtl_col_067_VC(info);
		if (vc == columnInDtl_col_068) return doInDtl_col_068_VC(info);
		if (vc == columnInDtl_col_069) return doInDtl_col_069_VC(info);
		if (vc == columnInDtl_col_070) return doInDtl_col_070_VC(info);
		if (vc == columnInDtl_col_071) return doInDtl_col_071_VC(info);
		if (vc == columnInDtl_col_072) return doInDtl_col_072_VC(info);
		if (vc == columnInDtl_col_073) return doInDtl_col_073_VC(info);
		if (vc == columnInDtl_col_074) return doInDtl_col_074_VC(info);
		if (vc == columnInDtl_col_075) return doInDtl_col_075_VC(info);
		if (vc == columnInDtl_col_076) return doInDtl_col_076_VC(info);
		if (vc == columnInDtl_col_077) return doInDtl_col_077_VC(info);
		if (vc == columnInDtl_col_078) return doInDtl_col_078_VC(info);
		if (vc == columnInDtl_col_079) return doInDtl_col_079_VC(info);
		if (vc == columnInDtl_col_080) return doInDtl_col_080_VC(info);
		if (vc == columnInDtl_col_081) return doInDtl_col_081_VC(info);
		if (vc == columnInDtl_col_082) return doInDtl_col_082_VC(info);
		if (vc == columnInDtl_col_083) return doInDtl_col_083_VC(info);
		if (vc == columnInDtl_col_084) return doInDtl_col_084_VC(info);
		if (vc == columnInDtl_col_085) return doInDtl_col_085_VC(info);
		if (vc == columnInDtl_col_086) return doInDtl_col_086_VC(info);
		if (vc == columnInDtl_col_087) return doInDtl_col_087_VC(info);
		if (vc == columnInDtl_col_088) return doInDtl_col_088_VC(info);
		if (vc == columnInDtl_col_089) return doInDtl_col_089_VC(info);
		if (vc == columnInDtl_col_090) return doInDtl_col_090_VC(info);
		if (vc == columnInDtl_col_091) return doInDtl_col_091_VC(info);
		if (vc == columnInDtl_col_092) return doInDtl_col_092_VC(info);
		if (vc == columnInDtl_col_093) return doInDtl_col_093_VC(info);
		if (vc == columnInDtl_col_094) return doInDtl_col_094_VC(info);
		if (vc == columnInDtl_col_095) return doInDtl_col_095_VC(info);
		if (vc == columnInDtl_col_096) return doInDtl_col_096_VC(info);
		if (vc == columnInDtl_col_097) return doInDtl_col_097_VC(info);
		if (vc == columnInDtl_col_098) return doInDtl_col_098_VC(info);
		if (vc == columnInDtl_col_099) return doInDtl_col_099_VC(info);
		if (vc == columnInDtl_ym) return doInDtl_ym_VC(info);
		if (vc == columnInDtl_trd_grp) return doInDtl_trd_grp_VC(info);
		if (vc == columnInDtl_calc_grp_cd) return doInDtl_calc_grp_cd_VC(info);
		if (vc == columnInDtl_calc_no) return doInDtl_calc_no_VC(info);
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
	 * [OutDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_trd_zero_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_trd_zero_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_grp_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[srched_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_srched_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[per]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_per_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[mfg_cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_mfg_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[trd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_trd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [OutDtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doOutDtl_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[per]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_per_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[mfg_cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_mfg_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[trd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_trd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InDtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInDtl_calc_no_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == OutDtlTable) doOutDtl_NC(info);
		else if (nc == InDtlTable) doInDtl_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_trd_grp) doCnd_trd_grp_NC(info);
		else if (nc == Cnd_not_trd_zero_flg) doCnd_not_trd_zero_flg_NC(info);
		else if (nc == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NC(info);
		else if (nc == LPnl_disp_expns) doLPnl_disp_expns_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_trd_grp) doRslt_trd_grp_NC(info);
		else if (nc == columnRslt_ttl) doRslt_ttl_NC(info);
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
		else if (nc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NC(info);
		else if (nc == columnRslt_calc_no) doRslt_calc_no_NC(info);
		else if (nc == columnRslt_srched_flg) doRslt_srched_flg_NC(info);
		else if (nc == columnOutDtl_wg_cd) doOutDtl_wg_cd_NC(info);
		else if (nc == columnOutDtl_wg_nm) doOutDtl_wg_nm_NC(info);
		else if (nc == columnOutDtl_mng_dpt_cd) doOutDtl_mng_dpt_cd_NC(info);
		else if (nc == columnOutDtl_mng_dpt_nm) doOutDtl_mng_dpt_nm_NC(info);
		else if (nc == columnOutDtl_itm_typ) doOutDtl_itm_typ_NC(info);
		else if (nc == columnOutDtl_itm_typ_nm) doOutDtl_itm_typ_nm_NC(info);
		else if (nc == columnOutDtl_itm_typ_d_cd) doOutDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnOutDtl_itm_typ_d_nm) doOutDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnOutDtl_itm_jnl_cd) doOutDtl_itm_jnl_cd_NC(info);
		else if (nc == columnOutDtl_itm_jnl_nm) doOutDtl_itm_jnl_nm_NC(info);
		else if (nc == columnOutDtl_lot_no) doOutDtl_lot_no_NC(info);
		else if (nc == columnOutDtl_sublot_no) doOutDtl_sublot_no_NC(info);
		else if (nc == columnOutDtl_sno1) doOutDtl_sno1_NC(info);
		else if (nc == columnOutDtl_sno2) doOutDtl_sno2_NC(info);
		else if (nc == columnOutDtl_sno3) doOutDtl_sno3_NC(info);
		else if (nc == columnOutDtl_sno4) doOutDtl_sno4_NC(info);
		else if (nc == columnOutDtl_bp_cd) doOutDtl_bp_cd_NC(info);
		else if (nc == columnOutDtl_bp_nm) doOutDtl_bp_nm_NC(info);
		else if (nc == columnOutDtl_ac_slip_typ) doOutDtl_ac_slip_typ_NC(info);
		else if (nc == columnOutDtl_ac_slip_typ_nm) doOutDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnOutDtl_ac_rsn_cd) doOutDtl_ac_rsn_cd_NC(info);
		else if (nc == columnOutDtl_ac_rsn_nm) doOutDtl_ac_rsn_nm_NC(info);
		else if (nc == columnOutDtl_asst_typ) doOutDtl_asst_typ_NC(info);
		else if (nc == columnOutDtl_asst_typ_nm) doOutDtl_asst_typ_nm_NC(info);
		else if (nc == columnOutDtl_per) doOutDtl_per_NC(info);
		else if (nc == columnOutDtl_mfg_cost_ratio) doOutDtl_mfg_cost_ratio_NC(info);
		else if (nc == columnOutDtl_unit_cd) doOutDtl_unit_cd_NC(info);
		else if (nc == columnOutDtl_unit_nm) doOutDtl_unit_nm_NC(info);
		else if (nc == columnOutDtl_dec_place) doOutDtl_dec_place_NC(info);
		else if (nc == columnOutDtl_upri) doOutDtl_upri_NC(info);
		else if (nc == columnOutDtl_ttl) doOutDtl_ttl_NC(info);
		else if (nc == columnOutDtl_col_000) doOutDtl_col_000_NC(info);
		else if (nc == columnOutDtl_col_001) doOutDtl_col_001_NC(info);
		else if (nc == columnOutDtl_col_002) doOutDtl_col_002_NC(info);
		else if (nc == columnOutDtl_col_003) doOutDtl_col_003_NC(info);
		else if (nc == columnOutDtl_col_004) doOutDtl_col_004_NC(info);
		else if (nc == columnOutDtl_col_005) doOutDtl_col_005_NC(info);
		else if (nc == columnOutDtl_col_006) doOutDtl_col_006_NC(info);
		else if (nc == columnOutDtl_col_007) doOutDtl_col_007_NC(info);
		else if (nc == columnOutDtl_col_008) doOutDtl_col_008_NC(info);
		else if (nc == columnOutDtl_col_009) doOutDtl_col_009_NC(info);
		else if (nc == columnOutDtl_col_010) doOutDtl_col_010_NC(info);
		else if (nc == columnOutDtl_col_011) doOutDtl_col_011_NC(info);
		else if (nc == columnOutDtl_col_012) doOutDtl_col_012_NC(info);
		else if (nc == columnOutDtl_col_013) doOutDtl_col_013_NC(info);
		else if (nc == columnOutDtl_col_014) doOutDtl_col_014_NC(info);
		else if (nc == columnOutDtl_col_015) doOutDtl_col_015_NC(info);
		else if (nc == columnOutDtl_col_016) doOutDtl_col_016_NC(info);
		else if (nc == columnOutDtl_col_017) doOutDtl_col_017_NC(info);
		else if (nc == columnOutDtl_col_018) doOutDtl_col_018_NC(info);
		else if (nc == columnOutDtl_col_019) doOutDtl_col_019_NC(info);
		else if (nc == columnOutDtl_col_020) doOutDtl_col_020_NC(info);
		else if (nc == columnOutDtl_col_021) doOutDtl_col_021_NC(info);
		else if (nc == columnOutDtl_col_022) doOutDtl_col_022_NC(info);
		else if (nc == columnOutDtl_col_023) doOutDtl_col_023_NC(info);
		else if (nc == columnOutDtl_col_024) doOutDtl_col_024_NC(info);
		else if (nc == columnOutDtl_col_025) doOutDtl_col_025_NC(info);
		else if (nc == columnOutDtl_col_026) doOutDtl_col_026_NC(info);
		else if (nc == columnOutDtl_col_027) doOutDtl_col_027_NC(info);
		else if (nc == columnOutDtl_col_028) doOutDtl_col_028_NC(info);
		else if (nc == columnOutDtl_col_029) doOutDtl_col_029_NC(info);
		else if (nc == columnOutDtl_col_030) doOutDtl_col_030_NC(info);
		else if (nc == columnOutDtl_col_031) doOutDtl_col_031_NC(info);
		else if (nc == columnOutDtl_col_032) doOutDtl_col_032_NC(info);
		else if (nc == columnOutDtl_col_033) doOutDtl_col_033_NC(info);
		else if (nc == columnOutDtl_col_034) doOutDtl_col_034_NC(info);
		else if (nc == columnOutDtl_col_035) doOutDtl_col_035_NC(info);
		else if (nc == columnOutDtl_col_036) doOutDtl_col_036_NC(info);
		else if (nc == columnOutDtl_col_037) doOutDtl_col_037_NC(info);
		else if (nc == columnOutDtl_col_038) doOutDtl_col_038_NC(info);
		else if (nc == columnOutDtl_col_039) doOutDtl_col_039_NC(info);
		else if (nc == columnOutDtl_col_040) doOutDtl_col_040_NC(info);
		else if (nc == columnOutDtl_col_041) doOutDtl_col_041_NC(info);
		else if (nc == columnOutDtl_col_042) doOutDtl_col_042_NC(info);
		else if (nc == columnOutDtl_col_043) doOutDtl_col_043_NC(info);
		else if (nc == columnOutDtl_col_044) doOutDtl_col_044_NC(info);
		else if (nc == columnOutDtl_col_045) doOutDtl_col_045_NC(info);
		else if (nc == columnOutDtl_col_046) doOutDtl_col_046_NC(info);
		else if (nc == columnOutDtl_col_047) doOutDtl_col_047_NC(info);
		else if (nc == columnOutDtl_col_048) doOutDtl_col_048_NC(info);
		else if (nc == columnOutDtl_col_049) doOutDtl_col_049_NC(info);
		else if (nc == columnOutDtl_col_050) doOutDtl_col_050_NC(info);
		else if (nc == columnOutDtl_col_051) doOutDtl_col_051_NC(info);
		else if (nc == columnOutDtl_col_052) doOutDtl_col_052_NC(info);
		else if (nc == columnOutDtl_col_053) doOutDtl_col_053_NC(info);
		else if (nc == columnOutDtl_col_054) doOutDtl_col_054_NC(info);
		else if (nc == columnOutDtl_col_055) doOutDtl_col_055_NC(info);
		else if (nc == columnOutDtl_col_056) doOutDtl_col_056_NC(info);
		else if (nc == columnOutDtl_col_057) doOutDtl_col_057_NC(info);
		else if (nc == columnOutDtl_col_058) doOutDtl_col_058_NC(info);
		else if (nc == columnOutDtl_col_059) doOutDtl_col_059_NC(info);
		else if (nc == columnOutDtl_col_060) doOutDtl_col_060_NC(info);
		else if (nc == columnOutDtl_col_061) doOutDtl_col_061_NC(info);
		else if (nc == columnOutDtl_col_062) doOutDtl_col_062_NC(info);
		else if (nc == columnOutDtl_col_063) doOutDtl_col_063_NC(info);
		else if (nc == columnOutDtl_col_064) doOutDtl_col_064_NC(info);
		else if (nc == columnOutDtl_col_065) doOutDtl_col_065_NC(info);
		else if (nc == columnOutDtl_col_066) doOutDtl_col_066_NC(info);
		else if (nc == columnOutDtl_col_067) doOutDtl_col_067_NC(info);
		else if (nc == columnOutDtl_col_068) doOutDtl_col_068_NC(info);
		else if (nc == columnOutDtl_col_069) doOutDtl_col_069_NC(info);
		else if (nc == columnOutDtl_col_070) doOutDtl_col_070_NC(info);
		else if (nc == columnOutDtl_col_071) doOutDtl_col_071_NC(info);
		else if (nc == columnOutDtl_col_072) doOutDtl_col_072_NC(info);
		else if (nc == columnOutDtl_col_073) doOutDtl_col_073_NC(info);
		else if (nc == columnOutDtl_col_074) doOutDtl_col_074_NC(info);
		else if (nc == columnOutDtl_col_075) doOutDtl_col_075_NC(info);
		else if (nc == columnOutDtl_col_076) doOutDtl_col_076_NC(info);
		else if (nc == columnOutDtl_col_077) doOutDtl_col_077_NC(info);
		else if (nc == columnOutDtl_col_078) doOutDtl_col_078_NC(info);
		else if (nc == columnOutDtl_col_079) doOutDtl_col_079_NC(info);
		else if (nc == columnOutDtl_col_080) doOutDtl_col_080_NC(info);
		else if (nc == columnOutDtl_col_081) doOutDtl_col_081_NC(info);
		else if (nc == columnOutDtl_col_082) doOutDtl_col_082_NC(info);
		else if (nc == columnOutDtl_col_083) doOutDtl_col_083_NC(info);
		else if (nc == columnOutDtl_col_084) doOutDtl_col_084_NC(info);
		else if (nc == columnOutDtl_col_085) doOutDtl_col_085_NC(info);
		else if (nc == columnOutDtl_col_086) doOutDtl_col_086_NC(info);
		else if (nc == columnOutDtl_col_087) doOutDtl_col_087_NC(info);
		else if (nc == columnOutDtl_col_088) doOutDtl_col_088_NC(info);
		else if (nc == columnOutDtl_col_089) doOutDtl_col_089_NC(info);
		else if (nc == columnOutDtl_col_090) doOutDtl_col_090_NC(info);
		else if (nc == columnOutDtl_col_091) doOutDtl_col_091_NC(info);
		else if (nc == columnOutDtl_col_092) doOutDtl_col_092_NC(info);
		else if (nc == columnOutDtl_col_093) doOutDtl_col_093_NC(info);
		else if (nc == columnOutDtl_col_094) doOutDtl_col_094_NC(info);
		else if (nc == columnOutDtl_col_095) doOutDtl_col_095_NC(info);
		else if (nc == columnOutDtl_col_096) doOutDtl_col_096_NC(info);
		else if (nc == columnOutDtl_col_097) doOutDtl_col_097_NC(info);
		else if (nc == columnOutDtl_col_098) doOutDtl_col_098_NC(info);
		else if (nc == columnOutDtl_col_099) doOutDtl_col_099_NC(info);
		else if (nc == columnOutDtl_ym) doOutDtl_ym_NC(info);
		else if (nc == columnOutDtl_trd_grp) doOutDtl_trd_grp_NC(info);
		else if (nc == columnOutDtl_calc_grp_cd) doOutDtl_calc_grp_cd_NC(info);
		else if (nc == columnOutDtl_calc_no) doOutDtl_calc_no_NC(info);
		else if (nc == columnInDtl_wg_cd) doInDtl_wg_cd_NC(info);
		else if (nc == columnInDtl_wg_nm) doInDtl_wg_nm_NC(info);
		else if (nc == columnInDtl_mng_dpt_cd) doInDtl_mng_dpt_cd_NC(info);
		else if (nc == columnInDtl_mng_dpt_nm) doInDtl_mng_dpt_nm_NC(info);
		else if (nc == columnInDtl_itm_typ) doInDtl_itm_typ_NC(info);
		else if (nc == columnInDtl_itm_typ_nm) doInDtl_itm_typ_nm_NC(info);
		else if (nc == columnInDtl_itm_typ_d_cd) doInDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnInDtl_itm_typ_d_nm) doInDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnInDtl_itm_jnl_cd) doInDtl_itm_jnl_cd_NC(info);
		else if (nc == columnInDtl_itm_jnl_nm) doInDtl_itm_jnl_nm_NC(info);
		else if (nc == columnInDtl_lot_no) doInDtl_lot_no_NC(info);
		else if (nc == columnInDtl_sublot_no) doInDtl_sublot_no_NC(info);
		else if (nc == columnInDtl_sno1) doInDtl_sno1_NC(info);
		else if (nc == columnInDtl_sno2) doInDtl_sno2_NC(info);
		else if (nc == columnInDtl_sno3) doInDtl_sno3_NC(info);
		else if (nc == columnInDtl_sno4) doInDtl_sno4_NC(info);
		else if (nc == columnInDtl_bp_cd) doInDtl_bp_cd_NC(info);
		else if (nc == columnInDtl_bp_nm) doInDtl_bp_nm_NC(info);
		else if (nc == columnInDtl_ac_slip_typ) doInDtl_ac_slip_typ_NC(info);
		else if (nc == columnInDtl_ac_slip_typ_nm) doInDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnInDtl_ac_rsn_cd) doInDtl_ac_rsn_cd_NC(info);
		else if (nc == columnInDtl_ac_rsn_nm) doInDtl_ac_rsn_nm_NC(info);
		else if (nc == columnInDtl_asst_typ) doInDtl_asst_typ_NC(info);
		else if (nc == columnInDtl_asst_typ_nm) doInDtl_asst_typ_nm_NC(info);
		else if (nc == columnInDtl_per) doInDtl_per_NC(info);
		else if (nc == columnInDtl_mfg_cost_ratio) doInDtl_mfg_cost_ratio_NC(info);
		else if (nc == columnInDtl_unit_cd) doInDtl_unit_cd_NC(info);
		else if (nc == columnInDtl_unit_nm) doInDtl_unit_nm_NC(info);
		else if (nc == columnInDtl_dec_place) doInDtl_dec_place_NC(info);
		else if (nc == columnInDtl_upri) doInDtl_upri_NC(info);
		else if (nc == columnInDtl_ttl) doInDtl_ttl_NC(info);
		else if (nc == columnInDtl_col_000) doInDtl_col_000_NC(info);
		else if (nc == columnInDtl_col_001) doInDtl_col_001_NC(info);
		else if (nc == columnInDtl_col_002) doInDtl_col_002_NC(info);
		else if (nc == columnInDtl_col_003) doInDtl_col_003_NC(info);
		else if (nc == columnInDtl_col_004) doInDtl_col_004_NC(info);
		else if (nc == columnInDtl_col_005) doInDtl_col_005_NC(info);
		else if (nc == columnInDtl_col_006) doInDtl_col_006_NC(info);
		else if (nc == columnInDtl_col_007) doInDtl_col_007_NC(info);
		else if (nc == columnInDtl_col_008) doInDtl_col_008_NC(info);
		else if (nc == columnInDtl_col_009) doInDtl_col_009_NC(info);
		else if (nc == columnInDtl_col_010) doInDtl_col_010_NC(info);
		else if (nc == columnInDtl_col_011) doInDtl_col_011_NC(info);
		else if (nc == columnInDtl_col_012) doInDtl_col_012_NC(info);
		else if (nc == columnInDtl_col_013) doInDtl_col_013_NC(info);
		else if (nc == columnInDtl_col_014) doInDtl_col_014_NC(info);
		else if (nc == columnInDtl_col_015) doInDtl_col_015_NC(info);
		else if (nc == columnInDtl_col_016) doInDtl_col_016_NC(info);
		else if (nc == columnInDtl_col_017) doInDtl_col_017_NC(info);
		else if (nc == columnInDtl_col_018) doInDtl_col_018_NC(info);
		else if (nc == columnInDtl_col_019) doInDtl_col_019_NC(info);
		else if (nc == columnInDtl_col_020) doInDtl_col_020_NC(info);
		else if (nc == columnInDtl_col_021) doInDtl_col_021_NC(info);
		else if (nc == columnInDtl_col_022) doInDtl_col_022_NC(info);
		else if (nc == columnInDtl_col_023) doInDtl_col_023_NC(info);
		else if (nc == columnInDtl_col_024) doInDtl_col_024_NC(info);
		else if (nc == columnInDtl_col_025) doInDtl_col_025_NC(info);
		else if (nc == columnInDtl_col_026) doInDtl_col_026_NC(info);
		else if (nc == columnInDtl_col_027) doInDtl_col_027_NC(info);
		else if (nc == columnInDtl_col_028) doInDtl_col_028_NC(info);
		else if (nc == columnInDtl_col_029) doInDtl_col_029_NC(info);
		else if (nc == columnInDtl_col_030) doInDtl_col_030_NC(info);
		else if (nc == columnInDtl_col_031) doInDtl_col_031_NC(info);
		else if (nc == columnInDtl_col_032) doInDtl_col_032_NC(info);
		else if (nc == columnInDtl_col_033) doInDtl_col_033_NC(info);
		else if (nc == columnInDtl_col_034) doInDtl_col_034_NC(info);
		else if (nc == columnInDtl_col_035) doInDtl_col_035_NC(info);
		else if (nc == columnInDtl_col_036) doInDtl_col_036_NC(info);
		else if (nc == columnInDtl_col_037) doInDtl_col_037_NC(info);
		else if (nc == columnInDtl_col_038) doInDtl_col_038_NC(info);
		else if (nc == columnInDtl_col_039) doInDtl_col_039_NC(info);
		else if (nc == columnInDtl_col_040) doInDtl_col_040_NC(info);
		else if (nc == columnInDtl_col_041) doInDtl_col_041_NC(info);
		else if (nc == columnInDtl_col_042) doInDtl_col_042_NC(info);
		else if (nc == columnInDtl_col_043) doInDtl_col_043_NC(info);
		else if (nc == columnInDtl_col_044) doInDtl_col_044_NC(info);
		else if (nc == columnInDtl_col_045) doInDtl_col_045_NC(info);
		else if (nc == columnInDtl_col_046) doInDtl_col_046_NC(info);
		else if (nc == columnInDtl_col_047) doInDtl_col_047_NC(info);
		else if (nc == columnInDtl_col_048) doInDtl_col_048_NC(info);
		else if (nc == columnInDtl_col_049) doInDtl_col_049_NC(info);
		else if (nc == columnInDtl_col_050) doInDtl_col_050_NC(info);
		else if (nc == columnInDtl_col_051) doInDtl_col_051_NC(info);
		else if (nc == columnInDtl_col_052) doInDtl_col_052_NC(info);
		else if (nc == columnInDtl_col_053) doInDtl_col_053_NC(info);
		else if (nc == columnInDtl_col_054) doInDtl_col_054_NC(info);
		else if (nc == columnInDtl_col_055) doInDtl_col_055_NC(info);
		else if (nc == columnInDtl_col_056) doInDtl_col_056_NC(info);
		else if (nc == columnInDtl_col_057) doInDtl_col_057_NC(info);
		else if (nc == columnInDtl_col_058) doInDtl_col_058_NC(info);
		else if (nc == columnInDtl_col_059) doInDtl_col_059_NC(info);
		else if (nc == columnInDtl_col_060) doInDtl_col_060_NC(info);
		else if (nc == columnInDtl_col_061) doInDtl_col_061_NC(info);
		else if (nc == columnInDtl_col_062) doInDtl_col_062_NC(info);
		else if (nc == columnInDtl_col_063) doInDtl_col_063_NC(info);
		else if (nc == columnInDtl_col_064) doInDtl_col_064_NC(info);
		else if (nc == columnInDtl_col_065) doInDtl_col_065_NC(info);
		else if (nc == columnInDtl_col_066) doInDtl_col_066_NC(info);
		else if (nc == columnInDtl_col_067) doInDtl_col_067_NC(info);
		else if (nc == columnInDtl_col_068) doInDtl_col_068_NC(info);
		else if (nc == columnInDtl_col_069) doInDtl_col_069_NC(info);
		else if (nc == columnInDtl_col_070) doInDtl_col_070_NC(info);
		else if (nc == columnInDtl_col_071) doInDtl_col_071_NC(info);
		else if (nc == columnInDtl_col_072) doInDtl_col_072_NC(info);
		else if (nc == columnInDtl_col_073) doInDtl_col_073_NC(info);
		else if (nc == columnInDtl_col_074) doInDtl_col_074_NC(info);
		else if (nc == columnInDtl_col_075) doInDtl_col_075_NC(info);
		else if (nc == columnInDtl_col_076) doInDtl_col_076_NC(info);
		else if (nc == columnInDtl_col_077) doInDtl_col_077_NC(info);
		else if (nc == columnInDtl_col_078) doInDtl_col_078_NC(info);
		else if (nc == columnInDtl_col_079) doInDtl_col_079_NC(info);
		else if (nc == columnInDtl_col_080) doInDtl_col_080_NC(info);
		else if (nc == columnInDtl_col_081) doInDtl_col_081_NC(info);
		else if (nc == columnInDtl_col_082) doInDtl_col_082_NC(info);
		else if (nc == columnInDtl_col_083) doInDtl_col_083_NC(info);
		else if (nc == columnInDtl_col_084) doInDtl_col_084_NC(info);
		else if (nc == columnInDtl_col_085) doInDtl_col_085_NC(info);
		else if (nc == columnInDtl_col_086) doInDtl_col_086_NC(info);
		else if (nc == columnInDtl_col_087) doInDtl_col_087_NC(info);
		else if (nc == columnInDtl_col_088) doInDtl_col_088_NC(info);
		else if (nc == columnInDtl_col_089) doInDtl_col_089_NC(info);
		else if (nc == columnInDtl_col_090) doInDtl_col_090_NC(info);
		else if (nc == columnInDtl_col_091) doInDtl_col_091_NC(info);
		else if (nc == columnInDtl_col_092) doInDtl_col_092_NC(info);
		else if (nc == columnInDtl_col_093) doInDtl_col_093_NC(info);
		else if (nc == columnInDtl_col_094) doInDtl_col_094_NC(info);
		else if (nc == columnInDtl_col_095) doInDtl_col_095_NC(info);
		else if (nc == columnInDtl_col_096) doInDtl_col_096_NC(info);
		else if (nc == columnInDtl_col_097) doInDtl_col_097_NC(info);
		else if (nc == columnInDtl_col_098) doInDtl_col_098_NC(info);
		else if (nc == columnInDtl_col_099) doInDtl_col_099_NC(info);
		else if (nc == columnInDtl_ym) doInDtl_ym_NC(info);
		else if (nc == columnInDtl_trd_grp) doInDtl_trd_grp_NC(info);
		else if (nc == columnInDtl_calc_grp_cd) doInDtl_calc_grp_cd_NC(info);
		else if (nc == columnInDtl_calc_no) doInDtl_calc_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_trd_zero_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_trd_zero_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[srched_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_srched_flg_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[per]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_per_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mfg_cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mfg_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ttl_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_000_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_001_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_002_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_003_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_004_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_005_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_006_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_007_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_008_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_009_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_010_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_011_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_012_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_013_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_014_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_015_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_016_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_017_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_018_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_019_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_020_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_021_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_022_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_023_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_024_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_025_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_026_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_027_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_028_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_029_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_030_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_031_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_032_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_033_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_034_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_035_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_036_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_037_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_038_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_039_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_040_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_041_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_042_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_043_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_044_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_045_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_046_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_047_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_048_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_049_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_050_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_051_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_052_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_053_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_054_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_055_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_056_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_057_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_058_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_059_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_060_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_061_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_062_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_063_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_064_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_065_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_066_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_067_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_068_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_069_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_070_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_071_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_072_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_073_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_074_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_075_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_076_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_077_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_078_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_079_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_080_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_081_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_082_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_083_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_084_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_085_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_086_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_087_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_088_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_089_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_090_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_091_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_092_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_093_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_094_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_095_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_096_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_097_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_098_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_099_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[trd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_trd_grp_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[per]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_per_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mfg_cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mfg_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ttl_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_000_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_001_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_002_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_003_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_004_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_005_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_006_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_007_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_008_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_009_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_010_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_011_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_012_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_013_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_014_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_015_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_016_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_017_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_018_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_019_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_020_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_021_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_022_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_023_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_024_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_025_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_026_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_027_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_028_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_029_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_030_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_031_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_032_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_033_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_034_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_035_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_036_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_037_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_038_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_039_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_040_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_041_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_042_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_043_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_044_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_045_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_046_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_047_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_048_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_049_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_050_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_051_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_052_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_053_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_054_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_055_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_056_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_057_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_058_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_059_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_060_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_061_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_062_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_063_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_064_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_065_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_066_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_067_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_068_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_069_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_070_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_071_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_072_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_073_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_074_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_075_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_076_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_077_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_078_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_079_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_080_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_081_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_082_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_083_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_084_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_085_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_086_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_087_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_088_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_089_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_090_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_091_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_092_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_093_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_094_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_095_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_096_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_097_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_098_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_099_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[trd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_trd_grp_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == OutDtlTable) doOutDtl_NE(info);
		else if (ne == InDtlTable) doInDtl_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_trd_grp) doCnd_trd_grp_NE(info);
		else if (ne == Cnd_not_trd_zero_flg) doCnd_not_trd_zero_flg_NE(info);
		else if (ne == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NE(info);
		else if (ne == LPnl_disp_expns) doLPnl_disp_expns_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_trd_grp) doRslt_trd_grp_NE(info);
		else if (ne == columnRslt_ttl) doRslt_ttl_NE(info);
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
		else if (ne == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NE(info);
		else if (ne == columnRslt_calc_no) doRslt_calc_no_NE(info);
		else if (ne == columnRslt_srched_flg) doRslt_srched_flg_NE(info);
		else if (ne == columnOutDtl_wg_cd) doOutDtl_wg_cd_NE(info);
		else if (ne == columnOutDtl_wg_nm) doOutDtl_wg_nm_NE(info);
		else if (ne == columnOutDtl_mng_dpt_cd) doOutDtl_mng_dpt_cd_NE(info);
		else if (ne == columnOutDtl_mng_dpt_nm) doOutDtl_mng_dpt_nm_NE(info);
		else if (ne == columnOutDtl_itm_typ) doOutDtl_itm_typ_NE(info);
		else if (ne == columnOutDtl_itm_typ_nm) doOutDtl_itm_typ_nm_NE(info);
		else if (ne == columnOutDtl_itm_typ_d_cd) doOutDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnOutDtl_itm_typ_d_nm) doOutDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnOutDtl_itm_jnl_cd) doOutDtl_itm_jnl_cd_NE(info);
		else if (ne == columnOutDtl_itm_jnl_nm) doOutDtl_itm_jnl_nm_NE(info);
		else if (ne == columnOutDtl_lot_no) doOutDtl_lot_no_NE(info);
		else if (ne == columnOutDtl_sublot_no) doOutDtl_sublot_no_NE(info);
		else if (ne == columnOutDtl_sno1) doOutDtl_sno1_NE(info);
		else if (ne == columnOutDtl_sno2) doOutDtl_sno2_NE(info);
		else if (ne == columnOutDtl_sno3) doOutDtl_sno3_NE(info);
		else if (ne == columnOutDtl_sno4) doOutDtl_sno4_NE(info);
		else if (ne == columnOutDtl_bp_cd) doOutDtl_bp_cd_NE(info);
		else if (ne == columnOutDtl_bp_nm) doOutDtl_bp_nm_NE(info);
		else if (ne == columnOutDtl_ac_slip_typ) doOutDtl_ac_slip_typ_NE(info);
		else if (ne == columnOutDtl_ac_slip_typ_nm) doOutDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnOutDtl_ac_rsn_cd) doOutDtl_ac_rsn_cd_NE(info);
		else if (ne == columnOutDtl_ac_rsn_nm) doOutDtl_ac_rsn_nm_NE(info);
		else if (ne == columnOutDtl_asst_typ) doOutDtl_asst_typ_NE(info);
		else if (ne == columnOutDtl_asst_typ_nm) doOutDtl_asst_typ_nm_NE(info);
		else if (ne == columnOutDtl_per) doOutDtl_per_NE(info);
		else if (ne == columnOutDtl_mfg_cost_ratio) doOutDtl_mfg_cost_ratio_NE(info);
		else if (ne == columnOutDtl_unit_cd) doOutDtl_unit_cd_NE(info);
		else if (ne == columnOutDtl_unit_nm) doOutDtl_unit_nm_NE(info);
		else if (ne == columnOutDtl_dec_place) doOutDtl_dec_place_NE(info);
		else if (ne == columnOutDtl_upri) doOutDtl_upri_NE(info);
		else if (ne == columnOutDtl_ttl) doOutDtl_ttl_NE(info);
		else if (ne == columnOutDtl_col_000) doOutDtl_col_000_NE(info);
		else if (ne == columnOutDtl_col_001) doOutDtl_col_001_NE(info);
		else if (ne == columnOutDtl_col_002) doOutDtl_col_002_NE(info);
		else if (ne == columnOutDtl_col_003) doOutDtl_col_003_NE(info);
		else if (ne == columnOutDtl_col_004) doOutDtl_col_004_NE(info);
		else if (ne == columnOutDtl_col_005) doOutDtl_col_005_NE(info);
		else if (ne == columnOutDtl_col_006) doOutDtl_col_006_NE(info);
		else if (ne == columnOutDtl_col_007) doOutDtl_col_007_NE(info);
		else if (ne == columnOutDtl_col_008) doOutDtl_col_008_NE(info);
		else if (ne == columnOutDtl_col_009) doOutDtl_col_009_NE(info);
		else if (ne == columnOutDtl_col_010) doOutDtl_col_010_NE(info);
		else if (ne == columnOutDtl_col_011) doOutDtl_col_011_NE(info);
		else if (ne == columnOutDtl_col_012) doOutDtl_col_012_NE(info);
		else if (ne == columnOutDtl_col_013) doOutDtl_col_013_NE(info);
		else if (ne == columnOutDtl_col_014) doOutDtl_col_014_NE(info);
		else if (ne == columnOutDtl_col_015) doOutDtl_col_015_NE(info);
		else if (ne == columnOutDtl_col_016) doOutDtl_col_016_NE(info);
		else if (ne == columnOutDtl_col_017) doOutDtl_col_017_NE(info);
		else if (ne == columnOutDtl_col_018) doOutDtl_col_018_NE(info);
		else if (ne == columnOutDtl_col_019) doOutDtl_col_019_NE(info);
		else if (ne == columnOutDtl_col_020) doOutDtl_col_020_NE(info);
		else if (ne == columnOutDtl_col_021) doOutDtl_col_021_NE(info);
		else if (ne == columnOutDtl_col_022) doOutDtl_col_022_NE(info);
		else if (ne == columnOutDtl_col_023) doOutDtl_col_023_NE(info);
		else if (ne == columnOutDtl_col_024) doOutDtl_col_024_NE(info);
		else if (ne == columnOutDtl_col_025) doOutDtl_col_025_NE(info);
		else if (ne == columnOutDtl_col_026) doOutDtl_col_026_NE(info);
		else if (ne == columnOutDtl_col_027) doOutDtl_col_027_NE(info);
		else if (ne == columnOutDtl_col_028) doOutDtl_col_028_NE(info);
		else if (ne == columnOutDtl_col_029) doOutDtl_col_029_NE(info);
		else if (ne == columnOutDtl_col_030) doOutDtl_col_030_NE(info);
		else if (ne == columnOutDtl_col_031) doOutDtl_col_031_NE(info);
		else if (ne == columnOutDtl_col_032) doOutDtl_col_032_NE(info);
		else if (ne == columnOutDtl_col_033) doOutDtl_col_033_NE(info);
		else if (ne == columnOutDtl_col_034) doOutDtl_col_034_NE(info);
		else if (ne == columnOutDtl_col_035) doOutDtl_col_035_NE(info);
		else if (ne == columnOutDtl_col_036) doOutDtl_col_036_NE(info);
		else if (ne == columnOutDtl_col_037) doOutDtl_col_037_NE(info);
		else if (ne == columnOutDtl_col_038) doOutDtl_col_038_NE(info);
		else if (ne == columnOutDtl_col_039) doOutDtl_col_039_NE(info);
		else if (ne == columnOutDtl_col_040) doOutDtl_col_040_NE(info);
		else if (ne == columnOutDtl_col_041) doOutDtl_col_041_NE(info);
		else if (ne == columnOutDtl_col_042) doOutDtl_col_042_NE(info);
		else if (ne == columnOutDtl_col_043) doOutDtl_col_043_NE(info);
		else if (ne == columnOutDtl_col_044) doOutDtl_col_044_NE(info);
		else if (ne == columnOutDtl_col_045) doOutDtl_col_045_NE(info);
		else if (ne == columnOutDtl_col_046) doOutDtl_col_046_NE(info);
		else if (ne == columnOutDtl_col_047) doOutDtl_col_047_NE(info);
		else if (ne == columnOutDtl_col_048) doOutDtl_col_048_NE(info);
		else if (ne == columnOutDtl_col_049) doOutDtl_col_049_NE(info);
		else if (ne == columnOutDtl_col_050) doOutDtl_col_050_NE(info);
		else if (ne == columnOutDtl_col_051) doOutDtl_col_051_NE(info);
		else if (ne == columnOutDtl_col_052) doOutDtl_col_052_NE(info);
		else if (ne == columnOutDtl_col_053) doOutDtl_col_053_NE(info);
		else if (ne == columnOutDtl_col_054) doOutDtl_col_054_NE(info);
		else if (ne == columnOutDtl_col_055) doOutDtl_col_055_NE(info);
		else if (ne == columnOutDtl_col_056) doOutDtl_col_056_NE(info);
		else if (ne == columnOutDtl_col_057) doOutDtl_col_057_NE(info);
		else if (ne == columnOutDtl_col_058) doOutDtl_col_058_NE(info);
		else if (ne == columnOutDtl_col_059) doOutDtl_col_059_NE(info);
		else if (ne == columnOutDtl_col_060) doOutDtl_col_060_NE(info);
		else if (ne == columnOutDtl_col_061) doOutDtl_col_061_NE(info);
		else if (ne == columnOutDtl_col_062) doOutDtl_col_062_NE(info);
		else if (ne == columnOutDtl_col_063) doOutDtl_col_063_NE(info);
		else if (ne == columnOutDtl_col_064) doOutDtl_col_064_NE(info);
		else if (ne == columnOutDtl_col_065) doOutDtl_col_065_NE(info);
		else if (ne == columnOutDtl_col_066) doOutDtl_col_066_NE(info);
		else if (ne == columnOutDtl_col_067) doOutDtl_col_067_NE(info);
		else if (ne == columnOutDtl_col_068) doOutDtl_col_068_NE(info);
		else if (ne == columnOutDtl_col_069) doOutDtl_col_069_NE(info);
		else if (ne == columnOutDtl_col_070) doOutDtl_col_070_NE(info);
		else if (ne == columnOutDtl_col_071) doOutDtl_col_071_NE(info);
		else if (ne == columnOutDtl_col_072) doOutDtl_col_072_NE(info);
		else if (ne == columnOutDtl_col_073) doOutDtl_col_073_NE(info);
		else if (ne == columnOutDtl_col_074) doOutDtl_col_074_NE(info);
		else if (ne == columnOutDtl_col_075) doOutDtl_col_075_NE(info);
		else if (ne == columnOutDtl_col_076) doOutDtl_col_076_NE(info);
		else if (ne == columnOutDtl_col_077) doOutDtl_col_077_NE(info);
		else if (ne == columnOutDtl_col_078) doOutDtl_col_078_NE(info);
		else if (ne == columnOutDtl_col_079) doOutDtl_col_079_NE(info);
		else if (ne == columnOutDtl_col_080) doOutDtl_col_080_NE(info);
		else if (ne == columnOutDtl_col_081) doOutDtl_col_081_NE(info);
		else if (ne == columnOutDtl_col_082) doOutDtl_col_082_NE(info);
		else if (ne == columnOutDtl_col_083) doOutDtl_col_083_NE(info);
		else if (ne == columnOutDtl_col_084) doOutDtl_col_084_NE(info);
		else if (ne == columnOutDtl_col_085) doOutDtl_col_085_NE(info);
		else if (ne == columnOutDtl_col_086) doOutDtl_col_086_NE(info);
		else if (ne == columnOutDtl_col_087) doOutDtl_col_087_NE(info);
		else if (ne == columnOutDtl_col_088) doOutDtl_col_088_NE(info);
		else if (ne == columnOutDtl_col_089) doOutDtl_col_089_NE(info);
		else if (ne == columnOutDtl_col_090) doOutDtl_col_090_NE(info);
		else if (ne == columnOutDtl_col_091) doOutDtl_col_091_NE(info);
		else if (ne == columnOutDtl_col_092) doOutDtl_col_092_NE(info);
		else if (ne == columnOutDtl_col_093) doOutDtl_col_093_NE(info);
		else if (ne == columnOutDtl_col_094) doOutDtl_col_094_NE(info);
		else if (ne == columnOutDtl_col_095) doOutDtl_col_095_NE(info);
		else if (ne == columnOutDtl_col_096) doOutDtl_col_096_NE(info);
		else if (ne == columnOutDtl_col_097) doOutDtl_col_097_NE(info);
		else if (ne == columnOutDtl_col_098) doOutDtl_col_098_NE(info);
		else if (ne == columnOutDtl_col_099) doOutDtl_col_099_NE(info);
		else if (ne == columnOutDtl_ym) doOutDtl_ym_NE(info);
		else if (ne == columnOutDtl_trd_grp) doOutDtl_trd_grp_NE(info);
		else if (ne == columnOutDtl_calc_grp_cd) doOutDtl_calc_grp_cd_NE(info);
		else if (ne == columnOutDtl_calc_no) doOutDtl_calc_no_NE(info);
		else if (ne == columnInDtl_wg_cd) doInDtl_wg_cd_NE(info);
		else if (ne == columnInDtl_wg_nm) doInDtl_wg_nm_NE(info);
		else if (ne == columnInDtl_mng_dpt_cd) doInDtl_mng_dpt_cd_NE(info);
		else if (ne == columnInDtl_mng_dpt_nm) doInDtl_mng_dpt_nm_NE(info);
		else if (ne == columnInDtl_itm_typ) doInDtl_itm_typ_NE(info);
		else if (ne == columnInDtl_itm_typ_nm) doInDtl_itm_typ_nm_NE(info);
		else if (ne == columnInDtl_itm_typ_d_cd) doInDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnInDtl_itm_typ_d_nm) doInDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnInDtl_itm_jnl_cd) doInDtl_itm_jnl_cd_NE(info);
		else if (ne == columnInDtl_itm_jnl_nm) doInDtl_itm_jnl_nm_NE(info);
		else if (ne == columnInDtl_lot_no) doInDtl_lot_no_NE(info);
		else if (ne == columnInDtl_sublot_no) doInDtl_sublot_no_NE(info);
		else if (ne == columnInDtl_sno1) doInDtl_sno1_NE(info);
		else if (ne == columnInDtl_sno2) doInDtl_sno2_NE(info);
		else if (ne == columnInDtl_sno3) doInDtl_sno3_NE(info);
		else if (ne == columnInDtl_sno4) doInDtl_sno4_NE(info);
		else if (ne == columnInDtl_bp_cd) doInDtl_bp_cd_NE(info);
		else if (ne == columnInDtl_bp_nm) doInDtl_bp_nm_NE(info);
		else if (ne == columnInDtl_ac_slip_typ) doInDtl_ac_slip_typ_NE(info);
		else if (ne == columnInDtl_ac_slip_typ_nm) doInDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnInDtl_ac_rsn_cd) doInDtl_ac_rsn_cd_NE(info);
		else if (ne == columnInDtl_ac_rsn_nm) doInDtl_ac_rsn_nm_NE(info);
		else if (ne == columnInDtl_asst_typ) doInDtl_asst_typ_NE(info);
		else if (ne == columnInDtl_asst_typ_nm) doInDtl_asst_typ_nm_NE(info);
		else if (ne == columnInDtl_per) doInDtl_per_NE(info);
		else if (ne == columnInDtl_mfg_cost_ratio) doInDtl_mfg_cost_ratio_NE(info);
		else if (ne == columnInDtl_unit_cd) doInDtl_unit_cd_NE(info);
		else if (ne == columnInDtl_unit_nm) doInDtl_unit_nm_NE(info);
		else if (ne == columnInDtl_dec_place) doInDtl_dec_place_NE(info);
		else if (ne == columnInDtl_upri) doInDtl_upri_NE(info);
		else if (ne == columnInDtl_ttl) doInDtl_ttl_NE(info);
		else if (ne == columnInDtl_col_000) doInDtl_col_000_NE(info);
		else if (ne == columnInDtl_col_001) doInDtl_col_001_NE(info);
		else if (ne == columnInDtl_col_002) doInDtl_col_002_NE(info);
		else if (ne == columnInDtl_col_003) doInDtl_col_003_NE(info);
		else if (ne == columnInDtl_col_004) doInDtl_col_004_NE(info);
		else if (ne == columnInDtl_col_005) doInDtl_col_005_NE(info);
		else if (ne == columnInDtl_col_006) doInDtl_col_006_NE(info);
		else if (ne == columnInDtl_col_007) doInDtl_col_007_NE(info);
		else if (ne == columnInDtl_col_008) doInDtl_col_008_NE(info);
		else if (ne == columnInDtl_col_009) doInDtl_col_009_NE(info);
		else if (ne == columnInDtl_col_010) doInDtl_col_010_NE(info);
		else if (ne == columnInDtl_col_011) doInDtl_col_011_NE(info);
		else if (ne == columnInDtl_col_012) doInDtl_col_012_NE(info);
		else if (ne == columnInDtl_col_013) doInDtl_col_013_NE(info);
		else if (ne == columnInDtl_col_014) doInDtl_col_014_NE(info);
		else if (ne == columnInDtl_col_015) doInDtl_col_015_NE(info);
		else if (ne == columnInDtl_col_016) doInDtl_col_016_NE(info);
		else if (ne == columnInDtl_col_017) doInDtl_col_017_NE(info);
		else if (ne == columnInDtl_col_018) doInDtl_col_018_NE(info);
		else if (ne == columnInDtl_col_019) doInDtl_col_019_NE(info);
		else if (ne == columnInDtl_col_020) doInDtl_col_020_NE(info);
		else if (ne == columnInDtl_col_021) doInDtl_col_021_NE(info);
		else if (ne == columnInDtl_col_022) doInDtl_col_022_NE(info);
		else if (ne == columnInDtl_col_023) doInDtl_col_023_NE(info);
		else if (ne == columnInDtl_col_024) doInDtl_col_024_NE(info);
		else if (ne == columnInDtl_col_025) doInDtl_col_025_NE(info);
		else if (ne == columnInDtl_col_026) doInDtl_col_026_NE(info);
		else if (ne == columnInDtl_col_027) doInDtl_col_027_NE(info);
		else if (ne == columnInDtl_col_028) doInDtl_col_028_NE(info);
		else if (ne == columnInDtl_col_029) doInDtl_col_029_NE(info);
		else if (ne == columnInDtl_col_030) doInDtl_col_030_NE(info);
		else if (ne == columnInDtl_col_031) doInDtl_col_031_NE(info);
		else if (ne == columnInDtl_col_032) doInDtl_col_032_NE(info);
		else if (ne == columnInDtl_col_033) doInDtl_col_033_NE(info);
		else if (ne == columnInDtl_col_034) doInDtl_col_034_NE(info);
		else if (ne == columnInDtl_col_035) doInDtl_col_035_NE(info);
		else if (ne == columnInDtl_col_036) doInDtl_col_036_NE(info);
		else if (ne == columnInDtl_col_037) doInDtl_col_037_NE(info);
		else if (ne == columnInDtl_col_038) doInDtl_col_038_NE(info);
		else if (ne == columnInDtl_col_039) doInDtl_col_039_NE(info);
		else if (ne == columnInDtl_col_040) doInDtl_col_040_NE(info);
		else if (ne == columnInDtl_col_041) doInDtl_col_041_NE(info);
		else if (ne == columnInDtl_col_042) doInDtl_col_042_NE(info);
		else if (ne == columnInDtl_col_043) doInDtl_col_043_NE(info);
		else if (ne == columnInDtl_col_044) doInDtl_col_044_NE(info);
		else if (ne == columnInDtl_col_045) doInDtl_col_045_NE(info);
		else if (ne == columnInDtl_col_046) doInDtl_col_046_NE(info);
		else if (ne == columnInDtl_col_047) doInDtl_col_047_NE(info);
		else if (ne == columnInDtl_col_048) doInDtl_col_048_NE(info);
		else if (ne == columnInDtl_col_049) doInDtl_col_049_NE(info);
		else if (ne == columnInDtl_col_050) doInDtl_col_050_NE(info);
		else if (ne == columnInDtl_col_051) doInDtl_col_051_NE(info);
		else if (ne == columnInDtl_col_052) doInDtl_col_052_NE(info);
		else if (ne == columnInDtl_col_053) doInDtl_col_053_NE(info);
		else if (ne == columnInDtl_col_054) doInDtl_col_054_NE(info);
		else if (ne == columnInDtl_col_055) doInDtl_col_055_NE(info);
		else if (ne == columnInDtl_col_056) doInDtl_col_056_NE(info);
		else if (ne == columnInDtl_col_057) doInDtl_col_057_NE(info);
		else if (ne == columnInDtl_col_058) doInDtl_col_058_NE(info);
		else if (ne == columnInDtl_col_059) doInDtl_col_059_NE(info);
		else if (ne == columnInDtl_col_060) doInDtl_col_060_NE(info);
		else if (ne == columnInDtl_col_061) doInDtl_col_061_NE(info);
		else if (ne == columnInDtl_col_062) doInDtl_col_062_NE(info);
		else if (ne == columnInDtl_col_063) doInDtl_col_063_NE(info);
		else if (ne == columnInDtl_col_064) doInDtl_col_064_NE(info);
		else if (ne == columnInDtl_col_065) doInDtl_col_065_NE(info);
		else if (ne == columnInDtl_col_066) doInDtl_col_066_NE(info);
		else if (ne == columnInDtl_col_067) doInDtl_col_067_NE(info);
		else if (ne == columnInDtl_col_068) doInDtl_col_068_NE(info);
		else if (ne == columnInDtl_col_069) doInDtl_col_069_NE(info);
		else if (ne == columnInDtl_col_070) doInDtl_col_070_NE(info);
		else if (ne == columnInDtl_col_071) doInDtl_col_071_NE(info);
		else if (ne == columnInDtl_col_072) doInDtl_col_072_NE(info);
		else if (ne == columnInDtl_col_073) doInDtl_col_073_NE(info);
		else if (ne == columnInDtl_col_074) doInDtl_col_074_NE(info);
		else if (ne == columnInDtl_col_075) doInDtl_col_075_NE(info);
		else if (ne == columnInDtl_col_076) doInDtl_col_076_NE(info);
		else if (ne == columnInDtl_col_077) doInDtl_col_077_NE(info);
		else if (ne == columnInDtl_col_078) doInDtl_col_078_NE(info);
		else if (ne == columnInDtl_col_079) doInDtl_col_079_NE(info);
		else if (ne == columnInDtl_col_080) doInDtl_col_080_NE(info);
		else if (ne == columnInDtl_col_081) doInDtl_col_081_NE(info);
		else if (ne == columnInDtl_col_082) doInDtl_col_082_NE(info);
		else if (ne == columnInDtl_col_083) doInDtl_col_083_NE(info);
		else if (ne == columnInDtl_col_084) doInDtl_col_084_NE(info);
		else if (ne == columnInDtl_col_085) doInDtl_col_085_NE(info);
		else if (ne == columnInDtl_col_086) doInDtl_col_086_NE(info);
		else if (ne == columnInDtl_col_087) doInDtl_col_087_NE(info);
		else if (ne == columnInDtl_col_088) doInDtl_col_088_NE(info);
		else if (ne == columnInDtl_col_089) doInDtl_col_089_NE(info);
		else if (ne == columnInDtl_col_090) doInDtl_col_090_NE(info);
		else if (ne == columnInDtl_col_091) doInDtl_col_091_NE(info);
		else if (ne == columnInDtl_col_092) doInDtl_col_092_NE(info);
		else if (ne == columnInDtl_col_093) doInDtl_col_093_NE(info);
		else if (ne == columnInDtl_col_094) doInDtl_col_094_NE(info);
		else if (ne == columnInDtl_col_095) doInDtl_col_095_NE(info);
		else if (ne == columnInDtl_col_096) doInDtl_col_096_NE(info);
		else if (ne == columnInDtl_col_097) doInDtl_col_097_NE(info);
		else if (ne == columnInDtl_col_098) doInDtl_col_098_NE(info);
		else if (ne == columnInDtl_col_099) doInDtl_col_099_NE(info);
		else if (ne == columnInDtl_ym) doInDtl_ym_NE(info);
		else if (ne == columnInDtl_trd_grp) doInDtl_trd_grp_NE(info);
		else if (ne == columnInDtl_calc_grp_cd) doInDtl_calc_grp_cd_NE(info);
		else if (ne == columnInDtl_calc_no) doInDtl_calc_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_trd_zero_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_trd_zero_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[srched_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_srched_flg_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[per]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_per_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mfg_cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mfg_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ttl_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_000_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_001_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_002_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_003_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_004_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_005_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_006_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_007_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_008_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_009_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_010_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_011_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_012_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_013_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_014_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_015_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_016_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_017_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_018_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_019_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_020_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_021_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_022_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_023_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_024_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_025_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_026_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_027_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_028_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_029_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_030_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_031_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_032_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_033_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_034_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_035_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_036_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_037_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_038_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_039_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_040_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_041_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_042_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_043_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_044_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_045_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_046_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_047_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_048_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_049_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_050_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_051_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_052_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_053_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_054_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_055_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_056_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_057_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_058_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_059_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_060_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_061_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_062_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_063_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_064_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_065_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_066_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_067_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_068_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_069_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_070_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_071_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_072_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_073_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_074_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_075_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_076_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_077_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_078_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_079_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_080_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_081_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_082_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_083_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_084_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_085_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_086_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_087_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_088_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_089_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_090_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_091_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_092_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_093_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_094_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_095_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_096_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_097_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_098_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_099_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[trd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_trd_grp_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[per]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_per_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mfg_cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mfg_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ttl_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_000_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_001_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_002_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_003_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_004_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_005_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_006_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_007_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_008_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_009_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_010_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_011_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_012_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_013_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_014_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_015_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_016_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_017_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_018_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_019_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_020_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_021_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_022_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_023_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_024_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_025_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_026_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_027_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_028_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_029_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_030_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_031_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_032_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_033_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_034_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_035_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_036_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_037_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_038_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_039_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_040_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_041_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_042_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_043_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_044_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_045_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_046_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_047_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_048_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_049_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_050_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_051_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_052_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_053_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_054_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_055_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_056_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_057_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_058_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_059_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_060_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_061_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_062_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_063_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_064_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_065_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_066_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_067_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_068_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_069_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_070_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_071_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_072_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_073_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_074_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_075_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_076_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_077_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_078_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_079_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_080_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_081_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_082_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_083_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_084_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_085_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_086_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_087_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_088_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_089_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_090_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_091_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_092_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_093_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_094_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_095_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_096_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_097_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_098_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_099_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[trd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_trd_grp_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == OutDtlTable) doOutDtl_NX(info);
		else if (nx == InDtlTable) doInDtl_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_trd_grp) doCnd_trd_grp_NX(info);
		else if (nx == Cnd_not_trd_zero_flg) doCnd_not_trd_zero_flg_NX(info);
		else if (nx == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NX(info);
		else if (nx == LPnl_disp_expns) doLPnl_disp_expns_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_trd_grp) doRslt_trd_grp_NX(info);
		else if (nx == columnRslt_ttl) doRslt_ttl_NX(info);
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
		else if (nx == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NX(info);
		else if (nx == columnRslt_calc_no) doRslt_calc_no_NX(info);
		else if (nx == columnRslt_srched_flg) doRslt_srched_flg_NX(info);
		else if (nx == columnOutDtl_wg_cd) doOutDtl_wg_cd_NX(info);
		else if (nx == columnOutDtl_wg_nm) doOutDtl_wg_nm_NX(info);
		else if (nx == columnOutDtl_mng_dpt_cd) doOutDtl_mng_dpt_cd_NX(info);
		else if (nx == columnOutDtl_mng_dpt_nm) doOutDtl_mng_dpt_nm_NX(info);
		else if (nx == columnOutDtl_itm_typ) doOutDtl_itm_typ_NX(info);
		else if (nx == columnOutDtl_itm_typ_nm) doOutDtl_itm_typ_nm_NX(info);
		else if (nx == columnOutDtl_itm_typ_d_cd) doOutDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnOutDtl_itm_typ_d_nm) doOutDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnOutDtl_itm_jnl_cd) doOutDtl_itm_jnl_cd_NX(info);
		else if (nx == columnOutDtl_itm_jnl_nm) doOutDtl_itm_jnl_nm_NX(info);
		else if (nx == columnOutDtl_lot_no) doOutDtl_lot_no_NX(info);
		else if (nx == columnOutDtl_sublot_no) doOutDtl_sublot_no_NX(info);
		else if (nx == columnOutDtl_sno1) doOutDtl_sno1_NX(info);
		else if (nx == columnOutDtl_sno2) doOutDtl_sno2_NX(info);
		else if (nx == columnOutDtl_sno3) doOutDtl_sno3_NX(info);
		else if (nx == columnOutDtl_sno4) doOutDtl_sno4_NX(info);
		else if (nx == columnOutDtl_bp_cd) doOutDtl_bp_cd_NX(info);
		else if (nx == columnOutDtl_bp_nm) doOutDtl_bp_nm_NX(info);
		else if (nx == columnOutDtl_ac_slip_typ) doOutDtl_ac_slip_typ_NX(info);
		else if (nx == columnOutDtl_ac_slip_typ_nm) doOutDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnOutDtl_ac_rsn_cd) doOutDtl_ac_rsn_cd_NX(info);
		else if (nx == columnOutDtl_ac_rsn_nm) doOutDtl_ac_rsn_nm_NX(info);
		else if (nx == columnOutDtl_asst_typ) doOutDtl_asst_typ_NX(info);
		else if (nx == columnOutDtl_asst_typ_nm) doOutDtl_asst_typ_nm_NX(info);
		else if (nx == columnOutDtl_per) doOutDtl_per_NX(info);
		else if (nx == columnOutDtl_mfg_cost_ratio) doOutDtl_mfg_cost_ratio_NX(info);
		else if (nx == columnOutDtl_unit_cd) doOutDtl_unit_cd_NX(info);
		else if (nx == columnOutDtl_unit_nm) doOutDtl_unit_nm_NX(info);
		else if (nx == columnOutDtl_dec_place) doOutDtl_dec_place_NX(info);
		else if (nx == columnOutDtl_upri) doOutDtl_upri_NX(info);
		else if (nx == columnOutDtl_ttl) doOutDtl_ttl_NX(info);
		else if (nx == columnOutDtl_col_000) doOutDtl_col_000_NX(info);
		else if (nx == columnOutDtl_col_001) doOutDtl_col_001_NX(info);
		else if (nx == columnOutDtl_col_002) doOutDtl_col_002_NX(info);
		else if (nx == columnOutDtl_col_003) doOutDtl_col_003_NX(info);
		else if (nx == columnOutDtl_col_004) doOutDtl_col_004_NX(info);
		else if (nx == columnOutDtl_col_005) doOutDtl_col_005_NX(info);
		else if (nx == columnOutDtl_col_006) doOutDtl_col_006_NX(info);
		else if (nx == columnOutDtl_col_007) doOutDtl_col_007_NX(info);
		else if (nx == columnOutDtl_col_008) doOutDtl_col_008_NX(info);
		else if (nx == columnOutDtl_col_009) doOutDtl_col_009_NX(info);
		else if (nx == columnOutDtl_col_010) doOutDtl_col_010_NX(info);
		else if (nx == columnOutDtl_col_011) doOutDtl_col_011_NX(info);
		else if (nx == columnOutDtl_col_012) doOutDtl_col_012_NX(info);
		else if (nx == columnOutDtl_col_013) doOutDtl_col_013_NX(info);
		else if (nx == columnOutDtl_col_014) doOutDtl_col_014_NX(info);
		else if (nx == columnOutDtl_col_015) doOutDtl_col_015_NX(info);
		else if (nx == columnOutDtl_col_016) doOutDtl_col_016_NX(info);
		else if (nx == columnOutDtl_col_017) doOutDtl_col_017_NX(info);
		else if (nx == columnOutDtl_col_018) doOutDtl_col_018_NX(info);
		else if (nx == columnOutDtl_col_019) doOutDtl_col_019_NX(info);
		else if (nx == columnOutDtl_col_020) doOutDtl_col_020_NX(info);
		else if (nx == columnOutDtl_col_021) doOutDtl_col_021_NX(info);
		else if (nx == columnOutDtl_col_022) doOutDtl_col_022_NX(info);
		else if (nx == columnOutDtl_col_023) doOutDtl_col_023_NX(info);
		else if (nx == columnOutDtl_col_024) doOutDtl_col_024_NX(info);
		else if (nx == columnOutDtl_col_025) doOutDtl_col_025_NX(info);
		else if (nx == columnOutDtl_col_026) doOutDtl_col_026_NX(info);
		else if (nx == columnOutDtl_col_027) doOutDtl_col_027_NX(info);
		else if (nx == columnOutDtl_col_028) doOutDtl_col_028_NX(info);
		else if (nx == columnOutDtl_col_029) doOutDtl_col_029_NX(info);
		else if (nx == columnOutDtl_col_030) doOutDtl_col_030_NX(info);
		else if (nx == columnOutDtl_col_031) doOutDtl_col_031_NX(info);
		else if (nx == columnOutDtl_col_032) doOutDtl_col_032_NX(info);
		else if (nx == columnOutDtl_col_033) doOutDtl_col_033_NX(info);
		else if (nx == columnOutDtl_col_034) doOutDtl_col_034_NX(info);
		else if (nx == columnOutDtl_col_035) doOutDtl_col_035_NX(info);
		else if (nx == columnOutDtl_col_036) doOutDtl_col_036_NX(info);
		else if (nx == columnOutDtl_col_037) doOutDtl_col_037_NX(info);
		else if (nx == columnOutDtl_col_038) doOutDtl_col_038_NX(info);
		else if (nx == columnOutDtl_col_039) doOutDtl_col_039_NX(info);
		else if (nx == columnOutDtl_col_040) doOutDtl_col_040_NX(info);
		else if (nx == columnOutDtl_col_041) doOutDtl_col_041_NX(info);
		else if (nx == columnOutDtl_col_042) doOutDtl_col_042_NX(info);
		else if (nx == columnOutDtl_col_043) doOutDtl_col_043_NX(info);
		else if (nx == columnOutDtl_col_044) doOutDtl_col_044_NX(info);
		else if (nx == columnOutDtl_col_045) doOutDtl_col_045_NX(info);
		else if (nx == columnOutDtl_col_046) doOutDtl_col_046_NX(info);
		else if (nx == columnOutDtl_col_047) doOutDtl_col_047_NX(info);
		else if (nx == columnOutDtl_col_048) doOutDtl_col_048_NX(info);
		else if (nx == columnOutDtl_col_049) doOutDtl_col_049_NX(info);
		else if (nx == columnOutDtl_col_050) doOutDtl_col_050_NX(info);
		else if (nx == columnOutDtl_col_051) doOutDtl_col_051_NX(info);
		else if (nx == columnOutDtl_col_052) doOutDtl_col_052_NX(info);
		else if (nx == columnOutDtl_col_053) doOutDtl_col_053_NX(info);
		else if (nx == columnOutDtl_col_054) doOutDtl_col_054_NX(info);
		else if (nx == columnOutDtl_col_055) doOutDtl_col_055_NX(info);
		else if (nx == columnOutDtl_col_056) doOutDtl_col_056_NX(info);
		else if (nx == columnOutDtl_col_057) doOutDtl_col_057_NX(info);
		else if (nx == columnOutDtl_col_058) doOutDtl_col_058_NX(info);
		else if (nx == columnOutDtl_col_059) doOutDtl_col_059_NX(info);
		else if (nx == columnOutDtl_col_060) doOutDtl_col_060_NX(info);
		else if (nx == columnOutDtl_col_061) doOutDtl_col_061_NX(info);
		else if (nx == columnOutDtl_col_062) doOutDtl_col_062_NX(info);
		else if (nx == columnOutDtl_col_063) doOutDtl_col_063_NX(info);
		else if (nx == columnOutDtl_col_064) doOutDtl_col_064_NX(info);
		else if (nx == columnOutDtl_col_065) doOutDtl_col_065_NX(info);
		else if (nx == columnOutDtl_col_066) doOutDtl_col_066_NX(info);
		else if (nx == columnOutDtl_col_067) doOutDtl_col_067_NX(info);
		else if (nx == columnOutDtl_col_068) doOutDtl_col_068_NX(info);
		else if (nx == columnOutDtl_col_069) doOutDtl_col_069_NX(info);
		else if (nx == columnOutDtl_col_070) doOutDtl_col_070_NX(info);
		else if (nx == columnOutDtl_col_071) doOutDtl_col_071_NX(info);
		else if (nx == columnOutDtl_col_072) doOutDtl_col_072_NX(info);
		else if (nx == columnOutDtl_col_073) doOutDtl_col_073_NX(info);
		else if (nx == columnOutDtl_col_074) doOutDtl_col_074_NX(info);
		else if (nx == columnOutDtl_col_075) doOutDtl_col_075_NX(info);
		else if (nx == columnOutDtl_col_076) doOutDtl_col_076_NX(info);
		else if (nx == columnOutDtl_col_077) doOutDtl_col_077_NX(info);
		else if (nx == columnOutDtl_col_078) doOutDtl_col_078_NX(info);
		else if (nx == columnOutDtl_col_079) doOutDtl_col_079_NX(info);
		else if (nx == columnOutDtl_col_080) doOutDtl_col_080_NX(info);
		else if (nx == columnOutDtl_col_081) doOutDtl_col_081_NX(info);
		else if (nx == columnOutDtl_col_082) doOutDtl_col_082_NX(info);
		else if (nx == columnOutDtl_col_083) doOutDtl_col_083_NX(info);
		else if (nx == columnOutDtl_col_084) doOutDtl_col_084_NX(info);
		else if (nx == columnOutDtl_col_085) doOutDtl_col_085_NX(info);
		else if (nx == columnOutDtl_col_086) doOutDtl_col_086_NX(info);
		else if (nx == columnOutDtl_col_087) doOutDtl_col_087_NX(info);
		else if (nx == columnOutDtl_col_088) doOutDtl_col_088_NX(info);
		else if (nx == columnOutDtl_col_089) doOutDtl_col_089_NX(info);
		else if (nx == columnOutDtl_col_090) doOutDtl_col_090_NX(info);
		else if (nx == columnOutDtl_col_091) doOutDtl_col_091_NX(info);
		else if (nx == columnOutDtl_col_092) doOutDtl_col_092_NX(info);
		else if (nx == columnOutDtl_col_093) doOutDtl_col_093_NX(info);
		else if (nx == columnOutDtl_col_094) doOutDtl_col_094_NX(info);
		else if (nx == columnOutDtl_col_095) doOutDtl_col_095_NX(info);
		else if (nx == columnOutDtl_col_096) doOutDtl_col_096_NX(info);
		else if (nx == columnOutDtl_col_097) doOutDtl_col_097_NX(info);
		else if (nx == columnOutDtl_col_098) doOutDtl_col_098_NX(info);
		else if (nx == columnOutDtl_col_099) doOutDtl_col_099_NX(info);
		else if (nx == columnOutDtl_ym) doOutDtl_ym_NX(info);
		else if (nx == columnOutDtl_trd_grp) doOutDtl_trd_grp_NX(info);
		else if (nx == columnOutDtl_calc_grp_cd) doOutDtl_calc_grp_cd_NX(info);
		else if (nx == columnOutDtl_calc_no) doOutDtl_calc_no_NX(info);
		else if (nx == columnInDtl_wg_cd) doInDtl_wg_cd_NX(info);
		else if (nx == columnInDtl_wg_nm) doInDtl_wg_nm_NX(info);
		else if (nx == columnInDtl_mng_dpt_cd) doInDtl_mng_dpt_cd_NX(info);
		else if (nx == columnInDtl_mng_dpt_nm) doInDtl_mng_dpt_nm_NX(info);
		else if (nx == columnInDtl_itm_typ) doInDtl_itm_typ_NX(info);
		else if (nx == columnInDtl_itm_typ_nm) doInDtl_itm_typ_nm_NX(info);
		else if (nx == columnInDtl_itm_typ_d_cd) doInDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnInDtl_itm_typ_d_nm) doInDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnInDtl_itm_jnl_cd) doInDtl_itm_jnl_cd_NX(info);
		else if (nx == columnInDtl_itm_jnl_nm) doInDtl_itm_jnl_nm_NX(info);
		else if (nx == columnInDtl_lot_no) doInDtl_lot_no_NX(info);
		else if (nx == columnInDtl_sublot_no) doInDtl_sublot_no_NX(info);
		else if (nx == columnInDtl_sno1) doInDtl_sno1_NX(info);
		else if (nx == columnInDtl_sno2) doInDtl_sno2_NX(info);
		else if (nx == columnInDtl_sno3) doInDtl_sno3_NX(info);
		else if (nx == columnInDtl_sno4) doInDtl_sno4_NX(info);
		else if (nx == columnInDtl_bp_cd) doInDtl_bp_cd_NX(info);
		else if (nx == columnInDtl_bp_nm) doInDtl_bp_nm_NX(info);
		else if (nx == columnInDtl_ac_slip_typ) doInDtl_ac_slip_typ_NX(info);
		else if (nx == columnInDtl_ac_slip_typ_nm) doInDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnInDtl_ac_rsn_cd) doInDtl_ac_rsn_cd_NX(info);
		else if (nx == columnInDtl_ac_rsn_nm) doInDtl_ac_rsn_nm_NX(info);
		else if (nx == columnInDtl_asst_typ) doInDtl_asst_typ_NX(info);
		else if (nx == columnInDtl_asst_typ_nm) doInDtl_asst_typ_nm_NX(info);
		else if (nx == columnInDtl_per) doInDtl_per_NX(info);
		else if (nx == columnInDtl_mfg_cost_ratio) doInDtl_mfg_cost_ratio_NX(info);
		else if (nx == columnInDtl_unit_cd) doInDtl_unit_cd_NX(info);
		else if (nx == columnInDtl_unit_nm) doInDtl_unit_nm_NX(info);
		else if (nx == columnInDtl_dec_place) doInDtl_dec_place_NX(info);
		else if (nx == columnInDtl_upri) doInDtl_upri_NX(info);
		else if (nx == columnInDtl_ttl) doInDtl_ttl_NX(info);
		else if (nx == columnInDtl_col_000) doInDtl_col_000_NX(info);
		else if (nx == columnInDtl_col_001) doInDtl_col_001_NX(info);
		else if (nx == columnInDtl_col_002) doInDtl_col_002_NX(info);
		else if (nx == columnInDtl_col_003) doInDtl_col_003_NX(info);
		else if (nx == columnInDtl_col_004) doInDtl_col_004_NX(info);
		else if (nx == columnInDtl_col_005) doInDtl_col_005_NX(info);
		else if (nx == columnInDtl_col_006) doInDtl_col_006_NX(info);
		else if (nx == columnInDtl_col_007) doInDtl_col_007_NX(info);
		else if (nx == columnInDtl_col_008) doInDtl_col_008_NX(info);
		else if (nx == columnInDtl_col_009) doInDtl_col_009_NX(info);
		else if (nx == columnInDtl_col_010) doInDtl_col_010_NX(info);
		else if (nx == columnInDtl_col_011) doInDtl_col_011_NX(info);
		else if (nx == columnInDtl_col_012) doInDtl_col_012_NX(info);
		else if (nx == columnInDtl_col_013) doInDtl_col_013_NX(info);
		else if (nx == columnInDtl_col_014) doInDtl_col_014_NX(info);
		else if (nx == columnInDtl_col_015) doInDtl_col_015_NX(info);
		else if (nx == columnInDtl_col_016) doInDtl_col_016_NX(info);
		else if (nx == columnInDtl_col_017) doInDtl_col_017_NX(info);
		else if (nx == columnInDtl_col_018) doInDtl_col_018_NX(info);
		else if (nx == columnInDtl_col_019) doInDtl_col_019_NX(info);
		else if (nx == columnInDtl_col_020) doInDtl_col_020_NX(info);
		else if (nx == columnInDtl_col_021) doInDtl_col_021_NX(info);
		else if (nx == columnInDtl_col_022) doInDtl_col_022_NX(info);
		else if (nx == columnInDtl_col_023) doInDtl_col_023_NX(info);
		else if (nx == columnInDtl_col_024) doInDtl_col_024_NX(info);
		else if (nx == columnInDtl_col_025) doInDtl_col_025_NX(info);
		else if (nx == columnInDtl_col_026) doInDtl_col_026_NX(info);
		else if (nx == columnInDtl_col_027) doInDtl_col_027_NX(info);
		else if (nx == columnInDtl_col_028) doInDtl_col_028_NX(info);
		else if (nx == columnInDtl_col_029) doInDtl_col_029_NX(info);
		else if (nx == columnInDtl_col_030) doInDtl_col_030_NX(info);
		else if (nx == columnInDtl_col_031) doInDtl_col_031_NX(info);
		else if (nx == columnInDtl_col_032) doInDtl_col_032_NX(info);
		else if (nx == columnInDtl_col_033) doInDtl_col_033_NX(info);
		else if (nx == columnInDtl_col_034) doInDtl_col_034_NX(info);
		else if (nx == columnInDtl_col_035) doInDtl_col_035_NX(info);
		else if (nx == columnInDtl_col_036) doInDtl_col_036_NX(info);
		else if (nx == columnInDtl_col_037) doInDtl_col_037_NX(info);
		else if (nx == columnInDtl_col_038) doInDtl_col_038_NX(info);
		else if (nx == columnInDtl_col_039) doInDtl_col_039_NX(info);
		else if (nx == columnInDtl_col_040) doInDtl_col_040_NX(info);
		else if (nx == columnInDtl_col_041) doInDtl_col_041_NX(info);
		else if (nx == columnInDtl_col_042) doInDtl_col_042_NX(info);
		else if (nx == columnInDtl_col_043) doInDtl_col_043_NX(info);
		else if (nx == columnInDtl_col_044) doInDtl_col_044_NX(info);
		else if (nx == columnInDtl_col_045) doInDtl_col_045_NX(info);
		else if (nx == columnInDtl_col_046) doInDtl_col_046_NX(info);
		else if (nx == columnInDtl_col_047) doInDtl_col_047_NX(info);
		else if (nx == columnInDtl_col_048) doInDtl_col_048_NX(info);
		else if (nx == columnInDtl_col_049) doInDtl_col_049_NX(info);
		else if (nx == columnInDtl_col_050) doInDtl_col_050_NX(info);
		else if (nx == columnInDtl_col_051) doInDtl_col_051_NX(info);
		else if (nx == columnInDtl_col_052) doInDtl_col_052_NX(info);
		else if (nx == columnInDtl_col_053) doInDtl_col_053_NX(info);
		else if (nx == columnInDtl_col_054) doInDtl_col_054_NX(info);
		else if (nx == columnInDtl_col_055) doInDtl_col_055_NX(info);
		else if (nx == columnInDtl_col_056) doInDtl_col_056_NX(info);
		else if (nx == columnInDtl_col_057) doInDtl_col_057_NX(info);
		else if (nx == columnInDtl_col_058) doInDtl_col_058_NX(info);
		else if (nx == columnInDtl_col_059) doInDtl_col_059_NX(info);
		else if (nx == columnInDtl_col_060) doInDtl_col_060_NX(info);
		else if (nx == columnInDtl_col_061) doInDtl_col_061_NX(info);
		else if (nx == columnInDtl_col_062) doInDtl_col_062_NX(info);
		else if (nx == columnInDtl_col_063) doInDtl_col_063_NX(info);
		else if (nx == columnInDtl_col_064) doInDtl_col_064_NX(info);
		else if (nx == columnInDtl_col_065) doInDtl_col_065_NX(info);
		else if (nx == columnInDtl_col_066) doInDtl_col_066_NX(info);
		else if (nx == columnInDtl_col_067) doInDtl_col_067_NX(info);
		else if (nx == columnInDtl_col_068) doInDtl_col_068_NX(info);
		else if (nx == columnInDtl_col_069) doInDtl_col_069_NX(info);
		else if (nx == columnInDtl_col_070) doInDtl_col_070_NX(info);
		else if (nx == columnInDtl_col_071) doInDtl_col_071_NX(info);
		else if (nx == columnInDtl_col_072) doInDtl_col_072_NX(info);
		else if (nx == columnInDtl_col_073) doInDtl_col_073_NX(info);
		else if (nx == columnInDtl_col_074) doInDtl_col_074_NX(info);
		else if (nx == columnInDtl_col_075) doInDtl_col_075_NX(info);
		else if (nx == columnInDtl_col_076) doInDtl_col_076_NX(info);
		else if (nx == columnInDtl_col_077) doInDtl_col_077_NX(info);
		else if (nx == columnInDtl_col_078) doInDtl_col_078_NX(info);
		else if (nx == columnInDtl_col_079) doInDtl_col_079_NX(info);
		else if (nx == columnInDtl_col_080) doInDtl_col_080_NX(info);
		else if (nx == columnInDtl_col_081) doInDtl_col_081_NX(info);
		else if (nx == columnInDtl_col_082) doInDtl_col_082_NX(info);
		else if (nx == columnInDtl_col_083) doInDtl_col_083_NX(info);
		else if (nx == columnInDtl_col_084) doInDtl_col_084_NX(info);
		else if (nx == columnInDtl_col_085) doInDtl_col_085_NX(info);
		else if (nx == columnInDtl_col_086) doInDtl_col_086_NX(info);
		else if (nx == columnInDtl_col_087) doInDtl_col_087_NX(info);
		else if (nx == columnInDtl_col_088) doInDtl_col_088_NX(info);
		else if (nx == columnInDtl_col_089) doInDtl_col_089_NX(info);
		else if (nx == columnInDtl_col_090) doInDtl_col_090_NX(info);
		else if (nx == columnInDtl_col_091) doInDtl_col_091_NX(info);
		else if (nx == columnInDtl_col_092) doInDtl_col_092_NX(info);
		else if (nx == columnInDtl_col_093) doInDtl_col_093_NX(info);
		else if (nx == columnInDtl_col_094) doInDtl_col_094_NX(info);
		else if (nx == columnInDtl_col_095) doInDtl_col_095_NX(info);
		else if (nx == columnInDtl_col_096) doInDtl_col_096_NX(info);
		else if (nx == columnInDtl_col_097) doInDtl_col_097_NX(info);
		else if (nx == columnInDtl_col_098) doInDtl_col_098_NX(info);
		else if (nx == columnInDtl_col_099) doInDtl_col_099_NX(info);
		else if (nx == columnInDtl_ym) doInDtl_ym_NX(info);
		else if (nx == columnInDtl_trd_grp) doInDtl_trd_grp_NX(info);
		else if (nx == columnInDtl_calc_grp_cd) doInDtl_calc_grp_cd_NX(info);
		else if (nx == columnInDtl_calc_no) doInDtl_calc_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_trd_zero_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_trd_zero_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[srched_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_srched_flg_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[per]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_per_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mfg_cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mfg_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ttl_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_000_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_001_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_002_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_003_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_004_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_005_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_006_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_007_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_008_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_009_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_010_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_011_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_012_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_013_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_014_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_015_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_016_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_017_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_018_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_019_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_020_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_021_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_022_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_023_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_024_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_025_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_026_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_027_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_028_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_029_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_030_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_031_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_032_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_033_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_034_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_035_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_036_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_037_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_038_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_039_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_040_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_041_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_042_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_043_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_044_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_045_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_046_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_047_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_048_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_049_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_050_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_051_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_052_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_053_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_054_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_055_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_056_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_057_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_058_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_059_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_060_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_061_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_062_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_063_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_064_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_065_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_066_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_067_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_068_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_069_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_070_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_071_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_072_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_073_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_074_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_075_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_076_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_077_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_078_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_079_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_080_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_081_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_082_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_083_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_084_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_085_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_086_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_087_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_088_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_089_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_090_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_091_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_092_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_093_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_094_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_095_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_096_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_097_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_098_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_099_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[trd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_trd_grp_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[per]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_per_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mfg_cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mfg_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ttl_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_000_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_001_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_002_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_003_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_004_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_005_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_006_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_007_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_008_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_009_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_010_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_011_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_012_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_013_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_014_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_015_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_016_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_017_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_018_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_019_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_020_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_021_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_022_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_023_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_024_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_025_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_026_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_027_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_028_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_029_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_030_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_031_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_032_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_033_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_034_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_035_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_036_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_037_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_038_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_039_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_040_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_041_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_042_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_043_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_044_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_045_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_046_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_047_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_048_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_049_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_050_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_051_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_052_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_053_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_054_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_055_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_056_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_057_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_058_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_059_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_060_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_061_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_062_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_063_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_064_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_065_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_066_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_067_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_068_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_069_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_070_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_071_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_072_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_073_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_074_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_075_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_076_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_077_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_078_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_079_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_080_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_081_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_082_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_083_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_084_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_085_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_086_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_087_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_088_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_089_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_090_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_091_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_092_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_093_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_094_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_095_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_096_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_097_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_098_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_099_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[trd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_trd_grp_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_trd_grp) doCnd_trd_grp_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_trd_grp) doRslt_trd_grp_LC(info);
		else if (lc == columnRslt_ttl) doRslt_ttl_LC(info);
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
		else if (lc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_LC(info);
		else if (lc == columnRslt_calc_no) doRslt_calc_no_LC(info);
		else if (lc == columnOutDtl_wg_cd) doOutDtl_wg_cd_LC(info);
		else if (lc == columnOutDtl_wg_nm) doOutDtl_wg_nm_LC(info);
		else if (lc == columnOutDtl_mng_dpt_cd) doOutDtl_mng_dpt_cd_LC(info);
		else if (lc == columnOutDtl_mng_dpt_nm) doOutDtl_mng_dpt_nm_LC(info);
		else if (lc == columnOutDtl_itm_typ) doOutDtl_itm_typ_LC(info);
		else if (lc == columnOutDtl_itm_typ_nm) doOutDtl_itm_typ_nm_LC(info);
		else if (lc == columnOutDtl_itm_typ_d_cd) doOutDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnOutDtl_itm_typ_d_nm) doOutDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnOutDtl_itm_jnl_cd) doOutDtl_itm_jnl_cd_LC(info);
		else if (lc == columnOutDtl_itm_jnl_nm) doOutDtl_itm_jnl_nm_LC(info);
		else if (lc == columnOutDtl_lot_no) doOutDtl_lot_no_LC(info);
		else if (lc == columnOutDtl_sublot_no) doOutDtl_sublot_no_LC(info);
		else if (lc == columnOutDtl_sno1) doOutDtl_sno1_LC(info);
		else if (lc == columnOutDtl_sno2) doOutDtl_sno2_LC(info);
		else if (lc == columnOutDtl_sno3) doOutDtl_sno3_LC(info);
		else if (lc == columnOutDtl_sno4) doOutDtl_sno4_LC(info);
		else if (lc == columnOutDtl_bp_cd) doOutDtl_bp_cd_LC(info);
		else if (lc == columnOutDtl_bp_nm) doOutDtl_bp_nm_LC(info);
		else if (lc == columnOutDtl_ac_slip_typ) doOutDtl_ac_slip_typ_LC(info);
		else if (lc == columnOutDtl_ac_slip_typ_nm) doOutDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnOutDtl_ac_rsn_cd) doOutDtl_ac_rsn_cd_LC(info);
		else if (lc == columnOutDtl_ac_rsn_nm) doOutDtl_ac_rsn_nm_LC(info);
		else if (lc == columnOutDtl_asst_typ) doOutDtl_asst_typ_LC(info);
		else if (lc == columnOutDtl_asst_typ_nm) doOutDtl_asst_typ_nm_LC(info);
		else if (lc == columnOutDtl_per) doOutDtl_per_LC(info);
		else if (lc == columnOutDtl_mfg_cost_ratio) doOutDtl_mfg_cost_ratio_LC(info);
		else if (lc == columnOutDtl_unit_cd) doOutDtl_unit_cd_LC(info);
		else if (lc == columnOutDtl_unit_nm) doOutDtl_unit_nm_LC(info);
		else if (lc == columnOutDtl_dec_place) doOutDtl_dec_place_LC(info);
		else if (lc == columnOutDtl_upri) doOutDtl_upri_LC(info);
		else if (lc == columnOutDtl_ttl) doOutDtl_ttl_LC(info);
		else if (lc == columnOutDtl_col_000) doOutDtl_col_000_LC(info);
		else if (lc == columnOutDtl_col_001) doOutDtl_col_001_LC(info);
		else if (lc == columnOutDtl_col_002) doOutDtl_col_002_LC(info);
		else if (lc == columnOutDtl_col_003) doOutDtl_col_003_LC(info);
		else if (lc == columnOutDtl_col_004) doOutDtl_col_004_LC(info);
		else if (lc == columnOutDtl_col_005) doOutDtl_col_005_LC(info);
		else if (lc == columnOutDtl_col_006) doOutDtl_col_006_LC(info);
		else if (lc == columnOutDtl_col_007) doOutDtl_col_007_LC(info);
		else if (lc == columnOutDtl_col_008) doOutDtl_col_008_LC(info);
		else if (lc == columnOutDtl_col_009) doOutDtl_col_009_LC(info);
		else if (lc == columnOutDtl_col_010) doOutDtl_col_010_LC(info);
		else if (lc == columnOutDtl_col_011) doOutDtl_col_011_LC(info);
		else if (lc == columnOutDtl_col_012) doOutDtl_col_012_LC(info);
		else if (lc == columnOutDtl_col_013) doOutDtl_col_013_LC(info);
		else if (lc == columnOutDtl_col_014) doOutDtl_col_014_LC(info);
		else if (lc == columnOutDtl_col_015) doOutDtl_col_015_LC(info);
		else if (lc == columnOutDtl_col_016) doOutDtl_col_016_LC(info);
		else if (lc == columnOutDtl_col_017) doOutDtl_col_017_LC(info);
		else if (lc == columnOutDtl_col_018) doOutDtl_col_018_LC(info);
		else if (lc == columnOutDtl_col_019) doOutDtl_col_019_LC(info);
		else if (lc == columnOutDtl_col_020) doOutDtl_col_020_LC(info);
		else if (lc == columnOutDtl_col_021) doOutDtl_col_021_LC(info);
		else if (lc == columnOutDtl_col_022) doOutDtl_col_022_LC(info);
		else if (lc == columnOutDtl_col_023) doOutDtl_col_023_LC(info);
		else if (lc == columnOutDtl_col_024) doOutDtl_col_024_LC(info);
		else if (lc == columnOutDtl_col_025) doOutDtl_col_025_LC(info);
		else if (lc == columnOutDtl_col_026) doOutDtl_col_026_LC(info);
		else if (lc == columnOutDtl_col_027) doOutDtl_col_027_LC(info);
		else if (lc == columnOutDtl_col_028) doOutDtl_col_028_LC(info);
		else if (lc == columnOutDtl_col_029) doOutDtl_col_029_LC(info);
		else if (lc == columnOutDtl_col_030) doOutDtl_col_030_LC(info);
		else if (lc == columnOutDtl_col_031) doOutDtl_col_031_LC(info);
		else if (lc == columnOutDtl_col_032) doOutDtl_col_032_LC(info);
		else if (lc == columnOutDtl_col_033) doOutDtl_col_033_LC(info);
		else if (lc == columnOutDtl_col_034) doOutDtl_col_034_LC(info);
		else if (lc == columnOutDtl_col_035) doOutDtl_col_035_LC(info);
		else if (lc == columnOutDtl_col_036) doOutDtl_col_036_LC(info);
		else if (lc == columnOutDtl_col_037) doOutDtl_col_037_LC(info);
		else if (lc == columnOutDtl_col_038) doOutDtl_col_038_LC(info);
		else if (lc == columnOutDtl_col_039) doOutDtl_col_039_LC(info);
		else if (lc == columnOutDtl_col_040) doOutDtl_col_040_LC(info);
		else if (lc == columnOutDtl_col_041) doOutDtl_col_041_LC(info);
		else if (lc == columnOutDtl_col_042) doOutDtl_col_042_LC(info);
		else if (lc == columnOutDtl_col_043) doOutDtl_col_043_LC(info);
		else if (lc == columnOutDtl_col_044) doOutDtl_col_044_LC(info);
		else if (lc == columnOutDtl_col_045) doOutDtl_col_045_LC(info);
		else if (lc == columnOutDtl_col_046) doOutDtl_col_046_LC(info);
		else if (lc == columnOutDtl_col_047) doOutDtl_col_047_LC(info);
		else if (lc == columnOutDtl_col_048) doOutDtl_col_048_LC(info);
		else if (lc == columnOutDtl_col_049) doOutDtl_col_049_LC(info);
		else if (lc == columnOutDtl_col_050) doOutDtl_col_050_LC(info);
		else if (lc == columnOutDtl_col_051) doOutDtl_col_051_LC(info);
		else if (lc == columnOutDtl_col_052) doOutDtl_col_052_LC(info);
		else if (lc == columnOutDtl_col_053) doOutDtl_col_053_LC(info);
		else if (lc == columnOutDtl_col_054) doOutDtl_col_054_LC(info);
		else if (lc == columnOutDtl_col_055) doOutDtl_col_055_LC(info);
		else if (lc == columnOutDtl_col_056) doOutDtl_col_056_LC(info);
		else if (lc == columnOutDtl_col_057) doOutDtl_col_057_LC(info);
		else if (lc == columnOutDtl_col_058) doOutDtl_col_058_LC(info);
		else if (lc == columnOutDtl_col_059) doOutDtl_col_059_LC(info);
		else if (lc == columnOutDtl_col_060) doOutDtl_col_060_LC(info);
		else if (lc == columnOutDtl_col_061) doOutDtl_col_061_LC(info);
		else if (lc == columnOutDtl_col_062) doOutDtl_col_062_LC(info);
		else if (lc == columnOutDtl_col_063) doOutDtl_col_063_LC(info);
		else if (lc == columnOutDtl_col_064) doOutDtl_col_064_LC(info);
		else if (lc == columnOutDtl_col_065) doOutDtl_col_065_LC(info);
		else if (lc == columnOutDtl_col_066) doOutDtl_col_066_LC(info);
		else if (lc == columnOutDtl_col_067) doOutDtl_col_067_LC(info);
		else if (lc == columnOutDtl_col_068) doOutDtl_col_068_LC(info);
		else if (lc == columnOutDtl_col_069) doOutDtl_col_069_LC(info);
		else if (lc == columnOutDtl_col_070) doOutDtl_col_070_LC(info);
		else if (lc == columnOutDtl_col_071) doOutDtl_col_071_LC(info);
		else if (lc == columnOutDtl_col_072) doOutDtl_col_072_LC(info);
		else if (lc == columnOutDtl_col_073) doOutDtl_col_073_LC(info);
		else if (lc == columnOutDtl_col_074) doOutDtl_col_074_LC(info);
		else if (lc == columnOutDtl_col_075) doOutDtl_col_075_LC(info);
		else if (lc == columnOutDtl_col_076) doOutDtl_col_076_LC(info);
		else if (lc == columnOutDtl_col_077) doOutDtl_col_077_LC(info);
		else if (lc == columnOutDtl_col_078) doOutDtl_col_078_LC(info);
		else if (lc == columnOutDtl_col_079) doOutDtl_col_079_LC(info);
		else if (lc == columnOutDtl_col_080) doOutDtl_col_080_LC(info);
		else if (lc == columnOutDtl_col_081) doOutDtl_col_081_LC(info);
		else if (lc == columnOutDtl_col_082) doOutDtl_col_082_LC(info);
		else if (lc == columnOutDtl_col_083) doOutDtl_col_083_LC(info);
		else if (lc == columnOutDtl_col_084) doOutDtl_col_084_LC(info);
		else if (lc == columnOutDtl_col_085) doOutDtl_col_085_LC(info);
		else if (lc == columnOutDtl_col_086) doOutDtl_col_086_LC(info);
		else if (lc == columnOutDtl_col_087) doOutDtl_col_087_LC(info);
		else if (lc == columnOutDtl_col_088) doOutDtl_col_088_LC(info);
		else if (lc == columnOutDtl_col_089) doOutDtl_col_089_LC(info);
		else if (lc == columnOutDtl_col_090) doOutDtl_col_090_LC(info);
		else if (lc == columnOutDtl_col_091) doOutDtl_col_091_LC(info);
		else if (lc == columnOutDtl_col_092) doOutDtl_col_092_LC(info);
		else if (lc == columnOutDtl_col_093) doOutDtl_col_093_LC(info);
		else if (lc == columnOutDtl_col_094) doOutDtl_col_094_LC(info);
		else if (lc == columnOutDtl_col_095) doOutDtl_col_095_LC(info);
		else if (lc == columnOutDtl_col_096) doOutDtl_col_096_LC(info);
		else if (lc == columnOutDtl_col_097) doOutDtl_col_097_LC(info);
		else if (lc == columnOutDtl_col_098) doOutDtl_col_098_LC(info);
		else if (lc == columnOutDtl_col_099) doOutDtl_col_099_LC(info);
		else if (lc == columnOutDtl_ym) doOutDtl_ym_LC(info);
		else if (lc == columnOutDtl_trd_grp) doOutDtl_trd_grp_LC(info);
		else if (lc == columnOutDtl_calc_grp_cd) doOutDtl_calc_grp_cd_LC(info);
		else if (lc == columnOutDtl_calc_no) doOutDtl_calc_no_LC(info);
		else if (lc == columnInDtl_wg_cd) doInDtl_wg_cd_LC(info);
		else if (lc == columnInDtl_wg_nm) doInDtl_wg_nm_LC(info);
		else if (lc == columnInDtl_mng_dpt_cd) doInDtl_mng_dpt_cd_LC(info);
		else if (lc == columnInDtl_mng_dpt_nm) doInDtl_mng_dpt_nm_LC(info);
		else if (lc == columnInDtl_itm_typ) doInDtl_itm_typ_LC(info);
		else if (lc == columnInDtl_itm_typ_nm) doInDtl_itm_typ_nm_LC(info);
		else if (lc == columnInDtl_itm_typ_d_cd) doInDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnInDtl_itm_typ_d_nm) doInDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnInDtl_itm_jnl_cd) doInDtl_itm_jnl_cd_LC(info);
		else if (lc == columnInDtl_itm_jnl_nm) doInDtl_itm_jnl_nm_LC(info);
		else if (lc == columnInDtl_lot_no) doInDtl_lot_no_LC(info);
		else if (lc == columnInDtl_sublot_no) doInDtl_sublot_no_LC(info);
		else if (lc == columnInDtl_sno1) doInDtl_sno1_LC(info);
		else if (lc == columnInDtl_sno2) doInDtl_sno2_LC(info);
		else if (lc == columnInDtl_sno3) doInDtl_sno3_LC(info);
		else if (lc == columnInDtl_sno4) doInDtl_sno4_LC(info);
		else if (lc == columnInDtl_bp_cd) doInDtl_bp_cd_LC(info);
		else if (lc == columnInDtl_bp_nm) doInDtl_bp_nm_LC(info);
		else if (lc == columnInDtl_ac_slip_typ) doInDtl_ac_slip_typ_LC(info);
		else if (lc == columnInDtl_ac_slip_typ_nm) doInDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnInDtl_ac_rsn_cd) doInDtl_ac_rsn_cd_LC(info);
		else if (lc == columnInDtl_ac_rsn_nm) doInDtl_ac_rsn_nm_LC(info);
		else if (lc == columnInDtl_asst_typ) doInDtl_asst_typ_LC(info);
		else if (lc == columnInDtl_asst_typ_nm) doInDtl_asst_typ_nm_LC(info);
		else if (lc == columnInDtl_per) doInDtl_per_LC(info);
		else if (lc == columnInDtl_mfg_cost_ratio) doInDtl_mfg_cost_ratio_LC(info);
		else if (lc == columnInDtl_unit_cd) doInDtl_unit_cd_LC(info);
		else if (lc == columnInDtl_unit_nm) doInDtl_unit_nm_LC(info);
		else if (lc == columnInDtl_dec_place) doInDtl_dec_place_LC(info);
		else if (lc == columnInDtl_upri) doInDtl_upri_LC(info);
		else if (lc == columnInDtl_ttl) doInDtl_ttl_LC(info);
		else if (lc == columnInDtl_col_000) doInDtl_col_000_LC(info);
		else if (lc == columnInDtl_col_001) doInDtl_col_001_LC(info);
		else if (lc == columnInDtl_col_002) doInDtl_col_002_LC(info);
		else if (lc == columnInDtl_col_003) doInDtl_col_003_LC(info);
		else if (lc == columnInDtl_col_004) doInDtl_col_004_LC(info);
		else if (lc == columnInDtl_col_005) doInDtl_col_005_LC(info);
		else if (lc == columnInDtl_col_006) doInDtl_col_006_LC(info);
		else if (lc == columnInDtl_col_007) doInDtl_col_007_LC(info);
		else if (lc == columnInDtl_col_008) doInDtl_col_008_LC(info);
		else if (lc == columnInDtl_col_009) doInDtl_col_009_LC(info);
		else if (lc == columnInDtl_col_010) doInDtl_col_010_LC(info);
		else if (lc == columnInDtl_col_011) doInDtl_col_011_LC(info);
		else if (lc == columnInDtl_col_012) doInDtl_col_012_LC(info);
		else if (lc == columnInDtl_col_013) doInDtl_col_013_LC(info);
		else if (lc == columnInDtl_col_014) doInDtl_col_014_LC(info);
		else if (lc == columnInDtl_col_015) doInDtl_col_015_LC(info);
		else if (lc == columnInDtl_col_016) doInDtl_col_016_LC(info);
		else if (lc == columnInDtl_col_017) doInDtl_col_017_LC(info);
		else if (lc == columnInDtl_col_018) doInDtl_col_018_LC(info);
		else if (lc == columnInDtl_col_019) doInDtl_col_019_LC(info);
		else if (lc == columnInDtl_col_020) doInDtl_col_020_LC(info);
		else if (lc == columnInDtl_col_021) doInDtl_col_021_LC(info);
		else if (lc == columnInDtl_col_022) doInDtl_col_022_LC(info);
		else if (lc == columnInDtl_col_023) doInDtl_col_023_LC(info);
		else if (lc == columnInDtl_col_024) doInDtl_col_024_LC(info);
		else if (lc == columnInDtl_col_025) doInDtl_col_025_LC(info);
		else if (lc == columnInDtl_col_026) doInDtl_col_026_LC(info);
		else if (lc == columnInDtl_col_027) doInDtl_col_027_LC(info);
		else if (lc == columnInDtl_col_028) doInDtl_col_028_LC(info);
		else if (lc == columnInDtl_col_029) doInDtl_col_029_LC(info);
		else if (lc == columnInDtl_col_030) doInDtl_col_030_LC(info);
		else if (lc == columnInDtl_col_031) doInDtl_col_031_LC(info);
		else if (lc == columnInDtl_col_032) doInDtl_col_032_LC(info);
		else if (lc == columnInDtl_col_033) doInDtl_col_033_LC(info);
		else if (lc == columnInDtl_col_034) doInDtl_col_034_LC(info);
		else if (lc == columnInDtl_col_035) doInDtl_col_035_LC(info);
		else if (lc == columnInDtl_col_036) doInDtl_col_036_LC(info);
		else if (lc == columnInDtl_col_037) doInDtl_col_037_LC(info);
		else if (lc == columnInDtl_col_038) doInDtl_col_038_LC(info);
		else if (lc == columnInDtl_col_039) doInDtl_col_039_LC(info);
		else if (lc == columnInDtl_col_040) doInDtl_col_040_LC(info);
		else if (lc == columnInDtl_col_041) doInDtl_col_041_LC(info);
		else if (lc == columnInDtl_col_042) doInDtl_col_042_LC(info);
		else if (lc == columnInDtl_col_043) doInDtl_col_043_LC(info);
		else if (lc == columnInDtl_col_044) doInDtl_col_044_LC(info);
		else if (lc == columnInDtl_col_045) doInDtl_col_045_LC(info);
		else if (lc == columnInDtl_col_046) doInDtl_col_046_LC(info);
		else if (lc == columnInDtl_col_047) doInDtl_col_047_LC(info);
		else if (lc == columnInDtl_col_048) doInDtl_col_048_LC(info);
		else if (lc == columnInDtl_col_049) doInDtl_col_049_LC(info);
		else if (lc == columnInDtl_col_050) doInDtl_col_050_LC(info);
		else if (lc == columnInDtl_col_051) doInDtl_col_051_LC(info);
		else if (lc == columnInDtl_col_052) doInDtl_col_052_LC(info);
		else if (lc == columnInDtl_col_053) doInDtl_col_053_LC(info);
		else if (lc == columnInDtl_col_054) doInDtl_col_054_LC(info);
		else if (lc == columnInDtl_col_055) doInDtl_col_055_LC(info);
		else if (lc == columnInDtl_col_056) doInDtl_col_056_LC(info);
		else if (lc == columnInDtl_col_057) doInDtl_col_057_LC(info);
		else if (lc == columnInDtl_col_058) doInDtl_col_058_LC(info);
		else if (lc == columnInDtl_col_059) doInDtl_col_059_LC(info);
		else if (lc == columnInDtl_col_060) doInDtl_col_060_LC(info);
		else if (lc == columnInDtl_col_061) doInDtl_col_061_LC(info);
		else if (lc == columnInDtl_col_062) doInDtl_col_062_LC(info);
		else if (lc == columnInDtl_col_063) doInDtl_col_063_LC(info);
		else if (lc == columnInDtl_col_064) doInDtl_col_064_LC(info);
		else if (lc == columnInDtl_col_065) doInDtl_col_065_LC(info);
		else if (lc == columnInDtl_col_066) doInDtl_col_066_LC(info);
		else if (lc == columnInDtl_col_067) doInDtl_col_067_LC(info);
		else if (lc == columnInDtl_col_068) doInDtl_col_068_LC(info);
		else if (lc == columnInDtl_col_069) doInDtl_col_069_LC(info);
		else if (lc == columnInDtl_col_070) doInDtl_col_070_LC(info);
		else if (lc == columnInDtl_col_071) doInDtl_col_071_LC(info);
		else if (lc == columnInDtl_col_072) doInDtl_col_072_LC(info);
		else if (lc == columnInDtl_col_073) doInDtl_col_073_LC(info);
		else if (lc == columnInDtl_col_074) doInDtl_col_074_LC(info);
		else if (lc == columnInDtl_col_075) doInDtl_col_075_LC(info);
		else if (lc == columnInDtl_col_076) doInDtl_col_076_LC(info);
		else if (lc == columnInDtl_col_077) doInDtl_col_077_LC(info);
		else if (lc == columnInDtl_col_078) doInDtl_col_078_LC(info);
		else if (lc == columnInDtl_col_079) doInDtl_col_079_LC(info);
		else if (lc == columnInDtl_col_080) doInDtl_col_080_LC(info);
		else if (lc == columnInDtl_col_081) doInDtl_col_081_LC(info);
		else if (lc == columnInDtl_col_082) doInDtl_col_082_LC(info);
		else if (lc == columnInDtl_col_083) doInDtl_col_083_LC(info);
		else if (lc == columnInDtl_col_084) doInDtl_col_084_LC(info);
		else if (lc == columnInDtl_col_085) doInDtl_col_085_LC(info);
		else if (lc == columnInDtl_col_086) doInDtl_col_086_LC(info);
		else if (lc == columnInDtl_col_087) doInDtl_col_087_LC(info);
		else if (lc == columnInDtl_col_088) doInDtl_col_088_LC(info);
		else if (lc == columnInDtl_col_089) doInDtl_col_089_LC(info);
		else if (lc == columnInDtl_col_090) doInDtl_col_090_LC(info);
		else if (lc == columnInDtl_col_091) doInDtl_col_091_LC(info);
		else if (lc == columnInDtl_col_092) doInDtl_col_092_LC(info);
		else if (lc == columnInDtl_col_093) doInDtl_col_093_LC(info);
		else if (lc == columnInDtl_col_094) doInDtl_col_094_LC(info);
		else if (lc == columnInDtl_col_095) doInDtl_col_095_LC(info);
		else if (lc == columnInDtl_col_096) doInDtl_col_096_LC(info);
		else if (lc == columnInDtl_col_097) doInDtl_col_097_LC(info);
		else if (lc == columnInDtl_col_098) doInDtl_col_098_LC(info);
		else if (lc == columnInDtl_col_099) doInDtl_col_099_LC(info);
		else if (lc == columnInDtl_ym) doInDtl_ym_LC(info);
		else if (lc == columnInDtl_trd_grp) doInDtl_trd_grp_LC(info);
		else if (lc == columnInDtl_calc_grp_cd) doInDtl_calc_grp_cd_LC(info);
		else if (lc == columnInDtl_calc_no) doInDtl_calc_no_LC(info);
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
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_grp_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno1_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno2_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno3_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_sno4_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[per]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_per_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[mfg_cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_mfg_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ttl_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_000_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_001_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_002_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_003_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_004_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_005_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_006_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_007_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_008_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_009_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_010_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_011_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_012_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_013_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_014_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_015_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_016_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_017_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_018_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_019_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_020_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_021_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_022_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_023_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_024_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_025_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_026_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_027_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_028_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_029_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_030_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_031_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_032_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_033_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_034_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_035_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_036_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_037_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_038_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_039_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_040_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_041_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_042_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_043_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_044_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_045_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_046_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_047_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_048_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_049_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_050_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_051_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_052_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_053_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_054_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_055_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_056_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_057_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_058_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_059_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_060_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_061_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_062_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_063_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_064_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_065_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_066_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_067_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_068_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_069_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_070_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_071_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_072_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_073_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_074_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_075_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_076_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_077_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_078_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_079_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_080_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_081_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_082_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_083_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_084_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_085_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_086_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_087_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_088_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_089_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_090_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_091_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_092_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_093_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_094_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_095_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_096_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_097_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_098_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_col_099_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[trd_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_trd_grp_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [OutDtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doOutDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno1_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno2_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno3_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_sno4_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[per]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_per_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[mfg_cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_mfg_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ttl_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_000_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_001_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_002_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_003_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_004_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_005_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_006_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_007_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_008_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_009_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_010_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_011_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_012_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_013_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_014_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_015_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_016_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_017_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_018_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_019_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_020_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_021_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_022_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_023_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_024_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_025_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_026_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_027_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_028_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_029_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_030_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_031_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_032_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_033_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_034_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_035_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_036_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_037_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_038_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_039_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_040_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_041_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_042_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_043_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_044_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_045_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_046_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_047_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_048_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_049_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_050_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_051_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_052_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_053_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_054_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_055_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_056_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_057_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_058_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_059_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_060_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_061_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_062_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_063_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_064_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_065_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_066_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_067_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_068_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_069_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_070_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_071_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_072_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_073_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_074_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_075_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_076_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_077_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_078_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_079_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_080_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_081_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_082_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_083_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_084_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_085_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_086_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_087_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_088_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_089_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_090_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_091_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_092_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_093_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_094_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_095_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_096_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_097_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_098_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_col_099_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[trd_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_trd_grp_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [InDtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym]の作成メソッド
	 */
	public MCList getCnd_ym(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcArgYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnOutDtl_mng_dpt_cd]の作成メソッド
	 */
	public MCList getOutDtl_mng_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnInDtl_mng_dpt_cd]の作成メソッド
	 */
	public MCList getInDtl_mng_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0160.Srch01")) {
			return new MG_MGBFL0160_Srch01Bridge();
		}
		if (id.equals("MG.MGBFL0160.Srch02")) {
			return new MG_MGBFL0160_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0160_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0160_Srch01Bridge() {
			p_MG_MGBFL0160_Srch01 = new MCParam(PDef.MG_MGBFL0160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.RsltR.class));

			p_MG_MGBFL0160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0160.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0160.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0160.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0160.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0160_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0160_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0160.RsltR>)p_MG_MGBFL0160_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBFL0160_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0160_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0160_Srch02;

		/** コンストラクタ */
		protected MG_MGBFL0160_Srch02Bridge() {
			p_MG_MGBFL0160_Srch02 = new MCParam(PDef.MG_MGBFL0160_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0160_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class));

			p_MG_MGBFL0160_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0160_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0160_Srch02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0160_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0160_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBF.MGBFP0160.RsltR> up0() {
			return (MCList<mcframe.clientMGBF.MGBFP0160.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0160_Srch02.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class));
			p_MG_MGBFL0160_Srch02.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0160.OutDtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0160_Srch02;
		}

		protected void show() {
			setOutDtlL((MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR>)p_MG_MGBFL0160_Srch02.getContainerParam().getDownBlock(0));
			setInDtlL((MCList<mcframe.clientMGBF.MGBFP0160.OutDtlR>)p_MG_MGBFL0160_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getOutDtlL().clear();
			getInDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getOutDtlL());
			result.add(getInDtlL());
			return result;
		}
	}
}