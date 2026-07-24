package mcframe.clientMAUB.MAUBP5290;

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
 * 画面"MAUBP_ActContFctr_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ActContFctr_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5290";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ActContFctr]ブロック関連のField定義
	public MCPanel ActContFctrPanel = null;
	public MCScrollPane ActContFctrScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5290.ActContFctrR> ActContFctrTable = null;
	// [ActContFctr]ブロックの項目のField定義
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCColumnConfig columnActContFctr_act_cont_fctr = null;
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
	
	/** [ActContFctr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5290.ActContFctrR> aActContFctrL;

	/**
	 * コピーによってaActContFctrLを設定します。
	 *
	 * aActContFctrLのインスタンスは変更されません。
	 *
	 * @param dataset ActContFctrL
	 */
	public void setActContFctrL(MCList<mcframe.clientMAUB.MAUBP5290.ActContFctrR> aList) {
		if (getActContFctrL() != aList) {
			getActContFctrL().setAll(aList);
		}
	}

	/**
	 * [ActContFctr]ブロックのコンテナaActContFctrLを返します。
	 *
	 * @return ActContFctrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5290.ActContFctrR> getActContFctrL() {
		return aActContFctrL;
	}

	/**
	 * aActContFctrRを作成します。
	 *
	 * @return ActContFctrR
	 */
	public mcframe.clientMAUB.MAUBP5290.ActContFctrR createActContFctrR() {
		return mcframe.clientMAUB.MAUBP5290.ActContFctrR.create();
	}

	/**
	 * aActContFctrLを作成します。
	 *
	 * @return ActContFctrL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5290.ActContFctrR> createActContFctrL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	}

	/**
	 * ActContFctrTableを初期化します。
	 */
	protected void createActContFctrTable(){
		if(ActContFctrTable == null){
			ActContFctrTable = beansFactory.createTable2("ActContFctr.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getActContFctrL())) ret.add(getActContFctrL());
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
		if(aCnt == getActContFctrL()) return "ActContFctr";
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
		if(bId.equals("ActContFctr")) return getActContFctrL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ActContFctrPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ActContFctr_D_MC_A() {
		aActContFctrL = createActContFctrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_ActContFctr_D_MC_A(String name) {
		aActContFctrL = createActContFctrL();
		createActContFctrTable();
		ActContFctrTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ActContFctr_D_MC.jbCreateActContFctr((MAUBP_ActContFctr_D)this);
	}

	/**
	 * [ActContFctr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateActContFctr(MAUBP_ActContFctr_D p) {
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
	public static MAUBP_ActContFctr_D create(){
		MAUBP_ActContFctr_D p = new MAUBP_ActContFctr_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ActContFctr_D create(String name){
		MAUBP_ActContFctr_D p = new MAUBP_ActContFctr_D(name);
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
		MAUBP_ActContFctr_D_MC.jbfInitActContFctr((MAUBP_ActContFctr_D)this);
		MAUBP_ActContFctr_D_MC.jbInitActContFctr((MAUBP_ActContFctr_D)this);
	}

	/**
	 * [ActContFctr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitActContFctr(MAUBP_ActContFctr_D p) {
		// ブロック関連の初期化
		p.ActContFctrPanel = p.beansFactory.createPanel("ActContFctr");
		p.ActContFctrScrollPane = p.beansFactory.createScrollPane("ActContFctr.scroll");
		p.createActContFctrTable();
		// ブロックの項目の初期化
		p.columnActContFctr_act_cont_fctr = p.beansFactory.createTableColumn("ActContFctr.act_cont_fctr", MCColumnType.NUMBER);
	}

	/**
	 * [ActContFctr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitActContFctr(MAUBP_ActContFctr_D p) {
		// ブロック関連の初期化
		p.add(p.ActContFctrPanel);
		p.setLastBeans(p.ActContFctrPanel);
		p.ActContFctrPanel.add(p.ActContFctrScrollPane);
		p.ActContFctrPanel.setLastBeans(p.ActContFctrTable);
		p.ActContFctrScrollPane.setViewportView(p.ActContFctrTable);
		p.ActContFctrTable.setList(p.getActContFctrL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ActContFctr_D_MC.mcInitActContFctr((MAUBP_ActContFctr_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ActContFctr_D_MC.statusInitENABLE_ActContFctr((MAUBP_ActContFctr_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ActContFctr_D_MC.statusInitDISABLE_ActContFctr((MAUBP_ActContFctr_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ActContFctr_D_MC.statusInitREAD__ONLY_ActContFctr((MAUBP_ActContFctr_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ActContFctr_D_MC.statusInitREQUIRED_ActContFctr((MAUBP_ActContFctr_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ActContFctr_D_MC.statusInitINVISIBLE_ActContFctr((MAUBP_ActContFctr_D)this);

	}

	/**
	 *  [ActContFctr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitActContFctr(MAUBP_ActContFctr_D p) {
		p.ActContFctrTable.addAllListener(p);
		p.columnActContFctr_act_cont_fctr.addAllListener(p);
		p.columnActContFctr_act_cont_fctr.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ActContFctr]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ActContFctr(MAUBP_ActContFctr_D p){
		p.columnActContFctr_act_cont_fctr.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[ActContFctr]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ActContFctr(MAUBP_ActContFctr_D p){
		p.columnActContFctr_act_cont_fctr.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ActContFctr]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ActContFctr(MAUBP_ActContFctr_D p){
		p.columnActContFctr_act_cont_fctr.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ActContFctr]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ActContFctr(MAUBP_ActContFctr_D p){
		p.columnActContFctr_act_cont_fctr.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[ActContFctr]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ActContFctr(MAUBP_ActContFctr_D p){
		p.columnActContFctr_act_cont_fctr.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_ActContFctr_D_MC.setTableConfigActContFctr((MAUBP_ActContFctr_D)this);
	}

	/**
	 * [ActContFctr]ブロックのTableの設定
	 */
	protected static void setTableConfigActContFctr(MAUBP_ActContFctr_D p) {
		p.columnActContFctr_act_cont_fctr.setMeta(mcframe.clientMAUB.MAUBP5290.ActContFctrR.act_cont_fctr_META);
		p.ActContFctrTable.addColumnConfig(p.columnActContFctr_act_cont_fctr);
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
		if (vc == ActContFctrTable) return doActContFctr_VC(info);
		if (vc == columnActContFctr_act_cont_fctr) return doActContFctr_act_cont_fctr_VC(info);
		return true;
	}

	/**
	 * [ActContFctr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doActContFctr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ActContFctr]パネルの[act_cont_fctr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doActContFctr_act_cont_fctr_VC(MCEventInfo info){
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
		if (nc == ActContFctrTable) doActContFctr_NC(info);
		else if (nc == columnActContFctr_act_cont_fctr) doActContFctr_act_cont_fctr_NC(info);
	}

	/**
	 * [ActContFctr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_NC(MCEventInfo info){
	}

	/**
	 * [ActContFctr]パネルの[act_cont_fctr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_act_cont_fctr_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ActContFctrTable) doActContFctr_NE(info);
		else if (ne == columnActContFctr_act_cont_fctr) doActContFctr_act_cont_fctr_NE(info);
	}

	/**
	 * [ActContFctr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_NE(MCEventInfo info){
	}

	/**
	 * [ActContFctr]パネルの[act_cont_fctr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_act_cont_fctr_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ActContFctrTable) doActContFctr_NX(info);
		else if (nx == columnActContFctr_act_cont_fctr) doActContFctr_act_cont_fctr_NX(info);
	}

	/**
	 * [ActContFctr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_NX(MCEventInfo info){
	}

	/**
	 * [ActContFctr]パネルの[act_cont_fctr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_act_cont_fctr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnActContFctr_act_cont_fctr) doActContFctr_act_cont_fctr_LC(info);
	}

	/**
	 * [ActContFctr]パネルの[act_cont_fctr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doActContFctr_act_cont_fctr_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}