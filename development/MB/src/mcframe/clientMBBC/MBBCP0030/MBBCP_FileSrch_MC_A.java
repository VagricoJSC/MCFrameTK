package mcframe.clientMBBC.MBBCP0030;

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
import mcframe.clientMBBC.MBBCP0030.MBBCP_FileSrch_MC.MB_MBBCL0030_Srch01Caller;

/**
 * 画面"MBBCP_FileSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCP_FileSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBCP0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_file_path_Label = null;
	/**
	 * Folder name フォルダ名.<p>
	 *
	 */
	public MCTextField Cnd_file_path = null;
	/**
	 * Up 上へ.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Folder selection mode フォルダ選択モード.<p>
	 *
	 */
	public MCCheckBox Cnd_folder_select_mode_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_cd = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBC.MBBCP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Open 開く.<p>
	 *
	 */
	public MCColumnConfig columnRslt_open_file = null;
	/**
	 * Type 種類.<p>
	 *
	 */
	public MCColumnConfig columnRslt_typ_nm = null;
	/**
	 * Name 名称.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_nm = null;
	public MCColumnConfig columnRslt_file_path = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_select = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MB_MBBCL0030_Srch01]のCallerの作成 */
	protected MBBCP_FileSrch_MC.MB_MBBCL0030_Srch01Caller createMB_MBBCL0030_Srch01() {
		MBBCP_FileSrch_MC.MB_MBBCL0030_Srch01Caller<MBBCP_FileSrch, MB_MBBCL0030_Srch01Bridge>
		caller = ((MBBCP_FileSrch_MC)this).new MB_MBBCL0030_Srch01Caller<MBBCP_FileSrch, MB_MBBCL0030_Srch01Bridge>(
					(MBBCP_FileSrch)this, new MB_MBBCL0030_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBCL0030_Srch01]の呼び出し */
	protected void callMB_MBBCL0030_Srch01() {
		MCCaller caller = createMB_MBBCL0030_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBC.MBBCP0030.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBC.MBBCP0030.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBC.MBBCP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBC.MBBCP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBC.MBBCP0030.CndR createCndR() {
		return mcframe.clientMBBC.MBBCP0030.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBC.MBBCP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBC.MBBCP0030.RsltR createRsltR() {
		return mcframe.clientMBBC.MBBCP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBC.MBBCP0030.RsltR.class);
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
	public MBBCP_FileSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBCP_FileSrch_MC_A(String name) {
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
		MBBCP_FileSrch_MC.jbCreateCnd((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbCreateRslt((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbCreateBtn((MBBCP_FileSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBCP_FileSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBCP_FileSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBCP_FileSrch p) {
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
	public static MBBCP_FileSrch create(){
		MBBCP_FileSrch p = new MBBCP_FileSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBCP_FileSrch create(String name){
		MBBCP_FileSrch p = new MBBCP_FileSrch(name);
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
		MBBCP_FileSrch_MC.jbfInitCnd((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbfInitRslt((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbfInitBtn((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbInitCnd((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbInitRslt((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.jbInitBtn((MBBCP_FileSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_file_path_Label = p.beansFactory.createLabel("Cnd.file_path_Label");
		p.Cnd_file_path = p.beansFactory.createTextField("Cnd.file_path");
		p.Cnd_file_path.setLabel(p.Cnd_file_path_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_folder_select_mode_flg = p.beansFactory.createCheckBox("Cnd.folder_select_mode_flg");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextField("Cnd.ext_sys_cd");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_open_file = p.beansFactory.createTableColumn("Rslt.open_file", MCColumnType.BUTTON);
		p.columnRslt_typ_nm = p.beansFactory.createTableColumn("Rslt.typ_nm", MCColumnType.TEXT);
		p.columnRslt_file_nm = p.beansFactory.createTableColumn("Rslt.file_nm", MCColumnType.TEXT);
		p.columnRslt_file_path = p.beansFactory.createTableColumn("Rslt.file_path", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select = p.beansFactory.createButton("Btn.select");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.RsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_file_path_Label);
		p.CndPanel.add(p.Cnd_file_path);
		p.CndPanel.setLastBeans(p.Cnd_file_path);
		p.Cnd_file_path.setNextBeans(p.Cnd_srch);
		p.Cnd_file_path.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0030.CndR.file_path_META);
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_folder_select_mode_flg);
		p.CndPanel.add(p.Cnd_folder_select_mode_flg);
		p.Cnd_folder_select_mode_flg.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_folder_select_mode_flg.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0030.CndR.folder_select_mode_flg_META);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0030.CndR.ext_sys_cd_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBCP_FileSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select.setIcon("REGISTER");
		p.Btn_select.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_select);
		p.BtnPanel.setLastBeans(p.Btn_select);
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
		MBBCP_FileSrch_MC.mcInitCnd((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.mcInitRslt((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.mcInitBtn((MBBCP_FileSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBCP_FileSrch_MC.statusInitSRCH_Cnd((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.statusInitSRCH_Rslt((MBBCP_FileSrch)this);
		MBBCP_FileSrch_MC.statusInitSRCH_Btn((MBBCP_FileSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBCP_FileSrch p) {
		p.Cnd_file_path.setListListener(p);
		p.Cnd_file_path.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_folder_select_mode_flg.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBCP_FileSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_open_file.addAllListener(p);
		p.columnRslt_open_file.setAPMethodName("doRslt_open_file");
		p.columnRslt_typ_nm.addAllListener(p);
		p.columnRslt_typ_nm.setListListener(p);
		p.columnRslt_file_nm.addAllListener(p);
		p.columnRslt_file_nm.setListListener(p);
		p.columnRslt_file_path.addAllListener(p);
		p.columnRslt_file_path.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBCP_FileSrch p) {
		p.Btn_select.addAllListener(p);
		p.Btn_select.setAPMethodName("doBtn_select");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBCP_FileSrch p){
		p.Cnd_file_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_folder_select_mode_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBCP_FileSrch p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.ENABLE);
		p.columnRslt_open_file.putMode(p, SRCH, MCMode.ENABLE);
		p.columnRslt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_path.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBCP_FileSrch p){
		p.Btn_select.putMode(p, SRCH, MCMode.ENABLE);

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
		MBBCP_FileSrch_MC.setTableConfigRslt((MBBCP_FileSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBCP_FileSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMBBC.MBBCP0030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addColumnConfig(p.columnRslt_open_file);
		p.columnRslt_typ_nm.setMeta(mcframe.clientMBBC.MBBCP0030.RsltR.typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_typ_nm);
		p.columnRslt_file_nm.setMeta(mcframe.clientMBBC.MBBCP0030.RsltR.file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_nm);
		p.columnRslt_file_path.setMeta(mcframe.clientMBBC.MBBCP0030.RsltR.file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_path);
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
		else if (ap == columnRslt_open_file) doRslt_open_file(info);
		else if (ap == Btn_select) doBtn_select(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Rslt]パネルの[open_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt_open_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[select]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select(MCEventInfo info);

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
		if (vc == Cnd_file_path) return doCnd_file_path_VC(info);
		if (vc == Cnd_folder_select_mode_flg) return doCnd_folder_select_mode_flg_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_typ_nm) return doRslt_typ_nm_VC(info);
		if (vc == columnRslt_file_nm) return doRslt_file_nm_VC(info);
		if (vc == columnRslt_file_path) return doRslt_file_path_VC(info);
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
	 * [Cnd]パネルの[file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[folder_select_mode_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_folder_select_mode_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_path_VC(MCEventInfo info){
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
		else if (nc == Cnd_file_path) doCnd_file_path_NC(info);
		else if (nc == Cnd_folder_select_mode_flg) doCnd_folder_select_mode_flg_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_typ_nm) doRslt_typ_nm_NC(info);
		else if (nc == columnRslt_file_nm) doRslt_file_nm_NC(info);
		else if (nc == columnRslt_file_path) doRslt_file_path_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[folder_select_mode_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_folder_select_mode_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NC(MCEventInfo info){
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
		else if (ne == Cnd_file_path) doCnd_file_path_NE(info);
		else if (ne == Cnd_folder_select_mode_flg) doCnd_folder_select_mode_flg_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_typ_nm) doRslt_typ_nm_NE(info);
		else if (ne == columnRslt_file_nm) doRslt_file_nm_NE(info);
		else if (ne == columnRslt_file_path) doRslt_file_path_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[folder_select_mode_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_folder_select_mode_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NE(MCEventInfo info){
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
		else if (nx == Cnd_file_path) doCnd_file_path_NX(info);
		else if (nx == Cnd_folder_select_mode_flg) doCnd_folder_select_mode_flg_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_typ_nm) doRslt_typ_nm_NX(info);
		else if (nx == columnRslt_file_nm) doRslt_file_nm_NX(info);
		else if (nx == columnRslt_file_path) doRslt_file_path_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[folder_select_mode_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_folder_select_mode_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_file_path) doCnd_file_path_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == columnRslt_typ_nm) doRslt_typ_nm_LC(info);
		else if (lc == columnRslt_file_nm) doRslt_file_nm_LC(info);
		else if (lc == columnRslt_file_path) doRslt_file_path_LC(info);
	}

	/**
	 * [Cnd]パネルの[file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBCL0030.Srch01")) {
			return new MB_MBBCL0030_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBCL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBCL0030_Srch01;

		/** コンストラクタ */
		protected MB_MBBCL0030_Srch01Bridge() {
			p_MB_MBBCL0030_Srch01 = new MCParam(PDef.MB_MBBCL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBCL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBC.MBBCP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0030.RsltR.class));

			p_MB_MBBCL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBCL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBCL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBCL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBCL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBC.MBBCP0030.CndR up0() {
			return (mcframe.clientMBBC.MBBCP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBC.MBBCP0030.RsltR> down0() {
			return (MCList<mcframe.clientMBBC.MBBCP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBCL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBCL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBC.MBBCP0030.RsltR>)p_MB_MBBCL0030_Srch01.getContainerParam().getDownBlock(0));
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