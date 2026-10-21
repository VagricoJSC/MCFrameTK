package mcframe.clientMSBB.MSBBPA0020;

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
import mcframe.clientMSBB.MSBBPA0020.MSBBPA_ShipItmCompSrch.MS_MSBBLA0020_Srch01Caller;

/**
 * 画面"MSBBPA_ShipItmCompSrch"パネルクラスです。<p>
 *
 * 製品出荷構成情報を照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBPA_ShipItmCompSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBPA0020";

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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_diameter_Label = null;
	/**
	 * Diameter 口径.<p>
	 *
	 */
	public MCTextField Cnd_diameter = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_chd_itm_p_PPanel;
	public MCTextField Cnd_chd_itm_cd;	// [Cnd]の[chd_itm_p.itm_cd]を[Cnd_chd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub1;	// [Cnd]の[chd_itm_p.itm_sub1]を[Cnd_chd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub2;	// [Cnd]の[chd_itm_p.itm_sub2]を[Cnd_chd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub3;	// [Cnd]の[chd_itm_p.itm_sub3]を[Cnd_chd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_nm;	// [Cnd]の[chd_itm_p.itm_nm]を[Cnd_chd_itm_nm]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBPA0020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_par_itm_p_PPanel;
	public MCColumnConfig columnRslt_par_itm_cd;// [Rslt]の[par_itm_p.itm_cd]を[columnRslt_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub1;// [Rslt]の[par_itm_p.itm_sub1]を[columnRslt_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub2;// [Rslt]の[par_itm_p.itm_sub2]を[columnRslt_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub3;// [Rslt]の[par_itm_p.itm_sub3]を[columnRslt_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_nm;// [Rslt]の[par_itm_p.itm_nm]を[columnRslt_par_itm_nm]としてエイリアス定義。
	/**
	 * Product quantity 測線数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_surv_line_qty = null;
	/**
	 * Diameter 口径.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diameter = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_chd_itm_p_PPanel;
	public MCColumnConfig columnRslt_chd_itm_cd;// [Rslt]の[chd_itm_p.itm_cd]を[columnRslt_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub1;// [Rslt]の[chd_itm_p.itm_sub1]を[columnRslt_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub2;// [Rslt]の[chd_itm_p.itm_sub2]を[columnRslt_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub3;// [Rslt]の[chd_itm_p.itm_sub3]を[columnRslt_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_nm;// [Rslt]の[chd_itm_p.itm_nm]を[columnRslt_chd_itm_nm]としてエイリアス定義。
	/**
	 * Item quantity 数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qty = null;
	/**
	 * Spec cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spec_cd = null;
	/**
	 * Body flag 本体ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_body_flg = null;
	/**
	 * Component flag 標準構成ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_comp_flg = null;
	/**
	 * Ship print flag 出荷帳票出力対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_prnt_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Apply 反映する.<p>
	 *
	 */
	public MCButton Btn_rgst = null;
	/** [NON_MOV]モードを表す定数 */
	public static final String NON_MOV = "NON_MOV";
	/** [STK_TRN]モードを表す定数 */
	public static final String STK_TRN = "STK_TRN";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{NON_MOV, STK_TRN};
	
	/** [MS_MSBBLA0020_Srch01]のCallerの作成 */
	protected MSBBPA_ShipItmCompSrch.MS_MSBBLA0020_Srch01Caller createMS_MSBBLA0020_Srch01() {
		MSBBPA_ShipItmCompSrch.MS_MSBBLA0020_Srch01Caller<MSBBPA_ShipItmCompSrch, MSBBPA_ShipItmCompSrch.MS_MSBBLA0020_Srch01Bridge>
		caller = ((MSBBPA_ShipItmCompSrch)this).new MS_MSBBLA0020_Srch01Caller<MSBBPA_ShipItmCompSrch, MSBBPA_ShipItmCompSrch.MS_MSBBLA0020_Srch01Bridge>(
					(MSBBPA_ShipItmCompSrch)this, ((MSBBPA_ShipItmCompSrch)this).new MS_MSBBLA0020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBLA0020_Srch01]の呼び出し */
	protected void callMS_MSBBLA0020_Srch01() {
		MCCaller caller = createMS_MSBBLA0020_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBPA0020.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBPA0020.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBPA0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBPA0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBPA0020.CndR createCndR() {
		return mcframe.clientMSBB.MSBBPA0020.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBPA0020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBPA0020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBPA0020.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBPA0020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBPA0020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBPA0020.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBPA_ShipItmCompSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBPA_ShipItmCompSrch_MC_A(String name) {
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
		MSBBPA_ShipItmCompSrch_MC.jbCreateTop((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateFold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateTab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateTab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateCnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateCnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateCtrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateRslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbCreateBtn((MSBBPA_ShipItmCompSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBPA_ShipItmCompSrch p) {
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
		p.Cnd_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().chd_itm_p());
		p.Cnd_chd_itm_p_PPanel.setName("Cnd.chd_itm_p");
		p.Cnd_chd_itm_cd = p.Cnd_chd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_chd_itm_cd.addAliasName("Cnd.chd_itm_cd", p);
		p.Cnd_chd_itm_sub1 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_chd_itm_sub1.addAliasName("Cnd.chd_itm_sub1", p);
		p.Cnd_chd_itm_sub2 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_chd_itm_sub2.addAliasName("Cnd.chd_itm_sub2", p);
		p.Cnd_chd_itm_sub3 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_chd_itm_sub3.addAliasName("Cnd.chd_itm_sub3", p);
		p.Cnd_chd_itm_nm = p.Cnd_chd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_chd_itm_nm.addAliasName("Cnd.chd_itm_nm", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBPA_ShipItmCompSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBPA_ShipItmCompSrch p) {
		p.Rslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBPA0020.RsltR.$par_itm_p);
		p.Rslt_par_itm_p_PPanel.setName("Rslt.par_itm_p");
		p.columnRslt_par_itm_cd = p.Rslt_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_par_itm_cd.addAliasName("Rslt.par_itm_cd", p);
		p.columnRslt_par_itm_sub1 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_par_itm_sub1.addAliasName("Rslt.par_itm_sub1", p);
		p.columnRslt_par_itm_sub2 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_par_itm_sub2.addAliasName("Rslt.par_itm_sub2", p);
		p.columnRslt_par_itm_sub3 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_par_itm_sub3.addAliasName("Rslt.par_itm_sub3", p);
		p.columnRslt_par_itm_nm = p.Rslt_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_par_itm_nm.addAliasName("Rslt.par_itm_nm", p);
		p.Rslt_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBPA0020.RsltR.$chd_itm_p);
		p.Rslt_chd_itm_p_PPanel.setName("Rslt.chd_itm_p");
		p.columnRslt_chd_itm_cd = p.Rslt_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_chd_itm_cd.addAliasName("Rslt.chd_itm_cd", p);
		p.columnRslt_chd_itm_sub1 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_chd_itm_sub1.addAliasName("Rslt.chd_itm_sub1", p);
		p.columnRslt_chd_itm_sub2 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_chd_itm_sub2.addAliasName("Rslt.chd_itm_sub2", p);
		p.columnRslt_chd_itm_sub3 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_chd_itm_sub3.addAliasName("Rslt.chd_itm_sub3", p);
		p.columnRslt_chd_itm_nm = p.Rslt_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_chd_itm_nm.addAliasName("Rslt.chd_itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBPA_ShipItmCompSrch p) {
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

	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub3, "chd_itm_sub3", "chd_itm_nm");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBPA_ShipItmCompSrch create(){
		MSBBPA_ShipItmCompSrch p = new MSBBPA_ShipItmCompSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBPA_ShipItmCompSrch create(String name){
		MSBBPA_ShipItmCompSrch p = new MSBBPA_ShipItmCompSrch(name);
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
		MSBBPA_ShipItmCompSrch_MC.jbfInitTop((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitFold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitTab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitTab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitCnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitCnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitCtrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitRslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbfInitBtn((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitTop((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitFold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitTab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitTab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitCnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitCnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitCtrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitRslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.jbInitBtn((MSBBPA_ShipItmCompSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbfInitTab1(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_diameter_Label = p.beansFactory.createLabel("Cnd.diameter_Label");
		p.Cnd_diameter = p.beansFactory.createTextField("Cnd.diameter");
		p.Cnd_diameter.setLabel(p.Cnd_diameter_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_surv_line_qty = p.beansFactory.createTableColumn("Rslt.surv_line_qty", MCColumnType.TEXT);
		p.columnRslt_diameter = p.beansFactory.createTableColumn("Rslt.diameter", MCColumnType.TEXT);
		p.columnRslt_qty = p.beansFactory.createTableColumn("Rslt.qty", MCColumnType.NUMBER);
		p.columnRslt_spec_cd = p.beansFactory.createTableColumn("Rslt.spec_cd", MCColumnType.TEXT);
		p.columnRslt_body_flg = p.beansFactory.createTableColumn("Rslt.body_flg", MCColumnType.CHECK);
		p.columnRslt_comp_flg = p.beansFactory.createTableColumn("Rslt.comp_flg", MCColumnType.CHECK);
		p.columnRslt_ship_prnt_flg = p.beansFactory.createTableColumn("Rslt.ship_prnt_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rgst = p.beansFactory.createButton("Btn.rgst");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
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
	protected static void jbInitFold(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbInitTab1(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbInitTab2(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbInitCnd(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_diameter);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_diameter_Label);
		p.CndPanel.add(p.Cnd_diameter);
		p.Cnd_diameter.setNextBeans(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_diameter.setRow(p.getCndR(), mcframe.clientMSBB.MSBBPA0020.CndR.diameter_META);
		p.CndPanel.add(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub1,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_chd_itm_nm);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_nm, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbInitRslt(MSBBPA_ShipItmCompSrch p) {
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
	protected static void jbInitBtn(MSBBPA_ShipItmCompSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_rgst);
		p.Btn_rgst.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_rgst);
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
		MSBBPA_ShipItmCompSrch_MC.mcInitTop((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitFold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitTab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitTab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitCnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitCnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitCtrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitRslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.mcInitBtn((MSBBPA_ShipItmCompSrch)this);

		// [NON_MOV]ステータスのモードの設定
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Top((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Fold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Tab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Tab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Cnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Cnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Ctrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Rslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitNON__MOV_Btn((MSBBPA_ShipItmCompSrch)this);

		// [STK_TRN]ステータスのモードの設定
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Top((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Fold((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Tab1((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Tab2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Cnd((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Cnd2((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Ctrl((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Rslt((MSBBPA_ShipItmCompSrch)this);
		MSBBPA_ShipItmCompSrch_MC.statusInitSTK__TRN_Btn((MSBBPA_ShipItmCompSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBPA_ShipItmCompSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBPA_ShipItmCompSrch p) {
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_diameter.setListListener(p);
		p.Cnd_diameter.addAllListener(p);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBBPA_ShipItmCompSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBPA_ShipItmCompSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBPA_ShipItmCompSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_surv_line_qty.addAllListener(p);
		p.columnRslt_surv_line_qty.setListListener(p);
		p.columnRslt_diameter.addAllListener(p);
		p.columnRslt_diameter.setListListener(p);
		p.columnRslt_qty.addAllListener(p);
		p.columnRslt_qty.setListListener(p);
		p.columnRslt_spec_cd.addAllListener(p);
		p.columnRslt_spec_cd.setListListener(p);
		p.columnRslt_body_flg.addAllListener(p);
		p.columnRslt_comp_flg.addAllListener(p);
		p.columnRslt_ship_prnt_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBPA_ShipItmCompSrch p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rgst.addAllListener(p);
		p.Btn_rgst.setAPMethodName("doBtn_rgst");
	}

	/**
	 * [NON_MOV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Top(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Fold(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Tab1(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Tab2(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Cnd(MSBBPA_ShipItmCompSrch p){
		p.Cnd_par_itm_p_PPanel.putStatus(NON_MOV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_p_PPanel.putStatus(NON_MOV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);

	}

	/**
	 * [NON_MOV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Cnd2(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Ctrl(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [NON_MOV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Rslt(MSBBPA_ShipItmCompSrch p){
		p.columnRslt_check.putMode(p, NON_MOV, MCMode.ENABLE);
		p.Rslt_par_itm_p_PPanel.putStatus(NON_MOV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_surv_line_qty.putMode(p, NON_MOV, MCMode.READ_ONLY);
		p.columnRslt_diameter.putMode(p, NON_MOV, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(NON_MOV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_qty.putMode(p, NON_MOV, MCMode.READ_ONLY);
		p.columnRslt_spec_cd.putMode(p, NON_MOV, MCMode.READ_ONLY);

	}

	/**
	 * [NON_MOV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitNON__MOV_Btn(MSBBPA_ShipItmCompSrch p){
		p.Btn_select_all.putMode(p, NON_MOV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, NON_MOV, MCMode.ENABLE);
		p.Btn_rgst.putMode(p, NON_MOV, MCMode.ENABLE);

	}

	/**
	 * [STK_TRN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Top(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Fold(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Tab1(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Tab2(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Cnd(MSBBPA_ShipItmCompSrch p){
		p.Cnd_par_itm_p_PPanel.putStatus(STK_TRN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_p_PPanel.putStatus(STK_TRN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);

	}

	/**
	 * [STK_TRN]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Cnd2(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Ctrl(MSBBPA_ShipItmCompSrch p){

	}

	/**
	 * [STK_TRN]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Rslt(MSBBPA_ShipItmCompSrch p){
		p.columnRslt_check.putMode(p, STK_TRN, MCMode.ENABLE);
		p.Rslt_par_itm_p_PPanel.putStatus(STK_TRN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_surv_line_qty.putMode(p, STK_TRN, MCMode.READ_ONLY);
		p.columnRslt_diameter.putMode(p, STK_TRN, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(STK_TRN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_qty.putMode(p, STK_TRN, MCMode.READ_ONLY);
		p.columnRslt_spec_cd.putMode(p, STK_TRN, MCMode.READ_ONLY);

	}

	/**
	 * [STK_TRN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSTK__TRN_Btn(MSBBPA_ShipItmCompSrch p){
		p.Btn_select_all.putMode(p, STK_TRN, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, STK_TRN, MCMode.ENABLE);
		p.Btn_rgst.putMode(p, STK_TRN, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return NON_MOV;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBPA_ShipItmCompSrch_MC.setTableConfigRslt((MSBBPA_ShipItmCompSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBPA_ShipItmCompSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addTable(p.Rslt_par_itm_p_PPanel.ItmTable);
		p.columnRslt_surv_line_qty.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.surv_line_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_surv_line_qty);
		p.columnRslt_diameter.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.diameter_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diameter);
		p.RsltTable.addTable(p.Rslt_chd_itm_p_PPanel.ItmTable);
		p.columnRslt_qty.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qty);
		p.columnRslt_spec_cd.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.spec_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spec_cd);
		p.columnRslt_body_flg.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.body_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_body_flg);
		p.columnRslt_comp_flg.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.comp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_comp_flg);
		p.columnRslt_ship_prnt_flg.setMeta(mcframe.clientMSBB.MSBBPA0020.RsltR.ship_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_prnt_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[NON_MOV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setNON_MOVStatus() {
		status = NON_MOV;
		setAllStatus(status);
	}

	/**
	 * この画面を[STK_TRN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSTK_TRNStatus() {
		status = STK_TRN;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (NON_MOV.equals(status)) {
			setNON_MOVStatus();
		}
		else if (STK_TRN.equals(status)) {
			setSTK_TRNStatus();
		}
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_cd) return getCnd_chd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub1) return getCnd_chd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub2) return getCnd_chd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub3) return getCnd_chd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rgst) doBtn_rgst(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rgst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rgst(MCEventInfo info);

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
		if (vc == Cnd_diameter) return doCnd_diameter_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_surv_line_qty) return doRslt_surv_line_qty_VC(info);
		if (vc == columnRslt_diameter) return doRslt_diameter_VC(info);
		if (vc == columnRslt_qty) return doRslt_qty_VC(info);
		if (vc == columnRslt_spec_cd) return doRslt_spec_cd_VC(info);
		if (vc == columnRslt_body_flg) return doRslt_body_flg_VC(info);
		if (vc == columnRslt_comp_flg) return doRslt_comp_flg_VC(info);
		if (vc == columnRslt_ship_prnt_flg) return doRslt_ship_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[diameter]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_diameter_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[surv_line_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_surv_line_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diameter]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diameter_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spec_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[body_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_body_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_diameter) doCnd_diameter_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_surv_line_qty) doRslt_surv_line_qty_NC(info);
		else if (nc == columnRslt_diameter) doRslt_diameter_NC(info);
		else if (nc == columnRslt_qty) doRslt_qty_NC(info);
		else if (nc == columnRslt_spec_cd) doRslt_spec_cd_NC(info);
		else if (nc == columnRslt_body_flg) doRslt_body_flg_NC(info);
		else if (nc == columnRslt_comp_flg) doRslt_comp_flg_NC(info);
		else if (nc == columnRslt_ship_prnt_flg) doRslt_ship_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[diameter]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_diameter_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[surv_line_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_surv_line_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diameter]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diameter_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spec_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[body_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_body_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_diameter) doCnd_diameter_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_surv_line_qty) doRslt_surv_line_qty_NE(info);
		else if (ne == columnRslt_diameter) doRslt_diameter_NE(info);
		else if (ne == columnRslt_qty) doRslt_qty_NE(info);
		else if (ne == columnRslt_spec_cd) doRslt_spec_cd_NE(info);
		else if (ne == columnRslt_body_flg) doRslt_body_flg_NE(info);
		else if (ne == columnRslt_comp_flg) doRslt_comp_flg_NE(info);
		else if (ne == columnRslt_ship_prnt_flg) doRslt_ship_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[diameter]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_diameter_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[surv_line_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_surv_line_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diameter]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diameter_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spec_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[body_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_body_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_diameter) doCnd_diameter_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_surv_line_qty) doRslt_surv_line_qty_NX(info);
		else if (nx == columnRslt_diameter) doRslt_diameter_NX(info);
		else if (nx == columnRslt_qty) doRslt_qty_NX(info);
		else if (nx == columnRslt_spec_cd) doRslt_spec_cd_NX(info);
		else if (nx == columnRslt_body_flg) doRslt_body_flg_NX(info);
		else if (nx == columnRslt_comp_flg) doRslt_comp_flg_NX(info);
		else if (nx == columnRslt_ship_prnt_flg) doRslt_ship_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[diameter]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_diameter_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[surv_line_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_surv_line_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diameter]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diameter_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spec_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[body_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_body_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_diameter) doCnd_diameter_LC(info);
		else if (lc == columnRslt_surv_line_qty) doRslt_surv_line_qty_LC(info);
		else if (lc == columnRslt_diameter) doRslt_diameter_LC(info);
		else if (lc == columnRslt_qty) doRslt_qty_LC(info);
		else if (lc == columnRslt_spec_cd) doRslt_spec_cd_LC(info);
	}

	/**
	 * [Cnd]パネルの[diameter]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_diameter_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[surv_line_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_surv_line_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diameter]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diameter_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spec_cd_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBLA0020.Srch01")) {
			return new MS_MSBBLA0020_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBLA0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBLA0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBLA0020_Srch01;

		/** コンストラクタ */
		protected MS_MSBBLA0020_Srch01Bridge() {
			p_MS_MSBBLA0020_Srch01 = new MCParam(PDef.MS_MSBBLA0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBLA0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBPA0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBPA0020.RsltR.class));

			p_MS_MSBBLA0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBLA0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBLA0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBLA0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBLA0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBPA0020.CndR up0() {
			return (mcframe.clientMSBB.MSBBPA0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBPA0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBPA0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBLA0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBPA0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBLA0020_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBPA0020.RsltR>)p_MS_MSBBLA0020_Srch01.getContainerParam().getDownBlock(0));
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