package mcframe.clientMAUB.MAUBP5390;

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
 * 画面"MAUBP_Xrate_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Xrate_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5390";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Xrate]ブロック関連のField定義
	public MCPanel XratePanel = null;
	public MCScrollPane XrateScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5390.XrateR> XrateTable = null;
	// [Xrate]ブロックの項目のField定義
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnXrate_xrate = null;
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
	
	/** [Xrate]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5390.XrateR> aXrateL;

	/**
	 * コピーによってaXrateLを設定します。
	 *
	 * aXrateLのインスタンスは変更されません。
	 *
	 * @param dataset XrateL
	 */
	public void setXrateL(MCList<mcframe.clientMAUB.MAUBP5390.XrateR> aList) {
		if (getXrateL() != aList) {
			getXrateL().setAll(aList);
		}
	}

	/**
	 * [Xrate]ブロックのコンテナaXrateLを返します。
	 *
	 * @return XrateL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5390.XrateR> getXrateL() {
		return aXrateL;
	}

	/**
	 * aXrateRを作成します。
	 *
	 * @return XrateR
	 */
	public mcframe.clientMAUB.MAUBP5390.XrateR createXrateR() {
		return mcframe.clientMAUB.MAUBP5390.XrateR.create();
	}

	/**
	 * aXrateLを作成します。
	 *
	 * @return XrateL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5390.XrateR> createXrateL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5390.XrateR.class);
	}

	/**
	 * XrateTableを初期化します。
	 */
	protected void createXrateTable(){
		if(XrateTable == null){
			XrateTable = beansFactory.createTable2("Xrate.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getXrateL())) ret.add(getXrateL());
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
		if(aCnt == getXrateL()) return "Xrate";
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
		if(bId.equals("Xrate")) return getXrateL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(XratePanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Xrate_D_MC_A() {
		aXrateL = createXrateL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Xrate_D_MC_A(String name) {
		aXrateL = createXrateL();
		createXrateTable();
		XrateTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Xrate_D_MC.jbCreateXrate((MAUBP_Xrate_D)this);
	}

	/**
	 * [Xrate]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateXrate(MAUBP_Xrate_D p) {
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
	public static MAUBP_Xrate_D create(){
		MAUBP_Xrate_D p = new MAUBP_Xrate_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Xrate_D create(String name){
		MAUBP_Xrate_D p = new MAUBP_Xrate_D(name);
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
		MAUBP_Xrate_D_MC.jbfInitXrate((MAUBP_Xrate_D)this);
		MAUBP_Xrate_D_MC.jbInitXrate((MAUBP_Xrate_D)this);
	}

	/**
	 * [Xrate]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitXrate(MAUBP_Xrate_D p) {
		// ブロック関連の初期化
		p.XratePanel = p.beansFactory.createPanel("Xrate");
		p.XrateScrollPane = p.beansFactory.createScrollPane("Xrate.scroll");
		p.createXrateTable();
		// ブロックの項目の初期化
		p.columnXrate_xrate = p.beansFactory.createTableColumn("Xrate.xrate", MCColumnType.NUMBER);
	}

	/**
	 * [Xrate]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitXrate(MAUBP_Xrate_D p) {
		// ブロック関連の初期化
		p.add(p.XratePanel);
		p.setLastBeans(p.XratePanel);
		p.XratePanel.add(p.XrateScrollPane);
		p.XratePanel.setLastBeans(p.XrateTable);
		p.XrateScrollPane.setViewportView(p.XrateTable);
		p.XrateTable.setList(p.getXrateL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Xrate_D_MC.mcInitXrate((MAUBP_Xrate_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Xrate_D_MC.statusInitENABLE_Xrate((MAUBP_Xrate_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_Xrate_D_MC.statusInitDISABLE_Xrate((MAUBP_Xrate_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Xrate_D_MC.statusInitREAD__ONLY_Xrate((MAUBP_Xrate_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Xrate_D_MC.statusInitREQUIRED_Xrate((MAUBP_Xrate_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_Xrate_D_MC.statusInitINVISIBLE_Xrate((MAUBP_Xrate_D)this);

	}

	/**
	 *  [Xrate]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitXrate(MAUBP_Xrate_D p) {
		p.XrateTable.addAllListener(p);
		p.columnXrate_xrate.addAllListener(p);
		p.columnXrate_xrate.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Xrate]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Xrate(MAUBP_Xrate_D p){
		p.columnXrate_xrate.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[Xrate]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_Xrate(MAUBP_Xrate_D p){
		p.columnXrate_xrate.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Xrate]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Xrate(MAUBP_Xrate_D p){
		p.columnXrate_xrate.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[Xrate]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Xrate(MAUBP_Xrate_D p){
		p.columnXrate_xrate.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[Xrate]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_Xrate(MAUBP_Xrate_D p){
		p.columnXrate_xrate.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_Xrate_D_MC.setTableConfigXrate((MAUBP_Xrate_D)this);
	}

	/**
	 * [Xrate]ブロックのTableの設定
	 */
	protected static void setTableConfigXrate(MAUBP_Xrate_D p) {
		p.columnXrate_xrate.setMeta(mcframe.clientMAUB.MAUBP5390.XrateR.xrate_META);
		p.XrateTable.addColumnConfig(p.columnXrate_xrate);
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
		if (vc == XrateTable) return doXrate_VC(info);
		if (vc == columnXrate_xrate) return doXrate_xrate_VC(info);
		return true;
	}

	/**
	 * [Xrate]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doXrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Xrate]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doXrate_xrate_VC(MCEventInfo info){
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
		if (nc == XrateTable) doXrate_NC(info);
		else if (nc == columnXrate_xrate) doXrate_xrate_NC(info);
	}

	/**
	 * [Xrate]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_NC(MCEventInfo info){
	}

	/**
	 * [Xrate]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_xrate_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == XrateTable) doXrate_NE(info);
		else if (ne == columnXrate_xrate) doXrate_xrate_NE(info);
	}

	/**
	 * [Xrate]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_NE(MCEventInfo info){
	}

	/**
	 * [Xrate]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_xrate_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == XrateTable) doXrate_NX(info);
		else if (nx == columnXrate_xrate) doXrate_xrate_NX(info);
	}

	/**
	 * [Xrate]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_NX(MCEventInfo info){
	}

	/**
	 * [Xrate]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_xrate_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnXrate_xrate) doXrate_xrate_LC(info);
	}

	/**
	 * [Xrate]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrate_xrate_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}