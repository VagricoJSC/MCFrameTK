package mcframe.clientMAUB.MAUBP5280;

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
 * 画面"MAUBP_StdContFctr_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_StdContFctr_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [StdContFctr]ブロック関連のField定義
	public MCPanel StdContFctrPanel = null;
	public MCScrollPane StdContFctrScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5280.StdContFctrR> StdContFctrTable = null;
	// [StdContFctr]ブロックの項目のField定義
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCColumnConfig columnStdContFctr_std_cont_fctr = null;
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
	
	/** [StdContFctr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5280.StdContFctrR> aStdContFctrL;

	/**
	 * コピーによってaStdContFctrLを設定します。
	 *
	 * aStdContFctrLのインスタンスは変更されません。
	 *
	 * @param dataset StdContFctrL
	 */
	public void setStdContFctrL(MCList<mcframe.clientMAUB.MAUBP5280.StdContFctrR> aList) {
		if (getStdContFctrL() != aList) {
			getStdContFctrL().setAll(aList);
		}
	}

	/**
	 * [StdContFctr]ブロックのコンテナaStdContFctrLを返します。
	 *
	 * @return StdContFctrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5280.StdContFctrR> getStdContFctrL() {
		return aStdContFctrL;
	}

	/**
	 * aStdContFctrRを作成します。
	 *
	 * @return StdContFctrR
	 */
	public mcframe.clientMAUB.MAUBP5280.StdContFctrR createStdContFctrR() {
		return mcframe.clientMAUB.MAUBP5280.StdContFctrR.create();
	}

	/**
	 * aStdContFctrLを作成します。
	 *
	 * @return StdContFctrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5280.StdContFctrR> createStdContFctrL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	}

	/**
	 * StdContFctrTableを初期化します。
	 */
	protected void createStdContFctrTable(){
		if(StdContFctrTable == null){
			StdContFctrTable = beansFactory.createTable2("StdContFctr.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getStdContFctrL())) ret.add(getStdContFctrL());
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
		if(aCnt == getStdContFctrL()) return "StdContFctr";
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
		if(bId.equals("StdContFctr")) return getStdContFctrL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(StdContFctrPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StdContFctr_D_MC_A() {
		aStdContFctrL = createStdContFctrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_StdContFctr_D_MC_A(String name) {
		aStdContFctrL = createStdContFctrL();
		createStdContFctrTable();
		StdContFctrTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_StdContFctr_D_MC.jbCreateStdContFctr((MAUBP_StdContFctr_D)this);
	}

	/**
	 * [StdContFctr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStdContFctr(MAUBP_StdContFctr_D p) {
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
	public static MAUBP_StdContFctr_D create(){
		MAUBP_StdContFctr_D p = new MAUBP_StdContFctr_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_StdContFctr_D create(String name){
		MAUBP_StdContFctr_D p = new MAUBP_StdContFctr_D(name);
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
		MAUBP_StdContFctr_D_MC.jbfInitStdContFctr((MAUBP_StdContFctr_D)this);
		MAUBP_StdContFctr_D_MC.jbInitStdContFctr((MAUBP_StdContFctr_D)this);
	}

	/**
	 * [StdContFctr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStdContFctr(MAUBP_StdContFctr_D p) {
		// ブロック関連の初期化
		p.StdContFctrPanel = p.beansFactory.createPanel("StdContFctr");
		p.StdContFctrScrollPane = p.beansFactory.createScrollPane("StdContFctr.scroll");
		p.createStdContFctrTable();
		// ブロックの項目の初期化
		p.columnStdContFctr_std_cont_fctr = p.beansFactory.createTableColumn("StdContFctr.std_cont_fctr", MCColumnType.NUMBER);
	}

	/**
	 * [StdContFctr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStdContFctr(MAUBP_StdContFctr_D p) {
		// ブロック関連の初期化
		p.add(p.StdContFctrPanel);
		p.setLastBeans(p.StdContFctrPanel);
		p.StdContFctrPanel.add(p.StdContFctrScrollPane);
		p.StdContFctrPanel.setLastBeans(p.StdContFctrTable);
		p.StdContFctrScrollPane.setViewportView(p.StdContFctrTable);
		p.StdContFctrTable.setList(p.getStdContFctrL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_StdContFctr_D_MC.mcInitStdContFctr((MAUBP_StdContFctr_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_StdContFctr_D_MC.statusInitENABLE_StdContFctr((MAUBP_StdContFctr_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_StdContFctr_D_MC.statusInitDISABLE_StdContFctr((MAUBP_StdContFctr_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_StdContFctr_D_MC.statusInitREAD__ONLY_StdContFctr((MAUBP_StdContFctr_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_StdContFctr_D_MC.statusInitREQUIRED_StdContFctr((MAUBP_StdContFctr_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_StdContFctr_D_MC.statusInitINVISIBLE_StdContFctr((MAUBP_StdContFctr_D)this);

	}

	/**
	 *  [StdContFctr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStdContFctr(MAUBP_StdContFctr_D p) {
		p.StdContFctrTable.addAllListener(p);
		p.columnStdContFctr_std_cont_fctr.addAllListener(p);
		p.columnStdContFctr_std_cont_fctr.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[StdContFctr]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_StdContFctr(MAUBP_StdContFctr_D p){
		p.columnStdContFctr_std_cont_fctr.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[StdContFctr]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_StdContFctr(MAUBP_StdContFctr_D p){
		p.columnStdContFctr_std_cont_fctr.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[StdContFctr]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_StdContFctr(MAUBP_StdContFctr_D p){
		p.columnStdContFctr_std_cont_fctr.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[StdContFctr]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_StdContFctr(MAUBP_StdContFctr_D p){
		p.columnStdContFctr_std_cont_fctr.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[StdContFctr]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_StdContFctr(MAUBP_StdContFctr_D p){
		p.columnStdContFctr_std_cont_fctr.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_StdContFctr_D_MC.setTableConfigStdContFctr((MAUBP_StdContFctr_D)this);
	}

	/**
	 * [StdContFctr]ブロックのTableの設定
	 */
	protected static void setTableConfigStdContFctr(MAUBP_StdContFctr_D p) {
		p.columnStdContFctr_std_cont_fctr.setMeta(mcframe.clientMAUB.MAUBP5280.StdContFctrR.std_cont_fctr_META);
		p.StdContFctrTable.addColumnConfig(p.columnStdContFctr_std_cont_fctr);
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
		if (vc == StdContFctrTable) return doStdContFctr_VC(info);
		if (vc == columnStdContFctr_std_cont_fctr) return doStdContFctr_std_cont_fctr_VC(info);
		return true;
	}

	/**
	 * [StdContFctr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdContFctr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdContFctr]パネルの[std_cont_fctr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdContFctr_std_cont_fctr_VC(MCEventInfo info){
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
		if (nc == StdContFctrTable) doStdContFctr_NC(info);
		else if (nc == columnStdContFctr_std_cont_fctr) doStdContFctr_std_cont_fctr_NC(info);
	}

	/**
	 * [StdContFctr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_NC(MCEventInfo info){
	}

	/**
	 * [StdContFctr]パネルの[std_cont_fctr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_std_cont_fctr_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == StdContFctrTable) doStdContFctr_NE(info);
		else if (ne == columnStdContFctr_std_cont_fctr) doStdContFctr_std_cont_fctr_NE(info);
	}

	/**
	 * [StdContFctr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_NE(MCEventInfo info){
	}

	/**
	 * [StdContFctr]パネルの[std_cont_fctr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_std_cont_fctr_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == StdContFctrTable) doStdContFctr_NX(info);
		else if (nx == columnStdContFctr_std_cont_fctr) doStdContFctr_std_cont_fctr_NX(info);
	}

	/**
	 * [StdContFctr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_NX(MCEventInfo info){
	}

	/**
	 * [StdContFctr]パネルの[std_cont_fctr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_std_cont_fctr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnStdContFctr_std_cont_fctr) doStdContFctr_std_cont_fctr_LC(info);
	}

	/**
	 * [StdContFctr]パネルの[std_cont_fctr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdContFctr_std_cont_fctr_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}