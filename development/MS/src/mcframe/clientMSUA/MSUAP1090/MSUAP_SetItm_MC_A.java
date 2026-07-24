package mcframe.clientMSUA.MSUAP1090;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSUA.MSUAP1090.MSUAP_SetItm_MC.MS_MSUAL1090_Srch01Caller;

/**
 * 画面"MSUAP_SetItm"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_SetItm_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUAP1090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_main_itm_p_PPanel;
	public MCTextField Cnd_main_itm_cd;	// [Cnd]の[main_itm_p.itm_cd]を[Cnd_main_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub1;	// [Cnd]の[main_itm_p.itm_sub1]を[Cnd_main_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub2;	// [Cnd]の[main_itm_p.itm_sub2]を[Cnd_main_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub3;	// [Cnd]の[main_itm_p.itm_sub3]を[Cnd_main_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_main_itm_nm;	// [Cnd]の[main_itm_p.itm_nm]を[Cnd_main_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_main_itm_unit_cd_Label = null;
	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_main_itm_unit_cd = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_dec_place = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Cnd_main_itm_qty_p_PPanel;
	public MCNumberField Cnd_main_itm_qty;	// [Cnd]の[main_itm_qty_p.qty]を[Cnd_main_itm_qty]としてエイリアス定義。
	public MCLabel Cnd_set_grp_cd_Label = null;
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_set_grp_cd = null;
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public MCTextField Cnd_set_grp_nm = null;
	public MCLabel Cnd_base_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_base_dt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSUA.MSUAP1090.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_grp_cd = null;
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_set_itm_p_PPanel;
	public MCColumnConfig columnRslt_set_itm_cd;// [Rslt]の[set_itm_p.itm_cd]を[columnRslt_set_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_set_itm_sub1;// [Rslt]の[set_itm_p.itm_sub1]を[columnRslt_set_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_set_itm_sub2;// [Rslt]の[set_itm_p.itm_sub2]を[columnRslt_set_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_set_itm_sub3;// [Rslt]の[set_itm_p.itm_sub3]を[columnRslt_set_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_set_itm_nm;// [Rslt]の[set_itm_p.itm_nm]を[columnRslt_set_itm_nm]としてエイリアス定義。
	/**
	 * Assortment shipment 出荷品揃.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_assort_flg = null;
	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_itm_unit_cd = null;
	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_itm_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_qty;// [Rslt]の[qty_p.qty]を[columnRslt_qty]としてエイリアス定義。
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_dt = null;
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
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSUAL1090_Srch01]のCallerの作成 */
	protected MSUAP_SetItm_MC.MS_MSUAL1090_Srch01Caller createMS_MSUAL1090_Srch01() {
		MSUAP_SetItm_MC.MS_MSUAL1090_Srch01Caller<MSUAP_SetItm, MS_MSUAL1090_Srch01Bridge>
		caller = ((MSUAP_SetItm_MC)this).new MS_MSUAL1090_Srch01Caller<MSUAP_SetItm, MS_MSUAL1090_Srch01Bridge>(
					(MSUAP_SetItm)this, new MS_MSUAL1090_Srch01Bridge());
		return caller;
	}
	/** [MS_MSUAL1090_Srch01]の呼び出し */
	protected void callMS_MSUAL1090_Srch01() {
		MCCaller caller = createMS_MSUAL1090_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSUA.MSUAP1090.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1090.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1090.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1090.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1090.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1090.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1090.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1090.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1090.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1090.RsltR.class);
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
		ret.add(CndPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_SetItm_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_SetItm_MC_A(String name) {
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
		MSUAP_SetItm_MC.jbCreateCnd((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbCreateRslt((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbCreateBtn((MSUAP_SetItm)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_SetItm p) {
		p.Cnd_main_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().main_itm_p());
		p.Cnd_main_itm_p_PPanel.setName("Cnd.main_itm_p");
		p.Cnd_main_itm_cd = p.Cnd_main_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_main_itm_cd.addAliasName("Cnd.main_itm_cd", p);
		p.Cnd_main_itm_sub1 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_main_itm_sub1.addAliasName("Cnd.main_itm_sub1", p);
		p.Cnd_main_itm_sub2 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_main_itm_sub2.addAliasName("Cnd.main_itm_sub2", p);
		p.Cnd_main_itm_sub3 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_main_itm_sub3.addAliasName("Cnd.main_itm_sub3", p);
		p.Cnd_main_itm_nm = p.Cnd_main_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_main_itm_nm.addAliasName("Cnd.main_itm_nm", p);
		p.Cnd_main_itm_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getCndR().main_itm_qty_p());
		p.Cnd_main_itm_qty_p_PPanel.setName("Cnd.main_itm_qty_p");
		p.Cnd_main_itm_qty = p.Cnd_main_itm_qty_p_PPanel.Qty_qty;
		p.Cnd_main_itm_qty.addAliasName("Cnd.main_itm_qty", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_SetItm p) {
		p.Rslt_set_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSUA.MSUAP1090.RsltR.$set_itm_p);
		p.Rslt_set_itm_p_PPanel.setName("Rslt.set_itm_p");
		p.columnRslt_set_itm_cd = p.Rslt_set_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_set_itm_cd.addAliasName("Rslt.set_itm_cd", p);
		p.columnRslt_set_itm_sub1 = p.Rslt_set_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_set_itm_sub1.addAliasName("Rslt.set_itm_sub1", p);
		p.columnRslt_set_itm_sub2 = p.Rslt_set_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_set_itm_sub2.addAliasName("Rslt.set_itm_sub2", p);
		p.columnRslt_set_itm_sub3 = p.Rslt_set_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_set_itm_sub3.addAliasName("Rslt.set_itm_sub3", p);
		p.columnRslt_set_itm_nm = p.Rslt_set_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_set_itm_nm.addAliasName("Rslt.set_itm_nm", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSUA.MSUAP1090.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_qty.addAliasName("Rslt.qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_SetItm p) {
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

	
	/** [Cnd_set_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_set_grp_cd_p = null;

	/**
	 * [Cnd_set_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_grp_cd_ListPutter() {
		if (Cnd_set_grp_cd_p == null) {
			Cnd_set_grp_cd_p = createCnd_set_grp_cd_ListPutter(Cnd_set_grp_cd, "set_grp_cd", "set_grp_nm");

		}
		return Cnd_set_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_SetItm create(){
		MSUAP_SetItm p = new MSUAP_SetItm();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_SetItm create(String name){
		MSUAP_SetItm p = new MSUAP_SetItm(name);
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
		MSUAP_SetItm_MC.jbfInitCnd((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbfInitRslt((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbfInitBtn((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbInitCnd((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbInitRslt((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.jbInitBtn((MSUAP_SetItm)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_main_itm_unit_cd_Label = p.beansFactory.createLabel("Cnd.main_itm_unit_cd_Label");
		p.Cnd_main_itm_unit_cd = p.beansFactory.createTextField("Cnd.main_itm_unit_cd");
		p.Cnd_main_itm_unit_cd.setLabel(p.Cnd_main_itm_unit_cd_Label);
		p.Cnd_dec_place = p.beansFactory.createNumberField("Cnd.dec_place");
		p.Cnd_set_grp_cd_Label = p.beansFactory.createLabel("Cnd.set_grp_cd_Label");
		p.Cnd_set_grp_cd = p.beansFactory.createTextComboBox("Cnd.set_grp_cd");
		p.Cnd_set_grp_cd.setLabel(p.Cnd_set_grp_cd_Label);
		p.Cnd_set_grp_nm = p.beansFactory.createTextField("Cnd.set_grp_nm");
		p.Cnd_base_dt_Label = p.beansFactory.createLabel("Cnd.base_dt_Label");
		p.Cnd_base_dt = p.beansFactory.createDateField("Cnd.base_dt");
		p.Cnd_base_dt.setLabel(p.Cnd_base_dt_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_set_grp_cd = p.beansFactory.createTableColumn("Rslt.set_grp_cd", MCColumnType.TEXT);
		p.columnRslt_set_grp_nm = p.beansFactory.createTableColumn("Rslt.set_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_assort_flg = p.beansFactory.createTableColumn("Rslt.ship_assort_flg", MCColumnType.CHECK);
		p.columnRslt_set_itm_unit_cd = p.beansFactory.createTableColumn("Rslt.set_itm_unit_cd", MCColumnType.TEXT);
		p.columnRslt_set_itm_unit_nm = p.beansFactory.createTableColumn("Rslt.set_itm_unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_st_dt = p.beansFactory.createTableColumn("Rslt.st_dt", MCColumnType.DATE);
		p.columnRslt_end_dt = p.beansFactory.createTableColumn("Rslt.end_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_main_itm_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_main_itm_p_PPanel);
		p.Cnd_main_itm_p_PPanel.setNextBeans(p.Cnd_main_itm_unit_cd);
		p.CndPanel.add(p.Cnd_main_itm_unit_cd_Label);
		p.CndPanel.add(p.Cnd_main_itm_unit_cd);
		p.Cnd_main_itm_unit_cd.setNextBeans(p.Cnd_dec_place);
		p.Cnd_main_itm_unit_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1090.CndR.main_itm_unit_cd_META);
		p.CndPanel.add(p.Cnd_dec_place);
		p.Cnd_dec_place.setNextBeans(p.Cnd_main_itm_qty_p_PPanel);
		p.Cnd_dec_place.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1090.CndR.dec_place_META);
		p.CndPanel.add(p.Cnd_main_itm_qty_p_PPanel);
		p.Cnd_main_itm_qty_p_PPanel.setNextBeans(p.Cnd_set_grp_cd);
		p.Cnd_set_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_set_grp_cd, true);
		p.Cnd_set_grp_cd.setLinkBeans(p.Cnd_set_grp_nm);
		p.CndPanel.add(p.Cnd_set_grp_cd_Label);
		p.CndPanel.add(p.Cnd_set_grp_cd);
		p.Cnd_set_grp_cd.setNextBeans(p.Cnd_set_grp_nm);
		p.Cnd_set_grp_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1090.CndR.set_grp_cd_META);
		p.CndPanel.add(p.Cnd_set_grp_nm);
		p.Cnd_set_grp_nm.setNextBeans(p.Cnd_base_dt);
		p.Cnd_set_grp_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1090.CndR.set_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_set_grp_nm, true);
		p.CndPanel.add(p.Cnd_base_dt_Label);
		p.CndPanel.add(p.Cnd_base_dt);
		p.Cnd_base_dt.setNextBeans(p.Cnd_srch);
		p.Cnd_base_dt.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1090.CndR.base_dt_META);
		p.Cnd_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSUAP_SetItm p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSUAP_SetItm_MC.mcInitCnd((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.mcInitRslt((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.mcInitBtn((MSUAP_SetItm)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_SetItm_MC.statusInitSRCH_Cnd((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.statusInitSRCH_Rslt((MSUAP_SetItm)this);
		MSUAP_SetItm_MC.statusInitSRCH_Btn((MSUAP_SetItm)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_SetItm p) {
		p.Cnd_main_itm_unit_cd.setListListener(p);
		p.Cnd_main_itm_unit_cd.addAllListener(p);
		p.Cnd_dec_place.setListListener(p);
		p.Cnd_dec_place.addAllListener(p);
		p.Cnd_set_grp_cd.setListListener(p);
		p.Cnd_set_grp_cd.addAllListener(p);
		p.Cnd_set_grp_nm.setListListener(p);
		p.Cnd_set_grp_nm.addAllListener(p);
		p.Cnd_base_dt.setListListener(p);
		p.Cnd_base_dt.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_SetItm p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_set_grp_cd.addAllListener(p);
		p.columnRslt_set_grp_cd.setListListener(p);
		p.columnRslt_set_grp_nm.addAllListener(p);
		p.columnRslt_set_grp_nm.setListListener(p);
		p.columnRslt_ship_assort_flg.addAllListener(p);
		p.columnRslt_set_itm_unit_cd.addAllListener(p);
		p.columnRslt_set_itm_unit_cd.setListListener(p);
		p.columnRslt_set_itm_unit_nm.addAllListener(p);
		p.columnRslt_set_itm_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_st_dt.addAllListener(p);
		p.columnRslt_st_dt.setListListener(p);
		p.columnRslt_end_dt.addAllListener(p);
		p.columnRslt_end_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_SetItm p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_SetItm p){
		p.Cnd_main_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_main_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_main_itm_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_main_itm_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Cnd_set_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_set_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_base_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_SetItm p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_set_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_set_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_set_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ship_assort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_set_itm_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_set_itm_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_SetItm p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

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
		MSUAP_SetItm_MC.setTableConfigRslt((MSUAP_SetItm)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_SetItm p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_set_grp_cd.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.set_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_grp_cd);
		p.columnRslt_set_grp_nm.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.set_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_grp_nm);
		p.RsltTable.addTable(p.Rslt_set_itm_p_PPanel.ItmTable);
		p.columnRslt_ship_assort_flg.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.ship_assort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_assort_flg);
		p.columnRslt_set_itm_unit_cd.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.set_itm_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_itm_unit_cd);
		p.columnRslt_set_itm_unit_nm.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.set_itm_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_itm_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_st_dt.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.st_dt_META);
		p.columnRslt_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_dt);
		p.columnRslt_end_dt.setMeta(mcframe.clientMSUA.MSUAP1090.RsltR.end_dt_META);
		p.columnRslt_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_dt);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_set_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_set_grp_cd.getListConfig().setPutter(getCnd_set_grp_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
	}

	/**
	 * [Cnd_set_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SetGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_set_grp_cd) return getCnd_set_grp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept) doBtn_accept(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == Cnd_main_itm_unit_cd) return doCnd_main_itm_unit_cd_VC(info);
		if (vc == Cnd_dec_place) return doCnd_dec_place_VC(info);
		if (vc == Cnd_set_grp_cd) return doCnd_set_grp_cd_VC(info);
		if (vc == Cnd_set_grp_nm) return doCnd_set_grp_nm_VC(info);
		if (vc == Cnd_base_dt) return doCnd_base_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_set_grp_cd) return doRslt_set_grp_cd_VC(info);
		if (vc == columnRslt_set_grp_nm) return doRslt_set_grp_nm_VC(info);
		if (vc == columnRslt_ship_assort_flg) return doRslt_ship_assort_flg_VC(info);
		if (vc == columnRslt_set_itm_unit_cd) return doRslt_set_itm_unit_cd_VC(info);
		if (vc == columnRslt_set_itm_unit_nm) return doRslt_set_itm_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_st_dt) return doRslt_st_dt_VC(info);
		if (vc == columnRslt_end_dt) return doRslt_end_dt_VC(info);
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
	 * [Cnd]パネルの[main_itm_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_main_itm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_set_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_set_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[set_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_assort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_assort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_itm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_itm_unit_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_dt_VC(MCEventInfo info){
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
		else if (nc == Cnd_main_itm_unit_cd) doCnd_main_itm_unit_cd_NC(info);
		else if (nc == Cnd_dec_place) doCnd_dec_place_NC(info);
		else if (nc == Cnd_set_grp_cd) doCnd_set_grp_cd_NC(info);
		else if (nc == Cnd_set_grp_nm) doCnd_set_grp_nm_NC(info);
		else if (nc == Cnd_base_dt) doCnd_base_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_set_grp_cd) doRslt_set_grp_cd_NC(info);
		else if (nc == columnRslt_set_grp_nm) doRslt_set_grp_nm_NC(info);
		else if (nc == columnRslt_ship_assort_flg) doRslt_ship_assort_flg_NC(info);
		else if (nc == columnRslt_set_itm_unit_cd) doRslt_set_itm_unit_cd_NC(info);
		else if (nc == columnRslt_set_itm_unit_nm) doRslt_set_itm_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_st_dt) doRslt_st_dt_NC(info);
		else if (nc == columnRslt_end_dt) doRslt_end_dt_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_itm_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_itm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_assort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_assort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NC(MCEventInfo info){
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
		else if (ne == Cnd_main_itm_unit_cd) doCnd_main_itm_unit_cd_NE(info);
		else if (ne == Cnd_dec_place) doCnd_dec_place_NE(info);
		else if (ne == Cnd_set_grp_cd) doCnd_set_grp_cd_NE(info);
		else if (ne == Cnd_set_grp_nm) doCnd_set_grp_nm_NE(info);
		else if (ne == Cnd_base_dt) doCnd_base_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_set_grp_cd) doRslt_set_grp_cd_NE(info);
		else if (ne == columnRslt_set_grp_nm) doRslt_set_grp_nm_NE(info);
		else if (ne == columnRslt_ship_assort_flg) doRslt_ship_assort_flg_NE(info);
		else if (ne == columnRslt_set_itm_unit_cd) doRslt_set_itm_unit_cd_NE(info);
		else if (ne == columnRslt_set_itm_unit_nm) doRslt_set_itm_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_st_dt) doRslt_st_dt_NE(info);
		else if (ne == columnRslt_end_dt) doRslt_end_dt_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_itm_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_itm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_assort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_assort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NE(MCEventInfo info){
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
		else if (nx == Cnd_main_itm_unit_cd) doCnd_main_itm_unit_cd_NX(info);
		else if (nx == Cnd_dec_place) doCnd_dec_place_NX(info);
		else if (nx == Cnd_set_grp_cd) doCnd_set_grp_cd_NX(info);
		else if (nx == Cnd_set_grp_nm) doCnd_set_grp_nm_NX(info);
		else if (nx == Cnd_base_dt) doCnd_base_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_set_grp_cd) doRslt_set_grp_cd_NX(info);
		else if (nx == columnRslt_set_grp_nm) doRslt_set_grp_nm_NX(info);
		else if (nx == columnRslt_ship_assort_flg) doRslt_ship_assort_flg_NX(info);
		else if (nx == columnRslt_set_itm_unit_cd) doRslt_set_itm_unit_cd_NX(info);
		else if (nx == columnRslt_set_itm_unit_nm) doRslt_set_itm_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_st_dt) doRslt_st_dt_NX(info);
		else if (nx == columnRslt_end_dt) doRslt_end_dt_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_itm_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_itm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_assort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_assort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_main_itm_unit_cd) doCnd_main_itm_unit_cd_LC(info);
		else if (lc == Cnd_dec_place) doCnd_dec_place_LC(info);
		else if (lc == Cnd_set_grp_cd) doCnd_set_grp_cd_LC(info);
		else if (lc == Cnd_set_grp_nm) doCnd_set_grp_nm_LC(info);
		else if (lc == Cnd_base_dt) doCnd_base_dt_LC(info);
		else if (lc == columnRslt_set_grp_cd) doRslt_set_grp_cd_LC(info);
		else if (lc == columnRslt_set_grp_nm) doRslt_set_grp_nm_LC(info);
		else if (lc == columnRslt_set_itm_unit_cd) doRslt_set_itm_unit_cd_LC(info);
		else if (lc == columnRslt_set_itm_unit_nm) doRslt_set_itm_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_st_dt) doRslt_st_dt_LC(info);
		else if (lc == columnRslt_end_dt) doRslt_end_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[main_itm_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_itm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_set_grp_cd]の作成メソッド
	 */
	public MCList getCnd_set_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSetGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSUAL1090.Srch01")) {
			return new MS_MSUAL1090_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSUAL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSUAL1090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSUAL1090_Srch01;

		/** コンストラクタ */
		protected MS_MSUAL1090_Srch01Bridge() {
			p_MS_MSUAL1090_Srch01 = new MCParam(PDef.MS_MSUAL1090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSUAL1090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSUA.MSUAP1090.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSUA.MSUAP1090.RsltR.class));

			p_MS_MSUAL1090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSUAL1090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSUAL1090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSUAL1090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSUAL1090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSUA.MSUAP1090.CndR up0() {
			return (mcframe.clientMSUA.MSUAP1090.CndR)up(0);
		}

		protected MCList<mcframe.clientMSUA.MSUAP1090.RsltR> down0() {
			return (MCList<mcframe.clientMSUA.MSUAP1090.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSUAL1090_Srch01.addDownBlock(MCList.create(mcframe.clientMSUA.MSUAP1090.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSUAL1090_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSUA.MSUAP1090.RsltR>)p_MS_MSUAL1090_Srch01.getContainerParam().getDownBlock(0));
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