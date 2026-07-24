package mcframe.clientMABC.MABCP0040;

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
import mcframe.clientMABC.MABCP0040.MABCP_MultiSrch_MC.MA_MABCL0040_Srch01Caller;

/**
 * 画面"MABCP_MultiSrch"パネルクラスです。<p>
 *
 * 複数のマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_MultiSrch_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0040";

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
	public MCLabel Cnd_mst_nm_Label = null;
	/**
	 * Master マスタ.<p>
	 *
	 */
	public MCTextField Cnd_mst_nm = null;
	public MCLabel Cnd_mst_nm_nm_Label = null;
	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public MCTextField Cnd_mst_nm_nm = null;
	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public MCCheckBox Cnd_partial_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0040.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Master マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_key = null;
	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_nm_nm = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_set_typ_nm = null;
	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lcl_flg = null;
	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_nm = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Auto-search 自動検索.<p>
	 *
	 */
	public MCCheckBox Btn_auto_srch_flg = null;
	/**
	 * Multi-master entry マルチマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0030 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0040_Srch01]のCallerの作成 */
	protected MABCP_MultiSrch_MC.MA_MABCL0040_Srch01Caller createMA_MABCL0040_Srch01() {
		MABCP_MultiSrch_MC.MA_MABCL0040_Srch01Caller<MABCP_MultiSrch, MA_MABCL0040_Srch01Bridge>
		caller = ((MABCP_MultiSrch_MC)this).new MA_MABCL0040_Srch01Caller<MABCP_MultiSrch, MA_MABCL0040_Srch01Bridge>(
					(MABCP_MultiSrch)this, new MA_MABCL0040_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0040_Srch01]の呼び出し */
	protected void callMA_MABCL0040_Srch01() {
		MCCaller caller = createMA_MABCL0040_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0040.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0040.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0040.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0040.CndR createCndR() {
		return mcframe.clientMABC.MABCP0040.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0040.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0040.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0040.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0040.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0040.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0040.DtlR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMABC.MABCP0040.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP0040.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP0040.BtnR createBtnR() {
		return mcframe.clientMABC.MABCP0040.BtnR.create();
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
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(SrchBtnPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_MultiSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_MultiSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_MultiSrch_MC.jbCreateCnd((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbCreateSrchBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbCreateDtl((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbCreateBtn((MABCP_MultiSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_MultiSrch p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MABCP_MultiSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_MultiSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_MultiSrch p) {
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


	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_MultiSrch create(){
		MABCP_MultiSrch p = new MABCP_MultiSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_MultiSrch create(String name){
		MABCP_MultiSrch p = new MABCP_MultiSrch(name);
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
		MABCP_MultiSrch_MC.jbfInitCnd((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbfInitSrchBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbfInitDtl((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbfInitBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbInitCnd((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbInitSrchBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbInitDtl((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.jbInitBtn((MABCP_MultiSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_mst_nm_Label = p.beansFactory.createLabel("Cnd.mst_nm_Label");
		p.Cnd_mst_nm = p.beansFactory.createTextField("Cnd.mst_nm");
		p.Cnd_mst_nm.setLabel(p.Cnd_mst_nm_Label);
		p.Cnd_mst_nm_nm_Label = p.beansFactory.createLabel("Cnd.mst_nm_nm_Label");
		p.Cnd_mst_nm_nm = p.beansFactory.createTextField("Cnd.mst_nm_nm");
		p.Cnd_mst_nm_nm.setLabel(p.Cnd_mst_nm_nm_Label);
		p.Cnd_partial_flg = p.beansFactory.createCheckBox("Cnd.partial_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_mst_key = p.beansFactory.createTableColumn("Dtl.mst_key", MCColumnType.TEXT);
		p.columnDtl_mst_nm_nm = p.beansFactory.createTableColumn("Dtl.mst_nm_nm", MCColumnType.TEXT);
		p.columnDtl_mst_set_typ_nm = p.beansFactory.createTableColumn("Dtl.mst_set_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lcl_flg = p.beansFactory.createTableColumn("Dtl.lcl_flg", MCColumnType.CHECK);
		p.columnDtl_mst_nm = p.beansFactory.createTableColumn("Dtl.mst_nm", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_auto_srch_flg = p.beansFactory.createCheckBox("Btn.auto_srch_flg");
		p.Btn_open_MABCP0030 = p.beansFactory.createButton("Btn.open_MABCP0030", "open");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_mst_nm_Label);
		p.CndPanel.add(p.Cnd_mst_nm);
		p.CndPanel.setLastBeans(p.Cnd_mst_nm);
		p.Cnd_mst_nm.setNextBeans(p.Cnd_mst_nm_nm);
		p.Cnd_mst_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0040.CndR.mst_nm_META);
		p.CndPanel.add(p.Cnd_mst_nm_nm_Label);
		p.CndPanel.add(p.Cnd_mst_nm_nm);
		p.Cnd_mst_nm_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0040.CndR.mst_nm_nm_META);
		p.SrchBtnPanel.add(p.Cnd_partial_flg);
		p.SrchBtnPanel.setLastBeans(p.Cnd_partial_flg);
		p.Cnd_partial_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_partial_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0040.CndR.partial_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtnPanel.add(p.Cnd_srch);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.add(p.SrchBtnPanel);
		p.SrchBtnPanel.setNextBeans(p.DtlPanel);
		p.SrchBtnPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setValueCheck(false);
		p.DtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_MultiSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_auto_srch_flg);
		p.BtnPanel.setLastBeans(p.Btn_auto_srch_flg);
		p.Btn_auto_srch_flg.setNextBeans(p.Btn_open_MABCP0030);
		p.Btn_auto_srch_flg.setRow(p.getBtnR(), mcframe.clientMABC.MABCP0040.BtnR.auto_srch_flg_META);
		p.Btn_open_MABCP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP0030);
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
		MABCP_MultiSrch_MC.mcInitCnd((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.mcInitSrchBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.mcInitDtl((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.mcInitBtn((MABCP_MultiSrch)this);

		// [SRCH]ステータスのモードの設定
		MABCP_MultiSrch_MC.statusInitSRCH_Cnd((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.statusInitSRCH_SrchBtn((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.statusInitSRCH_Dtl((MABCP_MultiSrch)this);
		MABCP_MultiSrch_MC.statusInitSRCH_Btn((MABCP_MultiSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_MultiSrch p) {
		p.Cnd_mst_nm.setListListener(p);
		p.Cnd_mst_nm.addAllListener(p);
		p.Cnd_mst_nm_nm.setListListener(p);
		p.Cnd_mst_nm_nm.addAllListener(p);
		p.Cnd_partial_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MABCP_MultiSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_MultiSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_mst_key.addAllListener(p);
		p.columnDtl_mst_key.setListListener(p);
		p.columnDtl_mst_nm_nm.addAllListener(p);
		p.columnDtl_mst_nm_nm.setListListener(p);
		p.columnDtl_mst_set_typ_nm.addAllListener(p);
		p.columnDtl_mst_set_typ_nm.setListListener(p);
		p.columnDtl_lcl_flg.addAllListener(p);
		p.columnDtl_mst_nm.addAllListener(p);
		p.columnDtl_mst_nm.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_MultiSrch p) {
		p.Btn_auto_srch_flg.addAllListener(p);
		p.Btn_open_MABCP0030.addAllListener(p);
		p.Btn_open_MABCP0030.setAPMethodName("doBtn_open_MABCP0030");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_MultiSrch p){
		p.Cnd_mst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mst_nm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_partial_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MABCP_MultiSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABCP_MultiSrch p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_mst_key.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mst_nm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mst_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lcl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mst_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABCP_MultiSrch p){
		p.Btn_auto_srch_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MABCP0030.putMode(p, SRCH, MCMode.ENABLE);

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
		MABCP_MultiSrch_MC.setTableConfigDtl((MABCP_MultiSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_MultiSrch p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0040.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_mst_key.setMeta(mcframe.clientMABC.MABCP0040.DtlR.mst_key_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_key);
		p.columnDtl_mst_nm_nm.setMeta(mcframe.clientMABC.MABCP0040.DtlR.mst_nm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_nm_nm);
		p.columnDtl_mst_set_typ_nm.setMeta(mcframe.clientMABC.MABCP0040.DtlR.mst_set_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_set_typ_nm);
		p.columnDtl_lcl_flg.setMeta(mcframe.clientMABC.MABCP0040.DtlR.lcl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lcl_flg);
		p.columnDtl_mst_nm.setMeta(mcframe.clientMABC.MABCP0040.DtlR.mst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_nm);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
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
		else if (ap == Btn_open_MABCP0030) doBtn_open_MABCP0030(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0030(MCEventInfo info);

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
		if (vc == Cnd_mst_nm) return doCnd_mst_nm_VC(info);
		if (vc == Cnd_mst_nm_nm) return doCnd_mst_nm_nm_VC(info);
		if (vc == Cnd_partial_flg) return doCnd_partial_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_mst_key) return doDtl_mst_key_VC(info);
		if (vc == columnDtl_mst_nm_nm) return doDtl_mst_nm_nm_VC(info);
		if (vc == columnDtl_mst_set_typ_nm) return doDtl_mst_set_typ_nm_VC(info);
		if (vc == columnDtl_lcl_flg) return doDtl_lcl_flg_VC(info);
		if (vc == columnDtl_mst_nm) return doDtl_mst_nm_VC(info);
		if (vc == Btn_auto_srch_flg) return doBtn_auto_srch_flg_VC(info);
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
	 * [Cnd]パネルの[mst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mst_nm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mst_nm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[partial_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_partial_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_nm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_nm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lcl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lcl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[auto_srch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_auto_srch_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_mst_nm) doCnd_mst_nm_NC(info);
		else if (nc == Cnd_mst_nm_nm) doCnd_mst_nm_nm_NC(info);
		else if (nc == Cnd_partial_flg) doCnd_partial_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_mst_key) doDtl_mst_key_NC(info);
		else if (nc == columnDtl_mst_nm_nm) doDtl_mst_nm_nm_NC(info);
		else if (nc == columnDtl_mst_set_typ_nm) doDtl_mst_set_typ_nm_NC(info);
		else if (nc == columnDtl_lcl_flg) doDtl_lcl_flg_NC(info);
		else if (nc == columnDtl_mst_nm) doDtl_mst_nm_NC(info);
		else if (nc == Btn_auto_srch_flg) doBtn_auto_srch_flg_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[partial_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_partial_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_key_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lcl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lcl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[auto_srch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_auto_srch_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_mst_nm) doCnd_mst_nm_NE(info);
		else if (ne == Cnd_mst_nm_nm) doCnd_mst_nm_nm_NE(info);
		else if (ne == Cnd_partial_flg) doCnd_partial_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_mst_key) doDtl_mst_key_NE(info);
		else if (ne == columnDtl_mst_nm_nm) doDtl_mst_nm_nm_NE(info);
		else if (ne == columnDtl_mst_set_typ_nm) doDtl_mst_set_typ_nm_NE(info);
		else if (ne == columnDtl_lcl_flg) doDtl_lcl_flg_NE(info);
		else if (ne == columnDtl_mst_nm) doDtl_mst_nm_NE(info);
		else if (ne == Btn_auto_srch_flg) doBtn_auto_srch_flg_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[partial_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_partial_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_key_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lcl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lcl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[auto_srch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_auto_srch_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_mst_nm) doCnd_mst_nm_NX(info);
		else if (nx == Cnd_mst_nm_nm) doCnd_mst_nm_nm_NX(info);
		else if (nx == Cnd_partial_flg) doCnd_partial_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_mst_key) doDtl_mst_key_NX(info);
		else if (nx == columnDtl_mst_nm_nm) doDtl_mst_nm_nm_NX(info);
		else if (nx == columnDtl_mst_set_typ_nm) doDtl_mst_set_typ_nm_NX(info);
		else if (nx == columnDtl_lcl_flg) doDtl_lcl_flg_NX(info);
		else if (nx == columnDtl_mst_nm) doDtl_mst_nm_NX(info);
		else if (nx == Btn_auto_srch_flg) doBtn_auto_srch_flg_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[partial_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_partial_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_key_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lcl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lcl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[auto_srch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_auto_srch_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_mst_nm) doCnd_mst_nm_LC(info);
		else if (lc == Cnd_mst_nm_nm) doCnd_mst_nm_nm_LC(info);
		else if (lc == columnDtl_mst_key) doDtl_mst_key_LC(info);
		else if (lc == columnDtl_mst_nm_nm) doDtl_mst_nm_nm_LC(info);
		else if (lc == columnDtl_mst_set_typ_nm) doDtl_mst_set_typ_nm_LC(info);
		else if (lc == columnDtl_mst_nm) doDtl_mst_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[mst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mst_nm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mst_nm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_key_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_nm_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0040.Srch01")) {
			return new MA_MABCL0040_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0040_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0040_Srch01Bridge() {
			p_MA_MABCL0040_Srch01 = new MCParam(PDef.MA_MABCL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0040.DtlR.class));

			p_MA_MABCL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0040.CndR up0() {
			return (mcframe.clientMABC.MABCP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0040.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0040_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0040.DtlR>)p_MA_MABCL0040_Srch01.getContainerParam().getDownBlock(0));
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