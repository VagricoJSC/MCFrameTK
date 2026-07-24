package mcframe.clientMAUB.MAUBP5340;

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
 * 画面"MAUBP_WkCostQty_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_WkCostQty_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5340";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [WkCostQty]ブロック関連のField定義
	public MCPanel WkCostQtyPanel = null;
	public MCScrollPane WkCostQtyScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5340.WkCostQtyR> WkCostQtyTable = null;
	// [WkCostQty]ブロックの項目のField定義
	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public MCColumnConfig columnWkCostQty_wk_cost_qty = null;
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
	
	/** [WkCostQty]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5340.WkCostQtyR> aWkCostQtyL;

	/**
	 * コピーによってaWkCostQtyLを設定します。
	 *
	 * aWkCostQtyLのインスタンスは変更されません。
	 *
	 * @param dataset WkCostQtyL
	 */
	public void setWkCostQtyL(MCList<mcframe.clientMAUB.MAUBP5340.WkCostQtyR> aList) {
		if (getWkCostQtyL() != aList) {
			getWkCostQtyL().setAll(aList);
		}
	}

	/**
	 * [WkCostQty]ブロックのコンテナaWkCostQtyLを返します。
	 *
	 * @return WkCostQtyL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5340.WkCostQtyR> getWkCostQtyL() {
		return aWkCostQtyL;
	}

	/**
	 * aWkCostQtyRを作成します。
	 *
	 * @return WkCostQtyR
	 */
	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR createWkCostQtyR() {
		return mcframe.clientMAUB.MAUBP5340.WkCostQtyR.create();
	}

	/**
	 * aWkCostQtyLを作成します。
	 *
	 * @return WkCostQtyL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5340.WkCostQtyR> createWkCostQtyL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	}

	/**
	 * WkCostQtyTableを初期化します。
	 */
	protected void createWkCostQtyTable(){
		if(WkCostQtyTable == null){
			WkCostQtyTable = beansFactory.createTable2("WkCostQty.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getWkCostQtyL())) ret.add(getWkCostQtyL());
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
		if(aCnt == getWkCostQtyL()) return "WkCostQty";
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
		if(bId.equals("WkCostQty")) return getWkCostQtyL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(WkCostQtyPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_WkCostQty_D_MC_A() {
		aWkCostQtyL = createWkCostQtyL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_WkCostQty_D_MC_A(String name) {
		aWkCostQtyL = createWkCostQtyL();
		createWkCostQtyTable();
		WkCostQtyTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_WkCostQty_D_MC.jbCreateWkCostQty((MAUBP_WkCostQty_D)this);
	}

	/**
	 * [WkCostQty]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWkCostQty(MAUBP_WkCostQty_D p) {
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
	public static MAUBP_WkCostQty_D create(){
		MAUBP_WkCostQty_D p = new MAUBP_WkCostQty_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_WkCostQty_D create(String name){
		MAUBP_WkCostQty_D p = new MAUBP_WkCostQty_D(name);
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
		MAUBP_WkCostQty_D_MC.jbfInitWkCostQty((MAUBP_WkCostQty_D)this);
		MAUBP_WkCostQty_D_MC.jbInitWkCostQty((MAUBP_WkCostQty_D)this);
	}

	/**
	 * [WkCostQty]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWkCostQty(MAUBP_WkCostQty_D p) {
		// ブロック関連の初期化
		p.WkCostQtyPanel = p.beansFactory.createPanel("WkCostQty");
		p.WkCostQtyScrollPane = p.beansFactory.createScrollPane("WkCostQty.scroll");
		p.createWkCostQtyTable();
		// ブロックの項目の初期化
		p.columnWkCostQty_wk_cost_qty = p.beansFactory.createTableColumn("WkCostQty.wk_cost_qty", MCColumnType.NUMBER);
	}

	/**
	 * [WkCostQty]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWkCostQty(MAUBP_WkCostQty_D p) {
		// ブロック関連の初期化
		p.add(p.WkCostQtyPanel);
		p.setLastBeans(p.WkCostQtyPanel);
		p.WkCostQtyPanel.add(p.WkCostQtyScrollPane);
		p.WkCostQtyPanel.setLastBeans(p.WkCostQtyTable);
		p.WkCostQtyScrollPane.setViewportView(p.WkCostQtyTable);
		p.WkCostQtyTable.setList(p.getWkCostQtyL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_WkCostQty_D_MC.mcInitWkCostQty((MAUBP_WkCostQty_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_WkCostQty_D_MC.statusInitENABLE_WkCostQty((MAUBP_WkCostQty_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_WkCostQty_D_MC.statusInitDISABLE_WkCostQty((MAUBP_WkCostQty_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_WkCostQty_D_MC.statusInitREAD__ONLY_WkCostQty((MAUBP_WkCostQty_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_WkCostQty_D_MC.statusInitREQUIRED_WkCostQty((MAUBP_WkCostQty_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_WkCostQty_D_MC.statusInitINVISIBLE_WkCostQty((MAUBP_WkCostQty_D)this);

	}

	/**
	 *  [WkCostQty]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWkCostQty(MAUBP_WkCostQty_D p) {
		p.WkCostQtyTable.addAllListener(p);
		p.columnWkCostQty_wk_cost_qty.addAllListener(p);
		p.columnWkCostQty_wk_cost_qty.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[WkCostQty]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_WkCostQty(MAUBP_WkCostQty_D p){
		p.columnWkCostQty_wk_cost_qty.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[WkCostQty]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_WkCostQty(MAUBP_WkCostQty_D p){
		p.columnWkCostQty_wk_cost_qty.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[WkCostQty]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_WkCostQty(MAUBP_WkCostQty_D p){
		p.columnWkCostQty_wk_cost_qty.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[WkCostQty]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_WkCostQty(MAUBP_WkCostQty_D p){
		p.columnWkCostQty_wk_cost_qty.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[WkCostQty]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_WkCostQty(MAUBP_WkCostQty_D p){
		p.columnWkCostQty_wk_cost_qty.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_WkCostQty_D_MC.setTableConfigWkCostQty((MAUBP_WkCostQty_D)this);
	}

	/**
	 * [WkCostQty]ブロックのTableの設定
	 */
	protected static void setTableConfigWkCostQty(MAUBP_WkCostQty_D p) {
		p.columnWkCostQty_wk_cost_qty.setMeta(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.wk_cost_qty_META);
		p.WkCostQtyTable.addColumnConfig(p.columnWkCostQty_wk_cost_qty);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
		if (vc == WkCostQtyTable) return doWkCostQty_VC(info);
		if (vc == columnWkCostQty_wk_cost_qty) return doWkCostQty_wk_cost_qty_VC(info);
		return true;
	}

	/**
	 * [WkCostQty]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWkCostQty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [WkCostQty]パネルの[wk_cost_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWkCostQty_wk_cost_qty_VC(MCEventInfo info){
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
		if (nc == WkCostQtyTable) doWkCostQty_NC(info);
		else if (nc == columnWkCostQty_wk_cost_qty) doWkCostQty_wk_cost_qty_NC(info);
	}

	/**
	 * [WkCostQty]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_NC(MCEventInfo info){
	}

	/**
	 * [WkCostQty]パネルの[wk_cost_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_wk_cost_qty_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == WkCostQtyTable) doWkCostQty_NE(info);
		else if (ne == columnWkCostQty_wk_cost_qty) doWkCostQty_wk_cost_qty_NE(info);
	}

	/**
	 * [WkCostQty]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_NE(MCEventInfo info){
	}

	/**
	 * [WkCostQty]パネルの[wk_cost_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_wk_cost_qty_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == WkCostQtyTable) doWkCostQty_NX(info);
		else if (nx == columnWkCostQty_wk_cost_qty) doWkCostQty_wk_cost_qty_NX(info);
	}

	/**
	 * [WkCostQty]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_NX(MCEventInfo info){
	}

	/**
	 * [WkCostQty]パネルの[wk_cost_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_wk_cost_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnWkCostQty_wk_cost_qty) doWkCostQty_wk_cost_qty_LC(info);
	}

	/**
	 * [WkCostQty]パネルの[wk_cost_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWkCostQty_wk_cost_qty_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}