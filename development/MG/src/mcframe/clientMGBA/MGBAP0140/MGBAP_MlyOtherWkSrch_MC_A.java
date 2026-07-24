package mcframe.clientMGBA.MGBAP0140;

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
import mcframe.clientMGBA.MGBAP0140.MGBAP_MlyOtherWkSrch_MC.MG_MGBAL0140_Srch01Caller;

/**
 * 画面"MGBAP_MlyOtherWkSrch"パネルクラスです。<p>
 *
 * 品目外工数に関して月別に計画値と実績値を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAP_MlyOtherWkSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBAP0140";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_pln_calc_ctg_cd_Label = null;
	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pln_calc_ctg_cd = null;
	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_pln_calc_ctg_nm = null;
	public MCLabel Cnd_act_calc_ctg_cd_Label = null;
	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_calc_ctg_cd = null;
	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_act_calc_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
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
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_ctg_cd_Label = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCTextField Cnd_ctg_nm = null;
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
	public MCLabel Cnd_wk_cost_cd_Label = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCTextField Cnd_wk_cost_nm = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public MCCheckBox Cnd_dpt_flg = null;
	/**
	 * Item category 品群.<p>
	 *
	 */
	public MCCheckBox Cnd_ctg_flg = null;
	/**
	 * Location 場所.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_flg = null;
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public MCCheckBox Cnd_site_flg = null;
	/**
	 * Operation 工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_flg = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_flg = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_flg = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_flg = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_flg = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_deselect_all = null;
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_key = null;
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispRslt]ブロック関連のField定義
	public MCPanel DispRsltPanel = null;
	public MCScrollPane DispRsltScrollPane = null;
	public MCTable2<mcframe.clientMGBA.MGBAP0140.DispRsltR> DispRsltTable = null;
	// [DispRslt]ブロックの項目のField定義
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dpt_nm = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ctg_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_site_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_oper_nm = null;
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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wk_cost_nm = null;
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wk_cost_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dec_place = null;
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm_no = null;
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm_nm = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_00;// [DispRslt]の[qty_00_p.wk_cost_qty]を[columnDispRslt_col_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_01_p_PPanel;
	public MCColumnConfig columnDispRslt_col_01;// [DispRslt]の[qty_01_p.wk_cost_qty]を[columnDispRslt_col_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_02;// [DispRslt]の[qty_02_p.wk_cost_qty]を[columnDispRslt_col_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_03_p_PPanel;
	public MCColumnConfig columnDispRslt_col_03;// [DispRslt]の[qty_03_p.wk_cost_qty]を[columnDispRslt_col_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_04;// [DispRslt]の[qty_04_p.wk_cost_qty]を[columnDispRslt_col_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_05_p_PPanel;
	public MCColumnConfig columnDispRslt_col_05;// [DispRslt]の[qty_05_p.wk_cost_qty]を[columnDispRslt_col_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_06;// [DispRslt]の[qty_06_p.wk_cost_qty]を[columnDispRslt_col_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_07_p_PPanel;
	public MCColumnConfig columnDispRslt_col_07;// [DispRslt]の[qty_07_p.wk_cost_qty]を[columnDispRslt_col_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_08;// [DispRslt]の[qty_08_p.wk_cost_qty]を[columnDispRslt_col_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_09_p_PPanel;
	public MCColumnConfig columnDispRslt_col_09;// [DispRslt]の[qty_09_p.wk_cost_qty]を[columnDispRslt_col_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_10;// [DispRslt]の[qty_10_p.wk_cost_qty]を[columnDispRslt_col_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_qty_11_p_PPanel;
	public MCColumnConfig columnDispRslt_col_11;// [DispRslt]の[qty_11_p.wk_cost_qty]を[columnDispRslt_col_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispRslt_ttl_qty_p_PPanel;
	public MCColumnConfig columnDispRslt_ttl;// [DispRslt]の[ttl_qty_p.wk_cost_qty]を[columnDispRslt_ttl]としてエイリアス定義。
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
	
	/** [MG_MGBAL0140_Srch01]のCallerの作成 */
	protected MGBAP_MlyOtherWkSrch_MC.MG_MGBAL0140_Srch01Caller createMG_MGBAL0140_Srch01() {
		MGBAP_MlyOtherWkSrch_MC.MG_MGBAL0140_Srch01Caller<MGBAP_MlyOtherWkSrch, MG_MGBAL0140_Srch01Bridge>
		caller = ((MGBAP_MlyOtherWkSrch_MC)this).new MG_MGBAL0140_Srch01Caller<MGBAP_MlyOtherWkSrch, MG_MGBAL0140_Srch01Bridge>(
					(MGBAP_MlyOtherWkSrch)this, new MG_MGBAL0140_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBAL0140_Srch01]の呼び出し */
	protected void callMG_MGBAL0140_Srch01() {
		MCCaller caller = createMG_MGBAL0140_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBA.MGBAP0140.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0140.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0140.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBA.MGBAP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0140.CndR createCndR() {
		return mcframe.clientMGBA.MGBAP0140.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBA.MGBAP0140.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0140.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBA.MGBAP0140.DispRsltR createDispRsltR() {
		return mcframe.clientMGBA.MGBAP0140.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0140.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.class);
	}

	/**
	 * DispRsltTableを初期化します。
	 */
	protected void createDispRsltTable(){
		if(DispRsltTable == null){
			DispRsltTable = beansFactory.createTable2("DispRslt.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBA.MGBAP0140.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0140.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBA.MGBAP0140.RsltR createRsltR() {
		return mcframe.clientMGBA.MGBAP0140.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0140.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0140.RsltR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDispRsltL())) ret.add(getDispRsltL());
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
		if(aCnt == getDispRsltL()) return "DispRslt";
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
		if(bId.equals("DispRslt")) return getDispRsltL();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(TtlPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBAP_MlyOtherWkSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBAP_MlyOtherWkSrch_MC_A(String name) {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		createDispRsltTable();
		DispRsltTable.setRowName(name);
		aRsltL = createRsltL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBAP_MlyOtherWkSrch_MC.jbCreateTop((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateFold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateTab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateTab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateCnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateTtl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateLPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateCtrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbCreateDispRslt((MGBAP_MlyOtherWkSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBAP_MlyOtherWkSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBAP_MlyOtherWkSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBAP_MlyOtherWkSrch p) {
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_qty_00_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_01_p);
		p.DispRslt_qty_01_p_PPanel.setName("DispRslt.qty_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_qty_01_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_qty_02_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_03_p);
		p.DispRslt_qty_03_p_PPanel.setName("DispRslt.qty_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_qty_03_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_qty_04_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_05_p);
		p.DispRslt_qty_05_p_PPanel.setName("DispRslt.qty_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_qty_05_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_qty_06_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_07_p);
		p.DispRslt_qty_07_p_PPanel.setName("DispRslt.qty_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_qty_07_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_qty_08_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_09_p);
		p.DispRslt_qty_09_p_PPanel.setName("DispRslt.qty_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_qty_09_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_qty_10_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$qty_11_p);
		p.DispRslt_qty_11_p_PPanel.setName("DispRslt.qty_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_qty_11_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
		p.DispRslt_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBA.MGBAP0140.DispRsltR.$ttl_qty_p);
		p.DispRslt_ttl_qty_p_PPanel.setName("DispRslt.ttl_qty_p");
		p.columnDispRslt_ttl = p.DispRslt_ttl_qty_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispRslt_ttl.addAliasName("DispRslt.ttl", p);
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

	
	/** [Cnd_pln_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pln_calc_ctg_cd_p = null;

	/**
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pln_calc_ctg_cd_ListPutter() {
		if (Cnd_pln_calc_ctg_cd_p == null) {
			Cnd_pln_calc_ctg_cd_p = createCnd_pln_calc_ctg_cd_ListPutter(Cnd_pln_calc_ctg_cd, "pln_calc_ctg_cd", "pln_calc_ctg_nm");

		}
		return Cnd_pln_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_act_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_calc_ctg_cd_p = null;

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_calc_ctg_cd_ListPutter() {
		if (Cnd_act_calc_ctg_cd_p == null) {
			Cnd_act_calc_ctg_cd_p = createCnd_act_calc_ctg_cd_ListPutter(Cnd_act_calc_ctg_cd, "act_calc_ctg_cd", "act_calc_ctg_nm");

		}
		return Cnd_act_calc_ctg_cd_p;
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
	
	
	/** [Cnd_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ctg_cd_p = null;

	/**
	 * [Cnd_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ctg_cd_ListPutter() {
		if (Cnd_ctg_cd_p == null) {
			Cnd_ctg_cd_p = createCnd_ctg_cd_ListPutter(Cnd_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Cnd_ctg_cd_p;
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
	
	
	/** [Cnd_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_cost_cd_p = null;

	/**
	 * [Cnd_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_cost_cd_ListPutter() {
		if (Cnd_wk_cost_cd_p == null) {
			Cnd_wk_cost_cd_p = createCnd_wk_cost_cd_ListPutter(Cnd_wk_cost_cd, "wk_cost_cd", "wk_cost_nm");

		}
		return Cnd_wk_cost_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlyOtherWkSrch create(){
		MGBAP_MlyOtherWkSrch p = new MGBAP_MlyOtherWkSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlyOtherWkSrch create(String name){
		MGBAP_MlyOtherWkSrch p = new MGBAP_MlyOtherWkSrch(name);
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
		MGBAP_MlyOtherWkSrch_MC.jbfInitTop((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitFold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitTab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitTab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitCnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitTtl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitLPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitCtrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbfInitDispRslt((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitTop((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitFold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitTab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitTab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitCnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitTtl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitLPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitCtrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.jbInitDispRslt((MGBAP_MlyOtherWkSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBAP_MlyOtherWkSrch p) {
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
	protected static void jbfInitTab1(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_pln_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.pln_calc_ctg_cd_Label");
		p.Cnd_pln_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.pln_calc_ctg_cd");
		p.Cnd_pln_calc_ctg_cd.setLabel(p.Cnd_pln_calc_ctg_cd_Label);
		p.Cnd_pln_calc_ctg_nm = p.beansFactory.createTextField("Cnd.pln_calc_ctg_nm");
		p.Cnd_act_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.act_calc_ctg_cd_Label");
		p.Cnd_act_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.act_calc_ctg_cd");
		p.Cnd_act_calc_ctg_cd.setLabel(p.Cnd_act_calc_ctg_cd_Label);
		p.Cnd_act_calc_ctg_nm = p.beansFactory.createTextField("Cnd.act_calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_ctg_cd_Label = p.beansFactory.createLabel("Cnd.ctg_cd_Label");
		p.Cnd_ctg_cd = p.beansFactory.createTextComboBox("Cnd.ctg_cd");
		p.Cnd_ctg_cd.setLabel(p.Cnd_ctg_cd_Label);
		p.Cnd_ctg_nm = p.beansFactory.createTextField("Cnd.ctg_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
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
		p.Cnd_wk_cost_cd_Label = p.beansFactory.createLabel("Cnd.wk_cost_cd_Label");
		p.Cnd_wk_cost_cd = p.beansFactory.createTextComboBox("Cnd.wk_cost_cd");
		p.Cnd_wk_cost_cd.setLabel(p.Cnd_wk_cost_cd_Label);
		p.Cnd_wk_cost_nm = p.beansFactory.createTextField("Cnd.wk_cost_nm");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_dpt_flg = p.beansFactory.createCheckBox("Cnd.dpt_flg");
		p.Cnd_ctg_flg = p.beansFactory.createCheckBox("Cnd.ctg_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_wg_cd = p.beansFactory.createTableColumn("DispRslt.wg_cd", MCColumnType.TEXT);
		p.columnDispRslt_wg_nm = p.beansFactory.createTableColumn("DispRslt.wg_nm", MCColumnType.TEXT);
		p.columnDispRslt_dpt_cd = p.beansFactory.createTableColumn("DispRslt.dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_dpt_nm = p.beansFactory.createTableColumn("DispRslt.dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_ctg_cd = p.beansFactory.createTableColumn("DispRslt.ctg_cd", MCColumnType.TEXT);
		p.columnDispRslt_ctg_nm = p.beansFactory.createTableColumn("DispRslt.ctg_nm", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_site_cd = p.beansFactory.createTableColumn("DispRslt.site_cd", MCColumnType.TEXT);
		p.columnDispRslt_site_nm = p.beansFactory.createTableColumn("DispRslt.site_nm", MCColumnType.TEXT);
		p.columnDispRslt_oper_cd = p.beansFactory.createTableColumn("DispRslt.oper_cd", MCColumnType.TEXT);
		p.columnDispRslt_oper_nm = p.beansFactory.createTableColumn("DispRslt.oper_nm", MCColumnType.TEXT);
		p.columnDispRslt_lot_no = p.beansFactory.createTableColumn("DispRslt.lot_no", MCColumnType.TEXT);
		p.columnDispRslt_sublot_no = p.beansFactory.createTableColumn("DispRslt.sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_sno1 = p.beansFactory.createTableColumn("DispRslt.sno1", MCColumnType.TEXT);
		p.columnDispRslt_sno2 = p.beansFactory.createTableColumn("DispRslt.sno2", MCColumnType.TEXT);
		p.columnDispRslt_sno3 = p.beansFactory.createTableColumn("DispRslt.sno3", MCColumnType.TEXT);
		p.columnDispRslt_sno4 = p.beansFactory.createTableColumn("DispRslt.sno4", MCColumnType.TEXT);
		p.columnDispRslt_wk_cost_cd = p.beansFactory.createTableColumn("DispRslt.wk_cost_cd", MCColumnType.TEXT);
		p.columnDispRslt_wk_cost_nm = p.beansFactory.createTableColumn("DispRslt.wk_cost_nm", MCColumnType.TEXT);
		p.columnDispRslt_wk_cost_unit_nm = p.beansFactory.createTableColumn("DispRslt.wk_cost_unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBAP_MlyOtherWkSrch p) {
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
	protected static void jbInitFold(MGBAP_MlyOtherWkSrch p) {
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
	protected static void jbInitTab1(MGBAP_MlyOtherWkSrch p) {
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
	protected static void jbInitTab2(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.TtlPanel, null);
		p.Tab2Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_pln_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_pln_calc_ctg_cd.setLinkBeans(p.Cnd_pln_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_cd.setNextBeans(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.pln_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.pln_calc_ctg_nm_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.act_calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ctg_cd, true);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.CndPanel.add(p.Cnd_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.ctg_cd_META);
		p.CndPanel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_ctg_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_wk_cost_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_wk_cost_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_cost_cd, true);
		p.Cnd_wk_cost_cd.setLinkBeans(p.Cnd_wk_cost_nm);
		p.CndPanel.add(p.Cnd_wk_cost_cd_Label);
		p.CndPanel.add(p.Cnd_wk_cost_cd);
		p.Cnd_wk_cost_cd.setNextBeans(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.wk_cost_cd_META);
		p.CndPanel.add(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.wk_cost_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_cost_nm, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_dpt_flg);
		p.Cnd_dpt_flg.setNextBeans(p.Cnd_ctg_flg);
		p.Cnd_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.dpt_flg_META);
		p.TtlPanel.add(p.Cnd_ctg_flg);
		p.Cnd_ctg_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_ctg_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.ctg_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.site_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.sno4_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0140.CndR.disp_key_META);
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBAP_MlyOtherWkSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBAP_MlyOtherWkSrch p) {
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
	protected static void jbInitDispRslt(MGBAP_MlyOtherWkSrch p) {
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
		MGBAP_MlyOtherWkSrch_MC.mcInitTop((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitFold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitTab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitTab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitCnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitTtl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitLPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitCtrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.mcInitDispRslt((MGBAP_MlyOtherWkSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Top((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Fold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Tab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Tab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Cnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Ttl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_LPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Ctrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_DispRslt((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitSRCH_Rslt((MGBAP_MlyOtherWkSrch)this);

		// [REF]ステータスのモードの設定
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Top((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Fold((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Tab1((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Tab2((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Cnd((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Ttl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_LPnl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Ctrl((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_DispRslt((MGBAP_MlyOtherWkSrch)this);
		MGBAP_MlyOtherWkSrch_MC.statusInitREF_Rslt((MGBAP_MlyOtherWkSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBAP_MlyOtherWkSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBAP_MlyOtherWkSrch p) {
		p.Cnd_pln_calc_ctg_cd.setListListener(p);
		p.Cnd_pln_calc_ctg_cd.addAllListener(p);
		p.Cnd_pln_calc_ctg_nm.setListListener(p);
		p.Cnd_pln_calc_ctg_nm.addAllListener(p);
		p.Cnd_act_calc_ctg_cd.setListListener(p);
		p.Cnd_act_calc_ctg_cd.addAllListener(p);
		p.Cnd_act_calc_ctg_nm.setListListener(p);
		p.Cnd_act_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_ctg_cd.setListListener(p);
		p.Cnd_ctg_cd.addAllListener(p);
		p.Cnd_ctg_nm.setListListener(p);
		p.Cnd_ctg_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
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
		p.Cnd_wk_cost_cd.setListListener(p);
		p.Cnd_wk_cost_cd.addAllListener(p);
		p.Cnd_wk_cost_nm.setListListener(p);
		p.Cnd_wk_cost_nm.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_dpt_flg.addAllListener(p);
		p.Cnd_ctg_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
		p.Cnd_disp_key.addAllListener(p);
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBAP_MlyOtherWkSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBAP_MlyOtherWkSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBAP_MlyOtherWkSrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_wg_cd.addAllListener(p);
		p.columnDispRslt_wg_cd.setListListener(p);
		p.columnDispRslt_wg_nm.addAllListener(p);
		p.columnDispRslt_wg_nm.setListListener(p);
		p.columnDispRslt_dpt_cd.addAllListener(p);
		p.columnDispRslt_dpt_cd.setListListener(p);
		p.columnDispRslt_dpt_nm.addAllListener(p);
		p.columnDispRslt_dpt_nm.setListListener(p);
		p.columnDispRslt_ctg_cd.addAllListener(p);
		p.columnDispRslt_ctg_cd.setListListener(p);
		p.columnDispRslt_ctg_nm.addAllListener(p);
		p.columnDispRslt_ctg_nm.setListListener(p);
		p.columnDispRslt_loc_cd.addAllListener(p);
		p.columnDispRslt_loc_cd.setListListener(p);
		p.columnDispRslt_loc_nm.addAllListener(p);
		p.columnDispRslt_loc_nm.setListListener(p);
		p.columnDispRslt_site_cd.addAllListener(p);
		p.columnDispRslt_site_cd.setListListener(p);
		p.columnDispRslt_site_nm.addAllListener(p);
		p.columnDispRslt_site_nm.setListListener(p);
		p.columnDispRslt_oper_cd.addAllListener(p);
		p.columnDispRslt_oper_cd.setListListener(p);
		p.columnDispRslt_oper_nm.addAllListener(p);
		p.columnDispRslt_oper_nm.setListListener(p);
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
		p.columnDispRslt_wk_cost_cd.addAllListener(p);
		p.columnDispRslt_wk_cost_cd.setListListener(p);
		p.columnDispRslt_wk_cost_nm.addAllListener(p);
		p.columnDispRslt_wk_cost_nm.setListListener(p);
		p.columnDispRslt_wk_cost_unit_nm.addAllListener(p);
		p.columnDispRslt_wk_cost_unit_nm.setListListener(p);
		p.columnDispRslt_dec_place.addAllListener(p);
		p.columnDispRslt_dec_place.setListListener(p);
		p.columnDispRslt_elm_no.addAllListener(p);
		p.columnDispRslt_elm_no.setListListener(p);
		p.columnDispRslt_elm.addAllListener(p);
		p.columnDispRslt_elm.setListListener(p);
		p.columnDispRslt_elm_nm.addAllListener(p);
		p.columnDispRslt_elm_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBAP_MlyOtherWkSrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ctg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBAP_MlyOtherWkSrch p){
		p.columnDispRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBAP_MlyOtherWkSrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ctg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBAP_MlyOtherWkSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBAP_MlyOtherWkSrch p){
		p.columnDispRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wk_cost_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBAP_MlyOtherWkSrch p){

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
		MGBAP_MlyOtherWkSrch_MC.setTableConfigDispRslt((MGBAP_MlyOtherWkSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBAP_MlyOtherWkSrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dpt_cd);
		p.columnDispRslt_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dpt_nm);
		p.columnDispRslt_ctg_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.ctg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ctg_cd);
		p.columnDispRslt_ctg_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.ctg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ctg_nm);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_site_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.site_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_cd);
		p.columnDispRslt_site_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.site_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_nm);
		p.columnDispRslt_oper_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.oper_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_cd);
		p.columnDispRslt_oper_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.oper_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_nm);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_wk_cost_cd.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.wk_cost_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wk_cost_cd);
		p.columnDispRslt_wk_cost_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.wk_cost_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wk_cost_nm);
		p.columnDispRslt_wk_cost_unit_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.wk_cost_unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wk_cost_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBA.MGBAP0140.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.DispRsltTable.addTable(p.DispRslt_qty_00_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_01_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_02_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_03_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_04_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_05_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_06_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_07_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_08_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_09_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_10_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_11_p_PPanel.WkCostQtyTable);
		p.DispRsltTable.addTable(p.DispRslt_ttl_qty_p_PPanel.WkCostQtyTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_pln_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pln_calc_ctg_cd.getListConfig().setPutter(getCnd_pln_calc_ctg_cd_ListPutter());
		Cnd_act_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_calc_ctg_cd.getListConfig().setPutter(getCnd_act_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ctg_cd.getListConfig().setPutter(getCnd_ctg_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wk_cost_cd.getListConfig().setPutter(getCnd_wk_cost_cd_ListPutter());
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
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pln_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
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
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
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
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_pln_calc_ctg_cd) return getCnd_pln_calc_ctg_cd(row, info);
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_wk_cost_cd) return getCnd_wk_cost_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_select_all) doCnd_select_all(info);
		else if (ap == Cnd_deselect_all) doCnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
	}

	/**
	 * [Cnd]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_pln_calc_ctg_cd) return doCnd_pln_calc_ctg_cd_VC(info);
		if (vc == Cnd_pln_calc_ctg_nm) return doCnd_pln_calc_ctg_nm_VC(info);
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_ctg_cd) return doCnd_ctg_cd_VC(info);
		if (vc == Cnd_ctg_nm) return doCnd_ctg_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_wk_cost_cd) return doCnd_wk_cost_cd_VC(info);
		if (vc == Cnd_wk_cost_nm) return doCnd_wk_cost_nm_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_dpt_flg) return doCnd_dpt_flg_VC(info);
		if (vc == Cnd_ctg_flg) return doCnd_ctg_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_dpt_cd) return doDispRslt_dpt_cd_VC(info);
		if (vc == columnDispRslt_dpt_nm) return doDispRslt_dpt_nm_VC(info);
		if (vc == columnDispRslt_ctg_cd) return doDispRslt_ctg_cd_VC(info);
		if (vc == columnDispRslt_ctg_nm) return doDispRslt_ctg_nm_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_site_cd) return doDispRslt_site_cd_VC(info);
		if (vc == columnDispRslt_site_nm) return doDispRslt_site_nm_VC(info);
		if (vc == columnDispRslt_oper_cd) return doDispRslt_oper_cd_VC(info);
		if (vc == columnDispRslt_oper_nm) return doDispRslt_oper_nm_VC(info);
		if (vc == columnDispRslt_lot_no) return doDispRslt_lot_no_VC(info);
		if (vc == columnDispRslt_sublot_no) return doDispRslt_sublot_no_VC(info);
		if (vc == columnDispRslt_sno1) return doDispRslt_sno1_VC(info);
		if (vc == columnDispRslt_sno2) return doDispRslt_sno2_VC(info);
		if (vc == columnDispRslt_sno3) return doDispRslt_sno3_VC(info);
		if (vc == columnDispRslt_sno4) return doDispRslt_sno4_VC(info);
		if (vc == columnDispRslt_wk_cost_cd) return doDispRslt_wk_cost_cd_VC(info);
		if (vc == columnDispRslt_wk_cost_nm) return doDispRslt_wk_cost_nm_VC(info);
		if (vc == columnDispRslt_wk_cost_unit_nm) return doDispRslt_wk_cost_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
		if (vc == columnDispRslt_elm_no) return doDispRslt_elm_no_VC(info);
		if (vc == columnDispRslt_elm) return doDispRslt_elm_VC(info);
		if (vc == columnDispRslt_elm_nm) return doDispRslt_elm_nm_VC(info);
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_key_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_oper_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wk_cost_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wk_cost_unit_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[elm_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[elm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NC(info);
		else if (nc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NC(info);
		else if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_ctg_cd) doCnd_ctg_cd_NC(info);
		else if (nc == Cnd_ctg_nm) doCnd_ctg_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NC(info);
		else if (nc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_dpt_flg) doCnd_dpt_flg_NC(info);
		else if (nc == Cnd_ctg_flg) doCnd_ctg_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NC(info);
		else if (nc == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NC(info);
		else if (nc == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NC(info);
		else if (nc == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_site_cd) doDispRslt_site_cd_NC(info);
		else if (nc == columnDispRslt_site_nm) doDispRslt_site_nm_NC(info);
		else if (nc == columnDispRslt_oper_cd) doDispRslt_oper_cd_NC(info);
		else if (nc == columnDispRslt_oper_nm) doDispRslt_oper_nm_NC(info);
		else if (nc == columnDispRslt_lot_no) doDispRslt_lot_no_NC(info);
		else if (nc == columnDispRslt_sublot_no) doDispRslt_sublot_no_NC(info);
		else if (nc == columnDispRslt_sno1) doDispRslt_sno1_NC(info);
		else if (nc == columnDispRslt_sno2) doDispRslt_sno2_NC(info);
		else if (nc == columnDispRslt_sno3) doDispRslt_sno3_NC(info);
		else if (nc == columnDispRslt_sno4) doDispRslt_sno4_NC(info);
		else if (nc == columnDispRslt_wk_cost_cd) doDispRslt_wk_cost_cd_NC(info);
		else if (nc == columnDispRslt_wk_cost_nm) doDispRslt_wk_cost_nm_NC(info);
		else if (nc == columnDispRslt_wk_cost_unit_nm) doDispRslt_wk_cost_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
		else if (nc == columnDispRslt_elm_no) doDispRslt_elm_no_NC(info);
		else if (nc == columnDispRslt_elm) doDispRslt_elm_NC(info);
		else if (nc == columnDispRslt_elm_nm) doDispRslt_elm_nm_NC(info);
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NE(info);
		else if (ne == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NE(info);
		else if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_ctg_cd) doCnd_ctg_cd_NE(info);
		else if (ne == Cnd_ctg_nm) doCnd_ctg_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NE(info);
		else if (ne == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_dpt_flg) doCnd_dpt_flg_NE(info);
		else if (ne == Cnd_ctg_flg) doCnd_ctg_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NE(info);
		else if (ne == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NE(info);
		else if (ne == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NE(info);
		else if (ne == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_site_cd) doDispRslt_site_cd_NE(info);
		else if (ne == columnDispRslt_site_nm) doDispRslt_site_nm_NE(info);
		else if (ne == columnDispRslt_oper_cd) doDispRslt_oper_cd_NE(info);
		else if (ne == columnDispRslt_oper_nm) doDispRslt_oper_nm_NE(info);
		else if (ne == columnDispRslt_lot_no) doDispRslt_lot_no_NE(info);
		else if (ne == columnDispRslt_sublot_no) doDispRslt_sublot_no_NE(info);
		else if (ne == columnDispRslt_sno1) doDispRslt_sno1_NE(info);
		else if (ne == columnDispRslt_sno2) doDispRslt_sno2_NE(info);
		else if (ne == columnDispRslt_sno3) doDispRslt_sno3_NE(info);
		else if (ne == columnDispRslt_sno4) doDispRslt_sno4_NE(info);
		else if (ne == columnDispRslt_wk_cost_cd) doDispRslt_wk_cost_cd_NE(info);
		else if (ne == columnDispRslt_wk_cost_nm) doDispRslt_wk_cost_nm_NE(info);
		else if (ne == columnDispRslt_wk_cost_unit_nm) doDispRslt_wk_cost_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
		else if (ne == columnDispRslt_elm_no) doDispRslt_elm_no_NE(info);
		else if (ne == columnDispRslt_elm) doDispRslt_elm_NE(info);
		else if (ne == columnDispRslt_elm_nm) doDispRslt_elm_nm_NE(info);
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NX(info);
		else if (nx == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NX(info);
		else if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_ctg_cd) doCnd_ctg_cd_NX(info);
		else if (nx == Cnd_ctg_nm) doCnd_ctg_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NX(info);
		else if (nx == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_dpt_flg) doCnd_dpt_flg_NX(info);
		else if (nx == Cnd_ctg_flg) doCnd_ctg_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NX(info);
		else if (nx == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NX(info);
		else if (nx == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NX(info);
		else if (nx == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_site_cd) doDispRslt_site_cd_NX(info);
		else if (nx == columnDispRslt_site_nm) doDispRslt_site_nm_NX(info);
		else if (nx == columnDispRslt_oper_cd) doDispRslt_oper_cd_NX(info);
		else if (nx == columnDispRslt_oper_nm) doDispRslt_oper_nm_NX(info);
		else if (nx == columnDispRslt_lot_no) doDispRslt_lot_no_NX(info);
		else if (nx == columnDispRslt_sublot_no) doDispRslt_sublot_no_NX(info);
		else if (nx == columnDispRslt_sno1) doDispRslt_sno1_NX(info);
		else if (nx == columnDispRslt_sno2) doDispRslt_sno2_NX(info);
		else if (nx == columnDispRslt_sno3) doDispRslt_sno3_NX(info);
		else if (nx == columnDispRslt_sno4) doDispRslt_sno4_NX(info);
		else if (nx == columnDispRslt_wk_cost_cd) doDispRslt_wk_cost_cd_NX(info);
		else if (nx == columnDispRslt_wk_cost_nm) doDispRslt_wk_cost_nm_NX(info);
		else if (nx == columnDispRslt_wk_cost_unit_nm) doDispRslt_wk_cost_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
		else if (nx == columnDispRslt_elm_no) doDispRslt_elm_no_NX(info);
		else if (nx == columnDispRslt_elm) doDispRslt_elm_NX(info);
		else if (nx == columnDispRslt_elm_nm) doDispRslt_elm_nm_NX(info);
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_LC(info);
		else if (lc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_LC(info);
		else if (lc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_LC(info);
		else if (lc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_ctg_cd) doCnd_ctg_cd_LC(info);
		else if (lc == Cnd_ctg_nm) doCnd_ctg_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_LC(info);
		else if (lc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_LC(info);
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_LC(info);
		else if (lc == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_LC(info);
		else if (lc == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_LC(info);
		else if (lc == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_site_cd) doDispRslt_site_cd_LC(info);
		else if (lc == columnDispRslt_site_nm) doDispRslt_site_nm_LC(info);
		else if (lc == columnDispRslt_oper_cd) doDispRslt_oper_cd_LC(info);
		else if (lc == columnDispRslt_oper_nm) doDispRslt_oper_nm_LC(info);
		else if (lc == columnDispRslt_lot_no) doDispRslt_lot_no_LC(info);
		else if (lc == columnDispRslt_sublot_no) doDispRslt_sublot_no_LC(info);
		else if (lc == columnDispRslt_sno1) doDispRslt_sno1_LC(info);
		else if (lc == columnDispRslt_sno2) doDispRslt_sno2_LC(info);
		else if (lc == columnDispRslt_sno3) doDispRslt_sno3_LC(info);
		else if (lc == columnDispRslt_sno4) doDispRslt_sno4_LC(info);
		else if (lc == columnDispRslt_wk_cost_cd) doDispRslt_wk_cost_cd_LC(info);
		else if (lc == columnDispRslt_wk_cost_nm) doDispRslt_wk_cost_nm_LC(info);
		else if (lc == columnDispRslt_wk_cost_unit_nm) doDispRslt_wk_cost_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
		else if (lc == columnDispRslt_elm_no) doDispRslt_elm_no_LC(info);
		else if (lc == columnDispRslt_elm) doDispRslt_elm_LC(info);
		else if (lc == columnDispRslt_elm_nm) doDispRslt_elm_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wk_cost_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wk_cost_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_pln_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_pln_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_act_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
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
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_cost_cd]の作成メソッド
	 */
	public MCList getCnd_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBAL0140.Srch01")) {
			return new MG_MGBAL0140_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBAL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBAL0140_Srch01;

		/** コンストラクタ */
		protected MG_MGBAL0140_Srch01Bridge() {
			p_MG_MGBAL0140_Srch01 = new MCParam(PDef.MG_MGBAL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBAL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBA.MGBAP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0140.RsltR.class));

			p_MG_MGBAL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBAL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBAL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBAL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBAL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBA.MGBAP0140.CndR up0() {
			return (mcframe.clientMGBA.MGBAP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBA.MGBAP0140.RsltR> down0() {
			return (MCList<mcframe.clientMGBA.MGBAP0140.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBAL0140_Srch01.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0140.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBAL0140_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBA.MGBAP0140.RsltR>)p_MG_MGBAL0140_Srch01.getContainerParam().getDownBlock(0));
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