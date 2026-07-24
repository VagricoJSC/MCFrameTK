package mcframe.clientMABC.MABCP2110;

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
import mcframe.clientMABC.MABCP2110.MABCP_CtgConfigSrch_MC.MA_MABCL2110_Srch01Caller;

/**
 * 画面"MABCP_CtgConfigSrch"パネルクラスです。<p>
 *
 * 原価品群構成マスタの検索を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_CtgConfigSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP2110";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_EX1 = null;
	public MCRadioButton Cnd_ope_EX2 = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCTextField Cnd_term_nm;	// [Cnd]の[term_p.term_nm]を[Cnd_term_nm]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rpnl]ブロック関連のField定義
	public MCPanel RpnlPanel = null;
	// [Rpnl]ブロックの項目のField定義
	/**
	 * Explode all 全展開する.<p>
	 *
	 */
	public MCButton Rpnl_srch_all = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP2110.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Dtl_hrrchy_p_PPanel;
	public MCColumnConfig columnDtl_par_extno;// [Dtl]の[hrrchy_p.par_extno]を[columnDtl_par_extno]としてエイリアス定義。
	public MCColumnConfig columnDtl_loop_flg;// [Dtl]の[hrrchy_p.loop_flg]を[columnDtl_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_leaf_str;// [Dtl]の[hrrchy_p.leaf_str]を[columnDtl_leaf_str]としてエイリアス定義。
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	
	/** [MA_MABCL2110_Srch01]のCallerの作成 */
	protected MABCP_CtgConfigSrch_MC.MA_MABCL2110_Srch01Caller createMA_MABCL2110_Srch01() {
		MABCP_CtgConfigSrch_MC.MA_MABCL2110_Srch01Caller<MABCP_CtgConfigSrch, MA_MABCL2110_Srch01Bridge>
		caller = ((MABCP_CtgConfigSrch_MC)this).new MA_MABCL2110_Srch01Caller<MABCP_CtgConfigSrch, MA_MABCL2110_Srch01Bridge>(
					(MABCP_CtgConfigSrch)this, new MA_MABCL2110_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL2110_Srch01]の呼び出し */
	protected void callMA_MABCL2110_Srch01() {
		MCCaller caller = createMA_MABCL2110_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP2110.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP2110.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP2110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP2110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP2110.CndR createCndR() {
		return mcframe.clientMABC.MABCP2110.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP2110.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP2110.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP2110.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP2110.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP2110.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP2110.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
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
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RpnlPanel);
		ret.add(DtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CtgConfigSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_CtgConfigSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_CtgConfigSrch_MC.jbCreateScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateTop((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateFold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateCnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateCtrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateRpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbCreateDtl((MABCP_CtgConfigSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_CtgConfigSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_CtgConfigSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_CtgConfigSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_CtgConfigSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_nm = p.Cnd_term_p_PPanel.Term_term_nm;
		p.Cnd_term_nm.addAliasName("Cnd.term_nm", p);
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_CtgConfigSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rpnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRpnl(MABCP_CtgConfigSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_CtgConfigSrch p) {
		p.Dtl_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMABC.MABCP2110.DtlR.$hrrchy_p);
		p.Dtl_hrrchy_p_PPanel.setName("Dtl.hrrchy_p");
		p.columnDtl_par_extno = p.Dtl_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnDtl_par_extno.addAliasName("Dtl.par_extno", p);
		p.columnDtl_loop_flg = p.Dtl_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnDtl_loop_flg.addAliasName("Dtl.loop_flg", p);
		p.columnDtl_leaf_str = p.Dtl_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnDtl_leaf_str.addAliasName("Dtl.leaf_str", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP2110.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CtgConfigSrch create(){
		MABCP_CtgConfigSrch p = new MABCP_CtgConfigSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CtgConfigSrch create(String name){
		MABCP_CtgConfigSrch p = new MABCP_CtgConfigSrch(name);
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
		MABCP_CtgConfigSrch_MC.jbfInitScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitTop((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitFold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitCnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitCtrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitRpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbfInitDtl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitTop((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitFold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitCnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitCtrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitRpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.jbInitDtl((MABCP_CtgConfigSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_EX1 = p.beansFactory.createRadioButton("Cnd.ope_EX1");
		p.Cnd_ope_EX2 = p.beansFactory.createRadioButton("Cnd.ope_EX2");
		p.Cnd_ctg_cd_Label = p.beansFactory.createLabel("Cnd.ctg_cd_Label");
		p.Cnd_ctg_cd = p.beansFactory.createTextComboBox("Cnd.ctg_cd");
		p.Cnd_ctg_cd.setLabel(p.Cnd_ctg_cd_Label);
		p.Cnd_ctg_nm = p.beansFactory.createTextField("Cnd.ctg_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rpnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRpnl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.RpnlPanel = p.beansFactory.createPanel("Rpnl");
		// ブロックの項目の初期化
		p.Rpnl_srch_all = p.beansFactory.createButton("Rpnl.srch_all", "srch");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_ctg_cd = p.beansFactory.createTableColumn("Dtl.ctg_cd", MCColumnType.TEXT);
		p.columnDtl_ctg_nm = p.beansFactory.createTableColumn("Dtl.ctg_nm", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_CtgConfigSrch p) {
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
	protected static void jbInitTop(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
		p.CtrlPanel.setNextBeans(p.RpnlPanel);
		p.TopPanel.add(p.RpnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX1);
		p.ScreenOpePanel.add(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setNextBeans(p.Cnd_ope_EX2);
		p.Cnd_ope_EX2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX2);
		p.ScreenOpePanel.add(p.Cnd_ope_EX2);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP2110.CndR.ope_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.CndPanel.add(p.Cnd_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP2110.CndR.ctg_cd_META);
		p.CndPanel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP2110.CndR.ctg_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rpnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRpnl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.RpnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.Rpnl_srch_all.setIcon("SEARCH");
		p.Rpnl_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.RpnlPanel.add(p.Rpnl_srch_all);
		p.RpnlPanel.setLastBeans(p.Rpnl_srch_all);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_CtgConfigSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
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
		MABCP_CtgConfigSrch_MC.mcInitScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitTop((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitFold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitCnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitCtrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitRpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.mcInitDtl((MABCP_CtgConfigSrch)this);

		// [SRCH]ステータスのモードの設定
		MABCP_CtgConfigSrch_MC.statusInitSRCH_ScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Top((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Fold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Cnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Ctrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Rpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitSRCH_Dtl((MABCP_CtgConfigSrch)this);

		// [REF]ステータスのモードの設定
		MABCP_CtgConfigSrch_MC.statusInitREF_ScreenOpe((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Top((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Fold((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Cnd((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Ctrl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Rpnl((MABCP_CtgConfigSrch)this);
		MABCP_CtgConfigSrch_MC.statusInitREF_Dtl((MABCP_CtgConfigSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_CtgConfigSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_CtgConfigSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_CtgConfigSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_CtgConfigSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_EX1.addAllListener(p);
		p.Cnd_ope_EX2.addAllListener(p);
		p.Cnd_ctg_cd.setListListener(p);
		p.Cnd_ctg_cd.addAllListener(p);
		p.Cnd_ctg_nm.setListListener(p);
		p.Cnd_ctg_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_CtgConfigSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rpnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRpnl(MABCP_CtgConfigSrch p) {
		p.Rpnl_srch_all.addAllListener(p);
		p.Rpnl_srch_all.setAPMethodName("doRpnl_srch_all");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_CtgConfigSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_ctg_cd.addAllListener(p);
		p.columnDtl_ctg_cd.setListListener(p);
		p.columnDtl_ctg_nm.addAllListener(p);
		p.columnDtl_ctg_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABCP_CtgConfigSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABCP_CtgConfigSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABCP_CtgConfigSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_CtgConfigSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABCP_CtgConfigSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rpnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rpnl(MABCP_CtgConfigSrch p){
		p.Rpnl_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABCP_CtgConfigSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.columnDtl_ctg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_CtgConfigSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_CtgConfigSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_CtgConfigSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_CtgConfigSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_CtgConfigSrch p){

	}

	/**
	 * [REF]ステータスの[Rpnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rpnl(MABCP_CtgConfigSrch p){
		p.Rpnl_srch_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_CtgConfigSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.columnDtl_ctg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);

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
		MABCP_CtgConfigSrch_MC.setTableConfigDtl((MABCP_CtgConfigSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_CtgConfigSrch p) {
		p.DtlTable.addTable(p.Dtl_hrrchy_p_PPanel.HrrchyTable);
		p.columnDtl_ctg_cd.setMeta(mcframe.clientMABC.MABCP2110.DtlR.ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_cd);
		p.columnDtl_ctg_nm.setMeta(mcframe.clientMABC.MABCP2110.DtlR.ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_leaf_str);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ctg_cd.getListConfig().setPutter(getCnd_ctg_cd_ListPutter());
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
	 * [Cnd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
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
		else if (ap == Rpnl_srch_all) doRpnl_srch_all(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Rpnl]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRpnl_srch_all(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ctg_cd) return doCnd_ctg_cd_VC(info);
		if (vc == Cnd_ctg_nm) return doCnd_ctg_nm_VC(info);
		if (vc == columnDtl_ctg_cd) return doDtl_ctg_cd_VC(info);
		if (vc == columnDtl_ctg_nm) return doDtl_ctg_nm_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_nm_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ctg_cd) doCnd_ctg_cd_NC(info);
		else if (nc == Cnd_ctg_nm) doCnd_ctg_nm_NC(info);
		else if (nc == columnDtl_ctg_cd) doDtl_ctg_cd_NC(info);
		else if (nc == columnDtl_ctg_nm) doDtl_ctg_nm_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ctg_cd) doCnd_ctg_cd_NE(info);
		else if (ne == Cnd_ctg_nm) doCnd_ctg_nm_NE(info);
		else if (ne == columnDtl_ctg_cd) doDtl_ctg_cd_NE(info);
		else if (ne == columnDtl_ctg_nm) doDtl_ctg_nm_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ctg_cd) doCnd_ctg_cd_NX(info);
		else if (nx == Cnd_ctg_nm) doCnd_ctg_nm_NX(info);
		else if (nx == columnDtl_ctg_cd) doDtl_ctg_cd_NX(info);
		else if (nx == columnDtl_ctg_nm) doDtl_ctg_nm_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ctg_cd) doCnd_ctg_cd_LC(info);
		else if (lc == Cnd_ctg_nm) doCnd_ctg_nm_LC(info);
		else if (lc == columnDtl_ctg_cd) doDtl_ctg_cd_LC(info);
		else if (lc == columnDtl_ctg_nm) doDtl_ctg_nm_LC(info);
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
	 * [Dtl]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL2110.Srch01")) {
			return new MA_MABCL2110_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL2110_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL2110_Srch01;

		/** コンストラクタ */
		protected MA_MABCL2110_Srch01Bridge() {
			p_MA_MABCL2110_Srch01 = new MCParam(PDef.MA_MABCL2110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL2110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP2110.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP2110.DtlR.class));

			p_MA_MABCL2110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL2110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL2110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL2110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL2110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP2110.CndR up0() {
			return (mcframe.clientMABC.MABCP2110.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP2110.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP2110.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL2110_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP2110.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL2110_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP2110.DtlR>)p_MA_MABCL2110_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}