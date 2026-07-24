package mcframe.clientMGBG.MGBGP0140;

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
import mcframe.clientMGBG.MGBGP0140.MGBGP_PreAlcRateLst_MC.MG_MGBGL0140_Srch01Caller;

/**
 * 画面"MGBGP_PreAlcRateLst"パネルクラスです。<p>
 *
 * 期・年月別に一次配賦比率情報の登録状況を確認する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_PreAlcRateLst_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBGP0140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SrchType]ブロック関連のField定義
	public MCPanel SrchTypePanel = null;
	public MCTitledBorder SrchTypeTitledBorder = null;
	// [SrchType]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * TERM,Term,1;PLN,Plan,2;ACT,Result,3 TERM,期間,1;PLN,計画,2;ACT,実績,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_typ_Group = null;
	public MCRadioButton Cnd_srch_typ_TERM = null;
	public MCRadioButton Cnd_srch_typ_PLN = null;
	public MCRadioButton Cnd_srch_typ_ACT = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym;	// [Cnd]の[term_p.term_end_ym]を[Cnd_term_end_ym]としてエイリアス定義。
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym_to = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
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
	public MCLabel Cnd_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_rate_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBG.MGBGP0140.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Entry 登録.<p>
	 *
	 */
	public MCColumnConfig columnRslt_exist_flg = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Rslt_term_p_PPanel;
	public MCColumnConfig columnRslt_term;// [Rslt]の[term_p.term]を[columnRslt_term]としてエイリアス定義。
	public MCColumnConfig columnRslt_term_nm;// [Rslt]の[term_p.term_nm]を[columnRslt_term_nm]としてエイリアス定義。
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_nm = null;
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
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate_nm = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_ptn_nm = null;
	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln_mly_flg = null;
	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_mly_flg = null;
	/**
	 * Plan based 計画基準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln_rule_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Departmental alloc. fixed ratio entry 一次配賦期間比率登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBGP0110 = null;
	/**
	 * Departmental alloc. variable ratio entry 一次配賦月次比率登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBGP0120 = null;
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
	
	/** [MG_MGBGL0140_Srch01]のCallerの作成 */
	protected MGBGP_PreAlcRateLst_MC.MG_MGBGL0140_Srch01Caller createMG_MGBGL0140_Srch01() {
		MGBGP_PreAlcRateLst_MC.MG_MGBGL0140_Srch01Caller<MGBGP_PreAlcRateLst, MG_MGBGL0140_Srch01Bridge>
		caller = ((MGBGP_PreAlcRateLst_MC)this).new MG_MGBGL0140_Srch01Caller<MGBGP_PreAlcRateLst, MG_MGBGL0140_Srch01Bridge>(
					(MGBGP_PreAlcRateLst)this, new MG_MGBGL0140_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0140_Srch01]の呼び出し */
	protected void callMG_MGBGL0140_Srch01() {
		MCCaller caller = createMG_MGBGL0140_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0140.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0140.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0140.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0140.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBG.MGBGP0140.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0140.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBG.MGBGP0140.RsltR createRsltR() {
		return mcframe.clientMGBG.MGBGP0140.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0140.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0140.RsltR.class);
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
		ret.add(SrchTypePanel);
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateLst_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_PreAlcRateLst_MC_A(String name) {
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
		MGBGP_PreAlcRateLst_MC.jbCreateSrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbCreateTop((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbCreateCnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbCreateCtrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbCreateRslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbCreateBtn((MGBGP_PreAlcRateLst)this);
	}

	/**
	 * [SrchType]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchType(MGBGP_PreAlcRateLst p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_PreAlcRateLst p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_PreAlcRateLst p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_end_ym = p.Cnd_term_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym.addAliasName("Cnd.term_end_ym", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_PreAlcRateLst p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBGP_PreAlcRateLst p) {
		p.Rslt_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBG.MGBGP0140.RsltR.$term_p);
		p.Rslt_term_p_PPanel.setName("Rslt.term_p");
		p.columnRslt_term = p.Rslt_term_p_PPanel.columnTerm_term;
		p.columnRslt_term.addAliasName("Rslt.term", p);
		p.columnRslt_term_nm = p.Rslt_term_p_PPanel.columnTerm_term_nm;
		p.columnRslt_term_nm.addAliasName("Rslt.term_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBGP_PreAlcRateLst p) {
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

	
	/** [Cnd_ym_fr_ListPutter]の定義 */
	private MCListPutter Cnd_ym_fr_p = null;

	/**
	 * [Cnd_ym_fr_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_fr_ListPutter() {
		if (Cnd_ym_fr_p == null) {
			Cnd_ym_fr_p = createCnd_ym_fr_ListPutter(Cnd_ym_fr, "ym_fr");

		}
		return Cnd_ym_fr_p;
	}
	
	
	/** [Cnd_ym_to_ListPutter]の定義 */
	private MCListPutter Cnd_ym_to_p = null;

	/**
	 * [Cnd_ym_to_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_to_ListPutter() {
		if (Cnd_ym_to_p == null) {
			Cnd_ym_to_p = createCnd_ym_to_ListPutter(Cnd_ym_to, "ym_to");

		}
		return Cnd_ym_to_p;
	}
	
	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
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
	
	
	/** [Cnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_rate_cd_p = null;

	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_rate_cd_ListPutter() {
		if (Cnd_pre_alc_rate_cd_p == null) {
			Cnd_pre_alc_rate_cd_p = createCnd_pre_alc_rate_cd_ListPutter(Cnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm");

		}
		return Cnd_pre_alc_rate_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateLst create(){
		MGBGP_PreAlcRateLst p = new MGBGP_PreAlcRateLst();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateLst create(String name){
		MGBGP_PreAlcRateLst p = new MGBGP_PreAlcRateLst(name);
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
		MGBGP_PreAlcRateLst_MC.jbfInitSrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbfInitTop((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbfInitCnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbfInitCtrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbfInitRslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbfInitBtn((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitSrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitTop((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitCnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitCtrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitRslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.jbInitBtn((MGBGP_PreAlcRateLst)this);
	}

	/**
	 * [SrchType]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchType(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.SrchTypePanel = p.beansFactory.createPanel("SrchType");
		p.SrchTypeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_srch_typ_Group = p.beansFactory.createButtonGroup("Cnd.srch_typ");
		p.Cnd_srch_typ_TERM = p.beansFactory.createRadioButton("Cnd.srch_typ_TERM");
		p.Cnd_srch_typ_PLN = p.beansFactory.createRadioButton("Cnd.srch_typ_PLN");
		p.Cnd_srch_typ_ACT = p.beansFactory.createRadioButton("Cnd.srch_typ_ACT");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateComboBox("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateComboBox("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_rate_cd_Label");
		p.Cnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_rate_cd");
		p.Cnd_pre_alc_rate_cd.setLabel(p.Cnd_pre_alc_rate_cd_Label);
		p.Cnd_pre_alc_rate_nm = p.beansFactory.createTextField("Cnd.pre_alc_rate_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_exist_flg = p.beansFactory.createTableColumn("Rslt.exist_flg", MCColumnType.CHECK);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT);
		p.columnRslt_calc_ctg_nm = p.beansFactory.createTableColumn("Rslt.calc_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_pre_alc_rate_cd = p.beansFactory.createTableColumn("Rslt.pre_alc_rate_cd", MCColumnType.TEXT);
		p.columnRslt_pre_alc_rate_nm = p.beansFactory.createTableColumn("Rslt.pre_alc_rate_nm", MCColumnType.TEXT);
		p.columnRslt_pre_alc_ptn_cd = p.beansFactory.createTableColumn("Rslt.pre_alc_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_pre_alc_ptn_nm = p.beansFactory.createTableColumn("Rslt.pre_alc_ptn_nm", MCColumnType.TEXT);
		p.columnRslt_pln_mly_flg = p.beansFactory.createTableColumn("Rslt.pln_mly_flg", MCColumnType.CHECK);
		p.columnRslt_act_mly_flg = p.beansFactory.createTableColumn("Rslt.act_mly_flg", MCColumnType.CHECK);
		p.columnRslt_pln_rule_flg = p.beansFactory.createTableColumn("Rslt.pln_rule_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0110 = p.beansFactory.createButton("Btn.open_MGBGP0110", "open");
		p.Btn_open_MGBGP0120 = p.beansFactory.createButton("Btn.open_MGBGP0120", "open");
	}

	/**
	 * [SrchType]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchType(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.SrchTypePanel.setBorder(p.SrchTypeTitledBorder);
		p.add(p.SrchTypePanel);
		p.setLastBeans(p.SrchTypePanel);
		p.SrchTypePanel.setNextBeans(p.TopPanel);
		p.SrchTypePanel.setValueCheck(false);
		p.SrchTypePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchTypePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.SrchTypePanel.setLastBeans(p.Cnd_srch_typ_Group);
		p.Cnd_srch_typ_Group.setFirstBeans(p.Cnd_srch_typ_TERM);
		p.Cnd_srch_typ_TERM.setActionCommand("1");
		p.Cnd_srch_typ_Group.add(p.Cnd_srch_typ_TERM);
		p.SrchTypePanel.add(p.Cnd_srch_typ_TERM);
		p.Cnd_srch_typ_TERM.setNextBeans(p.Cnd_srch_typ_PLN);
		p.Cnd_srch_typ_PLN.setActionCommand("2");
		p.Cnd_srch_typ_Group.add(p.Cnd_srch_typ_PLN);
		p.SrchTypePanel.add(p.Cnd_srch_typ_PLN);
		p.Cnd_srch_typ_PLN.setNextBeans(p.Cnd_srch_typ_ACT);
		p.Cnd_srch_typ_ACT.setActionCommand("3");
		p.Cnd_srch_typ_Group.add(p.Cnd_srch_typ_ACT);
		p.SrchTypePanel.add(p.Cnd_srch_typ_ACT);
		p.Cnd_srch_typ_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.srch_typ_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_ym_fr.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_ym_to.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_pre_alc_rate_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_cd, true);
		p.Cnd_pre_alc_rate_cd.setLinkBeans(p.Cnd_pre_alc_rate_nm);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd);
		p.Cnd_pre_alc_rate_cd.setNextBeans(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.pre_alc_rate_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0140.CndR.pre_alc_rate_nm_META);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_PreAlcRateLst p) {
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
	protected static void jbInitRslt(MGBGP_PreAlcRateLst p) {
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
	protected static void jbInitBtn(MGBGP_PreAlcRateLst p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBGP0110);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBGP0110);
		p.Btn_open_MGBGP0110.setNextBeans(p.Btn_open_MGBGP0120);
		p.Btn_open_MGBGP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBGP0120);
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
		MGBGP_PreAlcRateLst_MC.mcInitSrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.mcInitTop((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.mcInitCnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.mcInitCtrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.mcInitRslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.mcInitBtn((MGBGP_PreAlcRateLst)this);

		// [SRCH]ステータスのモードの設定
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_SrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_Top((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_Cnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_Ctrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_Rslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitSRCH_Btn((MGBGP_PreAlcRateLst)this);

		// [REF]ステータスのモードの設定
		MGBGP_PreAlcRateLst_MC.statusInitREF_SrchType((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitREF_Top((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitREF_Cnd((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitREF_Ctrl((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitREF_Rslt((MGBGP_PreAlcRateLst)this);
		MGBGP_PreAlcRateLst_MC.statusInitREF_Btn((MGBGP_PreAlcRateLst)this);

	}

	/**
	 *  [SrchType]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchType(MGBGP_PreAlcRateLst p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_PreAlcRateLst p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_PreAlcRateLst p) {
		p.Cnd_srch_typ_Group.addAllListener(p);
		p.Cnd_srch_typ_TERM.addAllListener(p);
		p.Cnd_srch_typ_PLN.addAllListener(p);
		p.Cnd_srch_typ_ACT.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_pre_alc_rate_cd.setListListener(p);
		p.Cnd_pre_alc_rate_cd.addAllListener(p);
		p.Cnd_pre_alc_rate_nm.setListListener(p);
		p.Cnd_pre_alc_rate_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_PreAlcRateLst p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBGP_PreAlcRateLst p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_exist_flg.addAllListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_calc_ctg_nm.addAllListener(p);
		p.columnRslt_calc_ctg_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_pre_alc_rate_cd.addAllListener(p);
		p.columnRslt_pre_alc_rate_cd.setListListener(p);
		p.columnRslt_pre_alc_rate_nm.addAllListener(p);
		p.columnRslt_pre_alc_rate_nm.setListListener(p);
		p.columnRslt_pre_alc_ptn_cd.addAllListener(p);
		p.columnRslt_pre_alc_ptn_cd.setListListener(p);
		p.columnRslt_pre_alc_ptn_nm.addAllListener(p);
		p.columnRslt_pre_alc_ptn_nm.setListListener(p);
		p.columnRslt_pln_mly_flg.addAllListener(p);
		p.columnRslt_act_mly_flg.addAllListener(p);
		p.columnRslt_pln_rule_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBGP_PreAlcRateLst p) {
		p.Btn_open_MGBGP0110.addAllListener(p);
		p.Btn_open_MGBGP0110.setAPMethodName("doBtn_open_MGBGP0110");
		p.Btn_open_MGBGP0120.addAllListener(p);
		p.Btn_open_MGBGP0120.setAPMethodName("doBtn_open_MGBGP0120");
	}

	/**
	 * [SRCH]ステータスの[SrchType]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchType(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBGP_PreAlcRateLst p){
		p.Cnd_srch_typ_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_term_p_PPanel.Term_term_end_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBGP_PreAlcRateLst p){
		p.columnRslt_exist_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln_mly_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_mly_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln_rule_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBGP_PreAlcRateLst p){
		p.Btn_open_MGBGP0110.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[SrchType]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchType(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBGP_PreAlcRateLst p){
		p.Cnd_srch_typ_Group.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_term_p_PPanel.Term_term_end_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBGP_PreAlcRateLst p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBGP_PreAlcRateLst p){
		p.columnRslt_exist_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln_mly_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_mly_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln_rule_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBGP_PreAlcRateLst p){
		p.Btn_open_MGBGP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, REF, MCMode.ENABLE);

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
		MGBGP_PreAlcRateLst_MC.setTableConfigRslt((MGBGP_PreAlcRateLst)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBGP_PreAlcRateLst p) {
		p.columnRslt_exist_flg.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.exist_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_exist_flg);
		p.RsltTable.addTable(p.Rslt_term_p_PPanel.TermTable);
		p.columnRslt_ym.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.calc_ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_pre_alc_rate_cd.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pre_alc_rate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate_cd);
		p.columnRslt_pre_alc_rate_nm.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pre_alc_rate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate_nm);
		p.columnRslt_pre_alc_ptn_cd.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pre_alc_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_ptn_cd);
		p.columnRslt_pre_alc_ptn_nm.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pre_alc_ptn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_ptn_nm);
		p.columnRslt_pln_mly_flg.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pln_mly_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln_mly_flg);
		p.columnRslt_act_mly_flg.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.act_mly_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_mly_flg);
		p.columnRslt_pln_rule_flg.setMeta(mcframe.clientMGBG.MGBGP0140.RsltR.pln_rule_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln_rule_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ym_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym_fr.getListConfig().setPutter(getCnd_ym_fr_ListPutter());
		Cnd_ym_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym_to.getListConfig().setPutter(getCnd_ym_to_ListPutter());
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_rate_cd.getListConfig().setPutter(getCnd_pre_alc_rate_cd_ListPutter());
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
	 * [Cnd_ym_fr_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_ym_to_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcRateNotPreAlcPtn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ym_fr) return getCnd_ym_fr(row, info);
		if(combo == Cnd_ym_to) return getCnd_ym_to(row, info);
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_pre_alc_rate_cd) return getCnd_pre_alc_rate_cd(row, info);
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
		else if (ap == Btn_open_MGBGP0110) doBtn_open_MGBGP0110(info);
		else if (ap == Btn_open_MGBGP0120) doBtn_open_MGBGP0120(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBGP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBGP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBGP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBGP0120(MCEventInfo info);

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
		if (vc == Cnd_srch_typ_Group) return doCnd_srch_typ_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_pre_alc_rate_cd) return doCnd_pre_alc_rate_cd_VC(info);
		if (vc == Cnd_pre_alc_rate_nm) return doCnd_pre_alc_rate_nm_VC(info);
		if (vc == columnRslt_exist_flg) return doRslt_exist_flg_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_pre_alc_rate_cd) return doRslt_pre_alc_rate_cd_VC(info);
		if (vc == columnRslt_pre_alc_rate_nm) return doRslt_pre_alc_rate_nm_VC(info);
		if (vc == columnRslt_pre_alc_ptn_cd) return doRslt_pre_alc_ptn_cd_VC(info);
		if (vc == columnRslt_pre_alc_ptn_nm) return doRslt_pre_alc_ptn_nm_VC(info);
		if (vc == columnRslt_pln_mly_flg) return doRslt_pln_mly_flg_VC(info);
		if (vc == columnRslt_act_mly_flg) return doRslt_act_mly_flg_VC(info);
		if (vc == columnRslt_pln_rule_flg) return doRslt_pln_rule_flg_VC(info);
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
	 * [Cnd]パネルの[srch_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_typ_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_exist_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln_mly_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln_mly_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_mly_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_mly_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln_rule_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln_rule_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_typ_Group) doCnd_srch_typ_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NC(info);
		else if (nc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NC(info);
		else if (nc == columnRslt_exist_flg) doRslt_exist_flg_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NC(info);
		else if (nc == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NC(info);
		else if (nc == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NC(info);
		else if (nc == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NC(info);
		else if (nc == columnRslt_pln_mly_flg) doRslt_pln_mly_flg_NC(info);
		else if (nc == columnRslt_act_mly_flg) doRslt_act_mly_flg_NC(info);
		else if (nc == columnRslt_pln_rule_flg) doRslt_pln_rule_flg_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_typ_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_mly_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_mly_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_mly_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_mly_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_rule_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_rule_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_typ_Group) doCnd_srch_typ_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NE(info);
		else if (ne == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NE(info);
		else if (ne == columnRslt_exist_flg) doRslt_exist_flg_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NE(info);
		else if (ne == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NE(info);
		else if (ne == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NE(info);
		else if (ne == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NE(info);
		else if (ne == columnRslt_pln_mly_flg) doRslt_pln_mly_flg_NE(info);
		else if (ne == columnRslt_act_mly_flg) doRslt_act_mly_flg_NE(info);
		else if (ne == columnRslt_pln_rule_flg) doRslt_pln_rule_flg_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_typ_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_mly_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_mly_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_mly_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_mly_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_rule_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_rule_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_typ_Group) doCnd_srch_typ_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NX(info);
		else if (nx == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NX(info);
		else if (nx == columnRslt_exist_flg) doRslt_exist_flg_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NX(info);
		else if (nx == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NX(info);
		else if (nx == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NX(info);
		else if (nx == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NX(info);
		else if (nx == columnRslt_pln_mly_flg) doRslt_pln_mly_flg_NX(info);
		else if (nx == columnRslt_act_mly_flg) doRslt_act_mly_flg_NX(info);
		else if (nx == columnRslt_pln_rule_flg) doRslt_pln_rule_flg_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_typ_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_mly_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_mly_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_mly_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_mly_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln_rule_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln_rule_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_LC(info);
		else if (lc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_LC(info);
		else if (lc == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_LC(info);
		else if (lc == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_LC(info);
		else if (lc == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_LC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym_fr]の作成メソッド
	 */
	public MCList getCnd_ym_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym_to]の作成メソッド
	 */
	public MCList getCnd_ym_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcRateNotPreAlcPtn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0140.Srch01")) {
			return new MG_MGBGL0140_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0140_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0140_Srch01Bridge() {
			p_MG_MGBGL0140_Srch01 = new MCParam(PDef.MG_MGBGL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0140.RsltR.class));

			p_MG_MGBGL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0140.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0140.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0140.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0140_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0140.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0140_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0140.RsltR>)p_MG_MGBGL0140_Srch01.getContainerParam().getDownBlock(0));
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