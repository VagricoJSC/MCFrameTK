package mcframe.clientMAUB.MAUBP5270;

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
 * 画面"MAUBP_ContFctrUnit_D"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_ContFctrUnit_D_MC_A extends mcframe.clientMAUD.MAUDP0060.MAUDP_DPartsBase{
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
	public static final String SCREEN_ID = "MAUBP5270";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ContFctrUnit]ブロック関連のField定義
	public MCPanel ContFctrUnitPanel = null;
	public MCScrollPane ContFctrUnitScrollPane = null;
	public MCTable2<mcframe.clientMAUB.MAUBP5270.ContFctrUnitR> ContFctrUnitTable = null;
	// [ContFctrUnit]ブロックの項目のField定義
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnContFctrUnit_cont_fctr_unit_cd = null;
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public MCColumnConfig columnContFctrUnit_cont_fctr_unit_nm = null;
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
	
	/** [ContFctrUnit]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUB.MAUBP5270.ContFctrUnitR> aContFctrUnitL;

	/**
	 * コピーによってaContFctrUnitLを設定します。
	 *
	 * aContFctrUnitLのインスタンスは変更されません。
	 *
	 * @param dataset ContFctrUnitL
	 */
	public void setContFctrUnitL(MCList<mcframe.clientMAUB.MAUBP5270.ContFctrUnitR> aList) {
		if (getContFctrUnitL() != aList) {
			getContFctrUnitL().setAll(aList);
		}
	}

	/**
	 * [ContFctrUnit]ブロックのコンテナaContFctrUnitLを返します。
	 *
	 * @return ContFctrUnitL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5270.ContFctrUnitR> getContFctrUnitL() {
		return aContFctrUnitL;
	}

	/**
	 * aContFctrUnitRを作成します。
	 *
	 * @return ContFctrUnitR
	 */
	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR createContFctrUnitR() {
		return mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.create();
	}

	/**
	 * aContFctrUnitLを作成します。
	 *
	 * @return ContFctrUnitL
	 */
	public MCList<mcframe.clientMAUB.MAUBP5270.ContFctrUnitR> createContFctrUnitL() {
		return MCList.create(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	}

	/**
	 * ContFctrUnitTableを初期化します。
	 */
	protected void createContFctrUnitTable(){
		if(ContFctrUnitTable == null){
			ContFctrUnitTable = beansFactory.createTable2("ContFctrUnit.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getContFctrUnitL())) ret.add(getContFctrUnitL());
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
		if(aCnt == getContFctrUnitL()) return "ContFctrUnit";
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
		if(bId.equals("ContFctrUnit")) return getContFctrUnitL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ContFctrUnitPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ContFctrUnit_D_MC_A() {
		aContFctrUnitL = createContFctrUnitL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_ContFctrUnit_D_MC_A(String name) {
		aContFctrUnitL = createContFctrUnitL();
		createContFctrUnitTable();
		ContFctrUnitTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_ContFctrUnit_D_MC.jbCreateContFctrUnit((MAUBP_ContFctrUnit_D)this);
	}

	/**
	 * [ContFctrUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateContFctrUnit(MAUBP_ContFctrUnit_D p) {
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
	public static MAUBP_ContFctrUnit_D create(){
		MAUBP_ContFctrUnit_D p = new MAUBP_ContFctrUnit_D();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_ContFctrUnit_D create(String name){
		MAUBP_ContFctrUnit_D p = new MAUBP_ContFctrUnit_D(name);
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
		MAUBP_ContFctrUnit_D_MC.jbfInitContFctrUnit((MAUBP_ContFctrUnit_D)this);
		MAUBP_ContFctrUnit_D_MC.jbInitContFctrUnit((MAUBP_ContFctrUnit_D)this);
	}

	/**
	 * [ContFctrUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitContFctrUnit(MAUBP_ContFctrUnit_D p) {
		// ブロック関連の初期化
		p.ContFctrUnitPanel = p.beansFactory.createPanel("ContFctrUnit");
		p.ContFctrUnitScrollPane = p.beansFactory.createScrollPane("ContFctrUnit.scroll");
		p.createContFctrUnitTable();
		// ブロックの項目の初期化
		p.columnContFctrUnit_cont_fctr_unit_cd = p.beansFactory.createTableColumn("ContFctrUnit.cont_fctr_unit_cd", MCColumnType.TEXT);
		p.columnContFctrUnit_cont_fctr_unit_nm = p.beansFactory.createTableColumn("ContFctrUnit.cont_fctr_unit_nm", MCColumnType.TEXT);
	}

	/**
	 * [ContFctrUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitContFctrUnit(MAUBP_ContFctrUnit_D p) {
		// ブロック関連の初期化
		p.add(p.ContFctrUnitPanel);
		p.setLastBeans(p.ContFctrUnitPanel);
		p.ContFctrUnitPanel.add(p.ContFctrUnitScrollPane);
		p.ContFctrUnitPanel.setLastBeans(p.ContFctrUnitTable);
		p.ContFctrUnitScrollPane.setViewportView(p.ContFctrUnitTable);
		p.ContFctrUnitTable.setList(p.getContFctrUnitL());
		// ブロックの項目の初期化
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_ContFctrUnit_D_MC.mcInitContFctrUnit((MAUBP_ContFctrUnit_D)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_D_MC.statusInitENABLE_ContFctrUnit((MAUBP_ContFctrUnit_D)this);

		// [DISABLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_D_MC.statusInitDISABLE_ContFctrUnit((MAUBP_ContFctrUnit_D)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_ContFctrUnit_D_MC.statusInitREAD__ONLY_ContFctrUnit((MAUBP_ContFctrUnit_D)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_ContFctrUnit_D_MC.statusInitREQUIRED_ContFctrUnit((MAUBP_ContFctrUnit_D)this);

		// [INVISIBLE]ステータスのモードの設定
		MAUBP_ContFctrUnit_D_MC.statusInitINVISIBLE_ContFctrUnit((MAUBP_ContFctrUnit_D)this);

	}

	/**
	 *  [ContFctrUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitContFctrUnit(MAUBP_ContFctrUnit_D p) {
		p.ContFctrUnitTable.addAllListener(p);
		p.columnContFctrUnit_cont_fctr_unit_cd.addAllListener(p);
		p.columnContFctrUnit_cont_fctr_unit_cd.setListListener(p);
		p.columnContFctrUnit_cont_fctr_unit_nm.addAllListener(p);
		p.columnContFctrUnit_cont_fctr_unit_nm.setListListener(p);
	}

	/**
	 * [ENABLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_ContFctrUnit(MAUBP_ContFctrUnit_D p){
		p.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, ENABLE, MCMode.READ_ONLY);

	}

	/**
	 * [DISABLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitDISABLE_ContFctrUnit(MAUBP_ContFctrUnit_D p){
		p.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, DISABLE, MCMode.DISABLE);
		p.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, DISABLE, MCMode.DISABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_ContFctrUnit(MAUBP_ContFctrUnit_D p){
		p.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * [REQUIRED]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_ContFctrUnit(MAUBP_ContFctrUnit_D p){
		p.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);

	}

	/**
	 * [INVISIBLE]ステータスの[ContFctrUnit]ブロックのモードの設定
	 */
	protected static void statusInitINVISIBLE_ContFctrUnit(MAUBP_ContFctrUnit_D p){
		p.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, INVISIBLE, MCMode.INVISIBLE);
		p.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, INVISIBLE, MCMode.INVISIBLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUBP_ContFctrUnit_D_MC.setTableConfigContFctrUnit((MAUBP_ContFctrUnit_D)this);
	}

	/**
	 * [ContFctrUnit]ブロックのTableの設定
	 */
	protected static void setTableConfigContFctrUnit(MAUBP_ContFctrUnit_D p) {
		p.columnContFctrUnit_cont_fctr_unit_cd.setMeta(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.cont_fctr_unit_cd_META);
		p.ContFctrUnitTable.addColumnConfig(p.columnContFctrUnit_cont_fctr_unit_cd);
		p.columnContFctrUnit_cont_fctr_unit_nm.setMeta(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.cont_fctr_unit_nm_META);
		p.ContFctrUnitTable.addColumnConfig(p.columnContFctrUnit_cont_fctr_unit_nm);
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
		if (vc == ContFctrUnitTable) return doContFctrUnit_VC(info);
		if (vc == columnContFctrUnit_cont_fctr_unit_cd) return doContFctrUnit_cont_fctr_unit_cd_VC(info);
		if (vc == columnContFctrUnit_cont_fctr_unit_nm) return doContFctrUnit_cont_fctr_unit_nm_VC(info);
		return true;
	}

	/**
	 * [ContFctrUnit]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContFctrUnit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContFctrUnit_cont_fctr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doContFctrUnit_cont_fctr_unit_nm_VC(MCEventInfo info){
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
		if (nc == ContFctrUnitTable) doContFctrUnit_NC(info);
		else if (nc == columnContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NC(info);
		else if (nc == columnContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NC(info);
	}

	/**
	 * [ContFctrUnit]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_NC(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ContFctrUnitTable) doContFctrUnit_NE(info);
		else if (ne == columnContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NE(info);
		else if (ne == columnContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NE(info);
	}

	/**
	 * [ContFctrUnit]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_NE(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ContFctrUnitTable) doContFctrUnit_NX(info);
		else if (nx == columnContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_NX(info);
		else if (nx == columnContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_NX(info);
	}

	/**
	 * [ContFctrUnit]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_NX(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnContFctrUnit_cont_fctr_unit_cd) doContFctrUnit_cont_fctr_unit_cd_LC(info);
		else if (lc == columnContFctrUnit_cont_fctr_unit_nm) doContFctrUnit_cont_fctr_unit_nm_LC(info);
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ContFctrUnit]パネルの[cont_fctr_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doContFctrUnit_cont_fctr_unit_nm_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}