package mcframe.clientMAUB.MAUBP5160;

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

/**
 * 画面"MAUBP_Term_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Term_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SUBMODULE_ID = "MAUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUBP5160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Term]ブロック関連のField定義
	public MCPanel TermPanel = null;
	public MCScrollPane TermScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5160.TermR> TermTable = null;
	// [Term]ブロックの項目のField定義
	/**
	 * Term 期.<p>
	 *
	 */
	public MCColumnConfig columnTerm_term = null;
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public MCColumnConfig columnTerm_term_nm = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [DISABLE]モードを表す定数 */
	public static final String DISABLE = "DISABLE";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";
	/** [REQUIRED]モードを表す定数 */
	public static final String REQUIRED = "REQUIRED";
	/** [INVISIBLE]モードを表す定数 */
	public static final String INVISIBLE = "INVISIBLE";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE, DISABLE, READ_ONLY, REQUIRED, INVISIBLE};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Term]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5160.TermR> aTermL;

	/**
	 * コピーによってaTermLを設定します。
	 *
	 * aTermLのインスタンスは変更されません。
	 *
	 * @param dataset TermL
	 */
	public void setTermL(MCList<mcframe.clientMAUB.MAUBP5160.TermR> aList) {
		if (getTermL() != aList) {
			getTermL().setAll(aList);
		}
	}

	/**
	 * [Term]ブロックのコンテナaTermLを返します。
	 *
	 * @return TermL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5160.TermR> getTermL() {
		return aTermL;
	}

	/**
	 * aTermRを作成します。
	 *
	 * @return TermR
	 */
	public mcframe.clientMAUB.MAUBP5160.TermR createTermR() {
		return mcframe.clientMAUB.MAUBP5160.TermR.create();
	}

	/**
	 * aTermLを作成します。
	 *
	 * @return TermL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5160.TermR> createTermL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5160.TermR.class);
	}

	/**
	 * TermTableを初期化します。
	 */
	protected void createTermTable(){
		if(TermTable == null){
			TermTable = beansFactory.createTable2("Term.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTermL())) ret.add(getTermL());
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
		if(aCnt == getTermL()) return "Term";
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
		if(bId.equals("Term")) return getTermL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TermPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Term_D_MC_A() {
		aTermL = createTermL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Term_D_MC_A(String name) {
		aTermL = createTermL();
		createTermTable();
		TermTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Term_D_MC.jbCreateTerm((MAUBP_Term_D)this);
	}

	/**
	 * [Term]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTerm(MAUBP_Term_D p) {
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

	
	/** [Term_term_ListPutter]の定義 */
	private MCListPutter Term_term_p = null;

	/**
	 * [Term_term_ListPutter]の取得
	 */
	protected MCListPutter getTerm_term_ListPutter() {
		if (Term_term_p == null) {
			Term_term_p = createTerm_term_ListPutter(columnTerm_term, "term", "term_nm");

		}
		return Term_term_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Term_D create(){
		MAUBP_Term_D p = new MAUBP_Term_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Term_D create(String name){
		MAUBP_Term_D p = new MAUBP_Term_D(name);
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
		MAUBP_Term_D_MC.jbfInitTerm((MAUBP_Term_D)this);
		MAUBP_Term_D_MC.jbInitTerm((MAUBP_Term_D)this);
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTerm(MAUBP_Term_D p) {
		// ブロック関連の初期化
		p.TermPanel = p.beansFactory.createPanel("Term");
		p.TermScrollPane = p.beansFactory.createScrollPane("Term.scroll");
		p.createTermTable();
		// ブロックの項目の初期化
		p.columnTerm_term = p.beansFactory.createTableColumn("Term.term", MCColumnType.DATE_COMBO);
		p.columnTerm_term_nm = p.beansFactory.createTableColumn("Term.term_nm", MCColumnType.TEXT);
	}

	/**
	 * [Term]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTerm(MAUBP_Term_D p) {
		// ブロック関連の初期化
		p.add(p.TermPanel);
		p.setLastBeans(p.TermPanel);
		p.TermPanel.add(p.TermScrollPane);
		p.TermPanel.setLastBeans(p.TermTable);
		p.TermScrollPane.setViewportView(p.TermTable);
		p.TermTable.setList(p.getTermL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Term_D_MC.mcInitTerm((MAUBP_Term_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Term_D_MC.statusInitENABLE_Term((MAUBP_Term_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Term_D_MC.statusInitDISABLE_Term((MAUBP_Term_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Term_D_MC.statusInitREAD__ONLY_Term((MAUBP_Term_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Term_D_MC.statusInitREQUIRED_Term((MAUBP_Term_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Term_D_MC.statusInitINVISIBLE_Term((MAUBP_Term_D)this);

	}

	/**
	 *  [Term]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTerm(MAUBP_Term_D p) {
		p.TermTable.addAllListener(p);
		p.columnTerm_term.addAllListener(p);
		p.columnTerm_term.setListListener(p);
		p.columnTerm_term_nm.addAllListener(p);
		p.columnTerm_term_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Term(MAUBP_Term_D p){
		p.columnTerm_term.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnTerm_term_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Term(MAUBP_Term_D p){
		p.columnTerm_term.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnTerm_term_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Term(MAUBP_Term_D p){
		p.columnTerm_term.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnTerm_term_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Term(MAUBP_Term_D p){
		p.columnTerm_term.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnTerm_term_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[Term]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Term(MAUBP_Term_D p){
		p.columnTerm_term.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnTerm_term_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Term_D_MC.setTableConfigTerm((MAUBP_Term_D)this);
	}

	/**
	 * [Term]ブロックのTableの設定
	 */
	protected static void setTableConfigTerm(MAUBP_Term_D p) {
		p.columnTerm_term.setMeta(mcframe.clientMAUB.MAUBP5160.TermR.term_META);
		p.columnTerm_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.columnTerm_term.addLinkBeans(p.columnTerm_term_nm);
		p.TermTable.addColumnConfig(p.columnTerm_term);
		p.columnTerm_term_nm.setMeta(mcframe.clientMAUB.MAUBP5160.TermR.term_nm_META);
		p.TermTable.addColumnConfig(p.columnTerm_term_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnTerm_term.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnTerm_term.getListConfig().setPutter(getTerm_term_ListPutter());
	}

	/**
	 * この画面を[ENABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLEStatus() {
		status = ENABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[DISABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDISABLEStatus() {
		status = DISABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[READ_ONLY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREAD_ONLYStatus() {
		status = READ_ONLY;
		setAllStatus(status);
	}

	/**
	 * この画面を[REQUIRED]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQUIREDStatus() {
		status = REQUIRED;
		setAllStatus(status);
	}

	/**
	 * この画面を[INVISIBLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINVISIBLEStatus() {
		status = INVISIBLE;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (ENABLE.equals(status)) {
			setENABLEStatus();
		}
		else if (DISABLE.equals(status)) {
			setDISABLEStatus();
		}
		else if (READ_ONLY.equals(status)) {
			setREAD_ONLYStatus();
		}
		else if (REQUIRED.equals(status)) {
			setREQUIREDStatus();
		}
		else if (INVISIBLE.equals(status)) {
			setINVISIBLEStatus();
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
	 * [Term_term_ListPutter]の作成
	 */
	protected MCListPutter createTerm_term_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Term");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnTerm_term) return getTerm_term(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
	}

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
		if (vc == TermTable) return doTerm_VC(info);
		if (vc == columnTerm_term) return doTerm_term_VC(info);
		if (vc == columnTerm_term_nm) return doTerm_term_nm_VC(info);
		return true;
	}

	/**
	 * [Term]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Term]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Term]パネルの[term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTerm_term_nm_VC(MCEventInfo info){
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
		if (nc == TermTable) doTerm_NC(info);
		else if (nc == columnTerm_term) doTerm_term_NC(info);
		else if (nc == columnTerm_term_nm) doTerm_term_nm_NC(info);
	}

	/**
	 * [Term]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_NC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_NC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TermTable) doTerm_NE(info);
		else if (ne == columnTerm_term) doTerm_term_NE(info);
		else if (ne == columnTerm_term_nm) doTerm_term_nm_NE(info);
	}

	/**
	 * [Term]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_NE(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_NE(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TermTable) doTerm_NX(info);
		else if (nx == columnTerm_term) doTerm_term_NX(info);
		else if (nx == columnTerm_term_nm) doTerm_term_nm_NX(info);
	}

	/**
	 * [Term]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_NX(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_NX(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnTerm_term) doTerm_term_LC(info);
		else if (lc == columnTerm_term_nm) doTerm_term_nm_LC(info);
	}

	/**
	 * [Term]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_LC(MCEventInfo info){
	}

	/**
	 * [Term]パネルの[term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTerm_term_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnTerm_term]の作成メソッド
	 */
	public MCList getTerm_term(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTerm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}