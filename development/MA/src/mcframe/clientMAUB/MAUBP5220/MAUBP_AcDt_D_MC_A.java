package mcframe.clientMAUB.MAUBP5220;

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
 * 画面"MAUBP_AcDt_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_AcDt_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [AcDt]ブロック関連のField定義
	public MCPanel AcDtPanel = null;
	public MCScrollPane AcDtScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5220.AcDtR> AcDtTable = null;
	// [AcDt]ブロックの項目のField定義
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnAcDt_ac_dt = null;
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
	
	/** [AcDt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5220.AcDtR> aAcDtL;

	/**
	 * コピーによってaAcDtLを設定します。
	 *
	 * aAcDtLのインスタンスは変更されません。
	 *
	 * @param dataset AcDtL
	 */
	public void setAcDtL(MCList<mcframe.clientMAUB.MAUBP5220.AcDtR> aList) {
		if (getAcDtL() != aList) {
			getAcDtL().setAll(aList);
		}
	}

	/**
	 * [AcDt]ブロックのコンテナaAcDtLを返します。
	 *
	 * @return AcDtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5220.AcDtR> getAcDtL() {
		return aAcDtL;
	}

	/**
	 * aAcDtRを作成します。
	 *
	 * @return AcDtR
	 */
	public mcframe.clientMAUB.MAUBP5220.AcDtR createAcDtR() {
		return mcframe.clientMAUB.MAUBP5220.AcDtR.create();
	}

	/**
	 * aAcDtLを作成します。
	 *
	 * @return AcDtL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5220.AcDtR> createAcDtL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	}

	/**
	 * AcDtTableを初期化します。
	 */
	protected void createAcDtTable(){
		if(AcDtTable == null){
			AcDtTable = beansFactory.createTable2("AcDt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAcDtL())) ret.add(getAcDtL());
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
		if(aCnt == getAcDtL()) return "AcDt";
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
		if(bId.equals("AcDt")) return getAcDtL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(AcDtPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_AcDt_D_MC_A() {
		aAcDtL = createAcDtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_AcDt_D_MC_A(String name) {
		aAcDtL = createAcDtL();
		createAcDtTable();
		AcDtTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_AcDt_D_MC.jbCreateAcDt((MAUBP_AcDt_D)this);
	}

	/**
	 * [AcDt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAcDt(MAUBP_AcDt_D p) {
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
	public static MAUBP_AcDt_D create(){
		MAUBP_AcDt_D p = new MAUBP_AcDt_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_AcDt_D create(String name){
		MAUBP_AcDt_D p = new MAUBP_AcDt_D(name);
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
		MAUBP_AcDt_D_MC.jbfInitAcDt((MAUBP_AcDt_D)this);
		MAUBP_AcDt_D_MC.jbInitAcDt((MAUBP_AcDt_D)this);
	}

	/**
	 * [AcDt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAcDt(MAUBP_AcDt_D p) {
		// ブロック関連の初期化
		p.AcDtPanel = p.beansFactory.createPanel("AcDt");
		p.AcDtScrollPane = p.beansFactory.createScrollPane("AcDt.scroll");
		p.createAcDtTable();
		// ブロックの項目の初期化
		p.columnAcDt_ac_dt = p.beansFactory.createTableColumn("AcDt.ac_dt", MCColumnType.DATE);
	}

	/**
	 * [AcDt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAcDt(MAUBP_AcDt_D p) {
		// ブロック関連の初期化
		p.add(p.AcDtPanel);
		p.setLastBeans(p.AcDtPanel);
		p.AcDtPanel.add(p.AcDtScrollPane);
		p.AcDtPanel.setLastBeans(p.AcDtTable);
		p.AcDtScrollPane.setViewportView(p.AcDtTable);
		p.AcDtTable.setList(p.getAcDtL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_AcDt_D_MC.mcInitAcDt((MAUBP_AcDt_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_AcDt_D_MC.statusInitENABLE_AcDt((MAUBP_AcDt_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_AcDt_D_MC.statusInitDISABLE_AcDt((MAUBP_AcDt_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_AcDt_D_MC.statusInitREAD__ONLY_AcDt((MAUBP_AcDt_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_AcDt_D_MC.statusInitREQUIRED_AcDt((MAUBP_AcDt_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_AcDt_D_MC.statusInitINVISIBLE_AcDt((MAUBP_AcDt_D)this);

	}

	/**
	 *  [AcDt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAcDt(MAUBP_AcDt_D p) {
		p.AcDtTable.addAllListener(p);
		p.columnAcDt_ac_dt.addAllListener(p);
		p.columnAcDt_ac_dt.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[AcDt]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_AcDt(MAUBP_AcDt_D p){
		p.columnAcDt_ac_dt.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [DISABLE]ステータスの[AcDt]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_AcDt(MAUBP_AcDt_D p){
		p.columnAcDt_ac_dt.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[AcDt]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_AcDt(MAUBP_AcDt_D p){
		p.columnAcDt_ac_dt.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[AcDt]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_AcDt(MAUBP_AcDt_D p){
		p.columnAcDt_ac_dt.putMode(p, REQUIRED, MCMode.REQUIRED);

	}

	/**
	 * [INVISIBLE]ステータスの[AcDt]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_AcDt(MAUBP_AcDt_D p){
		p.columnAcDt_ac_dt.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_AcDt_D_MC.setTableConfigAcDt((MAUBP_AcDt_D)this);
	}

	/**
	 * [AcDt]ブロックのTableの設定
	 */
	protected static void setTableConfigAcDt(MAUBP_AcDt_D p) {
		p.columnAcDt_ac_dt.setMeta(mcframe.clientMAUB.MAUBP5220.AcDtR.ac_dt_META);
		p.columnAcDt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AcDtTable.addColumnConfig(p.columnAcDt_ac_dt);
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
		if (vc == AcDtTable) return doAcDt_VC(info);
		if (vc == columnAcDt_ac_dt) return doAcDt_ac_dt_VC(info);
		return true;
	}

	/**
	 * [AcDt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAcDt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AcDt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAcDt_ac_dt_VC(MCEventInfo info){
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
		if (nc == AcDtTable) doAcDt_NC(info);
		else if (nc == columnAcDt_ac_dt) doAcDt_ac_dt_NC(info);
	}

	/**
	 * [AcDt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_NC(MCEventInfo info){
	}

	/**
	 * [AcDt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == AcDtTable) doAcDt_NE(info);
		else if (ne == columnAcDt_ac_dt) doAcDt_ac_dt_NE(info);
	}

	/**
	 * [AcDt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_NE(MCEventInfo info){
	}

	/**
	 * [AcDt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == AcDtTable) doAcDt_NX(info);
		else if (nx == columnAcDt_ac_dt) doAcDt_ac_dt_NX(info);
	}

	/**
	 * [AcDt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_NX(MCEventInfo info){
	}

	/**
	 * [AcDt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnAcDt_ac_dt) doAcDt_ac_dt_LC(info);
	}

	/**
	 * [AcDt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAcDt_ac_dt_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}